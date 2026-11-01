
void FUN_005f3bc0(void)

{
  undefined8 *puVar1;
  long lVar2;
  ulong uVar3;
  undefined8 unaff_x19;
  uint unaff_w21;
  undefined8 in_stack_00000000;
  long in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined1 uStack0000000000000030;
  
  __ZdlPv(in_stack_00000018);
  if (in_stack_00000010 < 0) {
    __ZdlPv(in_stack_00000000);
    unaff_w21 = unaff_w21 & 1;
  }
  if (unaff_w21 != 0) {
    ___cxa_free_exception();
    func_0x0003e9ec(&uStack0000000000000030);
    __Unwind_Resume();
    unaff_x19 = func_0x0001753c();
  }
  func_0x0003e9ec(&uStack0000000000000030);
  puVar1 = (undefined8 *)__Unwind_Resume(unaff_x19);
  puVar1[-1] = &UNK_009f5ae0;
  *puVar1 = &UNK_009f5c90;
  lVar2 = puVar1[0x14];
  uVar3 = puVar1[0x12];
  if ((ulong)puVar1[0x13] <= (ulong)puVar1[0x12]) {
    uVar3 = puVar1[0x13];
  }
  if (lVar2 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined1 *)(lVar2 + -1 + uVar3) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  func_0x006989cc(puVar1 + 8);
  puVar1[-1] = &UNK_00a0c238;
  *puVar1 = &UNK_00a0c3e0;
  if ((long *)puVar1[2] != (long *)0x0) {
    (**(code **)(*(long *)puVar1[2] + 8))();
  }
  return;
}

