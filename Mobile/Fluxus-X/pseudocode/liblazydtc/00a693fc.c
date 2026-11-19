/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a693fc
 */

char * evp_get_cipherbyname_ex(undefined8 param_1,char *param_2)

{
  char *pcVar1;
  int iVar2;
  undefined8 uVar3;
  char *local_28;
  
  iVar2 = OPENSSL_init_crypto(4,0);
  if (iVar2 != 0) {
    local_28 = OBJ_NAME_get(param_2,2);
    if (local_28 != (char *)0x0) {
      return local_28;
    }
    uVar3 = ossl_namemap_stored(param_1);
    iVar2 = ossl_namemap_name2num(uVar3,param_2);
    if (iVar2 != 0) {
      iVar2 = ossl_namemap_doall_names(uVar3,iVar2,&LAB_00a6948c,&local_28);
      pcVar1 = (char *)0x0;
      if (iVar2 != 0) {
        pcVar1 = local_28;
      }
      return pcVar1;
    }
  }
  return (char *)0x0;
}

