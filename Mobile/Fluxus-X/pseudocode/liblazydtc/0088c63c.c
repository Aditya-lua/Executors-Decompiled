/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0088c63c
 */

void FUN_0088c63c(long param_1,long param_2)

{
  uint uVar1;
  uint uVar2;
  long lVar3;
  int iVar4;
  int iVar5;
  undefined1 *puVar6;
  long *plVar7;
  undefined1 auStack_88 [48];
  long local_58;
  int local_50;
  long local_48;
  
  lVar3 = tpidr_el0;
  local_48 = *(long *)(lVar3 + 0x28);
  iVar4 = *(int *)(param_2 + 0x40);
  if (iVar4 == 0) {
    iVar4 = FUN_0088df20(param_1,*(undefined8 *)(param_2 + 0x20));
    if (iVar4 < 0) {
LAB_0088c69c:
      iVar4 = *(int *)(param_2 + 0x40);
      goto LAB_0088c6a0;
    }
    if ((*(long *)(param_2 + 0x28) != 0) && (iVar5 = FUN_0088df20(param_1), iVar4 == iVar5))
    goto LAB_0088c69c;
  }
  else {
LAB_0088c6a0:
    if (iVar4 - 1U < 2) {
      iVar4 = *(int *)(param_1 + 0x64c);
      uVar1 = iVar4 + 1;
      if (0xff < uVar1) {
LAB_0088c854:
        if (*(long *)(lVar3 + 0x28) == local_48) {
                    /* WARNING: Subroutine does not return */
          FUN_0087fcd8(param_2 + 0xc,
                       "Out of registers when trying to allocate %d registers: exceeded limit %d",1,
                       0xff);
        }
        goto LAB_0088c8e8;
      }
      *(uint *)(param_1 + 0x64c) = uVar1;
      uVar2 = *(uint *)(param_1 + 0x650);
      if (*(uint *)(param_1 + 0x650) <= uVar1) {
        uVar2 = uVar1;
      }
      *(uint *)(param_1 + 0x650) = uVar2;
      FUN_00884b7c(param_1,*(undefined8 *)(param_2 + 0x20),iVar4,0xffffffff);
    }
    else {
      if (iVar4 != 3) {
        if (iVar4 == 0) {
          iVar4 = *(int *)(param_1 + 0x64c);
          uVar1 = iVar4 + 1;
          local_58 = param_1;
          local_50 = iVar4;
          if (0xff < uVar1) {
            if (*(long *)(lVar3 + 0x28) == local_48) {
                    /* try { // try from 0088c8ac to 0088c8c3 has its CatchHandler @ 0088c8d0 */
                    /* WARNING: Subroutine does not return */
              FUN_0087fcd8(param_2 + 0xc,
                           "Out of registers when trying to allocate %d registers: exceeded limit %d"
                           ,1,0xff);
            }
            goto LAB_0088c8e8;
          }
          *(uint *)(param_1 + 0x64c) = uVar1;
          uVar2 = *(uint *)(param_1 + 0x650);
          if (*(uint *)(param_1 + 0x650) <= uVar1) {
            uVar2 = uVar1;
          }
          *(uint *)(param_1 + 0x650) = uVar2;
                    /* try { // try from 0088c6e4 to 0088c6f3 has its CatchHandler @ 0088c8d0 */
          FUN_0089a06c(param_1,param_2,iVar4);
                    /* try { // try from 0088c6f8 to 0088c71f has its CatchHandler @ 0088c8c4 */
          FUN_00899540(auStack_88,param_1,*(undefined8 *)(param_2 + 0x20),&local_58);
          FUN_00892774(param_1,auStack_88,iVar4,1,*(undefined8 *)(param_2 + 0x20));
          *(int *)(local_58 + 0x64c) = local_50;
        }
        if (*(long *)(lVar3 + 0x28) == local_48) {
          return;
        }
        goto LAB_0088c8e8;
      }
      iVar4 = *(int *)(param_1 + 0x64c);
      uVar1 = iVar4 + 1;
      if (0xff < uVar1) goto LAB_0088c854;
      *(uint *)(param_1 + 0x64c) = uVar1;
      uVar2 = *(uint *)(param_1 + 0x650);
      if (*(uint *)(param_1 + 0x650) <= uVar1) {
        uVar2 = uVar1;
      }
      *(uint *)(param_1 + 0x650) = uVar2;
      plVar7 = (long *)(param_2 + 0x20);
      FUN_00884b7c(param_1,*plVar7,iVar4,0xffffffff);
      if ((*(char *)(*plVar7 + 0x31) == '\x01') &&
         (((*(long *)(param_1 + 0x668) == 0 ||
           (*(long *)(*(long *)(param_1 + 0x668) + 0x98) != 0 || *(long *)(param_1 + 0x670) != 0))
          || (*(long *)(param_1 + 2000) != *(long *)(param_1 + 0x7d8))))) {
        if (*(long *)(lVar3 + 0x28) == local_48) {
                    /* WARNING: Subroutine does not return */
          FUN_0087fcd8(param_2 + 0xc,"\'export\' may only be applied to top-level statements");
        }
        goto LAB_0088c8e8;
      }
      FUN_0088b80c(param_1,param_2);
      puVar6 = (undefined1 *)FUN_0089a584(param_1 + 0xc70,plVar7);
      *puVar6 = (char)iVar4;
    }
  }
  if (*(long *)(lVar3 + 0x28) == local_48) {
    FUN_0089a06c(param_1,param_2,iVar4);
    return;
  }
LAB_0088c8e8:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

