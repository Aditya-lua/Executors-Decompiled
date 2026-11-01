
undefined8 FUN_006dd710(long param_1)

{
  ulong in_x9;
  ulong uVar1;
  ulong in_x10;
  long lVar2;
  long lVar3;
  long unaff_x19;
  long unaff_x20;
  undefined4 unaff_w21;
  
  uVar1 = in_x9 & in_x10;
  lVar3 = *(long *)(param_1 + uVar1 * 0x10);
  if (lVar3 != *(long *)(unaff_x20 + 0x18)) {
    lVar2 = 1;
    do {
      if (lVar3 == unaff_x19) goto LAB_006dd764;
      uVar1 = uVar1 + lVar2 & in_x10;
      lVar3 = *(long *)(param_1 + uVar1 * 0x10);
      lVar2 = lVar2 + 1;
    } while (lVar3 != *(long *)(unaff_x20 + 0x18));
  }
  *(long *)(param_1 + uVar1 * 0x10) = unaff_x19;
  *(long *)(unaff_x20 + 0x10) = *(long *)(unaff_x20 + 0x10) + 1;
LAB_006dd764:
  *(undefined4 *)(param_1 + uVar1 * 0x10 + 8) = unaff_w21;
  return 0;
}

