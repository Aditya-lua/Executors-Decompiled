
void FUN_005ef540(long param_1)

{
  ulong uVar1;
  undefined1 *puVar2;
  code *pcVar3;
  long *plVar4;
  undefined8 *puVar5;
  undefined8 uVar6;
  long *unaff_x20;
  long unaff_x29;
  undefined8 uVar7;
  undefined1 *in_stack_00000000;
  ulong in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 uStack0000000000000018;
  ulong in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined1 uStack0000000000000030;
  undefined1 uStack0000000000000048;
  undefined8 uStack0000000000000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  
  plVar4 = (long *)(**(code **)(param_1 + 0x70))();
  (**(code **)(*plVar4 + 0x18))(&uStack0000000000000030);
  func_0x0003a638(&uStack0000000000000048,&uStack0000000000000030,": message length ");
  func_0x0060de44(&uStack0000000000000018);
  uVar1 = in_stack_00000020;
  puVar5 = uStack0000000000000018;
  if (-1 < (char)in_stack_00000028._7_1_) {
    uVar1 = (ulong)in_stack_00000028._7_1_;
    puVar5 = &uStack0000000000000018;
  }
  puVar5 = (undefined8 *)
           __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                     (&uStack0000000000000048,puVar5,uVar1);
  in_stack_00000068 = puVar5[1];
  uStack0000000000000060 = *puVar5;
  in_stack_00000070 = puVar5[2];
  puVar5[1] = 0;
  puVar5[2] = 0;
  *puVar5 = 0;
  func_0x0003a638(unaff_x29 + -0x58,&uStack0000000000000060," exceeds the maximum of ");
  uVar6 = (**(code **)(*unaff_x20 + 0x88))();
  func_0x0060de44(uVar6,10);
  uVar1 = in_stack_00000008;
  puVar2 = in_stack_00000000;
  if (-1 < (char)in_stack_00000010._7_1_) {
    uVar1 = (ulong)in_stack_00000010._7_1_;
    puVar2 = (undefined1 *)register0x00000008;
  }
  puVar5 = (undefined8 *)
           __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                     (unaff_x29 + -0x58,puVar2,uVar1);
  uVar7 = puVar5[1];
  uVar6 = *puVar5;
  *(undefined8 *)(unaff_x29 + -0x30) = puVar5[2];
  *(undefined8 *)(unaff_x29 + -0x38) = uVar7;
  *(undefined8 *)(unaff_x29 + -0x40) = uVar6;
  puVar5[1] = 0;
  puVar5[2] = 0;
  *puVar5 = 0;
  func_0x0002703c();
  ___cxa_throw();
                    /* WARNING: Does not return */
  pcVar3 = (code *)SoftwareBreakpoint(1,0x5ef780);
  (*pcVar3)();
}

