/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00934ec4
 */

int FUN_00934ec4(long param_1)

{
  int iVar1;
  long *plVar2;
  long lVar3;
  long *plVar4;
  long *plVar5;
  
  plVar5 = (long *)(param_1 + 0x130);
  plVar2 = (long *)(*(code *)PTR_calloc_00cc4690)(1,DAT_00cc4bb0);
  if (plVar2 == (long *)0x0) {
    *plVar5 = 0;
    iVar1 = 0x1b;
    goto LAB_00934fac;
  }
  *plVar2 = (long)&PTR_s_cw_out_00cc4b88;
  plVar2[2] = (long)plVar2;
  *(undefined4 *)(plVar2 + 3) = 4;
  iVar1 = (*(code *)PTR_FUN_00cc4b98)(param_1,plVar2);
  plVar4 = (long *)0x0;
  if (iVar1 == 0) {
    plVar4 = plVar2;
  }
  *(long **)(param_1 + 0x130) = plVar4;
  if (iVar1 != 0) goto LAB_00934fac;
  plVar2 = (long *)(*(code *)PTR_calloc_00cc4690)(1,0x28);
  if (plVar2 == (long *)0x0) goto LAB_00935070;
  plVar2[2] = (long)plVar2;
  *plVar2 = (long)&PTR_s_protocol_00c4fbb8;
  *(undefined4 *)(plVar2 + 3) = 2;
  lVar3 = *plVar5;
  plVar4 = plVar5;
  if (lVar3 == 0) {
    iVar1 = FUN_00934ec4(param_1);
    if (iVar1 == 0) {
      lVar3 = *plVar5;
      if (lVar3 != 0) goto LAB_00934f74;
      goto LAB_00934f98;
    }
    (**(code **)(*plVar2 + 0x20))(param_1,plVar2);
    (*(code *)PTR_free_00cc4678)(plVar2);
  }
  else {
LAB_00934f74:
    do {
      if (*(uint *)(plVar2 + 3) <= *(uint *)(lVar3 + 0x18)) break;
      plVar4 = (long *)(lVar3 + 8);
      lVar3 = *plVar4;
    } while (lVar3 != 0);
LAB_00934f98:
    plVar2[1] = lVar3;
    *plVar4 = (long)plVar2;
  }
  plVar2 = (long *)(*(code *)PTR_calloc_00cc4690)(1,0x20);
  if (plVar2 == (long *)0x0) {
LAB_00935070:
    (*(code *)PTR_free_00cc4678)();
    return 0x1b;
  }
  plVar2[2] = (long)plVar2;
  *plVar2 = (long)&PTR_DAT_00c4fbe8;
  *(undefined4 *)(plVar2 + 3) = 0;
  lVar3 = *plVar5;
  if (lVar3 == 0) {
    iVar1 = FUN_00934ec4(param_1);
    if (iVar1 != 0) {
      (**(code **)(*plVar2 + 0x20))(param_1,plVar2);
LAB_00934fac:
      (*(code *)PTR_free_00cc4678)(plVar2);
      return iVar1;
    }
    lVar3 = *plVar5;
    if (lVar3 == 0) goto LAB_00935060;
  }
  do {
    if (*(uint *)(plVar2 + 3) <= *(uint *)(lVar3 + 0x18)) break;
    plVar5 = (long *)(lVar3 + 8);
    lVar3 = *plVar5;
  } while (lVar3 != 0);
LAB_00935060:
  plVar2[1] = lVar3;
  *plVar5 = (long)plVar2;
  return 0;
}

