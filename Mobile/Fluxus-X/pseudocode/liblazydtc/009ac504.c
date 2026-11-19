/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ac504
 */

undefined8 ssl_cert_set0_chain(long param_1,long param_2,undefined8 param_3)

{
  undefined8 *puVar1;
  int iVar2;
  int iVar3;
  undefined8 uVar4;
  long lVar5;
  
  puVar1 = (undefined8 *)(param_2 + 0x158);
  if (param_1 != 0) {
    puVar1 = (undefined8 *)(param_1 + 0x898);
  }
  lVar5 = *(long *)*puVar1;
  if (lVar5 == 0) {
LAB_009ac5e0:
    uVar4 = 0;
  }
  else {
    iVar2 = OPENSSL_sk_num(param_3);
    if (0 < iVar2) {
      iVar2 = 0;
      do {
        uVar4 = OPENSSL_sk_value(param_3,iVar2);
        iVar3 = ssl_security_cert(param_1,param_2,uVar4,0,0);
        if (iVar3 != 1) {
          ERR_new();
          ERR_set_debug("ssl/ssl_cert.c",0x111,"ssl_cert_set0_chain");
          ERR_set_error(0x14,iVar3,0);
          goto LAB_009ac5e0;
        }
        iVar2 = iVar2 + 1;
        iVar3 = OPENSSL_sk_num(param_3);
      } while (iVar2 < iVar3);
    }
    OPENSSL_sk_pop_free(*(undefined8 *)(lVar5 + 0x10),X509_free);
    uVar4 = 1;
    *(undefined8 *)(lVar5 + 0x10) = param_3;
  }
  return uVar4;
}

