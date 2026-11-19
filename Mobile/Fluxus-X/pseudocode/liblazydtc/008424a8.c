/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008424a8
 */

char * FUN_008424a8(long param_1,char *param_2,char *param_3)

{
  uint uVar1;
  int iVar2;
  bool bVar3;
  undefined8 *puVar4;
  char *pcVar5;
  long lVar6;
  undefined8 uVar7;
  
  if (param_2 == param_3) {
    return param_2;
  }
  if (*param_2 == '^') {
    puVar4 = operator_new(0x18);
    uVar1 = *(uint *)(param_1 + 0x18);
    lVar6 = *(long *)(param_1 + 0x38);
    param_2 = param_2 + 1;
    uVar7 = *(undefined8 *)(lVar6 + 8);
    *(undefined8 **)(param_1 + 0x38) = puVar4;
    *puVar4 = &PTR_LAB_00c48ba8;
    puVar4[1] = uVar7;
    *(undefined8 **)(lVar6 + 8) = puVar4;
    *(bool *)(puVar4 + 2) = (uVar1 & 0x5f0) == 0x400;
  }
  if (param_2 != param_3) {
    do {
      if (param_2 == param_3) {
        break;
      }
      uVar7 = *(undefined8 *)(param_1 + 0x38);
      iVar2 = *(int *)(param_1 + 0x1c);
      pcVar5 = (char *)FUN_0084a07c(param_1,param_2,param_3);
      if (pcVar5 == param_2) {
        if (param_2 == param_3) goto LAB_008425f8;
        goto LAB_0084259c;
      }
      pcVar5 = (char *)FUN_0084a268(param_1,pcVar5,param_3,uVar7,iVar2 + 1,
                                    *(int *)(param_1 + 0x1c) + 1);
      bVar3 = pcVar5 != param_2;
      param_2 = pcVar5;
    } while (bVar3);
    if (param_2 != param_3) {
LAB_0084259c:
      if ((param_2 + 1 == param_3) && (*param_2 == '$')) {
        puVar4 = operator_new(0x18);
        uVar1 = *(uint *)(param_1 + 0x18);
        lVar6 = *(long *)(param_1 + 0x38);
        *(undefined8 **)(param_1 + 0x38) = puVar4;
        uVar7 = *(undefined8 *)(lVar6 + 8);
        *puVar4 = &PTR_LAB_00c48bf0;
        puVar4[1] = uVar7;
        *(undefined8 **)(lVar6 + 8) = puVar4;
        *(bool *)(puVar4 + 2) = (uVar1 & 0x5f0) == 0x400;
        param_2 = param_2 + 1;
      }
    }
  }
LAB_008425f8:
  if (param_2 != param_3) {
                    /* WARNING: Subroutine does not return */
    FUN_0084a030();
  }
  return param_2;
}

