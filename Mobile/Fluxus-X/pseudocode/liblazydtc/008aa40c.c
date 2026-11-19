/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008aa40c
 */

void FUN_008aa40c(long param_1,undefined8 *param_2)

{
  long lVar1;
  int iVar2;
  undefined8 *puVar3;
  long lVar4;
  undefined8 *puVar5;
  undefined8 uVar6;
  undefined4 local_3c;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  lVar4 = *(long *)(param_1 + 0x50);
  puVar3 = *(undefined8 **)(param_1 + 0x68);
  puVar5 = *(undefined8 **)(lVar4 + 0x18);
  if (puVar5 < puVar3 + 2) {
    if (0x1f3f0 < (long)puVar3 - *(long *)(param_1 + 0x70)) {
LAB_008aa4f4:
      FUN_008b9568(param_1,"stack overflow");
      if (*(long *)(lVar1 + 0x28) == local_38) {
        FUN_008aa5f4(param_1);
      }
      goto LAB_008aa51c;
    }
    if (*(long *)(param_1 + 0x48) - (long)puVar3 < 0x11) {
      local_3c = 1;
      iVar2 = FUN_008b3edc(param_1,&LAB_008aa604,&local_3c);
      if (iVar2 != 0) goto LAB_008aa4f4;
      lVar4 = *(long *)(param_1 + 0x50);
      puVar3 = *(undefined8 **)(param_1 + 0x68);
      puVar5 = *(undefined8 **)(lVar4 + 0x18);
    }
    if (puVar5 < puVar3 + 2) {
      *(undefined8 **)(lVar4 + 0x18) = puVar3 + 2;
    }
  }
  uVar6 = *param_2;
  puVar3[1] = param_2[1];
  *puVar3 = uVar6;
  *(long *)(param_1 + 0x68) = *(long *)(param_1 + 0x68) + 0x10;
  if (*(long *)(lVar1 + 0x28) == local_38) {
    return;
  }
LAB_008aa51c:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

