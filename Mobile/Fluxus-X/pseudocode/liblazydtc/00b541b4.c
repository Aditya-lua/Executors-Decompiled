/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b541b4
 */

ulong FUN_00b541b4(long param_1,uchar *param_2,long param_3,undefined8 param_4)

{
  int iVar1;
  uint uVar2;
  ulong uVar3;
  EVP_CIPHER_CTX *ctx;
  
  uVar3 = ossl_prov_is_running();
  if (((int)uVar3 != 0) && (uVar3 = FUN_00b54420(param_1,param_4), (int)uVar3 != 0)) {
    ctx = *(EVP_CIPHER_CTX **)(param_1 + 8);
    if (param_2 == (uchar *)0x0) {
      uVar2 = EVP_EncryptInit_ex(ctx,(EVP_CIPHER *)0x0,(ENGINE *)0x0,(uchar *)0x0,(uchar *)0x0);
      return (ulong)uVar2;
    }
    iVar1 = EVP_CIPHER_CTX_get_key_length(ctx);
    if (iVar1 == param_3) {
      iVar1 = EVP_EncryptInit_ex(ctx,(EVP_CIPHER *)0x0,(ENGINE *)0x0,param_2,(uchar *)0x0);
      uVar3 = (ulong)(iVar1 != 0);
    }
    else {
      ERR_new();
      ERR_set_debug("providers/implementations/macs/gmac_prov.c",0x6a,"gmac_setkey");
      ERR_set_error(0x39,0x69,0);
      uVar3 = 0;
    }
  }
  return uVar3;
}

