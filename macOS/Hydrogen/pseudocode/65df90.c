
/* WARNING: Removing unreachable block (ram,0x0065e0a4) */
/* WARNING: Removing unreachable block (ram,0x0065e1a4) */

undefined8 *
FUN_0065df90(undefined8 param_1,undefined8 param_2,long param_3,undefined8 param_4,
            undefined8 *param_5,long *param_6)

{
  byte bVar1;
  int iVar2;
  undefined8 *puVar3;
  undefined8 uVar4;
  long *plVar5;
  long lVar6;
  long *plVar7;
  undefined1 uVar8;
  undefined8 uVar9;
  undefined1 auVar10 [16];
  undefined8 in_stack_00000008;
  long in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined1 auStack_78 [40];
  
  while (-1 < in_stack_00000018) {
    __Unwind_Resume(param_1);
    __ZdlPv(in_stack_00000020);
  }
  __ZdlPv(in_stack_00000008);
  auVar10 = __Unwind_Resume(param_1);
  plVar7 = auVar10._8_8_;
  puVar3 = auVar10._0_8_;
  *puVar3 = plVar7;
  puVar3[1] = param_3;
  puVar3[2] = param_4;
  puVar3[3] = param_5;
  *(undefined2 *)(puVar3 + 4) = 0;
  iVar2 = _strcmp(param_3,"ValueNames");
  if (iVar2 == 0) {
    *(undefined2 *)(puVar3 + 4) = 0x101;
    func_0x0003eef0(param_3,&UNK_009f6800,param_4);
    if (param_6 != (long *)0x0) {
      (**(code **)(*param_6 + 0x10))(param_6,puVar3[1],param_4,param_5);
    }
    uVar9 = puVar3[1];
    plVar5 = (long *)(**(code **)(*plVar7 + 0x10))(plVar7);
    func_0x0065e328(auStack_78,plVar7,uVar9,param_4,param_5,
                    (long)plVar5 + *(long *)(*plVar5 + -0x70));
    func_0x0065e22c(auStack_78,"PublicElement",0x20,1);
    uVar9 = __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                      (puVar3[3],"ThisPointer:",0xc);
    uVar4 = _strlen(&UNK_008be4ec);
    uVar9 = __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                      (uVar9,&UNK_008be4ec,uVar4);
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc(uVar9,0x3b);
    if (*(char *)(puVar3 + 4) != '\0') {
      return puVar3;
    }
    param_3 = puVar3[1];
    iVar2 = _strncmp(param_3,"ThisPointer:",0xc);
  }
  else {
    iVar2 = _strncmp(param_3,"ThisPointer:",0xc);
  }
  if ((iVar2 == 0) && (iVar2 = _strcmp(param_3 + 0xc,&UNK_008be4ec), iVar2 == 0)) {
    func_0x0003eef0(param_3,&UNK_00a0b4e8,puVar3[2]);
    *param_5 = plVar7;
    uVar8 = 1;
  }
  else {
    if (param_6 != (long *)0x0) {
      bVar1 = (**(code **)(*param_6 + 0x10))(param_6,param_3,param_4,param_5);
      *(byte *)(puVar3 + 4) = bVar1;
      if ((bVar1 & 1) != 0) {
        return puVar3;
      }
    }
    uVar9 = puVar3[1];
    plVar5 = (long *)(**(code **)(*plVar7 + 0x10))(plVar7);
    func_0x0065e328(auStack_78,plVar7,uVar9,param_4,param_5,
                    (long)plVar5 + *(long *)(*plVar5 + -0x70));
    lVar6 = func_0x0065e22c(auStack_78,"PublicElement",0x20,1);
    uVar8 = *(undefined1 *)(lVar6 + 0x20);
  }
  *(undefined1 *)(puVar3 + 4) = uVar8;
  return puVar3;
}

