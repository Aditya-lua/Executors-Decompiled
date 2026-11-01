
void FUN_0071262c(long param_1)

{
  ulong in_x9;
  ulong uVar1;
  ulong in_x10;
  long in_x11;
  long lVar2;
  long lVar3;
  long unaff_x19;
  long unaff_x20;
  undefined8 unaff_x21;
  
  uVar1 = in_x9 & in_x10;
  lVar3 = *(long *)(param_1 + uVar1 * 0x10);
  if (lVar3 != in_x11) {
    lVar2 = 1;
    do {
      if (lVar3 == unaff_x20) goto LAB_00712794;
      uVar1 = uVar1 + lVar2 & in_x10;
      lVar3 = *(long *)(param_1 + uVar1 * 0x10);
      lVar2 = lVar2 + 1;
    } while (lVar3 != in_x11);
  }
  *(long *)(param_1 + uVar1 * 0x10) = unaff_x20;
  *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
LAB_00712794:
  *(undefined8 *)(param_1 + uVar1 * 0x10 + 8) = unaff_x21;
  return;
}

