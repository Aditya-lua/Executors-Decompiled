
void FUN_00703ffc(undefined8 param_1,long param_2)

{
  undefined8 *puVar1;
  char in_NG;
  bool in_ZR;
  char in_OV;
  long lVar2;
  long unaff_x19;
  long unaff_x20;
  long unaff_x23;
  undefined8 uVar3;
  
  if (in_ZR || in_NG != in_OV) {
    func_0x006ee1d4();
    param_2 = *(long *)(unaff_x19 + 8);
  }
  *(long *)(unaff_x19 + 8) = param_2 + 0x30;
  func_0x006ee550();
  lVar2 = *(long *)(unaff_x19 + 8);
  *(long *)(unaff_x19 + 8) = lVar2 + -0x10;
  uVar3 = *(undefined8 *)(lVar2 + -0x10);
  puVar1 = (undefined8 *)(*(long *)(unaff_x19 + 0x30) + (unaff_x20 - unaff_x23));
  puVar1[1] = *(undefined8 *)(lVar2 + -8);
  *puVar1 = uVar3;
  return;
}

