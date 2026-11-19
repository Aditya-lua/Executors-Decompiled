/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b21f94
 */

bool ossl_sm2_plaintext_size(uchar *param_1,long param_2,long *param_3)

{
  ASN1_VALUE *val;
  uchar *local_18;
  
  local_18 = param_1;
  val = ASN1_item_d2i((ASN1_VALUE **)0x0,&local_18,param_2,(ASN1_ITEM *)&DAT_00c8cc88);
  if (val == (ASN1_VALUE *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/sm2/sm2_crypt.c",0x5a,"ossl_sm2_plaintext_size");
    ERR_set_error(0x35,0x68,0);
  }
  else {
    *param_3 = (long)**(int **)(val + 0x18);
    ASN1_item_free(val,(ASN1_ITEM *)&DAT_00c8cc88);
  }
  return val != (ASN1_VALUE *)0x0;
}

