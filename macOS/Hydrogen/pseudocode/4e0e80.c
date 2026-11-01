
void FUN_004e0e80(void)

{
  long *unaff_x19;
  long unaff_x20;
  long lVar1;
  long *unaff_x21;
  ulong unaff_x22;
  ulong unaff_x23;
  ulong uVar2;
  long *plVar3;
  long lStack0000000000000000;
  long lStack0000000000000008;
  long lStack0000000000000010;
  undefined8 uStack0000000000000018;
  long in_stack_00000020;
  long in_stack_00000028;
  
  lStack0000000000000008 = unaff_x21[1];
  lStack0000000000000000 = *unaff_x21;
  lStack0000000000000010 = unaff_x21[2];
  if (*unaff_x19 - unaff_x22 < unaff_x23) {
    func_0x007a5594();
    plVar3 = (long *)(unaff_x19[1] + unaff_x19[2] * 0x18);
    uVar2 = unaff_x19[2];
  }
  else {
    plVar3 = (long *)(unaff_x19[1] + unaff_x22 * 0x18);
    uVar2 = unaff_x22;
  }
  if (1 < unaff_x23) {
    uVar2 = (unaff_x23 + uVar2) - 1;
    lVar1 = ~unaff_x22 + unaff_x20;
    do {
      if (lStack0000000000000000 == -0x8000000000000000) {
        uStack0000000000000018 = -0x8000000000000000;
      }
      else {
        func_0x0045cd08(&uStack0000000000000018);
      }
      plVar3[1] = in_stack_00000020;
      *plVar3 = uStack0000000000000018;
      plVar3[2] = in_stack_00000028;
      plVar3 = plVar3 + 3;
      lVar1 = lVar1 + -1;
    } while (lVar1 != 0);
  }
  plVar3[2] = lStack0000000000000010;
  plVar3[1] = lStack0000000000000008;
  *plVar3 = lStack0000000000000000;
  unaff_x19[2] = uVar2 + 1;
  return;
}

