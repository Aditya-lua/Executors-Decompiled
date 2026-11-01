
uint FUN_00423c80(undefined8 param_1,long param_2)

{
  byte bVar1;
  uint uVar2;
  uint uVar3;
  uint unaff_w20;
  
  uVar2 = 2;
  if (param_2 != 0) {
    func_0x00187bd4(param_1,param_2,1);
    uVar2 = unaff_w20;
  }
  bVar1 = bRam0000000000a3bfa0;
  if (bRam0000000000a3bfa0 == 0) {
    bRam0000000000a3bfa0 = 3;
  }
  uVar3 = 0x2010003 >> (ulong)((bVar1 & 3) << 3);
  if (3 < bVar1) {
    uVar3 = 3;
  }
  if (bVar1 != 0) {
    uVar2 = uVar3;
  }
  return uVar2;
}

