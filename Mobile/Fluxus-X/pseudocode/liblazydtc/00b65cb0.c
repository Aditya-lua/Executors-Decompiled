/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b65cb0
 */

undefined8
ossl_cipher_generic_stream_update
          (long param_1,long param_2,ulong *param_3,ulong param_4,undefined8 param_5,ulong param_6)

{
  int iVar1;
  undefined8 uVar2;
  ulong uVar3;
  ulong uVar4;
  
  if ((*(byte *)(param_1 + 0x6c) >> 3 & 1) == 0) {
    ERR_new();
    ERR_set_debug("providers/implementations/ciphers/ciphercommon.c",0x1da,
                  "ossl_cipher_generic_stream_update");
    uVar2 = 0x72;
  }
  else {
    if (param_6 == 0) {
      *param_3 = 0;
      return 1;
    }
    if (param_4 < param_6) {
      ERR_new();
      ERR_set_debug("providers/implementations/ciphers/ciphercommon.c",0x1e4,
                    "ossl_cipher_generic_stream_update");
      uVar2 = 0x6a;
    }
    else {
      iVar1 = (**(code **)(*(long *)(param_1 + 0xa8) + 8))(param_1,param_2,param_5,param_6);
      if (iVar1 != 0) {
        *param_3 = param_6;
        if ((*(byte *)(param_1 + 0x6c) >> 1 & 1) != 0) {
          return 1;
        }
        if (*(int *)(param_1 + 0x70) == 0) {
          return 1;
        }
        if (*(int *)(param_1 + 0x90) != 0) {
          uVar3 = (ulong)*(byte *)(param_2 + (param_6 - 1));
          if (param_6 <= uVar3) {
            return 0;
          }
          param_6 = (param_6 - 1) - uVar3;
          *param_3 = param_6;
        }
        uVar3 = param_6 - *(ulong *)(param_1 + 0x98);
        if (param_6 < *(ulong *)(param_1 + 0x98)) {
          return 0;
        }
        *param_3 = uVar3;
        uVar4 = *(ulong *)(param_1 + 0x88);
        if (uVar4 == 0) {
          return 1;
        }
        if (uVar3 < uVar4) {
          return 0;
        }
        *(ulong *)(param_1 + 0x78) = (param_2 + uVar3) - uVar4;
        *param_3 = uVar3 - uVar4;
        return 1;
      }
      ERR_new();
      ERR_set_debug("providers/implementations/ciphers/ciphercommon.c",0x1e9,
                    "ossl_cipher_generic_stream_update");
      uVar2 = 0x66;
    }
  }
  ERR_set_error(0x39,uVar2,0);
  return 0;
}

