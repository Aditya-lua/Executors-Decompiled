/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b789c
 */

bool SSL_CTX_set_default_verify_store(undefined8 *param_1)

{
  X509_LOOKUP_METHOD *m;
  X509_LOOKUP *pXVar1;
  X509_STORE *v;
  
  v = (X509_STORE *)param_1[5];
  m = (X509_LOOKUP_METHOD *)X509_LOOKUP_store();
  pXVar1 = X509_STORE_add_lookup(v,m);
  if (pXVar1 != (X509_LOOKUP *)0x0) {
    ERR_set_mark();
    X509_LOOKUP_ctrl_ex(pXVar1,3,0,0,0,*param_1,param_1[0x88]);
    ERR_pop_to_mark();
  }
  return pXVar1 != (X509_LOOKUP *)0x0;
}

