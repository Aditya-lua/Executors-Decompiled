/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b09f24
 */

undefined8
X509_STORE_load_locations_ex
          (X509_STORE *param_1,long param_2,char *param_3,undefined8 param_4,undefined8 param_5)

{
  int iVar1;
  X509_LOOKUP_METHOD *pXVar2;
  X509_LOOKUP *pXVar3;
  undefined8 uVar4;
  
  if (param_2 == 0 && param_3 == (char *)0x0) {
    return 0;
  }
  if (param_2 == 0) {
LAB_00b09f94:
    if (param_3 != (char *)0x0) {
      pXVar2 = X509_LOOKUP_hash_dir();
      pXVar3 = X509_STORE_add_lookup(param_1,pXVar2);
      if (pXVar3 == (X509_LOOKUP *)0x0) {
        return 0;
      }
      iVar1 = X509_LOOKUP_ctrl(pXVar3,2,param_3,1,(char **)0x0);
      if (iVar1 < 1) goto LAB_00b09fd0;
    }
    uVar4 = 1;
  }
  else {
    pXVar2 = X509_LOOKUP_file();
    pXVar3 = X509_STORE_add_lookup(param_1,pXVar2);
    if (pXVar3 == (X509_LOOKUP *)0x0) {
      return 0;
    }
    iVar1 = X509_LOOKUP_ctrl_ex(pXVar3,1,param_2,1,0,param_4,param_5);
    if (0 < iVar1) goto LAB_00b09f94;
LAB_00b09fd0:
    uVar4 = 0;
  }
  return uVar4;
}

