/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b68284
 */

undefined8 ossl_cipher_hw_generic_ecb(long param_1,long param_2,long param_3,ulong param_4)

{
  ulong uVar1;
  ulong uVar2;
  
  uVar1 = *(ulong *)(param_1 + 0x58);
  if (uVar1 <= param_4) {
    if (*(code **)(param_1 + 0x38) == (code *)0x0) {
      uVar2 = 0;
      do {
        (**(code **)(param_1 + 0x30))
                  (param_3 + uVar2,param_2 + uVar2,*(undefined8 *)(param_1 + 0xb0));
        uVar2 = uVar2 + uVar1;
      } while (uVar2 <= param_4 - uVar1);
    }
    else {
      (**(code **)(param_1 + 0x38))
                (param_3,param_2,param_4,*(undefined8 *)(param_1 + 0xb0),
                 *(byte *)(param_1 + 0x6c) >> 1 & 1);
    }
  }
  return 1;
}

