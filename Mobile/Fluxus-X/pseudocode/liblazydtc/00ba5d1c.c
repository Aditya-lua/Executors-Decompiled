/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba5d1c
 */

void mbedtls_rsa_parse_pubkey(long param_1,long param_2,long param_3)

{
  long lVar1;
  int iVar2;
  ulong uVar3;
  undefined8 uVar4;
  uint uVar5;
  long local_48;
  long local_40;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  param_3 = param_2 + param_3;
  local_40 = param_2;
  uVar3 = mbedtls_asn1_get_tag(&local_40,param_3,&local_48,0x30);
  if ((int)uVar3 != 0) goto LAB_00ba5de8;
  if (param_3 == local_40 + local_48) {
    uVar3 = mbedtls_asn1_get_tag(&local_40,param_3,&local_48,2);
    if ((int)uVar3 != 0) goto LAB_00ba5de8;
    if (local_40 != 0) {
      iVar2 = mbedtls_mpi_read_binary(param_1 + 0x10,local_40,local_48);
      if (iVar2 != 0x4080) {
        if (iVar2 != 0) goto LAB_00ba5d70;
        uVar4 = mbedtls_mpi_size(param_1 + 0x10);
        *(undefined8 *)(param_1 + 8) = uVar4;
      }
    }
    local_40 = local_40 + local_48;
    uVar3 = mbedtls_asn1_get_tag(&local_40,param_3,&local_48,2);
    if ((int)uVar3 != 0) goto LAB_00ba5de8;
    if (((local_40 == 0) ||
        (iVar2 = mbedtls_mpi_read_binary(param_1 + 0x20,local_40,local_48), iVar2 == 0x4080)) ||
       (iVar2 == 0)) {
      local_40 = local_40 + local_48;
      iVar2 = mbedtls_rsa_complete(param_1);
      if ((iVar2 == 0) && (iVar2 = mbedtls_rsa_check_pubkey(param_1), iVar2 == 0)) {
        uVar5 = 0;
        if (local_40 != param_3) {
          uVar5 = 0xffffff9a;
        }
        uVar3 = (ulong)uVar5;
        goto LAB_00ba5de8;
      }
    }
  }
LAB_00ba5d70:
  uVar3 = 0xffffbf80;
LAB_00ba5de8:
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar3);
  }
  return;
}

