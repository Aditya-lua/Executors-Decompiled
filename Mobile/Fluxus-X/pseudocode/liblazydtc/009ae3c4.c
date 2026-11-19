/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ae3c4
 */

undefined8 ssl_cipher_get_evp_cipher(undefined8 *param_1,long param_2,long *param_3)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  
  iVar1 = *(int *)(param_2 + 0x24);
  if (0xfff < iVar1) {
    if (iVar1 < 0x40000) {
      if (iVar1 < 0x8000) {
        if (iVar1 == 0x1000) {
          lVar3 = 0xc;
        }
        else if (iVar1 == 0x2000) {
          lVar3 = 0xd;
        }
        else {
          if (iVar1 != 0x4000) goto switchD_009ae408_caseD_3;
          lVar3 = 0xe;
        }
      }
      else if (iVar1 == 0x8000) {
        lVar3 = 0xf;
      }
      else if (iVar1 == 0x10000) {
        lVar3 = 0x10;
      }
      else {
        if (iVar1 != 0x20000) goto switchD_009ae408_caseD_3;
        lVar3 = 0x11;
      }
    }
    else if (iVar1 < 0x200000) {
      if (iVar1 == 0x40000) {
        lVar3 = 0x12;
      }
      else if (iVar1 == 0x80000) {
        lVar3 = 0x13;
      }
      else {
        if (iVar1 != 0x100000) goto switchD_009ae408_caseD_3;
        lVar3 = 0x14;
      }
    }
    else if (iVar1 == 0x200000) {
      lVar3 = 0x15;
    }
    else if (iVar1 == 0x400000) {
      lVar3 = 0x16;
    }
    else {
      if (iVar1 != 0x800000) goto switchD_009ae408_caseD_3;
      lVar3 = 0x17;
    }
    goto switchD_009ae408_caseD_1;
  }
  if (0x7f < iVar1) {
    if (iVar1 < 0x200) {
      if (iVar1 == 0x80) {
        lVar3 = 7;
      }
      else {
        if (iVar1 != 0x100) goto switchD_009ae408_caseD_3;
        lVar3 = 8;
      }
    }
    else if (iVar1 == 0x200) {
      lVar3 = 9;
    }
    else if (iVar1 == 0x400) {
      lVar3 = 10;
    }
    else {
      if (iVar1 != 0x800) goto switchD_009ae408_caseD_3;
      lVar3 = 0xb;
    }
    goto switchD_009ae408_caseD_1;
  }
  lVar3 = 0;
  switch(iVar1) {
  case 1:
    break;
  case 2:
    lVar3 = 1;
    break;
  default:
switchD_009ae408_caseD_3:
    *param_3 = 0;
    goto LAB_009ae59c;
  case 4:
    lVar3 = 2;
    break;
  case 8:
    lVar3 = 3;
    break;
  case 0x10:
    lVar3 = 4;
    break;
  case 0x20:
    lVar3 = EVP_CIPHER_fetch(*param_1,&DAT_0029dc23,param_1[0x88]);
    *param_3 = lVar3;
    if (lVar3 == 0) {
      return 0;
    }
    goto LAB_009ae59c;
  case 0x40:
    lVar3 = 6;
  }
switchD_009ae408_caseD_1:
  uVar2 = 0;
  if ((param_1[lVar3 + 0x90] != 0) && (uVar2 = ssl_evp_cipher_up_ref(), (int)uVar2 != 0)) {
    *param_3 = param_1[lVar3 + 0x90];
LAB_009ae59c:
    uVar2 = 1;
  }
  return uVar2;
}

