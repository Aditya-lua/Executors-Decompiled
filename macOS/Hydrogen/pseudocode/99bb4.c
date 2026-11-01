
int FUN_00099bb4(ulong param_1,undefined8 param_2)

{
  long lVar1;
  char unaff_w19;
  int unaff_w21;
  int unaff_w23;
  long unaff_x28;
  
  param_1 = param_1 >> 7;
  _memset(param_2,0xff,param_1 + 1);
  *(char *)(param_1 + unaff_x28 + 2) = (char)param_1 + unaff_w19;
  lVar1 = param_1 + unaff_x28 + 3;
  _memcpy(lVar1);
  return ((int)lVar1 + unaff_w21) - unaff_w23;
}

