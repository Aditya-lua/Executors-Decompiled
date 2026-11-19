/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7543c
 */

void evp_pkey_ctx_free_old_ops(int *param_1)

{
  int iVar1;
  
  iVar1 = *param_1;
  if (iVar1 < 0x100) {
    switch(iVar1) {
    case 2:
    case 4:
      if ((*(long *)(param_1 + 10) != 0) && (*(long *)(param_1 + 8) != 0)) {
        evp_keymgmt_gen_cleanup();
        return;
      }
      break;
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
      break;
    default:
      if ((iVar1 != 0x40) && (iVar1 != 0x80)) {
        return;
      }
    case 0x10:
    case 0x20:
switchD_00a75474_caseD_10:
      if ((*(long *)(param_1 + 0xc) != 0) && (*(long *)(param_1 + 10) != 0)) {
        (**(code **)(*(long *)(param_1 + 10) + 0xa8))();
      }
      EVP_SIGNATURE_free(*(undefined8 *)(param_1 + 10));
LAB_00a75544:
      param_1[10] = 0;
      param_1[0xb] = 0;
      param_1[0xc] = 0;
      param_1[0xd] = 0;
    }
    return;
  }
  if (iVar1 < 0x800) {
    if (iVar1 == 0x100) goto switchD_00a75474_caseD_10;
    if ((iVar1 != 0x200) && (iVar1 != 0x400)) {
      return;
    }
    if ((*(long *)(param_1 + 0xc) != 0) && (*(long *)(param_1 + 10) != 0)) {
      (**(code **)(*(long *)(param_1 + 10) + 0x58))();
    }
    EVP_ASYM_CIPHER_free(*(undefined8 *)(param_1 + 10));
  }
  else if (iVar1 == 0x800) {
    if ((*(long *)(param_1 + 0xc) != 0) && (*(long *)(param_1 + 10) != 0)) {
      (**(code **)(*(long *)(param_1 + 10) + 0x50))();
    }
    EVP_KEYEXCH_free(*(undefined8 *)(param_1 + 10));
  }
  else {
    if ((iVar1 != 0x1000) && (iVar1 != 0x2000)) {
      return;
    }
    if ((*(long *)(param_1 + 0xc) != 0) && (*(long *)(param_1 + 10) != 0)) {
      (**(code **)(*(long *)(param_1 + 10) + 0x58))();
    }
    EVP_KEM_free(*(undefined8 *)(param_1 + 10));
  }
  goto LAB_00a75544;
}

