/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00baec60
 */

undefined8 mbedtls_sha3_starts(void *param_1,int param_2)

{
  ulong uVar1;
  
  if (param_2 - 1U < 4) {
    uVar1 = (ulong)(param_2 - 1U) << 4;
    *(short *)((long)param_1 + 0xcc) = (short)(0x4000300020001c >> (uVar1 & 0x3f));
    *(short *)((long)param_1 + 0xce) = (short)(0x48006800880090 >> (uVar1 & 0x3f));
    memset(param_1,0,0xcc);
    return 0;
  }
  return 0xffffff8a;
}

