/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b09e4c
 */

bool X509_STORE_load_store_ex
               (X509_STORE *param_1,long param_2,undefined8 param_3,undefined8 param_4)

{
  int iVar1;
  X509_LOOKUP_METHOD *m;
  X509_LOOKUP *pXVar2;
  
  if (param_2 != 0) {
    m = (X509_LOOKUP_METHOD *)X509_LOOKUP_store();
    pXVar2 = X509_STORE_add_lookup(param_1,m);
    if (pXVar2 != (X509_LOOKUP *)0x0) {
      iVar1 = X509_LOOKUP_ctrl_ex(pXVar2,3,param_2,0,0,param_3,param_4);
      return iVar1 != 0;
    }
  }
  return false;
}

