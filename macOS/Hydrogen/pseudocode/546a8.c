
void FUN_000546a8(void)

{
  ulong uVar1;
  ulong uVar2;
  long *plVar3;
  long lVar4;
  long *unaff_x19;
  long *unaff_x20;
  long *unaff_x22;
  ulong unaff_x23;
  ulong uVar5;
  undefined2 uVar6;
  undefined8 uVar7;
  
  uVar1 = __ZNSt3__112__next_primeEm();
  uVar5 = unaff_x19[1];
  if (uVar5 < uVar1) {
LAB_000546bc:
    func_0x000280c4();
  }
  else if (uVar1 < uVar5) {
    uVar2 = (ulong)((float)(ulong)unaff_x19[3] / *(float *)(unaff_x19 + 4));
    if ((uVar5 < 3) ||
       (uVar7 = CONCAT17(POPCOUNT((char)(uVar5 >> 0x38)),
                         CONCAT16(POPCOUNT((char)(uVar5 >> 0x30)),
                                  CONCAT15(POPCOUNT((char)(uVar5 >> 0x28)),
                                           CONCAT14(POPCOUNT((char)(uVar5 >> 0x20)),
                                                    CONCAT13(POPCOUNT((char)(uVar5 >> 0x18)),
                                                             CONCAT12(POPCOUNT((char)(uVar5 >> 0x10)
                                                                              ),
                                                                      CONCAT11(POPCOUNT((char)(uVar5
                                                                                              >> 8))
                                                                               ,POPCOUNT((char)uVar5
                                                                                        )))))))),
       uVar6 = NEON_uaddlv(uVar7,1), 1 < (CONCAT62((int6)((ulong)uVar7 >> 0x10),uVar6) & 0xffffffff)
       )) {
      uVar2 = __ZNSt3__112__next_primeEm();
    }
    else if (1 < uVar2) {
      uVar2 = 1L << (-LZCOUNT(uVar2 - 1) & 0x3fU);
    }
    if (uVar1 <= uVar2) {
      uVar1 = uVar2;
    }
    if (uVar1 < uVar5) goto LAB_000546bc;
  }
  uVar1 = unaff_x19[1];
  if ((uVar1 & uVar1 - 1) == 0) {
    unaff_x23 = uVar1 - 1 & unaff_x23;
    lVar4 = *unaff_x19;
    plVar3 = *(long **)(lVar4 + unaff_x23 * 8);
joined_r0x000547b4:
    if (plVar3 == (long *)0x0) goto code_r0x00054758;
LAB_00054650:
    *unaff_x20 = *plVar3;
  }
  else {
    if (uVar1 <= unaff_x23) {
      uVar5 = 0;
      if (uVar1 != 0) {
        uVar5 = unaff_x23 / uVar1;
      }
      unaff_x23 = unaff_x23 - uVar5 * uVar1;
      lVar4 = *unaff_x19;
      plVar3 = *(long **)(lVar4 + unaff_x23 * 8);
      goto joined_r0x000547b4;
    }
    lVar4 = *unaff_x19;
    plVar3 = *(long **)(lVar4 + unaff_x23 * 8);
    if (plVar3 != (long *)0x0) goto LAB_00054650;
code_r0x00054758:
    *unaff_x20 = *unaff_x22;
    *unaff_x22 = (long)unaff_x20;
    *(long **)(lVar4 + unaff_x23 * 8) = unaff_x22;
    if (*unaff_x20 == 0) goto LAB_000547d8;
    uVar5 = *(ulong *)(*unaff_x20 + 8);
    if ((uVar1 & uVar1 - 1) == 0) {
      uVar5 = uVar5 & uVar1 - 1;
    }
    else if (uVar1 <= uVar5) {
      uVar2 = 0;
      if (uVar1 != 0) {
        uVar2 = uVar5 / uVar1;
      }
      uVar5 = uVar5 - uVar2 * uVar1;
    }
    plVar3 = (long *)(*unaff_x19 + uVar5 * 8);
  }
  *plVar3 = (long)unaff_x20;
LAB_000547d8:
  unaff_x19[3] = unaff_x19[3] + 1;
  return;
}

