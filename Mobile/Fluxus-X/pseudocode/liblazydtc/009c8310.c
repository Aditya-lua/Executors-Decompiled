/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c8310
 */

undefined8 ssl_srp_ctx_init_intern(long param_1)

{
  undefined4 uVar1;
  BIGNUM *pBVar2;
  char *pcVar3;
  undefined8 uVar4;
  long lVar5;
  
  if (param_1 == 0) {
    return 0;
  }
  lVar5 = *(long *)(param_1 + 0x9a8);
  if (lVar5 == 0) {
    return 0;
  }
  memset((void *)(param_1 + 0xbf0),0,0x60);
  uVar4 = *(undefined8 *)(lVar5 + 0x318);
  *(undefined8 *)(param_1 + 0xbd8) = *(undefined8 *)(lVar5 + 800);
  *(undefined8 *)(param_1 + 0xbd0) = uVar4;
  uVar4 = *(undefined8 *)(lVar5 + 0x328);
  *(undefined8 *)(param_1 + 0xbe8) = *(undefined8 *)(lVar5 + 0x330);
  *(undefined8 *)(param_1 + 0xbe0) = uVar4;
  *(undefined4 *)(param_1 + 0xc40) = *(undefined4 *)(lVar5 + 0x388);
  if (*(BIGNUM **)(lVar5 + 0x340) != (BIGNUM *)0x0) {
    pBVar2 = BN_dup(*(BIGNUM **)(lVar5 + 0x340));
    *(BIGNUM **)(param_1 + 0xbf8) = pBVar2;
    if (pBVar2 != (BIGNUM *)0x0) goto LAB_009c8374;
LAB_009c8450:
    ERR_new();
    ERR_set_debug("ssl/tls_srp.c",0x7e,"ssl_srp_ctx_init_intern");
    uVar1 = 0x80003;
    goto LAB_009c8478;
  }
LAB_009c8374:
  if (*(BIGNUM **)(lVar5 + 0x348) != (BIGNUM *)0x0) {
    pBVar2 = BN_dup(*(BIGNUM **)(lVar5 + 0x348));
    *(BIGNUM **)(param_1 + 0xc00) = pBVar2;
    if (pBVar2 == (BIGNUM *)0x0) goto LAB_009c8450;
  }
  if (*(BIGNUM **)(lVar5 + 0x350) != (BIGNUM *)0x0) {
    pBVar2 = BN_dup(*(BIGNUM **)(lVar5 + 0x350));
    *(BIGNUM **)(param_1 + 0xc08) = pBVar2;
    if (pBVar2 == (BIGNUM *)0x0) goto LAB_009c8450;
  }
  if (*(BIGNUM **)(lVar5 + 0x358) != (BIGNUM *)0x0) {
    pBVar2 = BN_dup(*(BIGNUM **)(lVar5 + 0x358));
    *(BIGNUM **)(param_1 + 0xc10) = pBVar2;
    if (pBVar2 == (BIGNUM *)0x0) goto LAB_009c8450;
  }
  if (*(BIGNUM **)(lVar5 + 0x360) != (BIGNUM *)0x0) {
    pBVar2 = BN_dup(*(BIGNUM **)(lVar5 + 0x360));
    *(BIGNUM **)(param_1 + 0xc18) = pBVar2;
    if (pBVar2 == (BIGNUM *)0x0) goto LAB_009c8450;
  }
  if (*(BIGNUM **)(lVar5 + 0x368) != (BIGNUM *)0x0) {
    pBVar2 = BN_dup(*(BIGNUM **)(lVar5 + 0x368));
    *(BIGNUM **)(param_1 + 0xc20) = pBVar2;
    if (pBVar2 == (BIGNUM *)0x0) goto LAB_009c8450;
  }
  if (*(BIGNUM **)(lVar5 + 0x378) != (BIGNUM *)0x0) {
    pBVar2 = BN_dup(*(BIGNUM **)(lVar5 + 0x378));
    *(BIGNUM **)(param_1 + 0xc30) = pBVar2;
    if (pBVar2 == (BIGNUM *)0x0) goto LAB_009c8450;
  }
  if (*(BIGNUM **)(lVar5 + 0x370) != (BIGNUM *)0x0) {
    pBVar2 = BN_dup(*(BIGNUM **)(lVar5 + 0x370));
    *(BIGNUM **)(param_1 + 0xc28) = pBVar2;
    if (pBVar2 == (BIGNUM *)0x0) goto LAB_009c8450;
  }
  if (*(char **)(lVar5 + 0x338) == (char *)0x0) {
LAB_009c8420:
    if (*(char **)(lVar5 + 0x380) == (char *)0x0) {
LAB_009c8440:
      *(undefined8 *)(param_1 + 0xc48) = *(undefined8 *)(lVar5 + 0x390);
      return 1;
    }
    pcVar3 = CRYPTO_strdup(*(char **)(lVar5 + 0x380),"ssl/tls_srp.c",0x87);
    *(char **)(param_1 + 0xc38) = pcVar3;
    if (pcVar3 != (char *)0x0) goto LAB_009c8440;
    ERR_new();
    uVar4 = 0x88;
  }
  else {
    pcVar3 = CRYPTO_strdup(*(char **)(lVar5 + 0x338),"ssl/tls_srp.c",0x82);
    *(char **)(param_1 + 0xbf0) = pcVar3;
    if (pcVar3 != (char *)0x0) goto LAB_009c8420;
    ERR_new();
    uVar4 = 0x83;
  }
  ERR_set_debug("ssl/tls_srp.c",uVar4,"ssl_srp_ctx_init_intern");
  uVar1 = 0xc0103;
LAB_009c8478:
  ERR_set_error(0x14,uVar1,0);
  CRYPTO_free(*(void **)(param_1 + 0xbf0));
  CRYPTO_free(*(void **)(param_1 + 0xc38));
  BN_free(*(BIGNUM **)(param_1 + 0xbf8));
  BN_free(*(BIGNUM **)(param_1 + 0xc00));
  BN_free(*(BIGNUM **)(param_1 + 0xc08));
  BN_free(*(BIGNUM **)(param_1 + 0xc10));
  BN_free(*(BIGNUM **)(param_1 + 0xc18));
  BN_free(*(BIGNUM **)(param_1 + 0xc20));
  BN_free(*(BIGNUM **)(param_1 + 0xc28));
  BN_free(*(BIGNUM **)(param_1 + 0xc30));
  memset((void *)(param_1 + 0xbd0),0,0x80);
  return 0;
}

