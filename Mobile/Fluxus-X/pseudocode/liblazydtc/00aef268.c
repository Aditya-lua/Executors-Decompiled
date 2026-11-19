/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aef268
 */

void ERR_print_errors_cb(cb *cb,void *u)

{
  char *pcVar1;
  int iVar2;
  long lVar3;
  char *ptr;
  size_t sVar4;
  char acStack_1090 [4096];
  byte local_90 [4];
  int local_8c;
  undefined8 local_88;
  char *local_80;
  char *pcStack_78;
  pthread_t local_70 [2];
  
  local_70[0] = CRYPTO_THREAD_get_current_id();
  do {
    lVar3 = ERR_get_error_all(&pcStack_78,&local_8c,&local_88,&local_80,local_90);
    if (lVar3 == 0) {
      return;
    }
    memset(acStack_1090,0,0x1000);
    if ((local_90[0] >> 1 & 1) == 0) {
      local_80 = "";
    }
    ptr = (char *)ossl_buf2hexstr_sep(local_70,8,0);
    pcVar1 = "<null>";
    if (ptr != (char *)0x0) {
      pcVar1 = ptr;
    }
    BIO_snprintf(acStack_1090,0x1000,"%s:",pcVar1);
    sVar4 = strlen(acStack_1090);
    iVar2 = (int)sVar4;
    ossl_err_string_int(lVar3,local_88,acStack_1090 + iVar2,0x1000 - (long)iVar2);
    sVar4 = strlen(acStack_1090 + iVar2);
    lVar3 = (long)((int)sVar4 + iVar2);
    BIO_snprintf(acStack_1090 + lVar3,0x1000 - lVar3,":%s:%d:%s\n",pcStack_78,local_8c,local_80);
    CRYPTO_free(ptr);
    sVar4 = strlen(acStack_1090);
    iVar2 = (*cb)(acStack_1090,sVar4,u);
  } while (0 < iVar2);
  return;
}

