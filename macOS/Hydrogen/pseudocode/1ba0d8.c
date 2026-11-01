
void FUN_001ba0d8(void)

{
  ushort *puVar1;
  uint uVar2;
  long lVar3;
  long lVar4;
  long *unaff_x19;
  ulong unaff_x20;
  long lVar5;
  
  func_0x0079b61c();
  lVar4 = unaff_x19[1];
  lVar5 = unaff_x19[2];
  lVar3 = *unaff_x19;
  uVar2 = (uint)unaff_x20 & 0xff00ff;
  puVar1 = (ushort *)(lVar4 + lVar5);
  *(char *)(puVar1 + 1) = (char)uVar2;
  *puVar1 = (ushort)(byte)(uVar2 >> 0x10) |
            (ushort)(((((uint)unaff_x20 & 0xff00ff00) >> 8) << 0x10) >> 8);
  lVar5 = lVar5 + 3;
  unaff_x19[2] = lVar5;
  if ((ulong)(lVar3 - lVar5) < unaff_x20) {
    func_0x0079b61c();
    lVar4 = unaff_x19[1];
    lVar5 = unaff_x19[2];
  }
  _memcpy(lVar4 + lVar5);
  unaff_x19[2] = lVar5 + unaff_x20;
  return;
}

