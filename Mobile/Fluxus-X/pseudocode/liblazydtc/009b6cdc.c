/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b6cdc
 */

int SSL_get_error(SSL *s,int ret_code)

{
  int iVar1;
  int iVar2;
  int iVar3;
  ulong uVar4;
  BIO *b;
  
  if (0 < ret_code) {
    return 0;
  }
  uVar4 = ERR_peek_error();
  if (uVar4 != 0) {
    iVar2 = 5;
    if ((uVar4 & 0x7f800000) != 0x1000000 && -1 < (int)uVar4) {
      iVar2 = 1;
    }
    return iVar2;
  }
  iVar2 = s->rwstate;
  if (iVar2 == 3) {
    b = s->rbio;
    iVar2 = BIO_test_flags(b,1);
    if (iVar2 != 0) {
      return 2;
    }
    iVar2 = BIO_test_flags(b,2);
    if (iVar2 == 0) {
      iVar2 = BIO_test_flags(b,4);
      if (iVar2 != 0) goto LAB_009b6db4;
      iVar2 = s->rwstate;
      goto LAB_009b6d70;
    }
LAB_009b6d8c:
    iVar2 = 3;
  }
  else {
LAB_009b6d70:
    if (iVar2 == 2) {
      b = s->wbio;
      iVar2 = BIO_test_flags(b,2);
      if (iVar2 != 0) goto LAB_009b6d8c;
      iVar2 = BIO_test_flags(b,1);
      if (iVar2 != 0) {
        return 2;
      }
      iVar2 = BIO_test_flags(b,4);
      if (iVar2 != 0) {
LAB_009b6db4:
        iVar3 = BIO_get_retry_reason(b);
        iVar2 = 8;
        if (iVar3 != 3) {
          iVar2 = 5;
        }
        iVar1 = 7;
        if (iVar3 != 2) {
          iVar1 = iVar2;
        }
        return iVar1;
      }
      iVar2 = s->rwstate;
    }
    if (iVar2 - 4U < 5) {
      iVar2 = *(int *)(&DAT_0074c4b0 + (long)(int)(iVar2 - 4U) * 4);
    }
    else if ((((byte)s->shutdown >> 1 & 1) == 0) || (*(int *)&(s->ex_data).field_0xc != 0)) {
      iVar2 = 5;
    }
    else {
      iVar2 = 6;
    }
  }
  return iVar2;
}

