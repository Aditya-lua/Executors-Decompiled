
ulong FUN_006da594(long param_1)

{
  ulong uVar1;
  
  uVar1 = param_1 + 2U & 0x8080808080808080;
  return uVar1 - (uVar1 >> 7) | param_1 + 2U & 0x7f7f7f7f7f7f7f7f;
}

