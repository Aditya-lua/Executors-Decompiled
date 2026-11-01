
long * FUN_000928e8(long param_1)

{
  long *plVar1;
  long *plVar2;
  ulong uVar3;
  long lVar4;
  ulong uVar5;
  long *unaff_x19;
  long *unaff_x20;
  long *unaff_x21;
  ulong unaff_x22;
  ulong unaff_x23;
  ulong unaff_x24;
  undefined2 uVar6;
  undefined8 uVar7;
  
  do {
    if (unaff_x20[1] == unaff_x23) {
      if (unaff_x20[2] == param_1) {
        return unaff_x20;
      }
    }
    else if ((unaff_x20[1] & unaff_x22 - 1) != unaff_x24) break;
    unaff_x20 = (long *)*unaff_x20;
  } while (unaff_x20 != (long *)0x0);
  plVar1 = (long *)__Znwm(0x20);
  *plVar1 = 0;
  plVar1[1] = unaff_x23;
  lVar4 = *unaff_x21;
  plVar1[3] = unaff_x21[1];
  plVar1[2] = lVar4;
  if ((unaff_x22 == 0) || (*(float *)(unaff_x19 + 4) * (float)unaff_x22 < (float)(unaff_x19[3] + 1))
     ) {
    uVar3 = 1;
    if (2 < unaff_x22) {
      uVar3 = (ulong)((unaff_x22 & unaff_x22 - 1) != 0);
    }
    uVar3 = uVar3 | unaff_x22 << 1;
    uVar5 = (ulong)((float)(unaff_x19[3] + 1) / *(float *)(unaff_x19 + 4));
    if (uVar3 <= uVar5) {
      uVar3 = uVar5;
    }
    if (uVar3 - 1 == 0) {
      uVar3 = 2;
    }
    else if ((uVar3 & uVar3 - 1) != 0) {
      uVar3 = __ZNSt3__112__next_primeEm(uVar3);
      unaff_x22 = unaff_x19[1];
    }
    if (unaff_x22 < uVar3) {
code_r0x00092a2c:
      func_0x000280c4();
    }
    else if (uVar3 < unaff_x22) {
      uVar5 = (ulong)((float)(ulong)unaff_x19[3] / *(float *)(unaff_x19 + 4));
      if ((unaff_x22 < 3) ||
         (uVar7 = CONCAT17(POPCOUNT((char)(unaff_x22 >> 0x38)),
                           CONCAT16(POPCOUNT((char)(unaff_x22 >> 0x30)),
                                    CONCAT15(POPCOUNT((char)(unaff_x22 >> 0x28)),
                                             CONCAT14(POPCOUNT((char)(unaff_x22 >> 0x20)),
                                                      CONCAT13(POPCOUNT((char)(unaff_x22 >> 0x18)),
                                                               CONCAT12(POPCOUNT((char)(unaff_x22 >>
                                                                                       0x10)),
                                                                        CONCAT11(POPCOUNT((char)(
                                                  unaff_x22 >> 8)),POPCOUNT((char)unaff_x22)))))))),
         uVar6 = NEON_uaddlv(uVar7,1),
         1 < (CONCAT62((int6)((ulong)uVar7 >> 0x10),uVar6) & 0xffffffff))) {
        uVar5 = __ZNSt3__112__next_primeEm();
      }
      else if (1 < uVar5) {
        uVar5 = 1L << (-LZCOUNT(uVar5 - 1) & 0x3fU);
      }
      if (uVar3 <= uVar5) {
        uVar3 = uVar5;
      }
      if (uVar3 < unaff_x22) goto code_r0x00092a2c;
    }
    unaff_x22 = unaff_x19[1];
    if ((unaff_x22 & unaff_x22 - 1) == 0) {
      unaff_x24 = unaff_x22 - 1 & unaff_x23;
      lVar4 = *unaff_x19;
      plVar2 = *(long **)(lVar4 + unaff_x24 * 8);
      goto joined_r0x00092b10;
    }
    if (unaff_x23 < unaff_x22) {
      lVar4 = *unaff_x19;
      plVar2 = *(long **)(lVar4 + unaff_x23 * 8);
      unaff_x24 = unaff_x23;
      goto joined_r0x00092b10;
    }
    uVar3 = 0;
    if (unaff_x22 != 0) {
      uVar3 = unaff_x23 / unaff_x22;
    }
    unaff_x24 = unaff_x23 - uVar3 * unaff_x22;
    lVar4 = *unaff_x19;
    plVar2 = *(long **)(lVar4 + unaff_x24 * 8);
    if (plVar2 != (long *)0x0) goto code_r0x000929c0;
LAB_00092ac8:
    plVar2 = unaff_x19 + 2;
    *plVar1 = *plVar2;
    *plVar2 = (long)plVar1;
    *(long **)(lVar4 + unaff_x24 * 8) = plVar2;
    if (*plVar1 == 0) goto code_r0x00092b4c;
    uVar3 = *(ulong *)(*plVar1 + 8);
    if ((unaff_x22 & unaff_x22 - 1) == 0) {
      uVar3 = uVar3 & unaff_x22 - 1;
    }
    else if (unaff_x22 <= uVar3) {
      uVar5 = 0;
      if (unaff_x22 != 0) {
        uVar5 = uVar3 / unaff_x22;
      }
      uVar3 = uVar3 - uVar5 * unaff_x22;
    }
    plVar2 = (long *)(*unaff_x19 + uVar3 * 8);
  }
  else {
    lVar4 = *unaff_x19;
    plVar2 = *(long **)(lVar4 + unaff_x24 * 8);
joined_r0x00092b10:
    if (plVar2 == (long *)0x0) goto LAB_00092ac8;
code_r0x000929c0:
    *plVar1 = *plVar2;
  }
  *plVar2 = (long)plVar1;
code_r0x00092b4c:
  unaff_x19[3] = unaff_x19[3] + 1;
  return plVar1;
}

