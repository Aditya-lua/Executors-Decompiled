/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00877aa0
 */

void FUN_00877aa0(long param_1,undefined8 param_2)

{
  undefined1 (*pauVar1) [16];
  ulong uVar2;
  int iVar3;
  int iVar4;
  ulong uVar5;
  long lVar6;
  undefined1 auVar7 [16];
  long lVar8;
  ulong uVar9;
  int *piVar10;
  ulong uVar11;
  ulong uVar12;
  undefined1 (*pauVar13) [16];
  long lVar14;
  ulong uVar15;
  long lVar16;
  int iVar17;
  uint uVar18;
  long lVar19;
  undefined1 (*pauVar20) [16];
  ulong uVar21;
  ulong uVar22;
  ulong uVar23;
  int iVar24;
  undefined4 *puVar25;
  ulong uVar26;
  int iVar27;
  undefined1 auVar28 [16];
  undefined1 auVar29 [16];
  undefined4 *local_78;
  undefined4 *local_70;
  long local_68;
  undefined4 local_5c;
  long local_58;
  
  lVar6 = tpidr_el0;
  local_58 = *(long *)(lVar6 + 0x28);
  lVar14 = *(long *)(param_1 + 0x48);
  lVar19 = *(long *)(param_1 + 0x50) - lVar14;
  uVar15 = lVar19 >> 2;
  if (lVar19 == 0) {
    iVar17 = 0x1000000;
  }
  else {
    uVar21 = 0;
    iVar17 = 0x1000000;
    do {
      iVar27 = *(int *)(lVar14 + uVar21 * 4);
      uVar22 = uVar21 + (long)iVar17;
      uVar26 = uVar21;
      iVar24 = iVar27;
      uVar23 = uVar21;
      if (uVar21 <= uVar22) {
        uVar23 = uVar22;
      }
      do {
        if (uVar23 == uVar26) {
LAB_00877b58:
          if (uVar23 - uVar21 < (ulong)(long)iVar17) {
            uVar18 = 0xffffffff;
            do {
              uVar18 = uVar18 + 1;
            } while (2 << (ulong)(uVar18 & 0x1f) <= (int)(uVar23 - uVar21));
            iVar17 = 1 << (ulong)(uVar18 & 0x1f);
            uVar22 = uVar21 + (long)iVar17;
          }
          break;
        }
        iVar4 = *(int *)(lVar14 + uVar26 * 4);
        iVar3 = iVar4;
        if (iVar24 <= iVar4) {
          iVar3 = iVar24;
        }
        if (iVar27 <= iVar4) {
          iVar27 = iVar4;
        }
        if (0xff < iVar27 - iVar3) {
          uVar23 = uVar26;
          goto LAB_00877b58;
        }
        uVar26 = uVar26 + 1;
        iVar24 = iVar3;
      } while (uVar26 < uVar15);
      uVar21 = uVar22;
    } while (uVar21 < uVar15);
  }
  uVar26 = (ulong)iVar17;
  local_5c = 0;
  local_78 = (undefined4 *)0x0;
  local_70 = (undefined4 *)0x0;
  uVar21 = 0;
  if (uVar26 != 0) {
    uVar21 = (uVar15 - 1) / uVar26;
  }
  local_68 = 0;
  uVar21 = uVar21 + 1;
  if (uVar21 < 2) {
    puVar25 = &local_5c;
    if (*(long *)(param_1 + 0x50) == lVar14) goto LAB_00877cb8;
  }
  else {
                    /* try { // try from 00877bac to 00877bb7 has its CatchHandler @ 00877d94 */
    FUN_0087a674(&local_78,uVar21);
    lVar14 = *(long *)(param_1 + 0x48);
    uVar15 = *(long *)(param_1 + 0x50) - lVar14 >> 2;
    puVar25 = local_78;
    if (*(long *)(param_1 + 0x50) == lVar14) goto LAB_00877cb8;
  }
  lVar16 = 0;
  lVar19 = 0;
  pauVar20 = (undefined1 (*) [16])(lVar14 + 0x10);
  uVar22 = uVar26;
  uVar23 = 0;
  do {
    uVar2 = uVar23 + uVar26;
    iVar27 = *(int *)(lVar14 + uVar23 * 4);
    uVar5 = uVar15;
    if (uVar22 <= uVar15) {
      uVar5 = uVar22;
    }
    uVar11 = uVar15;
    if (uVar2 <= uVar15) {
      uVar11 = uVar2;
    }
    if (uVar23 < uVar11) {
      uVar9 = uVar5 - lVar19 * uVar26;
      uVar11 = uVar23;
      if (7 < uVar9) {
        auVar28._0_8_ = CONCAT44(iVar27,iVar27);
        auVar28._8_4_ = iVar27;
        auVar28._12_4_ = iVar27;
        uVar12 = uVar5 + lVar16 & 0xfffffffffffffff8;
        uVar11 = uVar23 + (uVar9 & 0xfffffffffffffff8);
        auVar29._8_8_ = auVar28._8_8_;
        auVar29._0_8_ = auVar28._0_8_;
        pauVar13 = pauVar20;
        do {
          pauVar1 = pauVar13 + -1;
          auVar7 = *pauVar13;
          uVar12 = uVar12 - 8;
          pauVar13 = pauVar13 + 2;
          auVar28 = NEON_smin(*pauVar1,auVar28,4);
          auVar29 = NEON_smin(auVar7,auVar29,4);
        } while (uVar12 != 0);
        auVar28 = NEON_smin(auVar28,auVar29,4);
        iVar27 = NEON_sminv(auVar28,4);
        if (uVar9 == (uVar9 & 0xfffffffffffffff8)) goto LAB_00877bfc;
      }
      lVar8 = uVar5 - uVar11;
      piVar10 = (int *)(lVar14 + uVar11 * 4);
      iVar24 = iVar27;
      do {
        iVar27 = *piVar10;
        if (iVar24 <= *piVar10) {
          iVar27 = iVar24;
        }
        lVar8 = lVar8 + -1;
        piVar10 = piVar10 + 1;
        iVar24 = iVar27;
      } while (lVar8 != 0);
    }
LAB_00877bfc:
    uVar5 = 0;
    if (uVar26 != 0) {
      uVar5 = uVar23 / uVar26;
    }
    uVar22 = uVar22 + uVar26;
    lVar19 = lVar19 + 1;
    pauVar20 = (undefined1 (*) [16])(*pauVar20 + uVar26 * 4);
    lVar16 = lVar16 - uVar26;
    puVar25[uVar5] = iVar27;
    uVar23 = uVar2;
  } while (uVar2 < uVar15);
LAB_00877cb8:
  uVar15 = 0xffffffffffffffff;
  do {
    uVar15 = uVar15 + 1;
  } while (2 << (ulong)((uint)uVar15 & 0x1f) <= iVar17);
                    /* try { // try from 00877cd0 to 00877cdb has its CatchHandler @ 00877d98 */
  FUN_00877148(param_2,uVar15 & 0xffffffff);
  lVar14 = *(long *)(param_1 + 0x48);
  if (*(long *)(param_1 + 0x50) != lVar14) {
    uVar26 = 0;
    iVar17 = 0;
    do {
      iVar27 = *(int *)(lVar14 + uVar26 * 4) - puVar25[uVar26 >> (uVar15 & 0x3f)];
                    /* try { // try from 00877d04 to 00877d0b has its CatchHandler @ 00877da0 */
      FUN_00877148(param_2,iVar27 - iVar17);
      lVar14 = *(long *)(param_1 + 0x48);
      uVar26 = uVar26 + 1;
      iVar17 = iVar27;
    } while (uVar26 < (ulong)(*(long *)(param_1 + 0x50) - lVar14 >> 2));
  }
  if (uVar21 != 0) {
    uVar15 = 0;
    iVar17 = 0;
    do {
                    /* try { // try from 00877d38 to 00877d3f has its CatchHandler @ 00877d9c */
      FUN_00877534(param_2,puVar25[uVar15] - iVar17);
      iVar17 = puVar25[uVar15];
      uVar15 = uVar15 + 1;
    } while (uVar15 < uVar21);
  }
  if (local_78 != (undefined4 *)0x0) {
    local_70 = local_78;
    operator_delete(local_78,local_68 - (long)local_78);
  }
  if (*(long *)(lVar6 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

