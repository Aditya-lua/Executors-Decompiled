/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1fd28
 */

long ossl_bio_prov_init_bio_method(void)

{
  int iVar1;
  long lVar2;
  
  lVar2 = BIO_meth_new(0x419,"BIO to Core filter");
  if (((((lVar2 == 0) || (iVar1 = BIO_meth_set_write_ex(lVar2,&LAB_00b1fdf4), iVar1 == 0)) ||
       (iVar1 = BIO_meth_set_read_ex(lVar2,&LAB_00b1fe50), iVar1 == 0)) ||
      ((iVar1 = BIO_meth_set_puts(lVar2,&LAB_00b1feac), iVar1 == 0 ||
       (iVar1 = BIO_meth_set_gets(lVar2,FUN_00b1feec), iVar1 == 0)))) ||
     ((iVar1 = BIO_meth_set_ctrl(lVar2,&LAB_00b1ff34), iVar1 == 0 ||
      ((iVar1 = BIO_meth_set_create(lVar2,FUN_00b1ff8c), iVar1 == 0 ||
       (iVar1 = BIO_meth_set_destroy(lVar2,&LAB_00b1ffa8), iVar1 == 0)))))) {
    BIO_meth_free(lVar2);
    lVar2 = 0;
  }
  return lVar2;
}

