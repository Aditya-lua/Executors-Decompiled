/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b09c50
 */

undefined8
X509_STORE_set_default_paths_ex(X509_STORE *param_1,undefined8 param_2,undefined8 param_3)

{
  int iVar1;
  X509_LOOKUP_METHOD *pXVar2;
  X509_LOOKUP *pXVar3;
  undefined8 uVar4;
  
  pXVar2 = X509_LOOKUP_file();
  pXVar3 = X509_STORE_add_lookup(param_1,pXVar2);
  uVar4 = 0;
  if (pXVar3 != (X509_LOOKUP *)0x0) {
    X509_LOOKUP_ctrl_ex(pXVar3,1,0,3,0,param_2,param_3);
    pXVar2 = X509_LOOKUP_hash_dir();
    pXVar3 = X509_STORE_add_lookup(param_1,pXVar2);
    uVar4 = 0;
    if (pXVar3 != (X509_LOOKUP *)0x0) {
      iVar1 = X509_LOOKUP_ctrl(pXVar3,2,(char *)0x0,3,(char **)0x0);
      pXVar2 = (X509_LOOKUP_METHOD *)X509_LOOKUP_store(iVar1);
      pXVar3 = X509_STORE_add_lookup(param_1,pXVar2);
      uVar4 = 0;
      if (pXVar3 != (X509_LOOKUP *)0x0) {
        X509_LOOKUP_ctrl_ex(pXVar3,3,0,0,0,param_2,param_3);
        ERR_clear_error();
        uVar4 = 1;
      }
    }
  }
  return uVar4;
}

