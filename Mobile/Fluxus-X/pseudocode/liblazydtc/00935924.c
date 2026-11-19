/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00935924
 */

int FUN_00935924(long param_1,long *param_2)

{
  int iVar1;
  long lVar2;
  long *plVar3;
  long *plVar4;
  
  *(long **)(param_1 + 0x138) = param_2;
  lVar2 = (**(code **)(*param_2 + 0x28))();
  if (lVar2 == 0) {
    return 0;
  }
  if (((*(byte *)(param_1 + 0xa82) >> 5 & 1) == 0) && ((*(byte *)(param_1 + 0x131d) >> 4 & 1) == 0))
  {
    return 0;
  }
  plVar3 = (long *)(*(code *)PTR_calloc_00cc4690)(1,0x68);
  if (plVar3 == (long *)0x0) {
    (*(code *)PTR_free_00cc4678)();
    return 0x1b;
  }
  plVar4 = (long *)(param_1 + 0x138);
  plVar3[2] = (long)plVar3;
  *plVar3 = (long)&PTR_s_cr_lineconv_00c4fc18;
  *(undefined4 *)(plVar3 + 3) = 3;
  FUN_009242bc(plVar3 + 4,0x4000,1,1);
  lVar2 = *plVar4;
  if (lVar2 == 0) {
    iVar1 = FUN_009357d8(param_1,*(undefined8 *)(param_1 + 0x1158));
    if (iVar1 != 0) {
      (**(code **)(*plVar3 + 0x18))(param_1,plVar3);
      (*(code *)PTR_free_00cc4678)(plVar3);
      return iVar1;
    }
    lVar2 = *plVar4;
    if (lVar2 == 0) goto LAB_009359dc;
  }
  do {
    if (*(uint *)(plVar3 + 3) <= *(uint *)(lVar2 + 0x18)) break;
    plVar4 = (long *)(lVar2 + 8);
    lVar2 = *plVar4;
  } while (lVar2 != 0);
LAB_009359dc:
  plVar3[1] = lVar2;
  *plVar4 = (long)plVar3;
  return 0;
}

