
void FUN_005e4c50(uint *param_1,undefined8 param_2)

{
  long in_x9;
  uint *in_x10;
  uint in_w11;
  long *unaff_x19;
  
  while( true ) {
    *param_1 = in_w11;
    in_x9 = in_x9 + -1;
    if (in_x9 == 0) break;
    in_w11 = param_1[1] ^ *in_x10;
    param_1 = param_1 + 1;
    in_x10 = in_x10 + 1;
  }
  if (*unaff_x19 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(param_2,*unaff_x19 << 2,4);
  return;
}

