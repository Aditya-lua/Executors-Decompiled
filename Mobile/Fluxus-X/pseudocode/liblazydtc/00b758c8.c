/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b758c8
 */

undefined8
mbedtls_des3_crypt_cbc
          (undefined8 param_1,int param_2,ulong param_3,ulong *param_4,ulong *param_5,ulong *param_6
          )

{
  undefined8 uVar1;
  ulong uVar2;
  
  if ((param_3 & 7) == 0) {
    if (param_2 == 1) {
      if (param_3 != 0) {
        uVar2 = (ulong)(byte)*param_4;
        do {
          *(byte *)param_6 = (byte)uVar2 ^ (byte)*param_5;
          *(byte *)((long)param_6 + 1) = *(byte *)((long)param_4 + 1) ^ *(byte *)((long)param_5 + 1)
          ;
          *(byte *)((long)param_6 + 2) = *(byte *)((long)param_4 + 2) ^ *(byte *)((long)param_5 + 2)
          ;
          *(byte *)((long)param_6 + 3) = *(byte *)((long)param_4 + 3) ^ *(byte *)((long)param_5 + 3)
          ;
          *(byte *)((long)param_6 + 4) = *(byte *)((long)param_4 + 4) ^ *(byte *)((long)param_5 + 4)
          ;
          *(byte *)((long)param_6 + 5) = *(byte *)((long)param_4 + 5) ^ *(byte *)((long)param_5 + 5)
          ;
          *(byte *)((long)param_6 + 6) = *(byte *)((long)param_4 + 6) ^ *(byte *)((long)param_5 + 6)
          ;
          *(byte *)((long)param_6 + 7) = *(byte *)((long)param_4 + 7) ^ *(byte *)((long)param_5 + 7)
          ;
          mbedtls_des3_crypt_ecb(param_1,param_6,param_6);
          uVar2 = *param_6;
          param_3 = param_3 - 8;
          param_5 = param_5 + 1;
          *param_4 = uVar2;
          param_6 = param_6 + 1;
        } while (param_3 != 0);
      }
    }
    else if (param_3 != 0) {
      do {
        uVar2 = *param_5;
        mbedtls_des3_crypt_ecb(param_1,param_5,param_6);
        param_3 = param_3 - 8;
        *(byte *)param_6 = (byte)*param_4 ^ (byte)*param_6;
        *(byte *)((long)param_6 + 1) = *(byte *)((long)param_4 + 1) ^ *(byte *)((long)param_6 + 1);
        *(byte *)((long)param_6 + 2) = *(byte *)((long)param_4 + 2) ^ *(byte *)((long)param_6 + 2);
        *(byte *)((long)param_6 + 3) = *(byte *)((long)param_4 + 3) ^ *(byte *)((long)param_6 + 3);
        *(byte *)((long)param_6 + 4) = *(byte *)((long)param_4 + 4) ^ *(byte *)((long)param_6 + 4);
        *(byte *)((long)param_6 + 5) = *(byte *)((long)param_4 + 5) ^ *(byte *)((long)param_6 + 5);
        *(byte *)((long)param_6 + 6) = *(byte *)((long)param_4 + 6) ^ *(byte *)((long)param_6 + 6);
        *(byte *)((long)param_6 + 7) = *(byte *)((long)param_4 + 7) ^ *(byte *)((long)param_6 + 7);
        param_6 = param_6 + 1;
        *param_4 = uVar2;
        param_5 = param_5 + 1;
      } while (param_3 != 0);
    }
    uVar1 = 0;
  }
  else {
    uVar1 = 0xffffffce;
  }
  return uVar1;
}

