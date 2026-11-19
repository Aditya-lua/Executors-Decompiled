/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af94bc
 */

bool FUN_00af94bc(int *param_1)

{
  int iVar1;
  int iVar2;
  int *piVar3;
  int *piVar4;
  BIGNUM *pBVar5;
  ASN1_INTEGER *pAVar6;
  undefined8 uVar7;
  BIGNUM *bn;
  ASN1_INTEGER *ai;
  bool bVar8;
  ASN1_INTEGER *y;
  ASN1_INTEGER *y_00;
  ASN1_INTEGER *y_01;
  
  if ((param_1 == (int *)0x0) || (*param_1 == 0)) {
    bVar8 = true;
  }
  else if ((*param_1 == 1) && (iVar1 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 2)), iVar1 != 0)) {
    bn = (BIGNUM *)0x0;
    iVar1 = 1;
    ai = (ASN1_INTEGER *)0x0;
    do {
      iVar2 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 2));
      if (iVar2 + -1 <= iVar1 + -1) {
        iVar1 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 2));
        piVar3 = (int *)OPENSSL_sk_value(*(undefined8 *)(param_1 + 2),iVar1 + -1);
        if ((piVar3 == (int *)0x0) || (*piVar3 != 1)) {
          bVar8 = true;
        }
        else {
          iVar1 = ASN1_INTEGER_cmp((ASN1_INTEGER *)**(undefined8 **)(piVar3 + 2),
                                   (ASN1_INTEGER *)(*(undefined8 **)(piVar3 + 2))[1]);
          bVar8 = iVar1 < 1;
        }
        goto LAB_00af96cc;
      }
      piVar3 = (int *)OPENSSL_sk_value(*(undefined8 *)(param_1 + 2),iVar1 + -1);
      piVar4 = (int *)OPENSSL_sk_value(*(undefined8 *)(param_1 + 2),iVar1);
      if (piVar3 == (int *)0x0) {
LAB_00af96c8:
        bVar8 = false;
        goto LAB_00af96cc;
      }
      if (*piVar3 != 1) {
        if ((*piVar3 == 0) &&
           (y_00 = *(ASN1_INTEGER **)(piVar3 + 2), pAVar6 = y_00, piVar4 != (int *)0x0))
        goto LAB_00af9570;
        goto LAB_00af96c8;
      }
      pAVar6 = (ASN1_INTEGER *)**(undefined8 **)(piVar3 + 2);
      y_00 = (ASN1_INTEGER *)(*(undefined8 **)(piVar3 + 2))[1];
      if (piVar4 == (int *)0x0) goto LAB_00af96c8;
LAB_00af9570:
      if (*piVar4 == 1) {
        y = (ASN1_INTEGER *)**(undefined8 **)(piVar4 + 2);
        y_01 = (ASN1_INTEGER *)(*(undefined8 **)(piVar4 + 2))[1];
      }
      else {
        if (*piVar4 != 0) goto LAB_00af96c8;
        y = *(ASN1_INTEGER **)(piVar4 + 2);
        y_01 = y;
      }
      iVar2 = ASN1_INTEGER_cmp(pAVar6,y);
      if (((-1 < iVar2) || (iVar2 = ASN1_INTEGER_cmp(pAVar6,y_00), 0 < iVar2)) ||
         (iVar2 = ASN1_INTEGER_cmp(y,y_01), 0 < iVar2)) goto LAB_00af96c8;
      if (((bn == (BIGNUM *)0x0) && (bn = BN_new(), bn == (BIGNUM *)0x0)) ||
         ((pBVar5 = ASN1_INTEGER_to_BN(y_00,bn), pBVar5 == (BIGNUM *)0x0 ||
          (iVar2 = BN_add_word(bn,1), iVar2 == 0)))) {
        ERR_new();
        uVar7 = 0x139;
LAB_00af96b0:
        ERR_set_debug("crypto/x509/v3_asid.c",uVar7,"ASIdentifierChoice_is_canonical");
        ERR_set_error(0x22,0xc0100,0);
        goto LAB_00af96c8;
      }
      pAVar6 = BN_to_ASN1_INTEGER(bn,ai);
      if (pAVar6 == (ASN1_INTEGER *)0x0) {
        ERR_new();
        uVar7 = 0x140;
        goto LAB_00af96b0;
      }
      iVar2 = ASN1_INTEGER_cmp(pAVar6,y);
      iVar1 = iVar1 + 1;
      ai = pAVar6;
    } while (iVar2 < 0);
    bVar8 = false;
LAB_00af96cc:
    ASN1_INTEGER_free(ai);
    BN_free(bn);
  }
  else {
    bVar8 = false;
  }
  return bVar8;
}

