/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9a49c
 */

int mbedtls_psa_ecp_import_key
              (ushort *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
              undefined8 param_5,undefined8 param_6,long *param_7)

{
  ushort uVar1;
  long lVar2;
  void *__ptr;
  int iVar3;
  long lVar4;
  void *local_60;
  long local_58;
  
  lVar2 = tpidr_el0;
  local_58 = *(long *)(lVar2 + 0x28);
  local_60 = (void *)0x0;
  iVar3 = mbedtls_psa_ecp_load_representation(*param_1,param_1[1],param_2,param_3,&local_60);
  __ptr = local_60;
  if (iVar3 == 0) {
    uVar1 = *param_1;
    lVar4 = *(long *)((long)local_60 + 0x80);
    if ((uVar1 & 0xcfff) == 0x4141) {
      lVar4 = lVar4 + 1;
    }
    *param_7 = lVar4;
    iVar3 = mbedtls_psa_ecp_export_key(uVar1,local_60,param_4,param_5,param_6);
  }
  mbedtls_ecp_keypair_free(__ptr);
  free(__ptr);
  if (*(long *)(lVar2 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar3;
}

