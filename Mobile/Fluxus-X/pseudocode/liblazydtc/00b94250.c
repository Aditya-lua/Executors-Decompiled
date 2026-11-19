/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b94250
 */

ulong mbedtls_ecp_gen_privkey(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  long lVar1;
  uint uVar2;
  uint uVar3;
  ulong uVar4;
  ulong uVar5;
  
  if (*(long *)(param_1 + 0x38) == 0) {
    uVar4 = 0xffffb080;
  }
  else if (*(long *)(param_1 + 0x48) == 0) {
    uVar5 = *(ulong *)(param_1 + 0x80);
    lVar1 = (uVar5 >> 3) + 1;
    uVar4 = mbedtls_mpi_fill_random(param_2,lVar1,param_3,param_4);
    if (((((int)uVar4 == 0) &&
         (uVar4 = mbedtls_mpi_shift_r(param_2,~uVar5 + lVar1 * 8), (int)uVar4 == 0)) &&
        (uVar4 = mbedtls_mpi_set_bit(param_2,uVar5,1), (int)uVar4 == 0)) &&
       (((uVar4 = mbedtls_mpi_set_bit(param_2,0,0), (int)uVar4 == 0 &&
         (uVar4 = mbedtls_mpi_set_bit(param_2,1,0), uVar5 == 0xfe)) && ((int)uVar4 == 0)))) {
      uVar4 = mbedtls_mpi_set_bit(param_2,2,0);
      return uVar4;
    }
  }
  else {
    uVar3 = mbedtls_mpi_random(param_2,1,param_1 + 0x68);
    uVar2 = 0xffffb300;
    if (uVar3 != 0xfffffff2) {
      uVar2 = uVar3;
    }
    uVar4 = (ulong)uVar2;
  }
  return uVar4;
}

