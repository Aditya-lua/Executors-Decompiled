
void FUN_001b72b0(long param_1)

{
  undefined8 uVar1;
  ulong uVar2;
  long in_x9;
  long lVar3;
  long *unaff_x19;
  long unaff_x20;
  
  unaff_x19[2] = param_1;
  uVar1 = *(undefined8 *)(unaff_x20 + 0x38);
  uVar2 = *(ulong *)(unaff_x20 + 0x40);
  if ((ulong)(in_x9 - param_1) < 2) {
    func_0x0079b61c();
    param_1 = unaff_x19[2];
    in_x9 = *unaff_x19;
  }
  lVar3 = unaff_x19[1];
  *(ushort *)(lVar3 + param_1) =
       (ushort)(uVar2 >> 8) & 0xff | (ushort)(((uint)uVar2 & 0xff00ff) << 8);
  param_1 = param_1 + 2;
  unaff_x19[2] = param_1;
  if ((ulong)(in_x9 - param_1) < uVar2) {
    func_0x0079b61c();
    lVar3 = unaff_x19[1];
    param_1 = unaff_x19[2];
  }
  _memcpy(lVar3 + param_1,uVar1,uVar2);
  unaff_x19[2] = param_1 + uVar2;
  return;
}

