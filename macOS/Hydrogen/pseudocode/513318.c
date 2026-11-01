
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00513318(void)

{
  long *plVar1;
  code *pcVar2;
  long lVar3;
  long *plVar4;
  undefined8 uVar5;
  undefined8 *puVar6;
  undefined8 unaff_x19;
  long lVar7;
  undefined8 *unaff_x20;
  long lVar8;
  long unaff_x21;
  long lVar9;
  long *plVar10;
  long *plVar11;
  undefined1 auVar12 [16];
  
  lVar3 = func_0x00187bd0();
  if (lVar3 != 0) {
    _memcpy(lVar3);
    *unaff_x20 = unaff_x19;
    unaff_x20[1] = lVar3;
    unaff_x20[2] = unaff_x19;
    return;
  }
  puVar6 = (undefined8 *)&UNK_009e8da8;
  auVar12 = func_0x007a1f00();
  plVar4 = auVar12._0_8_;
  plVar1 = (long *)*puVar6;
  lVar3 = puVar6[1];
  if (plVar4 == auVar12._8_8_) {
code_r0x00513484:
    *plVar1 = lVar3;
    return;
  }
  lVar8 = *plVar4;
  lVar7 = plVar4[1];
  if (lVar7 < 0) {
    uVar5 = 0;
  }
  else {
    lVar9 = 0;
    plVar10 = plVar4 + 3;
    plVar11 = (long *)(puVar6[2] + lVar3 * 0x18 + 8);
    do {
      if (lVar7 == 0) {
        unaff_x21 = 1;
      }
      else {
        unaff_x21 = func_0x00187bd0(lVar7,1);
        if (unaff_x21 == 0) {
          uVar5 = 1;
          unaff_x21 = lVar7;
          goto LAB_005134b4;
        }
      }
      _memcpy(unaff_x21,lVar8,lVar7);
      plVar11[-1] = lVar7;
      *plVar11 = unaff_x21;
      plVar11[1] = lVar7;
      if (((ulong)((long)auVar12._8_8_ - (long)plVar4) >> 4) - 1 == lVar9) {
        lVar3 = lVar3 + lVar9 + 1;
        goto code_r0x00513484;
      }
      lVar8 = plVar10[-1];
      lVar7 = *plVar10;
      plVar10 = plVar10 + 2;
      plVar11 = plVar11 + 3;
      lVar9 = lVar9 + 1;
    } while (-1 < lVar7);
    uVar5 = 0;
  }
LAB_005134b4:
  func_0x007a1f00(uVar5,unaff_x21,&UNK_009e9838);
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x5134c8);
  (*pcVar2)();
}

