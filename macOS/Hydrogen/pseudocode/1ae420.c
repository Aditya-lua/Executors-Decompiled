
void thunk_FUN_001ae488(long param_1)

{
  undefined8 uVar1;
  ulong uVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  long *unaff_x19;
  uint unaff_w20;
  
  lVar3 = unaff_x19[2];
  lVar4 = *unaff_x19;
  if ((ulong)(lVar4 - lVar3) < 2) {
    func_0x0079b61c();
    lVar3 = unaff_x19[2];
    lVar4 = *unaff_x19;
  }
  lVar5 = unaff_x19[1];
  *(ushort *)(lVar5 + lVar3) =
       (ushort)(unaff_w20 >> 8) & 0xff | (ushort)((unaff_w20 & 0xff00ff) << 8);
  lVar3 = lVar3 + 2;
  unaff_x19[2] = lVar3;
  uVar1 = *(undefined8 *)(param_1 + 8);
  uVar2 = *(ulong *)(param_1 + 0x10);
  if ((ulong)(lVar4 - lVar3) < 2) {
    func_0x0079b61c();
    lVar5 = unaff_x19[1];
    lVar3 = unaff_x19[2];
    lVar4 = *unaff_x19;
  }
  *(ushort *)(lVar5 + lVar3) = (ushort)(uVar2 >> 8) & 0xff | (ushort)(((uint)uVar2 & 0xff00ff) << 8)
  ;
  lVar3 = lVar3 + 2;
  unaff_x19[2] = lVar3;
  if ((ulong)(lVar4 - lVar3) < uVar2) {
    func_0x0079b61c();
    lVar5 = unaff_x19[1];
    lVar3 = unaff_x19[2];
  }
  _memcpy(lVar5 + lVar3,uVar1,uVar2);
  unaff_x19[2] = lVar3 + uVar2;
  return;
}

