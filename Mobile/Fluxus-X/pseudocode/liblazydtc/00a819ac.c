/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a819ac
 */

BIO * BIO_new_from_core_bio(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  long *plVar2;
  BIO *a;
  
  plVar2 = (long *)ossl_lib_ctx_get_data(param_1,0x11,&DAT_00c61408);
  if ((plVar2 != (long *)0x0) && ((plVar2[1] != 0 || (*plVar2 != 0)))) {
    a = (BIO *)BIO_new_ex(param_1,&DAT_00c613a8);
    if (a == (BIO *)0x0) {
      return (BIO *)0x0;
    }
    iVar1 = (*(code *)plVar2[5])(param_2);
    if (iVar1 != 0) {
      BIO_set_data(a,param_2);
      return a;
    }
    BIO_free(a);
  }
  return (BIO *)0x0;
}

