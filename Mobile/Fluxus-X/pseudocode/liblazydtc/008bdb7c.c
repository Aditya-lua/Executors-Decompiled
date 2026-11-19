/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008bdb7c
 */

void FUN_008bdb7c(undefined8 param_1,long param_2,int param_3)

{
  int *piVar1;
  ulong uVar2;
  int *piVar3;
  int *piVar4;
  int *piVar5;
  uint uVar6;
  uint uVar7;
  long lVar8;
  bool bVar9;
  int iVar10;
  uint uVar11;
  int *piVar12;
  ulong uVar13;
  int *piVar14;
  int *piVar15;
  int *piVar16;
  int iVar17;
  uint uVar18;
  long lVar19;
  uint uVar20;
  int iVar21;
  uint uVar22;
  uint uVar23;
  long lVar24;
  long lVar25;
  ulong uVar26;
  uint uVar27;
  uint uVar28;
  uint uVar29;
  int iVar30;
  int iVar32;
  double dVar31;
  int iVar33;
  int iVar34;
  int iVar35;
  int iVar36;
  int iVar37;
  int iVar38;
  int iVar39;
  int local_e0 [30];
  long local_68;
  
  lVar8 = tpidr_el0;
  local_68 = *(long *)(lVar8 + 0x28);
  iVar10 = *(int *)(param_2 + 8);
  local_e0[0x19] = 0;
  local_e0[0x1a] = 0;
  local_e0[0x18] = 0;
  local_e0[2] = 0;
  local_e0[3] = 0;
  local_e0[0] = 0;
  local_e0[1] = 0;
  local_e0[6] = 0;
  local_e0[7] = 0;
  local_e0[4] = 0;
  local_e0[5] = 0;
  local_e0[10] = 0;
  local_e0[0xb] = 0;
  local_e0[8] = 0;
  local_e0[9] = 0;
  local_e0[0xe] = 0;
  local_e0[0xf] = 0;
  local_e0[0xc] = 0;
  local_e0[0xd] = 0;
  local_e0[0x12] = 0;
  local_e0[0x13] = 0;
  local_e0[0x10] = 0;
  local_e0[0x11] = 0;
  local_e0[0x16] = 0;
  local_e0[0x17] = 0;
  local_e0[0x14] = 0;
  local_e0[0x15] = 0;
  if (iVar10 == 0) {
    uVar28 = 0;
  }
  else {
    lVar19 = 0;
    uVar28 = 0;
    iVar30 = 1;
    iVar17 = 1;
    do {
      iVar21 = iVar17;
      if ((iVar10 < iVar17) && (iVar21 = iVar10, iVar10 < iVar30)) break;
      if (iVar21 < iVar30) {
        iVar32 = 0;
      }
      else {
        lVar25 = (long)iVar30;
        uVar2 = (iVar21 - lVar25) + 1;
        if (uVar2 < 8) {
          iVar32 = 0;
LAB_008bdcd4:
          lVar24 = (iVar21 - lVar25) + 1;
          piVar12 = (int *)(*(long *)(param_2 + 0x20) + lVar25 * 0x10 + -4);
          do {
            if (*piVar12 != 0) {
              iVar32 = iVar32 + 1;
            }
            lVar24 = lVar24 + -1;
            piVar12 = piVar12 + 4;
          } while (lVar24 != 0);
        }
        else {
          iVar30 = 0;
          iVar32 = 0;
          iVar33 = 0;
          iVar34 = 0;
          iVar35 = 0;
          iVar36 = 0;
          iVar37 = 0;
          iVar38 = 0;
          lVar24 = lVar25 * 0x10;
          uVar26 = uVar2 & 0xfffffffffffffff8;
          lVar25 = uVar26 + lVar25;
          piVar12 = (int *)(*(long *)(param_2 + 0x20) + lVar24 + 0x3c);
          uVar13 = uVar26;
          do {
            piVar1 = piVar12 + -0x10;
            iVar39 = *piVar12;
            piVar14 = piVar12 + -0xc;
            piVar3 = piVar12 + 4;
            uVar13 = uVar13 - 8;
            piVar15 = piVar12 + -8;
            piVar4 = piVar12 + 8;
            piVar16 = piVar12 + -4;
            piVar5 = piVar12 + 0xc;
            piVar12 = piVar12 + 0x20;
            iVar30 = iVar30 + (uint)(*piVar1 != 0);
            iVar32 = iVar32 + (uint)(*piVar14 != 0);
            iVar33 = iVar33 + (uint)(*piVar15 != 0);
            iVar34 = iVar34 + (uint)(*piVar16 != 0);
            iVar35 = iVar35 + (uint)(iVar39 != 0);
            iVar36 = iVar36 + (uint)(*piVar3 != 0);
            iVar37 = iVar37 + (uint)(*piVar4 != 0);
            iVar38 = iVar38 + (uint)(*piVar5 != 0);
          } while (uVar13 != 0);
          iVar32 = iVar35 + iVar30 + iVar36 + iVar32 + iVar37 + iVar33 + iVar38 + iVar34;
          if (uVar2 != uVar26) goto LAB_008bdcd4;
        }
        iVar30 = iVar21 + 1;
      }
      iVar17 = iVar17 << 1;
      uVar28 = iVar32 + uVar28;
      local_e0[lVar19] = local_e0[lVar19] + iVar32;
      lVar19 = lVar19 + 1;
    } while (lVar19 != 0x1b);
  }
  lVar19 = *(long *)(param_2 + 0x28);
  if (((DAT_00d1fc90 & 1) == 0) && (iVar10 = __cxa_guard_acquire(&DAT_00d1fc90), iVar10 != 0)) {
                    /* try { // try from 008bdf08 to 008bdf0b has its CatchHandler @ 008bdf20 */
    DAT_00d1fc88 = FUN_007fe1ec(DAT_00cca8c8);
    __cxa_guard_release(&DAT_00d1fc90);
  }
  if (lVar19 == (long)&DWORD_007f3700 + DAT_00d1fc88) {
    uVar29 = uVar28;
  }
  else {
    iVar10 = 0;
    iVar30 = 0;
    lVar19 = (ulong)(uint)~(-1 << (ulong)(*(byte *)(param_2 + 5) & 0x1f)) << 5;
    do {
      lVar25 = *(long *)(param_2 + 0x28) + lVar19;
      if (*(int *)(lVar25 + 0xc) != 0) {
        if ((*(uint *)(lVar25 + 0x1c) & 0xf) == 3) {
          dVar31 = *(double *)(*(long *)(param_2 + 0x28) + lVar19 + 0x10);
          iVar17 = (int)dVar31;
          uVar29 = iVar17 - 1;
          if (dVar31 != (double)iVar17) {
            uVar29 = 0xfffffffe;
          }
          bVar9 = uVar29 >> 0x1a == 0;
          if (bVar9) {
            iVar17 = FUN_008b91dc();
            *(int *)(((ulong)local_e0 | 4) + (long)iVar17 * 4) =
                 *(int *)(((ulong)local_e0 | 4) + (long)iVar17 * 4) + 1;
          }
          iVar30 = (uint)bVar9 + iVar30;
        }
        iVar10 = iVar10 + 1;
      }
      bVar9 = lVar19 != 0;
      lVar19 = lVar19 + -0x20;
    } while (bVar9);
    uVar29 = iVar10 + uVar28;
    uVar28 = iVar30 + uVar28;
  }
  if (param_3 - 1U >> 0x1a == 0) {
    iVar10 = FUN_008b91dc();
    uVar28 = uVar28 + 1;
    local_e0[(long)iVar10 + 1] = local_e0[(long)iVar10 + 1] + 1;
  }
  if ((int)uVar28 < 1) {
    uVar18 = 0;
    uVar11 = 0;
  }
  else {
    uVar23 = 0;
    uVar18 = 0;
    uVar22 = 1;
    piVar12 = local_e0;
    uVar20 = 0;
    uVar27 = 0;
    do {
      iVar10 = *piVar12;
      uVar6 = iVar10 + uVar20;
      uVar7 = uVar6;
      if (iVar10 < 1) {
        uVar7 = uVar20;
      }
      uVar11 = uVar22;
      if (iVar10 < 1 || (int)uVar6 <= (int)uVar23) {
        uVar11 = uVar27;
        uVar6 = uVar18;
      }
      uVar18 = uVar6;
      if (uVar7 == uVar28) break;
      uVar23 = uVar22 & 0x7fffffff;
      uVar22 = uVar22 << 1;
      piVar12 = piVar12 + 1;
      uVar20 = uVar7;
      uVar27 = uVar11;
    } while (uVar23 < uVar28);
  }
  iVar10 = (uVar29 + 1) - uVar18;
  iVar17 = FUN_008ba870(param_2,uVar11,param_3);
  iVar30 = iVar17 - uVar11;
  if (iVar30 != 0) {
    iVar10 = iVar10 - iVar30;
    uVar11 = FUN_008ba870(param_2,iVar30 + iVar17,param_3);
  }
  if (*(long *)(lVar8 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  FUN_008ba968(param_1,param_2,uVar11,iVar10);
  return;
}

