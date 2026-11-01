
void FUN_001bd62c(long param_1,long *param_2)

{
  long lVar1;
  undefined8 uVar2;
  ulong uVar3;
  undefined1 uVar4;
  ushort uVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  uint uVar9;
  
  uVar5 = *(ushort *)(param_1 + 0x30);
  if (uVar5 < 2) {
    if (uVar5 == 0) {
      uVar9 = 1;
    }
    else {
      uVar9 = 2;
    }
  }
  else if (uVar5 == 2) {
    uVar9 = 3;
  }
  else {
    uVar9 = (uint)*(ushort *)(param_1 + 0x32);
  }
  lVar6 = param_2[2];
  if ((ulong)(*param_2 - lVar6) < 2) {
    func_0x0079b61c(param_2,lVar6,2,1,1);
    lVar6 = param_2[2];
  }
  lVar7 = param_2[1];
  *(ushort *)(lVar7 + lVar6) = (ushort)(uVar9 >> 8) | (ushort)((uVar9 & 0xff00ff) << 8);
  lVar6 = lVar6 + 2;
  param_2[2] = lVar6;
  uVar5 = *(ushort *)(param_1 + 0x34);
  if (uVar5 < 2) {
    if (uVar5 == 0) {
      uVar9 = 1;
    }
    else {
      uVar9 = 2;
    }
  }
  else if (uVar5 == 2) {
    uVar9 = 3;
  }
  else if (uVar5 == 3) {
    uVar9 = 0xffff;
  }
  else {
    uVar9 = (uint)*(ushort *)(param_1 + 0x36);
  }
  lVar8 = *param_2;
  if ((ulong)(lVar8 - lVar6) < 2) {
    func_0x0079b61c(param_2,lVar6,2,1,1);
    lVar7 = param_2[1];
    lVar6 = param_2[2];
    lVar8 = *param_2;
  }
  *(ushort *)(lVar7 + lVar6) = (ushort)(uVar9 >> 8) | (ushort)((uVar9 & 0xff00ff) << 8);
  lVar1 = lVar6 + 2;
  param_2[2] = lVar1;
  uVar4 = *(undefined1 *)(param_1 + 0x38);
  if (lVar1 == lVar8) {
    func_0x00458a18(param_2,&UNK_009c9a90);
    lVar7 = param_2[1];
  }
  *(undefined1 *)(lVar7 + lVar1) = uVar4;
  lVar6 = lVar6 + 3;
  param_2[2] = lVar6;
  uVar2 = *(undefined8 *)(param_1 + 8);
  uVar3 = *(ulong *)(param_1 + 0x10);
  lVar7 = *param_2;
  if ((ulong)(lVar7 - lVar6) < 2) {
    func_0x0079b61c(param_2,lVar6,2,1,1);
    lVar6 = param_2[2];
    lVar7 = *param_2;
  }
  lVar8 = param_2[1];
  *(ushort *)(lVar8 + lVar6) = (ushort)(uVar3 >> 8) & 0xff | (ushort)(((uint)uVar3 & 0xff00ff) << 8)
  ;
  lVar6 = lVar6 + 2;
  param_2[2] = lVar6;
  if ((ulong)(lVar7 - lVar6) < uVar3) {
    func_0x0079b61c(param_2,lVar6,uVar3,1,1);
    lVar8 = param_2[1];
    lVar6 = param_2[2];
  }
  _memcpy(lVar8 + lVar6,uVar2,uVar3);
  lVar7 = *param_2;
  lVar6 = lVar6 + uVar3;
  param_2[2] = lVar6;
  uVar2 = *(undefined8 *)(param_1 + 0x20);
  uVar3 = *(ulong *)(param_1 + 0x28);
  if ((ulong)(lVar7 - lVar6) < 2) {
    func_0x0079b61c(param_2,lVar6,2,1,1);
    lVar6 = param_2[2];
    lVar7 = *param_2;
  }
  lVar8 = param_2[1];
  *(ushort *)(lVar8 + lVar6) = (ushort)(uVar3 >> 8) & 0xff | (ushort)(((uint)uVar3 & 0xff00ff) << 8)
  ;
  lVar6 = lVar6 + 2;
  param_2[2] = lVar6;
  if ((ulong)(lVar7 - lVar6) < uVar3) {
    func_0x0079b61c(param_2,lVar6,uVar3,1,1);
    lVar8 = param_2[1];
    lVar6 = param_2[2];
  }
  _memcpy(lVar8 + lVar6,uVar2,uVar3);
  param_2[2] = lVar6 + uVar3;
  return;
}

