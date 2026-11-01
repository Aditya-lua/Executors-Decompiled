
undefined8 * FUN_0068b154(undefined8 *param_1)

{
  char cVar1;
  
  *param_1 = &UNK_00a13eb0;
  param_1[1] = &UNK_00a14060;
  param_1[0x25] = &UNK_00a13ca8;
  param_1[0x26] = &UNK_00a13e38;
  func_0x00688b30(param_1 + 0x38);
  func_0x0068b218(param_1 + 0x32);
  func_0x006989cc(param_1 + 0x29);
  param_1[0xc] = &UNK_00a13ca8;
  param_1[0xd] = &UNK_00a13e38;
  func_0x00688b30(param_1 + 0x1f);
  func_0x0068b218(param_1 + 0x19);
  func_0x006989cc(param_1 + 0x10);
  if (*(char *)((long)param_1 + 0x5f) < '\0') {
    __ZdlPv(param_1[9]);
    cVar1 = *(char *)((long)param_1 + 0x47);
  }
  else {
    cVar1 = *(char *)((long)param_1 + 0x47);
  }
  if (cVar1 < '\0') {
    __ZdlPv(param_1[6]);
  }
  *param_1 = &UNK_00a0c238;
  param_1[1] = &UNK_00a0c3e0;
  if ((long *)param_1[3] != (long *)0x0) {
    (**(code **)(*(long *)param_1[3] + 8))();
  }
  return param_1;
}

