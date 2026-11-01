
/* WARNING: Removing unreachable block (ram,0x0065f258) */
/* WARNING: Removing unreachable block (ram,0x0065f358) */

undefined8 *
FUN_0065f178(undefined8 *param_1,long *param_2,long param_3,undefined8 param_4,undefined8 *param_5,
            long *param_6)

{
  byte bVar1;
  int iVar2;
  undefined8 uVar3;
  long *plVar4;
  long lVar5;
  undefined1 uVar6;
  undefined8 uVar7;
  undefined1 uStack0000000000000008;
  
  *param_1 = param_2;
  param_1[1] = param_3;
  param_1[2] = param_4;
  param_1[3] = param_5;
  *(undefined2 *)(param_1 + 4) = 0;
  iVar2 = _strcmp(param_3,"ValueNames");
  if (iVar2 == 0) {
    *(undefined2 *)(param_1 + 4) = 0x101;
    func_0x0003eef0(param_3,&UNK_009f6800,param_4);
    if (param_6 != (long *)0x0) {
      (**(code **)(*param_6 + 0x10))(param_6,param_1[1],param_4,param_5);
    }
    uVar7 = param_1[1];
    plVar4 = (long *)(**(code **)(*param_2 + 0x10))(param_2);
    func_0x0065f3e0(&uStack0000000000000008,param_2,uVar7,param_4,param_5,
                    (long)plVar4 + *(long *)(*plVar4 + -0x70));
    func_0x0062395c(&uStack0000000000000008,"PrivateExponent",0x20,1);
    uVar7 = __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                      (param_1[3],"ThisPointer:",0xc);
    uVar3 = _strlen(&UNK_008be681);
    uVar7 = __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                      (uVar7,&UNK_008be681,uVar3);
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc(uVar7,0x3b);
    if (*(char *)(param_1 + 4) != '\0') {
      return param_1;
    }
    param_3 = param_1[1];
    iVar2 = _strncmp(param_3,"ThisPointer:",0xc);
  }
  else {
    iVar2 = _strncmp(param_3,"ThisPointer:",0xc);
  }
  if ((iVar2 == 0) && (iVar2 = _strcmp(param_3 + 0xc,&UNK_008be681), iVar2 == 0)) {
    func_0x0003eef0(param_3,&UNK_00a0b588,param_1[2]);
    *param_5 = param_2;
    uVar6 = 1;
  }
  else {
    if (param_6 != (long *)0x0) {
      bVar1 = (**(code **)(*param_6 + 0x10))(param_6,param_3,param_4,param_5);
      *(byte *)(param_1 + 4) = bVar1;
      if ((bVar1 & 1) != 0) {
        return param_1;
      }
    }
    uVar7 = param_1[1];
    plVar4 = (long *)(**(code **)(*param_2 + 0x10))(param_2);
    func_0x0065f3e0(&uStack0000000000000008,param_2,uVar7,param_4,param_5,
                    (long)plVar4 + *(long *)(*plVar4 + -0x70));
    lVar5 = func_0x0062395c(&uStack0000000000000008,"PrivateExponent",0x20,1);
    uVar6 = *(undefined1 *)(lVar5 + 0x20);
  }
  *(undefined1 *)(param_1 + 4) = uVar6;
  return param_1;
}

