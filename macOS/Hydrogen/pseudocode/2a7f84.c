
/* WARNING: Possible PIC construction at 0x002abd0c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x002abd10) */
/* WARNING: Removing unreachable block (ram,0x002abd18) */

long * FUN_002a7f84(ulong param_1,undefined8 param_2,undefined8 param_3,char *param_4,char *param_5,
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
  char *pcVar18;
  uint uVar19;
  bool in_ZR;
  long lVar20;
  char *pcVar21;
  long *plVar22;
  long lVar23;
  long *plVar24;
  long *plVar25;
  long *plVar26;
  char *pcVar27;
  ulong uVar28;
  uint uVar29;
  uint uVar30;
  ulong uVar31;
  char *pcVar32;
  ulong uVar33;
  ulong uVar34;
  char *unaff_x19;
  char *unaff_x20;
  char *unaff_x21;
  char *unaff_x22;
  undefined8 unaff_x23;
  long lVar35;
  char *pcVar36;
  char *pcVar37;
  undefined1 auVar38 [16];
  undefined8 uStack0000000000000008;
  
  if (in_ZR) {
    uVar28 = 0x20;
    if (param_1 != 0) {
      uVar28 = param_1 * 3 >> 1;
    }
    if ((param_1 < uVar28 && uVar28 >> 0x3d == 0) &&
       (lVar20 = func_0x0036e48c(*(long *)(unaff_x19 + 8),uVar28 << 3), lVar20 != 0)) {
      *(long *)(unaff_x19 + 8) = lVar20;
      *(ulong *)(unaff_x19 + 0x18) = uVar28;
      param_1 = *(ulong *)(unaff_x19 + 0x10);
      goto LAB_002a7fd0;
    }
    *(undefined2 *)(unaff_x19 + 0x28) = 0x101;
    pcVar21 = (char *)func_0x0029e340();
    if (pcVar21 != (char *)0x0) goto code_r0x002a7fec;
    plVar22 = (long *)0x0;
  }
  else {
    lVar20 = *(long *)(unaff_x19 + 8);
LAB_002a7fd0:
    *(undefined8 *)(lVar20 + param_1 * 8) = unaff_x23;
    *(long *)(unaff_x19 + 0x10) = *(long *)(unaff_x19 + 0x10) + 1;
    pcVar21 = (char *)func_0x0029e340();
    plVar22 = (long *)0x0;
    if (pcVar21 != (char *)0x0) {
code_r0x002a7fec:
      if ((*(int *)(unaff_x22 + 0x10) == 0) && (*(int *)(unaff_x21 + 0x10) == 0)) {
        param_4 = unaff_x21;
        param_5 = unaff_x19;
        plVar22 = (long *)func_0x002ab9dc();
        if (((int)plVar22 != 0) &&
           (param_6 = unaff_x19,
           plVar22 = (long *)func_0x002a7034(pcVar21,(long)&uStack0000000000000008 + 4),
           param_4 = unaff_x22, param_5 = unaff_x21, (int)plVar22 != 0)) {
          param_6 = (char *)0x0;
          plVar22 = (long *)func_0x0029f764();
          param_4 = unaff_x20;
          param_5 = pcVar21;
          if ((int)plVar22 != 0) {
            param_4 = (char *)(ulong)uStack0000000000000008._4_4_;
            param_5 = unaff_x19;
            plVar22 = (long *)func_0x002a8144();
          }
        }
      }
      else {
        param_5 = "/aws-lc/crypto/fipsmodule/bn/mul.c";
        param_4 = section_00000068.sectname + 5;
        param_6 = section_000001f8.segname + 5;
        func_0x0028f83c(3,0);
        plVar22 = (long *)0x0;
      }
    }
  }
  if ((char)*(long *)(unaff_x19 + 0x28) != '\0') {
    return plVar22;
  }
  if (*(long *)(unaff_x19 + 0x10) != 0) {
    lVar20 = *(long *)(unaff_x19 + 0x10) + -1;
    *(long *)(unaff_x19 + 0x10) = lVar20;
    *(long *)(unaff_x19 + 0x20) = *(long *)(*(long *)(unaff_x19 + 8) + lVar20 * 8);
    return plVar22;
  }
  auVar38 = func_0x0079db4c(plVar22);
  plVar26 = auVar38._8_8_;
  plVar22 = auVar38._0_8_;
  if (((int)plVar26[2] != 0) || (*(int *)(param_4 + 0x10) != 0)) {
    func_0x0028f83c(3,0,0x6d,"/aws-lc/crypto/fipsmodule/bn/mul.c",0x20d);
    return (long *)0x0;
  }
  uVar6 = *(uint *)(plVar26 + 1);
  uVar7 = *(uint *)(param_4 + 8);
  if (uVar6 == 0 || uVar7 == 0) {
    *(undefined4 *)(plVar22 + 2) = 0;
    *(undefined4 *)(plVar22 + 1) = 0;
    return (long *)((long)&MACH_HEADER.magic + 1);
  }
  pcVar27 = param_4;
  pcVar21 = param_5;
  if ((char)*(long *)(param_5 + 0x28) == '\0') {
    lVar20 = *(long *)(param_5 + 0x20);
    uVar28 = *(ulong *)(param_5 + 0x10);
    if (uVar28 != *(ulong *)(param_5 + 0x18)) {
      lVar23 = *(long *)(param_5 + 8);
code_r0x002aba90:
      *(long *)(lVar23 + uVar28 * 8) = lVar20;
      *(long *)(param_5 + 0x10) = *(long *)(param_5 + 0x10) + 1;
      goto code_r0x002abaa0;
    }
    uVar31 = 0x20;
    if (uVar28 != 0) {
      uVar31 = uVar28 * 3 >> 1;
    }
    if ((uVar28 < uVar31 && uVar31 >> 0x3d == 0) &&
       (lVar23 = func_0x0036e48c(*(long *)(param_5 + 8),uVar31 << 3), lVar23 != 0)) {
      *(long *)(param_5 + 8) = lVar23;
      *(ulong *)(param_5 + 0x18) = uVar31;
      uVar28 = *(ulong *)(param_5 + 0x10);
      goto code_r0x002aba90;
    }
    *(undefined2 *)(param_5 + 0x28) = 0x101;
    if (plVar22 != plVar26) goto code_r0x002abaa8;
code_r0x002abab4:
    plVar24 = (long *)func_0x0029e340(param_5);
    plVar25 = (long *)0x0;
    if (plVar24 != (long *)0x0) goto code_r0x002abac4;
    goto code_r0x002abdfc;
  }
code_r0x002abaa0:
  if (plVar22 == plVar26) goto code_r0x002abab4;
code_r0x002abaa8:
  plVar24 = plVar22;
  if (plVar22 == (long *)param_4) goto code_r0x002abab4;
code_r0x002abac4:
  *(uint *)(plVar24 + 2) = *(uint *)(param_4 + 0x10) ^ *(uint *)(plVar26 + 2);
  if ((uVar6 == 8) && (uVar7 == 8)) {
    if (*(uint *)((long)plVar24 + 0xc) < 0x10) {
      if ((*(byte *)((long)plVar24 + 0x14) >> 1 & 1) == 0) {
        lVar20 = func_0x0036e358(0x10,8);
        plVar25 = (long *)0x0;
        if (lVar20 != 0) {
          if ((int)plVar24[1] != 0) {
            _memcpy(lVar20,*plVar24,(long)(int)plVar24[1] << 3);
          }
          func_0x0036e3d8(*plVar24);
          *plVar24 = lVar20;
          *(undefined4 *)((long)plVar24 + 0xc) = 0x10;
          goto code_r0x002abcc0;
        }
      }
      else {
        pcVar21 = "/aws-lc/crypto/fipsmodule/bn/bn.c";
        pcVar27 = section_00000068.sectname + 2;
        param_6 = section_00000158.sectname + 0xe;
        func_0x0028f83c(3,0);
        plVar25 = (long *)0x0;
      }
    }
    else {
      lVar20 = *plVar24;
code_r0x002abcc0:
      *(undefined4 *)(plVar24 + 1) = 0x10;
      pcVar27 = *(char **)param_4;
      func_0x002a8a84(lVar20,*plVar26);
joined_r0x002abdb4:
      if (plVar24 != plVar22) {
        plVar25 = (long *)func_0x0029afb8(plVar22,(long)(int)plVar24[1]);
        if ((int)plVar25 == 0) goto code_r0x002abdfc;
        if ((int)plVar24[1] == 0) {
          *(undefined4 *)(plVar22 + 1) = 0;
        }
        else {
          pcVar27 = (char *)((long)(int)plVar24[1] << 3);
          _memcpy(*plVar22,*plVar24);
          *(int *)(plVar22 + 1) = (int)plVar24[1];
        }
        *(int *)(plVar22 + 2) = (int)plVar24[2];
      }
      plVar25 = (long *)((long)&MACH_HEADER.magic + 1);
    }
code_r0x002abdfc:
    if ((char)*(long *)(param_5 + 0x28) != '\0') {
      return plVar25;
    }
    if (*(long *)(param_5 + 0x10) != 0) {
      lVar20 = *(long *)(param_5 + 0x10) + -1;
      *(long *)(param_5 + 0x10) = lVar20;
      *(long *)(param_5 + 0x20) = *(long *)(*(long *)(param_5 + 8) + lVar20 * 8);
      return plVar25;
    }
    func_0x0079db4c(plVar25);
code_r0x002abe44:
    func_0x0079e120();
code_r0x002abe48:
    auVar38 = func_0x0079e0f8();
    pcVar36 = pcVar27;
    pcVar37 = param_6;
  }
  else {
    pcVar36 = (char *)(long)(int)uVar6;
    pcVar37 = (char *)(long)(int)uVar7;
    iVar1 = uVar7 + uVar6;
    if ((0xf < (int)uVar6) && ((0xf < (int)uVar7 && ((uVar6 - uVar7) + 1 < 3)))) {
      uVar29 = 0x11;
      uVar30 = uVar7 >> 0x10;
      if (uVar7 >> 0x10 == 0) {
        uVar29 = 1;
        uVar30 = uVar7;
      }
      uVar28 = (ulong)uVar30;
      uVar31 = (ulong)(uVar30 >> 8);
      if (uVar28 < 0x100) {
        uVar31 = uVar28;
      }
      uVar34 = uVar31 >> 4;
      if (uVar31 < 0x10) {
        uVar34 = uVar31;
      }
      uVar33 = uVar34 >> 2;
      if (uVar34 < 4) {
        uVar33 = uVar34;
      }
      uVar30 = 0x11;
      uVar19 = uVar6 >> 0x10;
      if (uVar6 >> 0x10 == 0) {
        uVar30 = 1;
        uVar19 = uVar6;
      }
      uVar2 = (ulong)uVar19;
      uVar3 = (ulong)(uVar19 >> 8);
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
      uVar29 = uVar29 | (uint)(0xff < uVar28) << 3 | (uint)(0xf < uVar31) << 2 |
               (uint)(3 < uVar34) << 1;
      if ((uVar6 - uVar7 & 0x80000000) == 0) {
        uVar29 = uVar30 | (uint)(0xff < uVar2) << 3 | (uint)(0xf < uVar3) << 2 |
                 (uint)(3 < uVar4) << 1;
        uVar33 = uVar5;
      }
      if (1 < uVar33) {
        uVar29 = uVar29 + 1;
      }
      uVar29 = uVar29 - 1;
      uVar30 = 1 << (ulong)(uVar29 & 0x1f);
      pcVar36 = (char *)(ulong)uVar30;
      if ((int)uVar6 < (int)uVar30 && (int)uVar7 < (int)uVar30) goto code_r0x002abe44;
      lVar20 = func_0x0029e340(param_5);
      plVar25 = (long *)0x0;
      if (lVar20 == 0) goto code_r0x002abdfc;
      if ((int)uVar6 <= (int)uVar30 && (int)uVar7 <= (int)uVar30) {
        plVar25 = (long *)func_0x0029afb8(lVar20,(long)(4 << (ulong)(uVar29 & 0x1f)));
        if (((int)plVar25 == 0) ||
           (plVar25 = (long *)func_0x0029afb8(plVar24,(long)(2 << (ulong)(uVar29 & 0x1f))),
           (int)plVar25 == 0)) goto code_r0x002abdfc;
        pcVar27 = *(char **)param_4;
        param_6 = (char *)(ulong)(uVar6 - uVar30);
        func_0x0030356c(*plVar24,*plVar26);
code_r0x002abda8:
        *(int *)(plVar24 + 1) = iVar1;
        pcVar21 = pcVar36;
        goto joined_r0x002abdb4;
      }
      if ((int)uVar30 <= (int)uVar6 && (int)uVar30 <= (int)uVar7) {
        plVar25 = (long *)func_0x0029afb8(lVar20,(long)(8 << (ulong)(uVar29 & 0x1f)));
        if (((int)plVar25 != 0) &&
           (plVar25 = (long *)func_0x0029afb8(plVar24,(long)(4 << (ulong)(uVar29 & 0x1f))),
           (int)plVar25 != 0)) {
          pcVar27 = *(char **)param_4;
          param_6 = (char *)(ulong)(uVar6 - uVar30);
          func_0x00302eb8(*plVar24,*plVar26);
          goto code_r0x002abda8;
        }
        goto code_r0x002abdfc;
      }
      goto code_r0x002abe48;
    }
    plVar25 = (long *)func_0x0029afb8(plVar24,(long)iVar1);
    if ((int)plVar25 == 0) goto code_r0x002abdfc;
    *(int *)(plVar24 + 1) = iVar1;
    auVar38._8_8_ = *plVar26;
    auVar38._0_8_ = *plVar24;
    pcVar21 = *(char **)param_4;
  }
  plVar22 = auVar38._0_8_;
  pcVar27 = auVar38._8_8_;
  pcVar18 = pcVar37;
  if (pcVar36 < pcVar37) {
    pcVar27 = pcVar21;
    pcVar18 = pcVar36;
    pcVar21 = auVar38._8_8_;
    pcVar36 = pcVar37;
  }
  if (pcVar18 == (char *)0x0) {
    if (((ulong)pcVar36 & 0x1fffffffffffffff) == 0) {
      return plVar22;
    }
                    /* WARNING: Could not recover jumptable at 0x007b31b4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    plVar22 = (long *)(*(code *)PTR__bzero_00a24c68)(plVar22);
    return plVar22;
  }
  if (pcVar36 == (char *)0x0) {
    uVar28 = 0;
  }
  else {
    uVar31 = *(ulong *)pcVar21;
    plVar26 = plVar22;
    pcVar37 = pcVar27;
    pcVar32 = pcVar36;
    if ((long *)((long)&MACH_HEADER.magic + 3) < pcVar36) {
      uVar28 = 0;
      do {
        auVar8._8_8_ = 0;
        auVar8._0_8_ = *(ulong *)pcVar37;
        auVar13._8_8_ = 0;
        auVar13._0_8_ = uVar31;
        uVar34 = SUB168(auVar8 * auVar13,8);
        uVar33 = *(ulong *)pcVar37 * uVar31;
        if (CARRY8(uVar33,uVar28)) {
          uVar34 = uVar34 + 1;
        }
        *plVar26 = uVar33 + uVar28;
        auVar9._8_8_ = 0;
        auVar9._0_8_ = *(ulong *)(pcVar37 + 8);
        auVar14._8_8_ = 0;
        auVar14._0_8_ = uVar31;
        uVar28 = SUB168(auVar9 * auVar14,8);
        uVar33 = *(ulong *)(pcVar37 + 8) * uVar31;
        if (CARRY8(uVar33,uVar34)) {
          uVar28 = uVar28 + 1;
        }
        plVar26[1] = uVar33 + uVar34;
        auVar10._8_8_ = 0;
        auVar10._0_8_ = *(ulong *)(pcVar37 + 0x10);
        auVar15._8_8_ = 0;
        auVar15._0_8_ = uVar31;
        uVar34 = SUB168(auVar10 * auVar15,8);
        uVar33 = *(ulong *)(pcVar37 + 0x10) * uVar31;
        if (CARRY8(uVar33,uVar28)) {
          uVar34 = uVar34 + 1;
        }
        plVar26[2] = uVar33 + uVar28;
        auVar11._8_8_ = 0;
        auVar11._0_8_ = *(ulong *)(pcVar37 + 0x18);
        auVar16._8_8_ = 0;
        auVar16._0_8_ = uVar31;
        uVar28 = SUB168(auVar11 * auVar16,8);
        uVar33 = *(ulong *)(pcVar37 + 0x18) * uVar31;
        if (CARRY8(uVar33,uVar34)) {
          uVar28 = uVar28 + 1;
        }
        plVar26[3] = uVar33 + uVar34;
        pcVar37 = pcVar37 + 0x20;
        plVar26 = plVar26 + 4;
        pcVar32 = pcVar32 + -4;
      } while ((long *)((long)&MACH_HEADER.magic + 3) < pcVar32);
      uVar34 = uVar28;
      if (pcVar32 == (char *)0x0) goto code_r0x002abf80;
    }
    else {
      uVar34 = 0;
    }
    do {
      auVar12._8_8_ = 0;
      auVar12._0_8_ = uVar31;
      auVar17._8_8_ = 0;
      auVar17._0_8_ = *(ulong *)pcVar37;
      uVar28 = SUB168(auVar12 * auVar17,8);
      uVar33 = uVar31 * *(ulong *)pcVar37;
      if (CARRY8(uVar33,uVar34)) {
        uVar28 = uVar28 + 1;
      }
      *plVar26 = uVar33 + uVar34;
      pcVar32 = pcVar32 + -1;
      plVar26 = plVar26 + 1;
      pcVar37 = pcVar37 + 8;
      uVar34 = uVar28;
    } while (pcVar32 != (char *)0x0);
  }
code_r0x002abf80:
  plVar22[(long)pcVar36] = uVar28;
  plVar26 = plVar22;
  if ((long *)pcVar18 != (long *)((long)&MACH_HEADER.magic + 1)) {
    lVar20 = 4 - (long)pcVar18;
    lVar23 = (long)pcVar36 * 8 + 0x20;
    lVar35 = 0;
    do {
      plVar26 = (long *)func_0x002a890c((long)plVar22 + lVar35 + 8,pcVar27,pcVar36,
                                        *(undefined8 *)(pcVar21 + lVar35 + 8));
      *(long **)((long)plVar22 + lVar35 + lVar23 + -0x18) = plVar26;
      if (lVar20 == 2) {
        return plVar26;
      }
      plVar26 = (long *)func_0x002a890c((long)plVar22 + lVar35 + 0x10,pcVar27,pcVar36,
                                        *(undefined8 *)(pcVar21 + lVar35 + 0x10));
      *(long **)((long)plVar22 + lVar35 + lVar23 + -0x10) = plVar26;
      if (lVar20 == 1) {
        return plVar26;
      }
      plVar26 = (long *)func_0x002a890c((long)plVar22 + lVar35 + 0x18,pcVar27,pcVar36,
                                        *(undefined8 *)(pcVar21 + lVar35 + 0x18));
      *(long **)((long)plVar22 + lVar35 + lVar23 + -8) = plVar26;
      if (lVar20 == 0) {
        return plVar26;
      }
      plVar26 = (long *)func_0x002a890c(lVar35 + 0x20 + (long)plVar22,pcVar27,pcVar36,
                                        *(undefined8 *)(pcVar21 + lVar35 + 0x20));
      *(long **)((long)plVar22 + lVar35 + lVar23) = plVar26;
      lVar20 = lVar20 + 4;
      lVar35 = lVar35 + 0x20;
    } while (lVar20 != 3);
  }
  return plVar26;
}

