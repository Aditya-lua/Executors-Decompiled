
void FUN_00697374(void)

{
  ulong uVar1;
  code *pcVar2;
  undefined8 *puVar3;
  undefined8 uVar4;
  long *unaff_x20;
  long unaff_x29;
  undefined8 uVar5;
  undefined8 uStack0000000000000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined1 uStack0000000000000040;
  undefined8 uStack0000000000000060;
  ulong in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 uStack0000000000000078;
  ulong in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined1 uStack00000000000000a8;
  
  func_0x0003a638();
  func_0x0060de44(&uStack0000000000000078);
  uVar1 = in_stack_00000080;
  puVar3 = uStack0000000000000078;
  if (-1 < (char)in_stack_00000088._7_1_) {
    uVar1 = (ulong)in_stack_00000088._7_1_;
    puVar3 = &uStack0000000000000078;
  }
  puVar3 = (undefined8 *)
           __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                     (&uStack00000000000000a8,puVar3,uVar1);
  uVar5 = puVar3[1];
  uVar4 = *puVar3;
  *(undefined8 *)(unaff_x29 + -0x90) = puVar3[2];
  *(undefined8 *)(unaff_x29 + -0x98) = uVar5;
  *(undefined8 *)(unaff_x29 + -0xa0) = uVar4;
  puVar3[1] = 0;
  puVar3[2] = 0;
  *puVar3 = 0;
  func_0x0003a638(&uStack0000000000000040,unaff_x29 + -0xa0,
                  " doesn\'t match the required length of ");
  uVar4 = (**(code **)(*unaff_x20 + 0x28))();
  func_0x0060de44(&uStack0000000000000060,uVar4,10);
  uVar1 = in_stack_00000068;
  puVar3 = uStack0000000000000060;
  if (-1 < (char)in_stack_00000070._7_1_) {
    uVar1 = (ulong)in_stack_00000070._7_1_;
    puVar3 = &uStack0000000000000060;
  }
  puVar3 = (undefined8 *)
           __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                     (&uStack0000000000000040,puVar3,uVar1);
  in_stack_00000018 = puVar3[1];
  uStack0000000000000010 = *puVar3;
  in_stack_00000020 = puVar3[2];
  puVar3[1] = 0;
  puVar3[2] = 0;
  *puVar3 = 0;
  func_0x0003a638(unaff_x29 + -0x88,&uStack0000000000000010," for this key");
  func_0x0002703c();
  ___cxa_throw();
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x697474);
  (*pcVar2)();
}

