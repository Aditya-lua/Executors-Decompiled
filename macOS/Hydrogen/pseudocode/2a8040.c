
/* WARNING: Possible PIC construction at 0x002abd0c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x002abd10) */
/* WARNING: Removing unreachable block (ram,0x002abd18) */

long * FUN_002a8040(long param_1,long *param_2,undefined8 param_3,char *param_4,ulong *param_5,
                   char *param_6)

{
  int iVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  uint uVar6;
  uint uVar7;
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];
  undefined1 auVar12 [16];
  undefined1 auVar13 [16];
  undefined1 auVar14 [16];
  undefined1 auVar15 [16];
  undefined1 auVar16 [16];
  undefined1 auVar17 [16];
  uint uVar18;
  long lVar19;
  ulong uVar20;
  long *plVar21;
  long lVar22;
  long *plVar23;
  long *plVar24;
  long *plVar25;
  char *pcVar26;
  char *pcVar27;
  ulong uVar28;
  ulong uVar29;
  uint uVar30;
  uint uVar31;
  ulong *puVar32;
  char *pcVar33;
  ulong uVar34;
  long unaff_x19;
  long lVar35;
  char *pcVar36;
  ulong *puVar37;
  undefined1 auVar38 [16];
  
  if (param_1 != 0) {
    *(long *)(unaff_x19 + 0x10) = param_1 + -1;
    *(undefined8 *)(unaff_x19 + 0x20) =
         *(undefined8 *)(*(long *)(unaff_x19 + 8) + (param_1 + -1) * 8);
    return param_2;
  }
  auVar38 = func_0x0079db4c();
  plVar24 = auVar38._8_8_;
  plVar25 = auVar38._0_8_;
  if (((int)plVar24[2] != 0) || (*(int *)(param_4 + 0x10) != 0)) {
    func_0x0028f83c(3,0,0x6d,"/aws-lc/crypto/fipsmodule/bn/mul.c",0x20d);
    return (long *)0x0;
  }
  uVar6 = *(uint *)(plVar24 + 1);
  uVar7 = *(uint *)(param_4 + 8);
  if (uVar6 == 0 || uVar7 == 0) {
    *(undefined4 *)(plVar25 + 2) = 0;
    *(undefined4 *)(plVar25 + 1) = 0;
    return (long *)((long)&MACH_HEADER.magic + 1);
  }
  pcVar26 = param_4;
  pcVar27 = (char *)param_5;
  if ((char)param_5[5] == '\0') {
    uVar29 = param_5[4];
    uVar28 = param_5[2];
    if (uVar28 != param_5[3]) {
      uVar20 = param_5[1];
code_r0x002aba90:
      *(ulong *)(uVar20 + uVar28 * 8) = uVar29;
      param_5[2] = param_5[2] + 1;
      goto code_r0x002abaa0;
    }
    uVar34 = 0x20;
    if (uVar28 != 0) {
      uVar34 = uVar28 * 3 >> 1;
    }
    if ((uVar28 < uVar34 && uVar34 >> 0x3d == 0) &&
       (uVar20 = func_0x0036e48c(param_5[1],uVar34 << 3), uVar20 != 0)) {
      param_5[1] = uVar20;
      param_5[3] = uVar34;
      uVar28 = param_5[2];
      goto code_r0x002aba90;
    }
    *(undefined2 *)(param_5 + 5) = 0x101;
    if (plVar25 != plVar24) goto code_r0x002abaa8;
code_r0x002abab4:
    plVar21 = (long *)func_0x0029e340(param_5);
    plVar23 = (long *)0x0;
    if (plVar21 != (long *)0x0) goto code_r0x002abac4;
    goto code_r0x002abdfc;
  }
code_r0x002abaa0:
  if (plVar25 == plVar24) goto code_r0x002abab4;
code_r0x002abaa8:
  plVar21 = plVar25;
  if (plVar25 == (long *)param_4) goto code_r0x002abab4;
