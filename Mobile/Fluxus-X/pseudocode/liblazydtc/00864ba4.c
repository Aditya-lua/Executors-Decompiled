/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00864ba4
 */

/* WARNING: Removing unreachable block (ram,0x00864f4c) */
/* WARNING: Removing unreachable block (ram,0x00864f8c) */

void FUN_00864ba4(undefined8 *param_1,long param_2,undefined8 param_3)

{
  long *plVar1;
  long lVar2;
  byte bVar3;
  undefined4 uVar4;
  char cVar5;
  long lVar6;
  undefined8 *puVar7;
  long *plVar8;
  long lVar9;
  int iVar10;
  long lVar11;
  char *__s1;
  undefined8 uVar12;
  ulong uVar13;
  ulong uVar14;
  long lVar15;
  undefined8 *puVar16;
  long lVar17;
  ulong uVar18;
  long lVar19;
  long lVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 *puVar24;
  ulong uVar25;
  long lVar26;
  byte bVar27;
  long lVar28;
  undefined8 uVar29;
  undefined8 uVar30;
  undefined8 uVar31;
  long local_158;
  undefined8 *local_120;
  long lStack_118;
  ulong local_110;
  ulong uStack_108;
  long local_100;
  long lStack_f8;
  long local_f0;
  long *local_e8;
  long lStack_e0;
  long local_d8;
  int local_cc;
  undefined8 local_c8;
  undefined8 local_c0;
  undefined8 uStack_b8;
  undefined8 local_b0;
  undefined8 uStack_a8;
  ulong local_a0;
  undefined8 uStack_98;
  ulong local_90;
  ulong local_88;
  long lStack_80;
  undefined1 local_78;
  undefined7 uStack_77;
  long local_70;
  
  lVar6 = tpidr_el0;
  local_70 = *(long *)(lVar6 + 0x28);
  uStack_98 = *(undefined8 *)(param_2 + 0x9c);
  local_a0 = *(ulong *)(param_2 + 0x94);
  FUN_00858f2c();
  if (*(int *)(param_2 + 0x90) == 0x119) {
    uVar21 = *(undefined8 *)(param_2 + 0xa8);
    uVar23 = *(undefined8 *)(param_2 + 0x94);
    uVar22 = *(undefined8 *)(param_2 + 0x9c);
    FUN_00858f2c(param_2);
    local_c8 = *(undefined8 *)(param_2 + 0x94);
  }
  else {
    FUN_0086e040(param_2,"function name");
    local_c8 = *(undefined8 *)(param_2 + 0x94);
    uVar21 = *(undefined8 *)(param_2 + 0x138);
    uVar22 = local_c8;
    uVar23 = local_c8;
  }
  local_cc = *(int *)(param_2 + 0x90);
  local_b0 = 0;
  uStack_a8 = 0;
  local_c0 = 0;
  uStack_b8 = 0;
  if (local_cc == 0x28) {
    FUN_00858f2c(param_2);
  }
  else {
    FUN_0086e3b4(param_2,0x28,"function parameter list start");
  }
  local_d8 = 0;
  lStack_e0 = (*(long *)(param_2 + 0x308) - *(long *)(param_2 + 0x300) >> 4) * -0x5555555555555555;
  local_e8 = (long *)(param_2 + 0x300);
  if (*(int *)(param_2 + 0x90) == 0x29) {
    local_158 = 0;
    bVar27 = 0;
LAB_00864cec:
                    /* try { // try from 00864cec to 00864d1b has its CatchHandler @ 0086528c */
    FUN_00858f2c(param_2);
  }
  else {
                    /* try { // try from 00864cb0 to 00864cd3 has its CatchHandler @ 0086522c */
    FUN_008614c0(&local_90,param_2,&local_e8,1,0,0,0,0);
    bVar27 = (byte)local_90;
    local_158 = CONCAT71(uStack_77,local_78);
    if (*(int *)(param_2 + 0x90) == 0x29) goto LAB_00864cec;
    FUN_0086b5f8(param_2,0x29,&local_cc,0);
    FUN_0086e434(param_2,0x29);
  }
  if (*(int *)(param_2 + 0x90) == 0x3a) {
LAB_00864d44:
    FUN_00858f2c(param_2);
    uVar4 = *(undefined4 *)(param_2 + 0x124);
    lVar11 = FUN_008665f0(param_2);
    if (*(int *)(param_2 + 0x90) == 0x2c) {
      FUN_00860ecc(param_2,param_2 + 0x94,
                   "Expected a statement, got \',\'; did you forget to wrap the list of return types in parentheses?"
                  );
      FUN_00858f2c(param_2);
    }
    *(undefined4 *)(param_2 + 0x124) = uVar4;
    if (lVar11 == 0) goto LAB_00864d8c;
  }
  else {
    if (*(int *)(param_2 + 0x90) == 0x107) {
                    /* try { // try from 00864d30 to 00864d83 has its CatchHandler @ 00865290 */
      FUN_00860ecc(param_2,param_2 + 0x94,
                   "Function return type annotations are written after \':\' instead of \'->\'");
      goto LAB_00864d44;
    }
LAB_00864d8c:
                    /* try { // try from 00864d90 to 00864daf has its CatchHandler @ 00865288 */
    lVar11 = FUN_0084e938(*(undefined8 *)(param_2 + 0xe8),0x38);
    local_90 = 0;
    local_88 = 0;
    lStack_80 = 0;
    FUN_00851204(lVar11,param_2 + 0x94,&local_90);
  }
  lVar9 = local_d8;
  lVar17 = lStack_e0;
  plVar8 = local_e8;
  lVar15 = param_2 + 0x438;
  lVar19 = *(long *)(param_2 + 0x368);
  lVar26 = *(long *)(param_2 + 0x440) - *(long *)(param_2 + 0x438);
  lVar28 = *(long *)(param_2 + 0x360);
  lStack_f8 = lVar26 >> 5;
  uVar14 = *(ulong *)(param_2 + 0xb8);
  local_f0 = 0;
  local_100 = lVar15;
  if (local_d8 != 0) {
    puVar24 = (undefined8 *)(*local_e8 + lStack_e0 * 0x30);
    __s1 = (char *)*puVar24;
    if (((__s1 != (char *)0x0) && (iVar10 = strcmp(__s1,"self"), iVar10 == 0)) && (puVar24[3] == 0))
    {
      uVar25 = lVar9 - 1;
      plVar1 = (long *)(param_2 + 0x360);
      if (uVar25 == 0) {
        lVar20 = 0;
        uVar25 = 0;
      }
      else {
        lVar17 = lVar17 * 0x30;
        lVar2 = 1;
        do {
          lVar20 = lVar2;
          lVar2 = *plVar8 + lVar17;
          uStack_108 = *(long *)(lVar2 + 0x40);
          local_110 = *(ulong *)(lVar2 + 0x38);
          local_90 = *(ulong *)(lVar2 + 0x30);
          local_78 = 1;
                    /* try { // try from 00865040 to 0086504b has its CatchHandler @ 00865238 */
          local_88 = local_110;
          lStack_80 = uStack_108;
          FUN_00871bec(lVar15,&local_90);
          local_f0 = lVar20;
          if (*(long *)(*plVar8 + lVar17 + 0x48) == 0) {
            local_110 = 0;
            uStack_108 = 0;
            local_90 = local_a0;
                    /* try { // try from 00865070 to 00865097 has its CatchHandler @ 00865234 */
            local_88 = uVar14;
            local_120 = (undefined8 *)
                        FUN_008653a4(param_2,&local_90,&local_110,
                                     "All declaration parameters aside from \'self\' must be annotated"
                                    );
            FUN_00871cec(plVar1,&local_120);
          }
          else {
                    /* try { // try from 00865000 to 00865007 has its CatchHandler @ 00865230 */
            FUN_00871cec(plVar1);
          }
          lVar17 = lVar17 + 0x30;
          lVar2 = lVar20 + 1;
        } while (lVar9 != lVar20 + 1);
      }
      bVar3 = 0;
      if (local_158 == 0) {
        bVar3 = bVar27;
      }
      if ((bVar3 & 1) != 0) {
                    /* try { // try from 008650bc to 008650cf has its CatchHandler @ 00865220 */
        FUN_00860ecc(param_2,&local_a0,
                     "All declaration parameters aside from \'self\' must be annotated");
      }
      uVar12 = *(undefined8 *)(param_2 + 0xe8);
      local_110 = local_a0;
      uStack_108 = uVar14;
      if (uVar25 == 0) {
        local_90 = 0;
      }
      else {
        lVar15 = *plVar1;
                    /* try { // try from 008650f4 to 008650f7 has its CatchHandler @ 00865224 */
        local_90 = FUN_0084e938(uVar12,uVar25 << 3);
        if ((uVar25 < 8) || ((lVar28 + local_90) - (lVar15 + lVar19) < 0x20)) {
          uVar13 = 0;
        }
        else {
          uVar13 = uVar25 & 0xfffffffffffffffc;
          puVar24 = (undefined8 *)(local_90 + 0x10);
          puVar16 = (undefined8 *)((lVar19 - lVar28) + lVar15 + 0x10);
          uVar18 = uVar13;
          do {
            puVar7 = puVar16 + -1;
            uVar29 = puVar16[-2];
            uVar31 = puVar16[1];
            uVar30 = *puVar16;
            uVar18 = uVar18 - 4;
            puVar16 = puVar16 + 4;
            puVar24[-1] = *puVar7;
            puVar24[-2] = uVar29;
            puVar24[1] = uVar31;
            *puVar24 = uVar30;
            puVar24 = puVar24 + 4;
          } while (uVar18 != 0);
          if (uVar25 == uVar13) goto LAB_00865148;
        }
        lVar17 = uVar25 - uVar13;
        puVar24 = (undefined8 *)(lVar15 + ((lVar19 + uVar13 * 8) - lVar28));
        puVar16 = (undefined8 *)(local_90 + uVar13 * 8);
        do {
          lVar17 = lVar17 + -1;
          *puVar16 = *puVar24;
          puVar24 = puVar24 + 1;
          puVar16 = puVar16 + 1;
        } while (lVar17 != 0);
      }
LAB_00865148:
      lStack_80 = local_158;
      local_88 = uVar25;
      if (lVar20 == 0) {
        local_120 = (undefined8 *)0x0;
      }
      else {
        lVar15 = *(long *)(param_2 + 0x438);
                    /* try { // try from 00865160 to 008651b7 has its CatchHandler @ 00865228 */
        local_120 = (undefined8 *)FUN_0084e938(*(undefined8 *)(param_2 + 0xe8),lVar20 << 5);
        puVar24 = (undefined8 *)(lVar15 + lVar26);
        puVar16 = local_120;
        lVar15 = lVar20;
        do {
          uVar31 = *puVar24;
          uVar30 = puVar24[3];
          uVar29 = puVar24[2];
          lVar15 = lVar15 + -1;
          puVar16[1] = puVar24[1];
          *puVar16 = uVar31;
          puVar16[3] = uVar30;
          puVar16[2] = uVar29;
          puVar24 = puVar24 + 4;
          puVar16 = puVar16 + 4;
        } while (lVar15 != 0);
      }
      lStack_118 = lVar20;
      uVar12 = FUN_0084e938(uVar12,0x80);
      FUN_00850d14(uVar12,&local_110,param_3,&local_b0,&local_c0,&local_90,&local_120,lVar11);
      param_1[2] = uVar22;
      param_1[3] = uVar12;
      *(undefined1 *)(param_1 + 4) = 1;
      *param_1 = uVar21;
      param_1[1] = uVar23;
      *(ulong *)((long)param_1 + 0x2c) = uVar14;
      *(ulong *)((long)param_1 + 0x24) = local_a0;
      goto LAB_00864e80;
    }
  }
  local_110 = 0;
  uStack_108 = 0;
  *param_1 = uVar21;
  param_1[1] = uVar23;
  param_1[2] = uVar22;
  local_90 = local_a0;
                    /* try { // try from 00864e4c to 00864e63 has its CatchHandler @ 0086523c */
  local_88 = uVar14;
  uVar22 = FUN_008653a4(param_2,&local_90,&local_110,
                        "\'self\' must be present as the unannotated first parameter");
  *(undefined1 *)(param_1 + 4) = 1;
  param_1[3] = uVar22;
  *(undefined8 *)((long)param_1 + 0x2c) = 0;
  *(undefined8 *)((long)param_1 + 0x24) = 0;
LAB_00864e80:
  *(undefined4 *)((long)param_1 + 0x34) = 3;
  lVar11 = *(long *)(param_2 + 0x438);
  lVar15 = *(long *)(param_2 + 0x440);
  if (lVar26 + lVar11 != lVar15) {
    lVar17 = lVar11 + lVar26;
    if (lVar17 + (lVar15 - (lVar26 + lVar11)) != lVar15) {
      lVar17 = lVar15 - lVar11;
      do {
        puVar24 = (undefined8 *)(lVar11 + lVar26);
        puVar16 = (undefined8 *)(lVar11 + lVar17);
        cVar5 = *(char *)(puVar24 + 3);
        if (cVar5 == *(char *)(puVar16 + 3)) {
          if (cVar5 != '\0') {
            puVar24 = (undefined8 *)(lVar11 + lVar17);
            puVar16 = (undefined8 *)(lVar11 + lVar26);
            *puVar16 = *puVar24;
            uVar22 = puVar24[1];
            puVar16[2] = puVar24[2];
            puVar16[1] = uVar22;
          }
        }
        else if (cVar5 == '\0') {
          uVar22 = puVar16[2];
          uVar21 = puVar16[1];
          uVar23 = *puVar16;
          *(undefined1 *)(puVar24 + 3) = 1;
          puVar24[2] = uVar22;
          puVar24[1] = uVar21;
          *puVar24 = uVar23;
        }
        else {
          *(undefined1 *)(puVar24 + 3) = 0;
        }
        lVar11 = lVar11 + 0x20;
      } while (lVar11 + lVar17 != lVar15);
      lVar17 = lVar11 + lVar26;
    }
    *(long *)(param_2 + 0x440) = lVar17;
  }
  lVar11 = (lVar19 - lVar28) + *(long *)(param_2 + 0x360);
  if (lVar11 != *(long *)(param_2 + 0x368)) {
    *(long *)(param_2 + 0x368) = lVar11;
  }
  lVar11 = *local_e8 + lStack_e0 * 0x30;
  if (lVar11 != local_e8[1]) {
    local_e8[1] = lVar11;
  }
  if (*(long *)(lVar6 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

