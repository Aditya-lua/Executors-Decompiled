/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9aa8c
 */

int mbedtls_psa_ecdsa_verify_hash
              (undefined2 *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
              undefined8 param_5,undefined8 param_6,long param_7,long param_8)

{
  long lVar1;
  long lVar2;
  void *__ptr;
  int iVar3;
  ulong uVar4;
  undefined1 auStack_80 [16];
  undefined1 auStack_70 [16];
  void *local_60;
  long local_58;
  
  lVar2 = tpidr_el0;
  local_58 = *(long *)(lVar2 + 0x28);
  local_60 = (void *)0x0;
  iVar3 = mbedtls_psa_ecp_load_representation(*param_1,param_1[1],param_2,param_3,&local_60);
  __ptr = local_60;
  if (iVar3 == 0) {
    uVar4 = *(long *)((long)local_60 + 0x78) + 7U >> 3;
    mbedtls_mpi_init(auStack_70);
    mbedtls_mpi_init(auStack_80);
    if (uVar4 * 2 == param_8) {
      mbedtls_mpi_read_binary(auStack_70,param_7,uVar4);
      iVar3 = mbedtls_to_psa_error();
      if (iVar3 == 0) {
        mbedtls_mpi_read_binary(auStack_80,param_7 + uVar4,uVar4);
        iVar3 = mbedtls_to_psa_error();
        if (iVar3 == 0) {
          lVar1 = (long)__ptr + 0xd0;
          iVar3 = mbedtls_ecp_is_zero(lVar1);
          if (iVar3 != 0) {
            mbedtls_ecp_mul(__ptr,lVar1,(long)__ptr + 0xc0,(long)__ptr + 0x38,mbedtls_psa_get_random
                            ,0);
          }
          iVar3 = mbedtls_to_psa_error();
          if (iVar3 == 0) {
            mbedtls_ecdsa_verify(__ptr,param_5,param_6,lVar1,auStack_70,auStack_80);
            iVar3 = mbedtls_to_psa_error();
          }
        }
      }
    }
    else {
      iVar3 = -0x95;
    }
    mbedtls_mpi_free(auStack_70);
    mbedtls_mpi_free(auStack_80);
    mbedtls_ecp_keypair_free(__ptr);
    free(__ptr);
  }
  if (*(long *)(lVar2 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar3;
}

