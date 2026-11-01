
/* WARNING: Possible PIC construction at 0x0024f4a0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0024f59c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0024f608: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0024f694: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0024f9c0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0024fa1c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0024f778: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0024f814: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0024f83c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0024f8a8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0024f934: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0024fabc: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0024f53c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0024fac0) */
/* WARNING: Removing unreachable block (ram,0x0024f77c) */
/* WARNING: Removing unreachable block (ram,0x0024fa20) */
/* WARNING: Removing unreachable block (ram,0x0024f540) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0024f3ac(void)

{
  ulong uVar1;
  code *pcVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  ulong uVar5;
  undefined8 uVar6;
  undefined8 *extraout_x8;
  long lVar7;
  ulong uVar8;
  long lVar9;
  long lVar10;
  undefined8 uVar11;
  ulong uVar12;
  undefined8 *puVar13;
  ulong uVar14;
  long lVar15;
  long unaff_x29;
  undefined8 uStack_180;
  undefined8 uStack_178;
  undefined8 uStack_170;
  undefined8 uStack_168;
  undefined8 uStack_160;
  undefined8 uStack_158;
  undefined8 uStack_150;
  undefined8 uStack_148;
  undefined8 uStack_140;
  undefined8 uStack_138;
  undefined7 uStack_f0;
  undefined1 uStack_e9;
  undefined7 uStack_e8;
  undefined1 uStack_e1;
  undefined7 uStack_e0;
  undefined1 uStack_d9;
  undefined8 uStack_c9;
  char cStack_c0;
  undefined7 uStack_bf;
  undefined1 uStack_b8;
  undefined7 uStack_b7;
  undefined1 uStack_b0;
  undefined7 uStack_af;
  undefined1 uStack_a8;
  undefined7 uStack_a7;
  undefined1 uStack_a0;
  undefined7 uStack_9f;
  undefined1 uStack_98;
  undefined7 uStack_97;
  undefined1 uStack_90;
  undefined7 uStack_8f;
  undefined1 uStack_88;
  undefined7 uStack_87;
  undefined1 uStack_80;
  undefined8 uStack_7f;
  undefined8 uStack_77;
  undefined8 uStack_6f;
  undefined7 uStack_67;
  undefined1 uStack_60;
  undefined7 uStack_5f;
  undefined8 uStack_58;
  undefined8 uStack_8;
  
  func_0x002458bc();
  __Unwind_Resume();
  puVar3 = (undefined8 *)func_0x007a2668();
  puVar13 = &uStack_180;
  uStack_8 = (undefined *)0x24f3c4;
  lVar15 = (long)register0x00000008 + -0x10;
  if ((*(byte *)((long)puVar3 + 0x33a) & 1) == 0) {
    puVar4 = (undefined8 *)func_0x00187bd0(0x1d,1);
    uVar11 = _UNK_0082a08e;
    if (puVar4 == (undefined8 *)0x0) {
      func_0x007a1f00(1,0x1d,&UNK_009c9ec0);
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x24fadc);
      (*pcVar2)();
    }
    puVar4[1] = CONCAT35(_UNK_0082a09b,_UNK_0082a096);
    *puVar4 = uVar11;
    uVar11 = CONCAT53(_UNK_0082a09e,_UNK_0082a09b);
    *(undefined8 *)((long)puVar4 + 0x15) = _UNK_0082a0a3;
    *(undefined8 *)((long)puVar4 + 0xd) = uVar11;
    uVar11 = _UNK_00829c40;
    extraout_x8[3] = _UNK_00829c48;
    extraout_x8[2] = uVar11;
    extraout_x8[4] = puVar4;
    extraout_x8[5] = 0x1d;
    *(undefined1 *)(extraout_x8 + 1) = 3;
    if (puVar3[0x7d] == -0x7fffffffffffffd9) {
      uVar11 = puVar3[0x7e];
      puVar4 = (undefined8 *)puVar3[0x7f];
      if ((code *)*puVar4 != (code *)0x0) {
        (*(code *)*puVar4)(uVar11);
      }
      uVar5 = puVar4[1];
      if (uVar5 != 0) {
        uVar6 = puVar4[2];
        uStack_8 = &UNK_0024f540;
        goto code_r0x00187bd4;
      }
    }
    else {
      func_0x00245b38(puVar3 + 0x7d);
    }
code_r0x0024f570:
    func_0x0016e700(puVar3 + 0x68);
    func_0x002461b4(puVar3);
code_r0x0024f580:
    uVar5 = puVar3[0x5b];
    if ((uVar5 != 0x8000000000000000) && (uVar5 != 0)) {
      uVar11 = puVar3[0x5c];
      uVar6 = 1;
      uStack_8 = &UNK_0024f5a0;
      puVar13 = &uStack_180;
      goto code_r0x00187bd4;
    }
    lVar7 = puVar3[0x5e];
    if (lVar7 != -0x8000000000000000) {
      lVar10 = puVar3[0x60];
      if (lVar10 != 0) {
        puVar13 = (undefined8 *)(puVar3[0x5f] + 8);
        do {
          lVar7 = puVar13[-1];
          if (lVar7 != -0x8000000000000000 && lVar7 != 0) {
            func_0x00187bd4(*puVar13,lVar7,1);
          }
          puVar13 = puVar13 + 3;
          lVar10 = lVar10 + -1;
        } while (lVar10 != 0);
        lVar7 = puVar3[0x5e];
      }
      if (lVar7 != 0) {
        uVar11 = puVar3[0x5f];
        uVar5 = lVar7 * 0x18;
        uVar6 = 8;
        uStack_8 = &UNK_0024f60c;
        puVar13 = &uStack_180;
        goto code_r0x00187bd4;
      }
    }
    uVar5 = puVar3[0xf];
    if (uVar5 != 0) {
      lVar7 = puVar3[0xd];
      uVar1 = puVar3[0xe];
      uVar8 = puVar3[0xc];
      uVar12 = 0;
      if (uVar8 <= uVar1) {
        uVar12 = uVar8;
      }
      lVar9 = uVar1 - uVar12;
      uVar14 = uVar8 - lVar9;
      lVar10 = 0;
      if (uVar14 <= uVar5) {
        lVar10 = uVar5 - uVar14;
      }
      if (uVar5 <= uVar14) {
        uVar8 = lVar9 + uVar5;
      }
      lVar9 = uVar8 - lVar9;
      if (lVar9 != 0) {
        puVar13 = (undefined8 *)(uVar1 * 0x18 + uVar12 * -0x18 + lVar7 + 8);
        do {
          if (puVar13[-1] != 0) {
            func_0x00187bd4(*puVar13,puVar13[-1],1);
          }
          puVar13 = puVar13 + 3;
          lVar9 = lVar9 + -1;
        } while (lVar9 != 0);
      }
      if (uVar14 < uVar5) {
        puVar13 = (undefined8 *)(lVar7 + 8);
        do {
          if (puVar13[-1] != 0) {
            func_0x00187bd4(*puVar13,puVar13[-1],1);
          }
          puVar13 = puVar13 + 3;
          lVar10 = lVar10 + -1;
        } while (lVar10 != 0);
      }
    }
    if (puVar3[0xc] != 0) {
      uVar11 = puVar3[0xd];
      uVar5 = puVar3[0xc] * 0x18;
      uVar6 = 8;
      uStack_8 = &UNK_0024f698;
      puVar13 = &uStack_180;
      goto code_r0x00187bd4;
    }
    uVar12 = puVar3[0x16];
    if (uVar12 != 0) {
      uVar1 = puVar3[0x15];
      uVar8 = puVar3[0x13];
      uVar5 = 0;
      if (uVar8 <= uVar1) {
        uVar5 = uVar8;
      }
      lVar10 = uVar1 - uVar5;
      uVar14 = uVar8 - lVar10;
      lVar7 = 0;
      if (uVar14 <= uVar12) {
        lVar7 = uVar12 - uVar14;
      }
      if (uVar12 <= uVar14) {
        uVar8 = lVar10 + uVar12;
      }
      lVar10 = uVar8 - lVar10;
      if (lVar10 != 0) {
        puVar13 = (undefined8 *)(uVar1 * 0x18 + uVar5 * -0x18 + puVar3[0x14] + 8);
        do {
          uVar5 = puVar13[-1];
          if (uVar5 != 0) {
            uVar11 = *puVar13;
            uVar6 = 1;
            uStack_8 = &UNK_0024f77c;
            puVar13 = &uStack_180;
            goto code_r0x00187bd4;
          }
          puVar13 = puVar13 + 3;
          lVar10 = lVar10 + -1;
        } while (lVar10 != 0);
      }
      if (uVar14 < uVar12) {
        puVar13 = (undefined8 *)(puVar3[0x14] + 8);
        do {
          if (puVar13[-1] != 0) {
            func_0x00187bd4(*puVar13,puVar13[-1],1);
          }
          puVar13 = puVar13 + 3;
          lVar7 = lVar7 + -1;
        } while (lVar7 != 0);
      }
    }
  }
  else {
    lVar7 = puVar3[0x7d];
    uVar11 = puVar3[0x7e];
    puVar13 = (undefined8 *)puVar3[0x7f];
    if (lVar7 != -0x7fffffffffffffd9) {
      uVar6 = puVar3[0x80];
      extraout_x8[6] = puVar3[0x81];
      extraout_x8[5] = uVar6;
      uVar6 = puVar3[0x82];
      extraout_x8[8] = puVar3[0x83];
      extraout_x8[7] = uVar6;
      extraout_x8[2] = lVar7;
      extraout_x8[3] = uVar11;
      extraout_x8[4] = puVar13;
      *(undefined1 *)(extraout_x8 + 1) = 3;
      goto code_r0x0024f570;
    }
    uStack_158 = puVar3[5];
    uStack_160 = puVar3[4];
    uStack_148 = puVar3[7];
    uStack_150 = puVar3[6];
    uStack_138 = puVar3[9];
    uStack_140 = puVar3[8];
    uStack_178 = puVar3[1];
    uStack_180 = *puVar3;
    uStack_168 = puVar3[3];
    uStack_170 = puVar3[2];
    (*(code *)puVar13[5])(&cStack_c0,uVar11);
    if (cStack_c0 == '\x03') {
      extraout_x8[3] = CONCAT71(uStack_af,uStack_b0);
      extraout_x8[2] = CONCAT71(uStack_b7,uStack_b8);
      extraout_x8[5] = CONCAT71(uStack_9f,uStack_a0);
      extraout_x8[4] = CONCAT71(uStack_a7,uStack_a8);
      extraout_x8[7] = CONCAT71(uStack_8f,uStack_90);
      extraout_x8[6] = CONCAT71(uStack_97,uStack_98);
      extraout_x8[8] = CONCAT71(uStack_87,uStack_88);
      *(undefined1 *)(extraout_x8 + 1) = 3;
      func_0x002461b4(&uStack_180);
      if ((code *)*puVar13 != (code *)0x0) {
        (*(code *)*puVar13)(uVar11);
      }
      uVar5 = puVar13[1];
      if (uVar5 != 0) {
        uVar6 = puVar13[2];
        uStack_8 = &UNK_0024f4a4;
        puVar13 = &uStack_180;
        goto code_r0x00187bd4;
      }
      func_0x0016e700(puVar3 + 0x68);
      goto code_r0x0024f580;
    }
    uStack_e8 = (undefined7)uStack_77;
    uStack_e1 = (undefined1)((ulong)uStack_77 >> 0x38);
    uStack_f0 = (undefined7)uStack_7f;
    uStack_e9 = (undefined1)((ulong)uStack_7f >> 0x38);
    uStack_e0 = (undefined7)uStack_6f;
    uStack_d9 = (undefined1)((ulong)uStack_6f >> 0x38);
    uStack_c9 = uStack_58;
    *(ulong *)((long)extraout_x8 + 0x11) = CONCAT17(uStack_b0,uStack_b7);
    *(ulong *)((long)extraout_x8 + 9) = CONCAT17(uStack_b8,uStack_bf);
    *(ulong *)((long)extraout_x8 + 0x21) = CONCAT17(uStack_a0,uStack_a7);
    *(ulong *)((long)extraout_x8 + 0x19) = CONCAT17(uStack_a8,uStack_af);
    *(ulong *)((long)extraout_x8 + 0x31) = CONCAT17(uStack_90,uStack_97);
    *(ulong *)((long)extraout_x8 + 0x29) = CONCAT17(uStack_98,uStack_9f);
    extraout_x8[0xf] = uStack_58;
    *extraout_x8 = uStack_148;
    extraout_x8[10] = CONCAT71(uStack_f0,uStack_80);
    extraout_x8[9] = CONCAT71(uStack_87,uStack_88);
    extraout_x8[0xc] = CONCAT71(uStack_e0,uStack_e1);
    extraout_x8[0xb] = CONCAT71(uStack_e8,uStack_e9);
    extraout_x8[0xe] = CONCAT71(uStack_5f,uStack_60);
    extraout_x8[0xd] = CONCAT71(uStack_67,uStack_d9);
    *(char *)(extraout_x8 + 1) = cStack_c0;
    extraout_x8[7] = CONCAT71(uStack_8f,uStack_90);
    extraout_x8[8] = uStack_140;
    func_0x002461b4(&uStack_180);
    if ((code *)*puVar13 != (code *)0x0) {
      (*(code *)*puVar13)(uVar11);
    }
    uVar5 = puVar13[1];
    if (uVar5 != 0) {
      uVar6 = puVar13[2];
      uStack_8 = &UNK_0024f818;
      puVar13 = &uStack_180;
      goto code_r0x00187bd4;
    }
    func_0x0016e700(puVar3 + 0x68);
    uVar5 = puVar3[0x5b];
    if ((uVar5 != 0x8000000000000000) && (uVar5 != 0)) {
      uVar11 = puVar3[0x5c];
      uVar6 = 1;
      uStack_8 = &UNK_0024f840;
      puVar13 = &uStack_180;
      goto code_r0x00187bd4;
    }
    lVar7 = puVar3[0x5e];
    if (lVar7 != -0x8000000000000000) {
      lVar10 = puVar3[0x60];
      if (lVar10 != 0) {
        puVar13 = (undefined8 *)(puVar3[0x5f] + 8);
        do {
          lVar7 = puVar13[-1];
          if (lVar7 != -0x8000000000000000 && lVar7 != 0) {
            func_0x00187bd4(*puVar13,lVar7,1);
          }
          puVar13 = puVar13 + 3;
          lVar10 = lVar10 + -1;
        } while (lVar10 != 0);
        lVar7 = puVar3[0x5e];
      }
      if (lVar7 != 0) {
        uVar11 = puVar3[0x5f];
        uVar5 = lVar7 * 0x18;
        uVar6 = 8;
        uStack_8 = &UNK_0024f8ac;
        puVar13 = &uStack_180;
        goto code_r0x00187bd4;
      }
    }
    uVar5 = puVar3[0xf];
    if (uVar5 != 0) {
      lVar7 = puVar3[0xd];
      uVar1 = puVar3[0xe];
      uVar8 = puVar3[0xc];
      uVar12 = 0;
      if (uVar8 <= uVar1) {
        uVar12 = uVar8;
      }
      lVar9 = uVar1 - uVar12;
      uVar14 = uVar8 - lVar9;
      lVar10 = 0;
      if (uVar14 <= uVar5) {
        lVar10 = uVar5 - uVar14;
      }
      if (uVar5 <= uVar14) {
        uVar8 = lVar9 + uVar5;
      }
      lVar9 = uVar8 - lVar9;
      if (lVar9 != 0) {
        puVar13 = (undefined8 *)(uVar1 * 0x18 + uVar12 * -0x18 + lVar7 + 8);
        do {
          if (puVar13[-1] != 0) {
            func_0x00187bd4(*puVar13,puVar13[-1],1);
          }
          puVar13 = puVar13 + 3;
          lVar9 = lVar9 + -1;
        } while (lVar9 != 0);
      }
      if (uVar14 < uVar5) {
        puVar13 = (undefined8 *)(lVar7 + 8);
        do {
          if (puVar13[-1] != 0) {
            func_0x00187bd4(*puVar13,puVar13[-1],1);
          }
          puVar13 = puVar13 + 3;
          lVar10 = lVar10 + -1;
        } while (lVar10 != 0);
      }
    }
    if (puVar3[0xc] != 0) {
      uVar11 = puVar3[0xd];
      uVar5 = puVar3[0xc] * 0x18;
      uVar6 = 8;
      uStack_8 = &UNK_0024f938;
      puVar13 = &uStack_180;
      goto code_r0x00187bd4;
    }
    uVar12 = puVar3[0x16];
    if (uVar12 != 0) {
      uVar1 = puVar3[0x15];
      uVar8 = puVar3[0x13];
      uVar5 = 0;
      if (uVar8 <= uVar1) {
        uVar5 = uVar8;
      }
      lVar10 = uVar1 - uVar5;
      uVar14 = uVar8 - lVar10;
      lVar7 = 0;
      if (uVar14 <= uVar12) {
        lVar7 = uVar12 - uVar14;
      }
      if (uVar12 <= uVar14) {
        uVar8 = lVar10 + uVar12;
      }
      lVar10 = uVar8 - lVar10;
      if (lVar10 != 0) {
        puVar13 = (undefined8 *)(uVar1 * 0x18 + uVar5 * -0x18 + puVar3[0x14] + 8);
        do {
          uVar5 = puVar13[-1];
          if (uVar5 != 0) {
            uVar11 = *puVar13;
            uVar6 = 1;
            uStack_8 = &UNK_0024fac0;
            puVar13 = &uStack_180;
            goto code_r0x00187bd4;
          }
          puVar13 = puVar13 + 3;
          lVar10 = lVar10 + -1;
        } while (lVar10 != 0);
      }
      if (uVar14 < uVar12) {
        puVar13 = (undefined8 *)(puVar3[0x14] + 8);
        do {
          if (puVar13[-1] != 0) {
            func_0x00187bd4(*puVar13,puVar13[-1],1);
          }
          puVar13 = puVar13 + 3;
          lVar7 = lVar7 + -1;
        } while (lVar7 != 0);
      }
    }
  }
  if (puVar3[0x13] == 0) {
    uVar5 = puVar3[0x61];
    if ((uVar5 | 0x8000000000000000) == 0x8000000000000000) {
      func_0x002459c0(puVar3 + 0x18);
      if (puVar3[0x79] == 0) {
        return;
      }
      uVar11 = puVar3[0x7a];
      uVar5 = puVar3[0x79] * 0x28;
      uVar6 = 8;
      puVar13 = (undefined8 *)register0x00000008;
      lVar15 = unaff_x29;
    }
    else {
      uVar11 = puVar3[0x62];
      uVar6 = 1;
      uStack_8 = &UNK_0024fa20;
      puVar13 = &uStack_180;
    }
  }
  else {
    uVar11 = puVar3[0x14];
    uVar5 = puVar3[0x13] * 0x18;
    uVar6 = 8;
    uStack_8 = &UNK_0024f9c4;
    puVar13 = &uStack_180;
  }
code_r0x00187bd4:
  *(long *)((long)puVar13 + -0x10) = lVar15;
  *(undefined **)((long)puVar13 + -8) = uStack_8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar11,uVar5,uVar6);
  return;
}

