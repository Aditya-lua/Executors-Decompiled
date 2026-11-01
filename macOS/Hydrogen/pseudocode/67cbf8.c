
void FUN_0067cbf8(void)

{
  undefined8 *puVar1;
  long lVar2;
  ulong uVar3;
  
  func_0x006553a4();
  __ZdlPv();
  puVar1 = (undefined8 *)__Unwind_Resume();
  *puVar1 = &UNK_00a0f1c0;
  lVar2 = puVar1[0x17];
  uVar3 = puVar1[0x15];
  if ((ulong)puVar1[0x16] <= (ulong)puVar1[0x15]) {
    uVar3 = puVar1[0x16];
  }
  if (lVar2 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(lVar2 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  func_0x006553a4(puVar1);
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)();
  return;
}

