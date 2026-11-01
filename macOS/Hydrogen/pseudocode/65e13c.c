
/* WARNING: Removing unreachable block (ram,0x0065e1a4) */

void FUN_0065e13c(void)

{
  byte bVar1;
  int iVar2;
  undefined1 uVar3;
  long unaff_x19;
  undefined8 *unaff_x20;
  long *unaff_x21;
  long *unaff_x23;
  long lVar4;
  undefined1 uStack0000000000000008;
  
  __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc();
  if (*(char *)(unaff_x19 + 0x20) == '\0') {
    lVar4 = *(long *)(unaff_x19 + 8);
    iVar2 = _strncmp(lVar4,"ThisPointer:",0xc);
    if ((iVar2 == 0) && (iVar2 = _strcmp(lVar4 + 0xc,&UNK_008be4ec), iVar2 == 0)) {
      func_0x0003eef0(lVar4,&UNK_00a0b4e8,*(undefined8 *)(unaff_x19 + 0x10));
      *unaff_x20 = unaff_x21;
      uVar3 = 1;
    }
    else {
      if (unaff_x23 != (long *)0x0) {
        bVar1 = (**(code **)(*unaff_x23 + 0x10))();
        *(byte *)(unaff_x19 + 0x20) = bVar1;
        if ((bVar1 & 1) != 0) {
          return;
        }
      }
      (**(code **)(*unaff_x21 + 0x10))();
      func_0x0065e328(&uStack0000000000000008);
      lVar4 = func_0x0065e22c(&uStack0000000000000008,"PublicElement",0x20,1);
      uVar3 = *(undefined1 *)(lVar4 + 0x20);
    }
    *(undefined1 *)(unaff_x19 + 0x20) = uVar3;
  }
  return;
}

