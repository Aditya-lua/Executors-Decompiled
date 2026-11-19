/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b107c
 */

undefined4 SSL_CIPHER_get_kx_nid(long param_1)

{
  int iVar1;
  undefined4 uVar2;
  long lVar3;
  
  iVar1 = *(int *)(param_1 + 0x1c);
  uVar2 = 0;
  if (iVar1 < 0x80) {
    lVar3 = 0;
    switch(iVar1) {
    case 0:
      lVar3 = 10;
      break;
    case 1:
      break;
    case 2:
      lVar3 = 2;
      break;
    default:
      goto switchD_009b10ac_caseD_3;
    case 4:
      lVar3 = 1;
      break;
    case 8:
      lVar3 = 6;
      break;
    case 0x10:
      lVar3 = 8;
      break;
    case 0x20:
      lVar3 = 7;
      break;
    case 0x40:
      lVar3 = 5;
    }
  }
  else if (iVar1 == 0x80) {
    lVar3 = 3;
  }
  else if (iVar1 == 0x100) {
    lVar3 = 4;
  }
  else {
    if (iVar1 != 0x200) {
      return 0;
    }
    lVar3 = 9;
  }
  uVar2 = (&DAT_0074bfc8)[lVar3 * 2];
switchD_009b10ac_caseD_3:
  return uVar2;
}

