/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1770c
 */

bool OSSL_HTTP_REQ_CTX_set1_req
               (undefined8 param_1,undefined8 param_2,undefined8 param_3,long param_4)

{
  bool bVar1;
  int iVar2;
  BIO *a;
  
  if (param_4 == 0) {
    a = (BIO *)0x0;
  }
  else {
    a = (BIO *)ASN1_item_i2d_mem_bio(param_3,param_4);
    if (a == (BIO *)0x0) {
      bVar1 = false;
      goto LAB_00b17760;
    }
  }
  iVar2 = FUN_00b1777c(param_1,param_2,a);
  bVar1 = iVar2 != 0;
LAB_00b17760:
  BIO_free(a);
  return bVar1;
}

