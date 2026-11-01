
void FUN_0063865c(undefined8 param_1)

{
  code *pcVar1;
  ulong uVar2;
  undefined8 uVar3;
  undefined8 *unaff_x19;
  long *unaff_x20;
  int unaff_w21;
  long *plVar4;
  
  *unaff_x19 = param_1;
  func_0x005fdd18(unaff_x19 + 1);
  func_0x005fdd18(unaff_x19 + 7);
  *(undefined1 *)(unaff_x19 + 0xd) = 1;
  plVar4 = (long *)unaff_x20[4];
  (**(code **)(*unaff_x20 + 0xc0))();
  uVar2 = (**(code **)(*plVar4 + 0x88))(plVar4);
  if ((uVar2 & 1) == 0) {
    uVar3 = ___cxa_allocate_exception(0x28);
    func_0x006387ac();
  }
  else {
    if ((unaff_w21 == 0) || (uVar2 = (**(code **)(*unaff_x20 + 0xe8))(), (uVar2 & 1) != 0)) {
      return;
    }
    uVar3 = ___cxa_allocate_exception(0x28);
    func_0x006387ac();
  }
  ___cxa_throw(uVar3,&DAT_009fb298,&DAT_0063885c);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x63872c);
  (*pcVar1)();
}

