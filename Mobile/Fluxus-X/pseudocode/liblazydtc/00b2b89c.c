/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b2b89c
 */

undefined4 ossl_cipher_cbc_cts_mode_name2id(undefined8 param_1)

{
  int iVar1;
  long lVar2;
  
  iVar1 = OPENSSL_strcasecmp(param_1,&DAT_002a30a2);
  if (iVar1 == 0) {
    lVar2 = 0;
  }
  else {
    iVar1 = OPENSSL_strcasecmp(param_1,&DAT_002ce7fb);
    if (iVar1 == 0) {
      lVar2 = 1;
    }
    else {
      iVar1 = OPENSSL_strcasecmp(param_1,&DAT_002d6b26);
      if (iVar1 != 0) {
        return 0xffffffff;
      }
      lVar2 = 2;
    }
  }
  return (&DAT_00c93988)[lVar2 * 4];
}

