/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00910d9c
 */

int FUN_00910d9c(long param_1,undefined8 param_2)

{
  long lVar1;
  int iVar2;
  byte bVar3;
  undefined8 *puVar4;
  undefined8 local_68;
  undefined8 uStack_60;
  undefined8 local_58;
  undefined8 uStack_50;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  puVar4 = *(undefined8 **)(param_1 + 0x58);
  bVar3 = *(byte *)(param_1 + 0x78) | 1;
  *(byte *)(param_1 + 0x78) = bVar3;
  if (puVar4 == (undefined8 *)0x0) {
    iVar2 = 0;
  }
  else {
    do {
      uStack_50 = 0;
      local_58 = 0;
      uStack_60 = 0;
      local_68 = 0;
      FUN_0092bb60(*(undefined8 *)(param_1 + 0x80),*puVar4);
      FUN_00907984(*(undefined8 *)(param_1 + 0x80),&local_68);
      FUN_0092bab8(*(undefined8 *)(param_1 + 0x80));
      iVar2 = FUN_00934ba4(param_2,&local_68);
      if (iVar2 != 0) {
        FUN_00934a90(param_2);
        goto LAB_00910e3c;
      }
      puVar4 = (undefined8 *)puVar4[2];
    } while (puVar4 != (undefined8 *)0x0);
    iVar2 = 0;
LAB_00910e3c:
    bVar3 = *(byte *)(param_1 + 0x78);
  }
  *(byte *)(param_1 + 0x78) = bVar3 & 0xfe;
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

