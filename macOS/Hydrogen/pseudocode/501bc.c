
long * FUN_000501bc(ulong param_1)

{
  undefined1 in_CY;
  long *plVar1;
  long *plVar2;
  ulong uVar3;
  ulong uVar4;
  long lVar5;
  long *unaff_x19;
  long *unaff_x20;
  undefined4 *unaff_x21;
  ulong unaff_x22;
  ulong unaff_x23;
  ulong unaff_x24;
  undefined2 uVar6;
  undefined8 uVar7;
  
  while( true ) {
    if ((bool)in_CY) {
      uVar3 = 0;
      if (unaff_x23 != 0) {
        uVar3 = param_1 / unaff_x23;
      }
      param_1 = param_1 - uVar3 * unaff_x23;
    }
    if (param_1 != unaff_x24) break;
    while( true ) {
      unaff_x20 = (long *)*unaff_x20;
      if (unaff_x20 == (long *)0x0) goto code_r0x00050214;
      param_1 = unaff_x20[1];
      if (param_1 != unaff_x22) break;
      if ((uint)*(byte *)(unaff_x20 + 2) == (uint)unaff_x22) {
        return unaff_x20;
      }
    }
    in_CY = unaff_x23 <= param_1;
  }
code_r0x00050214:
  plVar1 = (long *)__Znwm(0x18);
  *plVar1 = 0;
  plVar1[1] = unaff_x22;
  *(undefined4 *)(plVar1 + 2) = *unaff_x21;
  if ((unaff_x23 == 0) || (*(float *)(unaff_x19 + 4) * (float)unaff_x23 < (float)(unaff_x19[3] + 1))
     ) {
    uVar3 = 1;
    if (2 < unaff_x23) {
      uVar3 = (ulong)((unaff_x23 & unaff_x23 - 1) != 0);
    }
    uVar3 = uVar3 | unaff_x23 << 1;
    uVar4 = (ulong)((float)(unaff_x19[3] + 1) / *(float *)(unaff_x19 + 4));
    if (uVar3 <= uVar4) {
      uVar3 = uVar4;
    }
    if (uVar3 - 1 == 0) {
      uVar3 = 2;
    }
    else if ((uVar3 & uVar3 - 1) != 0) {
      uVar3 = __ZNSt3__112__next_primeEm(uVar3);
      unaff_x23 = unaff_x19[1];
    }
    if (unaff_x23 < uVar3) {
LAB_000502b8:
      func_0x000280c4();
    }
    else if (uVar3 < unaff_x23) {
      uVar4 = (ulong)((float)(ulong)unaff_x19[3] / *(float *)(unaff_x19 + 4));
      if ((unaff_x23 < 3) ||
         (uVar7 = CONCAT17(POPCOUNT((char)(unaff_x23 >> 0x38)),
                           CONCAT16(POPCOUNT((char)(unaff_x23 >> 0x30)),
                                    CONCAT15(POPCOUNT((char)(unaff_x23 >> 0x28)),
                                             CONCAT14(POPCOUNT((char)(unaff_x23 >> 0x20)),
                                                      CONCAT13(POPCOUNT((char)(unaff_x23 >> 0x18)),
                                                               CONCAT12(POPCOUNT((char)(unaff_x23 >>
                                                                                       0x10)),
                                                                        CONCAT11(POPCOUNT((char)(
                                                  unaff_x23 >> 8)),POPCOUNT((char)unaff_x23)))))))),
         uVar6 = NEON_uaddlv(uVar7,1),
         1 < (CONCAT62((int6)((ulong)uVar7 >> 0x10),uVar6) & 0xffffffff))) {
        uVar4 = __ZNSt3__112__next_primeEm();
      }
      else if (1 < uVar4) {
        uVar4 = 1L << (-LZCOUNT(uVar4 - 1) & 0x3fU);
      }
      if (uVar3 <= uVar4) {
        uVar3 = uVar4;
      }
      if (uVar3 < unaff_x23) goto LAB_000502b8;
    }
    unaff_x23 = unaff_x19[1];
    if ((unaff_x23 & unaff_x23 - 1) == 0) {
      unaff_x22 = (int)unaff_x23 - 1 & unaff_x22;
    }
    else if (unaff_x23 <= unaff_x22) {
      uVar3 = 0;
      if (unaff_x23 != 0) {
        uVar3 = unaff_x22 / unaff_x23;
      }
      unaff_x22 = unaff_x22 - uVar3 * unaff_x23;
    }
  }
  else {
    unaff_x22 = unaff_x24;
  }
  lVar5 = *unaff_x19;
  plVar2 = *(long **)(lVar5 + unaff_x22 * 8);
  if (plVar2 == (long *)0x0) {
    plVar2 = unaff_x19 + 2;
    *plVar1 = *plVar2;
    *plVar2 = (long)plVar1;
    *(long **)(lVar5 + unaff_x22 * 8) = plVar2;
    if (*plVar1 == 0) goto code_r0x000503c8;
    uVar3 = *(ulong *)(*plVar1 + 8);
    if ((unaff_x23 & unaff_x23 - 1) == 0) {
      uVar3 = uVar3 & unaff_x23 - 1;
    }
    else if (unaff_x23 <= uVar3) {
      uVar4 = 0;
      if (unaff_x23 != 0) {
        uVar4 = uVar3 / unaff_x23;
      }
      uVar3 = uVar3 - uVar4 * unaff_x23;
    }
    plVar2 = (long *)(*unaff_x19 + uVar3 * 8);
  }
  else {
    *plVar1 = *plVar2;
  }
  *plVar2 = (long)plVar1;
code_r0x000503c8:
  unaff_x19[3] = unaff_x19[3] + 1;
  return plVar1;
}

