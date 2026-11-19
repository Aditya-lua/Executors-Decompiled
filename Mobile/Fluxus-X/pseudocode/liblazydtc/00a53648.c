/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a53648
 */

EVP_MD * ENGINE_get_digest(ENGINE *e,int nid)

{
  int iVar1;
  EVP_MD *local_18;
  
  if ((*(code **)(e + 0x40) == (code *)0x0) ||
     (iVar1 = (**(code **)(e + 0x40))(e,&local_18,0,nid), iVar1 == 0)) {
    ERR_new();
    ERR_set_debug("crypto/engine/tb_digest.c",0x4e,"ENGINE_get_digest");
    ERR_set_error(0x26,0x93,0);
    local_18 = (EVP_MD *)0x0;
  }
  return local_18;
}

