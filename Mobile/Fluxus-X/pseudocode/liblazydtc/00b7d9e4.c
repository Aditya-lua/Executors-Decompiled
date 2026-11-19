/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7d9e4
 */

uint mbedtls_mpi_get_bit(long *param_1,ulong param_2)

{
  uint uVar1;
  
  uVar1 = 0;
  if (param_2 < (ulong)*(ushort *)((long)param_1 + 10) * 0x40) {
    uVar1 = (uint)(*(ulong *)(*param_1 + (param_2 >> 3 & 0x1ffffffffffffff8)) >> (param_2 & 0x3f)) &
            1;
  }
  return uVar1;
}

