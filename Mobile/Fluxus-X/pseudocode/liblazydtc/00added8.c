/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00added8
 */

uchar * SHA1(uchar *d,size_t n,uchar *md)

{
  uchar *puVar1;
  uchar *puVar2;
  int iVar3;
  
  puVar1 = &DAT_00d22248;
  if (md != (uchar *)0x0) {
    puVar1 = md;
  }
  iVar3 = EVP_Q_digest(0,&DAT_002d142e,0,d,n,puVar1,0);
  puVar2 = (uchar *)0x0;
  if (iVar3 != 0) {
    puVar2 = puVar1;
  }
  return puVar2;
}

