/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1051c
 */

ASN1_STRING * ASN1_STRING_set_by_NID(ASN1_STRING **out,uchar *in,int inlen,int inform,int nid)

{
  ASN1_STRING **out_00;
  ulong uVar1;
  int iVar2;
  void *pvVar3;
  ASN1_STRING *pAVar4;
  ASN1_STRING *local_70;
  int local_68 [10];
  
  out_00 = &local_70;
  if (out != (ASN1_STRING **)0x0) {
    out_00 = out;
  }
  local_70 = (ASN1_STRING *)0x0;
  OPENSSL_init_crypto(0x40,0);
  local_68[0] = nid;
  if ((DAT_00d21958 == 0) || (iVar2 = OPENSSL_sk_find(DAT_00d21958,local_68), iVar2 < 0)) {
    pvVar3 = OBJ_bsearch_(local_68,&DAT_00752178,0x1c,0x28,(cmp *)&LAB_00a108e8);
  }
  else {
    pvVar3 = (void *)OPENSSL_sk_value(DAT_00d21958,iVar2);
  }
  if (pvVar3 == (void *)0x0) {
    iVar2 = ASN1_mbstring_copy(out_00,in,inlen,inform,DAT_00cc87e0 & 0x2806);
  }
  else {
    uVar1 = DAT_00cc87e0;
    if ((*(ulong *)((long)pvVar3 + 0x20) & 2) != 0) {
      uVar1 = 0xffffffffffffffff;
    }
    iVar2 = ASN1_mbstring_ncopy(out_00,in,inlen,inform,uVar1 & *(ulong *)((long)pvVar3 + 0x18),
                                *(long *)((long)pvVar3 + 8),*(long *)((long)pvVar3 + 0x10));
  }
  if (iVar2 < 1) {
    pAVar4 = (ASN1_STRING *)0x0;
  }
  else {
    pAVar4 = *out_00;
  }
  return pAVar4;
}

