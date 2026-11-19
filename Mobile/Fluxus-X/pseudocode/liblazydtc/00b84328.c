/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b84328
 */

long mbedtls_mpi_core_montmul_init(long *param_1)

{
  long lVar1;
  long lVar2;
  
  lVar1 = *param_1;
  lVar2 = ((ulong)((int)lVar1 * 2 + 4) & 8) + lVar1;
  lVar2 = (2 - lVar2 * lVar1) * lVar2;
  lVar2 = (2 - lVar2 * lVar1) * lVar2;
  lVar2 = (2 - lVar2 * lVar1) * lVar2;
  return -((2 - lVar2 * lVar1) * lVar2);
}

