/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a75eac
 */

undefined8 EVP_PKEY_CTX_gettable_params(int *param_1)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  code *UNRECOVERED_JUMPTABLE;
  
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
    if (*(long *)(*(long *)(param_1 + 10) + 0xc0) == 0) {
      return 0;
    }
    EVP_SIGNATURE_get0_provider();
    uVar2 = ossl_provider_ctx();
    uVar3 = *(undefined8 *)(param_1 + 0xc);
    UNRECOVERED_JUMPTABLE = *(code **)(*(long *)(param_1 + 10) + 0xc0);
    goto LAB_00a75fbc;
  }
  if (iVar1 < 0x800) {
    if ((iVar1 != 0x200) && (iVar1 != 0x400)) {
      return 0;
    }
    if ((*(long *)(param_1 + 10) == 0) || (*(long *)(*(long *)(param_1 + 10) + 0x70) == 0)) {
      if ((iVar1 != 0x2000) && (iVar1 != 0x1000)) {
        return 0;
      }
      goto LAB_00a75f9c;
    }
    EVP_ASYM_CIPHER_get0_provider();
  }
  else {
    if ((iVar1 != 0x2000) && (iVar1 != 0x1000)) {
      if (iVar1 != 0x800) {
        return 0;
      }
      if (*(long *)(param_1 + 10) == 0) {
        return 0;
      }
      if (*(long *)(*(long *)(param_1 + 10) + 0x78) == 0) {
        return 0;
      }
      EVP_KEYEXCH_get0_provider();
      uVar2 = ossl_provider_ctx();
      uVar3 = *(undefined8 *)(param_1 + 0xc);
      UNRECOVERED_JUMPTABLE = *(code **)(*(long *)(param_1 + 10) + 0x78);
      goto LAB_00a75fbc;
    }
LAB_00a75f9c:
    if ((*(long *)(param_1 + 10) == 0) || (*(long *)(*(long *)(param_1 + 10) + 0x70) == 0)) {
      return 0;
    }
    EVP_KEM_get0_provider();
  }
  uVar2 = ossl_provider_ctx();
  uVar3 = *(undefined8 *)(param_1 + 0xc);
  UNRECOVERED_JUMPTABLE = *(code **)(*(long *)(param_1 + 10) + 0x70);
LAB_00a75fbc:
                    /* WARNING: Could not recover jumptable at 0x00a75fcc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar3 = (*UNRECOVERED_JUMPTABLE)(uVar3,uVar2);
  return uVar3;
}

