/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab1fd0
 */

int i2a_ASN1_INTEGER(BIO *bp,ASN1_INTEGER *a)

{
  int iVar1;
  uint uVar2;
  ulong uVar3;
  char local_54;
  char local_53;
  
  if (a == (ASN1_INTEGER *)0x0) {
    uVar2 = 0;
  }
  else {
    uVar2 = 0;
    if ((a->type & 0x100) != 0) {
      uVar2 = 1;
      iVar1 = BIO_write(bp,&DAT_002ccc8b,1);
      if (iVar1 != 1) {
        return -1;
      }
    }
    if (a->length == 0) {
      iVar1 = BIO_write(bp,&DAT_002bb974,2);
      uVar2 = uVar2 | 2;
      if (iVar1 != 2) {
        uVar2 = 0xffffffff;
      }
    }
    else if (0 < a->length) {
      uVar3 = 0;
      do {
        if ((uVar3 != 0) &&
           (iVar1 = (int)((uVar3 & 0xffffffff) * 0xd41d41d5 >> 0x20),
           (iVar1 + ((uint)((int)uVar3 - iVar1) >> 1) >> 5) * 0x23 == (int)uVar3)) {
          iVar1 = BIO_write(bp,&DAT_002cbf79,2);
          if (iVar1 != 2) {
            return -1;
          }
          uVar2 = uVar2 + 2;
        }
        local_54 = "0123456789ABCDEF"[a->data[uVar3] >> 4];
        local_53 = "0123456789ABCDEF"[(ulong)a->data[uVar3] & 0xf];
        iVar1 = BIO_write(bp,&local_54,2);
        if (iVar1 != 2) {
          return -1;
        }
        uVar3 = uVar3 + 1;
        uVar2 = uVar2 + 2;
      } while ((long)uVar3 < (long)a->length);
    }
  }
  return uVar2;
}

