/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0083cfc0
 */

long * FUN_0083cfc0(long *param_1,byte *param_2,undefined8 param_3,undefined8 *param_4)

{
  size_t __n;
  size_t sVar1;
  void *__s1;
  byte bVar2;
  ulong uVar3;
  long lVar4;
  int iVar5;
  ulong uVar6;
  long *plVar7;
  long *plVar8;
  undefined8 uVar9;
  undefined8 *puVar10;
  ulong uVar11;
  byte *pbVar12;
  long lVar13;
  long *plVar14;
  long *plVar15;
  ulong uVar16;
  ulong unaff_x27;
  byte bVar17;
  long lVar18;
  float fVar19;
  long *local_80;
  long *plStack_78;
  undefined8 local_70;
  long local_68;
  
  lVar4 = tpidr_el0;
  local_68 = *(long *)(lVar4 + 0x28);
  uVar6 = *(ulong *)(param_2 + 8);
  pbVar12 = *(byte **)(param_2 + 0x10);
  if ((*param_2 & 1) == 0) {
    pbVar12 = param_2 + 1;
    uVar6 = (ulong)(*param_2 >> 1);
  }
                    /* try { // try from 0083d010 to 0083d017 has its CatchHandler @ 0083d388 */
  uVar6 = FUN_0083ba34(&local_80,pbVar12,uVar6);
  uVar16 = param_1[1];
  if (uVar16 != 0) {
    bVar17 = POPCOUNT((char)uVar16) + POPCOUNT((char)(uVar16 >> 8)) +
             POPCOUNT((char)(uVar16 >> 0x10)) + POPCOUNT((char)(uVar16 >> 0x18)) +
             POPCOUNT((char)(uVar16 >> 0x20)) + POPCOUNT((char)(uVar16 >> 0x28)) +
             POPCOUNT((char)(uVar16 >> 0x30)) + POPCOUNT((char)(uVar16 >> 0x38));
    if (bVar17 < 2) {
      unaff_x27 = uVar16 - 1 & uVar6;
    }
    else {
      unaff_x27 = uVar6;
      if (uVar16 <= uVar6) {
        uVar11 = 0;
        if (uVar16 != 0) {
          uVar11 = uVar6 / uVar16;
        }
        unaff_x27 = uVar6 - uVar11 * uVar16;
      }
    }
    puVar10 = *(undefined8 **)(*param_1 + unaff_x27 * 8);
    if ((puVar10 != (undefined8 *)0x0) && (plVar15 = (long *)*puVar10, plVar15 != (long *)0x0)) {
      pbVar12 = param_2 + 1;
      __n = (ulong)(*param_2 >> 1);
      if ((*param_2 & 1) != 0) {
        pbVar12 = *(byte **)(param_2 + 0x10);
        __n = *(size_t *)(param_2 + 8);
      }
      do {
        uVar11 = plVar15[1];
        if (uVar11 == uVar6) {
          bVar2 = *(byte *)(plVar15 + 2);
          sVar1 = (ulong)(bVar2 >> 1);
          if ((bVar2 & 1) != 0) {
            sVar1 = plVar15[3];
          }
          if (sVar1 == __n) {
            __s1 = (void *)((long)plVar15 + 0x11);
            if ((bVar2 & 1) != 0) {
              __s1 = (void *)plVar15[4];
            }
            iVar5 = memcmp(__s1,pbVar12,__n);
            if (iVar5 == 0) {
              uVar9 = 0;
              plVar8 = (long *)0x0;
              goto LAB_0083d2d0;
            }
          }
        }
        else {
          if (bVar17 < 2) {
            uVar11 = uVar11 & uVar16 - 1;
          }
          else if (uVar16 <= uVar11) {
            uVar3 = 0;
            if (uVar16 != 0) {
              uVar3 = uVar11 / uVar16;
            }
            uVar11 = uVar11 - uVar3 * uVar16;
          }
          if (uVar11 != unaff_x27) break;
        }
        plVar15 = (long *)*plVar15;
      } while (plVar15 != (long *)0x0);
    }
  }
  plVar15 = param_1 + 2;
  plVar7 = operator_new(0x30);
  pbVar12 = (byte *)*param_4;
  local_70 = 0;
  *plVar7 = 0;
  plVar7[1] = uVar6;
  local_80 = plVar7;
  plStack_78 = plVar15;
  if ((*pbVar12 & 1) == 0) {
    lVar18 = *(long *)(pbVar12 + 8);
    lVar13 = *(long *)pbVar12;
    plVar7[4] = *(long *)(pbVar12 + 0x10);
    plVar7[3] = lVar18;
    plVar7[2] = lVar13;
    plVar8 = plVar7;
  }
  else {
                    /* try { // try from 0083d15c to 0083d163 has its CatchHandler @ 0083d360 */
    plVar8 = (long *)FUN_007ff40c(plVar7 + 2,*(undefined8 *)(pbVar12 + 0x10),
                                  *(undefined8 *)(pbVar12 + 8));
  }
  lVar13 = param_1[3];
  fVar19 = *(float *)(param_1 + 4);
  *(undefined1 *)(plVar7 + 5) = 0;
  local_70 = CONCAT71(local_70._1_7_,1);
  if ((uVar16 != 0) && ((float)(lVar13 + 1) <= fVar19 * (float)uVar16)) goto LAB_0083d2a4;
  if (uVar16 < 3) {
    uVar11 = 1;
  }
  else {
    uVar11 = (ulong)((uVar16 & uVar16 - 1) != 0);
  }
  plVar7 = (long *)(uVar11 | uVar16 << 1);
  plVar14 = (long *)(long)((float)(lVar13 + 1) / fVar19);
  if (plVar7 <= plVar14) {
    plVar7 = plVar14;
  }
  if ((long)plVar7 - 1U == 0) {
    plVar7 = (long *)0x2;
  }
  else if (((ulong)plVar7 & (long)plVar7 - 1U) != 0) {
                    /* try { // try from 0083d1e0 to 0083d263 has its CatchHandler @ 0083d35c */
    plVar8 = (long *)std::__ndk1::__next_prime((ulong)plVar7);
    plVar7 = plVar8;
  }
  plVar14 = (long *)param_1[1];
  if (plVar14 < plVar7) {
LAB_0083d1f8:
    plVar8 = (long *)FUN_0083d3ec(param_1,plVar7);
  }
  else if (plVar7 < plVar14) {
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
    if (plVar7 <= plVar8) {
      plVar7 = plVar8;
    }
    if (plVar7 < plVar14) goto LAB_0083d1f8;
  }
  uVar16 = param_1[1];
  if ((uVar16 & uVar16 - 1) == 0) {
    unaff_x27 = uVar16 - 1 & uVar6;
  }
  else if (uVar6 < uVar16) {
    unaff_x27 = uVar6;
  }
  else {
    uVar11 = 0;
    if (uVar16 != 0) {
      uVar11 = uVar6 / uVar16;
    }
    unaff_x27 = uVar6 - uVar11 * uVar16;
  }
LAB_0083d2a4:
  lVar13 = *param_1;
  plVar7 = *(long **)(lVar13 + unaff_x27 * 8);
  if (plVar7 == (long *)0x0) {
    *local_80 = *plVar15;
    *plVar15 = (long)local_80;
    *(long **)(lVar13 + unaff_x27 * 8) = plVar15;
    if (*local_80 != 0) {
      uVar6 = *(ulong *)(*local_80 + 8);
      if ((uVar16 & uVar16 - 1) == 0) {
        *(long **)(lVar13 + (uVar6 & uVar16 - 1) * 8) = local_80;
      }
      else {
        if (uVar16 <= uVar6) {
          uVar11 = 0;
          if (uVar16 != 0) {
            uVar11 = uVar6 / uVar16;
          }
          uVar6 = uVar6 - uVar11 * uVar16;
        }
        *(long **)(lVar13 + uVar6 * 8) = local_80;
      }
    }
  }
  else {
    *local_80 = *plVar7;
    *plVar7 = (long)local_80;
  }
  uVar9 = 1;
  param_1[3] = param_1[3] + 1;
  plVar15 = local_80;
LAB_0083d2d0:
  if (*(long *)(lVar4 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(plVar8,uVar9);
  }
  return plVar15;
}

