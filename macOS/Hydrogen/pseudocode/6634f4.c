
void FUN_006634f4(void)

{
  undefined1 uVar1;
  int iVar2;
  undefined8 uVar3;
  long unaff_x19;
  undefined8 *unaff_x20;
  long *unaff_x22;
  undefined8 unaff_x23;
  long lVar4;
  
  _strlen();
  uVar3 = __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
  __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc(uVar3,0x3b);
  if (*(char *)(unaff_x19 + 0x20) == '\0') {
    lVar4 = *(long *)(unaff_x19 + 8);
    iVar2 = _strncmp(lVar4,"ThisPointer:",0xc);
    if ((iVar2 == 0) && (iVar2 = _strcmp(lVar4 + 0xc,&UNK_008be349), iVar2 == 0)) {
      func_0x0003eef0(lVar4,&UNK_00a0bf38,*(undefined8 *)(unaff_x19 + 0x10));
      *unaff_x20 = unaff_x23;
      uVar1 = 1;
    }
    else {
      if (unaff_x22 == (long *)0x0) {
        return;
      }
      uVar1 = (**(code **)(*unaff_x22 + 0x10))();
    }
    *(undefined1 *)(unaff_x19 + 0x20) = uVar1;
  }
  return;
}

