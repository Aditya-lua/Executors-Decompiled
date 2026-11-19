/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1ffe8
 */

BIO * ossl_bio_new_from_core_bio(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  BIO_METHOD *type;
  BIO *a;
  
  type = (BIO_METHOD *)ossl_prov_ctx_get0_core_bio_method();
  if (type != (BIO_METHOD *)0x0) {
    a = BIO_new(type);
    if (a == (BIO *)0x0) {
      return (BIO *)0x0;
    }
    if ((DAT_00d237f0 != (code *)0x0) && (iVar1 = (*DAT_00d237f0)(param_2), iVar1 != 0)) {
      BIO_set_data(a,param_2);
      return a;
    }
    BIO_free(a);
  }
  return (BIO *)0x0;
}

