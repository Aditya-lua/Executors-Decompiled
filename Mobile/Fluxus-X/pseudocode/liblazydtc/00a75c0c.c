/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a75c0c
 */

undefined8 EVP_PKEY_CTX_set_params(int *param_1,undefined8 param_2)

{
  int iVar1;
  uint uVar2;
  undefined8 uVar3;
  long lVar4;
  code *UNRECOVERED_JUMPTABLE;
  
  uVar2 = evp_pkey_ctx_state();
  if (uVar2 < 2) {
    uVar3 = evp_pkey_ctx_set_params_to_ctrl(param_1,param_2);
    return uVar3;
  }
  if (uVar2 != 2) {
    return 0;
  }
  iVar1 = *param_1;
  if (iVar1 < 0x100) {
    switch(iVar1) {
    case 2:
    case 4:
switchD_00a75c6c_caseD_2:
      lVar4 = *(long *)(param_1 + 8);
      if ((lVar4 != 0) && (*(long *)(lVar4 + 0x70) != 0)) {
        uVar3 = evp_keymgmt_gen_set_params(lVar4,*(undefined8 *)(param_1 + 10),param_2);
        return uVar3;
      }
      if ((iVar1 != 0x2000) && (iVar1 != 0x1000)) {
        return 0;
      }
      goto LAB_00a75d54;
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
      return 0;
    default:
      if ((iVar1 != 0x40) && (iVar1 != 0x80)) {
        return 0;
      }
    case 0x10:
    case 0x20:
switchD_00a75c6c_caseD_10:
      if (*(long *)(param_1 + 10) == 0) {
        return 0;
      }
      UNRECOVERED_JUMPTABLE = *(code **)(*(long *)(param_1 + 10) + 200);
    }
  }
  else {
    if (iVar1 < 0x800) {
      if (iVar1 == 0x100) goto switchD_00a75c6c_caseD_10;
      if ((iVar1 != 0x200) && (iVar1 != 0x400)) {
        return 0;
      }
      if ((*(long *)(param_1 + 10) != 0) &&
         (UNRECOVERED_JUMPTABLE = *(code **)(*(long *)(param_1 + 10) + 0x78),
         UNRECOVERED_JUMPTABLE != (code *)0x0)) goto LAB_00a75d64;
      if (iVar1 < 0x1000) {
        if ((iVar1 != 2) && (iVar1 != 4)) {
          return 0;
        }
        goto switchD_00a75c6c_caseD_2;
      }
      if ((iVar1 != 0x1000) && (iVar1 != 0x2000)) {
        return 0;
      }
    }
    else if ((iVar1 != 0x2000) && (iVar1 != 0x1000)) {
      if (iVar1 != 0x800) {
        return 0;
      }
      if (*(long *)(param_1 + 10) == 0) {
        return 0;
      }
      UNRECOVERED_JUMPTABLE = *(code **)(*(long *)(param_1 + 10) + 0x60);
      if (UNRECOVERED_JUMPTABLE == (code *)0x0) {
        return 0;
      }
      goto LAB_00a75d64;
    }
LAB_00a75d54:
    if (*(long *)(param_1 + 10) == 0) {
      return 0;
    }
    UNRECOVERED_JUMPTABLE = *(code **)(*(long *)(param_1 + 10) + 0x78);
  }
  if (UNRECOVERED_JUMPTABLE == (code *)0x0) {
    return 0;
  }
LAB_00a75d64:
                    /* WARNING: Could not recover jumptable at 0x00a75d74. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar3 = (*UNRECOVERED_JUMPTABLE)(*(undefined8 *)(param_1 + 0xc),param_2);
  return uVar3;
}

