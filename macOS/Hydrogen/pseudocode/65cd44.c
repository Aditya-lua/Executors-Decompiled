
/* WARNING: Removing unreachable block (ram,0x0065cd70) */

void FUN_0065cd44(code *param_1)

{
  byte bVar1;
  undefined8 uVar2;
  long lVar3;
  long unaff_x19;
  undefined1 uStack0000000000000008;
  
  bVar1 = (*param_1)();
  *(byte *)(unaff_x19 + 0x20) = bVar1;
  if ((bVar1 & 1) == 0) {
    func_0x0066326c(&uStack0000000000000008);
    uVar2 = func_0x0062395c(&uStack0000000000000008,"SubgroupOrder",0xa0,1);
    lVar3 = func_0x0065d2e0(uVar2,"SubgroupGenerator",0x68,1);
    *(undefined1 *)(unaff_x19 + 0x20) = *(undefined1 *)(lVar3 + 0x20);
  }
  return;
}

