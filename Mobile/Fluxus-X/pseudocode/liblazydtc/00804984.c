/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00804984
 */

long * FUN_00804984(long *param_1,ulong *param_2,undefined8 param_3,undefined8 *param_4)

{
  ulong uVar1;
  ulong uVar2;
  long lVar3;
  long *plVar4;
  long lVar5;
  ulong uVar6;
  long *plVar7;
  ulong uVar8;
  ulong uVar9;
  ulong unaff_x24;
  byte bVar10;
  float fVar11;
  
  uVar2 = *param_2;
  uVar9 = param_1[1];
  uVar6 = ((ulong)(uint)((int)uVar2 << 3) + 8 ^ uVar2 >> 0x20) * -0x622015f714c7d297;
  uVar6 = (uVar2 >> 0x20 ^ uVar6 >> 0x2f ^ uVar6) * -0x622015f714c7d297;
  uVar6 = (uVar6 ^ uVar6 >> 0x2f) * -0x622015f714c7d297;
  if (uVar9 != 0) {
    bVar10 = POPCOUNT((char)uVar9) + POPCOUNT((char)(uVar9 >> 8)) + POPCOUNT((char)(uVar9 >> 0x10))
             + POPCOUNT((char)(uVar9 >> 0x18)) + POPCOUNT((char)(uVar9 >> 0x20)) +
             POPCOUNT((char)(uVar9 >> 0x28)) + POPCOUNT((char)(uVar9 >> 0x30)) +
             POPCOUNT((char)(uVar9 >> 0x38));
    if (bVar10 < 2) {
      unaff_x24 = uVar6 & uVar9 - 1;
    }
    else {
      unaff_x24 = uVar6;
      if (uVar9 <= uVar6) {
        uVar8 = 0;
        if (uVar9 != 0) {
          uVar8 = uVar6 / uVar9;
        }
        unaff_x24 = uVar6 - uVar8 * uVar9;
      }
    }
    plVar7 = *(long **)(*param_1 + unaff_x24 * 8);
    if ((plVar7 != (long *)0x0) && (plVar7 = (long *)*plVar7, plVar7 != (long *)0x0)) {
      do {
        uVar8 = plVar7[1];
        if (uVar8 == uVar6) {
          if (plVar7[2] == uVar2) {
            return plVar7;
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
        plVar7 = (long *)*plVar7;
      } while (plVar7 != (long *)0x0);
    }
  }
  plVar7 = operator_new(0x20);
  lVar3 = param_1[3];
  plVar4 = (long *)*param_4;
  fVar11 = *(float *)(param_1 + 4);
  *plVar7 = 0;
  plVar7[1] = uVar6;
  lVar5 = *plVar4;
  *(undefined4 *)(plVar7 + 3) = 0;
  plVar7[2] = lVar5;
  if ((uVar9 != 0) && ((float)(lVar3 + 1) <= fVar11 * (float)uVar9)) goto LAB_00804be0;
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
                    /* try { // try from 00804b14 to 00804b9f has its CatchHandler @ 00804c70 */
    uVar2 = std::__ndk1::__next_prime(uVar2);
    uVar9 = param_1[1];
  }
  if (uVar9 < uVar2) {
LAB_00804b2c:
    FUN_00804c88(param_1,uVar2);
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
    if (uVar2 < uVar9) goto LAB_00804b2c;
  }
  uVar9 = param_1[1];
  if ((uVar9 & uVar9 - 1) == 0) {
    unaff_x24 = uVar9 - 1 & uVar6;
  }
  else if (uVar6 < uVar9) {
    unaff_x24 = uVar6;
  }
  else {
    uVar2 = 0;
    if (uVar9 != 0) {
      uVar2 = uVar6 / uVar9;
    }
    unaff_x24 = uVar6 - uVar2 * uVar9;
  }
LAB_00804be0:
  lVar3 = *param_1;
  plVar4 = *(long **)(lVar3 + unaff_x24 * 8);
  if (plVar4 == (long *)0x0) {
    plVar4 = param_1 + 2;
    lVar5 = *plVar4;
    *plVar4 = (long)plVar7;
    *plVar7 = lVar5;
    *(long **)(lVar3 + unaff_x24 * 8) = plVar4;
    if (*plVar7 != 0) {
      uVar2 = *(ulong *)(*plVar7 + 8);
      if ((uVar9 & uVar9 - 1) == 0) {
        *(long **)(lVar3 + (uVar2 & uVar9 - 1) * 8) = plVar7;
      }
      else {
        if (uVar9 <= uVar2) {
          uVar6 = 0;
          if (uVar9 != 0) {
            uVar6 = uVar2 / uVar9;
          }
          uVar2 = uVar2 - uVar6 * uVar9;
        }
        *(long **)(lVar3 + uVar2 * 8) = plVar7;
      }
    }
  }
  else {
    *plVar7 = *plVar4;
    *plVar4 = (long)plVar7;
  }
  param_1[3] = param_1[3] + 1;
  return plVar7;
}

