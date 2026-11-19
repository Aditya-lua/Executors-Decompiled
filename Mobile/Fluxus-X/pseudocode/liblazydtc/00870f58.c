/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00870f58
 */

long * FUN_00870f58(long *param_1,byte *param_2,byte *param_3)

{
  size_t __n;
  size_t sVar1;
  void *__s1;
  byte *pbVar2;
  byte bVar3;
  ulong uVar4;
  long lVar5;
  int iVar6;
  ulong uVar7;
  long *plVar8;
  undefined8 uVar9;
  undefined8 *puVar10;
  ulong uVar11;
  long lVar12;
  long *plVar13;
  long *plVar14;
  long *plVar15;
  ulong uVar16;
  ulong unaff_x27;
  byte bVar17;
  long lVar18;
  long *local_80;
  long *plStack_78;
  undefined8 local_70;
  long local_68;
  
  lVar5 = tpidr_el0;
  local_68 = *(long *)(lVar5 + 0x28);
  uVar7 = *(ulong *)(param_2 + 8);
  pbVar2 = *(byte **)(param_2 + 0x10);
  if ((*param_2 & 1) == 0) {
    pbVar2 = param_2 + 1;
    uVar7 = (ulong)(*param_2 >> 1);
  }
                    /* try { // try from 00870fa8 to 00870faf has its CatchHandler @ 00871314 */
  uVar7 = FUN_0083ba34(&local_80,pbVar2,uVar7);
  uVar16 = param_1[1];
  if (uVar16 != 0) {
    bVar17 = POPCOUNT((char)uVar16) + POPCOUNT((char)(uVar16 >> 8)) +
             POPCOUNT((char)(uVar16 >> 0x10)) + POPCOUNT((char)(uVar16 >> 0x18)) +
             POPCOUNT((char)(uVar16 >> 0x20)) + POPCOUNT((char)(uVar16 >> 0x28)) +
             POPCOUNT((char)(uVar16 >> 0x30)) + POPCOUNT((char)(uVar16 >> 0x38));
    if (bVar17 < 2) {
      unaff_x27 = uVar16 - 1 & uVar7;
    }
    else {
      unaff_x27 = uVar7;
      if (uVar16 <= uVar7) {
        uVar11 = 0;
        if (uVar16 != 0) {
          uVar11 = uVar7 / uVar16;
        }
        unaff_x27 = uVar7 - uVar11 * uVar16;
      }
    }
    puVar10 = *(undefined8 **)(*param_1 + unaff_x27 * 8);
    if ((puVar10 != (undefined8 *)0x0) && (plVar15 = (long *)*puVar10, plVar15 != (long *)0x0)) {
      pbVar2 = param_2 + 1;
      __n = (ulong)(*param_2 >> 1);
      if ((*param_2 & 1) != 0) {
        pbVar2 = *(byte **)(param_2 + 0x10);
        __n = *(size_t *)(param_2 + 8);
      }
      do {
        uVar11 = plVar15[1];
        if (uVar11 == uVar7) {
          bVar3 = *(byte *)(plVar15 + 2);
          sVar1 = (ulong)(bVar3 >> 1);
          if ((bVar3 & 1) != 0) {
            sVar1 = plVar15[3];
          }
          if (sVar1 == __n) {
            __s1 = (void *)((long)plVar15 + 0x11);
            if ((bVar3 & 1) != 0) {
              __s1 = (void *)plVar15[4];
            }
            iVar6 = memcmp(__s1,pbVar2,__n);
            if (iVar6 == 0) {
              uVar9 = 0;
              plVar8 = (long *)0x0;
              goto LAB_0087125c;
            }
          }
        }
        else {
          if (bVar17 < 2) {
            uVar11 = uVar11 & uVar16 - 1;
          }
          else if (uVar16 <= uVar11) {
            uVar4 = 0;
            if (uVar16 != 0) {
              uVar4 = uVar11 / uVar16;
            }
            uVar11 = uVar11 - uVar4 * uVar16;
          }
          if (uVar11 != unaff_x27) break;
        }
        plVar15 = (long *)*plVar15;
      } while (plVar15 != (long *)0x0);
    }
  }
  plVar15 = param_1 + 2;
  plVar8 = operator_new(0x28);
  bVar17 = *param_3;
  local_70 = 0;
  *plVar8 = 0;
  plVar8[1] = uVar7;
  local_80 = plVar8;
  plStack_78 = plVar15;
  if ((bVar17 & 1) == 0) {
    lVar18 = *(long *)param_3;
    lVar12 = *(long *)(param_3 + 0x10);
    plVar8[3] = *(long *)(param_3 + 8);
    plVar8[2] = lVar18;
    plVar8[4] = lVar12;
  }
  else {
                    /* try { // try from 008710ec to 008710f3 has its CatchHandler @ 008712ec */
    plVar8 = (long *)FUN_007ff40c(plVar8 + 2,*(undefined8 *)(param_3 + 0x10),
                                  *(undefined8 *)(param_3 + 8));
  }
  local_70 = CONCAT71(local_70._1_7_,1);
  if ((uVar16 != 0) && ((float)(param_1[3] + 1) <= *(float *)(param_1 + 4) * (float)uVar16))
  goto LAB_00871230;
  if (uVar16 < 3) {
    uVar11 = 1;
  }
  else {
    uVar11 = (ulong)((uVar16 & uVar16 - 1) != 0);
  }
  plVar13 = (long *)(uVar11 | uVar16 << 1);
  plVar14 = (long *)(long)((float)(param_1[3] + 1) / *(float *)(param_1 + 4));
  if (plVar13 <= plVar14) {
    plVar13 = plVar14;
  }
  if ((long)plVar13 - 1U == 0) {
    plVar13 = (long *)0x2;
  }
  else if (((ulong)plVar13 & (long)plVar13 - 1U) != 0) {
                    /* try { // try from 0087116c to 008711ef has its CatchHandler @ 008712e8 */
    plVar8 = (long *)std::__ndk1::__next_prime((ulong)plVar13);
    plVar13 = plVar8;
  }
  plVar14 = (long *)param_1[1];
  if (plVar14 < plVar13) {
LAB_00871184:
    plVar8 = (long *)FUN_00871378(param_1,plVar13);
  }
  else if (plVar13 < plVar14) {
    plVar8 = (long *)(long)((float)(ulong)param_1[3] / *(float *)(param_1 + 4));
    if ((plVar14 < (long *)0x3) ||
       (1 < (byte)(POPCOUNT((char)plVar14) + POPCOUNT((char)((ulong)plVar14 >> 8)) +
                   POPCOUNT((char)((ulong)plVar14 >> 0x10)) +
                   POPCOUNT((char)((ulong)plVar14 >> 0x18)) +
                   POPCOUNT((char)((ulong)plVar14 >> 0x20)) +
                   POPCOUNT((char)((ulong)plVar14 >> 0x28)) +
                   POPCOUNT((char)((ulong)plVar14 >> 0x30)) +
                  POPCOUNT((char)((ulong)plVar14 >> 0x38))))) {
      plVar8 = (long *)std::__ndk1::__next_prime((ulong)plVar8);
    }
    else if ((long *)0x1 < plVar8) {
      plVar8 = (long *)(1L << (-LZCOUNT((long)plVar8 + -1) & 0x3fU));
    }
    if (plVar13 <= plVar8) {
      plVar13 = plVar8;
    }
    if (plVar13 < plVar14) goto LAB_00871184;
  }
  uVar16 = param_1[1];
  if ((uVar16 & uVar16 - 1) == 0) {
    unaff_x27 = uVar16 - 1 & uVar7;
  }
  else if (uVar7 < uVar16) {
    unaff_x27 = uVar7;
  }
  else {
    uVar11 = 0;
    if (uVar16 != 0) {
      uVar11 = uVar7 / uVar16;
    }
    unaff_x27 = uVar7 - uVar11 * uVar16;
  }
LAB_00871230:
  lVar12 = *param_1;
  plVar13 = *(long **)(lVar12 + unaff_x27 * 8);
  if (plVar13 == (long *)0x0) {
    *local_80 = *plVar15;
    *plVar15 = (long)local_80;
    *(long **)(lVar12 + unaff_x27 * 8) = plVar15;
    if (*local_80 != 0) {
      uVar7 = *(ulong *)(*local_80 + 8);
      if ((uVar16 & uVar16 - 1) == 0) {
        *(long **)(lVar12 + (uVar7 & uVar16 - 1) * 8) = local_80;
      }
      else {
        if (uVar16 <= uVar7) {
          uVar11 = 0;
          if (uVar16 != 0) {
            uVar11 = uVar7 / uVar16;
          }
          uVar7 = uVar7 - uVar11 * uVar16;
        }
        *(long **)(lVar12 + uVar7 * 8) = local_80;
      }
    }
  }
  else {
    *local_80 = *plVar13;
    *plVar13 = (long)local_80;
  }
  uVar9 = 1;
  param_1[3] = param_1[3] + 1;
  plVar15 = local_80;
LAB_0087125c:
  if (*(long *)(lVar5 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(plVar8,uVar9);
  }
  return plVar15;
}

