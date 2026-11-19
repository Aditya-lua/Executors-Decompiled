/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7d1c4
 */

void mbedtls_mpi_lt_mpi_ct(long *param_1,undefined8 *param_2,uint *param_3)

{
  long lVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  undefined8 uVar5;
  ulong uVar6;
  ulong uVar7;
  long local_48 [3];
  
  lVar1 = tpidr_el0;
  local_48[2] = *(long *)(lVar1 + 0x28);
  if (*(short *)((long)param_1 + 10) == *(short *)((long)param_2 + 10)) {
    uVar7 = (ulong)(*(ushort *)(param_1 + 1) >> 1 & 1);
    uVar6 = -uVar7;
    uVar7 = (long)(uVar6 | uVar7) >> 0x3f & 1;
    uVar2 = (uint)(uVar6 >> 0x20);
    uVar3 = (uint)(-(ulong)(*(ushort *)(param_2 + 1) >> 1 & 1) >> 0x20) ^ uVar2;
    local_48[0] = *param_1;
    local_48[1] = *param_2;
    uVar4 = mbedtls_mpi_core_lt_ct
                      (local_48[uVar7],local_48[uVar7 ^ 1],*(undefined2 *)((long)param_1 + 10));
    uVar5 = 0;
    *param_3 = (uVar4 & ((int)uVar3 >> 0x1f ^ 0xffffffffU) | (int)(uVar3 & uVar2) >> 0x1f) & 1;
  }
  else {
    uVar5 = 0xfffffffc;
  }
  if (*(long *)(lVar1 + 0x28) != local_48[2]) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar5);
  }
  return;
}

