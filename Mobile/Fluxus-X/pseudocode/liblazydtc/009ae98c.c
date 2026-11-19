/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ae98c
 */

undefined8 FUN_009ae98c(undefined8 *param_1,char *param_2)

{
  int iVar1;
  void *arg;
  undefined8 uVar2;
  
  arg = (void *)OPENSSL_sk_new_null();
  uVar2 = 0;
  if (arg != (void *)0x0) {
    if ((*param_2 != '\0') &&
       ((iVar1 = CONF_parse_list(param_2,0x3a,1,FUN_009b14ec,arg), iVar1 < 1 ||
        (iVar1 = OPENSSL_sk_num(arg), iVar1 == 0)))) {
      ERR_new();
      ERR_set_debug("ssl/ssl_ciph.c",0x53f,"set_ciphersuites");
      ERR_set_error(0x14,0xb9,0);
      OPENSSL_sk_free(arg);
      return 0;
    }
    OPENSSL_sk_free(*param_1);
    uVar2 = 1;
    *param_1 = arg;
  }
  return uVar2;
}

