
/* WARNING: Possible PIC construction at 0x0024fc50: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0024fd38: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0024fe6c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0024fef8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0024ff84: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00250298: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0024fffc: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00250098: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00250104: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00250190: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0025021c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x002502fc: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0024fdcc: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0024fc2c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00250300) */
/* WARNING: Removing unreachable block (ram,0x00250220) */
/* WARNING: Removing unreachable block (ram,0x00250194) */
/* WARNING: Removing unreachable block (ram,0x00250108) */
/* WARNING: Removing unreachable block (ram,0x00250000) */
/* WARNING: Removing unreachable block (ram,0x0025029c) */
/* WARNING: Removing unreachable block (ram,0x0024ff88) */
/* WARNING: Removing unreachable block (ram,0x0024fefc) */
/* WARNING: Removing unreachable block (ram,0x0024fe70) */
/* WARNING: Removing unreachable block (ram,0x0024fd3c) */
/* WARNING: Removing unreachable block (ram,0x0024fdd0) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0024fbc4(undefined8 param_1,ulong param_2)

{
  long lVar1;
  ulong uVar2;
  ulong uVar3;
  code *pcVar4;
  undefined8 uVar5;
  undefined8 *puVar6;
  undefined8 uVar7;
  undefined8 *extraout_x8;
  long lVar8;
  ulong uVar9;
  long lVar10;
  long unaff_x19;
  long lVar11;
  ulong unaff_x21;
  ulong uVar12;
  undefined8 *puVar13;
  ulong uVar14;
  long unaff_x29;
  undefined8 uVar15;
  undefined8 uVar16;
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
  
  if ((param_2 != unaff_x21) && (param_2 != 0)) {
    uVar5 = *(undefined8 *)(unaff_x19 + 0x310);
    uVar7 = 1;
    uStack_8 = (undefined *)0x24fc30;
    goto code_r0x00187bd4;
  }
  func_0x002459c0(unaff_x19 + 0xc0);
  if (*(long *)(unaff_x19 + 0x3c8) != 0) {
    uVar5 = *(undefined8 *)(unaff_x19 + 0x3d0);
    param_2 = *(long *)(unaff_x19 + 0x3c8) * 0x28;
    uVar7 = 8;
    uStack_8 = (undefined *)0x24fc54;
    goto code_r0x00187bd4;
  }
  puVar6 = (undefined8 *)__Unwind_Resume();
  uStack_8 = (undefined *)0x24fc5c;
  lVar1 = (long)register0x00000008 + -0x10;
  if ((*(byte *)((long)puVar6 + 0x33a) & 1) == 0) {
    puVar13 = (undefined8 *)func_0x00187bd0(0x1d,1);
    uVar5 = _UNK_0082a08e;
    if (puVar13 == (undefined8 *)0x0) {
      func_0x007a1f00(1,0x1d,&UNK_009c9ec0);
                    /* WARNING: Does not return */
      pcVar4 = (code *)SoftwareBreakpoint(1,0x250358);
      (*pcVar4)();
    }
    puVar13[1] = CONCAT35(_UNK_0082a09b,_UNK_0082a096);
    *puVar13 = uVar5;
    uVar5 = CONCAT53(_UNK_0082a09e,_UNK_0082a09b);
    *(undefined8 *)((long)puVar13 + 0x15) = _UNK_0082a0a3;
    *(undefined8 *)((long)puVar13 + 0xd) = uVar5;
    uVar5 = _UNK_00829c40;
    extraout_x8[3] = _UNK_00829c48;
    extraout_x8[2] = uVar5;
    extraout_x8[4] = puVar13;
    extraout_x8[5] = 0x1d;
    *(undefined1 *)(extraout_x8 + 1) = 3;
    if (puVar6[0x71] == -0x7fffffffffffffd9) {
      uVar5 = puVar6[0x72];
      puVar13 = (undefined8 *)puVar6[0x73];
      if ((code *)*puVar13 != (code *)0x0) {
        (*(code *)*puVar13)(uVar5);
      }
      param_2 = puVar13[1];
      if (param_2 != 0) {
        uVar7 = puVar13[2];
        uStack_8 = (undefined *)0x24fdd0;
        register0x00000008 = (BADSPACEBASE *)&uStack_180;
        unaff_x29 = lVar1;
        goto code_r0x00187bd4;
      }
    }
    else {
      func_0x00245b38(puVar6 + 0x71);
    }
