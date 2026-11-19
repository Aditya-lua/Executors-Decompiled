/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7d650
 */

void mbedtls_mpi_free(long *param_1)

{
  if (param_1 != (long *)0x0) {
    if (*param_1 != 0) {
      mbedtls_zeroize_and_free(*param_1,(ulong)*(ushort *)((long)param_1 + 10) << 3);
    }
    *(undefined4 *)(param_1 + 1) = 1;
    *param_1 = 0;
  }
  return;
}

