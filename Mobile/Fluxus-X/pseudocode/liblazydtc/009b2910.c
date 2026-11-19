/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b2910
 */

undefined8 SSL_dane_enable(long param_1,undefined8 param_2)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  
  if (*(char *)(*(long *)(param_1 + 0x9a8) + 0x3a8) == '\0') {
    ERR_new();
    ERR_set_debug("ssl/ssl_lib.c",0x41e,"SSL_dane_enable");
    uVar3 = 0xa7;
LAB_009b2980:
    ERR_set_error(0x14,uVar3,0);
    return 0;
  }
  if (*(long *)(param_1 + 0x4e8) != 0) {
    ERR_new();
    ERR_set_debug("ssl/ssl_lib.c",0x422,"SSL_dane_enable");
    uVar3 = 0xac;
    goto LAB_009b2980;
  }
  if ((*(long *)(param_1 + 0xa58) == 0) &&
     (lVar2 = (**(code **)(*(long *)(param_1 + 8) + 0x80))(param_1,0x37,0,param_2), lVar2 == 0)) {
    ERR_new();
    uVar3 = 0x42d;
  }
  else {
    iVar1 = X509_VERIFY_PARAM_set1_host(*(undefined8 *)(param_1 + 0x4d8),param_2,0);
    if (iVar1 != 0) {
      *(undefined8 *)(param_1 + 0x50c) = 0xffffffffffffffff;
      *(long *)(param_1 + 0x4e0) = *(long *)(param_1 + 0x9a8) + 0x398;
      lVar2 = OPENSSL_sk_new_null();
      *(long *)(param_1 + 0x4e8) = lVar2;
      if (lVar2 != 0) {
        return 1;
      }
      ERR_new();
      ERR_set_debug("ssl/ssl_lib.c",0x43e,"SSL_dane_enable");
      uVar3 = 0xc0100;
      goto LAB_009b2a70;
    }
    ERR_new();
    uVar3 = 0x434;
  }
  ERR_set_debug("ssl/ssl_lib.c",uVar3,"SSL_dane_enable");
  uVar3 = 0xcc;
LAB_009b2a70:
  ERR_set_error(0x14,uVar3,0);
  return 0xffffffff;
}

