/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f7170
 */

void ossl_asn1_primitive_free(long *param_1,char *param_2,int param_3)

{
  int iVar1;
  code *UNRECOVERED_JUMPTABLE;
  long lVar2;
  
  if (param_2 == (char *)0x0) {
    iVar1 = *(int *)*param_1;
    param_1 = (long *)((int *)*param_1 + 2);
    lVar2 = *param_1;
joined_r0x009f71a8:
    if (lVar2 == 0) {
      return;
    }
    switch(iVar1) {
    case 1:
      if (param_2 == (char *)0x0) {
        *(int *)param_1 = -1;
        return;
      }
LAB_009f7250:
      *(int *)param_1 = (int)*(undefined8 *)(param_2 + 0x28);
      return;
    case 5:
      break;
    case 6:
      ASN1_OBJECT_free((ASN1_OBJECT *)*param_1);
      break;
    case -4:
      ossl_asn1_primitive_free(param_1,0,0);
      CRYPTO_free((void *)*param_1);
      break;
    default:
      goto switchD_009f71c8_caseD_fffffffd;
    }
  }
  else {
    lVar2 = *(long *)(param_2 + 0x20);
    if (param_3 == 0) {
      if (lVar2 != 0) {
        UNRECOVERED_JUMPTABLE = *(code **)(lVar2 + 0x18);
        goto joined_r0x009f71fc;
      }
    }
    else if (lVar2 != 0) {
      UNRECOVERED_JUMPTABLE = *(code **)(lVar2 + 0x20);
joined_r0x009f71fc:
      if (UNRECOVERED_JUMPTABLE != (code *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x009f720c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*UNRECOVERED_JUMPTABLE)(param_1);
        return;
      }
    }
    if (*param_2 != '\x05') {
      iVar1 = *(int *)(param_2 + 8);
      if (iVar1 == 1) goto LAB_009f7250;
      lVar2 = *param_1;
      goto joined_r0x009f71a8;
    }
    if (*param_1 == 0) {
      return;
    }
switchD_009f71c8_caseD_fffffffd:
    ossl_asn1_string_embed_free(*param_1,param_3);
  }
  *param_1 = 0;
  return;
}

