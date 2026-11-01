
void FUN_0067e894(code *param_1)

{
  code *pcVar1;
  ulong uVar2;
  undefined8 uVar3;
  
  uVar2 = (*param_1)();
  if ((uVar2 & 1) == 0) {
    uVar3 = ___cxa_allocate_exception(0x28);
    func_0x006387ac();
    ___cxa_throw(uVar3,&DAT_009fb298,&DAT_0063885c);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x67e8d8);
    (*pcVar1)();
  }
  return;
}

