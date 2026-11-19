/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba14ac
 */

int mbedtls_ecjpake_write_shared_key
              (long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
              undefined8 param_5,undefined8 param_6)

{
  long lVar1;
  int iVar2;
  undefined1 auStack_88 [48];
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  mbedtls_ecp_point_init(auStack_88);
  iVar2 = FUN_00ba1398(param_1,auStack_88,param_5,param_6);
  if (iVar2 == 0) {
    iVar2 = mbedtls_ecp_point_write_binary
                      (param_1 + 8,auStack_88,*(undefined4 *)(param_1 + 0xcc),param_4,param_2,
                       param_3);
  }
  mbedtls_ecp_point_free(auStack_88);
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

