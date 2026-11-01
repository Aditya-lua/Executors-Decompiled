
undefined8 FUN_006df4e8(void)

{
  undefined8 uVar1;
  long lVar2;
  ulong uVar3;
  long lVar4;
  ulong uVar5;
  long lVar6;
  long lVar7;
  long unaff_x19;
  long unaff_x20;
  long *plVar8;
  ulong unaff_x22;
  
  uVar1 = func_0x006deab4();
  if ((int)uVar1 != 0xf) {
    plVar8 = *(long **)(unaff_x20 + 0x10);
    lVar2 = plVar8[1];
    if ((ulong)(lVar2 * 3) >> 2 <= (ulong)plVar8[2]) {
      if ((plVar8[2] != 0) && (plVar8[3] != unaff_x19)) {
        uVar3 = 0;
        uVar5 = unaff_x22;
        do {
          uVar5 = uVar5 & lVar2 - 1U;
          lVar7 = *(long *)(*plVar8 + uVar5 * 0x10);
          if (lVar7 == unaff_x19) goto LAB_006df56c;
          uVar3 = uVar3 + 1;
          uVar5 = uVar3 + uVar5;
        } while (lVar7 != plVar8[3] && uVar3 <= lVar2 - 1U);
      }
      func_0x006d3810(plVar8);
      lVar2 = plVar8[1];
    }
LAB_006df56c:
    lVar7 = *plVar8;
    uVar3 = unaff_x22 & lVar2 - 1U;
    lVar6 = *(long *)(lVar7 + uVar3 * 0x10);
    if (lVar6 != plVar8[3]) {
      lVar4 = 1;
      do {
        if (lVar6 == unaff_x19) goto LAB_006df5c8;
        uVar3 = uVar3 + lVar4 & lVar2 - 1U;
        lVar6 = *(long *)(lVar7 + uVar3 * 0x10);
        lVar4 = lVar4 + 1;
      } while (lVar6 != plVar8[3]);
    }
    *(long *)(lVar7 + uVar3 * 0x10) = unaff_x19;
    plVar8[2] = plVar8[2] + 1;
LAB_006df5c8:
    *(int *)(lVar7 + uVar3 * 0x10 + 8) = (int)uVar1;
  }
  return uVar1;
}

