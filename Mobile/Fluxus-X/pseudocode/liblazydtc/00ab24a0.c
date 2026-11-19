/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab24a0
 */

int i2a_ASN1_STRING(BIO *bp,ASN1_STRING *a,int type)

{
  int iVar1;
  int iVar2;
  ulong uVar3;
  char local_54;
  char local_53;
  
  if (a != (ASN1_STRING *)0x0) {
    if (a->length == 0) {
      iVar2 = BIO_write(bp,&DAT_002cb723,1);
      if (iVar2 == 1) {
        return 1;
      }
      return -1;
    }
    if (0 < a->length) {
      uVar3 = 0;
      iVar2 = 0;
      while( true ) {
        if ((uVar3 != 0) &&
           (iVar1 = (int)((uVar3 & 0xffffffff) * 0xd41d41d5 >> 0x20),
           (iVar1 + ((uint)((int)uVar3 - iVar1) >> 1) >> 5) * 0x23 == (int)uVar3)) {
          iVar1 = BIO_write(bp,&DAT_002cbf79,2);
          if (iVar1 != 2) {
            return -1;
          }
          iVar2 = iVar2 + 2;
        }
        local_54 = "0123456789ABCDEF"[a->data[uVar3] >> 4];
        local_53 = "0123456789ABCDEF"[(ulong)a->data[uVar3] & 0xf];
        iVar1 = BIO_write(bp,&local_54,2);
        if (iVar1 != 2) break;
        uVar3 = uVar3 + 1;
        iVar2 = iVar2 + 2;
        if ((long)a->length <= (long)uVar3) {
          return iVar2;
        }
      }
      return -1;
    }
  }
  return 0;
}

