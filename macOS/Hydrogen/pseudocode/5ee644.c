
void FUN_005ee644(void)

{
  code *pcVar1;
  int iVar2;
  undefined8 uVar3;
  long *plVar4;
  ulong unaff_x21;
  undefined1 auVar5 [16];
  undefined1 auStack_60 [24];
  undefined1 auStack_48 [24];
  
  __ZdlPv();
  if ((unaff_x21 & 1) != 0) {
    ___cxa_free_exception();
  }
  auVar5 = __Unwind_Resume();
  plVar4 = auVar5._0_8_;
  if ((auVar5._8_8_ == 0) && (iVar2 = (**(code **)(*plVar4 + 0x40))(), iVar2 == 2)) {
    uVar3 = ___cxa_allocate_exception(0x28);
    plVar4 = (long *)(**(code **)(*plVar4 + 0x70))(plVar4);
    (**(code **)(*plVar4 + 0x18))(auStack_60);
    func_0x0003a638(auStack_48,auStack_60,": this object cannot use a null IV");
    func_0x0002703c(uVar3,auStack_48);
    ___cxa_throw(uVar3,&DAT_009b2ee0,&DAT_000270bc);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x5ee738);
    (*pcVar1)();
  }
  return;
}

