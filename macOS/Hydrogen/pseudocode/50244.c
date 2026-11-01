
void FUN_00050244(float param_1,float param_2,float param_3)

{
  ulong uVar1;
  long *plVar2;
  ulong uVar3;
  long lVar4;
  long *unaff_x19;
  long *unaff_x20;
  ulong unaff_x22;
  ulong unaff_x23;
  ulong unaff_x24;
  undefined2 uVar5;
  undefined8 uVar6;
  
  if (param_2 * param_3 < param_1) {
    uVar3 = 1;
    if (2 < unaff_x23) {
      uVar3 = (ulong)((unaff_x23 & unaff_x23 - 1) != 0);
    }
    uVar3 = uVar3 | unaff_x23 << 1;
    if (uVar3 <= (ulong)(long)(param_1 / param_2)) {
      uVar3 = (long)(param_1 / param_2);
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
      uVar1 = (ulong)((float)(ulong)unaff_x19[3] / *(float *)(unaff_x19 + 4));
      if ((unaff_x23 < 3) ||
         (uVar6 = CONCAT17(POPCOUNT((char)(unaff_x23 >> 0x38)),
                           CONCAT16(POPCOUNT((char)(unaff_x23 >> 0x30)),
                                    CONCAT15(POPCOUNT((char)(unaff_x23 >> 0x28)),
                                             CONCAT14(POPCOUNT((char)(unaff_x23 >> 0x20)),
                                                      CONCAT13(POPCOUNT((char)(unaff_x23 >> 0x18)),
                                                               CONCAT12(POPCOUNT((char)(unaff_x23 >>
                                                                                       0x10)),
                                                                        CONCAT11(POPCOUNT((char)(
                                                  unaff_x23 >> 8)),POPCOUNT((char)unaff_x23)))))))),
         uVar5 = NEON_uaddlv(uVar6,1),
         1 < (CONCAT62((int6)((ulong)uVar6 >> 0x10),uVar5) & 0xffffffff))) {
        uVar1 = __ZNSt3__112__next_primeEm();
      }
      else if (1 < uVar1) {
        uVar1 = 1L << (-LZCOUNT(uVar1 - 1) & 0x3fU);
      }
      if (uVar3 <= uVar1) {
        uVar3 = uVar1;
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
  lVar4 = *unaff_x19;
  plVar2 = *(long **)(lVar4 + unaff_x22 * 8);
  if (plVar2 == (long *)0x0) {
    plVar2 = unaff_x19 + 2;
    *unaff_x20 = *plVar2;
    *plVar2 = (long)unaff_x20;
    *(long **)(lVar4 + unaff_x22 * 8) = plVar2;
    if (*unaff_x20 == 0) goto code_r0x000503c8;
    uVar3 = *(ulong *)(*unaff_x20 + 8);
    if ((unaff_x23 & unaff_x23 - 1) == 0) {
      uVar3 = uVar3 & unaff_x23 - 1;
    }
    else if (unaff_x23 <= uVar3) {
      uVar1 = 0;
      if (unaff_x23 != 0) {
        uVar1 = uVar3 / unaff_x23;
      }
      uVar3 = uVar3 - uVar1 * unaff_x23;
    }
    plVar2 = (long *)(*unaff_x19 + uVar3 * 8);
  }
  else {
    *unaff_x20 = *plVar2;
  }
  *plVar2 = (long)unaff_x20;
code_r0x000503c8:
  unaff_x19[3] = unaff_x19[3] + 1;
  return;
}

