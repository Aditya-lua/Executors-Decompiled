
void FUN_00783ca4(long param_1)

{
  uint uVar1;
  int iVar2;
  long lVar3;
  
  lVar3 = *(long *)(param_1 + 0x18);
  iVar2 = func_0x007718c0();
  func_0x0073162c(lVar3,0);
  *(undefined8 *)(lVar3 + 0x3c0) = 0xffffffffffffffff;
  *(undefined8 *)(param_1 + 0xe8) = 0xffffffffffffffff;
  uVar1 = *(uint *)(param_1 + 0x1c1);
  *(uint *)(param_1 + 0x1c1) = uVar1 & 0xffcefffe;
  if (((uVar1 >> 0x11 & 1) == 0) && (iVar2 != 0)) {
    *(uint *)(param_1 + 0x134) = *(uint *)(param_1 + 0x134) | 2;
  }
  return;
}

