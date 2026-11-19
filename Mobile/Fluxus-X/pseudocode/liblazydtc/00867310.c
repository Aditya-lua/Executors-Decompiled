/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00867310
 */

/* WARNING: Removing unreachable block (ram,0x0086799c) */
/* WARNING: Removing unreachable block (ram,0x00867be8) */
/* WARNING: Removing unreachable block (ram,0x00867c28) */
/* WARNING: Removing unreachable block (ram,0x008679d4) */

undefined8 * FUN_00867310(undefined8 *param_1,long param_2,long *param_3)

{
  long *plVar1;
  long *plVar2;
  int iVar3;
  undefined4 uVar4;
  long lVar5;
  undefined8 *puVar6;
  int iVar7;
  undefined8 *puVar8;
  undefined8 uVar9;
  undefined8 *puVar10;
  long lVar11;
  ulong uVar12;
  long lVar13;
  ulong uVar14;
  long lVar15;
  undefined8 *puVar16;
  ulong uVar17;
  long lVar18;
  ulong uVar19;
  long lVar20;
  int iVar21;
  uint uVar22;
  long lVar23;
  long lVar24;
  long lVar25;
  long lVar26;
  uint uVar27;
  undefined8 uVar28;
  undefined8 uVar29;
  undefined8 uVar30;
  undefined1 auVar31 [16];
  int local_d4;
  undefined8 *local_d0;
  ulong uStack_c8;
  undefined8 local_b8;
  undefined1 local_b0 [16];
  undefined8 local_98;
  long local_90;
  long lStack_88;
  long local_78;
  long local_70;
  
  lVar5 = tpidr_el0;
  plVar1 = param_1 + 0x6c;
  local_70 = *(long *)(lVar5 + 0x28);
  lVar20 = param_1[0x6d];
  lVar18 = param_1[0x6c];
  lVar15 = param_1[0x8b];
  lVar11 = param_1[0x8a];
  lVar23 = lVar20 - lVar18;
  lVar25 = lVar15 - lVar11;
  puVar8 = param_1;
  local_78 = param_2;
  if (param_2 != 0) {
                    /* try { // try from 0086736c to 00867377 has its CatchHandler @ 00867ba0 */
    puVar8 = (undefined8 *)FUN_00871cec(plVar1,&local_78);
  }
  uVar22 = DAT_00d1eba0;
  uVar14 = (ulong)(param_2 != 0);
  uVar27 = *(int *)((long)param_1 + 0x124) + 1;
  *(uint *)((long)param_1 + 0x124) = uVar27;
  if (uVar27 <= uVar22) {
    uVar19 = 0;
    iVar21 = 0;
    uVar27 = 0;
    lVar24 = 0;
    plVar2 = param_1 + 0x8a;
    lStack_88 = param_3[1];
    local_90 = *param_3;
    lVar26 = 0xd1e000;
    local_d4 = -1;
    iVar7 = -1;
    do {
      iVar3 = *(int *)(param_1 + 0x12);
      local_98 = *(undefined8 *)((long)param_1 + 0x94);
      if (iVar3 < 0x7c) {
        if (iVar3 == 0x26) {
                    /* try { // try from 008674f0 to 008674f7 has its CatchHandler @ 00867bc0 */
          FUN_00858f2c(param_1);
          uVar4 = *(undefined4 *)((long)param_1 + 0x124);
                    /* try { // try from 008674fc to 0086751b has its CatchHandler @ 00867bb4 */
          auVar31 = FUN_008695d4(param_1,0,0);
          local_b0 = auVar31;
          puVar8 = (undefined8 *)FUN_00871cec(plVar1,local_b0);
          *(undefined4 *)((long)param_1 + 0x124) = uVar4;
          if (*(char *)(param_1 + 0xd) == '\x01') {
            if (((local_78 == 0) && (local_d4 == -1)) && (iVar7 == -1)) {
              uVar27 = 1;
LAB_008675a0:
              uVar14 = uVar14 + 1;
              local_d4 = (int)local_98;
              iVar7 = local_98._4_4_;
              goto LAB_008673fc;
            }
                    /* try { // try from 008673e8 to 008673f3 has its CatchHandler @ 00867ba4 */
            puVar8 = (undefined8 *)FUN_00870ce4(plVar2,&local_98);
            uVar19 = uVar19 + 1;
          }
          uVar27 = 1;
          uVar14 = uVar14 + 1;
        }
        else {
          if (iVar3 != 0x3f) {
LAB_008675ac:
            uVar22 = (uint)lVar24;
            if (uVar14 == 1 && (uVar22 == 0 && uVar27 == 0)) {
              puVar10 = *(undefined8 **)(*plVar1 + lVar23);
              goto LAB_00867978;
            }
            if ((uVar22 & uVar27) == 0) {
              lStack_88 = *(long *)(*(long *)(param_1[0x6d] + -8) + 0x14);
              if (uVar22 == 0) {
                if (uVar27 == 0) goto LAB_00867b5c;
                uVar9 = param_1[0x1d];
                if (uVar14 == 0) {
                  lVar24 = 0;
                  goto LAB_00867820;
                }
                lVar26 = *plVar1;
                    /* try { // try from 008676f0 to 008676fb has its CatchHandler @ 00867b94 */
                lVar24 = FUN_0084e938(uVar9,uVar14 << 3);
                if ((uVar14 < 8) || ((ulong)(lVar24 + (lVar18 - (lVar26 + lVar20))) < 0x20)) {
                  uVar12 = 0;
                  goto LAB_00867720;
                }
                uVar12 = uVar14 & 0xfffffffffffffffc;
                puVar8 = (undefined8 *)(lVar24 + 0x10);
                puVar10 = (undefined8 *)(lVar23 + lVar26 + 0x10);
                uVar17 = uVar12;
                do {
                  puVar16 = puVar10 + -1;
                  uVar28 = puVar10[-2];
                  uVar30 = puVar10[1];
                  uVar29 = *puVar10;
                  uVar17 = uVar17 - 4;
                  puVar10 = puVar10 + 4;
                  puVar8[-1] = *puVar16;
                  puVar8[-2] = uVar28;
                  puVar8[1] = uVar30;
                  *puVar8 = uVar29;
                  puVar8 = puVar8 + 4;
                } while (uVar17 != 0);
                if (uVar14 != uVar12) {
LAB_00867720:
                  lVar13 = uVar14 - uVar12;
                  puVar8 = (undefined8 *)(lVar26 + ((lVar20 + uVar12 * 8) - lVar18));
                  puVar10 = (undefined8 *)(lVar24 + uVar12 * 8);
                  do {
                    lVar13 = lVar13 + -1;
                    *puVar10 = *puVar8;
                    puVar8 = puVar8 + 1;
                    puVar10 = puVar10 + 1;
                  } while (lVar13 != 0);
                }
LAB_00867820:
                local_b0._0_8_ = lVar24;
                local_b0._8_8_ = uVar14;
                    /* try { // try from 00867824 to 0086783f has its CatchHandler @ 00867b94 */
                puVar10 = (undefined8 *)FUN_0084e938(uVar9,0x30);
                puVar8 = (undefined8 *)FUN_00850f90(puVar10,&local_90,local_b0);
                if (*(char *)(param_1 + 0xd) == '\x01') {
                  uVar9 = param_1[0x1d];
                  if (uVar19 == 0) {
                    lVar18 = 0;
                  }
                  else {
                    lVar20 = *plVar2;
                    /* try { // try from 0086785c to 00867863 has its CatchHandler @ 00867b8c */
                    lVar18 = FUN_0084e938(uVar9,uVar19 << 3);
                    if ((uVar19 < 8) || ((ulong)((lVar11 + lVar18) - (lVar20 + lVar15)) < 0x20)) {
                      uVar14 = 0;
                    }
                    else {
                      uVar14 = uVar19 & 0xfffffffffffffffc;
                      puVar8 = (undefined8 *)(lVar18 + 0x10);
                      puVar16 = (undefined8 *)(lVar25 + lVar20 + 0x10);
                      uVar12 = uVar14;
                      do {
                        puVar6 = puVar16 + -1;
                        uVar28 = puVar16[-2];
                        uVar30 = puVar16[1];
                        uVar29 = *puVar16;
                        uVar12 = uVar12 - 4;
                        puVar16 = puVar16 + 4;
                        puVar8[-1] = *puVar6;
                        puVar8[-2] = uVar28;
                        puVar8[1] = uVar30;
                        *puVar8 = uVar29;
                        puVar8 = puVar8 + 4;
                      } while (uVar12 != 0);
                      if (uVar19 == uVar14) goto LAB_00867938;
                    }
                    lVar24 = uVar19 - uVar14;
                    puVar8 = (undefined8 *)(lVar20 + ((lVar15 + uVar14 * 8) - lVar11));
                    puVar16 = (undefined8 *)(lVar18 + uVar14 * 8);
                    do {
                      lVar24 = lVar24 + -1;
                      *puVar16 = *puVar8;
                      puVar8 = puVar8 + 1;
                      puVar16 = puVar16 + 1;
                    } while (lVar24 != 0);
                  }
LAB_00867938:
                    /* try { // try from 00867938 to 00867963 has its CatchHandler @ 00867b8c */
                  uVar9 = FUN_0084e938(uVar9,0x20);
                  FUN_00852148(uVar9,CONCAT44(iVar7,local_d4),lVar18,uVar19);
                    /* try { // try from 00867968 to 00867973 has its CatchHandler @ 00867b80 */
                  local_b0._0_8_ = puVar10;
                  puVar8 = (undefined8 *)FUN_00860fa0(param_1 + 0x96,local_b0);
                  goto LAB_00867974;
                }
              }
              else {
                uVar9 = param_1[0x1d];
                if (uVar14 == 0) {
                  lVar24 = 0;
                  goto LAB_00867780;
                }
                lVar26 = *plVar1;
                    /* try { // try from 0086767c to 00867687 has its CatchHandler @ 00867b98 */
                lVar24 = FUN_0084e938(uVar9,uVar14 << 3);
                if ((uVar14 < 8) || ((ulong)(lVar24 + (lVar18 - (lVar26 + lVar20))) < 0x20)) {
                  uVar12 = 0;
                  goto LAB_008676ac;
                }
                uVar12 = uVar14 & 0xfffffffffffffffc;
                puVar8 = (undefined8 *)(lVar24 + 0x10);
                puVar10 = (undefined8 *)(lVar23 + lVar26 + 0x10);
                uVar17 = uVar12;
                do {
                  puVar16 = puVar10 + -1;
                  uVar28 = puVar10[-2];
                  uVar30 = puVar10[1];
                  uVar29 = *puVar10;
                  uVar17 = uVar17 - 4;
                  puVar10 = puVar10 + 4;
                  puVar8[-1] = *puVar16;
                  puVar8[-2] = uVar28;
                  puVar8[1] = uVar30;
                  *puVar8 = uVar29;
                  puVar8 = puVar8 + 4;
                } while (uVar17 != 0);
                if (uVar14 != uVar12) {
LAB_008676ac:
                  lVar13 = uVar14 - uVar12;
                  puVar8 = (undefined8 *)(lVar26 + ((lVar20 + uVar12 * 8) - lVar18));
                  puVar10 = (undefined8 *)(lVar24 + uVar12 * 8);
                  do {
                    lVar13 = lVar13 + -1;
                    *puVar10 = *puVar8;
                    puVar8 = puVar8 + 1;
                    puVar10 = puVar10 + 1;
                  } while (lVar13 != 0);
                }
LAB_00867780:
                local_b0._0_8_ = lVar24;
                local_b0._8_8_ = uVar14;
                    /* try { // try from 00867784 to 0086779f has its CatchHandler @ 00867b98 */
                puVar10 = (undefined8 *)FUN_0084e938(uVar9,0x30);
                puVar8 = (undefined8 *)FUN_00850eec(puVar10,&local_90,local_b0);
                if (*(char *)(param_1 + 0xd) == '\x01') {
                  uVar9 = param_1[0x1d];
                  if (uVar19 == 0) {
                    lVar18 = 0;
                  }
                  else {
                    lVar20 = *plVar2;
                    /* try { // try from 008677bc to 008677c3 has its CatchHandler @ 00867b90 */
                    lVar18 = FUN_0084e938(uVar9,uVar19 << 3);
                    if ((uVar19 < 8) || ((ulong)((lVar11 + lVar18) - (lVar20 + lVar15)) < 0x20)) {
                      uVar14 = 0;
                    }
                    else {
                      uVar14 = uVar19 & 0xfffffffffffffffc;
                      puVar8 = (undefined8 *)(lVar18 + 0x10);
                      puVar16 = (undefined8 *)(lVar25 + lVar20 + 0x10);
                      uVar12 = uVar14;
                      do {
                        puVar6 = puVar16 + -1;
                        uVar28 = puVar16[-2];
                        uVar30 = puVar16[1];
                        uVar29 = *puVar16;
                        uVar12 = uVar12 - 4;
                        puVar16 = puVar16 + 4;
                        puVar8[-1] = *puVar6;
                        puVar8[-2] = uVar28;
                        puVar8[1] = uVar30;
                        *puVar8 = uVar29;
                        puVar8 = puVar8 + 4;
                      } while (uVar12 != 0);
                      if (uVar19 == uVar14) goto LAB_008678f4;
                    }
                    lVar24 = uVar19 - uVar14;
                    puVar8 = (undefined8 *)(lVar20 + ((lVar15 + uVar14 * 8) - lVar11));
                    puVar16 = (undefined8 *)(lVar18 + uVar14 * 8);
                    do {
                      lVar24 = lVar24 + -1;
                      *puVar16 = *puVar8;
                      puVar8 = puVar8 + 1;
                      puVar16 = puVar16 + 1;
                    } while (lVar24 != 0);
                  }
LAB_008678f4:
                    /* try { // try from 008678f4 to 0086791f has its CatchHandler @ 00867b90 */
                  uVar9 = FUN_0084e938(uVar9,0x20);
                  FUN_00852130(uVar9,CONCAT44(iVar7,local_d4),lVar18,uVar19);
                    /* try { // try from 00867924 to 0086792f has its CatchHandler @ 00867b84 */
                  local_b0._0_8_ = puVar10;
                  puVar8 = (undefined8 *)FUN_00860fa0(param_1 + 0x96,local_b0);
LAB_00867974:
                  *puVar8 = uVar9;
                }
              }
            }
            else {
              local_b0._0_8_ = *param_3;
              local_b0._8_8_ = *(undefined8 *)(*(long *)(param_1[0x6d] + -8) + 0x14);
              if (uVar14 == 0) {
                local_d0 = (undefined8 *)0x0;
                goto LAB_00867754;
              }
              lVar11 = param_1[0x6c];
                    /* try { // try from 008675f0 to 008675f7 has its CatchHandler @ 00867b9c */
              local_d0 = (undefined8 *)FUN_0084e938(param_1[0x1d],uVar14 << 3);
              if ((uVar14 < 8) || ((ulong)((long)local_d0 + (lVar18 - (lVar11 + lVar20))) < 0x20)) {
                uVar19 = 0;
                goto LAB_0086761c;
              }
              uVar19 = uVar14 & 0xfffffffffffffffc;
              puVar8 = local_d0 + 2;
              puVar10 = (undefined8 *)(lVar23 + lVar11 + 0x10);
              uVar12 = uVar19;
              do {
                puVar16 = puVar10 + -1;
                uVar9 = puVar10[-2];
                uVar29 = puVar10[1];
                uVar28 = *puVar10;
                uVar12 = uVar12 - 4;
                puVar10 = puVar10 + 4;
                puVar8[-1] = *puVar16;
                puVar8[-2] = uVar9;
                puVar8[1] = uVar29;
                *puVar8 = uVar28;
                puVar8 = puVar8 + 4;
              } while (uVar12 != 0);
              if (uVar14 != uVar19) {
LAB_0086761c:
                lVar15 = uVar14 - uVar19;
                puVar8 = (undefined8 *)(lVar11 + ((lVar20 + uVar19 * 8) - lVar18));
                puVar10 = local_d0 + uVar19;
                do {
                  lVar15 = lVar15 + -1;
                  *puVar10 = *puVar8;
                  puVar8 = puVar8 + 1;
                  puVar10 = puVar10 + 1;
                } while (lVar15 != 0);
              }
LAB_00867754:
                    /* try { // try from 00867758 to 0086776f has its CatchHandler @ 00867b9c */
              uStack_c8 = uVar14;
              puVar8 = (undefined8 *)
                       FUN_008653a4(param_1,local_b0,&local_d0,
                                    "Mixing union and intersection types is not allowed; consider wrapping in parentheses."
                                   );
              puVar10 = puVar8;
            }
LAB_00867978:
            if (lVar25 + param_1[0x8a] != param_1[0x8b]) {
              param_1[0x8b] = lVar25 + param_1[0x8a];
            }
            if (lVar23 + param_1[0x6c] != param_1[0x6d]) {
              param_1[0x6d] = lVar23 + param_1[0x6c];
            }
            if (*(long *)(lVar5 + 0x28) == local_70) {
              return puVar10;
            }
            goto LAB_00867c5c;
          }
          local_b0._8_8_ = *(ulong *)((long)param_1 + 0x9c);
          local_b0._0_8_ = *(long *)((long)param_1 + 0x94);
                    /* try { // try from 00867438 to 0086743f has its CatchHandler @ 00867bac */
          FUN_00858f2c(param_1);
          uStack_c8 = local_b0._8_8_;
          local_d0 = (undefined8 *)local_b0._0_8_;
                    /* try { // try from 0086744c to 0086746f has its CatchHandler @ 00867bb8 */
          uVar9 = FUN_0084e938(param_1[0x1d],0x20);
          FUN_00850ea4(uVar9,&local_d0);
          local_b8 = uVar9;
          puVar8 = (undefined8 *)FUN_00871cec(plVar1,&local_b8);
          iVar21 = iVar21 + 1;
          lVar24 = 1;
          uVar14 = uVar14 + 1;
        }
      }
      else if (iVar3 == 0x106) {
                    /* try { // try from 0086755c to 00867573 has its CatchHandler @ 00867bc0 */
        FUN_00860ecc(param_1,(long)param_1 + 0x94,"Unexpected \'...\' after type annotation");
        puVar8 = (undefined8 *)FUN_00858f2c(param_1);
      }
      else {
        if (iVar3 != 0x7c) goto LAB_008675ac;
                    /* try { // try from 00867490 to 00867497 has its CatchHandler @ 00867bc0 */
        FUN_00858f2c(param_1);
        uVar4 = *(undefined4 *)((long)param_1 + 0x124);
                    /* try { // try from 0086749c to 008674bb has its CatchHandler @ 00867bb0 */
        auVar31 = FUN_008695d4(param_1,0,0);
        local_b0 = auVar31;
        puVar8 = (undefined8 *)FUN_00871cec(plVar1,local_b0);
        *(undefined4 *)((long)param_1 + 0x124) = uVar4;
        if (*(char *)(param_1 + 0xd) == '\x01') {
          if (((local_78 == 0) && (local_d4 == -1)) && (iVar7 == -1)) {
            lVar24 = 1;
            goto LAB_008675a0;
          }
                    /* try { // try from 008674d8 to 008674e3 has its CatchHandler @ 00867ba8 */
          puVar8 = (undefined8 *)FUN_00870ce4(plVar2,&local_98);
          uVar19 = uVar19 + 1;
          lVar24 = 1;
          uVar14 = uVar14 + 1;
        }
        else {
          lVar24 = 1;
          uVar14 = uVar14 + 1;
        }
      }
LAB_008673fc:
    } while (uVar14 <= (uint)(DAT_00d1ebc0 + iVar21));
    if (*(long *)(lVar5 + 0x28) != local_70) goto LAB_00867c5c;
                    /* try { // try from 00867b1c to 00867b2b has its CatchHandler @ 00867bbc */
    puVar8 = (undefined8 *)
             FUN_008578f8(*(long *)(param_1[0x6d] + -8) + 0xc,
                          "Exceeded allowed type length; simplify your type annotation to make the code compile"
                         );
  }
  if (*(long *)(lVar5 + 0x28) == local_70) {
                    /* try { // try from 00867b40 to 00867b5b has its CatchHandler @ 00867ba0 */
    puVar8 = (undefined8 *)
             FUN_008578f8((long)param_1 + 0x94,
                          "Exceeded allowed recursion depth; simplify your %s to make the code compile"
                          ,"type annotation");
    lVar24 = lVar23;
    lVar26 = lVar25;
LAB_00867b5c:
    if (*(long *)(lVar5 + 0x28) == local_70) {
                    /* try { // try from 00867b70 to 00867b7f has its CatchHandler @ 00867b88 */
      puVar8 = (undefined8 *)
               FUN_008578f8(param_3,"Composite type was not an intersection or union.");
                    /* catch() { ... } // from try @ 00867968 with catch @ 00867b80 */
      if (lVar26 + param_1[0x8a] != param_1[0x8b]) {
        param_1[0x8b] = lVar26 + param_1[0x8a];
      }
      if (lVar24 + param_1[0x6c] != param_1[0x6d]) {
        param_1[0x6d] = lVar24 + param_1[0x6c];
      }
      if (*(long *)(lVar5 + 0x28) == local_70) {
                    /* WARNING: Subroutine does not return */
        FUN_00c2c090();
      }
    }
  }
LAB_00867c5c:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail(puVar8);
}

