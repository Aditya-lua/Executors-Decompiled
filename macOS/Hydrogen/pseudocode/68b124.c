
undefined8 * FUN_0068b124(void)

{
  char cVar1;
  undefined8 uVar2;
  undefined8 *puVar3;
  
  __ZdlPv();
  uVar2 = __Unwind_Resume();
  __ZdlPv();
  puVar3 = (undefined8 *)__Unwind_Resume(uVar2);
  *puVar3 = &UNK_00a13eb0;
  puVar3[1] = &UNK_00a14060;
  puVar3[0x25] = &UNK_00a13ca8;
  puVar3[0x26] = &UNK_00a13e38;
  func_0x00688b30(puVar3 + 0x38);
  func_0x0068b218(puVar3 + 0x32);
  func_0x006989cc(puVar3 + 0x29);
  puVar3[0xc] = &UNK_00a13ca8;
  puVar3[0xd] = &UNK_00a13e38;
  func_0x00688b30(puVar3 + 0x1f);
  func_0x0068b218(puVar3 + 0x19);
  func_0x006989cc(puVar3 + 0x10);
  if (*(char *)((long)puVar3 + 0x5f) < '\0') {
    __ZdlPv(puVar3[9]);
    cVar1 = *(char *)((long)puVar3 + 0x47);
  }
  else {
    cVar1 = *(char *)((long)puVar3 + 0x47);
  }
  if (cVar1 < '\0') {
    __ZdlPv(puVar3[6]);
  }
  *puVar3 = &UNK_00a0c238;
  puVar3[1] = &UNK_00a0c3e0;
  if ((long *)puVar3[3] != (long *)0x0) {
    (**(code **)(*(long *)puVar3[3] + 8))();
  }
  return puVar3;
}

