/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ac34c
 */

void FUN_008ac34c(long param_1,undefined8 param_2,undefined8 param_3)

{
  long lVar1;
  int iVar2;
  undefined8 uVar3;
  long lVar4;
  undefined8 *puVar5;
  undefined8 *puVar6;
  undefined4 local_4c;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  if (*(ulong *)(*(long *)(param_1 + 0x60) + 8) <= *(ulong *)(*(long *)(param_1 + 0x60) + 0x10)) {
    FUN_008b52c4(param_1,1);
  }
  if ((*(byte *)(param_1 + 2) >> 2 & 1) != 0) {
    FUN_008b63a4(param_1,param_1,param_1 + 0x38);
  }
  lVar4 = *(long *)(param_1 + 0x50);
  puVar6 = *(undefined8 **)(param_1 + 0x68);
  puVar5 = *(undefined8 **)(lVar4 + 0x18);
  if (puVar5 < puVar6 + 2) {
    if (0x1f3f0 < (long)puVar6 - *(long *)(param_1 + 0x70)) {
LAB_008ac47c:
      FUN_008b9568(param_1,"stack overflow");
      if (*(long *)(lVar1 + 0x28) == local_48) {
        FUN_008aa5f4(param_1);
      }
      goto LAB_008ac4a4;
    }
    if (*(long *)(param_1 + 0x48) - (long)puVar6 < 0x11) {
      local_4c = 1;
      iVar2 = FUN_008b3edc(param_1,&LAB_008aa604,&local_4c);
      if (iVar2 != 0) goto LAB_008ac47c;
      lVar4 = *(long *)(param_1 + 0x50);
      puVar6 = *(undefined8 **)(param_1 + 0x68);
      puVar5 = *(undefined8 **)(lVar4 + 0x18);
    }
    if (puVar5 < puVar6 + 2) {
      *(undefined8 **)(lVar4 + 0x18) = puVar6 + 2;
    }
  }
  uVar3 = FUN_008b9ff8(param_1,param_2,param_3);
  *puVar6 = uVar3;
  lVar4 = *(long *)(param_1 + 0x68);
  *(undefined4 *)((long)puVar6 + 0xc) = 5;
  *(long *)(param_1 + 0x68) = lVar4 + 0x10;
  if (*(long *)(lVar1 + 0x28) == local_48) {
    return;
  }
LAB_008ac4a4:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

