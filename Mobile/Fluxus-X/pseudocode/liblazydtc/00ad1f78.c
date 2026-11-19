/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad1f78
 */

undefined8 RSA_get0_multi_prime_crt_params(long param_1,long param_2,long param_3)

{
  uint uVar1;
  long lVar2;
  undefined8 uVar3;
  ulong uVar4;
  
  uVar1 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 0x88));
  if ((int)uVar1 < 1) {
    uVar3 = 0;
  }
  else {
    if (param_2 != 0 || param_3 != 0) {
      uVar4 = 0;
      do {
        lVar2 = OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x88),uVar4 & 0xffffffff);
        if (param_2 != 0) {
          *(undefined8 *)(param_2 + uVar4 * 8) = *(undefined8 *)(lVar2 + 8);
        }
        if (param_3 != 0) {
          *(undefined8 *)(param_3 + uVar4 * 8) = *(undefined8 *)(lVar2 + 0x10);
        }
        uVar4 = uVar4 + 1;
      } while (uVar1 != uVar4);
    }
    uVar3 = 1;
  }
  return uVar3;
}

