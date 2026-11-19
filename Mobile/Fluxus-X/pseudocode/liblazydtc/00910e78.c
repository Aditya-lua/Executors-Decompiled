/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00910e78
 */

void FUN_00910e78(long param_1,undefined8 param_2)

{
  long lVar1;
  undefined8 uVar2;
  byte bVar3;
  undefined8 *puVar4;
  undefined8 local_58;
  undefined8 uStack_50;
  undefined8 local_48;
  undefined8 uStack_40;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  puVar4 = *(undefined8 **)(param_1 + 0x58);
  bVar3 = *(byte *)(param_1 + 0x78) | 1;
  *(byte *)(param_1 + 0x78) = bVar3;
  if (puVar4 == (undefined8 *)0x0) {
    uVar2 = 0;
  }
  else {
    do {
      uStack_40 = 0;
      local_48 = 0;
      uStack_50 = 0;
      local_58 = 0;
      FUN_0092bb60(*(undefined8 *)(param_1 + 0x80),*puVar4);
      FUN_00907984(*(undefined8 *)(param_1 + 0x80),&local_58);
      FUN_0092bab8(*(undefined8 *)(param_1 + 0x80));
      uVar2 = FUN_00934d18(param_2,&local_58);
      if ((int)uVar2 != 0) goto LAB_00910efc;
      puVar4 = (undefined8 *)puVar4[2];
    } while (puVar4 != (undefined8 *)0x0);
    uVar2 = 0;
LAB_00910efc:
    bVar3 = *(byte *)(param_1 + 0x78);
  }
  *(byte *)(param_1 + 0x78) = bVar3 & 0xfe;
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar2);
  }
  return;
}

