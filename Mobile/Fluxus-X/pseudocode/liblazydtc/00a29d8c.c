/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a29d8c
 */

undefined8
ossl_ec_GF2m_simple_group_set_curve
          (long param_1,BIGNUM *param_2,undefined8 param_3,undefined8 param_4)

{
  int iVar1;
  int iVar2;
  uint uVar3;
  BIGNUM *pBVar4;
  undefined8 uVar5;
  long lVar6;
  long lVar7;
  
  pBVar4 = BN_copy(*(BIGNUM **)(param_1 + 0x40),param_2);
  uVar5 = 0;
  if (pBVar4 != (BIGNUM *)0x0) {
    lVar7 = param_1 + 0x48;
    uVar3 = BN_GF2m_poly2arr(*(undefined8 *)(param_1 + 0x40),lVar7,6);
    if ((uVar3 | 2) == 6) {
      uVar5 = BN_GF2m_mod_arr(*(undefined8 *)(param_1 + 0x60),param_3,lVar7);
      if ((int)uVar5 != 0) {
        iVar1 = *(int *)(param_1 + 0x48) + 0x3f;
        iVar2 = *(int *)(param_1 + 0x48) + 0x7e;
        if (-1 < iVar1) {
          iVar2 = iVar1;
        }
        lVar6 = bn_wexpand(*(undefined8 *)(param_1 + 0x60),iVar2 >> 6);
        uVar5 = 0;
        if (lVar6 != 0) {
          bn_set_all_zero(*(undefined8 *)(param_1 + 0x60));
          uVar5 = BN_GF2m_mod_arr(*(undefined8 *)(param_1 + 0x68),param_4,lVar7);
          if ((int)uVar5 != 0) {
            iVar1 = *(int *)(param_1 + 0x48) + 0x3f;
            iVar2 = *(int *)(param_1 + 0x48) + 0x7e;
            if (-1 < iVar1) {
              iVar2 = iVar1;
            }
            lVar7 = bn_wexpand(*(undefined8 *)(param_1 + 0x68),iVar2 >> 6);
            uVar5 = 0;
            if (lVar7 != 0) {
              bn_set_all_zero(*(undefined8 *)(param_1 + 0x68));
              uVar5 = 1;
            }
          }
        }
      }
    }
    else {
      ERR_new();
      ERR_set_debug("crypto/ec/ec2_smpl.c",0x70,"ossl_ec_GF2m_simple_group_set_curve");
      ERR_set_error(0x10,0x83,0);
      uVar5 = 0;
    }
  }
  return uVar5;
}

