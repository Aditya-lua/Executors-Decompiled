/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a47af8
 */

void ossl_curve448_point_eq(long param_1,long param_2)

{
  undefined1 auStack_a0 [64];
  undefined1 auStack_60 [64];
  
  gf_mul(auStack_60,param_1 + 0x40,param_2);
  gf_mul(auStack_a0,param_2 + 0x40,param_1);
  gf_eq(auStack_60,auStack_a0);
  return;
}

