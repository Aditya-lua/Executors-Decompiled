/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ef914
 */

void * ASN1_item_dup(ASN1_ITEM *it,void *x)

{
  int iVar1;
  void *pvVar2;
  code *pcVar3;
  bool bVar4;
  undefined8 local_60;
  undefined8 uStack_58;
  void *local_50;
  uchar *local_48;
  uchar *local_40;
  ASN1_VALUE *local_38;
  
  local_40 = (uchar *)0x0;
  local_60 = 0;
  uStack_58 = 0;
  if (x == (void *)0x0) {
    return (void *)0x0;
  }
  local_38 = x;
  if ((byte)it->itype < 7) {
    bVar4 = false;
    pcVar3 = (code *)0x0;
    if ((1 << (ulong)((byte)it->itype & 0x1f) & 0x46U) != 0) {
      if (it->funcs == (void *)0x0) goto LAB_009ef9c8;
      pcVar3 = *(code **)((long)it->funcs + 0x18);
      if (pcVar3 == (code *)0x0) {
        bVar4 = false;
      }
      else {
        iVar1 = (*pcVar3)(0xe,&local_38,it,0);
        if (((iVar1 == 0) || (iVar1 = (*pcVar3)(0x10,&local_38,it,&uStack_58), iVar1 == 0)) ||
           (iVar1 = (*pcVar3)(0x11,&local_38,it,&local_60), iVar1 == 0)) goto LAB_009efa50;
        bVar4 = true;
      }
    }
  }
  else {
LAB_009ef9c8:
    bVar4 = false;
    pcVar3 = (code *)0x0;
  }
  iVar1 = ASN1_item_i2d(local_38,&local_40,it);
  if (local_40 == (uchar *)0x0) {
    ERR_new(iVar1);
    ERR_set_debug("crypto/asn1/a_dup.c",0x51,"ASN1_item_dup");
    ERR_set_error(0xd,0xc0100,0);
    return (void *)0x0;
  }
  local_48 = local_40;
  pvVar2 = (void *)ASN1_item_d2i_ex(0,&local_48,(long)iVar1,it,uStack_58,local_60);
  local_50 = pvVar2;
  CRYPTO_free(local_40);
  if (!bVar4) {
    return pvVar2;
  }
  iVar1 = (*pcVar3)(0xf,&local_50,it,local_38);
  if (iVar1 != 0) {
    return local_50;
  }
LAB_009efa50:
  ERR_new();
  ERR_set_debug("crypto/asn1/a_dup.c",0x5f,"ASN1_item_dup");
  ERR_set_error(0xd,100,"Type=%s",it->sname);
  return (void *)0x0;
}

