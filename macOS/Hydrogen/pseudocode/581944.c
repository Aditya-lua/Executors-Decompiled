
void FUN_00581944(long *param_1)

{
  code *pcVar1;
  long lVar2;
  undefined8 *unaff_x19;
  
  lVar2 = *param_1;
  *param_1 = lVar2 + 1;
  if (lVar2 < 0) {
    func_0x007a05dc();
    func_0x007a1f18(8,0x40);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x581d38);
    (*pcVar1)();
  }
  *unaff_x19 = 0;
  unaff_x19[1] = param_1;
  return;
}

