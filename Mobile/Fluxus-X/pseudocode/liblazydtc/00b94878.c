/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b94878
 */

int mbedtls_ecp_check_pub_priv(int *param_1,int *param_2,long param_3,undefined8 param_4)

{
  long lVar1;
  int iVar2;
  undefined4 local_160 [2];
  undefined1 auStack_158 [16];
  undefined1 auStack_148 [16];
  undefined1 auStack_138 [16];
  undefined1 auStack_128 [16];
  undefined1 auStack_118 [16];
  undefined1 auStack_108 [16];
  undefined1 auStack_f8 [16];
  undefined8 local_e8;
  undefined8 uStack_e0;
  undefined4 local_d8;
  undefined8 local_d0;
  undefined8 uStack_c8;
  undefined8 local_c0;
  undefined8 uStack_b8;
  undefined8 local_b0;
  undefined8 uStack_a8;
  undefined1 auStack_a0 [16];
  undefined1 auStack_90 [16];
  undefined1 auStack_80 [16];
  long local_70;
  
  lVar1 = tpidr_el0;
  local_70 = *(long *)(lVar1 + 0x28);
  if ((*param_1 != 0) && (*param_1 == *param_2)) {
    iVar2 = mbedtls_mpi_cmp_mpi(param_1 + 0x34,param_2 + 0x34);
    if (iVar2 == 0) {
      iVar2 = mbedtls_mpi_cmp_mpi(param_1 + 0x38,param_2 + 0x38);
      if (iVar2 == 0) {
        iVar2 = mbedtls_mpi_cmp_mpi(param_1 + 0x3c,param_2 + 0x3c);
        if (iVar2 == 0) {
          mbedtls_mpi_init(auStack_a0);
          mbedtls_mpi_init(auStack_90);
          mbedtls_mpi_init(auStack_80);
          local_160[0] = 0;
          mbedtls_mpi_init(auStack_158);
          mbedtls_mpi_init(auStack_148);
          mbedtls_mpi_init(auStack_138);
          mbedtls_mpi_init(auStack_128);
          mbedtls_mpi_init(auStack_118);
          mbedtls_mpi_init(auStack_108);
          mbedtls_mpi_init(auStack_f8);
          local_d8 = 0;
          local_e8 = 0;
          uStack_e0 = 0;
          local_b0 = 0;
          uStack_a8 = 0;
          local_c0 = 0;
          uStack_b8 = 0;
          local_d0 = 0;
          uStack_c8 = 0;
          mbedtls_ecp_group_load(local_160,*param_2);
          if (param_3 == 0) {
LAB_00b94a18:
            iVar2 = -0x4f80;
          }
          else {
            iVar2 = FUN_00b923c4(local_160,auStack_a0,param_2 + 0x30,param_2 + 0xe,param_3,param_4);
            if (iVar2 == 0) {
              iVar2 = mbedtls_mpi_cmp_mpi(auStack_a0,param_2 + 0x34);
              if (((iVar2 != 0) ||
                  (iVar2 = mbedtls_mpi_cmp_mpi(auStack_90,param_2 + 0x38), iVar2 != 0)) ||
                 (iVar2 = mbedtls_mpi_cmp_mpi(auStack_80,param_2 + 0x3c), iVar2 != 0))
              goto LAB_00b94a18;
              iVar2 = 0;
            }
          }
          mbedtls_mpi_free(auStack_a0);
          mbedtls_mpi_free(auStack_90);
          mbedtls_mpi_free(auStack_80);
          mbedtls_ecp_group_free(local_160);
          goto LAB_00b94908;
        }
      }
    }
  }
  iVar2 = -0x4f80;
LAB_00b94908:
  if (*(long *)(lVar1 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

