/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f6e3c
 */

void ossl_asn1_item_embed_free(long *param_1,char *param_2,int param_3)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  void *ptr;
  long lVar4;
  long lVar5;
  code *pcVar6;
  
  if (param_1 == (long *)0x0) {
    return;
  }
  lVar4 = *(long *)(param_2 + 0x20);
  if ((*param_2 != '\0') && (*param_1 == 0)) {
    return;
  }
  if ((lVar4 == 0) || (pcVar6 = *(code **)(lVar4 + 0x18), pcVar6 == (code *)0x0)) {
    pcVar6 = (code *)0x0;
  }
  switch(*param_2) {
  case '\0':
    if (*(long *)(param_2 + 0x10) != 0) {
      ossl_asn1_template_free(param_1);
      return;
    }
  case '\x05':
    ossl_asn1_primitive_free(param_1,param_2,param_3);
    return;
  case '\x01':
  case '\x06':
    iVar1 = ossl_asn1_do_lock(param_1,0xffffffff,param_2);
    if (iVar1 != 0) {
      return;
    }
    if ((pcVar6 != (code *)0x0) && (iVar1 = (*pcVar6)(2,param_1,param_2,0), iVar1 == 2)) {
      return;
    }
    ossl_asn1_enc_free(param_1,param_2);
    if (0 < *(long *)(param_2 + 0x18)) {
      lVar4 = 0;
      lVar5 = *(long *)(param_2 + 0x10) + *(long *)(param_2 + 0x18) * 0x28;
      do {
        lVar5 = lVar5 + -0x28;
        lVar2 = ossl_asn1_do_adb(*param_1,lVar5,0);
        if (lVar2 != 0) {
          uVar3 = ossl_asn1_get_field_ptr(param_1,lVar2);
          ossl_asn1_template_free(uVar3,lVar2);
        }
        lVar4 = lVar4 + 1;
      } while (lVar4 < *(long *)(param_2 + 0x18));
    }
    if (pcVar6 != (code *)0x0) {
      (*pcVar6)(3,param_1,param_2,0);
    }
    if (param_3 != 0) {
      return;
    }
    ptr = (void *)*param_1;
    break;
  case '\x02':
    if ((pcVar6 != (code *)0x0) && (iVar1 = (*pcVar6)(2,param_1,param_2,0), iVar1 == 2)) {
      return;
    }
    iVar1 = ossl_asn1_get_choice_selector(param_1,param_2);
    if ((-1 < iVar1) && ((long)iVar1 < *(long *)(param_2 + 0x18))) {
      lVar4 = *(long *)(param_2 + 0x10) + (long)iVar1 * 0x28;
      uVar3 = ossl_asn1_get_field_ptr(param_1,lVar4);
      ossl_asn1_template_free(uVar3,lVar4);
    }
    if (pcVar6 != (code *)0x0) {
      (*pcVar6)(3,param_1,param_2,0);
    }
    if (param_3 != 0) {
      return;
    }
    ptr = (void *)*param_1;
    break;
  default:
    goto switchD_009f6ea0_caseD_3;
  case '\x04':
    if (lVar4 == 0) {
      return;
    }
    if (*(code **)(lVar4 + 0x10) == (code *)0x0) {
      return;
    }
                    /* WARNING: Could not recover jumptable at 0x009f707c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (**(code **)(lVar4 + 0x10))(param_1,param_2);
    return;
  }
  CRYPTO_free(ptr);
  *param_1 = 0;
switchD_009f6ea0_caseD_3:
  return;
}

