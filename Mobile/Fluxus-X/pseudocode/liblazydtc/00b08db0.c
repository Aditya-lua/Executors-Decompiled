/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b08db0
 */

int X509_NAME_cmp(X509_NAME *a,X509_NAME *b)

{
  int iVar1;
  int iVar2;
  uint uVar3;
  
  if (b == (X509_NAME *)0x0) {
    return (uint)(a != (X509_NAME *)0x0);
  }
  if (a == (X509_NAME *)0x0) {
    return -1;
  }
  if ((((a->canon_enc == (uchar *)0x0) || (a->modified != 0)) &&
      (iVar1 = i2d_X509_NAME(a,(uchar **)0x0), iVar1 < 0)) ||
     (((b->canon_enc == (uchar *)0x0 || (b->modified != 0)) &&
      (iVar1 = i2d_X509_NAME(b,(uchar **)0x0), iVar1 < 0)))) {
LAB_00b08e68:
    uVar3 = 0xfffffffe;
  }
  else {
    iVar1 = a->canon_enclen;
    iVar2 = iVar1 - b->canon_enclen;
    if (iVar2 == 0 && iVar1 == 0) {
      return 0;
    }
    if (iVar2 == 0) {
      if ((a->canon_enc == (uchar *)0x0) || (b->canon_enc == (uchar *)0x0)) goto LAB_00b08e68;
      iVar2 = memcmp(a->canon_enc,b->canon_enc,(long)iVar1);
    }
    uVar3 = (uint)(0 < iVar2);
    if (iVar2 < 0) {
      uVar3 = 0xffffffff;
    }
  }
  return uVar3;
}

