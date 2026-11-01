
void FUN_006aa604(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  undefined1 uVar1;
  int iVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  long unaff_x19;
  undefined8 *unaff_x20;
  long *unaff_x22;
  undefined8 unaff_x23;
  long unaff_x24;
  
  iVar2 = _strcmp(param_3,"ValueNames");
  if (iVar2 == 0) {
    *(undefined2 *)(unaff_x19 + 0x20) = 0x101;
    func_0x0003eef0();
    if (unaff_x22 != (long *)0x0) {
      (**(code **)(*unaff_x22 + 0x10))();
    }
    uVar3 = __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                      (*(undefined8 *)(unaff_x19 + 0x18),"ThisPointer:",0xc);
    uVar4 = _strlen(&UNK_008c5665);
    uVar3 = __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                      (uVar3,&UNK_008c5665,uVar4);
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc(uVar3,0x3b);
    if (*(char *)(unaff_x19 + 0x20) != '\0') {
      return;
    }
    unaff_x24 = *(long *)(unaff_x19 + 8);
    iVar2 = _strncmp(unaff_x24,"ThisPointer:",0xc);
  }
  else {
    iVar2 = _strncmp();
  }
  if ((iVar2 == 0) && (iVar2 = _strcmp(unaff_x24 + 0xc,&UNK_008c5665), iVar2 == 0)) {
    func_0x0003eef0(unaff_x24,&UNK_00a19800,*(undefined8 *)(unaff_x19 + 0x10));
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
  return;
}

