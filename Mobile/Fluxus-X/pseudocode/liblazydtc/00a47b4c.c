/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a47b4c
 */

ulong ossl_curve448_point_valid(long param_1)

{
  long lVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  undefined1 auStack_100 [64];
  undefined1 auStack_c0 [64];
  undefined1 auStack_80 [64];
  
  gf_mul(auStack_80,param_1,param_1 + 0x40);
  lVar1 = param_1 + 0x80;
  gf_mul(auStack_c0,lVar1,param_1 + 0xc0);
  uVar2 = gf_eq(auStack_80,auStack_c0);
  gf_sqr(auStack_80,param_1);
  gf_sqr(auStack_c0,param_1 + 0x40);
  gf_sub(auStack_80,auStack_c0,auStack_80);
  gf_sqr(auStack_c0,param_1 + 0xc0);
  gf_mulw_unsigned(auStack_100,auStack_c0,0x98aa);
  gf_sub(auStack_100,&DAT_00760980,auStack_100);
  gf_sqr(auStack_c0,lVar1);
  gf_add(auStack_c0,auStack_c0,auStack_100);
  uVar3 = gf_eq(auStack_80,auStack_c0);
  uVar4 = gf_eq(lVar1,&DAT_00760980);
  return uVar3 & uVar2 & (uVar4 ^ 0xffffffffffffffff);
}

