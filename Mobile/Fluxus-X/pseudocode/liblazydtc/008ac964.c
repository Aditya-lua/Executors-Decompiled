/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ac964
 */

void FUN_008ac964(long param_1,int param_2)

{
  long lVar1;
  int iVar2;
  uint *puVar3;
  long lVar4;
  uint *puVar5;
  undefined4 local_3c;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  lVar4 = *(long *)(param_1 + 0x50);
  puVar3 = *(uint **)(param_1 + 0x68);
  puVar5 = *(uint **)(lVar4 + 0x18);
  if (puVar5 < puVar3 + 4) {
    if (0x1f3f0 < (long)puVar3 - *(long *)(param_1 + 0x70)) {
LAB_008aca58:
      FUN_008b9568(param_1,"stack overflow");
      if (*(long *)(lVar1 + 0x28) == local_38) {
        FUN_008aa5f4(param_1);
      }
      goto LAB_008aca80;
    }
    if (*(long *)(param_1 + 0x48) - (long)puVar3 < 0x11) {
      local_3c = 1;
      iVar2 = FUN_008b3edc(param_1,&LAB_008aa604,&local_3c);
      if (iVar2 != 0) goto LAB_008aca58;
      lVar4 = *(long *)(param_1 + 0x50);
      puVar3 = *(uint **)(param_1 + 0x68);
      puVar5 = *(uint **)(lVar4 + 0x18);
    }
    if (puVar5 < puVar3 + 4) {
      *(uint **)(lVar4 + 0x18) = puVar3 + 4;
    }
  }
  puVar3[3] = 1;
  *puVar3 = (uint)(param_2 != 0);
  *(long *)(param_1 + 0x68) = *(long *)(param_1 + 0x68) + 0x10;
  if (*(long *)(lVar1 + 0x28) == local_38) {
    return;
  }
LAB_008aca80:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

