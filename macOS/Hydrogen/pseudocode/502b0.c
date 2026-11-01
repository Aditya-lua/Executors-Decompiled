
void FUN_000502b0(void)

{
  ulong uVar1;
  long *plVar2;
  ulong uVar3;
  long lVar4;
  long *unaff_x19;
  long *unaff_x20;
  ulong unaff_x21;
  ulong unaff_x22;
  ulong unaff_x23;
  ulong uVar5;
  undefined2 uVar6;
  undefined8 uVar7;
  
  if (unaff_x23 < unaff_x21) {
LAB_000502b8:
    func_0x000280c4();
  }
  else if (unaff_x21 < unaff_x23) {
    uVar5 = (ulong)((float)(ulong)unaff_x19[3] / *(float *)(unaff_x19 + 4));
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
       uVar6 = NEON_uaddlv(uVar7,1), 1 < (CONCAT62((int6)((ulong)uVar7 >> 0x10),uVar6) & 0xffffffff)
       )) {
      uVar5 = __ZNSt3__112__next_primeEm();
    }
    else if (1 < uVar5) {
      uVar5 = 1L << (-LZCOUNT(uVar5 - 1) & 0x3fU);
    }
    if (unaff_x21 <= uVar5) {
      unaff_x21 = uVar5;
    }
    if (unaff_x21 < unaff_x23) goto LAB_000502b8;
  }
  uVar5 = unaff_x19[1];
  if ((uVar5 & uVar5 - 1) == 0) {
    unaff_x22 = (int)uVar5 - 1 & unaff_x22;
  }
  else if (uVar5 <= unaff_x22) {
    uVar3 = 0;
    if (uVar5 != 0) {
      uVar3 = unaff_x22 / uVar5;
    }
    unaff_x22 = unaff_x22 - uVar3 * uVar5;
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
    if ((uVar5 & uVar5 - 1) == 0) {
      uVar3 = uVar3 & uVar5 - 1;
    }
    else if (uVar5 <= uVar3) {
      uVar1 = 0;
      if (uVar5 != 0) {
        uVar1 = uVar3 / uVar5;
      }
      uVar3 = uVar3 - uVar1 * uVar5;
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

