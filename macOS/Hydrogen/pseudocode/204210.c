
long * FUN_00204210(long *param_1)

{
  code *pcVar1;
  long lVar2;
  ulong uVar3;
  undefined8 *unaff_x19;
  long unaff_x20;
  ulong *unaff_x21;
  ulong in_stack_00000018;
  undefined8 *in_stack_00000020;
  long in_stack_00000040;
  undefined8 in_stack_00000048;
  
  if (param_1 == (long *)0x0) {
    func_0x007a23bc(&UNK_009c6218);
  }
  else {
    lVar2 = *param_1;
    *param_1 = lVar2 + 1;
    if (-1 < lVar2) {
      func_0x002435d8();
      if (((in_stack_00000018 & 0x100000000) == 0) && ((*unaff_x21 & 0x7fffffffffffffff) != 0)) {
        uVar3 = func_0x007a1140();
        unaff_x19 = in_stack_00000020;
        if ((uVar3 & 1) == 0) {
          *(undefined1 *)(unaff_x20 + 0x10) = 1;
        }
      }
      func_0x00430048(*unaff_x19);
      if (in_stack_00000040 != 0) {
        func_0x00187bd4(in_stack_00000048,in_stack_00000040,1);
      }
      return param_1;
    }
  }
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x204574);
  (*pcVar1)();
}

