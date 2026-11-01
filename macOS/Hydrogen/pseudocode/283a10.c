
ulong FUN_00283a10(void)

{
  uint uVar1;
  ulong uVar2;
  uint uVar3;
  ulong unaff_x19;
  ulong unaff_x20;
  
  uVar2 = _memcmp();
  uVar3 = 1;
  if (unaff_x19 < unaff_x20) {
    uVar3 = 0xffffffff;
  }
  uVar1 = 0;
  if (unaff_x19 != unaff_x20) {
    uVar1 = uVar3;
  }
  if ((int)uVar2 == 0) {
    return (ulong)uVar1;
  }
  return uVar2;
}

