/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aff100
 */

undefined8 FUN_00aff100(uint *param_1,undefined8 *param_2)

{
  bool bVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  undefined8 *puVar5;
  BIGNUM *pBVar6;
  undefined8 uVar7;
  uint uVar8;
  
  uVar8 = *param_1;
  if (uVar8 == 0) {
    iVar2 = OBJ_obj2nid((ASN1_OBJECT *)**(undefined8 **)(param_1 + 2));
    uVar8 = (uint)(iVar2 == 0x4b8);
  }
  iVar2 = OPENSSL_sk_num(*param_2);
  if (0 < iVar2) {
    iVar4 = 0;
    iVar2 = 0;
    do {
      puVar5 = (undefined8 *)OPENSSL_sk_value(*param_2,iVar2);
      if ((uVar8 == *(uint *)*puVar5) &&
         ((uVar8 != 0 ||
          (iVar3 = OBJ_cmp((ASN1_OBJECT *)**(undefined8 **)(param_1 + 2),
                           (ASN1_OBJECT *)**(undefined8 **)((uint *)*puVar5 + 2)), iVar3 == 0)))) {
        bVar1 = puVar5[2] == 0;
        if ((ASN1_INTEGER *)puVar5[1] != (ASN1_INTEGER *)0x0) {
          pBVar6 = ASN1_INTEGER_to_BN((ASN1_INTEGER *)puVar5[1],(BIGNUM *)0x0);
          if ((pBVar6 == (BIGNUM *)0x0) || (iVar3 = BN_is_zero(pBVar6), iVar3 == 0)) {
            bVar1 = false;
          }
          BN_free(pBVar6);
        }
        if (!bVar1) {
          return 0x31;
        }
        if (iVar4 != 2) {
          if (iVar4 == 0) {
            iVar4 = 1;
          }
          uVar7 = FUN_00aff7f0(uVar8,param_1,*puVar5);
          if ((int)uVar7 == 0) {
            iVar4 = 2;
          }
          else if ((int)uVar7 != 0x2f) {
            return uVar7;
          }
        }
      }
      iVar2 = iVar2 + 1;
      iVar3 = OPENSSL_sk_num(*param_2);
    } while (iVar2 < iVar3);
    if (iVar4 == 1) {
      return 0x2f;
    }
  }
  iVar2 = OPENSSL_sk_num(param_2[1]);
  if (0 < iVar2) {
    iVar2 = 0;
    do {
      puVar5 = (undefined8 *)OPENSSL_sk_value(param_2[1],iVar2);
      if ((uVar8 == *(uint *)*puVar5) &&
         ((uVar8 != 0 ||
          (iVar4 = OBJ_cmp((ASN1_OBJECT *)**(undefined8 **)(param_1 + 2),
                           (ASN1_OBJECT *)**(undefined8 **)((uint *)*puVar5 + 2)), iVar4 == 0)))) {
        bVar1 = puVar5[2] == 0;
        if ((ASN1_INTEGER *)puVar5[1] != (ASN1_INTEGER *)0x0) {
          pBVar6 = ASN1_INTEGER_to_BN((ASN1_INTEGER *)puVar5[1],(BIGNUM *)0x0);
          if ((pBVar6 == (BIGNUM *)0x0) || (iVar4 = BN_is_zero(pBVar6), iVar4 == 0)) {
            bVar1 = false;
          }
          BN_free(pBVar6);
        }
        if (!bVar1) {
          return 0x31;
        }
        uVar7 = FUN_00aff7f0(uVar8,param_1,*puVar5);
        if ((int)uVar7 != 0x2f) {
          if ((int)uVar7 == 0) {
            return 0x30;
          }
          return uVar7;
        }
      }
      iVar2 = iVar2 + 1;
      iVar4 = OPENSSL_sk_num(param_2[1]);
    } while (iVar2 < iVar4);
  }
  return 0;
}

