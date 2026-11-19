/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a92c7c
 */

undefined8 FUN_00a92c7c(undefined8 param_1,const_DES_cblock *param_2)

{
  long lVar1;
  DES_key_schedule *schedule;
  
  lVar1 = EVP_CIPHER_CTX_get_cipher_data();
  *(undefined8 *)(lVar1 + 0x80) = 0;
  schedule = (DES_key_schedule *)EVP_CIPHER_CTX_get_cipher_data(param_1);
  DES_set_key_unchecked(param_2,schedule);
  return 1;
}

