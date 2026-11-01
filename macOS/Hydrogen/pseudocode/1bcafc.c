
void FUN_001bcafc(long param_1,long param_2,long *param_3)

{
  undefined8 uVar1;
  ulong uVar2;
  long in_x9;
  long lVar3;
  undefined2 in_w11;
  
  lVar3 = param_3[1];
  *(undefined2 *)(lVar3 + param_1) = in_w11;
  param_1 = param_1 + 2;
  param_3[2] = param_1;
  uVar1 = *(undefined8 *)(param_2 + 0x10);
  uVar2 = *(ulong *)(param_2 + 0x18);
  if ((ulong)(in_x9 - param_1) < 2) {
    func_0x0079b61c(param_3,param_1,2,1,1);
    lVar3 = param_3[1];
    param_1 = param_3[2];
    in_x9 = *param_3;
  }
  *(ushort *)(lVar3 + param_1) =
       (ushort)(uVar2 >> 8) & 0xff | (ushort)(((uint)uVar2 & 0xff00ff) << 8);
  param_1 = param_1 + 2;
  param_3[2] = param_1;
  if ((ulong)(in_x9 - param_1) < uVar2) {
    func_0x0079b61c(param_3,param_1,uVar2,1,1);
    lVar3 = param_3[1];
    param_1 = param_3[2];
  }
  _memcpy(lVar3 + param_1,uVar1,uVar2);
  param_3[2] = param_1 + uVar2;
  return;
}

