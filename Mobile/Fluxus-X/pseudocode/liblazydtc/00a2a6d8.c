/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2a6d8
 */

undefined8 ossl_ec_GF2m_simple_invert(EC_GROUP *param_1,EC_POINT *param_2,undefined8 param_3)

{
  int iVar1;
  undefined8 uVar2;
  
  iVar1 = EC_POINT_is_at_infinity(param_1,param_2);
  if ((iVar1 == 0) && (iVar1 = BN_is_zero(*(undefined8 *)(param_2 + 0x18)), iVar1 == 0)) {
    if (*(code **)(*(long *)param_1 + 0xd0) == (code *)0x0) {
      uVar2 = 0;
    }
    else {
      uVar2 = (**(code **)(*(long *)param_1 + 0xd0))(param_1,param_2,param_3);
      if ((int)uVar2 != 0) {
        uVar2 = BN_GF2m_add(*(undefined8 *)(param_2 + 0x18),*(undefined8 *)(param_2 + 0x10),
                            *(undefined8 *)(param_2 + 0x18));
        return uVar2;
      }
    }
  }
  else {
    uVar2 = 1;
  }
  return uVar2;
}

