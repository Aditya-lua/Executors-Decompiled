
void FUN_005eff94(void)

{
  code *pcVar1;
  undefined8 uVar2;
  long *plVar3;
  long *unaff_x20;
  undefined8 in_stack_00000000;
  undefined1 uStack0000000000000008;
  
  uVar2 = ___cxa_allocate_exception(0x28);
  plVar3 = (long *)(**(code **)(*unaff_x20 + 0x58))();
  (**(code **)(*plVar3 + 0x18))(&uStack0000000000000008);
  func_0x005f2bb0(uVar2,&uStack0000000000000008,in_stack_00000000);
  ___cxa_throw(uVar2,&UNK_009f4698,&DAT_005f002c);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x5efff4);
  (*pcVar1)();
}

