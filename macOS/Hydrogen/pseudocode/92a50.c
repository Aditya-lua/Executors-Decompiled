
void FUN_00092a50(float param_1)

{
  ulong uVar1;
  ulong uVar2;
  long *plVar3;
  ulong uVar4;
  long lVar5;
  long *unaff_x19;
  long *unaff_x20;
  ulong unaff_x21;
  ulong unaff_x22;
  ulong unaff_x23;
  undefined2 uVar6;
  undefined8 uVar7;
  
  uVar2 = (ulong)param_1;
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
     uVar6 = NEON_uaddlv(uVar7,1), 1 < (CONCAT62((int6)((ulong)uVar7 >> 0x10),uVar6) & 0xffffffff)))
  {
    uVar2 = __ZNSt3__112__next_primeEm();
  }
  else if (1 < uVar2) {
    uVar2 = 1L << (-LZCOUNT(uVar2 - 1) & 0x3fU);
  }
  if (unaff_x21 <= uVar2) {
    unaff_x21 = uVar2;
  }
  if (unaff_x21 < unaff_x22) {
    func_0x000280c4();
  }
  uVar2 = unaff_x19[1];
  if ((uVar2 & uVar2 - 1) == 0) {
    unaff_x23 = uVar2 - 1 & unaff_x23;
    lVar5 = *unaff_x19;
    plVar3 = *(long **)(lVar5 + unaff_x23 * 8);
joined_r0x00092b28:
    if (plVar3 == (long *)0x0) goto LAB_00092ac8;
LAB_000929c0:
    *unaff_x20 = *plVar3;
  }
  else {
    if (uVar2 <= unaff_x23) {
      uVar4 = 0;
      if (uVar2 != 0) {
        uVar4 = unaff_x23 / uVar2;
      }
      unaff_x23 = unaff_x23 - uVar4 * uVar2;
      lVar5 = *unaff_x19;
      plVar3 = *(long **)(lVar5 + unaff_x23 * 8);
      goto joined_r0x00092b28;
    }
    lVar5 = *unaff_x19;
    plVar3 = *(long **)(lVar5 + unaff_x23 * 8);
    if (plVar3 != (long *)0x0) goto LAB_000929c0;
LAB_00092ac8:
    plVar3 = unaff_x19 + 2;
    *unaff_x20 = *plVar3;
    *plVar3 = (long)unaff_x20;
    *(long **)(lVar5 + unaff_x23 * 8) = plVar3;
    if (*unaff_x20 == 0) goto LAB_00092b4c;
    uVar4 = *(ulong *)(*unaff_x20 + 8);
    if ((uVar2 & uVar2 - 1) == 0) {
      uVar4 = uVar4 & uVar2 - 1;
    }
    else if (uVar2 <= uVar4) {
      uVar1 = 0;
      if (uVar2 != 0) {
        uVar1 = uVar4 / uVar2;
      }
      uVar4 = uVar4 - uVar1 * uVar2;
    }
    plVar3 = (long *)(*unaff_x19 + uVar4 * 8);
  }
  *plVar3 = (long)unaff_x20;
LAB_00092b4c:
  unaff_x19[3] = unaff_x19[3] + 1;
  return;
}

