/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ac230
 */

void FUN_008ac230(long param_1,int param_2)

{
  long lVar1;
  int iVar2;
  double *pdVar3;
  long lVar4;
  double *pdVar5;
  undefined4 local_3c;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  lVar4 = *(long *)(param_1 + 0x50);
  pdVar3 = *(double **)(param_1 + 0x68);
  pdVar5 = *(double **)(lVar4 + 0x18);
  if (pdVar5 < pdVar3 + 2) {
    if (0x1f3f0 < (long)pdVar3 - *(long *)(param_1 + 0x70)) {
LAB_008ac320:
      FUN_008b9568(param_1,"stack overflow");
      if (*(long *)(lVar1 + 0x28) == local_38) {
        FUN_008aa5f4(param_1);
      }
      goto LAB_008ac348;
    }
    if (*(long *)(param_1 + 0x48) - (long)pdVar3 < 0x11) {
      local_3c = 1;
      iVar2 = FUN_008b3edc(param_1,&LAB_008aa604,&local_3c);
      if (iVar2 != 0) goto LAB_008ac320;
      lVar4 = *(long *)(param_1 + 0x50);
      pdVar3 = *(double **)(param_1 + 0x68);
      pdVar5 = *(double **)(lVar4 + 0x18);
    }
    if (pdVar5 < pdVar3 + 2) {
      *(double **)(lVar4 + 0x18) = pdVar3 + 2;
    }
  }
  *(undefined4 *)((long)pdVar3 + 0xc) = 3;
  *pdVar3 = (double)param_2;
  *(long *)(param_1 + 0x68) = *(long *)(param_1 + 0x68) + 0x10;
  if (*(long *)(lVar1 + 0x28) == local_38) {
    return;
  }
LAB_008ac348:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

