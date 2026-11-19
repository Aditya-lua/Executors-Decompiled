/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0080dc08
 */

long * FUN_0080dc08(long *param_1,ulong *param_2,long *param_3)

{
  ulong uVar1;
  ulong uVar2;
  long lVar3;
  long *plVar4;
  ulong uVar5;
  long *plVar6;
  long lVar7;
  ulong uVar8;
  ulong uVar9;
  ulong unaff_x24;
  byte bVar10;
  float fVar11;
  
  uVar2 = *param_2;
  uVar9 = param_1[1];
  uVar5 = ((ulong)(uint)((int)uVar2 << 3) + 8 ^ uVar2 >> 0x20) * -0x622015f714c7d297;
  uVar5 = (uVar2 >> 0x20 ^ uVar5 >> 0x2f ^ uVar5) * -0x622015f714c7d297;
  uVar5 = (uVar5 ^ uVar5 >> 0x2f) * -0x622015f714c7d297;
  if (uVar9 != 0) {
    bVar10 = POPCOUNT((char)uVar9) + POPCOUNT((char)(uVar9 >> 8)) + POPCOUNT((char)(uVar9 >> 0x10))
             + POPCOUNT((char)(uVar9 >> 0x18)) + POPCOUNT((char)(uVar9 >> 0x20)) +
             POPCOUNT((char)(uVar9 >> 0x28)) + POPCOUNT((char)(uVar9 >> 0x30)) +
             POPCOUNT((char)(uVar9 >> 0x38));
    if (bVar10 < 2) {
      unaff_x24 = uVar5 & uVar9 - 1;
    }
    else {
      unaff_x24 = uVar5;
      if (uVar9 <= uVar5) {
        uVar8 = 0;
        if (uVar9 != 0) {
          uVar8 = uVar5 / uVar9;
        }
        unaff_x24 = uVar5 - uVar8 * uVar9;
      }
    }
    plVar6 = *(long **)(*param_1 + unaff_x24 * 8);
    if ((plVar6 != (long *)0x0) && (plVar6 = (long *)*plVar6, plVar6 != (long *)0x0)) {
      do {
        uVar8 = plVar6[1];
        if (uVar8 == uVar5) {
          if (plVar6[2] == uVar2) {
            return plVar6;
          }
        }
        else {
          if (bVar10 < 2) {
            uVar8 = uVar8 & uVar9 - 1;
          }
          else if (uVar9 <= uVar8) {
            uVar1 = 0;
            if (uVar9 != 0) {
              uVar1 = uVar8 / uVar9;
            }
            uVar8 = uVar8 - uVar1 * uVar9;
          }
          if (uVar8 != unaff_x24) break;
        }
        plVar6 = (long *)*plVar6;
      } while (plVar6 != (long *)0x0);
    }
  }
  plVar6 = operator_new(0x18);
  lVar3 = param_1[3];
  fVar11 = *(float *)(param_1 + 4);
  *plVar6 = 0;
  plVar6[1] = uVar5;
  plVar6[2] = *param_3;
  if ((uVar9 != 0) && ((float)(lVar3 + 1) <= fVar11 * (float)uVar9)) goto LAB_0080de5c;
  if (uVar9 < 3) {
    uVar2 = 1;
  }
  else {
    uVar2 = (ulong)((uVar9 & uVar9 - 1) != 0);
  }
  uVar2 = uVar2 | uVar9 << 1;
  uVar8 = (ulong)((float)(lVar3 + 1) / fVar11);
  if (uVar2 <= uVar8) {
    uVar2 = uVar8;
  }
  if (uVar2 - 1 == 0) {
    uVar2 = 2;
  }
  else if ((uVar2 & uVar2 - 1) != 0) {
                    /* try { // try from 0080dd90 to 0080de1b has its CatchHandler @ 0080deec */
    uVar2 = std::__ndk1::__next_prime(uVar2);
    uVar9 = param_1[1];
  }
  if (uVar9 < uVar2) {
LAB_0080dda8:
    FUN_00808210(param_1,uVar2);
  }
  else if (uVar2 < uVar9) {
    uVar8 = (ulong)((float)(ulong)param_1[3] / *(float *)(param_1 + 4));
    if ((uVar9 < 3) ||
       (1 < (byte)(POPCOUNT((char)uVar9) + POPCOUNT((char)(uVar9 >> 8)) +
                   POPCOUNT((char)(uVar9 >> 0x10)) + POPCOUNT((char)(uVar9 >> 0x18)) +
                   POPCOUNT((char)(uVar9 >> 0x20)) + POPCOUNT((char)(uVar9 >> 0x28)) +
                   POPCOUNT((char)(uVar9 >> 0x30)) + POPCOUNT((char)(uVar9 >> 0x38))))) {
      uVar8 = std::__ndk1::__next_prime(uVar8);
    }
    else if (1 < uVar8) {
      uVar8 = 1L << (-LZCOUNT(uVar8 - 1) & 0x3fU);
    }
    if (uVar2 <= uVar8) {
      uVar2 = uVar8;
    }
    if (uVar2 < uVar9) goto LAB_0080dda8;
  }
  uVar9 = param_1[1];
  if ((uVar9 & uVar9 - 1) == 0) {
    unaff_x24 = uVar9 - 1 & uVar5;
  }
  else if (uVar5 < uVar9) {
    unaff_x24 = uVar5;
  }
  else {
    uVar2 = 0;
    if (uVar9 != 0) {
      uVar2 = uVar5 / uVar9;
    }
    unaff_x24 = uVar5 - uVar2 * uVar9;
  }
LAB_0080de5c:
  lVar3 = *param_1;
  plVar4 = *(long **)(lVar3 + unaff_x24 * 8);
  if (plVar4 == (long *)0x0) {
    plVar4 = param_1 + 2;
    lVar7 = *plVar4;
    *plVar4 = (long)plVar6;
    *plVar6 = lVar7;
    *(long **)(lVar3 + unaff_x24 * 8) = plVar4;
    if (*plVar6 != 0) {
      uVar2 = *(ulong *)(*plVar6 + 8);
      if ((uVar9 & uVar9 - 1) == 0) {
        *(long **)(lVar3 + (uVar2 & uVar9 - 1) * 8) = plVar6;
      }
      else {
        if (uVar9 <= uVar2) {
          uVar5 = 0;
          if (uVar9 != 0) {
            uVar5 = uVar2 / uVar9;
          }
          uVar2 = uVar2 - uVar5 * uVar9;
        }
        *(long **)(lVar3 + uVar2 * 8) = plVar6;
      }
    }
  }
  else {
    *plVar6 = *plVar4;
    *plVar4 = (long)plVar6;
  }
  param_1[3] = param_1[3] + 1;
  return plVar6;
}

