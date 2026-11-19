/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00901f88
 */

/* cpr::sslctx_function_load_ca_cert_from_buffer(void*, void*, void*) */

void cpr::sslctx_function_load_ca_cert_from_buffer(void *param_1,void *param_2,void *param_3)

{
  long lVar1;
  int iVar2;
  BIO *bp;
  X509_STORE *ctx;
  undefined8 uVar3;
  char *__s;
  X509 *local_40;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  if ((param_2 == (void *)0x0) || (param_3 == (void *)0x0)) {
    __s = "Invalid callback arguments";
  }
  else {
    local_40 = (X509 *)0x0;
    bp = BIO_new_mem_buf(param_3,-1);
    PEM_read_bio_X509(bp,&local_40,(undefined1 *)0x0,(void *)0x0);
    if (local_40 == (X509 *)0x0) {
      __s = "PEM_read_bio_X509 failed";
    }
    else {
      ctx = SSL_CTX_get_cert_store(param_2);
      iVar2 = X509_STORE_add_cert(ctx,local_40);
      if (iVar2 != 0) {
        X509_free(local_40);
        BIO_free(bp);
        uVar3 = 0;
        goto LAB_00902034;
      }
      __s = "Error adding certificate";
    }
  }
  puts(__s);
  uVar3 = 0x2a;
LAB_00902034:
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar3);
  }
  return;
}

