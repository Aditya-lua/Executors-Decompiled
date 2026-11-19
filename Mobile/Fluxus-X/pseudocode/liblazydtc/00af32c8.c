/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af32c8
 */

int X509_signature_dump(BIO *bp,ASN1_STRING *sig,int indent)

{
  byte *pbVar1;
  char *param3;
  uint uVar2;
  int iVar3;
  uchar *puVar4;
  ulong uVar5;
  
  uVar2 = sig->length;
  puVar4 = sig->data;
  uVar5 = 0;
  do {
    if ((long)(int)uVar2 <= (long)uVar5) {
      iVar3 = BIO_write(bp,&DAT_002c4dae,1);
      return (uint)(iVar3 == 1);
    }
    if ((int)((uVar5 & 0xffffffff) / 0x12) * 0x12 == (int)uVar5) {
      if ((uVar5 != 0) && (iVar3 = BIO_write(bp,&DAT_002c4dae,1), iVar3 < 1)) {
        return 0;
      }
      iVar3 = BIO_indent(bp,indent,indent);
      if (iVar3 < 1) {
        return 0;
      }
    }
    pbVar1 = puVar4 + uVar5;
    param3 = "";
    if ((ulong)uVar2 - 1 != uVar5) {
      param3 = ":";
    }
    uVar5 = uVar5 + 1;
    iVar3 = BIO_printf(bp,"%02x%s",(uint)*pbVar1,param3);
  } while (0 < iVar3);
  return 0;
}

