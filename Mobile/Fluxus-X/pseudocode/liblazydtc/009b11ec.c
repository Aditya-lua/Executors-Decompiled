/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b11ec
 */

undefined8
ssl_cipher_get_overhead(long param_1,long *param_2,undefined8 *param_3,long *param_4,long *param_5)

{
  uint uVar1;
  int iVar2;
  char *pcVar3;
  EVP_MD *pEVar4;
  EVP_CIPHER *pEVar5;
  long lVar6;
  undefined8 uVar7;
  long lVar8;
  long lVar9;
  
  if ((*(uint *)(param_1 + 0x24) & 0x30f000) != 0) {
    lVar6 = 0;
    uVar7 = 0;
    lVar8 = 0;
    lVar9 = 0x18;
    goto LAB_009b1254;
  }
  if ((*(uint *)(param_1 + 0x24) & 0xb0000) != 0) {
    lVar6 = 0;
    uVar7 = 0;
    lVar8 = 0;
    lVar9 = 0x10;
    goto LAB_009b1254;
  }
  uVar1 = *(uint *)(param_1 + 0x28);
  if ((uVar1 >> 6 & 1) != 0) {
    return 0;
  }
  iVar2 = 0;
  if (0x7f < (int)uVar1) {
    if ((int)uVar1 < 0x200) {
      if (uVar1 == 0x80) {
        lVar6 = 6;
      }
      else {
        if (uVar1 != 0x100) goto switchD_009b12bc_caseD_3;
        lVar6 = 7;
      }
    }
    else if (uVar1 == 0x200) {
      lVar6 = 8;
    }
    else if (uVar1 == 0x400) {
      lVar6 = 0xc;
    }
    else {
      if (uVar1 != 0x800) goto switchD_009b12bc_caseD_3;
      lVar6 = 0xd;
    }
    goto switchD_009b12bc_caseD_1;
  }
  lVar6 = 0;
  switch(uVar1) {
  case 0:
    lVar6 = 9;
    break;
  case 1:
    break;
  case 2:
    lVar6 = 1;
    break;
  default:
    goto switchD_009b12bc_caseD_3;
  case 4:
    lVar6 = 2;
    break;
  case 8:
    lVar6 = 3;
    break;
  case 0x10:
    lVar6 = 4;
    break;
  case 0x20:
    lVar6 = 5;
  }
switchD_009b12bc_caseD_1:
  iVar2 = (&DAT_0074bf20)[lVar6 * 2];
switchD_009b12bc_caseD_3:
  pcVar3 = OBJ_nid2sn(iVar2);
  pEVar4 = EVP_get_digestbyname(pcVar3);
  if (pEVar4 == (EVP_MD *)0x0) {
    return 0;
  }
  iVar2 = EVP_MD_get_size();
  lVar8 = (long)iVar2;
  if (*(int *)(param_1 + 0x24) == 0x20) {
    lVar9 = 0;
    lVar6 = 0;
    uVar7 = 0;
  }
  else {
    iVar2 = SSL_CIPHER_get_cipher_nid(param_1);
    pcVar3 = OBJ_nid2sn(iVar2);
    pEVar5 = EVP_get_cipherbyname(pcVar3);
    if (pEVar5 == (EVP_CIPHER *)0x0) {
      return 0;
    }
    iVar2 = EVP_CIPHER_get_mode();
    if (iVar2 != 2) {
      return 0;
    }
    iVar2 = EVP_CIPHER_get_iv_length(pEVar5);
    lVar9 = (long)iVar2;
    iVar2 = EVP_CIPHER_get_block_size(pEVar5);
    lVar6 = (long)iVar2;
    uVar7 = 1;
  }
LAB_009b1254:
  *param_2 = lVar8;
  *param_3 = uVar7;
  *param_4 = lVar6;
  *param_5 = lVar9;
  return 1;
}

