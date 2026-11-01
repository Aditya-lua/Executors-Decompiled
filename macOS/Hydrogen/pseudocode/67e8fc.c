
void FUN_0067e8fc(void)

{
  code *pcVar1;
  undefined4 uVar2;
  ulong uVar3;
  undefined8 uVar4;
  long *plVar5;
  undefined8 extraout_x8;
  undefined1 auVar6 [16];
  
  func_0x00087574();
  auVar6 = __Unwind_Resume();
  plVar5 = (long *)(auVar6._0_8_ + -8);
  (**(code **)(*plVar5 + 0xa0))(plVar5,auVar6._8_8_,0);
  uVar2 = func_0x005fe4e8();
  func_0x005fef78(extraout_x8,auVar6._8_8_,uVar2,0,1);
  uVar3 = (**(code **)(*plVar5 + 0x68))(plVar5,1,extraout_x8,0);
  if ((uVar3 & 1) == 0) {
    uVar4 = ___cxa_allocate_exception(0x28);
    func_0x006387ac();
    ___cxa_throw(uVar4,&DAT_009fb298,&DAT_0063885c);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x67e8d8);
    (*pcVar1)();
  }
  return;
}

