/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0ea2c
 */

int X509_cmp_time(ASN1_TIME *s,time_t *t)

{
  int iVar1;
  ASN1_TIME *a;
  uchar *puVar2;
  long lVar3;
  long lVar4;
  uint local_34;
  time_t local_28;
  
  if (s->type == 0x18) {
    if (s->length != 0xf) {
      return 0;
    }
  }
  else {
    if (s->type != 0x17) {
      return 0;
    }
    if (s->length != 0xd) {
      return 0;
    }
  }
  puVar2 = s->data;
  lVar4 = 0;
  do {
    iVar1 = ossl_ascii_isdigit(puVar2[lVar4]);
    if (iVar1 == 0) {
      return 0;
    }
    puVar2 = s->data;
    lVar4 = lVar4 + 1;
    lVar3 = (long)s->length + -1;
  } while (lVar4 < lVar3);
  iVar1 = 0;
  if (puVar2[lVar3] == 'Z') {
    if (t == (time_t *)0x0) {
      time(&local_28);
    }
    else {
      local_28 = *t;
    }
    a = ASN1_TIME_adj((ASN1_TIME *)0x0,local_28,0,0);
    if ((a == (ASN1_TIME *)0x0) || (iVar1 = ASN1_TIME_diff(&local_28,&local_34,s,a), iVar1 == 0)) {
      iVar1 = 0;
    }
    else {
      iVar1 = ((local_34 | (uint)local_28) >> 0x1e & 2) - 1;
    }
    ASN1_TIME_free(a);
  }
  return iVar1;
}

