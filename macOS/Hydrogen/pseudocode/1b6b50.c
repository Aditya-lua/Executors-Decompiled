
void FUN_001b6b50(long param_1,undefined8 param_2,undefined8 param_3)

{
  undefined8 uVar1;
  ulong uVar2;
  bool in_ZR;
  bool in_CY;
  long lVar3;
  long *unaff_x19;
  long unaff_x20;
  ulong unaff_x21;
  long unaff_x23;
  long lVar4;
  
  if (!in_CY || in_ZR) {
    func_0x0079b61c();
    param_1 = unaff_x19[2];
    unaff_x23 = *unaff_x19;
  }
  lVar4 = unaff_x19[1];
  *(ushort *)(lVar4 + param_1) =
       (ushort)(unaff_x21 >> 8) & 0xff | (ushort)(((uint)unaff_x21 & 0xff00ff) << 8);
  param_1 = param_1 + 2;
  unaff_x19[2] = param_1;
  if ((ulong)(unaff_x23 - param_1) < unaff_x21) {
    func_0x0079b61c();
    lVar4 = unaff_x19[1];
    param_1 = unaff_x19[2];
    unaff_x23 = *unaff_x19;
  }
  _memcpy(lVar4 + param_1,param_3);
  param_1 = param_1 + unaff_x21;
  unaff_x19[2] = param_1;
  uVar1 = *(undefined8 *)(unaff_x20 + 0x20);
  uVar2 = *(ulong *)(unaff_x20 + 0x28);
  if ((ulong)(unaff_x23 - param_1) < 2) {
    func_0x0079b61c();
    lVar4 = unaff_x19[1];
    param_1 = unaff_x19[2];
    unaff_x23 = *unaff_x19;
  }
  *(ushort *)(lVar4 + param_1) =
       (ushort)(uVar2 >> 8) & 0xff | (ushort)(((uint)uVar2 & 0xff00ff) << 8);
  param_1 = param_1 + 2;
  unaff_x19[2] = param_1;
  if ((ulong)(unaff_x23 - param_1) < uVar2) {
    func_0x0079b61c();
    lVar4 = unaff_x19[1];
    param_1 = unaff_x19[2];
  }
  _memcpy(lVar4 + param_1,uVar1,uVar2);
  lVar4 = *unaff_x19;
  param_1 = param_1 + uVar2;
  unaff_x19[2] = param_1;
  uVar1 = *(undefined8 *)(unaff_x20 + 0x38);
  uVar2 = *(ulong *)(unaff_x20 + 0x40);
  if ((ulong)(lVar4 - param_1) < 2) {
    func_0x0079b61c();
    param_1 = unaff_x19[2];
    lVar4 = *unaff_x19;
  }
  lVar3 = unaff_x19[1];
  *(ushort *)(lVar3 + param_1) =
       (ushort)(uVar2 >> 8) & 0xff | (ushort)(((uint)uVar2 & 0xff00ff) << 8);
  param_1 = param_1 + 2;
  unaff_x19[2] = param_1;
  if ((ulong)(lVar4 - param_1) < uVar2) {
    func_0x0079b61c();
    lVar3 = unaff_x19[1];
    param_1 = unaff_x19[2];
  }
  _memcpy(lVar3 + param_1,uVar1,uVar2);
  unaff_x19[2] = param_1 + uVar2;
  return;
}

