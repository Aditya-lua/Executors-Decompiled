
void FUN_00618f8c(void)

{
  undefined8 *puVar1;
  long lVar2;
  ulong uVar3;
  
  puVar1 = (undefined8 *)func_0x0001753c();
  puVar1[-1] = &UNK_009f8128;
  *puVar1 = &UNK_009f82d8;
  lVar2 = puVar1[0xb];
  uVar3 = puVar1[9];
  if ((ulong)puVar1[10] <= (ulong)puVar1[9]) {
    uVar3 = puVar1[10];
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
  puVar1[-1] = &UNK_00a0c238;
  *puVar1 = &UNK_00a0c3e0;
  if ((long *)puVar1[2] != (long *)0x0) {
    (**(code **)(*(long *)puVar1[2] + 8))();
  }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)(puVar1 + -1);
  return;
}

