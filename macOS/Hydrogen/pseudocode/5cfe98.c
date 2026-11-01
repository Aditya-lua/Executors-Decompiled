
undefined8 FUN_005cfe98(void)

{
  char *pcVar1;
  code *pcVar2;
  long lVar3;
  ulong uVar4;
  ulong extraout_x1;
  ulong extraout_x1_00;
  long unaff_x19;
  undefined8 uVar5;
  long lVar6;
  long *unaff_x20;
  long *plVar7;
  ulong uVar8;
  undefined8 *puVar9;
  char in_wzr;
  
  func_0x007b05dc();
  plVar7 = *(long **)(unaff_x19 + 8);
  uVar4 = func_0x005ccc50(plVar7);
  if ((uVar4 & 1) == 0) {
    if (*plVar7 == 10) {
      lVar6 = *unaff_x20;
      lVar3 = plVar7[2];
      uVar8 = plVar7[3];
      uVar4 = uVar8;
      if (*(long *)(lVar6 + 0x18) != 0) {
        uVar4 = uVar8 + 1 >> 1;
      }
      if (*(ulong *)(lVar6 + 0x10) < uVar4) {
        func_0x007ae680(lVar6,uVar4,lVar6 + 0x20,1);
        uVar4 = extraout_x1_00;
      }
      if (uVar8 != 0) {
        puVar9 = (undefined8 *)(lVar3 + 8);
        do {
          lVar3 = *(long *)*puVar9;
          *(long *)*puVar9 = lVar3 + 1;
          if (lVar3 < 0) {
            func_0x007a05dc();
                    /* WARNING: Does not return */
            pcVar2 = (code *)SoftwareBreakpoint(1,0x5cfe64);
            (*pcVar2)();
          }
          func_0x005c5458(lVar6);
          puVar9 = puVar9 + 2;
          uVar8 = uVar8 - 1;
          uVar4 = extraout_x1;
        } while (uVar8 != 0);
      }
      lVar3 = plVar7[4];
      pcVar1 = (char *)(lVar3 + 8);
      if (*pcVar1 == '\0') {
        *pcVar1 = '\x01';
      }
      else {
        func_0x007aff64(pcVar1,uVar4,1000000000);
      }
      func_0x005d6b94(lVar6,lVar3 + 0x28);
      if (*pcVar1 == '\x01') {
        *pcVar1 = in_wzr;
      }
      else {
        func_0x007b05dc(pcVar1,0);
      }
    }
    uVar5 = 0;
  }
  else {
    uVar5 = 1;
  }
  func_0x00187bd4();
  return uVar5;
}

