/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084a6c4
 */

char * FUN_0084a6c4(long param_1,char *param_2,char *param_3)

{
  int iVar1;
  char cVar2;
  char *pcVar3;
  undefined8 *puVar4;
  long lVar5;
  uint uVar6;
  undefined *puVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  int iVar10;
  
  uVar9 = *(undefined8 *)(param_1 + 0x38);
  iVar1 = *(int *)(param_1 + 0x1c);
  pcVar3 = (char *)FUN_0084a8a0();
  if ((pcVar3 != param_2) || (pcVar3 == param_3)) goto LAB_0084a844;
  cVar2 = *pcVar3;
  if (cVar2 == '$') {
    puVar4 = operator_new(0x18);
    lVar5 = *(long *)(param_1 + 0x38);
    uVar6 = *(uint *)(param_1 + 0x18);
    puVar7 = &std::__ndk1::__r_anchor_multiline<char>::vtable;
LAB_0084a79c:
    uVar8 = *(undefined8 *)(lVar5 + 8);
    *(undefined8 **)(param_1 + 0x38) = puVar4;
    *puVar4 = puVar7 + 0x10;
    puVar4[1] = uVar8;
    *(undefined8 **)(lVar5 + 8) = puVar4;
    *(bool *)(puVar4 + 2) = (uVar6 & 0x5f0) == 0x400;
  }
  else {
    if (cVar2 != '(') {
      if (cVar2 != '^') goto LAB_0084a844;
      puVar4 = operator_new(0x18);
      lVar5 = *(long *)(param_1 + 0x38);
      uVar6 = *(uint *)(param_1 + 0x18);
      puVar7 = &std::__ndk1::__l_anchor_multiline<char>::vtable;
      goto LAB_0084a79c;
    }
    if ((*(byte *)(param_1 + 0x18) >> 1 & 1) == 0) {
      puVar4 = operator_new(0x18);
      lVar5 = *(long *)(param_1 + 0x38);
      *(undefined8 **)(param_1 + 0x38) = puVar4;
      iVar10 = *(int *)(param_1 + 0x1c) + 1;
      uVar8 = *(undefined8 *)(lVar5 + 8);
      *(int *)(param_1 + 0x1c) = iVar10;
      *(int *)(puVar4 + 2) = iVar10;
      *puVar4 = &PTR_LAB_00c48f08;
      puVar4[1] = uVar8;
      *(undefined8 **)(lVar5 + 8) = puVar4;
    }
    else {
      iVar10 = *(int *)(param_1 + 0x1c);
    }
    *(int *)(param_1 + 0x24) = *(int *)(param_1 + 0x24) + 1;
    pcVar3 = (char *)FUN_00842620(param_1,pcVar3 + 1,param_3);
    if ((pcVar3 == param_3) || (*pcVar3 != ')')) {
                    /* WARNING: Subroutine does not return */
      FUN_008437a0();
    }
    if ((*(byte *)(param_1 + 0x18) >> 1 & 1) == 0) {
      puVar4 = operator_new(0x18);
      lVar5 = *(long *)(param_1 + 0x38);
      *(int *)(puVar4 + 2) = iVar10;
      uVar8 = *(undefined8 *)(lVar5 + 8);
      *(undefined8 **)(param_1 + 0x38) = puVar4;
      *puVar4 = &PTR_LAB_00c48f50;
      puVar4[1] = uVar8;
      *(undefined8 **)(lVar5 + 8) = puVar4;
    }
    *(int *)(param_1 + 0x24) = *(int *)(param_1 + 0x24) + -1;
  }
  pcVar3 = pcVar3 + 1;
LAB_0084a844:
  if (pcVar3 == param_2) {
    return pcVar3;
  }
  pcVar3 = (char *)FUN_00843334(param_1,pcVar3,param_3,uVar9,iVar1 + 1,*(int *)(param_1 + 0x1c) + 1)
  ;
  return pcVar3;
}

