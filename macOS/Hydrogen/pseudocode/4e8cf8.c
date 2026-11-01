
void FUN_004e8cf8(void)

{
  undefined1 in_ZR;
  undefined4 *puVar1;
  long *plVar2;
  long *unaff_x19;
  undefined4 *unaff_x20;
  long unaff_x21;
  long unaff_x22;
  undefined8 unaff_x24;
  undefined4 *unaff_x25;
  undefined8 unaff_x26;
  undefined8 unaff_x27;
  long unaff_x28;
  long unaff_x29;
  long in_stack_00000000;
  long in_stack_00000008;
  undefined8 uStack0000000000000030;
  long in_stack_00000038;
  long in_stack_00000040;
  undefined8 uStack0000000000000048;
  undefined8 uStack0000000000000050;
  undefined8 in_stack_00000058;
  
  while( true ) {
    if ((bool)in_ZR) {
      func_0x007a5594();
      unaff_x21 = in_stack_00000008;
    }
    plVar2 = (long *)(unaff_x21 + unaff_x22 * unaff_x28);
    plVar2[2] = in_stack_00000040;
    plVar2[1] = in_stack_00000038;
    *plVar2 = uStack0000000000000030;
    unaff_x22 = unaff_x22 + 1;
    do {
      puVar1 = unaff_x25;
      if (puVar1 == unaff_x20) goto code_r0x004e8d3c;
      unaff_x25 = puVar1 + 2;
    } while (*(char *)(puVar1 + 1) != '\x01');
    uStack0000000000000048._4_4_ = *puVar1;
    *(long *)(unaff_x29 + -0x60) = (long)&uStack0000000000000048 + 4;
    *(undefined8 *)(unaff_x29 + -0x58) = unaff_x26;
    uStack0000000000000050 = unaff_x27;
    in_stack_00000058 = unaff_x24;
    func_0x00459f08(&uStack0000000000000030,&uStack0000000000000050);
    if (uStack0000000000000030 == -0x8000000000000000) break;
    in_ZR = unaff_x22 == in_stack_00000000;
  }
code_r0x004e8d3c:
  unaff_x19[1] = in_stack_00000008;
  *unaff_x19 = in_stack_00000000;
  unaff_x19[2] = unaff_x22;
  return;
}

