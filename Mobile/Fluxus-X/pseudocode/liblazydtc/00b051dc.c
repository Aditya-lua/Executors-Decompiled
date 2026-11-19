/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b051dc
 */

ASN1_OCTET_STRING * SXNET_get_id_INTEGER(SXNET *sx,ASN1_INTEGER *zone)

{
  int iVar1;
  int iVar2;
  undefined8 *puVar3;
  
  iVar1 = OPENSSL_sk_num(sx->ids);
  if (0 < iVar1) {
    iVar1 = 0;
    do {
      puVar3 = (undefined8 *)OPENSSL_sk_value(sx->ids,iVar1);
      iVar2 = ASN1_INTEGER_cmp((ASN1_INTEGER *)*puVar3,zone);
      if (iVar2 == 0) {
        return (ASN1_OCTET_STRING *)puVar3[1];
      }
      iVar1 = iVar1 + 1;
      iVar2 = OPENSSL_sk_num(sx->ids);
    } while (iVar1 < iVar2);
  }
  return (ASN1_OCTET_STRING *)0x0;
}

