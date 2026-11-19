/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a532ec
 */

EVP_CIPHER * ENGINE_get_cipher(ENGINE *e,int nid)

{
  int iVar1;
  EVP_CIPHER *local_18;
  
  if ((*(code **)(e + 0x38) == (code *)0x0) ||
     (iVar1 = (**(code **)(e + 0x38))(e,&local_18,0,nid), iVar1 == 0)) {
    ERR_new();
    ERR_set_debug("crypto/engine/tb_cipher.c",0x4e,"ENGINE_get_cipher");
    ERR_set_error(0x26,0x92,0);
    local_18 = (EVP_CIPHER *)0x0;
  }
  return local_18;
}

