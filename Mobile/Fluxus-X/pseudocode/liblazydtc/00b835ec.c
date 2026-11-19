/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b835ec
 */

long mbedtls_mpi_core_bitlen(long param_1,int param_2)

{
  long lVar1;
  long lVar2;
  long lVar3;
  
  lVar1 = (long)param_2 * 0x40 + 0x40;
  lVar2 = (long)param_2;
  do {
    if (lVar2 < 1) {
      return 0;
    }
    lVar3 = *(long *)(param_1 + lVar2 * 8 + -8);
    lVar1 = lVar1 + -0x40;
    lVar2 = lVar2 + -1;
  } while (lVar3 == 0);
  return lVar1 - LZCOUNT(lVar3);
}

