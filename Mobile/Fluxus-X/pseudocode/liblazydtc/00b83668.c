/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b83668
 */

ulong mbedtls_mpi_core_uint_le_mpi(ulong param_1,ulong *param_2,ulong param_3)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  long lVar4;
  
  uVar2 = *param_2;
  uVar1 = 0;
  uVar3 = param_1 ^ uVar2;
  if (1 < param_3) {
    lVar4 = param_3 - 1;
    do {
      param_2 = param_2 + 1;
      lVar4 = lVar4 + -1;
      uVar1 = (long)(-*param_2 | *param_2) >> 0x3f | uVar1;
    } while (lVar4 != 0);
  }
  return uVar1 | ~((long)(uVar2 - param_1 & (uVar3 ^ 0xffffffffffffffff) | uVar3 & param_1) >> 0x3f)
  ;
}

