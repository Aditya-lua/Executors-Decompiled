
void FUN_0059fa74(void)

{
  long *plVar1;
  code *pcVar2;
  undefined8 *puVar3;
  long *unaff_x19;
  undefined8 *unaff_x20;
  long lVar4;
  long unaff_x27;
  long lStack0000000000000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 uStack0000000000000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 uStack0000000000000068;
  long in_stack_00000070;
  long in_stack_00000078;
  
  puVar3 = (undefined8 *)func_0x00187bd0();
  if (puVar3 == (undefined8 *)0x0) {
    func_0x007a1f00(8);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x59fb90);
    (*pcVar2)();
  }
  puVar3[1] = in_stack_00000020;
  *puVar3 = in_stack_00000018;
  puVar3[2] = in_stack_00000028;
  lStack0000000000000010 = 1;
  in_stack_00000038 = unaff_x20[1];
  uStack0000000000000030 = *unaff_x20;
  in_stack_00000048 = unaff_x20[3];
  in_stack_00000040 = unaff_x20[2];
  in_stack_00000058 = unaff_x20[5];
  in_stack_00000050 = unaff_x20[4];
  lVar4 = 0x18;
  while (func_0x0059b5ec(&uStack0000000000000068,&uStack0000000000000030),
        uStack0000000000000068 != -0x8000000000000000) {
    if (lStack0000000000000010 == unaff_x27) {
      func_0x007af5a0();
    }
    plVar1 = (long *)((long)puVar3 + lVar4);
    plVar1[2] = in_stack_00000078;
    plVar1[1] = in_stack_00000070;
    *plVar1 = uStack0000000000000068;
    lStack0000000000000010 = lStack0000000000000010 + 1;
    lVar4 = lVar4 + 0x18;
  }
  unaff_x19[1] = (long)puVar3;
  *unaff_x19 = unaff_x27;
  unaff_x19[2] = lStack0000000000000010;
  return;
}

