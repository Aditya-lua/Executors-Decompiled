
ulong FUN_006cfbd4(long param_1)

{
  ulong uVar1;
  long unaff_x20;
  ulong uVar2;
  
  if (param_1 == 0) {
    return 0;
  }
  uVar2 = 0;
  do {
    uVar1 = func_0x006cfaa8();
    if ((uVar1 & 1) != 0) {
      return uVar1;
    }
    uVar2 = uVar2 + 1;
  } while (uVar2 < *(ulong *)(unaff_x20 + 0x28));
  return uVar1;
}

