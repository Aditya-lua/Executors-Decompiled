/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ba3ec
 */

void FUN_008ba3ec(long param_1,long param_2,undefined8 param_3)

{
  int iVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  long *plVar5;
  
  lVar2 = *(long *)(param_1 + 0x60);
  if (DAT_00d1fbd8 == '\x01') {
    plVar5 = (long *)(*(long *)(lVar2 + 0x38) +
                     (long)(int)(*(int *)(lVar2 + 0x30) +
                                 *(int *)(lVar2 + 0x28) * *(uint *)(param_2 + 0x10) >>
                                (ulong)(*(byte *)(lVar2 + 0x44) & 0x1f)) * 8);
    lVar3 = *plVar5;
    if (lVar3 == 0) goto LAB_008ba49c;
    if (lVar3 != param_2) {
      do {
        lVar4 = lVar3;
        lVar3 = *(long *)(lVar4 + 8);
        if (lVar3 == 0) goto LAB_008ba49c;
      } while (lVar3 != param_2);
LAB_008ba484:
      plVar5 = (long *)(lVar4 + 8);
    }
  }
  else {
    plVar5 = (long *)(*(long *)(lVar2 + 0x38) +
                     (long)(int)(*(int *)(lVar2 + 0x2c) - 1U & *(uint *)(param_2 + 0x10)) * 8);
    lVar3 = *plVar5;
    if (lVar3 == 0) goto LAB_008ba49c;
    if (lVar3 != param_2) {
      do {
        lVar4 = lVar3;
        lVar3 = *(long *)(lVar4 + 8);
        if (lVar3 == 0) goto LAB_008ba49c;
      } while (lVar3 != param_2);
      goto LAB_008ba484;
    }
  }
  iVar1 = *(int *)(lVar2 + 0x40);
  *plVar5 = *(long *)(lVar3 + 8);
  *(int *)(lVar2 + 0x40) = iVar1 + -1;
LAB_008ba49c:
  FUN_008b7bd4(param_1,param_2,(ulong)*(uint *)(param_2 + 0x14) + 0x19,*(undefined1 *)(param_2 + 1),
               param_3);
  return;
}

