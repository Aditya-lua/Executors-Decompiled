
undefined8 FUN_006a7a60(long *param_1)

{
  char cVar1;
  int iVar2;
  undefined8 uVar3;
  char cVar4;
  
  if (*(char *)((long)param_1 + 0x21) != '\0') {
    uVar3 = __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                      (param_1[3],"Prime1",6);
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm(uVar3,";",1);
  }
  if ((char)param_1[4] == '\0') {
    iVar2 = _strcmp("Prime1",param_1[1]);
    if (iVar2 == 0) {
      func_0x0003eef0("Prime1",&UNK_009f5fc0,param_1[2]);
      func_0x005ffccc(param_1[3],*param_1 + 0x108);
      *(undefined1 *)(param_1 + 4) = 1;
      cVar1 = *(char *)((long)param_1 + 0x21);
      goto joined_r0x006a7cd4;
    }
    cVar4 = '\0';
    cVar1 = *(char *)((long)param_1 + 0x21);
  }
  else {
    cVar1 = *(char *)((long)param_1 + 0x21);
joined_r0x006a7cd4:
    cVar4 = '\x01';
  }
  if (cVar1 != '\0') {
    uVar3 = __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                      (param_1[3],"Prime2",6);
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm(uVar3,";",1);
    cVar4 = (char)param_1[4];
  }
  if (cVar4 == '\0') {
    iVar2 = _strcmp("Prime2",param_1[1]);
    if (iVar2 == 0) {
      func_0x0003eef0("Prime2",&UNK_009f5fc0,param_1[2]);
      func_0x005ffccc(param_1[3],*param_1 + 0x138);
      *(undefined1 *)(param_1 + 4) = 1;
      cVar1 = *(char *)((long)param_1 + 0x21);
      goto joined_r0x006a7d10;
    }
    cVar4 = '\0';
    cVar1 = *(char *)((long)param_1 + 0x21);
  }
  else {
    cVar1 = *(char *)((long)param_1 + 0x21);
joined_r0x006a7d10:
    cVar4 = '\x01';
  }
  if (cVar1 != '\0') {
    uVar3 = __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                      (param_1[3],"PrivateExponent",0xf);
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm(uVar3,";",1);
    cVar4 = (char)param_1[4];
  }
  if (cVar4 == '\0') {
    iVar2 = _strcmp("PrivateExponent",param_1[1]);
    if (iVar2 == 0) {
      func_0x0003eef0("PrivateExponent",&UNK_009f5fc0,param_1[2]);
      func_0x005ffccc(param_1[3],*param_1 + 0xd8);
      *(undefined1 *)(param_1 + 4) = 1;
      cVar1 = *(char *)((long)param_1 + 0x21);
      goto joined_r0x006a7d4c;
    }
    cVar4 = '\0';
    cVar1 = *(char *)((long)param_1 + 0x21);
  }
  else {
    cVar1 = *(char *)((long)param_1 + 0x21);
joined_r0x006a7d4c:
    cVar4 = '\x01';
  }
  if (cVar1 != '\0') {
    uVar3 = __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                      (param_1[3],"ModPrime1PrivateExponent",0x18);
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm(uVar3,";",1);
    cVar4 = (char)param_1[4];
  }
  if (cVar4 == '\0') {
    iVar2 = _strcmp("ModPrime1PrivateExponent",param_1[1]);
    if (iVar2 == 0) {
      func_0x0003eef0("ModPrime1PrivateExponent",&UNK_009f5fc0,param_1[2]);
      func_0x005ffccc(param_1[3],*param_1 + 0x168);
      *(undefined1 *)(param_1 + 4) = 1;
      cVar1 = *(char *)((long)param_1 + 0x21);
      goto joined_r0x006a7d88;
    }
    cVar4 = '\0';
    cVar1 = *(char *)((long)param_1 + 0x21);
  }
  else {
    cVar1 = *(char *)((long)param_1 + 0x21);
joined_r0x006a7d88:
    cVar4 = '\x01';
  }
  if (cVar1 != '\0') {
    uVar3 = __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                      (param_1[3],"ModPrime2PrivateExponent",0x18);
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm(uVar3,";",1);
    cVar4 = (char)param_1[4];
  }
  if (cVar4 == '\0') {
    iVar2 = _strcmp("ModPrime2PrivateExponent",param_1[1]);
    if (iVar2 != 0) {
      cVar4 = '\0';
      cVar1 = *(char *)((long)param_1 + 0x21);
      goto joined_r0x006a7c34;
    }
    func_0x0003eef0("ModPrime2PrivateExponent",&UNK_009f5fc0,param_1[2]);
    func_0x005ffccc(param_1[3],*param_1 + 0x198);
    *(undefined1 *)(param_1 + 4) = 1;
    cVar1 = *(char *)((long)param_1 + 0x21);
  }
  else {
    cVar1 = *(char *)((long)param_1 + 0x21);
  }
  cVar4 = '\x01';
joined_r0x006a7c34:
  if (cVar1 != '\0') {
    uVar3 = __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                      (param_1[3],"MultiplicativeInverseOfPrime2ModPrime1",0x26);
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm(uVar3,";",1);
    cVar4 = (char)param_1[4];
  }
  if (cVar4 != '\0') {
    return 1;
  }
  iVar2 = _strcmp("MultiplicativeInverseOfPrime2ModPrime1",param_1[1]);
  if (iVar2 == 0) {
    func_0x0003eef0("MultiplicativeInverseOfPrime2ModPrime1",&UNK_009f5fc0,param_1[2]);
    func_0x005ffccc(param_1[3],*param_1 + 0x1c8);
    *(undefined1 *)(param_1 + 4) = 1;
    return 1;
  }
  return 0;
}

