
void FUN_00467c00(long param_1,uint param_2,long param_3,long *param_4)

{
  uint uVar1;
  uint uVar2;
  long in_x9;
  long lVar3;
  ulong in_x10;
  ulong uVar4;
  ulong uVar5;
  
  uVar4 = (ulong)param_2 * (in_x10 & 0xffffffff);
  uVar5 = uVar4 >> 0x2d;
  uVar1 = (uint)(uVar4 >> 0x20);
  param_2 = param_2 + (uVar1 >> 0xd) * -10000;
  uVar2 = (param_2 >> 2 & 0x3fff) / 0x19;
  lVar3 = in_x9 + -4;
  *(undefined2 *)(param_3 + lVar3) = *(undefined2 *)(param_1 + (ulong)uVar2 * 2);
  ((undefined2 *)(param_3 + lVar3))[1] =
       *(undefined2 *)(param_1 + ((ulong)(param_2 + uVar2 * -100) & 0xffff) * 2);
  uVar2 = uVar1 >> 0xd;
  if (uVar2 < 100) {
    uVar1 = uVar2;
    uVar2 = uVar2 & 0xffff;
  }
  else {
    uVar1 = (uVar1 >> 0xf & 0x3fff) / 0x19;
    uVar5 = (ulong)uVar1;
    lVar3 = in_x9 + -6;
    *(undefined2 *)(param_3 + lVar3) =
         *(undefined2 *)(param_1 + ((ulong)(uVar2 + uVar1 * -100) & 0xffff) * 2);
    uVar2 = uVar1;
  }
  if (uVar2 < 10) {
    *(byte *)(param_3 + lVar3 + -1) = (byte)uVar1 | 0x30;
    *param_4 = lVar3 + -1;
    return;
  }
  *(undefined2 *)(param_3 + lVar3 + -2) = *(undefined2 *)(param_1 + (uVar5 & 0xffff) * 2);
  *param_4 = lVar3 + -2;
  return;
}

