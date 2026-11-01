
void FUN_00079af0(long *param_1,long param_2,long param_3,ulong param_4)

{
  code *pcVar1;
  long *plStack0000000000000000;
  undefined1 uStack0000000000000008;
  long lStack0000000000000038;
  
  uStack0000000000000008 = 0;
  if (param_4 != 0) {
    plStack0000000000000000 = param_1;
    if (param_4 >> 0x3c != 0) {
      func_0x00017f90(param_1);
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x79bb4);
      (*pcVar1)();
    }
    lStack0000000000000038 = __Znwm(param_4 << 4);
    *param_1 = lStack0000000000000038;
    param_1[1] = lStack0000000000000038;
    param_1[2] = lStack0000000000000038 + param_4 * 0x10;
    if (param_2 != param_3) {
      do {
        func_0x000796dc(lStack0000000000000038,param_2);
        param_2 = param_2 + 0x10;
        lStack0000000000000038 = lStack0000000000000038 + 0x10;
      } while (param_2 != param_3);
    }
    param_1[1] = lStack0000000000000038;
  }
  return;
}

