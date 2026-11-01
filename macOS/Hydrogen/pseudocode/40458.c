
undefined8 * FUN_00040458(void)

{
  long lVar1;
  undefined8 *puVar2;
  ulong uVar3;
  long *in_stack_00000010;
  
  if (in_stack_00000010 != (long *)0x0) {
    (**(code **)(*in_stack_00000010 + 8))();
  }
  __Unwind_Resume();
  puVar2 = (undefined8 *)func_0x0001753c();
  *puVar2 = &UNK_00a0c668;
  puVar2[1] = &UNK_00a0c878;
  if ((long *)puVar2[0x12] != (long *)0x0) {
    (**(code **)(*(long *)puVar2[0x12] + 8))();
  }
  *puVar2 = &UNK_00a0c410;
  puVar2[1] = &UNK_00a0c620;
  lVar1 = puVar2[0xd];
  uVar3 = puVar2[0xb];
  if ((ulong)puVar2[0xc] <= (ulong)puVar2[0xb]) {
    uVar3 = puVar2[0xc];
  }
  if (lVar1 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined1 *)(lVar1 + -1 + uVar3) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  *puVar2 = &UNK_00a0c238;
  puVar2[1] = &UNK_00a0c3e0;
  if ((long *)puVar2[3] != (long *)0x0) {
    (**(code **)(*(long *)puVar2[3] + 8))();
  }
  return puVar2;
}

