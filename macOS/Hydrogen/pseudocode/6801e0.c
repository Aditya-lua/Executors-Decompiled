
void FUN_006801e0(ulong param_1)

{
  bool in_ZR;
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  ulong in_x9;
  long unaff_x19;
  long unaff_x22;
  undefined1 uStack0000000000000008;
  
  if ((!in_ZR) &&
     ((-1 < (long)(in_x9 & param_1) ||
      (iVar1 = _strcmp(param_1 & 0x7fffffffffffffff,in_x9 & 0x7fffffffffffffff), iVar1 != 0)))) {
    func_0x0065a01c(&uStack0000000000000008,unaff_x22 + 8,*(undefined8 *)(unaff_x19 + 8));
    uVar2 = func_0x0062395c(&uStack0000000000000008,"SubgroupOrder",0xa0,1);
    lVar3 = func_0x0062395c(uVar2,"SubgroupGenerator",0x68,1);
    *(undefined1 *)(unaff_x19 + 0x20) = *(undefined1 *)(lVar3 + 0x20);
  }
  return;
}

