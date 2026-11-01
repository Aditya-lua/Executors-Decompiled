
void FUN_00719108(long param_1)

{
  long *plVar1;
  ulong in_x9;
  ulong uVar2;
  ulong in_x10;
  long in_x11;
  long lVar3;
  long lVar4;
  long unaff_x19;
  undefined8 unaff_x20;
  long unaff_x27;
  long unaff_x29;
  
  uVar2 = in_x10 & in_x9;
  lVar4 = *(long *)(param_1 + uVar2 * 0x10);
  if (lVar4 != in_x11) {
    lVar3 = 1;
    do {
      if (lVar4 == unaff_x27) goto LAB_00719158;
      uVar2 = uVar2 + lVar3 & in_x10;
      lVar4 = *(long *)(param_1 + uVar2 * 0x10);
      lVar3 = lVar3 + 1;
    } while (lVar4 != in_x11);
  }
  *(long *)(param_1 + uVar2 * 0x10) = unaff_x27;
  *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
LAB_00719158:
  *(undefined8 *)(param_1 + uVar2 * 0x10 + 8) = unaff_x20;
  plVar1 = *(long **)(unaff_x29 + -0xb8);
  lVar4 = *plVar1 + *(long *)(unaff_x29 + -0xb0) * 0x28;
  if (lVar4 != plVar1[1]) {
    plVar1[1] = lVar4;
  }
  return;
}

