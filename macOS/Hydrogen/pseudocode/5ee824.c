
void FUN_005ee824(void)

{
  ulong uVar1;
  undefined1 *puVar2;
  code *pcVar3;
  undefined8 uVar4;
  long *plVar5;
  undefined8 *puVar6;
  undefined8 uVar7;
  long *unaff_x20;
  long unaff_x29;
  undefined8 uVar8;
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
  
  uVar4 = ___cxa_allocate_exception();
  plVar5 = (long *)(**(code **)(*unaff_x20 + 0x70))();
  (**(code **)(*plVar5 + 0x18))(&uStack0000000000000030);
  func_0x0003a638(&uStack0000000000000048,&uStack0000000000000030,": IV length ");
  func_0x00049b30(&uStack0000000000000018);
  uVar1 = in_stack_00000020;
  puVar6 = uStack0000000000000018;
  if (-1 < (char)in_stack_00000028._7_1_) {
    uVar1 = (ulong)in_stack_00000028._7_1_;
    puVar6 = &uStack0000000000000018;
  }
  puVar6 = (undefined8 *)
           __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                     (&uStack0000000000000048,puVar6,uVar1);
  in_stack_00000068 = puVar6[1];
  uStack0000000000000060 = *puVar6;
  in_stack_00000070 = puVar6[2];
  puVar6[1] = 0;
  puVar6[2] = 0;
  *puVar6 = 0;
  func_0x0003a638(unaff_x29 + -0x58,&uStack0000000000000060," is less than the minimum of ");
  uVar7 = (**(code **)(*unaff_x20 + 0x50))();
  func_0x005eec2c(uVar7,10);
  uVar1 = in_stack_00000008;
  puVar2 = in_stack_00000000;
  if (-1 < (char)in_stack_00000010._7_1_) {
    uVar1 = (ulong)in_stack_00000010._7_1_;
    puVar2 = (undefined1 *)register0x00000008;
  }
  puVar6 = (undefined8 *)
           __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                     (unaff_x29 + -0x58,puVar2,uVar1);
  uVar8 = puVar6[1];
  uVar7 = *puVar6;
  *(undefined8 *)(unaff_x29 + -0x30) = puVar6[2];
  *(undefined8 *)(unaff_x29 + -0x38) = uVar8;
  *(undefined8 *)(unaff_x29 + -0x40) = uVar7;
  puVar6[1] = 0;
  puVar6[2] = 0;
  *puVar6 = 0;
  func_0x0002703c(uVar4,unaff_x29 + -0x40);
  ___cxa_throw(uVar4,&DAT_009b2ee0,&DAT_000270bc);
                    /* WARNING: Does not return */
  pcVar3 = (code *)SoftwareBreakpoint(1,0x5eea70);
  (*pcVar3)();
}

