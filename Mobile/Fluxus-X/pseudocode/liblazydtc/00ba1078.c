/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba1078
 */

int FUN_00ba1078(undefined4 param_1,long param_2,undefined4 param_3,undefined8 param_4,
                undefined8 param_5,undefined8 param_6,undefined8 param_7,long *param_8,
                undefined1 *param_9,undefined8 param_10,undefined8 param_11)

{
  long lVar1;
  int iVar2;
  undefined1 *puVar3;
  ulong local_c0;
  undefined1 auStack_b8 [16];
  undefined1 auStack_a8 [16];
  undefined1 auStack_98 [48];
  long local_68;
  
  lVar1 = tpidr_el0;
  local_68 = *(long *)(lVar1 + 0x28);
  if (param_9 < (undefined1 *)*param_8) {
    iVar2 = -0x4f00;
  }
  else {
    mbedtls_ecp_point_init(auStack_98);
    mbedtls_mpi_init(auStack_a8);
    mbedtls_mpi_init(auStack_b8);
    iVar2 = mbedtls_ecp_gen_keypair_base(param_2,param_4,auStack_a8,auStack_98,param_10,param_11);
    if (iVar2 == 0) {
      iVar2 = FUN_00ba2054(param_1,param_2,param_3,param_4,auStack_98,param_6,param_7,auStack_b8);
      if (iVar2 == 0) {
        iVar2 = mbedtls_mpi_mul_mpi(auStack_b8,auStack_b8,param_5);
        if (iVar2 == 0) {
          iVar2 = mbedtls_mpi_sub_mpi(auStack_b8,auStack_a8,auStack_b8);
          if (iVar2 == 0) {
            iVar2 = mbedtls_mpi_mod_mpi(auStack_b8,auStack_b8,param_2 + 0x68);
            if (iVar2 == 0) {
              iVar2 = mbedtls_ecp_tls_write_point
                                (param_2,auStack_98,param_3,&local_c0,*param_8,
                                 (long)param_9 - *param_8);
              if (iVar2 == 0) {
                *param_8 = *param_8 + local_c0;
                local_c0 = mbedtls_mpi_size(auStack_b8);
                puVar3 = (undefined1 *)*param_8;
                if (param_9 < puVar3) {
                  iVar2 = -0x4f00;
                }
                else {
                  iVar2 = -0x4f00;
                  if ((local_c0 < 0x100) && (local_c0 + 1 <= (ulong)((long)param_9 - (long)puVar3)))
                  {
                    *param_8 = (long)(puVar3 + 1);
                    *puVar3 = (char)local_c0;
                    iVar2 = mbedtls_mpi_write_binary(auStack_b8,*param_8,local_c0);
                    if (iVar2 == 0) {
                      *param_8 = *param_8 + local_c0;
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    mbedtls_ecp_point_free(auStack_98);
    mbedtls_mpi_free(auStack_a8);
    mbedtls_mpi_free(auStack_b8);
  }
  if (*(long *)(lVar1 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

