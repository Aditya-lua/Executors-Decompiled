/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae79ec
 */

undefined8 FUN_00ae79ec(long param_1,char *param_2)

{
  int iVar1;
  int iVar2;
  undefined8 *puVar3;
  char *pcVar4;
  BIGNUM *pBVar5;
  uchar auStack_a04 [2500];
  
  if (param_1 != 0) {
    iVar1 = OPENSSL_sk_num();
    if (0 < iVar1) {
      iVar1 = 0;
      do {
        puVar3 = (undefined8 *)OPENSSL_sk_value(param_1,iVar1);
        iVar2 = strcmp((char *)*puVar3,param_2);
        if (iVar2 == 0) {
          return puVar3[1];
        }
        iVar1 = iVar1 + 1;
        iVar2 = OPENSSL_sk_num(param_1);
      } while (iVar1 < iVar2);
    }
    puVar3 = CRYPTO_malloc(0x10,"crypto/srp/srp_vfy.c",0x13c);
    if (puVar3 != (undefined8 *)0x0) {
      iVar1 = FUN_00ae8258(auStack_a04,param_2);
      if (-1 < iVar1) {
        pcVar4 = CRYPTO_strdup(param_2,"crypto/srp/srp_vfy.c",0x145);
        *puVar3 = pcVar4;
        if (pcVar4 != (char *)0x0) {
          pBVar5 = BN_bin2bn(auStack_a04,iVar1,(BIGNUM *)0x0);
          puVar3[1] = pBVar5;
          if (pBVar5 == (BIGNUM *)0x0) {
            CRYPTO_free((void *)*puVar3);
          }
          else {
            iVar1 = OPENSSL_sk_insert(param_1,puVar3,0);
            if (0 < iVar1) {
              return puVar3[1];
            }
            CRYPTO_free((void *)*puVar3);
            BN_free((BIGNUM *)puVar3[1]);
          }
        }
      }
      CRYPTO_free(puVar3);
    }
  }
  return 0;
}

