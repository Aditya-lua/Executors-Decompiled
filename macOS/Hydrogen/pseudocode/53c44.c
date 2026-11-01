
bool FUN_00053c44(ulong param_1)

{
  ulong uVar1;
  code *pcVar2;
  int iVar3;
  long unaff_x20;
  ulong unaff_x21;
  ulong unaff_x23;
  ulong unaff_x24;
  
  if (unaff_x24 < unaff_x21 || param_1 == 0xffffffffffffffff) {
    func_0x00049dd0();
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x53ccc);
    (*pcVar2)();
  }
  uVar1 = unaff_x24 - unaff_x21;
  if (unaff_x23 <= unaff_x24 - unaff_x21) {
    uVar1 = unaff_x23;
  }
  iVar3 = _memcmp(unaff_x20 + unaff_x21);
  return uVar1 == param_1 && iVar3 == 0;
}

