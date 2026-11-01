
void FUN_00585c40(long param_1,undefined8 param_2)

{
  long *in_x9;
  long in_x10;
  undefined8 *in_x11;
  long in_x12;
  undefined8 *in_x13;
  undefined8 in_x14;
  
  while( true ) {
    *(undefined8 *)(in_x12 + in_x10 * 8) = in_x14;
    in_x10 = in_x10 + 1;
    if (in_x13 == in_x11) break;
    in_x14 = *in_x13;
    in_x13 = in_x13 + 1;
  }
  *in_x9 = in_x10;
  if (param_1 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(param_2,param_1 << 3,8);
  return;
}

