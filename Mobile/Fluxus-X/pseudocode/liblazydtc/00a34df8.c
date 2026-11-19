/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a34df8
 */

bool ossl_ec_GF2m_simple_set_compressed_coordinates
               (long *param_1,undefined8 param_2,undefined8 param_3,int param_4,BN_CTX *param_5)

{
  long *plVar1;
  bool bVar2;
  int iVar3;
  int iVar4;
  BIGNUM *pBVar5;
  BIGNUM *pBVar6;
  BIGNUM *pBVar7;
  BIGNUM *pBVar8;
  ulong uVar9;
  undefined8 uVar10;
  BN_CTX *c;
  
  c = (BN_CTX *)0x0;
  if ((param_5 == (BN_CTX *)0x0) && (param_5 = BN_CTX_new(), c = param_5, param_5 == (BN_CTX *)0x0))
  {
    return false;
  }
  BN_CTX_start(param_5);
  pBVar5 = BN_CTX_get(param_5);
  pBVar6 = BN_CTX_get(param_5);
  pBVar7 = BN_CTX_get(param_5);
  pBVar8 = BN_CTX_get(param_5);
  if (pBVar8 != (BIGNUM *)0x0) {
    plVar1 = param_1 + 9;
    iVar3 = BN_GF2m_mod_arr(pBVar6,param_3,plVar1);
    if (iVar3 != 0) {
      iVar3 = BN_is_zero(pBVar6);
      if (iVar3 == 0) {
        iVar3 = (**(code **)(*param_1 + 0x100))(param_1,pBVar5,pBVar6,param_5);
        if ((((iVar3 != 0) &&
             (iVar3 = (**(code **)(*param_1 + 0x108))(param_1,pBVar5,param_1[0xd],pBVar5,param_5),
             iVar3 != 0)) && (iVar3 = BN_GF2m_add(pBVar5,param_1[0xc],pBVar5), iVar3 != 0)) &&
           (iVar3 = BN_GF2m_add(pBVar5,pBVar6,pBVar5), iVar3 != 0)) {
          ERR_set_mark();
          iVar3 = BN_GF2m_mod_solve_quad_arr(pBVar8,pBVar5,plVar1,param_5);
          if (iVar3 == 0) {
            uVar9 = ERR_peek_last_error();
            if (((uVar9 & 0xff800000) == 0x1800000) &&
               ((((int)(uint)uVar9 >> 0x1f & 0x7f800000U | 0x7fffff) & (uint)uVar9) == 0x74)) {
              iVar3 = ERR_pop_to_mark();
              ERR_new(iVar3);
              ERR_set_debug("crypto/ec/ec2_oct.c",0x58,
                            "ossl_ec_GF2m_simple_set_compressed_coordinates");
              uVar10 = 0x6e;
            }
            else {
              ERR_clear_last_mark();
              ERR_new();
              ERR_set_debug("crypto/ec/ec2_oct.c",0x5d,
                            "ossl_ec_GF2m_simple_set_compressed_coordinates");
              uVar10 = 0x80003;
            }
            ERR_set_error(0x10,uVar10,0);
          }
          else {
            ERR_clear_last_mark();
            iVar3 = BN_is_odd(pBVar8);
            iVar4 = (**(code **)(*param_1 + 0xf8))(param_1,pBVar7,pBVar6,pBVar8,param_5);
            if (iVar4 != 0) {
              if ((param_4 != 0) != (iVar3 != 0)) {
                iVar3 = BN_GF2m_add(pBVar7,pBVar7,pBVar6);
                goto joined_r0x00a34fd0;
              }
              goto LAB_00a34ec0;
            }
          }
        }
      }
      else {
        iVar3 = BN_GF2m_mod_sqrt_arr(pBVar7,param_1[0xd],plVar1,param_5);
joined_r0x00a34fd0:
        if (iVar3 != 0) {
LAB_00a34ec0:
          iVar3 = EC_POINT_set_affine_coordinates(param_1,param_2,pBVar6,pBVar7,param_5);
          bVar2 = iVar3 != 0;
          goto LAB_00a35068;
        }
      }
    }
  }
  bVar2 = false;
LAB_00a35068:
  BN_CTX_end(param_5);
  BN_CTX_free(c);
  return bVar2;
}

