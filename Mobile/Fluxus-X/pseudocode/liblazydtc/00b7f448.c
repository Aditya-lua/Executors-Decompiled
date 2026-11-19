/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7f448
 */

void mbedtls_mpi_sub_int(undefined8 param_1,undefined8 param_2,long param_3)

{
  long lVar1;
  long *local_40;
  ushort local_38;
  undefined2 local_36;
  long local_30;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  local_30 = -param_3;
  if (-1 < param_3) {
    local_30 = param_3;
  }
  local_40 = &local_30;
  local_38 = (ushort)(param_3 >> 0x3f) | 1;
  local_36 = 1;
  FUN_00b7f304(param_1,param_2,&local_40,0xffffffff);
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

