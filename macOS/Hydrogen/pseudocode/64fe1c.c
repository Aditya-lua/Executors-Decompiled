
void FUN_0064fe1c(void)

{
  undefined8 *puVar1;
  long lVar2;
  ulong uVar3;
  
  puVar1 = (undefined8 *)__Unwind_Resume();
  *puVar1 = &UNK_00a09a70;
  lVar2 = puVar1[8];
  uVar3 = puVar1[6];
  if ((ulong)puVar1[7] <= (ulong)puVar1[6]) {
    uVar3 = puVar1[7];
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
  lVar2 = puVar1[4];
  uVar3 = puVar1[2];
  if ((ulong)puVar1[3] <= (ulong)puVar1[2]) {
    uVar3 = puVar1[3];
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
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)(puVar1);
  return;
}

