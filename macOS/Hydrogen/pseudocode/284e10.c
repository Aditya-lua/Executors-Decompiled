
uint FUN_00284e10(long param_1,undefined8 *param_2)

{
  uint uVar1;
  byte bVar2;
  byte *pbVar3;
  byte *pbVar4;
  uint in_w10;
  
  pbVar3 = (byte *)*param_2;
  do {
    if (param_1 == 0) {
      return in_w10 >> 7 & 1 ^ 1;
    }
    pbVar4 = pbVar3 + 1;
    bVar2 = *pbVar3;
    param_1 = param_1 + -1;
    uVar1 = in_w10 >> 7;
    pbVar3 = pbVar4;
    in_w10 = (uint)bVar2;
  } while (((uVar1 & 1) != 0) || (bVar2 != 0x80));
  return 0;
}

