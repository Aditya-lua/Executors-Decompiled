/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac5d30
 */

ulong FUN_00ac5d30(undefined8 param_1,long *param_2,long param_3,undefined4 param_4)

{
  long lVar1;
  bool bVar2;
  bool bVar3;
  byte bVar4;
  undefined4 uVar5;
  int iVar6;
  ulong uVar7;
  undefined8 uVar8;
  char *pcVar9;
  long lVar10;
  byte bVar11;
  long lVar12;
  byte *pbVar13;
  byte *pbVar14;
  byte *pbVar15;
  byte local_448 [1000];
  byte *local_58;
  
  pbVar14 = (byte *)*param_2;
  bVar4 = *pbVar14;
  local_58 = pbVar14;
  switch(bVar4) {
  case 0x22:
  case 0x27:
    pbVar13 = pbVar14 + 1;
    bVar11 = pbVar14[1];
    uVar7 = 0;
    bVar2 = false;
    bVar3 = bVar11 == 0;
    local_58 = pbVar13;
    if (bVar11 == 0) {
LAB_00ac5e00:
      ERR_new();
      ERR_set_debug("crypto/property/property_parse.c",0xd1,"parse_string");
      ERR_set_error(0x37,0x6a,"HERE-->%c%s",bVar4,pbVar13);
      return 0;
    }
    pbVar14 = pbVar13;
    if (bVar11 != bVar4) {
      bVar2 = false;
      uVar7 = 0;
      do {
        if (uVar7 < 999) {
          local_448[uVar7] = bVar11;
          uVar7 = uVar7 + 1;
        }
        else {
          bVar2 = true;
        }
        pbVar14 = pbVar14 + 1;
        bVar11 = *pbVar14;
        bVar3 = bVar11 == 0;
      } while ((bVar11 != 0) && (bVar11 != bVar4));
    }
    if (bVar3) goto LAB_00ac5e00;
    local_448[uVar7] = 0;
    if (bVar2) {
      ERR_new();
      ERR_set_debug("crypto/property/property_parse.c",0xd7,"parse_string");
      ERR_set_error(0x37,0x6d,"HERE-->%s",pbVar13);
    }
    else {
      uVar5 = ossl_property_value(param_1,local_448,param_4);
      *(undefined4 *)(param_3 + 0x10) = uVar5;
    }
    do {
      pbVar14 = pbVar14 + 1;
      iVar6 = ossl_ctype_check(*pbVar14,8);
    } while (iVar6 != 0);
    uVar7 = (ulong)!bVar2;
    *(undefined4 *)(param_3 + 4) = 0;
    local_58 = pbVar14;
    if (bVar2) {
      return uVar7;
    }
    break;
  default:
switchD_00ac5d88_caseD_23:
    iVar6 = ossl_isdigit(bVar4);
    if (iVar6 != 0) {
      uVar7 = FUN_00ac70bc(param_2,param_3);
      return uVar7;
    }
    uVar7 = ossl_ctype_check(*pbVar14,3);
    if ((int)uVar7 == 0) {
      return uVar7;
    }
    pbVar13 = (byte *)*param_2;
    bVar4 = *pbVar13;
    if (bVar4 == 0) {
      return 0;
    }
    if (bVar4 == 0x2c) {
      return 0;
    }
    iVar6 = ossl_ctype_check(bVar4,0x100);
    if (iVar6 == 0) {
      uVar7 = 0;
      bVar3 = false;
    }
    else {
      bVar3 = false;
      uVar7 = 0;
      do {
        iVar6 = ossl_ctype_check(*pbVar13,8);
        if ((iVar6 != 0) || (*pbVar13 == 0x2c)) break;
        if (uVar7 < 999) {
          bVar4 = ossl_tolower();
          local_448[uVar7] = bVar4;
          uVar7 = uVar7 + 1;
        }
        else {
          bVar3 = true;
        }
        pbVar13 = pbVar13 + 1;
        iVar6 = ossl_ctype_check(*pbVar13,0x100);
      } while (iVar6 != 0);
    }
    iVar6 = ossl_ctype_check(*pbVar13,8);
    if (((iVar6 != 0) || (*pbVar13 == 0)) || (*pbVar13 == 0x2c)) {
      local_448[uVar7] = 0;
      if (bVar3) {
        ERR_new();
        ERR_set_debug("crypto/property/property_parse.c",0xf8,"parse_unquoted");
        ERR_set_error(0x37,0x6d,"HERE-->%s",*param_2);
      }
      else {
        iVar6 = ossl_property_value(param_1,local_448,param_4);
        bVar3 = iVar6 == 0;
        *(int *)(param_3 + 0x10) = iVar6;
      }
      pbVar13 = pbVar13 + -1;
      do {
        pbVar13 = pbVar13 + 1;
        iVar6 = ossl_ctype_check(*pbVar13,8);
      } while (iVar6 != 0);
      *param_2 = (long)pbVar13;
      *(undefined4 *)(param_3 + 4) = 0;
      return (ulong)!bVar3;
    }
    ERR_new();
    ERR_set_debug("crypto/property/property_parse.c",0xf2,"parse_unquoted");
    pcVar9 = "HERE-->%s";
    uVar8 = 0x65;
LAB_00ac6214:
    ERR_set_error(0x37,uVar8,pcVar9,pbVar13);
    return 0;
  case 0x2b:
    local_58 = pbVar14 + 1;
    uVar7 = FUN_00ac70bc(&local_58,param_3);
    iVar6 = (int)uVar7;
    goto joined_r0x00ac5e80;
  case 0x2d:
    local_58 = pbVar14 + 1;
    uVar7 = FUN_00ac70bc(&local_58,param_3);
    *(long *)(param_3 + 0x10) = -*(long *)(param_3 + 0x10);
    iVar6 = (int)uVar7;
joined_r0x00ac5e80:
    if (iVar6 == 0) goto LAB_00ac621c;
    break;
  case 0x30:
    pbVar13 = pbVar14 + 1;
    if (*pbVar13 == 0x78) {
      lVar12 = 0;
      pbVar13 = pbVar14 + 2;
      pbVar14 = pbVar14 + 1;
      local_58 = pbVar13;
      do {
        pbVar15 = pbVar14;
        iVar6 = ossl_isdigit(pbVar15[1]);
        if (iVar6 == 0) {
          iVar6 = ossl_ctype_check(pbVar15[1],0x10);
          if (iVar6 == 0) {
            ERR_new();
            ERR_set_debug("crypto/property/property_parse.c",0x8a,"parse_hex");
            pcVar9 = "%s";
            goto LAB_00ac6208;
          }
          iVar6 = ossl_tolower(pbVar15[1]);
          iVar6 = iVar6 + -0x57;
        }
        else {
          iVar6 = pbVar15[1] - 0x30;
        }
        lVar10 = (long)iVar6;
        lVar1 = -0x7ffffffffffffff2 - lVar10;
        if (-1 < 0x7fffffffffffffff - lVar10) {
          lVar1 = 0x7fffffffffffffff - lVar10;
        }
        if (lVar1 >> 4 < lVar12) {
          ERR_new();
          ERR_set_debug("crypto/property/property_parse.c",0x90,"parse_hex");
          pcVar9 = "Property %s overflows";
          uVar8 = 0x6c;
          goto LAB_00ac6214;
        }
        lVar12 = lVar10 + lVar12 * 0x10;
        iVar6 = ossl_ctype_check(pbVar15[2],0x10);
        pbVar14 = pbVar15 + 1;
      } while (iVar6 != 0);
      iVar6 = ossl_ctype_check(pbVar15[2],8);
      if (((iVar6 == 0) && (pbVar15[2] != 0)) && (pbVar15[2] != 0x2c)) {
        ERR_new();
        ERR_set_debug("crypto/property/property_parse.c",0x99,"parse_hex");
        pcVar9 = "HERE-->%s";
LAB_00ac6208:
        uVar8 = 0x66;
        goto LAB_00ac6214;
      }
      do {
        pbVar14 = pbVar14 + 1;
        iVar6 = ossl_ctype_check(*pbVar14,8);
      } while (iVar6 != 0);
      uVar7 = 1;
      *(undefined4 *)(param_3 + 4) = 1;
      *(long *)(param_3 + 0x10) = lVar12;
      local_58 = pbVar14;
    }
    else {
      iVar6 = ossl_isdigit();
      if (iVar6 == 0) {
        bVar4 = *pbVar14;
        goto switchD_00ac5d88_caseD_23;
      }
      bVar4 = *pbVar13;
      lVar12 = 0;
      local_58 = pbVar13;
      do {
        pbVar15 = pbVar14;
        if (((bVar4 & 0xfe) == 0x38) || (iVar6 = ossl_isdigit(bVar4), iVar6 == 0)) {
          ERR_new();
          uVar8 = 0xaa;
          goto LAB_00ac6190;
        }
        uVar7 = (ulong)pbVar15[1];
        lVar1 = -0x7fffffffffffffca - uVar7;
        if (-1 < (long)(-0x7fffffffffffffd1 - uVar7)) {
          lVar1 = -0x7fffffffffffffd1 - uVar7;
        }
        if (lVar1 >> 3 < lVar12) {
          ERR_new();
          ERR_set_debug("crypto/property/property_parse.c",0xaf,"parse_oct");
          pcVar9 = "Property %s overflows";
          uVar8 = 0x6c;
          goto LAB_00ac6214;
        }
        lVar12 = uVar7 + lVar12 * 8 + -0x30;
        iVar6 = ossl_isdigit(pbVar15[2]);
        bVar4 = pbVar15[2];
        pbVar14 = pbVar15 + 1;
      } while ((iVar6 != 0) && ((bVar4 & 0xfe) != 0x38));
      iVar6 = ossl_ctype_check(bVar4,8);
      if ((iVar6 == 0) && ((pbVar15[2] != 0 && (pbVar15[2] != 0x2c)))) {
        ERR_new();
        uVar8 = 0xb7;
LAB_00ac6190:
        ERR_set_debug("crypto/property/property_parse.c",uVar8,"parse_oct");
        pcVar9 = "HERE-->%s";
        uVar8 = 0x68;
        goto LAB_00ac6214;
      }
      do {
        pbVar14 = pbVar14 + 1;
        iVar6 = ossl_ctype_check(*pbVar14,8);
      } while (iVar6 != 0);
      uVar7 = 1;
      *(undefined4 *)(param_3 + 4) = 1;
      *(long *)(param_3 + 0x10) = lVar12;
      local_58 = pbVar14;
    }
  }
  *param_2 = (long)local_58;
LAB_00ac621c:
  return uVar7;
}

