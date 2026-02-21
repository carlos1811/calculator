# citasIA - Architecture (MVP)

## 1. Goal
Build an MVP web app where users can:
1. Register and log in.
2. Chat with an AI assistant to infer a psychological profile.
3. Receive compatibility matches and open a user-to-user chat.

## 2. Proposed stack
- **Backend:** Python + FastAPI
- **Database:** PostgreSQL
- **Auth:** JWT (access token)
- **Frontend (MVP):** lightweight HTML/JS (can evolve to React later)

## 3. High-level architecture
- **Frontend**
  - Login/register screen
  - AI chat screen
  - Matches screen
  - Match chat screen
- **API (FastAPI)**
  - `auth` module
  - `profile` module (AI conversation + profile extraction)
  - `match` module (compatibility scoring)
  - `chat` module (user-to-user messages)
- **Storage (PostgreSQL)**
  - users, profiles, matches, chats, messages

## 4. Core domain entities (MVP)
### User
- id
- email
- username
- password_hash
- role (USER/ADMIN)
- created_at

### PsychologicalProfile
- id
- user_id
- summary_text
- writing_style_vector (JSON)
- thinking_style_vector (JSON)
- updated_at

### Match
- id
- user_a_id
- user_b_id
- compatibility_score (0-100)
- status (PENDING/ACCEPTED/REJECTED)
- created_at

### ChatRoom
- id
- match_id
- created_at

### Message
- id
- chat_room_id
- sender_user_id
- content
- created_at

## 5. Main flows
### 5.1 Registration/Login
1. User creates account.
2. Backend stores hashed password.
3. User logs in and gets JWT.

### 5.2 AI psychological profiling
1. Authenticated user sends messages to AI chat endpoint.
2. Service stores conversation excerpts.
3. Profile service updates psychological profile vectors/summary.

### 5.3 Matching
1. Match service compares profile vectors among users.
2. System stores top compatible candidates.
3. User sees list of recommended matches.

### 5.4 Match chat
1. If match is accepted, a `ChatRoom` is created.
2. Users exchange messages.

## 6. Security and validation
- Password hashing with bcrypt.
- JWT validation in protected endpoints.
- Input validation with Pydantic.
- Basic rate limiting for auth/chat endpoints (next iteration).

## 7. Suggested phased plan
1. **Phase 1:** Auth + User model + JWT + PostgreSQL connection.
2. **Phase 2:** AI chat endpoint + profile persistence.
3. **Phase 3:** Match scoring and match listing endpoint.
4. **Phase 4:** Match chat (rooms/messages) + basic UI.

## 8. MVP acceptance criteria
- User can register and log in.
- Logged user can send messages to AI endpoint.
- Profile gets updated from chat.
- User gets at least one computed match.
- User can open a match chat room.
