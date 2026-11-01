
long FUN_0051fe74(long *param_1,undefined8 *param_2)

{
  undefined8 uVar1;
  long lVar2;
  int iVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  long lVar7;
  long *plVar8;
  long lVar9;
  long lVar10;
  long *plVar11;
  
  lVar7 = *param_1;
  lVar2 = param_1[1];
  if (lVar7 == lVar2) {
    lVar4 = 0;
  }
  else {
    plVar8 = (long *)*param_2;
    lVar4 = *(long *)(*plVar8 + 0x10);
    if (lVar4 == 0) {
      lVar5 = plVar8[2];
      if (lVar5 == 0) {
        lVar9 = lVar7 + 0x20;
        lVar4 = lVar7 + 0x10;
      }
      else {
        lVar6 = plVar8[1];
        do {
          lVar9 = lVar7 + 0x20;
          uVar1 = *(undefined8 *)(lVar7 + 0x10);
          lVar4 = *(long *)(lVar7 + 0x18);
          lVar10 = lVar5 << 4;
          plVar8 = (long *)(lVar6 + 8);
          while ((*plVar8 != lVar4 || (iVar3 = _memcmp(plVar8[-1],uVar1,lVar4), iVar3 != 0))) {
            plVar8 = plVar8 + 2;
            lVar10 = lVar10 + -0x10;
            if (lVar10 == 0) {
              lVar4 = lVar7 + 0x10;
              goto LAB_0051fff4;
            }
          }
          lVar4 = 0;
          lVar7 = lVar9;
        } while (lVar9 != lVar2);
      }
    }
    else {
      lVar5 = *(long *)(*plVar8 + 8);
      do {
        lVar9 = lVar7 + 0x20;
        uVar1 = *(undefined8 *)(lVar7 + 0x10);
        lVar6 = *(long *)(lVar7 + 0x18);
        lVar10 = lVar4 << 4;
        plVar11 = (long *)(lVar5 + 8);
        do {
          if ((*plVar11 == lVar6) && (iVar3 = _memcmp(plVar11[-1],uVar1,lVar6), iVar3 == 0))
          goto LAB_0051ff44;
          plVar11 = plVar11 + 2;
          lVar10 = lVar10 + -0x10;
        } while (lVar10 != 0);
        if (plVar8[2] == 0) {
          lVar4 = lVar7 + 0x10;
          goto LAB_0051fff4;
        }
        plVar11 = (long *)(plVar8[1] + 8);
        lVar10 = plVar8[2] << 4;
        while ((*plVar11 != lVar6 || (iVar3 = _memcmp(plVar11[-1],uVar1,lVar6), iVar3 != 0))) {
          plVar11 = plVar11 + 2;
          lVar10 = lVar10 + -0x10;
          if (lVar10 == 0) {
            lVar4 = lVar7 + 0x10;
            goto LAB_0051fff4;
          }
        }
LAB_0051ff44:
        lVar7 = lVar9;
      } while (lVar9 != lVar2);
      lVar4 = 0;
    }
LAB_0051fff4:
    *param_1 = lVar9;
  }
  return lVar4;
}

