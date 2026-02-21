from pydantic import BaseModel


class MatchItem(BaseModel):
    user_id: int
    username: str
    compatibility_score: int
