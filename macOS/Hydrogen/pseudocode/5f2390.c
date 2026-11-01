
void FUN_005f2390(undefined8 *param_1,undefined8 param_2,undefined8 param_3)

{
  code *pcVar1;
  undefined8 *unaff_x19;
  undefined8 unaff_x21;
  int unaff_w22;
  undefined4 uStack0000000000000018;
  
  *param_1 = 0;
  *unaff_x19 = &UNK_009b2ec8;
  *(undefined4 *)(unaff_x19 + 1) = 0;
  if (unaff_w22 < 0) {
    func_0x00017634(unaff_x19 + 2);
  }
  else {
    unaff_x19[2] = unaff_x21;
    unaff_x19[3] = param_3;
    *(undefined4 *)(unaff_x19 + 4) = uStack0000000000000018;
    *(int *)((long)unaff_x19 + 0x23) = (int)((ulong)_uStack0000000000000018 >> 0x18);
    *(char *)((long)unaff_x19 + 0x27) = (char)unaff_w22;
  }
  *unaff_x19 = &UNK_009b2ea0;
  ___cxa_throw();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x5f23f8);
  (*pcVar1)();
}

