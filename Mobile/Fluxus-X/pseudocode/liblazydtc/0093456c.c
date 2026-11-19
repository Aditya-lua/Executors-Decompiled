/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0093456c
 */

void FUN_0093456c(uint param_1,uint param_2,int param_3,long param_4)

{
  long lVar1;
  bool bVar2;
  uint uVar3;
  timeval *__timeout;
  int *piVar4;
  ulong uVar5;
  undefined4 *puVar6;
  int iVar7;
  ulong uVar8;
  long lVar9;
  uint local_50;
  uint uStack_4c;
  uint local_4a [4];
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  if (((param_2 & param_1) == 0xffffffff) && (param_3 == -1)) {
    if (param_4 == 0) {
      uVar5 = 0;
    }
    else {
      if (param_4 < 0) {
        puVar6 = (undefined4 *)__errno();
        *puVar6 = 0x16;
      }
      else {
        __timeout = (timeval *)FUN_00941c68(&local_50,param_4);
        uVar3 = select(0,(fd_set *)0x0,(fd_set *)0x0,(fd_set *)0x0,__timeout);
        uVar5 = (ulong)uVar3;
        if (uVar3 == 0) goto LAB_00934734;
        if (uVar3 == 0xffffffff) {
          piVar4 = (int *)__errno();
          uVar5 = 0;
          if (*piVar4 == 4) goto LAB_00934734;
        }
      }
      uVar5 = 0xffffffff;
    }
  }
  else {
    bVar2 = param_1 != 0xffffffff;
    if (bVar2) {
      uStack_4c = 0xc3;
      local_50 = param_1;
    }
    uVar5 = (ulong)bVar2;
    uVar8 = uVar5;
    if (param_2 != 0xffffffff) {
      uVar8 = (ulong)(bVar2 + 1);
      *(uint *)((long)((long)register0x00000008 + -0x4a) + (uVar5 * 4 + -3) * 2) = param_2;
      *(undefined4 *)((long)((long)register0x00000008 + -0x4a) + (uVar5 * 4 + -1) * 2) = 0xc3;
    }
    if (param_3 != -1) {
      iVar7 = (int)uVar8;
      uVar8 = (ulong)(iVar7 + 1);
      *(int *)((long)((long)register0x00000008 + -0x4a) + ((long)iVar7 * 4 + -3) * 2) = param_3;
      *(undefined4 *)((long)((long)register0x00000008 + -0x4a) + ((long)iVar7 * 4 + -1) * 2) = 0x106
      ;
    }
    uVar5 = FUN_0093475c(&local_50,uVar8,param_4);
    if (0 < (int)uVar5) {
      if (param_1 == 0xffffffff) {
        lVar9 = 0;
        iVar7 = 0;
        uVar5 = 0;
        uVar3 = 0;
      }
      else {
        uVar3 = (uint)((uStack_4c & 0x590000) != 0);
        if ((uStack_4c & 0x220000) != 0) {
          uVar3 = uVar3 | 4;
        }
        uVar5 = (ulong)uVar3;
        lVar9 = 1;
        iVar7 = 1;
      }
      if (param_2 != 0xffffffff) {
        if ((((uint *)((long)register0x00000008 + -0x4a))[lVar9 * 2] & 0x59) != 0) {
          uVar3 = uVar3 | 8;
        }
        if ((((uint *)((long)register0x00000008 + -0x4a))[lVar9 * 2] & 0x22) != 0) {
          uVar3 = uVar3 | 4;
        }
        uVar5 = (ulong)uVar3;
        iVar7 = (int)lVar9 + 1;
      }
      if (param_3 != -1) {
        uVar3 = (uint)uVar5;
        if ((((uint *)((long)register0x00000008 + -0x4a))[(long)iVar7 * 2] & 0x104) != 0) {
          uVar3 = (uint)uVar5 | 2;
        }
        if ((((uint *)((long)register0x00000008 + -0x4a))[(long)iVar7 * 2] & 0x3a) != 0) {
          uVar3 = uVar3 | 4;
        }
        uVar5 = (ulong)uVar3;
      }
    }
  }
LAB_00934734:
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar5);
  }
  return;
}

