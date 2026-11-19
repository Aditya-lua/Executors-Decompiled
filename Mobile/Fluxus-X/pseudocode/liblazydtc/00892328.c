/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00892328
 */

long * FUN_00892328(long *param_1,int *param_2,undefined8 param_3,undefined8 *param_4)

{
  undefined4 uVar1;
  long lVar2;
  long *plVar3;
  undefined4 *puVar4;
  long *plVar5;
  ulong uVar6;
  ulong uVar7;
  long lVar8;
  ulong uVar9;
  ulong uVar10;
  ulong unaff_x24;
  byte bVar11;
  float fVar12;
  
  uVar9 = param_1[1];
  uVar10 = (ulong)*param_2;
  if (uVar9 != 0) {
    bVar11 = POPCOUNT((char)uVar9) + POPCOUNT((char)(uVar9 >> 8)) + POPCOUNT((char)(uVar9 >> 0x10))
             + POPCOUNT((char)(uVar9 >> 0x18)) + POPCOUNT((char)(uVar9 >> 0x20)) +
             POPCOUNT((char)(uVar9 >> 0x28)) + POPCOUNT((char)(uVar9 >> 0x30)) +
             POPCOUNT((char)(uVar9 >> 0x38));
    if (bVar11 < 2) {
      unaff_x24 = uVar9 - 1 & uVar10;
    }
    else {
      unaff_x24 = uVar10;
      if (uVar9 <= uVar10) {
        uVar6 = 0;
        if (uVar9 != 0) {
          uVar6 = uVar10 / uVar9;
        }
        unaff_x24 = uVar10 - uVar6 * uVar9;
      }
    }
    plVar3 = *(long **)(*param_1 + unaff_x24 * 8);
    if ((plVar3 != (long *)0x0) && (plVar3 = (long *)*plVar3, plVar3 != (long *)0x0)) {
      do {
        uVar6 = plVar3[1];
        if (uVar6 == uVar10) {
          if ((int)plVar3[2] == *param_2) {
            return plVar3;
          }
        }
        else {
          if (bVar11 < 2) {
            uVar6 = uVar6 & uVar9 - 1;
          }
          else if (uVar9 <= uVar6) {
            uVar7 = 0;
            if (uVar9 != 0) {
              uVar7 = uVar6 / uVar9;
            }
            uVar6 = uVar6 - uVar7 * uVar9;
          }
          if (uVar6 != unaff_x24) break;
        }
        plVar3 = (long *)*plVar3;
      } while (plVar3 != (long *)0x0);
    }
  }
  plVar3 = operator_new(0x20);
  lVar2 = param_1[3];
  puVar4 = (undefined4 *)*param_4;
  fVar12 = *(float *)(param_1 + 4);
  *plVar3 = 0;
  plVar3[1] = uVar10;
  uVar1 = *puVar4;
  plVar3[3] = 0;
  *(undefined4 *)(plVar3 + 2) = uVar1;
  if ((uVar9 != 0) && ((float)(lVar2 + 1) <= fVar12 * (float)uVar9)) goto LAB_0089254c;
  if (uVar9 < 3) {
    uVar6 = 1;
  }
  else {
    uVar6 = (ulong)((uVar9 & uVar9 - 1) != 0);
  }
  uVar6 = uVar6 | uVar9 << 1;
  uVar7 = (ulong)((float)(lVar2 + 1) / fVar12);
  if (uVar6 <= uVar7) {
    uVar6 = uVar7;
  }
  if (uVar6 - 1 == 0) {
    uVar6 = 2;
  }
  else if ((uVar6 & uVar6 - 1) != 0) {
                    /* try { // try from 00892480 to 0089250b has its CatchHandler @ 008925dc */
    uVar6 = std::__ndk1::__next_prime(uVar6);
    uVar9 = param_1[1];
  }
  if (uVar9 < uVar6) {
LAB_00892498:
    FUN_008925f4(param_1,uVar6);
  }
  else if (uVar6 < uVar9) {
    uVar7 = (ulong)((float)(ulong)param_1[3] / *(float *)(param_1 + 4));
    if ((uVar9 < 3) ||
       (1 < (byte)(POPCOUNT((char)uVar9) + POPCOUNT((char)(uVar9 >> 8)) +
                   POPCOUNT((char)(uVar9 >> 0x10)) + POPCOUNT((char)(uVar9 >> 0x18)) +
                   POPCOUNT((char)(uVar9 >> 0x20)) + POPCOUNT((char)(uVar9 >> 0x28)) +
                   POPCOUNT((char)(uVar9 >> 0x30)) + POPCOUNT((char)(uVar9 >> 0x38))))) {
      uVar7 = std::__ndk1::__next_prime(uVar7);
    }
    else if (1 < uVar7) {
      uVar7 = 1L << (-LZCOUNT(uVar7 - 1) & 0x3fU);
    }
    if (uVar6 <= uVar7) {
      uVar6 = uVar7;
    }
    if (uVar6 < uVar9) goto LAB_00892498;
  }
  uVar9 = param_1[1];
  if ((uVar9 & uVar9 - 1) == 0) {
    unaff_x24 = uVar9 - 1 & uVar10;
  }
  else if (uVar10 < uVar9) {
    unaff_x24 = uVar10;
  }
  else {
    uVar6 = 0;
    if (uVar9 != 0) {
      uVar6 = uVar10 / uVar9;
    }
    unaff_x24 = uVar10 - uVar6 * uVar9;
  }
LAB_0089254c:
  lVar2 = *param_1;
  plVar5 = *(long **)(lVar2 + unaff_x24 * 8);
  if (plVar5 == (long *)0x0) {
    plVar5 = param_1 + 2;
    lVar8 = *plVar5;
    *plVar5 = (long)plVar3;
    *plVar3 = lVar8;
    *(long **)(lVar2 + unaff_x24 * 8) = plVar5;
    if (*plVar3 != 0) {
      uVar10 = *(ulong *)(*plVar3 + 8);
      if ((uVar9 & uVar9 - 1) == 0) {
        *(long **)(lVar2 + (uVar10 & uVar9 - 1) * 8) = plVar3;
      }
      else {
        if (uVar9 <= uVar10) {
          uVar6 = 0;
          if (uVar9 != 0) {
            uVar6 = uVar10 / uVar9;
          }
          uVar10 = uVar10 - uVar6 * uVar9;
        }
        *(long **)(lVar2 + uVar10 * 8) = plVar3;
      }
    }
  }
  else {
    *plVar3 = *plVar5;
    *plVar5 = (long)plVar3;
  }
  param_1[3] = param_1[3] + 1;
  return plVar3;
}

