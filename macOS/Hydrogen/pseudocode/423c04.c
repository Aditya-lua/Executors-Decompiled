
uint __ZN3std5panic19get_backtrace_style17h39051bfb09435fbfE(void)

{
  uint uVar1;
  undefined4 uVar2;
  uint uVar3;
  byte bVar4;
  byte bVar5;
  long lStack_38;
  int *piStack_30;
  long lStack_28;
  
  if ((bRam0000000000a3bfa0 - 1 & 0xff) < 3) {
    return bRam0000000000a3bfa0 - 1;
  }
  func_0x00414720(&lStack_38,&UNK_00885dad,0xe);
  if (lStack_38 == -0x8000000000000000) {
    bVar4 = 3;
    uVar1 = 2;
    goto LAB_00423cc0;
  }
  if (lStack_28 == 4) {
    if (*piStack_30 != 0x6c6c7566) goto LAB_00423ca4;
    uVar3 = 1;
    bVar5 = 2;
    bVar4 = 2;
    uVar2 = 1;
    uVar1 = 1;
  }
  else if ((lStack_28 == 1) && ((char)*piStack_30 == '0')) {
    uVar3 = 2;
    bVar5 = 3;
    bVar4 = 3;
    uVar2 = 2;
    uVar1 = 2;
  }
  else {
LAB_00423ca4:
    uVar3 = 0;
    uVar2 = 0;
    uVar1 = 0;
    bVar5 = 1;
    bVar4 = 1;
  }
  if (lStack_38 != 0) {
    func_0x00187bd4(uVar2,piStack_30,lStack_38,1);
    bVar4 = bVar5;
    uVar1 = uVar3;
  }
LAB_00423cc0:
  bVar5 = bRam0000000000a3bfa0;
  if (bRam0000000000a3bfa0 == 0) {
    bRam0000000000a3bfa0 = bVar4;
  }
  uVar3 = 0x2010003 >> (ulong)((bVar5 & 3) << 3);
  if (3 < bVar5) {
    uVar3 = 3;
  }
  if (bVar5 != 0) {
    uVar1 = uVar3;
  }
  return uVar1;
}

