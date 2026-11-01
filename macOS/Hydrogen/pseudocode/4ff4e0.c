
void FUN_004ff4e0(long param_1)

{
  long lVar1;
  long lVar2;
  bool bVar3;
  undefined1 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined1 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  undefined1 *puStack0000000000000030;
  undefined8 uStack0000000000000038;
  undefined8 uStack0000000000000040;
  undefined1 uStack0000000000000050;
  undefined *puStack0000000000000058;
  undefined *puStack0000000000000068;
  
  bVar3 = *(long *)(param_1 + 0x110) != -0x8000000000000000;
  lVar1 = 0x230;
  if (bVar3) {
    lVar1 = 0x118;
  }
  lVar2 = 0x238;
  if (bVar3) {
    lVar2 = 0x120;
  }
  uStack0000000000000018 = *(undefined8 *)(param_1 + lVar2);
  _uStack0000000000000010 = *(undefined8 *)(param_1 + lVar1);
  _uStack0000000000000050 = &uStack0000000000000010;
  puStack0000000000000058 = &DAT_00519924;
  puStack0000000000000068 = &DAT_00519924;
  _uStack0000000000000020 = &UNK_009e8b18;
  uStack0000000000000028 = 3;
  puStack0000000000000030 = &uStack0000000000000050;
  uStack0000000000000038 = 2;
  uStack0000000000000040 = 0;
  func_0x00459f08(&uStack0000000000000020);
  return;
}

