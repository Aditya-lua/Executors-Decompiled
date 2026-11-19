/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a53ae0
 */

EVP_PKEY_METHOD * ENGINE_get_pkey_meth(ENGINE *e,int nid)

{
  int iVar1;
  EVP_PKEY_METHOD *local_18;
  
  if ((*(code **)(e + 0x48) == (code *)0x0) ||
     (iVar1 = (**(code **)(e + 0x48))(e,&local_18,0,nid), iVar1 == 0)) {
    ERR_new();
    ERR_set_debug("crypto/engine/tb_pkmeth.c",0x4f,"ENGINE_get_pkey_meth");
    ERR_set_error(0x26,0x65,0);
    local_18 = (EVP_PKEY_METHOD *)0x0;
  }
  return local_18;
}

