
undefined8 FUN_000b5b84(undefined8 param_1)

{
  ulong uVar1;
  undefined8 in_x9;
  ulong uVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  ulong uVar6;
  long lVar7;
  long unaff_x19;
  long unaff_x20;
  long *plVar8;
  long *unaff_x21;
  long unaff_x22;
  long unaff_x23;
  int unaff_w24;
  
  *(undefined8 *)(unaff_x19 + 8) = param_1;
  *(undefined8 *)(unaff_x19 + 0x10) = in_x9;
  uVar1 = *(long *)(unaff_x19 + 0x18) + *(long *)(unaff_x19 + 0x38) * unaff_x22;
  uVar2 = *(long *)(unaff_x19 + 0x20) + *(long *)(unaff_x19 + 0x40) * unaff_x22;
  *(ulong *)(unaff_x19 + 0x18) = (uVar1 >> 0x21 | uVar1 * 0x80000000) * unaff_x23;
  *(ulong *)(unaff_x19 + 0x20) = (uVar2 >> 0x21 | uVar2 * 0x80000000) * unaff_x23;
  plVar8 = (long *)(unaff_x20 + (ulong)(uint)(unaff_w24 - *(int *)(unaff_x19 + 0x48)));
  *(undefined4 *)(unaff_x19 + 0x48) = 0;
  if (plVar8 + 4 <= unaff_x21) {
    lVar5 = *(long *)(unaff_x19 + 8);
    lVar7 = *(long *)(unaff_x19 + 0x10);
    lVar4 = *(long *)(unaff_x19 + 0x18);
    lVar3 = *(long *)(unaff_x19 + 0x20);
    do {
      uVar2 = lVar5 + *plVar8 * unaff_x22;
      uVar6 = lVar7 + plVar8[1] * unaff_x22;
      uVar1 = lVar4 + plVar8[2] * unaff_x22;
      lVar5 = (uVar2 >> 0x21 | uVar2 * 0x80000000) * unaff_x23;
      lVar7 = (uVar6 >> 0x21 | uVar6 * 0x80000000) * unaff_x23;
      lVar4 = (uVar1 >> 0x21 | uVar1 * 0x80000000) * unaff_x23;
      uVar1 = lVar3 + plVar8[3] * unaff_x22;
      lVar3 = (uVar1 >> 0x21 | uVar1 * 0x80000000) * unaff_x23;
      plVar8 = plVar8 + 4;
    } while (plVar8 <= unaff_x21 + -4);
    *(long *)(unaff_x19 + 8) = lVar5;
    *(long *)(unaff_x19 + 0x10) = lVar7;
    *(long *)(unaff_x19 + 0x18) = lVar4;
    *(long *)(unaff_x19 + 0x20) = lVar3;
  }
  if (plVar8 < unaff_x21) {
    _memcpy(unaff_x19 + 0x28,plVar8,(long)unaff_x21 - (long)plVar8);
    *(int *)(unaff_x19 + 0x48) = (int)((long)unaff_x21 - (long)plVar8);
    return 0;
  }
  return 0;
}

