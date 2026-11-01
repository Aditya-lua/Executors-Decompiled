
void FUN_00187498(long param_1)

{
  code *pcVar1;
  long unaff_x21;
  long unaff_x22;
  undefined8 *unaff_x23;
  
  if (param_1 == 0) {
    func_0x007a1f18();
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x187518);
    (*pcVar1)();
  }
  unaff_x23[1] = 1;
  *unaff_x23 = 1;
  _memcpy((long)unaff_x23 + (unaff_x21 - 1U & 0xfffffffffffffff0) + 0x10);
  if (((unaff_x21 - 1U) + unaff_x22 & -unaff_x21) != 0) {
    func_0x00187bd4();
  }
  return;
}

