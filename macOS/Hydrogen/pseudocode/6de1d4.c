
undefined8 FUN_006de1d4(long param_1)

{
  bool in_CY;
  undefined8 *puVar1;
  long unaff_x19;
  ulong unaff_x20;
  undefined8 uVar2;
  
  if (!in_CY) {
    do {
      uVar2 = *(undefined8 *)(param_1 + -8);
      puVar1 = (undefined8 *)func_0x006db828(unaff_x19 + 0x58,param_1 + -0x10);
      *puVar1 = uVar2;
      param_1 = *(long *)(unaff_x19 + 0x88) + -0x10;
      *(long *)(unaff_x19 + 0x88) = param_1;
    } while (unaff_x20 < (ulong)(param_1 - *(long *)(unaff_x19 + 0x80) >> 4));
  }
  return 0;
}

