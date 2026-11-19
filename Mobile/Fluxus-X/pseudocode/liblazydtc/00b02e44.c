/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b02e44
 */

int X509_check_ca(X509 *x)

{
  uint uVar1;
  int iVar2;
  uint uVar3;
  
  iVar2 = ossl_x509v3_cache_extensions();
  uVar3 = 0;
  if ((iVar2 != 0) &&
     ((uVar1 = *(uint *)&x[1].name, (uVar1 >> 1 & 1) == 0 ||
      (uVar3 = 0, (*(byte *)((long)&x[1].name + 4) >> 2 & 1) != 0)))) {
    if ((uVar1 & 1) == 0) {
      uVar3 = 3;
      if (((uVar1 & 0x2040) != 0x2040) && (uVar3 = 4, (uVar1 >> 1 & 1) == 0)) {
        if (((uVar1 >> 3 & 1) == 0) || (((ulong)x[1].ex_data.sk & 0x700000000) == 0)) {
          uVar3 = 0;
        }
        else {
          uVar3 = 5;
        }
      }
    }
    else {
      uVar3 = uVar1 >> 4 & 1;
    }
  }
  return uVar3;
}

