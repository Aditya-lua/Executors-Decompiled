/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9b444
 */

void mbedtls_ecdh_read_public(long param_1,long param_2,long param_3)

{
  long lVar1;
  ulong uVar2;
  uint uVar3;
  long local_40;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  if (*(int *)(param_1 + 8) == 1) {
    local_40 = param_2;
    uVar2 = mbedtls_ecp_tls_read_point(param_1 + 0x10,param_1 + 0x110,&local_40,param_3);
    if ((int)uVar2 == 0) {
      uVar3 = 0;
      if (local_40 - param_2 != param_3) {
        uVar3 = 0xffffb080;
      }
      uVar2 = (ulong)uVar3;
    }
  }
  else {
    uVar2 = 0xffffb080;
  }
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar2);
  }
  return;
}

