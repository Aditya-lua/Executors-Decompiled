
void FUN_00588c94(undefined8 *param_1,undefined8 *param_2)

{
  code *pcVar1;
  long lVar2;
  undefined8 in_x9;
  long *in_x10;
  undefined8 *in_x11;
  long in_x12;
  undefined8 *in_x13;
  long in_x14;
  undefined8 unaff_x19;
  undefined8 unaff_x21;
  undefined8 *puStack0000000000000008;
  
  while( true ) {
    lVar2 = *in_x10;
    *in_x10 = lVar2 + in_x14;
    in_x13 = in_x13 + 1;
    in_x12 = in_x12 + -1;
    if (lVar2 < 0) {
      puStack0000000000000008 = in_x13;
      func_0x007a05dc();
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x588cb0);
      (*pcVar1)();
    }
    *in_x13 = in_x10;
    if (in_x12 == 0) break;
    in_x10 = *(long **)*in_x11;
    in_x11 = in_x11 + 1;
  }
  *param_2 = 8;
  param_2[1] = 8;
  param_2[2] = 0;
  param_2[3] = 8;
  *param_1 = unaff_x21;
  param_1[1] = unaff_x19;
  param_1[2] = in_x9;
  return;
}

