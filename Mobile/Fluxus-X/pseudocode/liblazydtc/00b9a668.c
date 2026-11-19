/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9a668
 */

int mbedtls_psa_ecp_export_public_key
              (ushort *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
              undefined8 param_5,undefined8 param_6)

{
  long lVar1;
  void *__ptr;
  int iVar2;
  ushort uVar3;
  void *local_50;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  local_50 = (void *)0x0;
  iVar2 = mbedtls_psa_ecp_load_representation(*param_1,param_1[1],param_2,param_3,&local_50);
  __ptr = local_50;
  if (iVar2 == 0) {
    uVar3 = *param_1 & 0xff | 0x4100;
    if ((*param_1 & 0xcf00) != 0x4100) {
      uVar3 = 0x4100;
    }
    iVar2 = mbedtls_psa_ecp_export_key(uVar3,local_50,param_4,param_5,param_6);
    mbedtls_ecp_keypair_free(__ptr);
    free(__ptr);
  }
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

