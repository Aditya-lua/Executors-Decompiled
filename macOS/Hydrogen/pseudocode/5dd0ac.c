
undefined8 FUN_005dd0ac(void)

{
  char *pcVar1;
  code *pcVar2;
  long lVar3;
  ulong uVar4;
  undefined8 extraout_x1;
  ulong extraout_x1_00;
  ulong extraout_x1_01;
  undefined8 extraout_x1_02;
  ulong extraout_x1_03;
  ulong extraout_x1_04;
  long unaff_x19;
  undefined8 uVar5;
  long *unaff_x20;
  long *plVar6;
  long unaff_x21;
  long lVar7;
  ulong uVar8;
  undefined8 *puVar9;
  long unaff_x23;
  long unaff_x24;
  char in_wzr;
  
  func_0x007ae680();
  uVar5 = extraout_x1_02;
  if (unaff_x23 != 0) {
    puVar9 = (undefined8 *)(unaff_x24 + 8);
    do {
      lVar3 = *(long *)*puVar9;
      *(long *)*puVar9 = lVar3 + 1;
      if (lVar3 < 0) goto code_r0x005dd098;
      func_0x005c5458();
      puVar9 = puVar9 + 2;
      unaff_x23 = unaff_x23 + -1;
      uVar5 = extraout_x1;
    } while (unaff_x23 != 0);
  }
  pcVar1 = (char *)(*(long *)(unaff_x21 + 0x38) + 8);
  if (*pcVar1 == '\0') {
    *pcVar1 = '\x01';
  }
  else {
    func_0x007aff64(pcVar1,uVar5,1000000000);
  }
  func_0x005d6b94();
  if (*pcVar1 == '\x01') {
    *pcVar1 = in_wzr;
  }
  else {
    func_0x007b05dc(pcVar1,0);
  }
  plVar6 = *(long **)(unaff_x19 + 8);
  uVar4 = func_0x005ccc50(plVar6);
  if ((uVar4 & 1) == 0) {
    if (*plVar6 == 10) {
      lVar7 = *unaff_x20;
      lVar3 = plVar6[2];
      uVar8 = plVar6[3];
      uVar4 = uVar8;
      if (*(long *)(lVar7 + 0x18) != 0) {
        uVar4 = uVar8 + 1 >> 1;
      }
      if (*(ulong *)(lVar7 + 0x10) < uVar4) {
        func_0x007ae680(lVar7,uVar4,lVar7 + 0x20,1);
        uVar4 = extraout_x1_03;
      }
      if (uVar8 != 0) {
        puVar9 = (undefined8 *)(lVar3 + 8);
        do {
          lVar3 = *(long *)*puVar9;
          *(long *)*puVar9 = lVar3 + 1;
          if (lVar3 < 0) goto code_r0x005dd098;
          func_0x005c5458(lVar7);
          puVar9 = puVar9 + 2;
          uVar8 = uVar8 - 1;
          uVar4 = extraout_x1_00;
        } while (uVar8 != 0);
      }
      lVar3 = plVar6[4];
      pcVar1 = (char *)(lVar3 + 8);
      if (*pcVar1 == '\0') {
        *pcVar1 = '\x01';
      }
      else {
        func_0x007aff64(pcVar1,uVar4,1000000000);
      }
      func_0x005d6b94(lVar7,lVar3 + 0x28);
      if (*pcVar1 == '\x01') {
        *pcVar1 = in_wzr;
      }
      else {
        func_0x007b05dc(pcVar1,0);
      }
    }
    plVar6 = *(long **)(unaff_x19 + 0x10);
    uVar4 = func_0x005ccc50(plVar6);
    if ((uVar4 & 1) == 0) {
      if (*plVar6 == 10) {
        lVar7 = *unaff_x20;
        lVar3 = plVar6[2];
        uVar8 = plVar6[3];
        uVar4 = uVar8;
        if (*(long *)(lVar7 + 0x18) != 0) {
          uVar4 = uVar8 + 1 >> 1;
        }
        if (*(ulong *)(lVar7 + 0x10) < uVar4) {
          func_0x007ae680(lVar7,uVar4,lVar7 + 0x20,1);
          uVar4 = extraout_x1_04;
        }
        if (uVar8 != 0) {
          puVar9 = (undefined8 *)(lVar3 + 8);
          do {
            lVar3 = *(long *)*puVar9;
            *(long *)*puVar9 = lVar3 + 1;
            if (lVar3 < 0) {
code_r0x005dd098:
              func_0x007a05dc();
                    /* WARNING: Does not return */
              pcVar2 = (code *)SoftwareBreakpoint(1,0x5dd0a0);
              (*pcVar2)();
            }
            func_0x005c5458(lVar7);
            puVar9 = puVar9 + 2;
            uVar8 = uVar8 - 1;
            uVar4 = extraout_x1_01;
          } while (uVar8 != 0);
        }
        lVar3 = plVar6[4];
        pcVar1 = (char *)(lVar3 + 8);
        if (*pcVar1 == '\0') {
          *pcVar1 = '\x01';
        }
        else {
          func_0x007aff64(pcVar1,uVar4,1000000000);
        }
        func_0x005d6b94(lVar7,lVar3 + 0x28);
        if (*pcVar1 == '\x01') {
          *pcVar1 = in_wzr;
        }
        else {
          func_0x007b05dc(pcVar1,0);
        }
      }
      uVar5 = 0;
      goto code_r0x005dcfd0;
    }
  }
  uVar5 = 1;
code_r0x005dcfd0:
  func_0x00187bd4();
  return uVar5;
}

