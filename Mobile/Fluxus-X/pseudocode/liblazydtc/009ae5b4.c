/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ae5b4
 */

undefined8
ssl_cipher_get_evp(undefined8 *param_1,uint *param_2,long *param_3,long *param_4,int *param_5,
                  undefined8 *param_6,undefined8 *param_7,int param_8)

{
  int *piVar1;
  int iVar2;
  uint uVar3;
  undefined8 uVar4;
  long lVar5;
  long lVar6;
  long lVar7;
  uint local_78 [6];
  
  lVar5 = *(long *)(param_2 + 0xbe);
  if (lVar5 == 0) {
    return 0;
  }
  if (param_7 != (undefined8 *)0x0) {
    CRYPTO_THREAD_run_once(&DAT_00d218c0,&LAB_009b1418);
    *param_7 = 0;
    local_78[0] = param_2[0xbd];
    if ((DAT_00d218b8 != 0) && (iVar2 = OPENSSL_sk_find(DAT_00d218b8,local_78), -1 < iVar2)) {
      uVar4 = OPENSSL_sk_value(DAT_00d218b8,iVar2);
      *param_7 = uVar4;
    }
    if ((param_3 == (long *)0x0) && (param_4 == (long *)0x0)) {
      return 1;
    }
  }
  if (param_3 == (long *)0x0) {
    return 0;
  }
  if (param_4 == (long *)0x0) {
    return 0;
  }
  uVar4 = ssl_cipher_get_evp_cipher(param_1,lVar5,param_3);
  if ((int)uVar4 == 0) {
    return uVar4;
  }
  iVar2 = *(int *)(lVar5 + 0x28);
  if (0x7f < iVar2) {
    if (iVar2 < 0x200) {
      if (iVar2 == 0x80) {
        lVar7 = 6;
      }
      else {
        if (iVar2 != 0x100) goto switchD_009ae6a4_caseD_3;
        lVar7 = 7;
      }
    }
    else if (iVar2 == 0x200) {
      lVar7 = 8;
    }
    else if (iVar2 == 0x400) {
      lVar7 = 0xc;
    }
    else {
      if (iVar2 != 0x800) goto switchD_009ae6a4_caseD_3;
      lVar7 = 0xd;
    }
    goto switchD_009ae6a4_caseD_1;
  }
  lVar7 = 0;
  switch(iVar2) {
  case 0:
    lVar7 = 9;
    break;
  case 1:
    break;
  case 2:
    lVar7 = 1;
    break;
  default:
switchD_009ae6a4_caseD_3:
    *param_4 = 0;
    if (param_5 != (int *)0x0) {
      *param_5 = 0;
    }
    if (param_6 != (undefined8 *)0x0) {
      *param_6 = 0;
    }
    lVar6 = 0;
    piVar1 = (int *)0x0;
    if (*(int *)(lVar5 + 0x28) != 0x40) {
      piVar1 = param_5;
    }
    param_5 = piVar1;
    if (*param_3 == 0) {
      return 0;
    }
    goto LAB_009ae770;
  case 4:
    lVar7 = 2;
    break;
  case 8:
    lVar7 = 3;
    break;
  case 0x10:
    lVar7 = 4;
    break;
  case 0x20:
    lVar7 = 5;
  }
switchD_009ae6a4_caseD_1:
  lVar6 = param_1[lVar7 + 0xa8];
  if ((lVar6 == 0) || (iVar2 = ssl_evp_md_up_ref(lVar6), iVar2 == 0)) {
    ssl_evp_cipher_free(*param_3);
  }
  else {
    *param_4 = lVar6;
    if (param_5 != (int *)0x0) {
      *param_5 = *(int *)((long)param_1 + lVar7 * 4 + 0x448);
    }
    if (param_6 != (undefined8 *)0x0) {
      *param_6 = param_1[lVar7 + 0xb6];
    }
    if (*param_3 == 0) {
      return 0;
    }
LAB_009ae770:
    if ((lVar6 == 0) && (uVar3 = EVP_CIPHER_get_flags(), (uVar3 >> 0x15 & 1) == 0)) {
      return 0;
    }
    if ((param_5 == (int *)0x0) || (*param_5 != 0)) {
      if (param_8 == 0) {
        if ((int)*param_2 < 0x301) {
          return 1;
        }
        if ((*param_2 & 0xffffff00) != 0x300) {
          return 1;
        }
        iVar2 = *(int *)(lVar5 + 0x24);
        if (iVar2 == 0x80) {
          if (*(int *)(lVar5 + 0x28) == 2) {
            uVar4 = 0x396;
          }
          else {
            if (*(int *)(lVar5 + 0x28) != 0x10) {
              return 1;
            }
            uVar4 = 0x3b6;
          }
        }
        else if (iVar2 == 0x40) {
          if (*(int *)(lVar5 + 0x28) == 2) {
            uVar4 = 0x394;
          }
          else {
            if (*(int *)(lVar5 + 0x28) != 0x10) {
              return 1;
            }
            uVar4 = 0x3b4;
          }
        }
        else {
          if (iVar2 != 4) {
            return 1;
          }
          if (*(int *)(lVar5 + 0x28) != 1) {
            return 1;
          }
          uVar4 = 0x393;
        }
        lVar5 = ssl_evp_cipher_fetch(*param_1,uVar4,param_1[0x88]);
        if (lVar5 != 0) {
          ssl_evp_cipher_free(*param_3);
          ssl_evp_md_free(*param_4);
          *param_3 = lVar5;
          *param_4 = 0;
        }
      }
      return 1;
    }
  }
  return 0;
}

