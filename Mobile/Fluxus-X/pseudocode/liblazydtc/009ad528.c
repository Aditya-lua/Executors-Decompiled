/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ad528
 */

int SSL_add_dir_cert_subjects_to_stack(stack_st_X509_NAME *stackCAs,char *dir)

{
  int iVar1;
  int iVar2;
  char *__s;
  size_t sVar3;
  size_t sVar4;
  int *piVar5;
  undefined8 uVar6;
  stat asStack_4c8 [8];
  long local_48;
  
  local_48 = 0;
  __s = (char *)OPENSSL_DIR_read(&local_48);
  if (__s != (char *)0x0) {
    do {
      sVar3 = strlen(dir);
      sVar4 = strlen(__s);
      if (0x400 < sVar3 + sVar4 + 2) {
        ERR_new();
        ERR_set_debug("ssl/ssl_cert.c",0x305,"SSL_add_dir_cert_subjects_to_stack");
        uVar6 = 0x10e;
        goto LAB_009ad698;
      }
      iVar1 = BIO_snprintf((char *)(asStack_4c8[0].__unused + 1),0x400,"%s/%s",dir,__s);
      iVar2 = stat((char *)(asStack_4c8[0].__unused + 1),asStack_4c8);
      if (((iVar2 != 0) || (((uint)asStack_4c8[0].st_nlink & 0xf000) != 0x4000)) &&
         ((0x3fe < iVar1 - 1U ||
          (iVar1 = SSL_add_file_cert_subjects_to_stack
                             (stackCAs,(char *)(asStack_4c8[0].__unused + 1)), iVar1 == 0))))
      goto LAB_009ad6a0;
      __s = (char *)OPENSSL_DIR_read(&local_48,dir);
    } while (__s != (char *)0x0);
  }
  piVar5 = (int *)__errno();
  if (*piVar5 == 0) {
    iVar1 = 1;
  }
  else {
    ERR_new();
    ERR_set_debug("ssl/ssl_cert.c",0x319,"SSL_add_dir_cert_subjects_to_stack");
    ERR_set_error(2,*piVar5,"calling OPENSSL_dir_read(%s)",dir);
    ERR_new();
    ERR_set_debug("ssl/ssl_cert.c",0x31b,"SSL_add_dir_cert_subjects_to_stack");
    uVar6 = 0x80002;
LAB_009ad698:
    ERR_set_error(0x14,uVar6,0);
LAB_009ad6a0:
    iVar1 = 0;
  }
  if (local_48 != 0) {
    OPENSSL_DIR_end(&local_48);
  }
  return iVar1;
}

