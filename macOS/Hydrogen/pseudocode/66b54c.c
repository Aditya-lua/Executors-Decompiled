
void FUN_0066b54c(long param_1,long param_2,undefined8 param_3)

{
  long lVar1;
  ulong uVar2;
  long in_x9;
  ulong unaff_x19;
  long unaff_x20;
  long unaff_x21;
  ulong uVar3;
  
  lVar1 = 0;
  if ((ulong)((param_1 + in_x9) - *(long *)(param_2 + 0x38)) <= *(ulong *)(param_2 + 0x30)) {
    lVar1 = in_x9;
  }
  lVar1 = *(long *)(param_2 + 0x38) + (*(ulong *)(param_2 + 0x30) - lVar1);
  uVar3 = (param_1 + in_x9) - lVar1;
  uVar2 = uVar3;
  if (unaff_x19 <= uVar3) {
    uVar2 = unaff_x19;
  }
  _memcpy(lVar1,param_3,uVar2);
  if (uVar3 <= unaff_x19 && unaff_x19 - uVar3 != 0) {
    _memcpy(*(undefined8 *)(unaff_x20 + 0x18),unaff_x21 + uVar3,unaff_x19 - uVar3);
  }
  *(ulong *)(unaff_x20 + 0x30) = *(long *)(unaff_x20 + 0x30) + unaff_x19;
  return;
}

