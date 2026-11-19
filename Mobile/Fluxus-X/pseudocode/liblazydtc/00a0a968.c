/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0a968
 */

int BN_print(void *fp,BIGNUM *a)

{
  bool bVar1;
  bool bVar2;
  int iVar3;
  ulong uVar4;
  long lVar5;
  ulong uVar6;
  
  if ((a->neg != 0) && (iVar3 = BIO_write(fp,&DAT_002ccc8b,1), iVar3 != 1)) {
    return 0;
  }
  iVar3 = BN_is_zero(a);
  if ((iVar3 != 0) && (iVar3 = BIO_write(fp,&DAT_002cb723,1), iVar3 != 1)) {
    return 0;
  }
  if (0 < a->top) {
    bVar1 = false;
    lVar5 = (long)a->top;
    do {
      uVar6 = 0x3c;
      do {
        uVar4 = a->d[lVar5 + -1] >> (uVar6 & 0x3f);
        if ((uVar4 & 0xf) != 0 || bVar1) {
          bVar1 = true;
          iVar3 = BIO_write(fp,&UNK_00751f38 + ((uint)uVar4 & 0xf),1);
          if (iVar3 != 1) {
            return 0;
          }
        }
        bVar2 = uVar6 != 0;
        uVar6 = uVar6 - 4;
      } while (bVar2);
      bVar2 = 1 < lVar5;
      lVar5 = lVar5 + -1;
    } while (bVar2);
  }
  return 1;
}

