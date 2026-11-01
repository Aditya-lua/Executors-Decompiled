
/* WARNING: Possible PIC construction at 0x000185d8: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x000185dc) */
/* WARNING: Removing unreachable block (ram,0x000182d4) */
/* WARNING: Removing unreachable block (ram,0x000181a8) */
/* WARNING: Removing unreachable block (ram,0x000180c0) */
/* WARNING: Removing unreachable block (ram,0x0001815c) */
/* WARNING: Removing unreachable block (ram,0x000181e0) */
/* WARNING: Removing unreachable block (ram,0x000181f0) */
/* WARNING: Removing unreachable block (ram,0x000182b4) */
/* WARNING: Removing unreachable block (ram,0x000182c4) */
/* WARNING: Removing unreachable block (ram,0x00018638) */

undefined8 ** FUN_00017fa4(undefined8 *param_1)

{
  ulong uVar1;
  long lVar2;
  undefined8 **ppuVar3;
  undefined8 uVar4;
  long *plVar5;
  undefined8 *puVar6;
  undefined8 *puVar7;
  char *pcVar8;
  long lVar9;
  ulong uVar10;
  undefined8 *puVar11;
  undefined8 *puVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined1 auVar17 [16];
  undefined8 *puStack_158;
  undefined8 *puStack_150;
  undefined8 *puStack_148;
  undefined8 *puStack_140;
  long *plStack_138;
  undefined8 uStack_e0;
  undefined8 uStack_d8;
  long lStack_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  long lStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  long lStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  long lStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  long lStack_70;
  undefined8 uStack_60;
  undefined8 uStack_58;
  long lStack_50;
  undefined8 uStack_40;
  undefined8 uStack_38;
  long lStack_30;
  
  lVar2 = _getenv("HOME");
  if (lVar2 != 0) {
    uStack_98 = 0;
    uStack_90 = 0;
    pcVar8 = (char *)(lVar2 + -1);
    lStack_88 = 0;
    do {
      pcVar8 = pcVar8 + 1;
    } while (*pcVar8 != '\0');
    func_0x00017184(&uStack_98,lVar2);
    uStack_b0 = 0;
    uStack_a8 = 0;
    lStack_a0 = 0;
    func_0x00017184(&uStack_b0,"Library","");
    if (lStack_88 < 0) {
      func_0x00017634(&uStack_80,uStack_98,uStack_90);
    }
    else {
      uStack_78 = uStack_90;
      uStack_80 = uStack_98;
      lStack_70 = lStack_88;
    }
    func_0x0001754c(&uStack_80,&uStack_b0);
    uStack_c8 = 0;
    uStack_c0 = 0;
    lStack_b8 = 0;
    func_0x00017184(&uStack_c8,"Application Support","");
    if (lStack_70 < 0) {
      func_0x00017634(&uStack_60,uStack_80,uStack_78);
    }
    else {
      uStack_58 = uStack_78;
      uStack_60 = uStack_80;
      lStack_50 = lStack_70;
    }
    func_0x0001754c(&uStack_60,&uStack_c8);
    uStack_e0 = 0;
    uStack_d8 = 0;
    lStack_d0 = 0;
    func_0x00017184(&uStack_e0,"Hydrogen","");
    uStack_38 = uStack_58;
    uStack_40 = uStack_60;
    lStack_30 = lStack_50;
    func_0x0001754c(&uStack_40,&uStack_e0);
    if (lStack_d0 < 0) {
      __ZdlPv(uStack_e0);
    }
    if (lStack_b8 < 0) {
      __ZdlPv(uStack_c8);
    }
    if (lStack_70 < 0) {
      __ZdlPv(uStack_80);
    }
    if (lStack_a0 < 0) {
      __ZdlPv(uStack_b0);
    }
    if (lStack_88 < 0) {
      __ZdlPv(uStack_98);
    }
    __ZNSt3__14__fs10filesystem20__create_directoriesERKNS1_4pathEPNS_10error_codeE(&uStack_40,0);
    uStack_60 = 0;
    uStack_58 = 0;
    lStack_50 = 0;
    func_0x00017184(&uStack_60,"key.txt","");
    param_1[1] = uStack_38;
    *param_1 = uStack_40;
    param_1[2] = lStack_30;
    ppuVar3 = (undefined8 **)func_0x0001754c(param_1,&uStack_60);
    return ppuVar3;
  }
  uVar4 = ___cxa_allocate_exception(0x10);
  __ZNSt13runtime_errorC1EPKc(uVar4,"HOME not set");
  uVar4 = ___cxa_throw(uVar4,PTR___ZTISt13runtime_error_009b0128,
                       PTR___ZNSt13runtime_errorD1Ev_009b0050);
  auVar17 = __Unwind_Resume(uVar4);
  puVar7 = auVar17._8_8_;
  plVar5 = auVar17._0_8_;
  puVar11 = (undefined8 *)*plVar5;
  puVar12 = (undefined8 *)plVar5[1];
  lVar2 = (long)puVar12 - (long)puVar11 >> 4;
  uVar1 = lVar2 * -0x3333333333333333 + 1;
  if (0x333333333333333 < uVar1) {
    func_0x00017f90(plVar5);
code_r0x000185cc:
    func_0x00017514();
    for (; puStack_148 != puStack_150; puStack_148 = (undefined8 *)((long)puStack_148 + -0x50)) {
    }
    if (puStack_158 != (undefined8 *)0x0) {
      __ZdlPv();
    }
    return &puStack_158;
  }
  plStack_138 = plVar5 + 2;
  lVar9 = *plStack_138 - (long)puVar11 >> 4;
  uVar10 = lVar9 * -0x6666666666666666;
  if (uVar10 <= uVar1) {
    uVar10 = uVar1;
  }
  if (0x199999999999998 < (ulong)(lVar9 * -0x3333333333333333)) {
    uVar10 = 0x333333333333333;
  }
  if (uVar10 == 0) {
    puVar6 = (undefined8 *)0x0;
  }
  else {
    if (0x333333333333333 < uVar10) goto code_r0x000185cc;
    puVar6 = (undefined8 *)__Znwm(uVar10 * 0x50);
  }
  puStack_150 = puVar6 + lVar2 * 2;
  puStack_140 = puVar6 + uVar10 * 10;
  puStack_148 = puStack_150;
  if (*(char *)((long)puVar7 + 0x17) < '\0') {
    puStack_158 = puVar6;
    func_0x00017634(puStack_150,*puVar7,puVar7[1]);
    puVar11 = (undefined8 *)*plVar5;
    puVar12 = (undefined8 *)plVar5[1];
  }
  else {
    uVar4 = *puVar7;
    puStack_150[1] = puVar7[1];
    *puStack_150 = uVar4;
    puStack_150[2] = puVar7[2];
  }
  uVar4 = puVar7[4];
  uVar14 = puVar7[7];
  uVar13 = puVar7[6];
  puVar6[lVar2 * 2 + 5] = puVar7[5];
  puVar6[lVar2 * 2 + 4] = uVar4;
  puVar6[lVar2 * 2 + 7] = uVar14;
  puVar6[lVar2 * 2 + 6] = uVar13;
  uVar4 = puVar7[8];
  puVar6[lVar2 * 2 + 9] = puVar7[9];
  puVar6[lVar2 * 2 + 8] = uVar4;
  ppuVar3 = (undefined8 **)(puStack_148 + 10);
  if (puVar12 == puVar11) {
    puVar12 = puVar11;
  }
  else {
    do {
      uVar13 = puVar12[-9];
      uVar4 = puVar12[-10];
      puStack_150[-8] = puVar12[-8];
      puStack_150[-9] = uVar13;
      puStack_150[-10] = uVar4;
      puVar12[-9] = 0;
      puVar12[-8] = 0;
      puVar12[-10] = 0;
      uVar13 = puVar12[-5];
      uVar4 = puVar12[-6];
      uVar14 = puVar12[-4];
      uVar16 = puVar12[-1];
      uVar15 = puVar12[-2];
      puStack_150[-3] = puVar12[-3];
      puStack_150[-4] = uVar14;
      puStack_150[-1] = uVar16;
      puStack_150[-2] = uVar15;
      puStack_150[-5] = uVar13;
      puStack_150[-6] = uVar4;
      puStack_150 = puStack_150 + -10;
      puVar12 = puVar12 + -10;
    } while (puVar12 != puVar11);
    puVar11 = (undefined8 *)plVar5[1];
    puVar12 = (undefined8 *)*plVar5;
  }
  *plVar5 = (long)puStack_150;
  plVar5[1] = (long)ppuVar3;
  lVar2 = plVar5[2];
  plVar5[2] = (long)puStack_140;
  puStack_158 = puVar12;
  puStack_150 = puVar12;
  puStack_140 = (undefined8 *)lVar2;
  if (puVar11 != puVar12) {
    do {
      puVar7 = puVar11 + -10;
      puStack_148 = puVar7;
      if (*(char *)((long)puVar11 + -0x39) < '\0') {
        __ZdlPv(*puVar7);
      }
      puVar11 = puVar7;
    } while (puVar7 != puVar12);
    puVar11 = puVar12;
  }
  if (puVar11 != (undefined8 *)0x0) {
    __ZdlPv(puVar11);
  }
  return ppuVar3;
}

