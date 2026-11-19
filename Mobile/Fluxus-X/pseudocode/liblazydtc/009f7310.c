/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f7310
 */

/* WARNING: Type propagation algorithm not settling */

undefined8
FUN_009f7310(long *param_1,undefined1 *param_2,int param_3,undefined8 param_4,undefined8 param_5)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  long lVar4;
  code *pcVar5;
  
  lVar2 = *(long *)(param_2 + 0x20);
  if ((lVar2 == 0) || (pcVar5 = *(code **)(lVar2 + 0x18), pcVar5 == (code *)0x0)) {
    pcVar5 = (code *)0x0;
  }
  uVar3 = 1;
  switch(*param_2) {
  case 0:
    if (*(long *)(param_2 + 0x10) != 0) {
      iVar1 = FUN_009f7610(param_1,*(long *)(param_2 + 0x10),param_4,param_5);
      goto joined_r0x009f750c;
    }
    break;
  case 1:
  case 6:
    if (pcVar5 == (code *)0x0) {
LAB_009f7398:
      if (param_3 == 0) {
        lVar2 = CRYPTO_zalloc(*(undefined8 *)(param_2 + 0x28),"crypto/asn1/tasn_new.c",0x88);
        *param_1 = lVar2;
        if (lVar2 == 0) goto LAB_009f75b0;
      }
      else {
        memset((void *)*param_1,0,*(size_t *)(param_2 + 0x28));
      }
      iVar1 = ossl_asn1_do_lock(param_1,0,param_2);
      if (-1 < iVar1) {
        ossl_asn1_enc_init(param_1,param_2);
        if (0 < *(long *)(param_2 + 0x18)) {
          lVar4 = *(long *)(param_2 + 0x10);
          lVar2 = 0;
          do {
            uVar3 = ossl_asn1_get_field_ptr(param_1,lVar4);
            iVar1 = FUN_009f7610(uVar3,lVar4,param_4,param_5);
            if (iVar1 == 0) {
              ossl_asn1_item_embed_free(param_1,param_2,param_3);
              goto LAB_009f75b0;
            }
            lVar2 = lVar2 + 1;
            lVar4 = lVar4 + 0x28;
          } while (lVar2 < *(long *)(param_2 + 0x18));
        }
        goto joined_r0x009f7540;
      }
      if (param_3 == 0) {
        CRYPTO_free((void *)*param_1);
        *param_1 = 0;
      }
      goto LAB_009f75b0;
    }
    iVar1 = (*pcVar5)(0,param_1,param_2,0);
    if (iVar1 != 0) {
      if (iVar1 == 2) goto LAB_009f7598;
      goto LAB_009f7398;
    }
LAB_009f7570:
    ERR_new();
    ERR_set_debug("crypto/asn1/tasn_new.c",0xa9,"asn1_item_embed_new");
    uVar3 = 100;
    goto LAB_009f75d8;
  case 2:
    if (pcVar5 != (code *)0x0) {
      iVar1 = (*pcVar5)(0,param_1,param_2,0);
      if (iVar1 == 0) goto LAB_009f7570;
      if (iVar1 == 2) goto LAB_009f7598;
    }
    if (param_3 == 0) {
      lVar2 = CRYPTO_zalloc(*(undefined8 *)(param_2 + 0x28),"crypto/asn1/tasn_new.c",0x72);
      *param_1 = lVar2;
      if (lVar2 != 0) goto LAB_009f7530;
      goto LAB_009f75b0;
    }
    memset((void *)*param_1,0,*(size_t *)(param_2 + 0x28));
LAB_009f7530:
    ossl_asn1_set_choice_selector(param_1,0xffffffff,param_2);
joined_r0x009f7540:
    if (pcVar5 != (code *)0x0) {
      iVar1 = (*pcVar5)(1,param_1,param_2,0);
      if (iVar1 != 0) {
        return 1;
      }
      ossl_asn1_item_embed_free(param_1,param_2,param_3);
      goto LAB_009f7570;
    }
    goto LAB_009f7598;
  default:
    goto switchD_009f7370_caseD_3;
  case 4:
    if (lVar2 == 0) goto LAB_009f7598;
    if (*(code **)(lVar2 + 0x38) == (code *)0x0) {
      if (*(code **)(lVar2 + 8) == (code *)0x0) goto LAB_009f7598;
      iVar1 = (**(code **)(lVar2 + 8))(param_1,param_2);
    }
    else {
      iVar1 = (**(code **)(lVar2 + 0x38))(param_1,param_2,param_4,param_5);
    }
    goto joined_r0x009f750c;
  case 5:
    break;
  }
  iVar1 = FUN_009f76f0(param_1,param_2,param_3);
joined_r0x009f750c:
  if (iVar1 == 0) {
LAB_009f75b0:
    ERR_new();
    ERR_set_debug("crypto/asn1/tasn_new.c",0xa3,"asn1_item_embed_new");
    uVar3 = 0xc0100;
LAB_009f75d8:
    ERR_set_error(0xd,uVar3,0);
    uVar3 = 0;
  }
  else {
LAB_009f7598:
    uVar3 = 1;
  }
switchD_009f7370_caseD_3:
  return uVar3;
}

