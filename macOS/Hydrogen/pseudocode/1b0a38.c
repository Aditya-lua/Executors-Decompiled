
void FUN_001b0a38(undefined8 param_1,long param_2)

{
  undefined8 uVar1;
  ulong uVar2;
  long lVar3;
  long lVar4;
  long *unaff_x19;
  long unaff_x20;
  
  if ((ulong)(*unaff_x19 - param_2) < 2) {
    func_0x0079b61c();
    param_2 = unaff_x19[2];
  }
  *(undefined2 *)(unaff_x19[1] + param_2) = 0x301;
  param_2 = param_2 + 2;
  unaff_x19[2] = param_2;
  uVar1 = *(undefined8 *)(unaff_x20 + 0x10);
  uVar2 = *(ulong *)(unaff_x20 + 0x18);
  lVar3 = *unaff_x19;
  if ((ulong)(lVar3 - param_2) < 2) {
    func_0x0079b61c();
    param_2 = unaff_x19[2];
    lVar3 = *unaff_x19;
  }
  lVar4 = unaff_x19[1];
  *(ushort *)(lVar4 + param_2) =
       (ushort)(uVar2 >> 8) & 0xff | (ushort)(((uint)uVar2 & 0xff00ff) << 8);
  param_2 = param_2 + 2;
  unaff_x19[2] = param_2;
  if ((ulong)(lVar3 - param_2) < uVar2) {
    func_0x0079b61c();
    lVar4 = unaff_x19[1];
    param_2 = unaff_x19[2];
  }
  _memcpy(lVar4 + param_2,uVar1,uVar2);
  unaff_x19[2] = param_2 + uVar2;
  func_0x0024031c();
  return;
}

