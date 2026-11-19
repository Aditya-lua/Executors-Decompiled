/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a75fe0
 */

undefined8 EVP_PKEY_CTX_settable_params(int *param_1)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  code *UNRECOVERED_JUMPTABLE;
  
  iVar1 = *param_1;
  if (iVar1 < 0x100) {
    switch(iVar1) {
    case 2:
    case 4:
switchD_00a76018_caseD_2:
      if ((*(long *)(param_1 + 8) != 0) && (*(long *)(*(long *)(param_1 + 8) + 0x78) != 0)) {
        EVP_KEYMGMT_get0_provider();
        uVar2 = ossl_provider_ctx();
        uVar3 = *(undefined8 *)(param_1 + 10);
        UNRECOVERED_JUMPTABLE = *(code **)(*(long *)(param_1 + 8) + 0x78);
        break;
      }
      if ((iVar1 != 0x2000) && (iVar1 != 0x1000)) {
        return 0;
      }
LAB_00a76128:
      if (*(long *)(param_1 + 10) == 0) {
        return 0;
      }
      if (*(long *)(*(long *)(param_1 + 10) + 0x80) == 0) {
        return 0;
      }
      EVP_KEM_get0_provider();
      goto LAB_00a7613c;
    case 3:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    case 10:
    case 0xb:
    case 0xc:
    case 0xd:
    case 0xe:
    case 0xf:
    case 0x11:
    case 0x12:
    case 0x13:
    case 0x14:
    case 0x15:
    case 0x16:
    case 0x17:
    case 0x18:
    case 0x19:
    case 0x1a:
    case 0x1b:
    case 0x1c:
    case 0x1d:
    case 0x1e:
    case 0x1f:
      goto switchD_00a76018_caseD_3;
    default:
      if ((iVar1 != 0x40) && (iVar1 != 0x80)) {
        return 0;
      }
    case 0x10:
    case 0x20:
switchD_00a76018_caseD_10:
      if ((*(long *)(param_1 + 10) == 0) || (*(long *)(*(long *)(param_1 + 10) + 0xd0) == 0)) {
switchD_00a76018_caseD_3:
        return 0;
      }
      EVP_SIGNATURE_get0_provider();
      uVar2 = ossl_provider_ctx();
      uVar3 = *(undefined8 *)(param_1 + 0xc);
      UNRECOVERED_JUMPTABLE = *(code **)(*(long *)(param_1 + 10) + 0xd0);
    }
  }
  else {
    if (0x7ff < iVar1) {
      if ((iVar1 != 0x2000) && (iVar1 != 0x1000)) {
        if (iVar1 != 0x800) {
          return 0;
        }
        if (*(long *)(param_1 + 10) == 0) {
          return 0;
        }
        if (*(long *)(*(long *)(param_1 + 10) + 0x68) == 0) {
          return 0;
        }
        EVP_KEYEXCH_get0_provider();
        uVar2 = ossl_provider_ctx();
        uVar3 = *(undefined8 *)(param_1 + 0xc);
        UNRECOVERED_JUMPTABLE = *(code **)(*(long *)(param_1 + 10) + 0x68);
        goto LAB_00a76148;
      }
      goto LAB_00a76128;
    }
    if (iVar1 == 0x100) goto switchD_00a76018_caseD_10;
    if ((iVar1 != 0x200) && (iVar1 != 0x400)) {
      return 0;
    }
    if ((*(long *)(param_1 + 10) == 0) || (*(long *)(*(long *)(param_1 + 10) + 0x80) == 0)) {
      if (iVar1 < 0x1000) {
        if ((iVar1 != 2) && (iVar1 != 4)) {
          return 0;
        }
        goto switchD_00a76018_caseD_2;
      }
      if ((iVar1 != 0x1000) && (iVar1 != 0x2000)) {
        return 0;
      }
      goto LAB_00a76128;
    }
    EVP_ASYM_CIPHER_get0_provider();
LAB_00a7613c:
    uVar2 = ossl_provider_ctx();
    uVar3 = *(undefined8 *)(param_1 + 0xc);
    UNRECOVERED_JUMPTABLE = *(code **)(*(long *)(param_1 + 10) + 0x80);
  }
LAB_00a76148:
                    /* WARNING: Could not recover jumptable at 0x00a76158. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar3 = (*UNRECOVERED_JUMPTABLE)(uVar3,uVar2);
  return uVar3;
}

