
void FUN_005d7750(undefined1 *param_1,undefined8 *param_2,long param_3)

{
  long in_x9;
  long in_x10;
  undefined1 *in_x11;
  
  for (; in_x11 != param_1; in_x11 = in_x11 + 1) {
    *(undefined1 *)(in_x10 + in_x9) = *in_x11;
    in_x9 = in_x9 + 1;
  }
  param_2[1] = in_x11;
  *(long *)(param_3 + 8) = in_x9;
  if (param_2[2] == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(*param_2,param_2[2],1);
  return;
}

