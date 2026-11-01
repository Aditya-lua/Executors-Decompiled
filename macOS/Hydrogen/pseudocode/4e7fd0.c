
void FUN_004e7fd0(void)

{
  long *plVar1;
  code *pcVar2;
  long *plVar3;
  undefined8 *unaff_x19;
  undefined8 *unaff_x22;
  long lVar4;
  long lStack0000000000000010;
  long in_stack_00000018;
  long in_stack_00000020;
  long in_stack_00000028;
  undefined8 uStack0000000000000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 uStack0000000000000048;
  long in_stack_00000050;
  long in_stack_00000058;
  
  func_0x004dec3c();
  if (in_stack_00000018 == -0x8000000000000000) {
    *unaff_x19 = 0;
    unaff_x19[1] = 8;
    unaff_x19[2] = 0;
  }
  else {
    plVar3 = (long *)func_0x00187bd0(0x60,8);
    if (plVar3 == (long *)0x0) {
      func_0x007a1f00(8,0x60);
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x4e80fc);
      (*pcVar2)();
    }
    plVar3[1] = in_stack_00000020;
    *plVar3 = in_stack_00000018;
    plVar3[2] = in_stack_00000028;
    lStack0000000000000010 = 1;
    in_stack_00000038 = unaff_x22[1];
    uStack0000000000000030 = *unaff_x22;
    in_stack_00000040 = unaff_x22[2];
    lVar4 = 0x18;
    while (func_0x004dec3c(&uStack0000000000000048,&uStack0000000000000030),
          uStack0000000000000048 != -0x8000000000000000) {
      if (lStack0000000000000010 == 4) {
        func_0x007a5594();
      }
      plVar1 = (long *)((long)plVar3 + lVar4);
      plVar1[2] = in_stack_00000058;
      plVar1[1] = in_stack_00000050;
      *plVar1 = uStack0000000000000048;
      lStack0000000000000010 = lStack0000000000000010 + 1;
      lVar4 = lVar4 + 0x18;
    }
    unaff_x19[1] = plVar3;
    *unaff_x19 = 4;
    unaff_x19[2] = lStack0000000000000010;
  }
  return;
}

