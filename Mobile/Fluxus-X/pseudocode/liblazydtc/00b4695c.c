/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4695c
 */

undefined8 FUN_00b4695c(long param_1,undefined8 param_2)

{
  int iVar1;
  long lVar2;
  long lVar3;
  undefined8 uVar4;
  
  lVar2 = ossl_prov_cipher_cipher(param_1 + 8);
  if (lVar2 == 0) {
    lVar2 = 0x40;
  }
  else {
    iVar1 = EVP_CIPHER_get_key_length();
    lVar2 = (long)iVar1;
  }
  lVar3 = OSSL_PARAM_locate(param_2,&DAT_002d7e7d);
  if (lVar3 == 0) {
    return 0xfffffffe;
  }
  uVar4 = OSSL_PARAM_set_size_t(lVar3,lVar2);
  return uVar4;
}

