from fastapi import APIRouter

from app.schemas.chat import AiChatRequest, AiChatResponse

router = APIRouter()


@router.post("/ai", response_model=AiChatResponse)
def chat_with_ai(payload: AiChatRequest) -> AiChatResponse:
    # Placeholder response. In next step this connects to profile analysis service.
    return AiChatResponse(reply=f"AI received: {payload.message}")
