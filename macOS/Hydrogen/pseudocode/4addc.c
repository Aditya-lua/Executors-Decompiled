
void FUN_0004addc(long param_1)

{
  undefined4 *extraout_x8;
  long in_x9;
  long unaff_x19;
  long unaff_x21;
  
  *(undefined1 *)(unaff_x19 + 0x51) = 0;
  if (in_x9 == unaff_x21 && param_1 != 0) {
    do {
      *(undefined4 *)(unaff_x19 + 0xc + param_1 * 4) = 0;
      param_1 = param_1 + -1;
    } while (param_1 != 0);
  }
  __ZdlPv();
  __Unwind_Resume();
  *(undefined1 *)((long)extraout_x8 + 0x17) = 3;
  *extraout_x8 = 0x35444d;
  return;
}

