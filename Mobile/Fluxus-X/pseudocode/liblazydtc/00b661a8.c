/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b661a8
 */

undefined8 ossl_cipher_generic_initiv(void *param_1,void *param_2,ulong param_3)

{
  undefined8 uVar1;
  
  if ((param_3 < 0x11) && (*(ulong *)((long)param_1 + 0x50) == param_3)) {
    *(byte *)((long)param_1 + 0x6c) = *(byte *)((long)param_1 + 0x6c) | 4;
    memcpy((void *)((long)param_1 + 0x20),param_2,param_3);
    memcpy(param_1,param_2,param_3);
    uVar1 = 1;
  }
  else {
    ERR_new();
    ERR_set_debug("providers/implementations/ciphers/ciphercommon.c",0x2aa,
                  "ossl_cipher_generic_initiv");
    ERR_set_error(0x39,0x6d,0);
    uVar1 = 0;
  }
  return uVar1;
}

