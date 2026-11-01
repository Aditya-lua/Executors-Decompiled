
void FUN_005f3c14(undefined8 param_1)

{
  undefined8 uVar1;
  undefined8 *puVar2;
  long lVar3;
  ulong uVar4;
  undefined1 uStack0000000000000030;
  
  ___cxa_free_exception();
  func_0x0003e9ec(&uStack0000000000000030);
  __Unwind_Resume(param_1);
  uVar1 = func_0x0001753c();
  func_0x0003e9ec(&uStack0000000000000030);
  puVar2 = (undefined8 *)__Unwind_Resume(uVar1);
  puVar2[-1] = &UNK_009f5ae0;
  *puVar2 = &UNK_009f5c90;
  lVar3 = puVar2[0x14];
  uVar4 = puVar2[0x12];
  if ((ulong)puVar2[0x13] <= (ulong)puVar2[0x12]) {
    uVar4 = puVar2[0x13];
  }
  if (lVar3 != 0) {
    if (uVar4 != 0) {
      do {
        *(undefined1 *)(lVar3 + -1 + uVar4) = 0;
        uVar4 = uVar4 - 1;
      } while (uVar4 != 0);
    }
    func_0x00611644();
  }
  func_0x006989cc(puVar2 + 8);
  puVar2[-1] = &UNK_00a0c238;
  *puVar2 = &UNK_00a0c3e0;
  if ((long *)puVar2[2] != (long *)0x0) {
    (**(code **)(*(long *)puVar2[2] + 8))();
  }
  return;
}

