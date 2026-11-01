
bool FUN_005140ec(long param_1,long *param_2)

{
  long lVar1;
  long lVar2;
  bool bVar3;
  long lVar4;
  long *plVar5;
  long *plVar6;
  long lVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  long lVar10;
  long *plVar11;
  long lVar12;
  long lVar13;
  undefined1 auVar14 [16];
  
  lVar1 = *(long *)(param_1 + 0x10);
  lVar2 = *(long *)(param_1 + 0x18);
  lVar10 = *(long *)(lVar1 + 0x10);
  if (lVar10 == lVar2) {
    bVar3 = true;
  }
  else if (param_2[1] == *param_2) {
    bVar3 = false;
  }
  else {
    lVar12 = *(long *)(lVar1 + 8);
    *param_2 = 1;
    lVar7 = *(long *)(param_2[2] + 0x10);
    if (lVar7 < 0) {
      uVar9 = 0;
LAB_005141d4:
      auVar14 = func_0x007a1f00(uVar9,lVar7,&UNK_009e8da8);
      lVar10 = auVar14._8_8_;
      lVar1 = *(long *)(auVar14._0_8_ + 0x10);
      lVar2 = *(long *)(auVar14._0_8_ + 0x18);
      if (*(long *)(lVar1 + 0x10) != lVar2) {
        lVar7 = *(long *)(lVar1 + 8);
        plVar11 = (long *)(lVar7 + *(long *)(lVar1 + 0x10) * 0x18);
        plVar5 = *(long **)(lVar10 + 0x18);
        plVar6 = *(long **)(lVar10 + 8);
        do {
          if (plVar6 == plVar5) {
            return false;
          }
          lVar12 = *plVar6;
          *(long **)(lVar10 + 8) = plVar6 + 3;
          if (lVar12 == -0x8000000000000000) {
            return false;
          }
          lVar13 = plVar6[2];
          lVar4 = plVar6[1];
          *plVar11 = lVar12;
          plVar11[2] = lVar13;
          plVar11[1] = lVar4;
          *(long *)(lVar1 + 0x10) = *(long *)(lVar1 + 0x10) + 1;
          plVar11 = plVar11 + 3;
          plVar6 = plVar6 + 3;
        } while (plVar11 != (long *)(lVar7 + lVar2 * 0x18));
      }
      return true;
    }
    uVar8 = *(undefined8 *)(param_2[2] + 8);
    if (lVar7 == 0) {
      lVar4 = 1;
    }
    else {
      uVar9 = 1;
      lVar4 = func_0x00187bd0(lVar7,1);
      if (lVar4 == 0) goto LAB_005141d4;
    }
    plVar11 = (long *)(lVar12 + lVar10 * 0x18);
    _memcpy(lVar4,uVar8,lVar7);
    *plVar11 = lVar7;
    plVar11[1] = lVar4;
    plVar11[2] = lVar7;
    *(long *)(lVar1 + 0x10) = *(long *)(lVar1 + 0x10) + 1;
    bVar3 = plVar11 + 3 == (long *)(lVar12 + lVar2 * 0x18);
  }
  return bVar3;
}

