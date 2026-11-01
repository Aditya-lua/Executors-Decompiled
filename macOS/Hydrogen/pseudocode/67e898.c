
void FUN_0067e898(ulong param_1)

{
  code *pcVar1;
  undefined8 uVar2;
  
  if ((param_1 & 1) == 0) {
    uVar2 = ___cxa_allocate_exception(0x28);
    func_0x006387ac();
    ___cxa_throw(uVar2,&DAT_009fb298,&DAT_0063885c);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x67e8d8);
    (*pcVar1)();
  }
  return;
}

