
undefined8 FUN_00651d54(long param_1,long param_2)

{
  long lVar1;
  
  do {
    *(undefined8 *)(param_2 + -8 + param_1 * 8) = 0;
    param_1 = param_1 + -1;
  } while (param_1 != 0);
  func_0x00611644();
  __Unwind_Resume();
  lVar1 = func_0x0001753c();
  return *(undefined8 *)(lVar1 + 8);
}

