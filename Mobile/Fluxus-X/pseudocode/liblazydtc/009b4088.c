/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b4088
 */

long SSL_get1_peer_certificate(long param_1)

{
  long lVar1;
  
  if ((param_1 == 0) || (*(long *)(param_1 + 0x918) == 0)) {
    lVar1 = 0;
  }
  else {
    lVar1 = *(long *)(*(long *)(param_1 + 0x918) + 0x2b8);
    if (lVar1 != 0) {
      X509_up_ref(lVar1);
    }
  }
  return lVar1;
}

