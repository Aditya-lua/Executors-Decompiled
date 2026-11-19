/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b220d0
 */

long FUN_00b220d0(undefined8 param_1)

{
  uint uVar1;
  int iVar2;
  BIGNUM *a;
  BIGNUM *a_00;
  BIGNUM *a_01;
  long lVar3;
  
  a = BN_new();
  a_00 = BN_new();
  a_01 = BN_new();
  lVar3 = 0;
  if (((a != (BIGNUM *)0x0) && (a_00 != (BIGNUM *)0x0)) && (a_01 != (BIGNUM *)0x0)) {
    iVar2 = EC_GROUP_get_curve(param_1,a,a_00,a_01,0);
    if (iVar2 == 0) {
      lVar3 = 0;
    }
    else {
      iVar2 = BN_num_bits(a);
      uVar1 = iVar2 + 0xe;
      if (-1 < (int)(iVar2 + 7U)) {
        uVar1 = iVar2 + 7U;
      }
      lVar3 = (long)((ulong)uVar1 << 0x20) >> 0x23;
    }
  }
  BN_free(a);
  BN_free(a_00);
  BN_free(a_01);
  return lVar3;
}

