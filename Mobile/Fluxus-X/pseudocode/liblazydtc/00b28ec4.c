/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b28ec4
 */

bool FUN_00b28ec4(long param_1,undefined8 param_2,int param_3)

{
  long lVar1;
  int iVar2;
  
  lVar1 = param_1 + 0xc0;
  if (((*(byte *)(param_1 + 0x6c) >> 1 & 1) == 0) && (*(int *)(param_1 + 0x40) - 1U < 2)) {
    iVar2 = ossl_aria_set_decrypt_key(param_2,param_3 << 3,lVar1);
  }
  else {
    iVar2 = ossl_aria_set_encrypt_key(param_2,param_3 << 3,lVar1);
  }
  if (iVar2 < 0) {
    ERR_new();
    ERR_set_debug("providers/implementations/ciphers/cipher_aria_hw.c",0x19,"cipher_hw_aria_initkey"
                 );
    ERR_set_error(0x39,0x65,0);
  }
  else {
    *(long *)(param_1 + 0xb0) = lVar1;
    *(code **)(param_1 + 0x30) = ossl_aria_encrypt;
  }
  return iVar2 >= 0;
}

