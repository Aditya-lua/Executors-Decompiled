/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a972e8
 */

undefined8 FUN_00a972e8(undefined8 param_1,uchar *param_2)

{
  int len;
  long lVar1;
  int *piVar2;
  
  lVar1 = EVP_CIPHER_CTX_get_cipher_data();
  len = EVP_CIPHER_CTX_get_key_length(param_1);
  piVar2 = (int *)EVP_CIPHER_CTX_get_cipher_data(param_1);
  RC2_set_key((RC2_KEY *)(lVar1 + 4),len,param_2,*piVar2);
  return 1;
}