LAB_0024fdfc:
    func_0x002461b4(puVar6);
LAB_0024fe04:
    lVar8 = puVar6[0x5b];
    if ((lVar8 != -0x8000000000000000) && (lVar8 != 0)) {
      func_0x00187bd4(puVar6[0x5c],lVar8,1);
    }
    lVar8 = puVar6[0x5e];
    if (lVar8 != -0x8000000000000000) {
      lVar11 = puVar6[0x60];
      if (lVar11 != 0) {
        puVar13 = (undefined8 *)(puVar6[0x5f] + 8);
        do {
          param_2 = puVar13[-1];
          if (param_2 != 0x8000000000000000 && param_2 != 0) {
            uVar5 = *puVar13;
            uVar7 = 1;
            uStack_8 = (undefined *)0x24fe70;
            register0x00000008 = (BADSPACEBASE *)&uStack_180;
            unaff_x29 = lVar1;
            goto code_r0x00187bd4;
          }
          puVar13 = puVar13 + 3;
          lVar11 = lVar11 + -1;
        } while (lVar11 != 0);
        lVar8 = puVar6[0x5e];
      }
      if (lVar8 != 0) {
        func_0x00187bd4(puVar6[0x5f],lVar8 * 0x18,8);
      }
    }
    uVar12 = puVar6[0xf];
    if (uVar12 != 0) {
      lVar8 = puVar6[0xd];
      uVar3 = puVar6[0xe];
      uVar9 = puVar6[0xc];
      uVar2 = 0;
      if (uVar9 <= uVar3) {
        uVar2 = uVar9;
      }
      lVar10 = uVar3 - uVar2;
      uVar14 = uVar9 - lVar10;
      lVar11 = 0;
      if (uVar14 <= uVar12) {
        lVar11 = uVar12 - uVar14;
      }
      if (uVar12 <= uVar14) {
        uVar9 = lVar10 + uVar12;
      }
      lVar10 = uVar9 - lVar10;
      if (lVar10 != 0) {
        puVar13 = (undefined8 *)(uVar3 * 0x18 + uVar2 * -0x18 + lVar8 + 8);
        do {
          if (puVar13[-1] != 0) {
            func_0x00187bd4(*puVar13,puVar13[-1],1);
          }
          puVar13 = puVar13 + 3;
          lVar10 = lVar10 + -1;
        } while (lVar10 != 0);
      }
      if (uVar14 < uVar12) {
        puVar13 = (undefined8 *)(lVar8 + 8);
        do {
          param_2 = puVar13[-1];
          if (param_2 != 0) {
            uVar5 = *puVar13;
            uVar7 = 1;
            uStack_8 = &UNK_0024fefc;
            register0x00000008 = (BADSPACEBASE *)&uStack_180;
            unaff_x29 = lVar1;
            goto code_r0x00187bd4;
          }
          puVar13 = puVar13 + 3;
          lVar11 = lVar11 + -1;
        } while (lVar11 != 0);
      }
    }
    if (puVar6[0xc] != 0) {
      func_0x00187bd4(puVar6[0xd],puVar6[0xc] * 0x18,8);
    }
    uVar12 = puVar6[0x16];
    if (uVar12 != 0) {
      uVar3 = puVar6[0x15];
      uVar9 = puVar6[0x13];
      uVar2 = 0;
      if (uVar9 <= uVar3) {
        uVar2 = uVar9;
      }
      lVar11 = uVar3 - uVar2;
      uVar14 = uVar9 - lVar11;
      lVar8 = 0;
      if (uVar14 <= uVar12) {
        lVar8 = uVar12 - uVar14;
      }
      if (uVar12 <= uVar14) {
        uVar9 = lVar11 + uVar12;
      }
      lVar11 = uVar9 - lVar11;
      if (lVar11 != 0) {
        puVar13 = (undefined8 *)(uVar3 * 0x18 + uVar2 * -0x18 + puVar6[0x14] + 8);
        do {
          param_2 = puVar13[-1];
          if (param_2 != 0) {
            uVar5 = *puVar13;
            uVar7 = 1;
            uStack_8 = &UNK_00250000;
            register0x00000008 = (BADSPACEBASE *)&uStack_180;
            unaff_x29 = lVar1;
            goto code_r0x00187bd4;
          }
          puVar13 = puVar13 + 3;
          lVar11 = lVar11 + -1;
        } while (lVar11 != 0);
      }
      if (uVar14 < uVar12) {
        puVar13 = (undefined8 *)(puVar6[0x14] + 8);
        do {
          param_2 = puVar13[-1];
          if (param_2 != 0) {
            uVar5 = *puVar13;
            uVar7 = 1;
            uStack_8 = &UNK_0024ff88;
            register0x00000008 = (BADSPACEBASE *)&uStack_180;
            unaff_x29 = lVar1;
            goto code_r0x00187bd4;
          }
          puVar13 = puVar13 + 3;
          lVar8 = lVar8 + -1;
        } while (lVar8 != 0);
      }
    }
  }
  else {
    lVar8 = puVar6[0x71];
    uVar5 = puVar6[0x72];
    puVar13 = (undefined8 *)puVar6[0x73];
    if (lVar8 != -0x7fffffffffffffd9) {
      uVar7 = puVar6[0x74];
      uVar16 = puVar6[0x77];
      uVar15 = puVar6[0x76];
      extraout_x8[6] = puVar6[0x75];
      extraout_x8[5] = uVar7;
      extraout_x8[8] = uVar16;
      extraout_x8[7] = uVar15;
      extraout_x8[2] = lVar8;
      extraout_x8[3] = uVar5;
      extraout_x8[4] = puVar13;
      *(undefined1 *)(extraout_x8 + 1) = 3;
      goto LAB_0024fdfc;
    }
    uStack_158 = puVar6[5];
    uStack_160 = puVar6[4];
    uStack_148 = puVar6[7];
    uStack_150 = puVar6[6];
    uStack_138 = puVar6[9];
    uStack_140 = puVar6[8];
    uStack_178 = puVar6[1];
    uStack_180 = *puVar6;
    uStack_168 = puVar6[3];
    uStack_170 = puVar6[2];
    (*(code *)puVar13[5])(&cStack_c0,uVar5);
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
        (*(code *)*puVar13)(uVar5);
      }
      param_2 = puVar13[1];
      if (param_2 != 0) {
        uVar7 = puVar13[2];
        uStack_8 = (undefined *)0x24fd3c;
        register0x00000008 = (BADSPACEBASE *)&uStack_180;
        unaff_x29 = lVar1;
        goto code_r0x00187bd4;
      }
      goto LAB_0024fe04;
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
      (*(code *)*puVar13)(uVar5);
    }
    param_2 = puVar13[1];
    if (param_2 != 0) {
      uVar7 = puVar13[2];
      uStack_8 = &UNK_0025009c;
      register0x00000008 = (BADSPACEBASE *)&uStack_180;
      unaff_x29 = lVar1;
      goto code_r0x00187bd4;
    }
    lVar8 = puVar6[0x5b];
    if ((lVar8 != -0x8000000000000000) && (lVar8 != 0)) {
      func_0x00187bd4(puVar6[0x5c],lVar8,1);
    }
    lVar8 = puVar6[0x5e];
    if (lVar8 != -0x8000000000000000) {
      lVar11 = puVar6[0x60];
      if (lVar11 != 0) {
        puVar13 = (undefined8 *)(puVar6[0x5f] + 8);
        do {
          param_2 = puVar13[-1];
          if (param_2 != 0x8000000000000000 && param_2 != 0) {
            uVar5 = *puVar13;
            uVar7 = 1;
            uStack_8 = &UNK_00250108;
            register0x00000008 = (BADSPACEBASE *)&uStack_180;
            unaff_x29 = lVar1;
            goto code_r0x00187bd4;
          }
          puVar13 = puVar13 + 3;
          lVar11 = lVar11 + -1;
        } while (lVar11 != 0);
        lVar8 = puVar6[0x5e];
      }
      if (lVar8 != 0) {
        func_0x00187bd4(puVar6[0x5f],lVar8 * 0x18,8);
      }
    }
    uVar12 = puVar6[0xf];
    if (uVar12 != 0) {
      uVar3 = puVar6[0xe];
      uVar9 = puVar6[0xc];
      uVar2 = 0;
      if (uVar9 <= uVar3) {
        uVar2 = uVar9;
      }
      lVar11 = uVar3 - uVar2;
      uVar14 = uVar9 - lVar11;
      lVar8 = 0;
      if (uVar14 <= uVar12) {
        lVar8 = uVar12 - uVar14;
      }
      if (uVar12 <= uVar14) {
        uVar9 = lVar11 + uVar12;
      }
      lVar11 = uVar9 - lVar11;
      if (lVar11 != 0) {
        puVar13 = (undefined8 *)(uVar3 * 0x18 + uVar2 * -0x18 + puVar6[0xd] + 8);
        do {
          param_2 = puVar13[-1];
          if (param_2 != 0) {
            uVar5 = *puVar13;
            uVar7 = 1;
            uStack_8 = &UNK_00250300;
            register0x00000008 = (BADSPACEBASE *)&uStack_180;
            unaff_x29 = lVar1;
            goto code_r0x00187bd4;
          }
          puVar13 = puVar13 + 3;
          lVar11 = lVar11 + -1;
        } while (lVar11 != 0);
      }
      if (uVar14 < uVar12) {
        puVar13 = (undefined8 *)(puVar6[0xd] + 8);
        do {
          param_2 = puVar13[-1];
          if (param_2 != 0) {
            uVar5 = *puVar13;
            uVar7 = 1;
            uStack_8 = &UNK_00250194;
            register0x00000008 = (BADSPACEBASE *)&uStack_180;
            unaff_x29 = lVar1;
            goto code_r0x00187bd4;
          }
          puVar13 = puVar13 + 3;
          lVar8 = lVar8 + -1;
        } while (lVar8 != 0);
      }
    }
    if (puVar6[0xc] != 0) {
      func_0x00187bd4(puVar6[0xd],puVar6[0xc] * 0x18,8);
    }
    uVar12 = puVar6[0x16];
    if (uVar12 != 0) {
      lVar8 = puVar6[0x14];
      uVar3 = puVar6[0x15];
      uVar9 = puVar6[0x13];
      uVar2 = 0;
      if (uVar9 <= uVar3) {
        uVar2 = uVar9;
      }
      lVar10 = uVar3 - uVar2;
      uVar14 = uVar9 - lVar10;
      lVar11 = 0;
      if (uVar14 <= uVar12) {
        lVar11 = uVar12 - uVar14;
      }
      if (uVar12 <= uVar14) {
        uVar9 = lVar10 + uVar12;
      }
      lVar10 = uVar9 - lVar10;
      if (lVar10 != 0) {
        puVar13 = (undefined8 *)(uVar3 * 0x18 + uVar2 * -0x18 + lVar8 + 8);
        do {
          if (puVar13[-1] != 0) {
            func_0x00187bd4(*puVar13,puVar13[-1],1);
          }
          puVar13 = puVar13 + 3;
          lVar10 = lVar10 + -1;
        } while (lVar10 != 0);
      }
      if (uVar14 < uVar12) {
        puVar13 = (undefined8 *)(lVar8 + 8);
        do {
          param_2 = puVar13[-1];
          if (param_2 != 0) {
            uVar5 = *puVar13;
            uVar7 = 1;
            uStack_8 = &UNK_00250220;
            register0x00000008 = (BADSPACEBASE *)&uStack_180;
            unaff_x29 = lVar1;
            goto code_r0x00187bd4;
          }
          puVar13 = puVar13 + 3;
          lVar11 = lVar11 + -1;
        } while (lVar11 != 0);
      }
    }
  }
  if (puVar6[0x13] != 0) {
    func_0x00187bd4(puVar6[0x14],puVar6[0x13] * 0x18,8);
  }
  param_2 = puVar6[0x61];
  if ((param_2 | 0x8000000000000000) == 0x8000000000000000) {
    func_0x002459c0(puVar6 + 0x18);
    if (puVar6[0x6d] == 0) {
      return;
    }
    uVar5 = puVar6[0x6e];
    param_2 = puVar6[0x6d] * 0x28;
    uVar7 = 8;
  }
  else {
    uVar5 = puVar6[0x62];
    uVar7 = 1;
    uStack_8 = &UNK_0025029c;
    register0x00000008 = (BADSPACEBASE *)&uStack_180;
    unaff_x29 = lVar1;
  }
code_r0x00187bd4:
  *(long *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined **)((long)register0x00000008 + -8) = uStack_8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar5,param_2,uVar7);
  return;
}