code_r0x002abac4:
  *(uint *)(plVar21 + 2) = *(uint *)(param_4 + 0x10) ^ *(uint *)(plVar24 + 2);
  if ((uVar6 == 8) && (uVar7 == 8)) {
    if (*(uint *)((long)plVar21 + 0xc) < 0x10) {
      if ((*(byte *)((long)plVar21 + 0x14) >> 1 & 1) == 0) {
        lVar22 = func_0x0036e358(0x10,8);
        plVar23 = (long *)0x0;
        if (lVar22 != 0) {
          if ((int)plVar21[1] != 0) {
            _memcpy(lVar22,*plVar21,(long)(int)plVar21[1] << 3);
          }
          func_0x0036e3d8(*plVar21);
          *plVar21 = lVar22;
          *(undefined4 *)((long)plVar21 + 0xc) = 0x10;
          goto code_r0x002abcc0;
        }
      }
      else {
        pcVar27 = "/aws-lc/crypto/fipsmodule/bn/bn.c";
        pcVar26 = section_00000068.sectname + 2;
        param_6 = section_00000158.sectname + 0xe;
        func_0x0028f83c(3,0);
        plVar23 = (long *)0x0;
      }
    }
    else {
      lVar22 = *plVar21;
code_r0x002abcc0:
      *(undefined4 *)(plVar21 + 1) = 0x10;
      pcVar26 = *(char **)param_4;
      func_0x002a8a84(lVar22,*plVar24);
joined_r0x002abdb4:
      if (plVar21 != plVar25) {
        plVar23 = (long *)func_0x0029afb8(plVar25,(long)(int)plVar21[1]);
        if ((int)plVar23 == 0) goto code_r0x002abdfc;
        if ((int)plVar21[1] == 0) {
          *(undefined4 *)(plVar25 + 1) = 0;
        }
        else {
          pcVar26 = (char *)((long)(int)plVar21[1] << 3);
          _memcpy(*plVar25,*plVar21);
          *(int *)(plVar25 + 1) = (int)plVar21[1];
        }
        *(int *)(plVar25 + 2) = (int)plVar21[2];
      }
      plVar23 = (long *)((long)&MACH_HEADER.magic + 1);
    }
code_r0x002abdfc:
    if ((char)param_5[5] != '\0') {
      return plVar23;
    }
    if (param_5[2] != 0) {
      uVar29 = param_5[2] - 1;
      param_5[2] = uVar29;
      param_5[4] = *(ulong *)(param_5[1] + uVar29 * 8);
      return plVar23;
    }
    func_0x0079db4c(plVar23);
code_r0x002abe44:
    func_0x0079e120();
code_r0x002abe48:
    auVar38 = func_0x0079e0f8();
    pcVar36 = pcVar26;
    pcVar33 = param_6;
  }
  else {
    pcVar36 = (char *)(long)(int)uVar6;
    pcVar33 = (char *)(long)(int)uVar7;
    iVar1 = uVar7 + uVar6;
    if ((0xf < (int)uVar6) && ((0xf < (int)uVar7 && ((uVar6 - uVar7) + 1 < 3)))) {
      uVar30 = 0x11;
      uVar31 = uVar7 >> 0x10;
      if (uVar7 >> 0x10 == 0) {
        uVar30 = 1;
        uVar31 = uVar7;
      }
      uVar29 = (ulong)uVar31;
      uVar28 = (ulong)(uVar31 >> 8);
      if (uVar29 < 0x100) {
        uVar28 = uVar29;
      }
      uVar20 = uVar28 >> 4;
      if (uVar28 < 0x10) {
        uVar20 = uVar28;
      }
      uVar34 = uVar20 >> 2;
      if (uVar20 < 4) {
        uVar34 = uVar20;
      }
      uVar31 = 0x11;
      uVar18 = uVar6 >> 0x10;
      if (uVar6 >> 0x10 == 0) {
        uVar31 = 1;
        uVar18 = uVar6;
      }
      uVar2 = (ulong)uVar18;
      uVar3 = (ulong)(uVar18 >> 8);
      if (uVar2 < 0x100) {
        uVar3 = uVar2;
      }
      uVar4 = uVar3 >> 4;
      if (uVar3 < 0x10) {
        uVar4 = uVar3;
      }
      uVar5 = uVar4 >> 2;
      if (uVar4 < 4) {
        uVar5 = uVar4;
      }
      uVar30 = uVar30 | (uint)(0xff < uVar29) << 3 | (uint)(0xf < uVar28) << 2 |
               (uint)(3 < uVar20) << 1;
      if ((uVar6 - uVar7 & 0x80000000) == 0) {
        uVar30 = uVar31 | (uint)(0xff < uVar2) << 3 | (uint)(0xf < uVar3) << 2 |
                 (uint)(3 < uVar4) << 1;
        uVar34 = uVar5;
      }
      if (1 < uVar34) {
        uVar30 = uVar30 + 1;
      }
      uVar30 = uVar30 - 1;
      uVar31 = 1 << (ulong)(uVar30 & 0x1f);
      puVar37 = (ulong *)(ulong)uVar31;
      if ((int)uVar6 < (int)uVar31 && (int)uVar7 < (int)uVar31) goto code_r0x002abe44;
      lVar22 = func_0x0029e340(param_5);
      plVar23 = (long *)0x0;
      if (lVar22 == 0) goto code_r0x002abdfc;
      if ((int)uVar6 <= (int)uVar31 && (int)uVar7 <= (int)uVar31) {
        plVar23 = (long *)func_0x0029afb8(lVar22,(long)(4 << (ulong)(uVar30 & 0x1f)));
        if (((int)plVar23 == 0) ||
           (plVar23 = (long *)func_0x0029afb8(plVar21,(long)(2 << (ulong)(uVar30 & 0x1f))),
           (int)plVar23 == 0)) goto code_r0x002abdfc;
        pcVar26 = *(char **)param_4;
        param_6 = (char *)(ulong)(uVar6 - uVar31);
        func_0x0030356c(*plVar21,*plVar24);
code_r0x002abda8:
        *(int *)(plVar21 + 1) = iVar1;
        pcVar27 = (char *)puVar37;
        goto joined_r0x002abdb4;
      }
      if ((int)uVar31 <= (int)uVar6 && (int)uVar31 <= (int)uVar7) {
        plVar23 = (long *)func_0x0029afb8(lVar22,(long)(8 << (ulong)(uVar30 & 0x1f)));
        if (((int)plVar23 != 0) &&
           (plVar23 = (long *)func_0x0029afb8(plVar21,(long)(4 << (ulong)(uVar30 & 0x1f))),
           (int)plVar23 != 0)) {
          pcVar26 = *(char **)param_4;
          param_6 = (char *)(ulong)(uVar6 - uVar31);
          func_0x00302eb8(*plVar21,*plVar24);
          goto code_r0x002abda8;
        }
        goto code_r0x002abdfc;
      }
      goto code_r0x002abe48;
    }
    plVar23 = (long *)func_0x0029afb8(plVar21,(long)iVar1);
    if ((int)plVar23 == 0) goto code_r0x002abdfc;
    *(int *)(plVar21 + 1) = iVar1;
    auVar38._8_8_ = *plVar24;
    auVar38._0_8_ = *plVar21;
    pcVar27 = *(char **)param_4;
  }
  plVar25 = auVar38._0_8_;
  puVar37 = auVar38._8_8_;
  pcVar26 = pcVar33;
  if (pcVar36 < pcVar33) {
    puVar37 = (ulong *)pcVar27;
    pcVar26 = pcVar36;
    pcVar27 = (char *)auVar38._8_8_;
    pcVar36 = pcVar33;
  }
  if (pcVar26 == (char *)0x0) {
    if (((ulong)pcVar36 & 0x1fffffffffffffff) == 0) {
      return plVar25;
    }
                    /* WARNING: Could not recover jumptable at 0x007b31b4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    plVar25 = (long *)(*(code *)PTR__bzero_00a24c68)(plVar25);
    return plVar25;
  }
  if (pcVar36 == (char *)0x0) {
    uVar29 = 0;
  }
  else {
    uVar28 = *(ulong *)pcVar27;
    plVar24 = plVar25;
    puVar32 = puVar37;
    pcVar33 = pcVar36;
    if ((long *)((long)&MACH_HEADER.magic + 3) < pcVar36) {
      uVar29 = 0;
      do {
        auVar8._8_8_ = 0;
        auVar8._0_8_ = *puVar32;
        auVar13._8_8_ = 0;
        auVar13._0_8_ = uVar28;
        uVar20 = SUB168(auVar8 * auVar13,8);
        uVar34 = *puVar32 * uVar28;
        if (CARRY8(uVar34,uVar29)) {
          uVar20 = uVar20 + 1;
        }
        *plVar24 = uVar34 + uVar29;
        auVar9._8_8_ = 0;
        auVar9._0_8_ = puVar32[1];
        auVar14._8_8_ = 0;
        auVar14._0_8_ = uVar28;
        uVar29 = SUB168(auVar9 * auVar14,8);
        uVar34 = puVar32[1] * uVar28;
        if (CARRY8(uVar34,uVar20)) {
          uVar29 = uVar29 + 1;
        }
        plVar24[1] = uVar34 + uVar20;
        auVar10._8_8_ = 0;
        auVar10._0_8_ = puVar32[2];
        auVar15._8_8_ = 0;
        auVar15._0_8_ = uVar28;
        uVar20 = SUB168(auVar10 * auVar15,8);
        uVar34 = puVar32[2] * uVar28;
        if (CARRY8(uVar34,uVar29)) {
          uVar20 = uVar20 + 1;
        }
        plVar24[2] = uVar34 + uVar29;
        auVar11._8_8_ = 0;
        auVar11._0_8_ = puVar32[3];
        auVar16._8_8_ = 0;
        auVar16._0_8_ = uVar28;
        uVar29 = SUB168(auVar11 * auVar16,8);
        uVar34 = puVar32[3] * uVar28;
        if (CARRY8(uVar34,uVar20)) {
          uVar29 = uVar29 + 1;
        }
        plVar24[3] = uVar34 + uVar20;
        puVar32 = puVar32 + 4;
        plVar24 = plVar24 + 4;
        pcVar33 = pcVar33 + -4;
      } while ((long *)((long)&MACH_HEADER.magic + 3) < pcVar33);
      uVar20 = uVar29;
      if (pcVar33 == (char *)0x0) goto code_r0x002abf80;
    }
    else {
      uVar20 = 0;
    }
    do {
      auVar12._8_8_ = 0;
      auVar12._0_8_ = uVar28;
      auVar17._8_8_ = 0;
      auVar17._0_8_ = *puVar32;
      uVar29 = SUB168(auVar12 * auVar17,8);
      uVar34 = uVar28 * *puVar32;
      if (CARRY8(uVar34,uVar20)) {
        uVar29 = uVar29 + 1;
      }
      *plVar24 = uVar34 + uVar20;
      pcVar33 = pcVar33 + -1;
      plVar24 = plVar24 + 1;
      puVar32 = puVar32 + 1;
      uVar20 = uVar29;
    } while (pcVar33 != (char *)0x0);
  }
code_r0x002abf80:
  plVar25[(long)pcVar36] = uVar29;
  plVar24 = plVar25;
  if ((long *)pcVar26 != (long *)((long)&MACH_HEADER.magic + 1)) {
    lVar22 = 4 - (long)pcVar26;
    lVar19 = (long)pcVar36 * 8 + 0x20;
    lVar35 = 0;
    do {
      plVar24 = (long *)func_0x002a890c((long)plVar25 + lVar35 + 8,puVar37,pcVar36,
                                        *(undefined8 *)((long)pcVar27 + lVar35 + 8));
      *(long **)((long)plVar25 + lVar35 + lVar19 + -0x18) = plVar24;
      if (lVar22 == 2) {
        return plVar24;
      }
      plVar24 = (long *)func_0x002a890c((long)plVar25 + lVar35 + 0x10,puVar37,pcVar36,
                                        *(undefined8 *)((long)pcVar27 + lVar35 + 0x10));
      *(long **)((long)plVar25 + lVar35 + lVar19 + -0x10) = plVar24;
      if (lVar22 == 1) {
        return plVar24;
      }
      plVar24 = (long *)func_0x002a890c((long)plVar25 + lVar35 + 0x18,puVar37,pcVar36,
                                        *(undefined8 *)((long)pcVar27 + lVar35 + 0x18));
      *(long **)((long)plVar25 + lVar35 + lVar19 + -8) = plVar24;
      if (lVar22 == 0) {
        return plVar24;
      }
      plVar24 = (long *)func_0x002a890c(lVar35 + 0x20 + (long)plVar25,puVar37,pcVar36,
                                        *(undefined8 *)((long)pcVar27 + lVar35 + 0x20));
      *(long **)((long)plVar25 + lVar35 + lVar19) = plVar24;
      lVar22 = lVar22 + 4;
      lVar35 = lVar35 + 0x20;
    } while (lVar22 != 3);
  }
  return plVar24;
}

