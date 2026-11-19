/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9be14
 */

int mbedtls_ecdsa_write_signature_restartable
              (long param_1,undefined4 param_2,undefined8 param_3,undefined8 param_4,void *param_5,
              ulong param_6,size_t *param_7,long param_8,undefined8 param_9)

{
  size_t __n;
  long lVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  long lVar5;
  undefined1 auStack_128 [16];
  undefined1 auStack_118 [16];
  undefined1 *local_108;
  undefined1 auStack_fc [139];
  undefined1 uStack_71;
  long local_70;
  
  lVar1 = tpidr_el0;
  local_70 = *(long *)(lVar1 + 0x28);
  if (param_8 == 0) {
    iVar2 = -0x4f80;
  }
  else {
    mbedtls_mpi_init(auStack_118);
    mbedtls_mpi_init(auStack_128);
    iVar2 = mbedtls_ecdsa_sign_det_restartable
                      (param_1,auStack_118,auStack_128,param_1 + 0xc0,param_3,param_4,param_2,
                       param_8,param_9);
    if (iVar2 == 0) {
      memset(auStack_fc,0,0x8b);
      local_108 = &uStack_71;
      iVar3 = mbedtls_asn1_write_mpi(&local_108,auStack_fc,auStack_128);
      iVar2 = iVar3;
      if ((-1 < iVar3) &&
         (iVar2 = mbedtls_asn1_write_mpi(&local_108,auStack_fc,auStack_118), -1 < iVar2)) {
        lVar5 = (long)iVar2;
        iVar4 = mbedtls_asn1_write_len(&local_108,auStack_fc,lVar5 + iVar3);
        iVar2 = iVar4;
        if ((-1 < iVar4) && (iVar2 = mbedtls_asn1_write_tag(&local_108,auStack_fc,0x30), -1 < iVar2)
           ) {
          __n = lVar5 + iVar3 + (long)iVar4 + (long)iVar2;
          if (param_6 < __n) {
            iVar2 = -0x4f00;
          }
          else {
            memcpy(param_5,local_108,__n);
            iVar2 = 0;
            *param_7 = __n;
          }
        }
      }
    }
    mbedtls_mpi_free(auStack_118);
    mbedtls_mpi_free(auStack_128);
  }
  if (*(long *)(lVar1 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

