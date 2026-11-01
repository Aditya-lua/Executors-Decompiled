
long FUN_00070bf8(long param_1)

{
  ulong uVar1;
  int iVar2;
  ulong in_x9;
  long unaff_x19;
  
  uVar1 = param_1 + 0x41f;
  if (in_x9 != uVar1) {
    if (-1 < (long)(in_x9 & uVar1)) {
      return 0;
    }
    iVar2 = _strcmp(in_x9 & 0x7fffffffffffffff,uVar1 & 0x7fffffffffffffff);
    if (iVar2 != 0) {
      return 0;
    }
  }
  return unaff_x19 + 8;
}

