/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1892c
 */

int ASN1_bn_print(BIO *bp,char *number,BIGNUM *num,uchar *buf,int off)

{
  undefined1 *puVar1;
  char *param3;
  char *param3_00;
  int iVar2;
  int iVar3;
  ulong *puVar4;
  undefined1 *puVar5;
  uint uVar6;
  ulong param4;
  
  if (num == (BIGNUM *)0x0) {
    return 1;
  }
  iVar2 = BN_is_negative(num);
  param3 = "";
  if (iVar2 != 0) {
    param3 = "-";
  }
  iVar2 = BIO_indent(bp,off,0x80);
  if (iVar2 == 0) {
    return 0;
  }
  iVar2 = BN_is_zero(num);
  if (iVar2 != 0) {
    iVar2 = BIO_printf(bp,"%s 0\n",number);
LAB_00a18a08:
    return (uint)(0 < iVar2);
  }
  iVar2 = BN_num_bits(num);
  if (iVar2 < 0x41) {
    puVar4 = (ulong *)bn_get_words(num);
    param4 = *puVar4;
    puVar4 = (ulong *)bn_get_words(num);
    iVar2 = BIO_printf(bp,"%s %s%lu (%s0x%lx)\n",number,param3,param4,param3,*puVar4);
    goto LAB_00a18a08;
  }
  iVar3 = BN_num_bits(num);
  iVar2 = iVar3 + 0xe;
  if (-1 < iVar3 + 7) {
    iVar2 = iVar3 + 7;
  }
  iVar2 = (iVar2 >> 3) + 1;
  puVar5 = CRYPTO_malloc(iVar2,"crypto/asn1/t_pkey.c",0x49);
  if (puVar5 != (undefined1 *)0x0) {
    param3_00 = " (Negative)";
    if (*param3 != '-') {
      param3_00 = "";
    }
    *puVar5 = 0;
    iVar3 = BIO_printf(bp,"%s%s\n",number,param3_00);
    if (0 < iVar3) {
      iVar3 = BN_bn2bin(num,puVar5 + 1);
      puVar1 = puVar5;
      if (-1 < (char)puVar5[1]) {
        puVar1 = puVar5 + 1;
      }
      iVar3 = ASN1_buf_print(bp,puVar1,(long)(int)(iVar3 + (uint)((byte)puVar5[1] >> 7)),off + 4);
      uVar6 = (uint)(iVar3 != 0);
      goto LAB_00a18ae0;
    }
  }
  uVar6 = 0;
LAB_00a18ae0:
  CRYPTO_clear_free(puVar5,(long)iVar2,"crypto/asn1/t_pkey.c",0x5b);
  return uVar6;
}

