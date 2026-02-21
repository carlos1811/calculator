from fastapi import APIRouter

from app.schemas.match import MatchItem

router = APIRouter()


@router.get("", response_model=list[MatchItem])
def list_matches() -> list[MatchItem]:
    # Placeholder list to validate end-to-end flow in MVP skeleton.
    return [
        MatchItem(user_id=2, username="alex", compatibility_score=91),
        MatchItem(user_id=3, username="sam", compatibility_score=84),
    ]
