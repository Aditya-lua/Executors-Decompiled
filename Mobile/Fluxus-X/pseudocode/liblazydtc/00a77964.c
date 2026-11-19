/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a77964
 */

undefined8 EVP_PKEY_CTX_get0_provider(int *param_1)

{
  int iVar1;
  undefined8 uVar2;
  
  iVar1 = *param_1;
  if (0xff < iVar1) {
    if (0x7ff < iVar1) {
      if (iVar1 == 0x800) {
        if (*(long *)(param_1 + 10) == 0) {
          return 0;
        }
        uVar2 = EVP_KEYEXCH_get0_provider();
        return uVar2;
      }
      if ((iVar1 != 0x1000) && (iVar1 != 0x2000)) {
        return 0;
      }
      if (*(long *)(param_1 + 10) == 0) {
        return 0;
      }
      uVar2 = EVP_KEM_get0_provider();
      return uVar2;
    }
    if (iVar1 != 0x100) {
      if ((iVar1 != 0x200) && (iVar1 != 0x400)) {
        return 0;
      }
      if (*(long *)(param_1 + 10) == 0) {
        return 0;
      }
      uVar2 = EVP_ASYM_CIPHER_get0_provider();
      return uVar2;
    }
    goto switchD_00a7798c_caseD_10;
  }
  switch(iVar1) {
  case 2:
  case 4:
    if (*(long *)(param_1 + 8) != 0) {
      uVar2 = EVP_KEYMGMT_get0_provider();
      return uVar2;
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
      return 0;
    }
  case 0x10:
  case 0x20:
switchD_00a7798c_caseD_10:
    if (*(long *)(param_1 + 10) != 0) {
      uVar2 = EVP_SIGNATURE_get0_provider();
      return uVar2;
    }
  }
  return 0;
}

