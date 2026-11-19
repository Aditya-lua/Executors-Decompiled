/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af9744
 */

bool FUN_00af9744(int *param_1)

{
  ASN1_VALUE *pAVar1;
  bool bVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  int *piVar6;
  ASN1_VALUE *val;
  BIGNUM *pBVar7;
  ASN1_INTEGER *pAVar8;
  undefined8 *puVar9;
  undefined8 uVar10;
  BIGNUM *bn;
  ASN1_INTEGER *x;
  ASN1_INTEGER *y;
  ASN1_INTEGER *y_00;
  ASN1_INTEGER *pAVar11;
  
  if ((param_1 == (int *)0x0) || (*param_1 == 0)) {
    bVar2 = true;
  }
  else if ((*param_1 == 1) && (iVar3 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 2)), iVar3 != 0)) {
    OPENSSL_sk_sort(*(undefined8 *)(param_1 + 2));
    iVar3 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 2));
    uVar10 = *(undefined8 *)(param_1 + 2);
    if (iVar3 < 2) {
      bn = (BIGNUM *)0x0;
      pAVar8 = (ASN1_INTEGER *)0x0;
    }
    else {
      bn = (BIGNUM *)0x0;
      iVar3 = 0;
      pAVar11 = (ASN1_INTEGER *)0x0;
      do {
        piVar6 = (int *)OPENSSL_sk_value(uVar10,iVar3);
        iVar5 = iVar3 + 1;
        val = (ASN1_VALUE *)OPENSSL_sk_value(*(undefined8 *)(param_1 + 2),iVar5);
        if (piVar6 == (int *)0x0) goto LAB_00af9a98;
        if (*piVar6 == 1) {
          x = (ASN1_INTEGER *)**(undefined8 **)(piVar6 + 2);
          pAVar8 = (ASN1_INTEGER *)(*(undefined8 **)(piVar6 + 2))[1];
          if (val != (ASN1_VALUE *)0x0) goto LAB_00af9808;
LAB_00af9a60:
          goto LAB_00af9a98;
        }
        if (*piVar6 != 0) goto LAB_00af9a98;
        x = *(ASN1_INTEGER **)(piVar6 + 2);
        pAVar8 = x;
        if (val == (ASN1_VALUE *)0x0) goto LAB_00af9a60;
LAB_00af9808:
        if (*(int *)val == 1) {
          y_00 = (ASN1_INTEGER *)**(undefined8 **)(val + 8);
          y = (ASN1_INTEGER *)(*(undefined8 **)(val + 8))[1];
        }
        else {
          if (*(int *)val != 0) goto LAB_00af9a60;
          y = *(ASN1_INTEGER **)(val + 8);
          y_00 = y;
        }
        iVar4 = ASN1_INTEGER_cmp(x,y_00);
        if (((0 < iVar4) || (iVar4 = ASN1_INTEGER_cmp(x,pAVar8), 0 < iVar4)) ||
           (iVar4 = ASN1_INTEGER_cmp(y_00,y), 0 < iVar4)) goto LAB_00af9a60;
        iVar4 = ASN1_INTEGER_cmp(pAVar8,y_00);
        if (-1 < iVar4) {
          ERR_new();
          ERR_set_debug("crypto/x509/v3_asid.c",0x1a8,"ASIdentifierChoice_canonize");
          ERR_set_error(0x22,0x74,0);
          goto LAB_00af9a60;
        }
        if (((bn == (BIGNUM *)0x0) && (bn = BN_new(), bn == (BIGNUM *)0x0)) ||
           ((pBVar7 = ASN1_INTEGER_to_BN(pAVar8,bn), pBVar7 == (BIGNUM *)0x0 ||
            (iVar4 = BN_add_word(bn,1), iVar4 == 0)))) {
          ERR_new();
          uVar10 = 0x1b2;
LAB_00af9a80:
          ERR_set_debug("crypto/x509/v3_asid.c",uVar10,"ASIdentifierChoice_canonize");
          ERR_set_error(0x22,0xc0100,0);
          goto LAB_00af9a98;
        }
        pAVar8 = BN_to_ASN1_INTEGER(bn,pAVar11);
        if (pAVar8 == (ASN1_INTEGER *)0x0) {
          ERR_new();
          uVar10 = 0x1b9;
          goto LAB_00af9a80;
        }
        iVar4 = ASN1_INTEGER_cmp(pAVar8,y_00);
        pAVar11 = pAVar8;
        if (iVar4 == 0) {
          if (*piVar6 == 1) {
            ASN1_INTEGER_free(*(ASN1_STRING **)(*(long *)(piVar6 + 2) + 8));
            *(ASN1_INTEGER **)(*(long *)(piVar6 + 2) + 8) = y;
          }
          else if (*piVar6 == 0) {
            puVar9 = CRYPTO_malloc(0x10,"crypto/x509/v3_asid.c",0x1c4);
            if (puVar9 == (undefined8 *)0x0) {
              ERR_new();
              uVar10 = 0x1c5;
              goto LAB_00af9a80;
            }
            *puVar9 = x;
            puVar9[1] = y;
            *piVar6 = 1;
            *(undefined8 **)(piVar6 + 2) = puVar9;
          }
          if (*(int *)val == 1) {
            pAVar1 = *(ASN1_VALUE **)(val + 8);
LAB_00af9944:
            *(undefined8 *)(pAVar1 + 8) = 0;
          }
          else {
            pAVar1 = val;
            if (*(int *)val == 0) goto LAB_00af9944;
          }
          ASN1_item_free(val,(ASN1_ITEM *)&DAT_00c7eb88);
          OPENSSL_sk_delete(*(undefined8 *)(param_1 + 2),iVar5);
        }
        else {
          iVar3 = iVar5;
        }
        iVar5 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 2));
        uVar10 = *(undefined8 *)(param_1 + 2);
      } while (iVar3 < iVar5 + -1);
    }
    iVar3 = OPENSSL_sk_num(uVar10);
    piVar6 = (int *)OPENSSL_sk_value(*(undefined8 *)(param_1 + 2),iVar3 + -1);
    if (((piVar6 == (int *)0x0) || (*piVar6 != 1)) ||
       (iVar3 = ASN1_INTEGER_cmp((ASN1_INTEGER *)**(undefined8 **)(piVar6 + 2),
                                 (ASN1_INTEGER *)(*(undefined8 **)(piVar6 + 2))[1]),
       pAVar11 = pAVar8, iVar3 < 1)) {
      iVar3 = FUN_00af94bc(param_1);
      bVar2 = iVar3 != 0;
    }
    else {
LAB_00af9a98:
      bVar2 = false;
      pAVar8 = pAVar11;
    }
    ASN1_INTEGER_free(pAVar8);
    BN_free(bn);
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/x509/v3_asid.c",0x180,"ASIdentifierChoice_canonize");
    ERR_set_error(0x22,0x74,0);
    bVar2 = false;
  }
  return bVar2;
}

