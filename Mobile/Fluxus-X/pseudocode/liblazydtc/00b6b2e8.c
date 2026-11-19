/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b6b2e8
 */

undefined8 mbedtls_ccm_set_lengths(long param_1,ulong param_2,undefined8 param_3,ulong param_4)

{
  undefined8 uVar1;
  
  if ((((param_2 >> 8 < 0xff) && (param_4 != 2)) && (param_4 < 0x11)) && ((param_4 & 1) == 0)) {
    *(undefined8 *)(param_1 + 0x20) = param_3;
    *(ulong *)(param_1 + 0x28) = param_2;
    *(ulong *)(param_1 + 0x30) = param_4;
    *(undefined8 *)(param_1 + 0x38) = 0;
    *(uint *)(param_1 + 0xa8) = *(uint *)(param_1 + 0xa8) | 2;
    uVar1 = FUN_00b6b1c8();
    return uVar1;
  }
  return 0xfffffff3;
}

