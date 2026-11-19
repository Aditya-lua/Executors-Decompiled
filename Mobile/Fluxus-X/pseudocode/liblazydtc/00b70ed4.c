/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b70ed4
 */

undefined8
mbedtls_aria_crypt_cfb128
          (undefined8 param_1,uint param_2,long param_3,ulong *param_4,long param_5,byte *param_6,
          byte *param_7)

{
  byte bVar1;
  undefined8 uVar2;
  ulong uVar3;
  
  if ((param_2 < 2) && (uVar3 = *param_4, uVar3 < 0x10)) {
    if (param_2 == 0) {
      for (; param_3 != 0; param_3 = param_3 + -1) {
        if (uVar3 == 0) {
          mbedtls_aria_crypt_ecb(param_1,param_5,param_5);
        }
        bVar1 = *param_6;
        *param_7 = *(byte *)(param_5 + uVar3) ^ bVar1;
        *(byte *)(param_5 + uVar3) = bVar1;
        uVar3 = (ulong)((int)uVar3 + 1) & 0xf;
        param_7 = param_7 + 1;
        param_6 = param_6 + 1;
      }
    }
    else {
      for (; param_3 != 0; param_3 = param_3 + -1) {
        if (uVar3 == 0) {
          mbedtls_aria_crypt_ecb(param_1,param_5,param_5);
        }
        bVar1 = *param_6 ^ *(byte *)(param_5 + uVar3);
        *param_7 = bVar1;
        *(byte *)(param_5 + uVar3) = bVar1;
        uVar3 = (ulong)((int)uVar3 + 1) & 0xf;
        param_7 = param_7 + 1;
        param_6 = param_6 + 1;
      }
    }
    uVar2 = 0;
    *param_4 = uVar3;
  }
  else {
    uVar2 = 0xffffffa4;
  }
  return uVar2;
}

