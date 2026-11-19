/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a3015c
 */

undefined8 * ossl_ec_group_new_ex(undefined8 param_1,char *param_2,byte *param_3)

{
  int iVar1;
  undefined8 *ptr;
  char *pcVar2;
  BIGNUM *pBVar3;
  undefined8 uVar4;
  
  if (param_3 == (byte *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_lib.c",0x22,"ossl_ec_group_new_ex");
    uVar4 = 0x6c;
LAB_00a3025c:
    ERR_set_error(0x10,uVar4,0);
    return (undefined8 *)0x0;
  }
  if (*(long *)(param_3 + 8) == 0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_lib.c",0x26,"ossl_ec_group_new_ex");
    uVar4 = 0xc0101;
    goto LAB_00a3025c;
  }
  ptr = (undefined8 *)CRYPTO_zalloc(0xb8,"crypto/ec/ec_lib.c",0x2a);
  if (ptr == (undefined8 *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_lib.c",0x2c,"ossl_ec_group_new_ex");
    ERR_set_error(0x10,0xc0100,0);
    return (undefined8 *)0x0;
  }
  ptr[0x15] = param_1;
  if (param_2 != (char *)0x0) {
    pcVar2 = CRYPTO_strdup(param_2,"crypto/ec/ec_lib.c",0x32);
    ptr[0x16] = pcVar2;
    if (pcVar2 == (char *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/ec/ec_lib.c",0x34,"ossl_ec_group_new_ex");
      ERR_set_error(0x10,0xc0100,0);
      goto LAB_00a302cc;
    }
  }
  *ptr = param_3;
  if ((*param_3 >> 1 & 1) == 0) {
    pBVar3 = BN_new();
    ptr[2] = pBVar3;
    if (pBVar3 == (BIGNUM *)0x0) goto LAB_00a302cc;
    pBVar3 = BN_new();
    ptr[3] = pBVar3;
    if (pBVar3 == (BIGNUM *)0x0) goto LAB_00a302cc;
  }
  *(undefined4 *)((long)ptr + 0x24) = 0;
  *(undefined4 *)((long)ptr + 0x2c) = 4;
  iVar1 = (**(code **)(param_3 + 8))(ptr);
  if (iVar1 != 0) {
    return ptr;
  }
LAB_00a302cc:
  BN_free((BIGNUM *)ptr[2]);
  BN_free((BIGNUM *)ptr[3]);
  CRYPTO_free((void *)ptr[0x16]);
  CRYPTO_free(ptr);
  return (undefined8 *)0x0;
}

