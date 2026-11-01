
/* WARNING: Removing unreachable block (ram,0x0065cfe0) */

void FUN_0065cf78(void)

{
  byte bVar1;
  int iVar2;
  undefined8 uVar3;
  undefined1 uVar4;
  long unaff_x19;
  undefined8 *unaff_x20;
  undefined8 unaff_x21;
  long *unaff_x23;
  long lVar5;
  undefined1 uStack0000000000000008;
  
  __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc();
  if (*(char *)(unaff_x19 + 0x20) == '\0') {
    lVar5 = *(long *)(unaff_x19 + 8);
    iVar2 = _strncmp(lVar5,"ThisPointer:",0xc);
    if ((iVar2 == 0) && (iVar2 = _strcmp(lVar5 + 0xc,&UNK_008be379), iVar2 == 0)) {
      func_0x0003eef0(lVar5,&UNK_00a0b468,*(undefined8 *)(unaff_x19 + 0x10));
      *unaff_x20 = unaff_x21;
      uVar4 = 1;
    }
    else {
      if (unaff_x23 != (long *)0x0) {
        bVar1 = (**(code **)(*unaff_x23 + 0x10))();
        *(byte *)(unaff_x19 + 0x20) = bVar1;
        if ((bVar1 & 1) != 0) {
          return;
        }
      }
      func_0x006633f0(&uStack0000000000000008);
      uVar3 = func_0x0062395c(&uStack0000000000000008,"SubgroupOrder",0xa0,1);
      lVar5 = func_0x0065e22c(uVar3,"SubgroupGenerator",0x68,1);
      uVar4 = *(undefined1 *)(lVar5 + 0x20);
    }
    *(undefined1 *)(unaff_x19 + 0x20) = uVar4;
  }
  return;
}

