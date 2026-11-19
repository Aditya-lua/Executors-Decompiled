/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008aca84
 */

void FUN_008aca84(long param_1,undefined8 param_2,undefined4 param_3)

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
  lVar4 = *(long *)(param_1 + 0x50);
  puVar3 = *(undefined8 **)(param_1 + 0x68);
  puVar5 = *(undefined8 **)(lVar4 + 0x18);
  if (puVar5 < puVar3 + 2) {
    if (0x1f3f0 < (long)puVar3 - *(long *)(param_1 + 0x70)) {
LAB_008acb78:
      FUN_008b9568(param_1,"stack overflow");
      if (*(long *)(lVar1 + 0x28) == local_38) {
        FUN_008aa5f4(param_1);
      }
      goto LAB_008acba0;
    }
    if (*(long *)(param_1 + 0x48) - (long)puVar3 < 0x11) {
      local_3c = 1;
      iVar2 = FUN_008b3edc(param_1,&LAB_008aa604,&local_3c);
      if (iVar2 != 0) goto LAB_008acb78;
      lVar4 = *(long *)(param_1 + 0x50);
      puVar3 = *(undefined8 **)(param_1 + 0x68);
      puVar5 = *(undefined8 **)(lVar4 + 0x18);
    }
    if (puVar5 < puVar3 + 2) {
      *(undefined8 **)(lVar4 + 0x18) = puVar3 + 2;
    }
  }
  *puVar3 = param_2;
  lVar4 = *(long *)(param_1 + 0x68);
  *(undefined4 *)(puVar3 + 1) = param_3;
  *(undefined4 *)((long)puVar3 + 0xc) = 2;
  *(long *)(param_1 + 0x68) = lVar4 + 0x10;
  if (*(long *)(lVar1 + 0x28) == local_38) {
    return;
  }
LAB_008acba0:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

