/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1432c
 */

int X509_VERIFY_PARAM_set1(X509_VERIFY_PARAM *to,X509_VERIFY_PARAM *from)

{
  uint uVar1;
  int iVar2;
  
  if (to == (X509_VERIFY_PARAM *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/x509_vpm.c",0xe4,"X509_VERIFY_PARAM_set1");
    ERR_set_error(0xb,0xc0102,0);
    iVar2 = 0;
  }
  else {
    uVar1 = (uint)to->inh_flags;
    *(uint *)&to->inh_flags = uVar1 | 1;
    iVar2 = X509_VERIFY_PARAM_inherit(to,from);
    *(uint *)&to->inh_flags = uVar1;
  }
  return iVar2;
}

