
long * FUN_00072698(void)

{
  ulong uVar1;
  ulong uVar2;
  long *plVar3;
  ulong uVar4;
  long *unaff_x19;
  ulong unaff_x20;
  ulong unaff_x21;
  ulong unaff_x22;
  undefined8 unaff_x24;
  undefined2 uVar5;
  undefined8 uVar6;
  long *in_stack_00000008;
  
  uVar2 = (ulong)((float)(ulong)unaff_x19[3] / *(float *)(unaff_x19 + 4));
  if ((unaff_x22 < 3) ||
     (uVar6 = CONCAT17(POPCOUNT((char)(unaff_x22 >> 0x38)),
                       CONCAT16(POPCOUNT((char)(unaff_x22 >> 0x30)),
                                CONCAT15(POPCOUNT((char)(unaff_x22 >> 0x28)),
                                         CONCAT14(POPCOUNT((char)(unaff_x22 >> 0x20)),
                                                  CONCAT13(POPCOUNT((char)(unaff_x22 >> 0x18)),
                                                           CONCAT12(POPCOUNT((char)(unaff_x22 >>
                                                                                   0x10)),
                                                                    CONCAT11(POPCOUNT((char)(
                                                  unaff_x22 >> 8)),POPCOUNT((char)unaff_x22)))))))),
     uVar5 = NEON_uaddlv(uVar6,1), 1 < (CONCAT62((int6)((ulong)uVar6 >> 0x10),uVar5) & 0xffffffff)))
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
    unaff_x20 = uVar2 - 1 & unaff_x20;
    plVar3 = *(long **)(*unaff_x19 + unaff_x20 * 8);
  }
  else if (unaff_x20 < uVar2) {
    plVar3 = *(long **)(*unaff_x19 + unaff_x20 * 8);
  }
  else {
    uVar4 = 0;
    if (uVar2 != 0) {
      uVar4 = unaff_x20 / uVar2;
    }
    unaff_x20 = unaff_x20 - uVar4 * uVar2;
    plVar3 = *(long **)(*unaff_x19 + unaff_x20 * 8);
  }
  if (plVar3 == (long *)0x0) {
    *in_stack_00000008 = unaff_x19[2];
    unaff_x19[2] = (long)in_stack_00000008;
    *(undefined8 *)(*unaff_x19 + unaff_x20 * 8) = unaff_x24;
    if (*in_stack_00000008 != 0) {
      uVar4 = *(ulong *)(*in_stack_00000008 + 8);
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
      *(long **)(*unaff_x19 + uVar4 * 8) = in_stack_00000008;
    }
  }
  else {
    *in_stack_00000008 = *plVar3;
    *plVar3 = (long)in_stack_00000008;
  }
  unaff_x19[3] = unaff_x19[3] + 1;
  return in_stack_00000008;
}

