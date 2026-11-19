/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0080837c
 */

long * FUN_0080837c(long *param_1,ulong *param_2,long *param_3)

{
  long lVar1;
  long *plVar2;
  long *plVar3;
  ulong uVar4;
  ulong uVar5;
  long lVar6;
  ulong uVar7;
  ulong uVar8;
  ulong unaff_x24;
  byte bVar9;
  float fVar10;
  
  uVar7 = param_1[1];
  uVar8 = *param_2;
  if (uVar7 != 0) {
    bVar9 = POPCOUNT((char)uVar7) + POPCOUNT((char)(uVar7 >> 8)) + POPCOUNT((char)(uVar7 >> 0x10)) +
            POPCOUNT((char)(uVar7 >> 0x18)) + POPCOUNT((char)(uVar7 >> 0x20)) +
            POPCOUNT((char)(uVar7 >> 0x28)) + POPCOUNT((char)(uVar7 >> 0x30)) +
            POPCOUNT((char)(uVar7 >> 0x38));
    if (bVar9 < 2) {
      unaff_x24 = uVar7 - 1 & uVar8;
    }
    else {
      unaff_x24 = uVar8;
      if (uVar7 <= uVar8) {
        uVar4 = 0;
        if (uVar7 != 0) {
          uVar4 = uVar8 / uVar7;
        }
        unaff_x24 = uVar8 - uVar4 * uVar7;
      }
    }
    plVar2 = *(long **)(*param_1 + unaff_x24 * 8);
    if ((plVar2 != (long *)0x0) && (plVar2 = (long *)*plVar2, plVar2 != (long *)0x0)) {
      do {
        uVar4 = plVar2[1];
        if (uVar4 == uVar8) {
          if (plVar2[2] == uVar8) {
            return plVar2;
          }
        }
        else {
          if (bVar9 < 2) {
            uVar4 = uVar4 & uVar7 - 1;
          }
          else if (uVar7 <= uVar4) {
            uVar5 = 0;
            if (uVar7 != 0) {
              uVar5 = uVar4 / uVar7;
            }
            uVar4 = uVar4 - uVar5 * uVar7;
          }
          if (uVar4 != unaff_x24) break;
        }
        plVar2 = (long *)*plVar2;
      } while (plVar2 != (long *)0x0);
    }
  }
  plVar2 = operator_new(0x18);
  lVar1 = param_1[3];
  fVar10 = *(float *)(param_1 + 4);
  *plVar2 = 0;
  plVar2[1] = uVar8;
  plVar2[2] = *param_3;
  if ((uVar7 != 0) && ((float)(lVar1 + 1) <= fVar10 * (float)uVar7)) goto LAB_00808598;
  if (uVar7 < 3) {
    uVar4 = 1;
  }
  else {
    uVar4 = (ulong)((uVar7 & uVar7 - 1) != 0);
  }
  uVar4 = uVar4 | uVar7 << 1;
  uVar5 = (ulong)((float)(lVar1 + 1) / fVar10);
  if (uVar4 <= uVar5) {
    uVar4 = uVar5;
  }
  if (uVar4 - 1 == 0) {
    uVar4 = 2;
  }
  else if ((uVar4 & uVar4 - 1) != 0) {
                    /* try { // try from 008084cc to 00808557 has its CatchHandler @ 00808628 */
    uVar4 = std::__ndk1::__next_prime(uVar4);
    uVar7 = param_1[1];
  }
  if (uVar7 < uVar4) {
LAB_008084e4:
    FUN_00808640(param_1,uVar4);
  }
  else if (uVar4 < uVar7) {
    uVar5 = (ulong)((float)(ulong)param_1[3] / *(float *)(param_1 + 4));
    if ((uVar7 < 3) ||
       (1 < (byte)(POPCOUNT((char)uVar7) + POPCOUNT((char)(uVar7 >> 8)) +
                   POPCOUNT((char)(uVar7 >> 0x10)) + POPCOUNT((char)(uVar7 >> 0x18)) +
                   POPCOUNT((char)(uVar7 >> 0x20)) + POPCOUNT((char)(uVar7 >> 0x28)) +
                   POPCOUNT((char)(uVar7 >> 0x30)) + POPCOUNT((char)(uVar7 >> 0x38))))) {
      uVar5 = std::__ndk1::__next_prime(uVar5);
    }
    else if (1 < uVar5) {
      uVar5 = 1L << (-LZCOUNT(uVar5 - 1) & 0x3fU);
    }
    if (uVar4 <= uVar5) {
      uVar4 = uVar5;
    }
    if (uVar4 < uVar7) goto LAB_008084e4;
  }
  uVar7 = param_1[1];
  if ((uVar7 & uVar7 - 1) == 0) {
    unaff_x24 = uVar7 - 1 & uVar8;
  }
  else if (uVar8 < uVar7) {
    unaff_x24 = uVar8;
  }
  else {
    uVar4 = 0;
    if (uVar7 != 0) {
      uVar4 = uVar8 / uVar7;
    }
    unaff_x24 = uVar8 - uVar4 * uVar7;
  }
LAB_00808598:
  lVar1 = *param_1;
  plVar3 = *(long **)(lVar1 + unaff_x24 * 8);
  if (plVar3 == (long *)0x0) {
    plVar3 = param_1 + 2;
    lVar6 = *plVar3;
    *plVar3 = (long)plVar2;
    *plVar2 = lVar6;
    *(long **)(lVar1 + unaff_x24 * 8) = plVar3;
    if (*plVar2 != 0) {
      uVar8 = *(ulong *)(*plVar2 + 8);
      if ((uVar7 & uVar7 - 1) == 0) {
        *(long **)(lVar1 + (uVar8 & uVar7 - 1) * 8) = plVar2;
      }
      else {
        if (uVar7 <= uVar8) {
          uVar4 = 0;
          if (uVar7 != 0) {
            uVar4 = uVar8 / uVar7;
          }
          uVar8 = uVar8 - uVar4 * uVar7;
        }
        *(long **)(lVar1 + uVar8 * 8) = plVar2;
      }
    }
  }
  else {
    *plVar2 = *plVar3;
    *plVar3 = (long)plVar2;
  }
  param_1[3] = param_1[3] + 1;
  return plVar2;
}

