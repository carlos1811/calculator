from fastapi import APIRouter

from app.schemas.auth import AuthResponse, LoginRequest, RegisterRequest

router = APIRouter()


@router.post("/register", response_model=AuthResponse)
def register(payload: RegisterRequest) -> AuthResponse:
    # Placeholder logic for MVP skeleton
    _ = payload
    return AuthResponse(access_token="demo-register-token")


@router.post("/login", response_model=AuthResponse)
def login(payload: LoginRequest) -> AuthResponse:
    # Placeholder logic for MVP skeleton
    _ = payload
    return AuthResponse(access_token="demo-login-token")
