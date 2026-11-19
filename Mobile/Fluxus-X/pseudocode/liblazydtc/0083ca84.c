/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0083ca84
 */

long * FUN_0083ca84(long *param_1,undefined8 *param_2,undefined8 param_3,undefined8 *param_4)

{
  long lVar1;
  undefined8 uVar2;
  long lVar3;
  long *plVar4;
  long lVar5;
  long *plVar6;
  undefined8 *puVar7;
  long lVar8;
  ulong uVar9;
  long *plVar10;
  long *plVar11;
  long *plVar12;
  long *plVar13;
  long *plVar14;
  long *unaff_x26;
  byte bVar15;
  float fVar16;
  
  lVar1 = tpidr_el0;
  lVar3 = *(long *)(lVar1 + 0x28);
  plVar13 = (long *)param_1[1];
  plVar14 = (long *)*param_2;
  if (plVar13 != (long *)0x0) {
    bVar15 = POPCOUNT((char)plVar13) + POPCOUNT((char)((ulong)plVar13 >> 8)) +
             POPCOUNT((char)((ulong)plVar13 >> 0x10)) + POPCOUNT((char)((ulong)plVar13 >> 0x18)) +
             POPCOUNT((char)((ulong)plVar13 >> 0x20)) + POPCOUNT((char)((ulong)plVar13 >> 0x28)) +
             POPCOUNT((char)((ulong)plVar13 >> 0x30)) + POPCOUNT((char)((ulong)plVar13 >> 0x38));
    if (bVar15 < 2) {
      unaff_x26 = (long *)((long)plVar13 - 1U & (ulong)plVar14);
    }
    else {
      unaff_x26 = plVar14;
      if (plVar13 <= plVar14) {
        uVar9 = 0;
        if (plVar13 != (long *)0x0) {
          uVar9 = (ulong)plVar14 / (ulong)plVar13;
        }
        unaff_x26 = (long *)((long)plVar14 - uVar9 * (long)plVar13);
      }
    }
    puVar7 = *(undefined8 **)(*param_1 + (long)unaff_x26 * 8);
    if ((puVar7 != (undefined8 *)0x0) && (plVar12 = (long *)*puVar7, plVar12 != (long *)0x0)) {
      do {
        plVar10 = (long *)plVar12[1];
        if (plVar10 == plVar14) {
          if ((long *)plVar12[2] == plVar14) {
            uVar2 = 0;
            goto LAB_0083cd04;
          }
        }
        else {
          if (bVar15 < 2) {
            plVar10 = (long *)((ulong)plVar10 & (long)plVar13 - 1U);
          }
          else if (plVar13 <= plVar10) {
            uVar9 = 0;
            if (plVar13 != (long *)0x0) {
              uVar9 = (ulong)plVar10 / (ulong)plVar13;
            }
            plVar10 = (long *)((long)plVar10 - uVar9 * (long)plVar13);
          }
          if (plVar10 != unaff_x26) break;
        }
        plVar12 = (long *)*plVar12;
      } while (plVar12 != (long *)0x0);
    }
  }
  plVar10 = param_1 + 2;
  plVar12 = operator_new(0x40);
  lVar8 = param_1[3];
  plVar4 = (long *)*param_4;
  *plVar12 = 0;
  plVar12[1] = (long)plVar14;
  lVar5 = *plVar4;
  plVar12[6] = 0;
  plVar12[5] = 0;
  plVar12[4] = 0;
  plVar12[3] = 0;
  fVar16 = *(float *)(param_1 + 4);
  plVar12[2] = lVar5;
  *(undefined4 *)(plVar12 + 7) = 0x3f800000;
  plVar4 = plVar12;
  if ((plVar13 != (long *)0x0) && ((float)(lVar8 + 1) <= fVar16 * (float)plVar13))
  goto LAB_0083ccdc;
  if (plVar13 < (long *)0x3) {
    uVar9 = 1;
  }
  else {
    uVar9 = (ulong)(((ulong)plVar13 & (long)plVar13 - 1U) != 0);
  }
  plVar6 = (long *)(uVar9 | (long)plVar13 << 1);
  plVar11 = (long *)(long)((float)(lVar8 + 1) / fVar16);
  if (plVar6 <= plVar11) {
    plVar6 = plVar11;
  }
  if ((long)plVar6 - 1U == 0) {
    plVar6 = (long *)0x2;
  }
  else if (((ulong)plVar6 & (long)plVar6 - 1U) != 0) {
                    /* try { // try from 0083cc10 to 0083cc9b has its CatchHandler @ 0083cd80 */
    plVar4 = (long *)std::__ndk1::__next_prime((ulong)plVar6);
    plVar13 = (long *)param_1[1];
    plVar6 = plVar4;
  }
  if (plVar13 < plVar6) {
LAB_0083cc28:
    plVar4 = (long *)FUN_0083cdb0(param_1,plVar6);
  }
  else if (plVar6 < plVar13) {
    plVar4 = (long *)(long)((float)(ulong)param_1[3] / *(float *)(param_1 + 4));
    if ((plVar13 < (long *)0x3) ||
       (1 < (byte)(POPCOUNT((char)plVar13) + POPCOUNT((char)((ulong)plVar13 >> 8)) +
                   POPCOUNT((char)((ulong)plVar13 >> 0x10)) +
                   POPCOUNT((char)((ulong)plVar13 >> 0x18)) +
                   POPCOUNT((char)((ulong)plVar13 >> 0x20)) +
                   POPCOUNT((char)((ulong)plVar13 >> 0x28)) +
                   POPCOUNT((char)((ulong)plVar13 >> 0x30)) +
                  POPCOUNT((char)((ulong)plVar13 >> 0x38))))) {
      plVar4 = (long *)std::__ndk1::__next_prime((ulong)plVar4);
    }
    else if ((long *)0x1 < plVar4) {
      plVar4 = (long *)(1L << (-LZCOUNT((long)plVar4 + -1) & 0x3fU));
    }
    if (plVar6 <= plVar4) {
      plVar6 = plVar4;
    }
    if (plVar6 < plVar13) goto LAB_0083cc28;
  }
  plVar13 = (long *)param_1[1];
  if (((ulong)plVar13 & (long)plVar13 - 1U) == 0) {
    unaff_x26 = (long *)((long)plVar13 - 1U & (ulong)plVar14);
  }
  else if (plVar14 < plVar13) {
    unaff_x26 = plVar14;
  }
  else {
    uVar9 = 0;
    if (plVar13 != (long *)0x0) {
      uVar9 = (ulong)plVar14 / (ulong)plVar13;
    }
    unaff_x26 = (long *)((long)plVar14 - uVar9 * (long)plVar13);
  }
LAB_0083ccdc:
  lVar5 = *param_1;
  plVar14 = *(long **)(lVar5 + (long)unaff_x26 * 8);
  if (plVar14 == (long *)0x0) {
    lVar8 = *plVar10;
    *plVar10 = (long)plVar12;
    *plVar12 = lVar8;
    *(long **)(lVar5 + (long)unaff_x26 * 8) = plVar10;
    if (*plVar12 != 0) {
      plVar14 = *(long **)(*plVar12 + 8);
      if (((ulong)plVar13 & (long)plVar13 - 1U) == 0) {
        *(long **)(lVar5 + ((ulong)plVar14 & (long)plVar13 - 1U) * 8) = plVar12;
      }
      else {
        if (plVar13 <= plVar14) {
          uVar9 = 0;
          if (plVar13 != (long *)0x0) {
            uVar9 = (ulong)plVar14 / (ulong)plVar13;
          }
          plVar14 = (long *)((long)plVar14 - uVar9 * (long)plVar13);
        }
        *(long **)(lVar5 + (long)plVar14 * 8) = plVar12;
      }
    }
  }
  else {
    *plVar12 = *plVar14;
    *plVar14 = (long)plVar12;
  }
  uVar2 = 1;
  param_1[3] = param_1[3] + 1;
  param_1 = plVar4;
LAB_0083cd04:
  if (*(long *)(lVar1 + 0x28) != lVar3) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(param_1,uVar2);
  }
  return plVar12;
}

