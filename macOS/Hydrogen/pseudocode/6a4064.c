
void FUN_006a4064(long param_1,long *param_2)

{
  *param_2 = param_1 + 0xb88;
  param_2[1] = param_1 + 0xd18;
  _bzero(param_2 + 3,0x40c);
  return;
}

