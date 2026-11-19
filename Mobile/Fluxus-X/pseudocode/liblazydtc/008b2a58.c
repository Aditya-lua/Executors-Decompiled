/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b2a58
 */

void FUN_008b2a58(long param_1,long param_2,long param_3,long *param_4)

{
  double *pdVar1;
  long lVar2;
  long *plVar3;
  ulong uVar4;
  
  pdVar1 = (double *)FUN_008bb440(*(undefined8 *)(param_2 + 0x38),param_3);
  lVar2 = *param_4;
  plVar3 = (long *)(*(long *)(param_2 + 0x28) +
                   (ulong)(uint)((int)*pdVar1 - *(int *)(param_2 + 0x58)) * 0x10);
  plVar3[1] = param_4[1];
  *plVar3 = lVar2;
  if (((4 < *(int *)((long)param_4 + 0xc)) && ((*(byte *)(param_2 + 2) >> 2 & 1) != 0)) &&
     ((*(byte *)(*param_4 + 2) & 3) != 0)) {
    FUN_008b6188(param_1,param_2);
  }
  lVar2 = FUN_008b9ff8(param_1,"__init",6);
  *(byte *)(param_2 + 0x6a) = *(byte *)(param_2 + 0x6a) | param_3 == lVar2;
  lVar2 = FUN_008b9ff8(param_1,"__tostring",10);
  if (param_3 != lVar2) {
    uVar4 = 0;
    do {
      lVar2 = *(long *)(*(long *)(param_1 + 0x60) + 0x338 + uVar4 * 8);
      if (0x13 < uVar4) break;
      uVar4 = uVar4 + 1;
    } while (param_3 != lVar2);
    if (param_3 != lVar2) {
      return;
    }
  }
  if (*(long *)(param_2 + 0x50) == 0) {
    lVar2 = FUN_008bae54(param_1,0,1);
    *(long *)(param_2 + 0x50) = lVar2;
    if (((*(byte *)(param_2 + 2) >> 2 & 1) != 0) && ((*(byte *)(lVar2 + 2) & 3) != 0)) {
      FUN_008b6188(param_1,param_2,lVar2);
    }
  }
  else {
    lVar2 = *(long *)(param_1 + 0x60);
    if ((((param_3 == *(long *)(lVar2 + 0x370)) || (param_3 == *(long *)(lVar2 + 0x3b8))) ||
        (param_3 == *(long *)(lVar2 + 0x3c0))) &&
       (lVar2 = FUN_008bb440(*(long *)(param_2 + 0x50),param_3), *(int *)(lVar2 + 0xc) != 0)) {
                    /* WARNING: Subroutine does not return */
      FUN_008b39cc(param_1,
                   "Overriding comparison metamethods is not allowed (\'%s\' in class \'%s\')",
                   param_3 + 0x18,*(long *)(param_2 + 0x10) + 0x18);
    }
  }
  plVar3 = (long *)FUN_008bce4c(param_1,*(undefined8 *)(param_2 + 0x50),param_3);
  lVar2 = *param_4;
  plVar3[1] = param_4[1];
  *plVar3 = lVar2;
  if (((*(int *)((long)param_4 + 0xc) < 5) ||
      ((*(byte *)(*(long *)(param_2 + 0x50) + 2) >> 2 & 1) == 0)) ||
     ((*(byte *)(*param_4 + 2) & 3) == 0)) {
    return;
  }
  FUN_008b6188(param_1);
  return;
}

