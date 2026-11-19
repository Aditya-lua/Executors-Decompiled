/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f76f0
 */

ulong FUN_009f76f0(long *param_1,char *param_2,int param_3)

{
  int type;
  undefined4 *puVar1;
  ulong uVar2;
  ASN1_OBJECT *pAVar3;
  long lVar4;
  ASN1_STRING *pAVar5;
  
  if (param_2 == (char *)0x0) {
    return 0;
  }
  lVar4 = *(long *)(param_2 + 0x20);
  if (lVar4 != 0) {
    if (param_3 == 0) {
      if (*(code **)(lVar4 + 0x10) != (code *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x009f7750. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        uVar2 = (**(code **)(lVar4 + 0x10))(param_1,param_2);
        return uVar2;
      }
    }
    else if (*(code **)(lVar4 + 0x20) != (code *)0x0) {
      (**(code **)(lVar4 + 0x20))(param_1,param_2);
      return 1;
    }
  }
  if (*param_2 == '\x05') {
    type = -1;
switchD_009f77a4_caseD_fffffffd:
    if (param_3 == 0) {
      pAVar5 = ASN1_STRING_type_new(type);
      *param_1 = (long)pAVar5;
    }
    else {
      pAVar5 = (ASN1_STRING *)*param_1;
      pAVar5->length = 0;
      pAVar5->type = 0;
      pAVar5->data = (uchar *)0x0;
      pAVar5->type = type;
      pAVar5->flags = 0x80;
    }
    if ((pAVar5 != (ASN1_STRING *)0x0) && (*param_2 == '\x05')) {
      pAVar5->flags = pAVar5->flags | 0x40;
    }
LAB_009f77fc:
    uVar2 = (ulong)(*param_1 != 0);
  }
  else {
    type = *(int *)(param_2 + 8);
    switch(type) {
    case 1:
      uVar2 = 1;
      *(int *)param_1 = (int)*(undefined8 *)(param_2 + 0x28);
      break;
    case 5:
      uVar2 = 1;
      *param_1 = 1;
      break;
    case 6:
      pAVar3 = OBJ_nid2obj(0);
      *param_1 = (long)pAVar3;
      uVar2 = 1;
      break;
    case -4:
      puVar1 = CRYPTO_malloc(0x10,"crypto/asn1/tasn_new.c",0x12d);
      if (puVar1 == (undefined4 *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/asn1/tasn_new.c",0x12e,"asn1_primitive_new");
        ERR_set_error(0xd,0xc0100,0);
        return 0;
      }
      *(undefined8 *)(puVar1 + 2) = 0;
      *puVar1 = 0xffffffff;
      *param_1 = (long)puVar1;
      goto LAB_009f77fc;
    default:
      goto switchD_009f77a4_caseD_fffffffd;
    }
  }
  return uVar2;
}

