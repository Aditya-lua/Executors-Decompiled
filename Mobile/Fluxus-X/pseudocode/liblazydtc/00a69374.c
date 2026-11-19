/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a69374
 */

EVP_CIPHER * EVP_get_cipherbyname(char *name)

{
  EVP_CIPHER *pEVar1;
  int iVar2;
  undefined8 uVar3;
  EVP_CIPHER *local_28;
  
  iVar2 = OPENSSL_init_crypto(4,0);
  if (iVar2 != 0) {
    local_28 = (EVP_CIPHER *)OBJ_NAME_get(name,2);
    if (local_28 != (EVP_CIPHER *)0x0) {
      return local_28;
    }
    uVar3 = ossl_namemap_stored();
    iVar2 = ossl_namemap_name2num(uVar3,name);
    if (iVar2 != 0) {
      iVar2 = ossl_namemap_doall_names(uVar3,iVar2,&LAB_00a6948c,&local_28);
      pEVar1 = (EVP_CIPHER *)0x0;
      if (iVar2 != 0) {
        pEVar1 = local_28;
      }
      return pEVar1;
    }
  }
  return (EVP_CIPHER *)0x0;
}

