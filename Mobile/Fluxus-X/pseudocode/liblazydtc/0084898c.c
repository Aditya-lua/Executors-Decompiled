/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084898c
 */

void FUN_0084898c(long param_1,ushort param_2,int param_3)

{
  long lVar1;
  ushort uVar2;
  short sVar3;
  ushort *puVar4;
  ushort local_44 [2];
  ushort local_40 [2];
  ushort local_3c [2];
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  if (*(char *)(param_1 + 0xa5) == '\x01') {
    uVar2 = (**(code **)(**(long **)(param_1 + 0x18) + 0x28))(*(long **)(param_1 + 0x18));
    sVar3 = (**(code **)(**(long **)(param_1 + 0x18) + 0x28))(*(long **)(param_1 + 0x18),param_3);
    local_3c[0] = uVar2 & 0xff | sVar3 << 8;
    puVar4 = local_3c;
  }
  else {
    uVar2 = param_2 & 0xff | (ushort)(param_3 << 8);
    if (*(char *)(param_1 + 0xa6) == '\x01') {
      puVar4 = local_40;
      local_40[0] = uVar2;
    }
    else {
      puVar4 = local_44;
      local_44[0] = uVar2;
    }
  }
  FUN_008497f0(param_1 + 0x70,puVar4);
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

