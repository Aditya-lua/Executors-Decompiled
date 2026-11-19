/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2ab54
 */

undefined8
ossl_ec_GF2m_simple_points_make_affine(long *param_1,ulong param_2,long param_3,undefined8 param_4)

{
  undefined8 uVar1;
  ulong uVar2;
  
  if (param_2 != 0) {
    uVar2 = 0;
    do {
      uVar1 = (**(code **)(*param_1 + 0xd0))(param_1,*(undefined8 *)(param_3 + uVar2 * 8),param_4);
      if ((int)uVar1 == 0) {
        return uVar1;
      }
      uVar2 = uVar2 + 1;
    } while (uVar2 < param_2);
  }
  return 1;
}

