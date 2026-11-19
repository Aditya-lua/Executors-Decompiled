/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008a210c
 */

undefined1  [16] FUN_008a210c(long param_1,ulong param_2)

{
  int iVar1;
  long lVar2;
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
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
  undefined1 auVar18 [16];
  undefined1 auVar19 [16];
  undefined1 auVar20 [16];
  undefined1 auVar21 [16];
  undefined1 auVar22 [16];
  bool bVar23;
  ulong *puVar24;
  int *piVar25;
  long lVar26;
  long lVar27;
  long lVar28;
  undefined8 uVar29;
  long *plVar30;
  ulong uVar31;
  ulong uVar32;
  ulong uVar33;
  undefined8 *puVar34;
  undefined1 auVar35 [16];
  undefined1 auVar36 [16];
  undefined1 local_80 [16];
  undefined1 local_70 [16];
  ulong local_60;
  long local_58;
  
  auVar22._8_8_ = local_70._8_8_;
  auVar22._0_8_ = local_70._0_8_;
  auVar21._8_8_ = local_70._8_8_;
  auVar21._0_8_ = local_70._0_8_;
  auVar20._8_8_ = local_70._8_8_;
  auVar20._0_8_ = local_70._0_8_;
  auVar19._8_8_ = local_70._8_8_;
  auVar19._0_8_ = local_70._0_8_;
  auVar18._8_8_ = local_70._8_8_;
  auVar18._0_8_ = local_70._0_8_;
  auVar16._8_8_ = local_70._8_8_;
  auVar16._0_8_ = local_70._0_8_;
  auVar15._8_8_ = local_70._8_8_;
  auVar15._0_8_ = local_70._0_8_;
  auVar14._8_8_ = local_70._8_8_;
  auVar14._0_8_ = local_70._0_8_;
  auVar13._8_8_ = local_70._8_8_;
  auVar13._0_8_ = local_70._0_8_;
  auVar12._8_8_ = local_80._8_8_;
  auVar12._0_8_ = local_80._0_8_;
  auVar11._8_8_ = local_80._8_8_;
  auVar11._0_8_ = local_80._0_8_;
  auVar10._8_8_ = local_80._8_8_;
  auVar10._0_8_ = local_80._0_8_;
  auVar9._8_8_ = local_80._8_8_;
  auVar9._0_8_ = local_80._0_8_;
  auVar8._8_8_ = local_80._8_8_;
  auVar8._0_8_ = local_80._0_8_;
  auVar6._8_8_ = local_80._8_8_;
  auVar6._0_8_ = local_80._0_8_;
  auVar5._8_8_ = local_80._8_8_;
  auVar5._0_8_ = local_80._0_8_;
  auVar4._8_8_ = local_80._8_8_;
  auVar4._0_8_ = local_80._0_8_;
  auVar36._8_8_ = local_80._8_8_;
  auVar36._0_8_ = local_80._0_8_;
  lVar2 = tpidr_el0;
  local_58 = *(long *)(lVar2 + 0x28);
  plVar30 = *(long **)(param_1 + 0x10);
  if (plVar30[5] != 0) {
    uVar31 = ((ulong)(uint)((int)param_2 << 3) + 8 ^ param_2 >> 0x20) * -0x622015f714c7d297;
    uVar31 = (param_2 >> 0x20 ^ uVar31 >> 0x2f ^ uVar31) * -0x622015f714c7d297;
    uVar31 = (uVar31 ^ uVar31 >> 0x2f) * -0x6b622cb0470b6a63 >>
             ((ulong)*(byte *)(plVar30 + 6) & 0x3f);
    if ((*(ulong *)(plVar30[3] + (uVar31 >> 6) * 8) >> (uVar31 & 0x3f) & 1) != 0) {
      do {
        if (*(ulong *)(*plVar30 + uVar31 * 0x30) == param_2) {
          auVar35 = ZEXT816(0xffffffffffffffff) << 0x40;
          goto LAB_008a2438;
        }
        uVar31 = uVar31 + 1 & plVar30[4] - 1U;
      } while ((*(ulong *)(plVar30[3] + (uVar31 >> 6) * 8) >> (uVar31 & 0x3f) & 1) != 0);
    }
  }
  iVar1 = *(int *)(param_2 + 8);
  if ((param_2 != 0) && (iVar1 == DAT_00d1afc0)) {
LAB_008a21f4:
    uVar29 = *(undefined8 *)(param_2 + 0x20);
LAB_008a21f8:
    auVar35 = FUN_008a210c(param_1,uVar29);
    goto LAB_008a2438;
  }
  auVar35 = ZEXT816(0xffffffffffffffff) << 0x40;
  local_80 = auVar36;
  local_70 = auVar13;
  if (iVar1 == DAT_00d1afd0) goto LAB_008a2438;
  auVar35 = ZEXT816(0xffffffffffffffff) << 0x40;
  local_80 = auVar4;
  local_70 = auVar14;
  if (iVar1 == DAT_00d1afe0) goto LAB_008a2438;
  auVar35 = ZEXT816(0xffffffffffffffff) << 0x40;
  local_80 = auVar5;
  local_70 = auVar15;
  if (iVar1 == DAT_00d1aff0) goto LAB_008a2438;
  auVar35 = ZEXT816(0xffffffffffffffff) << 0x40;
  local_80 = auVar6;
  local_70 = auVar16;
  if (iVar1 == DAT_00d1b000) goto LAB_008a2438;
  if ((param_2 != 0) && (iVar1 == DAT_00d1b010)) {
    puVar24 = (ulong *)FUN_008a2738(param_1 + 0x18,param_2 + 0x20);
    auVar17._8_8_ = local_70._8_8_;
    auVar17._0_8_ = local_70._0_8_;
    auVar7._8_8_ = local_80._8_8_;
    auVar7._0_8_ = local_80._0_8_;
    if (puVar24 == (ulong *)0x0) {
      auVar35 = ZEXT816(0);
    }
    else {
      auVar3._8_8_ = 0;
      auVar3._0_8_ = *puVar24;
      auVar35 = auVar3 << 0x40;
      local_80 = auVar7;
      local_70 = auVar17;
    }
    goto LAB_008a2438;
  }
  if (iVar1 == DAT_00d1b020) {
    auVar35 = ZEXT816(1);
    local_80 = auVar8;
    local_70 = auVar18;
    goto LAB_008a2438;
  }
  if (iVar1 == DAT_00d1b030) {
LAB_008a22b8:
    auVar35 = ZEXT816(3);
    local_80 = auVar9;
    local_70 = auVar19;
    goto LAB_008a2438;
  }
  local_60 = param_2;
  if (iVar1 != DAT_00d1b040) {
    local_60 = 0;
  }
  if (local_60 != 0) {
    piVar25 = (int *)FUN_0089da18(*(undefined8 *)(param_1 + 8),&local_60);
    if ((piVar25 == (int *)0x0) || (*piVar25 == 0)) {
      lVar26 = FUN_008a210c(param_1,*(undefined8 *)(local_60 + 0x20));
      bVar23 = false;
      uVar31 = lVar26 + 3U & 0x8080808080808080;
      uVar32 = *(ulong *)(local_60 + 0x40);
      uVar31 = uVar31 - (uVar31 >> 7) | lVar26 + 3U & 0x7f7f7f7f7f7f7f7f;
    }
    else {
      uVar31 = 2;
      uVar32 = *(ulong *)(local_60 + 0x40);
      bVar23 = uVar32 < 4;
    }
    if (uVar32 != 0) {
      uVar32 = 0;
      do {
        lVar26 = FUN_008a210c(param_1,*(undefined8 *)(*(long *)(local_60 + 0x38) + uVar32 * 8));
        uVar32 = uVar32 + 1;
        if (!(bool)(lVar26 != 0 | bVar23)) {
          lVar26 = 1;
        }
        uVar33 = lVar26 + uVar31 & 0x8080808080808080;
        uVar31 = uVar33 - (uVar33 >> 7) | lVar26 + uVar31 & 0x7f7f7f7f7f7f7f7f;
      } while (uVar32 < *(ulong *)(local_60 + 0x40));
    }
    auVar35._8_8_ = 0;
    auVar35._0_8_ = uVar31;
    goto LAB_008a2438;
  }
  if ((param_2 == 0) || (iVar1 != DAT_00d1b050)) {
    if ((param_2 == 0) || (iVar1 != DAT_00d1b060)) {
      if (iVar1 != DAT_00d1b070) {
        if ((iVar1 != DAT_00d1b080) || (param_2 == 0)) {
          if ((param_2 == 0) || (iVar1 != DAT_00d1b090)) {
            if ((param_2 == 0) || (iVar1 != DAT_00d1b0a0)) {
              if ((param_2 != 0) && (iVar1 == DAT_00d1b0b0)) goto LAB_008a21f4;
              if ((param_2 == 0) || (iVar1 != DAT_00d1b0c0)) {
                if ((param_2 == 0) || (iVar1 != DAT_00d1b0d0)) {
                  if (param_2 == 0) {
                    auVar35 = ZEXT816(0);
                    local_80 = auVar12;
                    local_70 = auVar22;
                    goto LAB_008a2438;
                  }
                  auVar35 = ZEXT816(0);
                  local_80 = auVar11;
                  local_70 = auVar21;
                  if (iVar1 != DAT_00d1b0e0) goto LAB_008a2438;
                  uVar29 = *(undefined8 *)(param_2 + 0x20);
                  goto LAB_008a21f8;
                }
                if (*(long *)(param_2 + 0x38) != 0) {
                  lVar26 = *(long *)(param_2 + 0x38) << 3;
                  uVar31 = 3;
                  puVar34 = *(undefined8 **)(param_2 + 0x30);
                  do {
                    lVar27 = FUN_008a210c(param_1,*puVar34);
                    lVar26 = lVar26 + -8;
                    uVar32 = lVar27 + uVar31 & 0x8080808080808080;
                    uVar31 = uVar32 - (uVar32 >> 7) | lVar27 + uVar31 & 0x7f7f7f7f7f7f7f7f;
                    auVar35._8_8_ = 0;
                    auVar35._0_8_ = uVar31;
                    puVar34 = puVar34 + 1;
                  } while (lVar26 != 0);
                  goto LAB_008a2438;
                }
                goto LAB_008a22b8;
              }
              auVar36 = FUN_008a210c(param_1,*(undefined8 *)(param_2 + 0x20));
              if ((*(long *)(param_2 + 0x48) != 0) && (auVar36._8_8_ != 0)) {
                plVar30 = (long *)FUN_008a1090(param_1 + 0x18,(long *)(param_2 + 0x48));
                *plVar30 = auVar36._8_8_;
              }
              lVar26 = FUN_008a210c(param_1,*(undefined8 *)(param_2 + 0x30));
              uVar31 = lVar26 + auVar36._0_8_;
              uVar32 = uVar31 & 0x8080808080808080;
              lVar26 = FUN_008a210c(param_1,*(undefined8 *)(param_2 + 0x40));
              uVar31 = (uVar32 - (uVar32 >> 7) | uVar31 & 0x7f7f7f7f7f7f7f7f) + lVar26;
              uVar32 = uVar31 & 0x8080808080808080;
              uVar31 = (uVar32 - (uVar32 >> 7) | uVar31 & 0x7f7f7f7f7f7f7f7f) + 2;
              goto LAB_008a2428;
            }
            local_70 = FUN_008a210c(param_1,*(undefined8 *)(param_2 + 0x20));
            local_80 = FUN_008a210c(param_1,*(undefined8 *)(param_2 + 0x28));
          }
          else {
            local_70 = FUN_008a210c(param_1,*(undefined8 *)(param_2 + 0x20));
            local_80 = ZEXT816(0xffffffffffffffff) << 0x40;
          }
          auVar35 = FUN_008a27f8(local_70,local_80);
          goto LAB_008a2438;
        }
        if (*(long *)(param_2 + 0x28) != 0) {
          lVar26 = 0;
          uVar31 = 0;
          uVar32 = 10;
          do {
            lVar27 = *(long *)(param_2 + 0x20) + lVar26;
            if (*(long *)(lVar27 + 8) != 0) {
              lVar28 = FUN_008a210c(param_1);
              uVar33 = lVar28 + uVar32 & 0x8080808080808080;
              uVar32 = uVar33 - (uVar33 >> 7) | lVar28 + uVar32 & 0x7f7f7f7f7f7f7f7f;
            }
            lVar27 = FUN_008a210c(param_1,*(undefined8 *)(lVar27 + 0x10));
            uVar31 = uVar31 + 1;
            uVar33 = lVar27 + uVar32 & 0x8080808080808080;
            lVar26 = lVar26 + 0x18;
            uVar32 = (uVar33 - (uVar33 >> 7) | lVar27 + uVar32 & 0x7f7f7f7f7f7f7f7f) + 1;
            uVar33 = uVar32 & 0x8080808080808080;
            uVar32 = uVar33 - (uVar33 >> 7) | uVar32 & 0x7f7f7f7f7f7f7f7f;
            auVar35._8_8_ = 0;
            auVar35._0_8_ = uVar32;
          } while (uVar31 < *(ulong *)(param_2 + 0x28));
          goto LAB_008a2438;
        }
      }
      auVar35 = ZEXT816(10);
      local_80 = auVar10;
      local_70 = auVar20;
      goto LAB_008a2438;
    }
    lVar26 = FUN_008a210c(param_1,*(undefined8 *)(param_2 + 0x20));
    lVar27 = FUN_008a210c(param_1,*(undefined8 *)(param_2 + 0x28));
    uVar31 = lVar27 + lVar26 & 0x8080808080808080;
    uVar31 = (uVar31 - (uVar31 >> 7) | lVar27 + lVar26 & 0x7f7f7f7f7f7f7f7fU) + 1;
  }
  else {
    lVar26 = FUN_008a210c(param_1,*(undefined8 *)(param_2 + 0x20));
    uVar31 = lVar26 + 1;
  }
LAB_008a2428:
  auVar35._8_8_ = 0;
  auVar35._0_8_ =
       (uVar31 & 0x8080808080808080) - ((uVar31 & 0x8080808080808080) >> 7) |
       uVar31 & 0x7f7f7f7f7f7f7f7f;
LAB_008a2438:
  if (*(long *)(lVar2 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return auVar35;
}

