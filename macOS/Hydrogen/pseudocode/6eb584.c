
uint FUN_006eb584(long param_1)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  long lVar5;
  uint uVar6;
  uint uVar7;
  ulong uVar8;
  
  lVar2 = func_0x006e3658(param_1,1);
  if (lVar2 == 0) {
    func_0x006e6498(param_1,1,"thread");
LAB_006eb680:
    uVar3 = func_0x006e644c(param_1,"too many results to resume");
    func_0x006e69bc(uVar3,1,7);
    uVar4 = func_0x006e1a48(uVar3);
    func_0x006e1998(uVar3,uVar4,1);
    return 1;
  }
  if (*(byte *)(lVar2 + 3) == 6) {
    lVar5 = *(long *)(*(long *)(param_1 + 0x18) + 0x510);
    if (lVar5 != 0) {
      func_0x007005c4(param_1,lVar5,lVar2);
    }
    if (*(ushort *)(param_1 + 0x50) < *(ushort *)(param_1 + 0x52)) {
      lVar2 = func_0x006eceb0(param_1,"attempt to break across metamethod/C-call boundary");
      return (uint)(*(ushort *)(lVar2 + 0x52) <= *(ushort *)(lVar2 + 0x50));
    }
    *(undefined1 *)(param_1 + 3) = 6;
    return 0xffffffff;
  }
  if (*(byte *)(lVar2 + 3) < 2) {
    uVar8 = (ulong)(*(long *)(lVar2 + 8) - *(long *)(lVar2 + 0x10)) >> 4;
    uVar7 = (uint)uVar8;
    uVar6 = uVar7 + 1;
    iVar1 = func_0x006e17a8(param_1,uVar6);
    if (iVar1 == 0) goto LAB_006eb680;
    func_0x006e190c(lVar2,param_1,uVar8);
    if (-1 < (int)uVar7) {
      func_0x006e3c24(param_1,1);
      uVar7 = ~uVar7;
      goto code_r0x006eb650;
    }
  }
  else {
    func_0x006e188c(param_1,2);
    func_0x006e190c(lVar2,param_1,1);
  }
  func_0x006e3c24(param_1,0);
  uVar6 = 2;
  uVar7 = 0xfffffffe;
code_r0x006eb650:
  func_0x006e1ee0(param_1,uVar7);
  return uVar6;
}

