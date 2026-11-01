
void FUN_005e3404(long param_1)

{
  long lVar1;
  long lVar2;
  undefined4 *puVar3;
  long in_x9;
  ulong unaff_x19;
  ulong unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long lVar4;
  long lStack0000000000000008;
  
  lStack0000000000000008 = param_1;
  func_0x007afea0();
  lVar2 = lStack0000000000000008;
  lVar1 = *(long *)(lStack0000000000000008 + 8);
  lVar4 = *(long *)(lStack0000000000000008 + 0x10);
  puVar3 = (undefined4 *)(lVar1 + lVar4 * 4);
  if (1 < unaff_x19) {
    _bzero(puVar3,(in_x9 + ~unaff_x20) * 4);
    puVar3 = (undefined4 *)(lVar1 + unaff_x20 * -4 + (lVar4 + unaff_x21 + unaff_x22) * 4 + -4);
    lVar4 = unaff_x19 + lVar4 + -1;
  }
  *puVar3 = 0;
  *(long *)(lVar2 + 0x10) = lVar4 + 1;
  return;
}

