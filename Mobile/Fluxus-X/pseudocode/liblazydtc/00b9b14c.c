/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9b14c
 */

void mbedtls_ecdh_read_params(undefined1 *param_1,long *param_2,long param_3)

{
  undefined1 *puVar1;
  long lVar2;
  int iVar3;
  undefined8 uVar4;
  undefined4 local_5c;
  long local_58;
  
  lVar2 = tpidr_el0;
  local_58 = *(long *)(lVar2 + 0x28);
  uVar4 = mbedtls_ecp_tls_read_group_id(&local_5c,param_2,param_3 - *param_2);
  if ((int)uVar4 == 0) {
    puVar1 = param_1 + 0x10;
    *param_1 = 0;
    *(undefined4 *)(param_1 + 4) = local_5c;
    *(undefined4 *)(param_1 + 8) = 1;
    mbedtls_ecp_group_init(puVar1);
    mbedtls_mpi_init(param_1 + 0xd0);
    mbedtls_ecp_point_init(param_1 + 0xe0);
    mbedtls_ecp_point_init(param_1 + 0x110);
    mbedtls_mpi_init(param_1 + 0x140);
    iVar3 = mbedtls_ecp_group_load(puVar1,local_5c);
    if (iVar3 == 0) {
      if (*(int *)(param_1 + 8) == 1) {
        uVar4 = mbedtls_ecp_tls_read_point(puVar1,param_1 + 0x110,param_2,param_3 - *param_2);
      }
      else {
        uVar4 = 0xffffb080;
      }
    }
    else {
      uVar4 = 0xffffb180;
    }
  }
  if (*(long *)(lVar2 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar4);
  }
  return;
}

