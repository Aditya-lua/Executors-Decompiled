
void FUN_001fda94(void)

{
  long lVar1;
  long *plVar2;
  ulong uVar3;
  long lVar4;
  ulong in_x3;
  undefined8 *puVar5;
  short *psVar6;
  long lVar7;
  long lVar8;
  long lVar9;
  undefined1 auVar10 [16];
  undefined7 uStack_77;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  
  lVar4 = 8;
  func_0x00187bd4();
  __Unwind_Resume();
  auVar10 = func_0x007a2668();
  plVar2 = auVar10._0_8_;
  lVar8 = *(long *)(lVar4 + 0x38);
  lVar1 = *(long *)(lVar4 + 0x40);
  lVar9 = lVar1 << 6;
  if (lVar1 != 0) {
    psVar6 = (short *)(lVar8 + 0x20);
    lVar7 = lVar9;
    do {
      if ((*(long *)(psVar6 + -0x10) == -0x7fffffffffffffe9) && (*psVar6 == 0x26))
      goto LAB_001fdb14;
      psVar6 = psVar6 + 0x20;
      lVar7 = lVar7 + -0x40;
    } while (lVar7 != 0);
  }
  if (*(long *)(lVar4 + 0x10) != 0) {
    psVar6 = *(short **)(lVar4 + 8);
    lVar4 = *(long *)(lVar4 + 0x10) << 2;
    do {
      if (*psVar6 == 3) goto LAB_001fdb14;
      psVar6 = psVar6 + 2;
      lVar4 = lVar4 + -4;
    } while (lVar4 != 0);
  }
LAB_001fdb9c:
  if (lVar1 != 0) {
    psVar6 = (short *)(lVar8 + 0x20);
    do {
      uVar3 = *(long *)(psVar6 + -0x10) + 0x7fffffffffffffff;
      if (0x16 < uVar3) {
        uVar3 = 0x13;
      }
      if ((0x10 < uVar3 - 5 && 3 < uVar3) && ((uVar3 != 0x16 || (*psVar6 == 0x17)))) {
        lVar8 = *(long *)(auVar10._8_8_ + 0x78);
        uVar3 = (**(code **)(lVar8 + 0x20))
                          (*(long *)(auVar10._8_8_ + 0x70) +
                           (*(long *)(lVar8 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10);
        if ((uVar3 & 1) != 0) {
          *(undefined1 *)(plVar2 + 3) = 1;
          lVar8 = plVar2[2];
          if (lVar8 == *plVar2) {
            func_0x001d9010(plVar2,&UNK_009c5d60);
          }
          puVar5 = (undefined8 *)(plVar2[1] + lVar8 * 0x28);
          puVar5[1] = uStack_70;
          *puVar5 = CONCAT71(uStack_77,2);
          puVar5[3] = uStack_60;
          puVar5[2] = uStack_68;
          puVar5[4] = uStack_58;
          plVar2[2] = lVar8 + 1;
        }
        break;
      }
      psVar6 = psVar6 + 0x20;
      lVar9 = lVar9 + -0x40;
    } while (lVar9 != 0);
  }
  if ((in_x3 & 1) != 0) {
    lVar8 = plVar2[2];
    if (lVar8 == *plVar2) {
      func_0x001d9010(plVar2,&UNK_009c5d78);
    }
    puVar5 = (undefined8 *)(plVar2[1] + lVar8 * 0x28);
    puVar5[1] = uStack_70;
    *puVar5 = CONCAT71(uStack_77,7);
    puVar5[3] = uStack_60;
    puVar5[2] = uStack_68;
    puVar5[4] = uStack_58;
    plVar2[2] = lVar8 + 1;
  }
  return;
LAB_001fdb14:
  uStack_70 = 0;
  uStack_68 = 1;
  uStack_60 = 0;
  lVar4 = plVar2[2];
  if (lVar4 == *plVar2) {
    func_0x001d9010(plVar2,&UNK_009c5d48);
  }
  puVar5 = (undefined8 *)(plVar2[1] + lVar4 * 0x28);
  puVar5[1] = 0;
  *puVar5 = CONCAT71(uStack_77,3);
  puVar5[3] = 0;
  puVar5[2] = 1;
  puVar5[4] = uStack_58;
  plVar2[2] = lVar4 + 1;
  goto LAB_001fdb9c;
}

