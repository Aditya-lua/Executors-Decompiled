/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b0c24
 */

int SSL_COMP_add_compression_method(int id,COMP_METHOD *cm)

{
  int iVar1;
  int *ptr;
  undefined8 uVar2;
  
  if (cm == (COMP_METHOD *)0x0) {
    return 1;
  }
  iVar1 = COMP_get_type(cm);
  if (iVar1 == 0) {
    return 1;
  }
  if (id - 0xc1U < 0x3f) {
    ptr = CRYPTO_malloc(0x18,"ssl/ssl_ciph.c",0x7fc);
    if (ptr == (int *)0x0) {
      ERR_new();
      uVar2 = 0x7fe;
    }
    else {
      *ptr = id;
      *(COMP_METHOD **)(ptr + 4) = cm;
      CRYPTO_THREAD_run_once(&DAT_00d218c0,&LAB_009b1418);
      if (DAT_00d218b8 != 0) {
        iVar1 = OPENSSL_sk_find(DAT_00d218b8,ptr);
        if (-1 < iVar1) {
          CRYPTO_free(ptr);
          ERR_new();
          ERR_set_debug("ssl/ssl_ciph.c",0x807,"SSL_COMP_add_compression_method");
          uVar2 = 0x135;
          goto LAB_009b0d80;
        }
        if ((DAT_00d218b8 != 0) && (iVar1 = OPENSSL_sk_push(DAT_00d218b8,ptr), iVar1 != 0)) {
          return 0;
        }
      }
      CRYPTO_free(ptr);
      ERR_new();
      uVar2 = 0x80c;
    }
    ERR_set_debug("ssl/ssl_ciph.c",uVar2,"SSL_COMP_add_compression_method");
    uVar2 = 0xc0100;
  }
  else {
    ERR_new();
    ERR_set_debug("ssl/ssl_ciph.c",0x7f8,"SSL_COMP_add_compression_method");
    uVar2 = 0x133;
  }
LAB_009b0d80:
  ERR_set_error(0x14,uVar2,0);
  return 1;
}

