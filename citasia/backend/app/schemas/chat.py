from pydantic import BaseModel


class AiChatRequest(BaseModel):
    message: str


class AiChatResponse(BaseModel):
    reply: str
    profile_updated: bool = True
