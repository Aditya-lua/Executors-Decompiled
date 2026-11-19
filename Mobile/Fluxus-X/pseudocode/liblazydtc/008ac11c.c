/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ac11c
 */

void FUN_008ac11c(undefined8 param_1,long param_2)

{
  long lVar1;
  int iVar2;
  undefined8 *puVar3;
  long lVar4;
  undefined8 *puVar5;
  undefined4 local_3c;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  lVar4 = *(long *)(param_2 + 0x50);
  puVar3 = *(undefined8 **)(param_2 + 0x68);
  puVar5 = *(undefined8 **)(lVar4 + 0x18);
  if (puVar5 < puVar3 + 2) {
    if (0x1f3f0 < (long)puVar3 - *(long *)(param_2 + 0x70)) {
LAB_008ac204:
      FUN_008b9568(param_2,"stack overflow");
      if (*(long *)(lVar1 + 0x28) == local_38) {
        FUN_008aa5f4(param_2);
      }
      goto LAB_008ac22c;
    }
    if (*(long *)(param_2 + 0x48) - (long)puVar3 < 0x11) {
      local_3c = 1;
      iVar2 = FUN_008b3edc(param_2,&LAB_008aa604,&local_3c);
      if (iVar2 != 0) goto LAB_008ac204;
      lVar4 = *(long *)(param_2 + 0x50);
      puVar3 = *(undefined8 **)(param_2 + 0x68);
      puVar5 = *(undefined8 **)(lVar4 + 0x18);
    }
    if (puVar5 < puVar3 + 2) {
      *(undefined8 **)(lVar4 + 0x18) = puVar3 + 2;
    }
  }
  *puVar3 = param_1;
  lVar4 = *(long *)(param_2 + 0x68);
  *(undefined4 *)((long)puVar3 + 0xc) = 3;
  *(long *)(param_2 + 0x68) = lVar4 + 0x10;
  if (*(long *)(lVar1 + 0x28) == local_38) {
    return;
  }
LAB_008ac22c:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

