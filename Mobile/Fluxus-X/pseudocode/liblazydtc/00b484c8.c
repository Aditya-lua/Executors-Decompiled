/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b484c8
 */

bool FUN_00b484c8(undefined8 *param_1)

{
  long lVar1;
  
  EVP_MD_free(param_1[10]);
  lVar1 = EVP_MD_fetch(*param_1,"sha256",param_1[1]);
  param_1[10] = lVar1;
  if (lVar1 == 0) {
    CRYPTO_free(param_1);
    ERR_new();
    ERR_set_debug("providers/implementations/kdfs/scrypt.c",0x84,"set_digest");
    ERR_set_error(0x39,0x93,0);
  }
  return lVar1 != 0;
}

