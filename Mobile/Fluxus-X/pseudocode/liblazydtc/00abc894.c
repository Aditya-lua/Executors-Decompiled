/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abc894
 */

void * PKCS12_SAFEBAG_get1_crl(undefined8 *param_1)

{
  int iVar1;
  void *pvVar2;
  ASN1_ITEM *it;
  ASN1_STRING *oct;
  
  iVar1 = OBJ_obj2nid((ASN1_OBJECT *)*param_1);
  pvVar2 = (void *)0x0;
  if (iVar1 == 0x99) {
    iVar1 = OBJ_obj2nid(*(ASN1_OBJECT **)param_1[1]);
    pvVar2 = (void *)0x0;
    if (iVar1 == 0xa0) {
      oct = *(ASN1_STRING **)(param_1[1] + 8);
      it = (ASN1_ITEM *)X509_CRL_it(0);
      pvVar2 = ASN1_item_unpack(oct,it);
    }
  }
  return pvVar2;
}

