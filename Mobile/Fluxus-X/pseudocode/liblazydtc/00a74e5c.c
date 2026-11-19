/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a74e5c
 */

int evp_pkey_ctx_state(int *param_1)

{
  int iVar1;
  
  iVar1 = *param_1;
  if (iVar1 < 0x80) {
    switch(iVar1) {
    case 0:
      goto switchD_00a74eac_caseD_0;
    case 1:
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
    case 2:
    case 4:
switchD_00a74eac_caseD_2:
      if (*(long *)(param_1 + 10) != 0) {
        return 2;
      }
      if ((iVar1 == 0x2000) || (iVar1 == 0x1000)) goto switchD_00a74eac_caseD_10;
      break;
    case 0x10:
    case 0x20:
switchD_00a74eac_caseD_10:
      if (*(long *)(param_1 + 0xc) != 0) {
        return 2;
      }
      break;
    default:
      if (iVar1 == 0x40) goto switchD_00a74eac_caseD_10;
    }
  }
  else if (iVar1 < 0x400) {
    if ((iVar1 == 0x80) || (iVar1 == 0x100)) goto switchD_00a74eac_caseD_10;
    if (iVar1 == 0x200) goto LAB_00a74ee4;
  }
  else {
    if (iVar1 < 0x1000) {
      if (iVar1 != 0x400) {
        if (iVar1 != 0x800) goto switchD_00a74eac_caseD_1;
        goto switchD_00a74eac_caseD_10;
      }
LAB_00a74ee4:
      if (*(long *)(param_1 + 0xc) != 0) {
        return 2;
      }
      if (iVar1 < 0x1000) {
        if ((iVar1 == 2) || (iVar1 == 4)) goto switchD_00a74eac_caseD_2;
        goto switchD_00a74eac_caseD_1;
      }
    }
    if ((iVar1 == 0x1000) || (iVar1 == 0x2000)) goto switchD_00a74eac_caseD_10;
  }
switchD_00a74eac_caseD_1:
  iVar1 = 1;
switchD_00a74eac_caseD_0:
  return iVar1;
}

