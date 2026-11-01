
void FUN_005e4230(long param_1)

{
  ulong in_x9;
  ulong in_x10;
  long in_x11;
  uint *in_x12;
  uint *in_x13;
  uint in_w14;
  uint in_w15;
  
  while( true ) {
    *in_x13 = in_w15 & in_w14;
    in_x11 = in_x11 + -1;
    if (in_x11 == 0) break;
    in_w14 = *in_x12;
    in_w15 = in_x13[1];
    in_x12 = in_x12 + 1;
    in_x13 = in_x13 + 1;
  }
  if (in_x10 < in_x9 || in_x10 - in_x9 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b31b4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__bzero_00a24c68)(param_1 + in_x9 * 4,(in_x10 - in_x9) * 4);
  return;
}

