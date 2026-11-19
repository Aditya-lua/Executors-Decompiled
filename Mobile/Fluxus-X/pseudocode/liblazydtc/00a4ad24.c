/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4ad24
 */

long gf_eq(undefined8 param_1,undefined8 param_2)

{
  ulong local_50;
  ulong uStack_48;
  ulong local_40;
  ulong uStack_38;
  ulong local_30;
  ulong uStack_28;
  ulong local_20;
  ulong uStack_18;
  
  gf_sub(&local_50,param_1,param_2);
  gf_strong_reduce(&local_50);
  uStack_18 = uStack_18 |
              local_20 | uStack_28 | local_30 | uStack_38 | local_40 | uStack_48 | local_50;
  return (long)(uStack_18 - 1 & (uStack_18 ^ 0xffffffffffffffff)) >> 0x3f;
}

