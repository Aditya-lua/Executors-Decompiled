
void FUN_005ef6f8(void)

{
  ulong uVar1;
  undefined1 *puVar2;
  code *pcVar3;
  undefined8 uVar4;
  undefined8 *puVar5;
  long *unaff_x20;
  long unaff_x29;
  undefined8 uVar6;
  undefined1 *in_stack_00000000;
  ulong in_stack_00000008;
  undefined8 in_stack_00000010;
  
  uVar4 = (**(code **)(*unaff_x20 + 0x90))();
  func_0x0060de44(uVar4,10);
  uVar1 = in_stack_00000008;
  puVar2 = in_stack_00000000;
  if (-1 < (char)in_stack_00000010._7_1_) {
    uVar1 = (ulong)in_stack_00000010._7_1_;
    puVar2 = (undefined1 *)register0x00000008;
  }
  puVar5 = (undefined8 *)
           __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                     (unaff_x29 + -0x58,puVar2,uVar1);
  uVar6 = puVar5[1];
  uVar4 = *puVar5;
  *(undefined8 *)(unaff_x29 + -0x30) = puVar5[2];
  *(undefined8 *)(unaff_x29 + -0x38) = uVar6;
  *(undefined8 *)(unaff_x29 + -0x40) = uVar4;
  puVar5[1] = 0;
  puVar5[2] = 0;
  *puVar5 = 0;
  func_0x0002703c();
  ___cxa_throw();
                    /* WARNING: Does not return */
  pcVar3 = (code *)SoftwareBreakpoint(1,0x5ef780);
  (*pcVar3)();
}

