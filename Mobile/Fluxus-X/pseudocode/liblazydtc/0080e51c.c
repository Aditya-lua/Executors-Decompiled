/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0080e51c
 */

long * FUN_0080e51c(long *param_1,ulong *param_2,undefined8 param_3,undefined8 *param_4)

{
  long lVar1;
  long *plVar2;
  undefined8 uVar3;
  long lVar4;
  ulong uVar5;
  long lVar6;
  long *plVar7;
  ulong uVar8;
  long lVar9;
  undefined8 *puVar10;
  long *plVar11;
  long *plVar12;
  long *plVar13;
  long *plVar14;
  long *plVar15;
  long *unaff_x26;
  byte bVar16;
  float fVar17;
  
  lVar1 = tpidr_el0;
  lVar4 = *(long *)(lVar1 + 0x28);
  uVar5 = *param_2;
  plVar14 = (long *)param_1[1];
  uVar8 = ((ulong)(uint)((int)uVar5 << 3) + 8 ^ uVar5 >> 0x20) * -0x622015f714c7d297;
  uVar8 = (uVar5 >> 0x20 ^ uVar8 >> 0x2f ^ uVar8) * -0x622015f714c7d297;
  plVar15 = (long *)((uVar8 ^ uVar8 >> 0x2f) * -0x622015f714c7d297);
  if (plVar14 != (long *)0x0) {
    bVar16 = POPCOUNT((char)plVar14) + POPCOUNT((char)((ulong)plVar14 >> 8)) +
             POPCOUNT((char)((ulong)plVar14 >> 0x10)) + POPCOUNT((char)((ulong)plVar14 >> 0x18)) +
             POPCOUNT((char)((ulong)plVar14 >> 0x20)) + POPCOUNT((char)((ulong)plVar14 >> 0x28)) +
             POPCOUNT((char)((ulong)plVar14 >> 0x30)) + POPCOUNT((char)((ulong)plVar14 >> 0x38));
    if (bVar16 < 2) {
      unaff_x26 = (long *)((ulong)plVar15 & (long)plVar14 - 1U);
    }
    else {
      unaff_x26 = plVar15;
      if (plVar14 <= plVar15) {
        uVar8 = 0;
        if (plVar14 != (long *)0x0) {
          uVar8 = (ulong)plVar15 / (ulong)plVar14;
        }
        unaff_x26 = (long *)((long)plVar15 - uVar8 * (long)plVar14);
      }
    }
    puVar10 = *(undefined8 **)(*param_1 + (long)unaff_x26 * 8);
    if ((puVar10 != (undefined8 *)0x0) && (plVar13 = (long *)*puVar10, plVar13 != (long *)0x0)) {
      do {
        plVar12 = (long *)plVar13[1];
        if (plVar12 == plVar15) {
          if (plVar13[2] == uVar5) {
            uVar3 = 0;
            goto LAB_0080e7c4;
          }
        }
        else {
          if (bVar16 < 2) {
            plVar12 = (long *)((ulong)plVar12 & (long)plVar14 - 1U);
          }
          else if (plVar14 <= plVar12) {
            uVar8 = 0;
            if (plVar14 != (long *)0x0) {
              uVar8 = (ulong)plVar12 / (ulong)plVar14;
            }
            plVar12 = (long *)((long)plVar12 - uVar8 * (long)plVar14);
          }
          if (plVar12 != unaff_x26) break;
        }
        plVar13 = (long *)*plVar13;
      } while (plVar13 != (long *)0x0);
    }
  }
  plVar12 = param_1 + 2;
  plVar13 = operator_new(0x28);
  lVar9 = param_1[3];
  fVar17 = *(float *)(param_1 + 4);
  lVar6 = *(long *)*param_4;
  *plVar13 = 0;
  plVar13[1] = (long)plVar15;
  plVar13[4] = 0;
  plVar13[2] = lVar6;
  plVar13[3] = 0;
  plVar2 = plVar13;
  if ((plVar14 != (long *)0x0) && ((float)(lVar9 + 1) <= fVar17 * (float)plVar14))
  goto LAB_0080e79c;
  if (plVar14 < (long *)0x3) {
    uVar5 = 1;
  }
  else {
    uVar5 = (ulong)(((ulong)plVar14 & (long)plVar14 - 1U) != 0);
  }
  plVar7 = (long *)(uVar5 | (long)plVar14 << 1);
  plVar11 = (long *)(long)((float)(lVar9 + 1) / fVar17);
  if (plVar7 <= plVar11) {
    plVar7 = plVar11;
  }
  if ((long)plVar7 - 1U == 0) {
    plVar7 = (long *)0x2;
  }
  else if (((ulong)plVar7 & (long)plVar7 - 1U) != 0) {
                    /* try { // try from 0080e6d0 to 0080e75b has its CatchHandler @ 0080e840 */
    plVar2 = (long *)std::__ndk1::__next_prime((ulong)plVar7);
    plVar14 = (long *)param_1[1];
    plVar7 = plVar2;
  }
  if (plVar14 < plVar7) {
LAB_0080e6e8:
    plVar2 = (long *)FUN_0080e868(param_1,plVar7);
  }
  else if (plVar7 < plVar14) {
    plVar2 = (long *)(long)((float)(ulong)param_1[3] / *(float *)(param_1 + 4));
    if ((plVar14 < (long *)0x3) ||
       (1 < (byte)(POPCOUNT((char)plVar14) + POPCOUNT((char)((ulong)plVar14 >> 8)) +
                   POPCOUNT((char)((ulong)plVar14 >> 0x10)) +
                   POPCOUNT((char)((ulong)plVar14 >> 0x18)) +
                   POPCOUNT((char)((ulong)plVar14 >> 0x20)) +
                   POPCOUNT((char)((ulong)plVar14 >> 0x28)) +
                   POPCOUNT((char)((ulong)plVar14 >> 0x30)) +
                  POPCOUNT((char)((ulong)plVar14 >> 0x38))))) {
      plVar2 = (long *)std::__ndk1::__next_prime((ulong)plVar2);
    }
    else if ((long *)0x1 < plVar2) {
      plVar2 = (long *)(1L << (-LZCOUNT((long)plVar2 + -1) & 0x3fU));
    }
    if (plVar7 <= plVar2) {
      plVar7 = plVar2;
    }
    if (plVar7 < plVar14) goto LAB_0080e6e8;
  }
  plVar14 = (long *)param_1[1];
  if (((ulong)plVar14 & (long)plVar14 - 1U) == 0) {
    unaff_x26 = (long *)((long)plVar14 - 1U & (ulong)plVar15);
  }
  else if (plVar15 < plVar14) {
    unaff_x26 = plVar15;
  }
  else {
    uVar5 = 0;
    if (plVar14 != (long *)0x0) {
      uVar5 = (ulong)plVar15 / (ulong)plVar14;
    }
    unaff_x26 = (long *)((long)plVar15 - uVar5 * (long)plVar14);
  }
LAB_0080e79c:
  lVar6 = *param_1;
  plVar15 = *(long **)(lVar6 + (long)unaff_x26 * 8);
  if (plVar15 == (long *)0x0) {
    lVar9 = *plVar12;
    *plVar12 = (long)plVar13;
    *plVar13 = lVar9;
    *(long **)(lVar6 + (long)unaff_x26 * 8) = plVar12;
    if (*plVar13 != 0) {
      plVar15 = *(long **)(*plVar13 + 8);
      if (((ulong)plVar14 & (long)plVar14 - 1U) == 0) {
        *(long **)(lVar6 + ((ulong)plVar15 & (long)plVar14 - 1U) * 8) = plVar13;
      }
      else {
        if (plVar14 <= plVar15) {
          uVar5 = 0;
          if (plVar14 != (long *)0x0) {
            uVar5 = (ulong)plVar15 / (ulong)plVar14;
          }
          plVar15 = (long *)((long)plVar15 - uVar5 * (long)plVar14);
        }
        *(long **)(lVar6 + (long)plVar15 * 8) = plVar13;
      }
    }
  }
  else {
    *plVar13 = *plVar15;
    *plVar15 = (long)plVar13;
  }
  uVar3 = 1;
  param_1[3] = param_1[3] + 1;
  param_1 = plVar2;
LAB_0080e7c4:
  if (*(long *)(lVar1 + 0x28) != lVar4) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(param_1,uVar3);
  }
  return plVar13;
}

