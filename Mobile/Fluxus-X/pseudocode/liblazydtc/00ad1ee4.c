/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad1ee4
 */

undefined8 RSA_get0_multi_prime_factors(long param_1,long param_2)

{
  uint uVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  ulong uVar4;
  
  uVar1 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 0x88));
  if ((int)uVar1 < 1) {
    uVar3 = 0;
  }
  else {
    uVar4 = 0;
    do {
      puVar2 = (undefined8 *)OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x88),uVar4 & 0xffffffff);
      *(undefined8 *)(param_2 + uVar4 * 8) = *puVar2;
      uVar4 = uVar4 + 1;
    } while (uVar4 < uVar1);
    uVar3 = 1;
  }
  return uVar3;
}

