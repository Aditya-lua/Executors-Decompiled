
void FUN_004b849c(undefined8 *param_1,long param_2)

{
  bool in_CY;
  undefined8 uVar1;
  undefined8 uVar2;
  long unaff_x20;
  long *unaff_x21;
  long unaff_x22;
  uint unaff_w23;
  long lVar3;
  uint unaff_w25;
  
  uVar2 = *param_1;
  lVar3 = *(long *)(param_2 + 0x10);
  if (!in_CY) {
    do {
      uVar1 = func_0x00486da8(uVar2,unaff_x20);
      unaff_x20 = unaff_x20 + -1;
      *(undefined8 *)(lVar3 + unaff_x22 * 8) = uVar1;
      unaff_x22 = unaff_x22 + 1;
    } while (unaff_w25 < ((uint)unaff_x20 & 0xff));
  }
  uVar2 = func_0x00486da8(uVar2,unaff_w23 >> 8 & 0xff);
  *(undefined8 *)(lVar3 + unaff_x22 * 8) = uVar2;
  *unaff_x21 = unaff_x22 + 1;
  return;
}

