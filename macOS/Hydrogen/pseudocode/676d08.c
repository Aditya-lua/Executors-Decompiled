
void FUN_00676d08(code *param_1)

{
  long *unaff_x19;
  long unaff_x21;
  
  while( true ) {
    (*param_1)();
    if (unaff_x21 == 0) break;
    param_1 = *(code **)(*unaff_x19 + 0x38);
    unaff_x21 = unaff_x21 + -1;
  }
  return;
}

