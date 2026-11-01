
void FUN_001ad4dc(long param_1)

{
  long lVar1;
  long *unaff_x19;
  long unaff_x20;
  ulong uVar2;
  undefined8 uVar3;
  undefined1 uStack0000000000000008;
  undefined1 *puStack0000000000000010;
  long lStack0000000000000018;
  
  _uStack0000000000000008 = 0;
  puStack0000000000000010 = (undefined1 *)((long)&MACH_HEADER.magic + 1);
  lStack0000000000000018 = 0;
  uVar2 = *(ulong *)(param_1 + 0x10);
  func_0x00458a18(&uStack0000000000000008,&UNK_009c9a90);
  *puStack0000000000000010 = (char)uVar2;
  lStack0000000000000018 = 1;
  uVar3 = *(undefined8 *)(unaff_x20 + 8);
  if (_uStack0000000000000008 - 1U < uVar2) {
    func_0x0079b61c(&uStack0000000000000008,1,uVar2,1,1);
  }
  lVar1 = lStack0000000000000018;
  _memcpy(puStack0000000000000010 + lStack0000000000000018,uVar3,uVar2);
  lStack0000000000000018 = lVar1 + uVar2;
  func_0x001a712c(unaff_x20 + 0x18,&uStack0000000000000008);
  unaff_x19[1] = (long)puStack0000000000000010;
  *unaff_x19 = _uStack0000000000000008;
  unaff_x19[2] = lStack0000000000000018;
  return;
}

