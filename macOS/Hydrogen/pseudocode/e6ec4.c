
void FUN_000e6ec4(ulong param_1)

{
  uint *puVar1;
  int iVar2;
  long unaff_x19;
  uint *puVar3;
  char *pcStack0000000000000000;
  ulong uStack0000000000000008;
  
  pcStack0000000000000000 = "Storage";
  uStack0000000000000008 = param_1;
  iVar2 = func_0x001226d4("Storage","%s: %d entries, %d bytes");
  if (iVar2 != 0) {
    if (*(int *)(unaff_x19 + 0x280) != 0) {
      puVar3 = *(uint **)(unaff_x19 + 0x288);
      puVar1 = puVar3 + (long)*(int *)(unaff_x19 + 0x280) * 4;
      do {
        pcStack0000000000000000 = (char *)(ulong)*puVar3;
        uStack0000000000000008 = (ulong)puVar3[2];
        func_0x0010b3a8("Key 0x%08X Value { i: %d }");
        puVar3 = puVar3 + 4;
      } while (puVar3 != puVar1);
    }
    func_0x00123710();
  }
  func_0x00123710();
  return;
}

