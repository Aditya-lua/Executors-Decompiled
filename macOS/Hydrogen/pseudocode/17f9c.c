
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

undefined8 ** FUN_00017f9c(long param_1)

{
  ulong uVar1;
  undefined8 *puVar2;
  long lVar3;
  undefined8 **ppuVar4;
  undefined8 uVar5;
  long *plVar6;
  undefined8 *puVar7;
  undefined8 *puVar8;
  char *pcVar9;
  long lVar10;
  ulong uVar11;
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
  
  puVar2 = (undefined8 *)func_0x000174a0(param_1 + 0x4f2);
  lVar3 = _getenv("HOME");
  if (lVar3 != 0) {
    uStack_98 = 0;
    uStack_90 = 0;
    pcVar9 = (char *)(lVar3 + -1);
    lStack_88 = 0;
    do {
      pcVar9 = pcVar9 + 1;
    } while (*pcVar9 != '\0');
    func_0x00017184(&uStack_98,lVar3);
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
    puVar2[1] = uStack_38;
    *puVar2 = uStack_40;
    puVar2[2] = lStack_30;
    ppuVar4 = (undefined8 **)func_0x0001754c(puVar2,&uStack_60);
    return ppuVar4;
  }
  uVar5 = ___cxa_allocate_exception(0x10);
  __ZNSt13runtime_errorC1EPKc(uVar5,"HOME not set");
  uVar5 = ___cxa_throw(uVar5,PTR___ZTISt13runtime_error_009b0128,
                       PTR___ZNSt13runtime_errorD1Ev_009b0050);
  auVar17 = __Unwind_Resume(uVar5);
  puVar8 = auVar17._8_8_;
  plVar6 = auVar17._0_8_;
  puVar2 = (undefined8 *)*plVar6;
  puVar12 = (undefined8 *)plVar6[1];
  lVar3 = (long)puVar12 - (long)puVar2 >> 4;
  uVar1 = lVar3 * -0x3333333333333333 + 1;
  if (0x333333333333333 < uVar1) {
    func_0x00017f90(plVar6);
code_r0x000185cc:
    func_0x00017514();
    for (; puStack_148 != puStack_150; puStack_148 = (undefined8 *)((long)puStack_148 + -0x50)) {
    }
    if (puStack_158 != (undefined8 *)0x0) {
      __ZdlPv();
    }
    return &puStack_158;
  }
  plStack_138 = plVar6 + 2;
  lVar10 = *plStack_138 - (long)puVar2 >> 4;
  uVar11 = lVar10 * -0x6666666666666666;
  if (uVar11 <= uVar1) {
    uVar11 = uVar1;
  }
  if (0x199999999999998 < (ulong)(lVar10 * -0x3333333333333333)) {
    uVar11 = 0x333333333333333;
  }
  if (uVar11 == 0) {
    puVar7 = (undefined8 *)0x0;
  }
  else {
    if (0x333333333333333 < uVar11) goto code_r0x000185cc;
    puVar7 = (undefined8 *)__Znwm(uVar11 * 0x50);
  }
  puStack_150 = puVar7 + lVar3 * 2;
  puStack_140 = puVar7 + uVar11 * 10;
  puStack_148 = puStack_150;
  if (*(char *)((long)puVar8 + 0x17) < '\0') {
    puStack_158 = puVar7;
    func_0x00017634(puStack_150,*puVar8,puVar8[1]);
    puVar2 = (undefined8 *)*plVar6;
    puVar12 = (undefined8 *)plVar6[1];
  }
  else {
    uVar5 = *puVar8;
    puStack_150[1] = puVar8[1];
    *puStack_150 = uVar5;
    puStack_150[2] = puVar8[2];
  }
  uVar5 = puVar8[4];
  uVar14 = puVar8[7];
  uVar13 = puVar8[6];
  puVar7[lVar3 * 2 + 5] = puVar8[5];
  puVar7[lVar3 * 2 + 4] = uVar5;
  puVar7[lVar3 * 2 + 7] = uVar14;
  puVar7[lVar3 * 2 + 6] = uVar13;
  uVar5 = puVar8[8];
  puVar7[lVar3 * 2 + 9] = puVar8[9];
  puVar7[lVar3 * 2 + 8] = uVar5;
  ppuVar4 = (undefined8 **)(puStack_148 + 10);
  if (puVar12 == puVar2) {
    puVar12 = puVar2;
  }
  else {
    do {
      uVar13 = puVar12[-9];
      uVar5 = puVar12[-10];
      puStack_150[-8] = puVar12[-8];
      puStack_150[-9] = uVar13;
      puStack_150[-10] = uVar5;
      puVar12[-9] = 0;
      puVar12[-8] = 0;
      puVar12[-10] = 0;
      uVar13 = puVar12[-5];
      uVar5 = puVar12[-6];
      uVar14 = puVar12[-4];
      uVar16 = puVar12[-1];
      uVar15 = puVar12[-2];
      puStack_150[-3] = puVar12[-3];
      puStack_150[-4] = uVar14;
      puStack_150[-1] = uVar16;
      puStack_150[-2] = uVar15;
      puStack_150[-5] = uVar13;
      puStack_150[-6] = uVar5;
      puStack_150 = puStack_150 + -10;
      puVar12 = puVar12 + -10;
    } while (puVar12 != puVar2);
    puVar2 = (undefined8 *)plVar6[1];
    puVar12 = (undefined8 *)*plVar6;
  }
  *plVar6 = (long)puStack_150;
  plVar6[1] = (long)ppuVar4;
  lVar3 = plVar6[2];
  plVar6[2] = (long)puStack_140;
  puStack_158 = puVar12;
  puStack_150 = puVar12;
  puStack_140 = (undefined8 *)lVar3;
  if (puVar2 != puVar12) {
    do {
      puVar8 = puVar2 + -10;
      puStack_148 = puVar8;
      if (*(char *)((long)puVar2 + -0x39) < '\0') {
        __ZdlPv(*puVar8);
      }
      puVar2 = puVar8;
    } while (puVar8 != puVar12);
    puVar2 = puVar12;
  }
  if (puVar2 != (undefined8 *)0x0) {
    __ZdlPv(puVar2);
  }
  return ppuVar4;
}

