/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad23d0
 */

undefined8
ossl_rsa_get0_all_params(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  uint uVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  uint uVar4;
  
  uVar3 = 0;
  if (param_1 != 0) {
    if (*(long *)(param_1 + 0x40) != 0) {
      OPENSSL_sk_push(param_2);
      OPENSSL_sk_push(param_2,*(undefined8 *)(param_1 + 0x48));
      OPENSSL_sk_push(param_3,*(undefined8 *)(param_1 + 0x50));
      OPENSSL_sk_push(param_3,*(undefined8 *)(param_1 + 0x58));
      OPENSSL_sk_push(param_4,*(undefined8 *)(param_1 + 0x60));
      uVar1 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 0x88));
      if (0 < (int)uVar1) {
        uVar4 = 0;
        do {
          puVar2 = (undefined8 *)OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x88),uVar4);
          OPENSSL_sk_push(param_2,*puVar2);
          OPENSSL_sk_push(param_3,puVar2[1]);
          OPENSSL_sk_push(param_4,puVar2[2]);
          uVar4 = uVar4 + 1;
        } while (uVar4 < (uVar1 & ((int)uVar1 >> 0x1f ^ 0xffffffffU)));
      }
    }
    uVar3 = 1;
  }
  return uVar3;
}

