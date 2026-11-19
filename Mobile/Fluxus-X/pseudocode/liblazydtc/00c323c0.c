/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c323c0
 */

EVP_PKEY * ENGINE_load_private_key(ENGINE *e,char *key_id,UI_METHOD *ui_method,void *callback_data)

{
  EVP_PKEY *pEVar1;
  
  pEVar1 = ENGINE_load_private_key(e,key_id,ui_method,callback_data);
  return pEVar1;
}

