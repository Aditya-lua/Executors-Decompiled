/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00937538
 */

/* WARNING: Removing unreachable block (ram,0x00937658) */
/* WARNING: Removing unreachable block (ram,0x009377e8) */

int FUN_00937538(long param_1,undefined8 param_2,int param_3,uint param_4,long param_5,ulong param_6
                )

{
  long lVar1;
  int iVar2;
  long lVar3;
  long *plVar4;
  long *plVar5;
  long *plVar6;
  long lVar7;
  ulong local_70;
  long local_68;
  
  lVar1 = tpidr_el0;
  local_68 = *(long *)(lVar1 + 0x28);
  plVar4 = (long *)(param_1 + 0x20);
  plVar6 = (long *)*plVar4;
  if (plVar6 == (long *)0x0) {
LAB_009375e8:
    iVar2 = FUN_00937978(param_1,param_2,param_3,param_4 & 1,param_5,param_6,&local_70);
    if (iVar2 != 0) goto LAB_009377ac;
    if (param_6 <= local_70) {
LAB_00937764:
      iVar2 = 0;
      goto joined_r0x009376e4;
    }
    lVar7 = 0;
    for (plVar6 = (long *)*plVar4; plVar6 != (long *)0x0; plVar6 = (long *)*plVar6) {
      lVar3 = FUN_00904984(plVar6 + 1);
      lVar7 = lVar3 + lVar7;
    }
    if (lVar7 + (param_6 - local_70) < 0x4000001) {
      plVar6 = (long *)*plVar4;
      if (((plVar6 == (long *)0x0) || (param_3 == 2)) || ((int)plVar6[5] != param_3)) {
        plVar6 = (long *)(*(code *)PTR_calloc_00cc4690)(1,0x30);
        if (plVar6 == (long *)0x0) {
          iVar2 = 0x1b;
          goto LAB_0093776c;
        }
        *(int *)(plVar6 + 5) = param_3;
        FUN_00904528(plVar6 + 1,0x4000000);
        *plVar6 = *plVar4;
        *plVar4 = (long)plVar6;
      }
      iVar2 = FUN_009045fc(plVar6 + 1,param_5 + local_70,param_6 - local_70);
      if (iVar2 != 0) goto joined_r0x009376e4;
      goto LAB_00937764;
    }
    iVar2 = 100;
  }
  else {
    if ((int)plVar6[5] != param_3) {
      iVar2 = FUN_009377f0(param_1,param_2,plVar4,1);
      if (iVar2 != 0) goto LAB_0093776c;
      plVar6 = (long *)*plVar4;
      if (plVar6 == (long *)0x0) goto LAB_009375e8;
    }
    lVar7 = 0;
    do {
      lVar3 = FUN_00904984(plVar6 + 1);
      plVar6 = (long *)*plVar6;
      lVar7 = lVar3 + lVar7;
    } while (plVar6 != (long *)0x0);
    if (0x4000000 < lVar7 + param_6) {
      iVar2 = 100;
      goto LAB_009377ac;
    }
    plVar6 = (long *)*plVar4;
    if (((plVar6 == (long *)0x0) || (param_3 == 2)) || ((int)plVar6[5] != param_3)) {
      plVar6 = (long *)(*(code *)PTR_calloc_00cc4690)(1,0x30);
      if (plVar6 == (long *)0x0) {
        iVar2 = 0x1b;
        goto LAB_009377ac;
      }
      *(int *)(plVar6 + 5) = param_3;
      FUN_00904528(plVar6 + 1,0x4000000);
      *plVar6 = *plVar4;
      *plVar4 = (long)plVar6;
    }
    iVar2 = FUN_009045fc(plVar6 + 1,param_5,param_6);
    if (iVar2 != 0) goto LAB_009377ac;
    iVar2 = FUN_009377f0(param_1,param_2,plVar4,param_4 & 1);
joined_r0x009376e4:
    if (iVar2 == 0) goto LAB_009377ac;
  }
LAB_0093776c:
  *(byte *)(param_1 + 0x28) = *(byte *)(param_1 + 0x28) | 2;
  plVar6 = *(long **)(param_1 + 0x20);
  while (plVar6 != (long *)0x0) {
    plVar5 = (long *)*plVar6;
    FUN_00904534(plVar6 + 1);
    (*(code *)PTR_free_00cc4678)(plVar6);
    *plVar4 = (long)plVar5;
    plVar6 = plVar5;
  }
LAB_009377ac:
  if (*(long *)(lVar1 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

