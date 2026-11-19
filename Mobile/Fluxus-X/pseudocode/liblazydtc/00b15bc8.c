/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b15bc8
 */

void * X509_CRL_load_http(undefined8 param_1,undefined8 param_2,undefined8 param_3,
                         undefined4 param_4)

{
  ASN1_ITEM *it;
  BIO *in;
  void *pvVar1;
  
  it = (ASN1_ITEM *)X509_CRL_it();
  in = (BIO *)OSSL_HTTP_get(param_1,0,0,param_2,param_3,0,0,0x400,0,0,1,0x19000,param_4);
  pvVar1 = ASN1_item_d2i_bio(it,in,(void *)0x0);
  BIO_free(in);
  return pvVar1;
}

