/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b08fc4
 */

int X509_CRL_match(X509_CRL *a,X509_CRL *b)

{
  int iVar1;
  uint uVar2;
  
  if ((*(byte *)((long)&a[1].sig_alg + 6) >> 4 & 1) != 0) {
    return -2;
  }
  if ((*(byte *)((long)&b[1].sig_alg + 6) >> 4 & 1) != 0) {
    return -2;
  }
  iVar1 = memcmp(&a[1].base_crl_number,&b[1].base_crl_number,0x14);
  uVar2 = (uint)(0 < iVar1);
  if (iVar1 < 0) {
    uVar2 = 0xffffffff;
  }
  return uVar2;
}

