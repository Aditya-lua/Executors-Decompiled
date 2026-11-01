
undefined8 * FUN_0068b130(undefined8 param_1)

{
  char cVar1;
  undefined8 *puVar2;
  
  __ZdlPv();
  puVar2 = (undefined8 *)__Unwind_Resume(param_1);
  *puVar2 = &UNK_00a13eb0;
  puVar2[1] = &UNK_00a14060;
  puVar2[0x25] = &UNK_00a13ca8;
  puVar2[0x26] = &UNK_00a13e38;
  func_0x00688b30(puVar2 + 0x38);
  func_0x0068b218(puVar2 + 0x32);
  func_0x006989cc(puVar2 + 0x29);
  puVar2[0xc] = &UNK_00a13ca8;
  puVar2[0xd] = &UNK_00a13e38;
  func_0x00688b30(puVar2 + 0x1f);
  func_0x0068b218(puVar2 + 0x19);
  func_0x006989cc(puVar2 + 0x10);
  if (*(char *)((long)puVar2 + 0x5f) < '\0') {
    __ZdlPv(puVar2[9]);
    cVar1 = *(char *)((long)puVar2 + 0x47);
  }
  else {
    cVar1 = *(char *)((long)puVar2 + 0x47);
  }
  if (cVar1 < '\0') {
    __ZdlPv(puVar2[6]);
  }
  *puVar2 = &UNK_00a0c238;
  puVar2[1] = &UNK_00a0c3e0;
  if ((long *)puVar2[3] != (long *)0x0) {
    (**(code **)(*(long *)puVar2[3] + 8))();
  }
  return puVar2;
}

