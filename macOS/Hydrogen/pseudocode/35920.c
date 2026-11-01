
void FUN_00035920(long param_1)

{
  long lVar1;
  undefined8 *puVar2;
  long lVar3;
  long unaff_x19;
  long unaff_x20;
  long lVar4;
  undefined8 unaff_x23;
  long unaff_x24;
  
  param_1 = param_1 >> 3;
  lVar1 = param_1 + 2;
  if (-2 < param_1) {
    lVar1 = param_1 + 1;
  }
  lVar4 = unaff_x20 + (lVar1 >> 1) * -8;
  lVar3 = unaff_x24 - unaff_x20;
  if (lVar3 != 0) {
    _memmove(lVar4);
    unaff_x20 = *(long *)(unaff_x19 + 8);
  }
  puVar2 = (undefined8 *)(lVar4 + lVar3);
  *(long *)(unaff_x19 + 8) = unaff_x20 + (lVar1 >> 1) * -8;
  *(undefined8 **)(unaff_x19 + 0x10) = puVar2;
  *puVar2 = unaff_x23;
  *(long *)(unaff_x19 + 0x10) = *(long *)(unaff_x19 + 0x10) + 8;
  return;
}

