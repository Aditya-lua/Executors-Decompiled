/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba1294
 */

int mbedtls_ecjpake_derive_secret
              (undefined4 *param_1,undefined8 param_2,ulong param_3,ulong *param_4,
              undefined8 param_5,undefined8 param_6)

{
  long lVar1;
  int iVar2;
  ulong uVar3;
  undefined8 uVar4;
  undefined1 auStack_d0 [52];
  undefined1 auStack_9c [68];
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  mbedtls_md_info_from_type(*param_1);
  uVar3 = mbedtls_md_get_size();
  *param_4 = uVar3 & 0xff;
  if (param_3 < (uVar3 & 0xff)) {
    iVar2 = -0x4f00;
  }
  else {
    mbedtls_ecp_point_init(auStack_d0);
    iVar2 = FUN_00ba1398(param_1,auStack_d0,param_5,param_6);
    if (iVar2 == 0) {
      uVar3 = *(long *)(param_1 + 0x20) + 7U >> 3;
      iVar2 = mbedtls_mpi_write_binary(auStack_d0,auStack_9c,uVar3);
      if (iVar2 == 0) {
        uVar4 = mbedtls_md_info_from_type(*param_1);
        iVar2 = mbedtls_md(uVar4,auStack_9c,uVar3,param_2);
      }
    }
    mbedtls_ecp_point_free(auStack_d0);
  }
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

