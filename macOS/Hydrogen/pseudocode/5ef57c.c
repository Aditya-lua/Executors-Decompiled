
void FUN_005ef57c(undefined8 param_1)

{
  ulong uVar1;
  undefined1 *puVar2;
  code *pcVar3;
  undefined8 *puVar4;
  undefined8 uVar5;
  long *unaff_x20;
  undefined8 unaff_x22;
  long unaff_x29;
  undefined8 uVar6;
  undefined1 *in_stack_00000000;
  ulong in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  ulong in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined1 uStack0000000000000048;
  undefined8 uStack0000000000000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  
  func_0x0060de44(param_1,10);
  uVar1 = in_stack_00000020;
  uVar5 = in_stack_00000018;
  if (-1 < (char)in_stack_00000028._7_1_) {
    uVar1 = (ulong)in_stack_00000028._7_1_;
    uVar5 = unaff_x22;
  }
  puVar4 = (undefined8 *)
           __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                     (&uStack0000000000000048,uVar5,uVar1);
  in_stack_00000068 = puVar4[1];
  uStack0000000000000060 = *puVar4;
  in_stack_00000070 = puVar4[2];
  puVar4[1] = 0;
  puVar4[2] = 0;
  *puVar4 = 0;
  func_0x0003a638(unaff_x29 + -0x58,&uStack0000000000000060," exceeds the maximum of ");
  uVar5 = (**(code **)(*unaff_x20 + 0x88))();
  func_0x0060de44(uVar5,10);
  uVar1 = in_stack_00000008;
  puVar2 = in_stack_00000000;
  if (-1 < (char)in_stack_00000010._7_1_) {
    uVar1 = (ulong)in_stack_00000010._7_1_;
    puVar2 = (undefined1 *)register0x00000008;
  }
  puVar4 = (undefined8 *)
           __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                     (unaff_x29 + -0x58,puVar2,uVar1);
  uVar6 = puVar4[1];
  uVar5 = *puVar4;
  *(undefined8 *)(unaff_x29 + -0x30) = puVar4[2];
  *(undefined8 *)(unaff_x29 + -0x38) = uVar6;
  *(undefined8 *)(unaff_x29 + -0x40) = uVar5;
  puVar4[1] = 0;
  puVar4[2] = 0;
  *puVar4 = 0;
  func_0x0002703c();
  ___cxa_throw();
                    /* WARNING: Does not return */
  pcVar3 = (code *)SoftwareBreakpoint(1,0x5ef780);
  (*pcVar3)();
}

