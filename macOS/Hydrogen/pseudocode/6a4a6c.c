
long * FUN_006a4a6c(long *param_1)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  long lVar4;
  long lVar5;
  
  if (*(char *)((long)param_1 + 0x21) != '\0') {
    uVar2 = __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                      (param_1[3],"ThisObject:",0xb);
    uVar3 = _strlen(&UNK_008c5665);
    uVar2 = __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                      (uVar2,&UNK_008c5665,uVar3);
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc(uVar2,0x3b);
  }
  if ((char)param_1[4] == '\0') {
    lVar4 = param_1[1];
    iVar1 = _strncmp(lVar4,"ThisObject:",0xb);
    if ((iVar1 == 0) && (iVar1 = _strcmp(lVar4 + 0xb,&UNK_008c5665), iVar1 == 0)) {
      func_0x0003eef0(lVar4,&UNK_00a16388,param_1[2]);
      lVar4 = *param_1;
      lVar5 = param_1[3];
      func_0x005ffccc(lVar5 + 0x18,lVar4 + 0x18);
      func_0x005ffccc(lVar5 + 0x48,lVar4 + 0x48);
      *(undefined1 *)(param_1 + 4) = 1;
      return param_1;
    }
  }
  return param_1;
}

