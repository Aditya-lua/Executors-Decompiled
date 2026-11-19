/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b836c0
 */

ulong mbedtls_mpi_core_lt_ct(long param_1,long param_2,long param_3)

{
  ulong uVar1;
  ulong uVar2;
  long lVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  
  uVar1 = 0;
  uVar2 = 0;
  while (param_3 != 0) {
    param_3 = param_3 + -1;
    lVar3 = param_3 * 8;
    uVar5 = *(ulong *)(param_1 + lVar3);
    uVar6 = uVar5 ^ *(ulong *)(param_2 + lVar3);
    uVar4 = *(ulong *)(param_2 + lVar3);
    uVar2 = (long)(*(ulong *)(param_2 + lVar3) - uVar5 & (uVar6 ^ 0xffffffffffffffff) |
                  uVar6 & uVar5) >> 0x3f | uVar2;
    uVar5 = uVar4 ^ *(ulong *)(param_1 + lVar3);
    uVar4 = (long)(*(ulong *)(param_1 + lVar3) - uVar4 & (uVar5 ^ 0xffffffffffffffff) |
                  uVar5 & uVar4) >> 0x3f;
    uVar1 = uVar4 & (uVar2 ^ 0xffffffffffffffff) | uVar1;
    uVar2 = uVar4 | uVar2;
  }
  return uVar1;
}

