
bool FUN_00432610(long param_1,undefined8 param_2,ulong param_3)

{
  long lVar1;
  
  if (0x7ffffffd < param_3) {
    param_3 = 0x7ffffffe;
  }
  lVar1 = _write(*(undefined4 *)(param_1 + 0x90),param_2,param_3);
  if (lVar1 == -1) {
    ___error();
  }
  return lVar1 == -1;
}

