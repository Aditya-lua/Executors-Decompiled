/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a8fbc
 */

void ssl3_get_cipher_by_id(undefined4 param_1)

{
  long lVar1;
  undefined1 auStack_60 [24];
  undefined4 local_48;
  
  local_48 = param_1;
  lVar1 = OBJ_bsearch_ssl_cipher_id(auStack_60,&DAT_00cc4e30,5);
  if ((lVar1 == 0) && (lVar1 = OBJ_bsearch_ssl_cipher_id(auStack_60,&DAT_00cc4fc0,0xa7), lVar1 == 0)
     ) {
    OBJ_bsearch_ssl_cipher_id(auStack_60,&DAT_00cc83f0,2);
  }
  return;
}

