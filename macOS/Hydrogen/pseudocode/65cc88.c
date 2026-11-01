
/* WARNING: Removing unreachable block (ram,0x0065cd70) */

void FUN_0065cc88(void)

{
  byte bVar1;
  int iVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined1 uVar5;
  long unaff_x19;
  undefined8 *unaff_x20;
  undefined8 unaff_x21;
  long *unaff_x23;
  long lVar6;
  ulong unaff_x25;
  undefined1 uStack0000000000000008;
  
  func_0x0066326c(&uStack0000000000000008);
  uVar3 = func_0x0062395c(&uStack0000000000000008,"SubgroupOrder",0xa0,1);
  func_0x0065d2e0(uVar3,"SubgroupGenerator",0x68,1);
  uVar3 = __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                    (*(undefined8 *)(unaff_x19 + 0x18),"ThisPointer:",0xc);
  uVar4 = _strlen(unaff_x25 & 0x7fffffffffffffff);
  uVar3 = __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                    (uVar3,unaff_x25 & 0x7fffffffffffffff,uVar4);
  __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc(uVar3,0x3b);
  if (*(char *)(unaff_x19 + 0x20) == '\0') {
    lVar6 = *(long *)(unaff_x19 + 8);
    iVar2 = _strncmp(lVar6,"ThisPointer:",0xc);
    if ((iVar2 == 0) && (iVar2 = _strcmp(lVar6 + 0xc,&UNK_008be284), iVar2 == 0)) {
      func_0x0003eef0(lVar6,&UNK_00a0b448,*(undefined8 *)(unaff_x19 + 0x10));
      *unaff_x20 = unaff_x21;
      uVar5 = 1;
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
      uVar3 = func_0x0062395c(&uStack0000000000000008,"SubgroupOrder",0xa0,1);
      lVar6 = func_0x0065d2e0(uVar3,"SubgroupGenerator",0x68,1);
      uVar5 = *(undefined1 *)(lVar6 + 0x20);
    }
    *(undefined1 *)(unaff_x19 + 0x20) = uVar5;
  }
  return;
}

