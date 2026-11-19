/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c5e48
 */

undefined8 tls13_set_encoded_pub_key(undefined8 param_1,char *param_2,ulong param_3)

{
  int iVar1;
  undefined8 uVar2;
  
  iVar1 = EVP_PKEY_is_a(param_1,&DAT_002a3a5a);
  if (iVar1 == 0) {
    iVar1 = EVP_PKEY_is_a(param_1,&DAT_002cf33a);
    if ((iVar1 == 0) || ((2 < param_3 && (*param_2 == '\x04')))) goto LAB_009c5ec0;
  }
  else {
    iVar1 = EVP_PKEY_get_bits(param_1);
    if ((0 < iVar1) && ((ulong)(long)iVar1 >> 3 == param_3)) {
LAB_009c5ec0:
      uVar2 = EVP_PKEY_set1_encoded_public_key(param_1,param_2,param_3);
      return uVar2;
    }
  }
  return 0;
}

