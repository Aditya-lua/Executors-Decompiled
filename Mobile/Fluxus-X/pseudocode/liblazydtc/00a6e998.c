/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6e998
 */

undefined4
EVP_PKEY_digestsign_supports_digest
          (undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  undefined4 uVar1;
  long lVar2;
  
  lVar2 = EVP_MD_CTX_new();
  if (lVar2 == 0) {
    uVar1 = 0xffffffff;
  }
  else {
    ERR_set_mark();
    uVar1 = EVP_DigestSignInit_ex(lVar2,0,param_3,param_2,param_4,param_1,0);
    ERR_pop_to_mark();
    EVP_MD_CTX_free(lVar2);
  }
  return uVar1;
}

