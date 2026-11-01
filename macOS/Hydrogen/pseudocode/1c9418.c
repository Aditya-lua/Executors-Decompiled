
void FUN_001c9418(undefined1 param_1 [16],undefined1 param_2 [16])

{
  code *pcVar1;
  undefined8 *puVar2;
  undefined4 in_w8;
  undefined8 *unaff_x19;
  undefined8 unaff_x27;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  undefined8 uStack0000000000000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 uStack0000000000000048;
  undefined8 uStack0000000000000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  
  uStack0000000000000050 = param_2._8_8_;
  uStack0000000000000048 = param_2._0_8_;
  uStack0000000000000028 = in_stack_00000010;
  uStack0000000000000020 = in_stack_00000008;
  uStack0000000000000030 = in_stack_00000018;
  puVar2 = (undefined8 *)func_0x00187bd0(0x60,8);
  if (puVar2 == (undefined8 *)0x0) {
    func_0x007a1f18(8,0x60);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x1c94a4);
    (*pcVar1)();
  }
  unaff_x19[1] = puVar2;
  unaff_x19[2] = &UNK_009c29c0;
  puVar2[5] = uStack0000000000000048;
  puVar2[4] = in_stack_00000040;
  puVar2[7] = in_stack_00000058;
  puVar2[6] = uStack0000000000000050;
  puVar2[9] = in_stack_00000068;
  puVar2[8] = in_stack_00000060;
  puVar2[0xb] = CONCAT44(in_stack_00000078._4_4_,in_w8);
  puVar2[10] = in_stack_00000070;
  puVar2[1] = uStack0000000000000028;
  *puVar2 = uStack0000000000000020;
  puVar2[3] = in_stack_00000038;
  puVar2[2] = uStack0000000000000030;
  *unaff_x19 = unaff_x27;
  return;
}

