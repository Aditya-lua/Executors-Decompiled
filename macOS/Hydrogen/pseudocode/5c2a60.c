
undefined8 FUN_005c2a60(void)

{
  char *pcVar1;
  code *pcVar2;
  long lVar3;
  ulong uVar4;
  ulong extraout_x1;
  ulong extraout_x1_00;
  ulong extraout_x1_01;
  ulong extraout_x1_02;
  long unaff_x19;
  long *unaff_x20;
  undefined8 uVar5;
  long *unaff_x21;
  ulong *puVar6;
  long lVar7;
  ulong uVar8;
  ulong uVar9;
  undefined8 *puVar10;
  char in_wzr;
  
  uVar4 = func_0x005c2954(unaff_x21 + 1);
  if ((uVar4 & 1) == 0) {
    if (*unaff_x21 == 10) {
      lVar7 = *unaff_x20;
      lVar3 = unaff_x21[2];
      uVar9 = unaff_x21[3];
      uVar4 = uVar9;
      if (*(long *)(lVar7 + 0x18) != 0) {
        uVar4 = uVar9 + 1 >> 1;
      }
      if (*(ulong *)(lVar7 + 0x10) < uVar4) {
        func_0x007ae680(lVar7,uVar4,lVar7 + 0x20,1);
        uVar4 = extraout_x1_01;
      }
      if (uVar9 != 0) {
        puVar10 = (undefined8 *)(lVar3 + 8);
        do {
          lVar3 = *(long *)*puVar10;
          *(long *)*puVar10 = lVar3 + 1;
          if (lVar3 < 0) goto LAB_005c2cc4;
          func_0x005c5458(lVar7);
          puVar10 = puVar10 + 2;
          uVar9 = uVar9 - 1;
          uVar4 = extraout_x1;
        } while (uVar9 != 0);
      }
      lVar3 = unaff_x21[4];
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
    puVar6 = *(ulong **)(unaff_x19 + 8);
    uVar4 = *puVar6;
    if ((long)uVar4 < 6) {
      if ((long)uVar4 < 3) {
        if (1 < uVar4) {
          lVar3 = 8;
LAB_005c2bb8:
          uVar4 = func_0x005cf964((long)puVar6 + lVar3);
          goto LAB_005c2bf4;
        }
      }
      else {
        if (uVar4 == 3) {
LAB_005c2bcc:
          uVar4 = func_0x005d04d8(puVar6 + 1);
        }
        else {
          if (uVar4 == 4) goto LAB_005c2c04;
          uVar4 = func_0x005cc688(puVar6 + 1);
        }
LAB_005c2bf4:
        if ((uVar4 & 1) != 0) goto LAB_005c2bf8;
        uVar4 = *puVar6;
      }
LAB_005c2c04:
      if (uVar4 == 10) {
        lVar3 = *unaff_x20;
        uVar9 = puVar6[2];
        uVar8 = puVar6[3];
        uVar4 = uVar8;
        if (*(long *)(lVar3 + 0x18) != 0) {
          uVar4 = uVar8 + 1 >> 1;
        }
        if (*(ulong *)(lVar3 + 0x10) < uVar4) {
          func_0x007ae680(lVar3,uVar4,lVar3 + 0x20,1);
          uVar4 = extraout_x1_02;
        }
        if (uVar8 != 0) {
          puVar10 = (undefined8 *)(uVar9 + 8);
          do {
            lVar7 = *(long *)*puVar10;
            *(long *)*puVar10 = lVar7 + 1;
            if (lVar7 < 0) {
LAB_005c2cc4:
              func_0x007a05dc();
                    /* WARNING: Does not return */
              pcVar2 = (code *)SoftwareBreakpoint(1,0x5c2ccc);
              (*pcVar2)();
            }
            func_0x005c5458(lVar3);
            puVar10 = puVar10 + 2;
            uVar8 = uVar8 - 1;
            uVar4 = extraout_x1_00;
          } while (uVar8 != 0);
        }
        uVar9 = puVar6[4];
        pcVar1 = (char *)(uVar9 + 8);
        if (*pcVar1 == '\0') {
          *pcVar1 = '\x01';
        }
        else {
          func_0x007aff64(pcVar1,uVar4,1000000000);
        }
        func_0x005d6b94(lVar3,uVar9 + 0x28);
        if (*pcVar1 == '\x01') {
          *pcVar1 = in_wzr;
        }
        else {
          func_0x007b05dc(pcVar1,0);
        }
      }
    }
    else {
      if ((long)uVar4 < 9) {
        if (uVar4 == 6) goto LAB_005c2c04;
        if (uVar4 == 7) {
          uVar4 = func_0x005cfc8c(puVar6 + 1);
        }
        else {
          uVar4 = func_0x005cc218(puVar6 + 1);
        }
        goto LAB_005c2bf4;
      }
      if (uVar4 == 9) {
        uVar4 = func_0x005c2954(puVar6 + 1);
        goto LAB_005c2bf4;
      }
      if (uVar4 == 10) goto LAB_005c2c04;
      uVar4 = puVar6[1] ^ 0x8000000000000000;
      if (1 < uVar4) {
        uVar4 = 2;
      }
      if (uVar4 != 0) {
        if (uVar4 != 1) goto LAB_005c2bcc;
        lVar3 = 0x10;
        goto LAB_005c2bb8;
      }
    }
    uVar5 = 0;
  }
  else {
LAB_005c2bf8:
    uVar5 = 1;
  }
  func_0x00187bd4();
  return uVar5;
}

