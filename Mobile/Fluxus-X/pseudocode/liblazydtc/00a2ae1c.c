/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2ae1c
 */

undefined8 FUN_00a2ae1c(long *param_1,long param_2,long param_3,long param_4,undefined8 param_5)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  
  if (*(int *)(param_4 + 0x28) == 0) {
LAB_00a2affc:
    uVar3 = 0;
  }
  else {
    do {
      uVar3 = *(undefined8 *)(param_3 + 0x20);
      iVar1 = BN_num_bits((BIGNUM *)param_1[8]);
      iVar1 = BN_priv_rand_ex(uVar3,iVar1 + -1,0xffffffff,0,0,param_5);
      if (iVar1 == 0) {
        ERR_new();
        uVar3 = 0x2de;
        goto LAB_00a2afe4;
      }
      iVar1 = BN_is_zero(*(undefined8 *)(param_3 + 0x20));
    } while (iVar1 != 0);
    lVar2 = *param_1;
    if (*(code **)(lVar2 + 0x118) != (code *)0x0) {
      uVar3 = (**(code **)(lVar2 + 0x118))
                        (param_1,*(undefined8 *)(param_3 + 0x20),*(undefined8 *)(param_3 + 0x20),
                         param_5);
      if ((int)uVar3 == 0) {
        return uVar3;
      }
      lVar2 = *param_1;
    }
    uVar3 = (**(code **)(lVar2 + 0xf8))
                      (param_1,*(undefined8 *)(param_3 + 0x10),*(undefined8 *)(param_4 + 0x10),
                       *(undefined8 *)(param_3 + 0x20),param_5);
    if ((int)uVar3 != 0) {
      do {
        uVar3 = *(undefined8 *)(param_2 + 0x18);
        iVar1 = BN_num_bits((BIGNUM *)param_1[8]);
        iVar1 = BN_priv_rand_ex(uVar3,iVar1 + -1,0xffffffff,0,0,param_5);
        if (iVar1 == 0) {
          ERR_new();
          uVar3 = 0x2ed;
LAB_00a2afe4:
          ERR_set_debug("crypto/ec/ec2_smpl.c",uVar3,"ec_GF2m_simple_ladder_pre");
          ERR_set_error(0x10,0x80003,0);
          goto LAB_00a2affc;
        }
        iVar1 = BN_is_zero(*(undefined8 *)(param_2 + 0x18));
      } while (iVar1 != 0);
      lVar2 = *param_1;
      if (*(code **)(lVar2 + 0x118) != (code *)0x0) {
        uVar3 = (**(code **)(lVar2 + 0x118))
                          (param_1,*(undefined8 *)(param_2 + 0x18),*(undefined8 *)(param_2 + 0x18),
                           param_5);
        if ((int)uVar3 == 0) {
          return uVar3;
        }
        lVar2 = *param_1;
      }
      uVar3 = (**(code **)(lVar2 + 0x100))
                        (param_1,*(undefined8 *)(param_2 + 0x20),*(undefined8 *)(param_4 + 0x10),
                         param_5);
      if (((((int)uVar3 != 0) &&
           (uVar3 = (**(code **)(*param_1 + 0x100))
                              (param_1,*(undefined8 *)(param_2 + 0x10),
                               *(undefined8 *)(param_2 + 0x20),param_5), (int)uVar3 != 0)) &&
          (uVar3 = BN_GF2m_add(*(undefined8 *)(param_2 + 0x10),*(undefined8 *)(param_2 + 0x10),
                               param_1[0xd]), (int)uVar3 != 0)) &&
         ((uVar3 = (**(code **)(*param_1 + 0xf8))
                             (param_1,*(undefined8 *)(param_2 + 0x20),
                              *(undefined8 *)(param_2 + 0x20),*(undefined8 *)(param_2 + 0x18),
                              param_5), (int)uVar3 != 0 &&
          (uVar3 = (**(code **)(*param_1 + 0xf8))
                             (param_1,*(undefined8 *)(param_2 + 0x10),
                              *(undefined8 *)(param_2 + 0x10),*(undefined8 *)(param_2 + 0x18),
                              param_5), (int)uVar3 != 0)))) {
        uVar3 = 1;
        *(undefined4 *)(param_3 + 0x28) = 0;
        *(undefined4 *)(param_2 + 0x28) = 0;
      }
    }
  }
  return uVar3;
}

