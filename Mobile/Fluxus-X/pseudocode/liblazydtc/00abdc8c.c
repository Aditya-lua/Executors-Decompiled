/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abdc8c
 */

void * ASN1_item_d2i_bio(ASN1_ITEM *it,BIO *in,void *x)

{
  BUF_MEM *a;
  int iVar1;
  void *pvVar2;
  char *local_38;
  BUF_MEM *local_28;
  
  local_28 = (BUF_MEM *)0x0;
  if (in == (BIO *)0x0) {
    pvVar2 = (void *)0x0;
  }
  else {
    iVar1 = asn1_d2i_read_bio(in,&local_28);
    a = local_28;
    if (iVar1 < 0) {
      pvVar2 = (void *)0x0;
    }
    else {
      local_38 = local_28->data;
      pvVar2 = (void *)ASN1_item_d2i_ex(x,&local_38,(long)iVar1,it,0,0);
    }
    BUF_MEM_free(a);
  }
  return pvVar2;
}

