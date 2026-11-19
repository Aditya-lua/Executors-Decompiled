/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ba158
 */

undefined8 SSL_CONF_CTX_finish(byte *param_1)

{
  int iVar1;
  long *plVar2;
  SSL *ssl;
  char *file;
  ulong uVar3;
  
  if (*(long *)(param_1 + 0x18) == 0) {
    if (*(long *)(param_1 + 0x20) == 0) goto LAB_009ba220;
    plVar2 = *(long **)(*(long *)(param_1 + 0x20) + 0x898);
  }
  else {
    plVar2 = *(long **)(*(long *)(param_1 + 0x18) + 0x158);
  }
  if ((plVar2 != (long *)0x0) && ((*param_1 >> 6 & 1) != 0)) {
    uVar3 = 0;
    do {
      plVar2 = plVar2 + 5;
      file = *(char **)(param_1 + uVar3 * 8 + 0x30);
      if (((file != (char *)0x0) && (*plVar2 == 0)) && ((*param_1 >> 5 & 1) != 0)) {
        if (*(SSL_CTX **)(param_1 + 0x18) == (SSL_CTX *)0x0) {
          iVar1 = 1;
          ssl = *(SSL **)(param_1 + 0x20);
        }
        else {
          iVar1 = SSL_CTX_use_PrivateKey_file(*(SSL_CTX **)(param_1 + 0x18),file,1);
          ssl = *(SSL **)(param_1 + 0x20);
        }
        if (ssl != (SSL *)0x0) {
          iVar1 = SSL_use_PrivateKey_file(ssl,file,1);
        }
        if (iVar1 < 1) {
          return 0;
        }
      }
      uVar3 = uVar3 + 1;
    } while (uVar3 < 9);
  }
LAB_009ba220:
  if (*(long *)(param_1 + 0xa8) != 0) {
    if (*(long *)(param_1 + 0x20) == 0) {
      if (*(long *)(param_1 + 0x18) == 0) {
        OPENSSL_sk_pop_free(*(long *)(param_1 + 0xa8),X509_NAME_free);
      }
      else {
        SSL_CTX_set0_CA_list();
      }
    }
    else {
      SSL_set0_CA_list();
    }
    param_1[0xa8] = 0;
    param_1[0xa9] = 0;
    param_1[0xaa] = 0;
    param_1[0xab] = 0;
    param_1[0xac] = 0;
    param_1[0xad] = 0;
    param_1[0xae] = 0;
    param_1[0xaf] = 0;
  }
  return 1;
}

