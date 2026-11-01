
bool FUN_006e25cc(long param_1,undefined8 param_2,int param_3)

{
  int iVar1;
  
  iVar1 = *(int *)(param_1 + (long)param_3 * 0x10 + 0xc);
  return iVar1 == 8 || iVar1 == 2;
}

