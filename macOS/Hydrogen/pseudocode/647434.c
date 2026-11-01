
void FUN_00647434(long param_1)

{
  undefined1 in_ZR;
  undefined8 *puVar1;
  long in_x9;
  
  while (!(bool)in_ZR) {
    *(undefined4 *)(in_x9 + param_1 * 4) = 0;
    param_1 = param_1 + -1;
    in_ZR = param_1 == 0;
  }
  __ZdlPv();
  __Unwind_Resume();
  puVar1 = (undefined8 *)__Znwm(8);
  *puVar1 = &UNK_00a0a428;
  return;
}

