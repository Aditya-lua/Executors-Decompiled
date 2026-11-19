/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a236a4
 */

undefined4 FUN_00a236a4(long param_1,long param_2)

{
  int iVar1;
  EC_GROUP *group;
  EC_POINT *a;
  EC_POINT *b;
  undefined4 uVar2;
  
  group = EC_KEY_get0_group(*(EC_KEY **)(param_2 + 0x20));
  a = EC_KEY_get0_public_key(*(EC_KEY **)(param_1 + 0x20));
  b = EC_KEY_get0_public_key(*(EC_KEY **)(param_2 + 0x20));
  uVar2 = 0xfffffffe;
  if (((group != (EC_GROUP *)0x0) && (a != (EC_POINT *)0x0)) && (b != (EC_POINT *)0x0)) {
    iVar1 = EC_POINT_cmp(group,a,b,(BN_CTX *)0x0);
    uVar2 = 0;
    if (iVar1 != 1) {
      uVar2 = 0xfffffffe;
    }
    if (iVar1 == 0) {
      uVar2 = 1;
    }
  }
  return uVar2;
}

