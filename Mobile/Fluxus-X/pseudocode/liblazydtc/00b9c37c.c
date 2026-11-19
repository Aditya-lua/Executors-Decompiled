/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9c37c
 */

void mbedtls_hmac_drbg_seed_buf
               (long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  undefined1 uVar1;
  int iVar2;
  ulong uVar3;
  
  iVar2 = mbedtls_md_setup(param_1,param_2,1);
  if (iVar2 == 0) {
    uVar1 = mbedtls_md_get_size(param_2);
    iVar2 = mbedtls_md_hmac_starts(param_1,(void *)(param_1 + 0x18),uVar1);
    if (iVar2 == 0) {
      uVar3 = mbedtls_md_get_size(param_2);
      memset((void *)(param_1 + 0x18),1,uVar3 & 0xff);
      mbedtls_hmac_drbg_update(param_1,param_3,param_4);
      return;
    }
  }
  return;
}

