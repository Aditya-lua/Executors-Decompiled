
void FUN_004e0fe0(void)

{
  long unaff_x19;
  long lVar1;
  long unaff_x20;
  ulong unaff_x22;
  long lVar2;
  ulong unaff_x23;
  long *plVar3;
  long in_stack_00000000;
  long in_stack_00000008;
  long in_stack_00000010;
  undefined8 uStack0000000000000018;
  long in_stack_00000020;
  long in_stack_00000028;
  
  lVar2 = *(long *)(unaff_x19 + 0x10);
  plVar3 = (long *)(*(long *)(unaff_x19 + 8) + lVar2 * 0x18);
  if (1 < unaff_x23) {
    lVar2 = unaff_x23 + lVar2 + -1;
    lVar1 = ~unaff_x22 + unaff_x20;
    do {
      if (in_stack_00000000 == -0x8000000000000000) {
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
  plVar3[2] = in_stack_00000010;
  plVar3[1] = in_stack_00000008;
  *plVar3 = in_stack_00000000;
  *(long *)(unaff_x19 + 0x10) = lVar2 + 1;
  return;
}

