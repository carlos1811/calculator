# citasIA (MVP bootstrap)

This folder contains the initial architecture and base project structure for the citasIA prototype.

## Structure

- `docs/architecture.md` -> architecture and phased plan.
- `backend/` -> FastAPI skeleton (auth, AI chat, matches).
- `frontend/` -> simple static prototype UI.

## Run backend (local)

```bash
cd backend
python -m venv .venv
source .venv/bin/activate
pip install -r requirements.txt
uvicorn app.main:app --reload
```

## Next implementation step

Implement real persistence with PostgreSQL + SQLAlchemy and replace placeholder routes with service logic.
