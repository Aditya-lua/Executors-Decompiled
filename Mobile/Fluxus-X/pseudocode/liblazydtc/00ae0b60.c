/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae0b60
 */

bool ossl_keccak_kmac_init(void *param_1,undefined1 param_2,ulong param_3)

{
  ulong uVar1;
  
  uVar1 = param_3 * -2 + 0x640;
  if (uVar1 < 0x548) {
    memset(param_1,0,200);
    *(undefined1 *)((long)param_1 + 0x188) = param_2;
    *(ulong *)((long)param_1 + 200) = uVar1 >> 3;
    *(ulong *)((long)param_1 + 0xd0) = param_3 >> 2 & 0x3ffffffffffffffe;
    *(undefined8 *)((long)param_1 + 0xd8) = 0;
  }
  return uVar1 < 0x548;
}

