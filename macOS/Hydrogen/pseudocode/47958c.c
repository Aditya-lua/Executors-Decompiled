
void FUN_0047958c(uint *param_1)

{
  uint uVar1;
  long lVar2;
  long in_x9;
  undefined8 uVar3;
  
  uVar1 = *(uint *)(in_x9 + 4);
  if ((uVar1 ^ 0xd800) - 0x110000 < 0xffef0800) {
    lVar2 = (ulong)(uVar1 & 0x3fffff) * 0xc;
    uVar3 = *(undefined8 *)(&UNK_0089e080 + lVar2);
    *param_1 = *(uint *)(&UNK_0089e07c + lVar2);
    *(undefined8 *)(param_1 + 1) = uVar3;
    return;
  }
  *param_1 = uVar1;
  param_1[1] = 0;
  param_1[2] = 0;
  return;
}

