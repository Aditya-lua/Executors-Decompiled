
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00093ddc(long param_1,undefined1 param_2 [16])

{
  long unaff_x19;
  undefined8 uVar1;
  undefined8 uVar2;
  
  uVar2 = *(undefined8 *)(param_1 + 0xb28);
  uVar1 = *(undefined8 *)(param_1 + 0xb20);
  *(long *)(unaff_x19 + 0x2d8) = param_2._8_8_;
  *(long *)(unaff_x19 + 0x2d0) = param_2._0_8_;
  *(undefined8 *)(unaff_x19 + 0x2e8) = uVar2;
  *(undefined8 *)(unaff_x19 + 0x2e0) = uVar1;
  uVar1 = _UNK_0080bb30;
  *(undefined8 *)(unaff_x19 + 0x2f8) = _UNK_0080bb38;
  *(undefined8 *)(unaff_x19 + 0x2f0) = uVar1;
  return;
}

