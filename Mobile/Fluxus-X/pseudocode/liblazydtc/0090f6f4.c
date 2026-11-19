/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0090f6f4
 */

undefined8 FUN_0090f6f4(char *param_1,undefined4 param_2)

{
  long lVar1;
  int iVar2;
  long *plVar3;
  long lVar4;
  undefined8 uVar5;
  undefined4 local_60 [2];
  long local_58;
  long lStack_50;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  iVar2 = inet_pton(2,param_1,local_60);
  if (iVar2 < 1) {
    iVar2 = inet_pton(10,param_1,&local_58);
    if ((0 < iVar2) &&
       (plVar3 = (long *)(*(code *)PTR_malloc_00cc4670)(0x40), plVar3 != (long *)0x0)) {
      lVar4 = (*(code *)PTR_strdup_00cc4688)(param_1);
      if (lVar4 == 0) goto LAB_0090f84c;
      *plVar3 = lVar4;
      plVar3[1] = 0;
      plVar3[3] = (long)(plVar3 + 6);
      plVar3[5] = lStack_50;
      plVar3[4] = local_58;
      plVar3[2] = 0x100000000a;
      plVar3[6] = (long)(plVar3 + 4);
LAB_0090f814:
      plVar3[7] = 0;
      uVar5 = FUN_0090f474(plVar3,param_2);
      (*(code *)PTR_free_00cc4678)(lVar4);
      (*(code *)PTR_free_00cc4678)(plVar3);
      goto LAB_0090f864;
    }
  }
  else {
    plVar3 = (long *)(*(code *)PTR_malloc_00cc4670)(0x40);
    if (plVar3 != (long *)0x0) {
      lVar4 = (*(code *)PTR_strdup_00cc4688)(param_1);
      if (lVar4 != 0) {
        *(undefined4 *)(plVar3 + 4) = local_60[0];
        *plVar3 = lVar4;
        plVar3[1] = 0;
        plVar3[3] = (long)(plVar3 + 6);
        plVar3[2] = 0x400000002;
        plVar3[6] = (long)(plVar3 + 4);
        goto LAB_0090f814;
      }
LAB_0090f84c:
      (*(code *)PTR_free_00cc4678)(plVar3);
    }
  }
  uVar5 = 0;
LAB_0090f864:
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar5;
}

