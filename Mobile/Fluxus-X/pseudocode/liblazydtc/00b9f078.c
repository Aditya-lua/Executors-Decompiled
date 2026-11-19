/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9f078
 */

int mbedtls_cipher_cmac(long param_1,long param_2,undefined4 param_3,long param_4,undefined8 param_5
                       ,long param_6)

{
  long lVar1;
  int iVar2;
  void *pvVar3;
  long local_b8 [11];
  void *local_60;
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  iVar2 = -0x6100;
  if ((((param_1 == 0) || (param_2 == 0)) || (param_4 == 0)) || (param_6 == 0)) goto LAB_00b9f190;
  mbedtls_cipher_init(local_b8);
  iVar2 = mbedtls_cipher_setup(local_b8,param_1);
  if (iVar2 == 0) {
    if (local_b8[0] == 0) {
LAB_00b9f184:
      iVar2 = -0x6100;
    }
    else {
      iVar2 = mbedtls_cipher_setkey(local_b8,param_2,param_3,1);
      if (iVar2 == 0) {
        if (local_b8[0] == 0) goto LAB_00b9f184;
        iVar2 = -0x6100;
        if ((*(byte *)(local_b8[0] + 10) < 0x25) &&
           ((1L << ((ulong)*(byte *)(local_b8[0] + 10) & 0x3f) & 0x100000001cU) != 0)) {
          pvVar3 = calloc(1,0x28);
          if (pvVar3 == (void *)0x0) {
            iVar2 = -0x6180;
          }
          else {
            local_60 = pvVar3;
            mbedtls_platform_zeroize(pvVar3,0x10);
            iVar2 = mbedtls_cipher_cmac_update(local_b8,param_4,param_5);
            if (iVar2 == 0) {
              iVar2 = mbedtls_cipher_cmac_finish(local_b8,param_6);
            }
          }
        }
      }
    }
  }
  mbedtls_cipher_free(local_b8);
LAB_00b9f190:
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

