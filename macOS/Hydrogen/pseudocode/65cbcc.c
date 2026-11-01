
/* WARNING: Removing unreachable block (ram,0x0065cc78) */
/* WARNING: Removing unreachable block (ram,0x0065cd70) */

void FUN_0065cbcc(void)

{
  byte bVar1;
  int iVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  long lVar5;
  undefined1 uVar6;
  long unaff_x19;
  undefined8 *unaff_x20;
  undefined8 unaff_x21;
  long *unaff_x23;
  long unaff_x24;
  undefined1 uStack0000000000000008;
  
  iVar2 = _strcmp();
  if (iVar2 == 0) {
    *(undefined2 *)(unaff_x19 + 0x20) = 0x101;
    func_0x0003eef0();
    if (unaff_x23 != (long *)0x0) {
      (**(code **)(*unaff_x23 + 0x10))();
    }
    func_0x0066326c(&uStack0000000000000008);
    uVar4 = func_0x0062395c(&uStack0000000000000008,"SubgroupOrder",0xa0,1);
    func_0x0065d2e0(uVar4,"SubgroupGenerator",0x68,1);
    uVar4 = __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                      (*(undefined8 *)(unaff_x19 + 0x18),"ThisPointer:",0xc);
    uVar3 = _strlen(&UNK_008be284);
    uVar4 = __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                      (uVar4,&UNK_008be284,uVar3);
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc(uVar4,0x3b);
    if (*(char *)(unaff_x19 + 0x20) != '\0') {
      return;
    }
    unaff_x24 = *(long *)(unaff_x19 + 8);
    iVar2 = _strncmp(unaff_x24,"ThisPointer:",0xc);
  }
  else {
    iVar2 = _strncmp();
  }
  if ((iVar2 == 0) && (iVar2 = _strcmp(unaff_x24 + 0xc,&UNK_008be284), iVar2 == 0)) {
    func_0x0003eef0(unaff_x24,&UNK_00a0b448,*(undefined8 *)(unaff_x19 + 0x10));
    *unaff_x20 = unaff_x21;
    uVar6 = 1;
  }
  else {
    if (unaff_x23 != (long *)0x0) {
      bVar1 = (**(code **)(*unaff_x23 + 0x10))();
      *(byte *)(unaff_x19 + 0x20) = bVar1;
      if ((bVar1 & 1) != 0) {
        return;
      }
    }
    func_0x0066326c(&uStack0000000000000008);
    uVar4 = func_0x0062395c(&uStack0000000000000008,"SubgroupOrder",0xa0,1);
    lVar5 = func_0x0065d2e0(uVar4,"SubgroupGenerator",0x68,1);
    uVar6 = *(undefined1 *)(lVar5 + 0x20);
  }
  *(undefined1 *)(unaff_x19 + 0x20) = uVar6;
  return;
}

