/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a75d88
 */

undefined8 EVP_PKEY_CTX_get_params(int *param_1,undefined8 param_2)

{
  int iVar1;
  uint uVar2;
  undefined8 uVar3;
  code *UNRECOVERED_JUMPTABLE;
  
  uVar2 = evp_pkey_ctx_state();
  if (uVar2 < 2) {
    uVar3 = evp_pkey_ctx_get_params_to_ctrl(param_1,param_2);
    return uVar3;
  }
  if (uVar2 != 2) {
    return 0;
  }
  iVar1 = *param_1;
  if (iVar1 < 0x200) {
    if ((((0x30 < iVar1 - 0x10U) ||
         ((1L << ((ulong)(iVar1 - 0x10U) & 0x3f) & 0x1000000010001U) == 0)) && (iVar1 != 0x80)) &&
       (iVar1 != 0x100)) {
      return 0;
    }
    if (*(long *)(param_1 + 10) == 0) {
      return 0;
    }
    UNRECOVERED_JUMPTABLE = *(code **)(*(long *)(param_1 + 10) + 0xb8);
  }
  else {
    if (iVar1 < 0x800) {
      if ((iVar1 != 0x200) && (iVar1 != 0x400)) {
        return 0;
      }
      if ((*(long *)(param_1 + 10) != 0) &&
         (UNRECOVERED_JUMPTABLE = *(code **)(*(long *)(param_1 + 10) + 0x68),
         UNRECOVERED_JUMPTABLE != (code *)0x0)) goto LAB_00a75e88;
      if ((iVar1 != 0x2000) && (iVar1 != 0x1000)) {
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
      UNRECOVERED_JUMPTABLE = *(code **)(*(long *)(param_1 + 10) + 0x70);
      goto joined_r0x00a75e84;
    }
    if (*(long *)(param_1 + 10) == 0) {
      return 0;
    }
    UNRECOVERED_JUMPTABLE = *(code **)(*(long *)(param_1 + 10) + 0x68);
  }
joined_r0x00a75e84:
  if (UNRECOVERED_JUMPTABLE == (code *)0x0) {
    return 0;
  }
LAB_00a75e88:
                    /* WARNING: Could not recover jumptable at 0x00a75e98. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar3 = (*UNRECOVERED_JUMPTABLE)(*(undefined8 *)(param_1 + 0xc),param_2);
  return uVar3;
}

