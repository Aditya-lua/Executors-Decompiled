/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b09d8c
 */

bool X509_STORE_load_file(X509_STORE *param_1,long param_2)

{
  bool bVar1;
  int iVar2;
  X509_LOOKUP_METHOD *m;
  X509_LOOKUP *pXVar3;
  
  if (param_2 == 0) {
    bVar1 = false;
  }
  else {
    m = X509_LOOKUP_file();
    pXVar3 = X509_STORE_add_lookup(param_1,m);
    bVar1 = false;
    if (pXVar3 != (X509_LOOKUP *)0x0) {
      iVar2 = X509_LOOKUP_ctrl_ex(pXVar3,1,param_2,1,0,0,0);
      bVar1 = 0 < iVar2;
    }
  }
  return bVar1;
}

