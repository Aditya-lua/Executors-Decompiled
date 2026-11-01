
bool FUN_00053c74(ulong param_1,ulong param_2)

{
  code *pcVar1;
  bool in_CY;
  int iVar2;
  long *unaff_x20;
  long unaff_x21;
  ulong unaff_x23;
  
  if (in_CY) {
    if (unaff_x23 <= param_1) {
      param_1 = unaff_x23;
    }
    iVar2 = _memcmp(*unaff_x20 + unaff_x21);
    return param_1 == param_2 && iVar2 == 0;
  }
  func_0x00049dd0();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x53ccc);
  (*pcVar1)();
}

