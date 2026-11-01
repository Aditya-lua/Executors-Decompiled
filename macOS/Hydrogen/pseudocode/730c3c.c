
void FUN_00730c3c(long param_1,int param_2)

{
  long lVar1;
  
  lVar1 = *(long *)(param_1 + 0x18) + (long)param_2 * 0x10;
  *(undefined8 *)(lVar1 + 0x278) = 0;
  *(undefined8 *)(lVar1 + 0x270) = 0;
  return;
}

