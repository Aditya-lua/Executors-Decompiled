/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a11474
 */

undefined8 FUN_00a11474(char *param_1,int param_2,int *param_3)

{
  int iVar1;
  int iVar2;
  size_t sVar3;
  undefined8 uVar4;
  long lVar5;
  int *piVar6;
  int iVar7;
  char *__s1;
  uint uVar8;
  int local_58;
  int iStack_54;
  
  if (param_1 == (char *)0x0) {
    return 0xffffffff;
  }
  if (0 < param_2) {
    lVar5 = 0;
    do {
      if (param_1[lVar5] == ':') {
        __s1 = param_1 + lVar5 + 1;
        iVar2 = ((int)param_1 - (int)__s1) + param_2;
        param_2 = (int)(param_1 + lVar5) - (int)param_1;
        goto LAB_00a114e4;
      }
      lVar5 = lVar5 + 1;
    } while ((int)lVar5 < param_2);
  }
  iVar2 = 0;
  __s1 = (char *)0x0;
LAB_00a114e4:
  iVar7 = param_2;
  if (param_2 == -1) {
    sVar3 = strlen(param_1);
    iVar7 = (int)sVar3;
  }
  uVar8 = 0;
  DAT_00d21960 = &PTR_DAT_00c59980;
LAB_00a11510:
  if ((iVar7 != *(int *)(DAT_00d21960 + 1)) ||
     (iVar1 = OPENSSL_strncasecmp(*DAT_00d21960,param_1,(long)iVar7), iVar1 != 0))
  goto LAB_00a11534;
  uVar8 = *(uint *)((long)DAT_00d21960 + 0xc);
  if (uVar8 != 0xffffffff) {
    if ((uVar8 >> 0x10 & 1) == 0) {
      param_3[2] = uVar8;
      *(char **)(param_3 + 4) = __s1;
      if (__s1 != (char *)0x0) {
        return 0;
      }
      if (param_1[param_2] == '\0') {
        return 0;
      }
      ERR_new(0);
      ERR_set_debug("crypto/asn1/asn1_gen.c",0x114,"asn1_cb");
      uVar4 = 0xbd;
      goto LAB_00a11780;
    }
    switch(uVar8) {
    case 0x10001:
      if (*param_3 == -1) {
        iVar2 = FUN_00a11948(__s1,iVar2,param_3,param_3 + 1);
        if (iVar2 == 0) {
          return 0xffffffff;
        }
        return 1;
      }
      ERR_new();
      ERR_set_debug("crypto/asn1/asn1_gen.c",0x11f,"asn1_cb");
      uVar4 = 0xb5;
      goto LAB_00a11780;
    case 0x10002:
      iVar2 = FUN_00a11948(__s1,iVar2,&iStack_54,&local_58);
      if (iVar2 == 0) {
        return 0xffffffff;
      }
      if (*param_3 != -1) {
        ERR_new();
        ERR_set_debug("crypto/asn1/asn1_gen.c",0x1d4,"append_exp");
        uVar4 = 0xb3;
        goto LAB_00a11780;
      }
      iVar2 = param_3[0x7e];
      if (iVar2 == 0x14) break;
      uVar4 = 1;
      piVar6 = param_3 + (long)iVar2 * 6;
      param_3[0x7e] = iVar2 + 1;
      piVar6[6] = iStack_54;
      piVar6[7] = local_58;
      goto LAB_00a1191c;
    default:
      goto switchD_00a1160c_caseD_10003;
    case 0x10004:
      iVar2 = param_3[0x7e];
      lVar5 = (long)iVar2;
      if (iVar2 == 0x14) break;
      param_3[0x7e] = iVar2 + 1;
      if (*param_3 == -1) {
        iVar7 = 0;
        param_3[lVar5 * 6 + 6] = 3;
      }
      else {
        param_3[lVar5 * 6 + 6] = *param_3;
        iVar7 = param_3[1];
        param_3[0] = -1;
        param_3[1] = -1;
      }
      uVar4 = 0x100000000;
LAB_00a11910:
      piVar6 = param_3 + lVar5 * 6;
      piVar6[7] = iVar7;
LAB_00a1191c:
      *(undefined8 *)(piVar6 + 8) = uVar4;
switchD_00a1160c_caseD_10003:
      return 1;
    case 0x10005:
      iVar2 = param_3[0x7e];
      lVar5 = (long)iVar2;
      if (iVar2 != 0x14) {
        param_3[0x7e] = iVar2 + 1;
        if (*param_3 == -1) {
          iVar2 = 0;
          param_3[lVar5 * 6 + 6] = 4;
        }
        else {
          param_3[lVar5 * 6 + 6] = *param_3;
          iVar2 = param_3[1];
          param_3[0] = -1;
          param_3[1] = -1;
        }
        (param_3 + lVar5 * 6 + 8)[0] = 0;
        (param_3 + lVar5 * 6 + 8)[1] = 0;
        param_3[lVar5 * 6 + 7] = iVar2;
        return 1;
      }
      break;
    case 0x10006:
      iVar2 = param_3[0x7e];
      lVar5 = (long)iVar2;
      if (iVar2 != 0x14) {
        iVar7 = *param_3;
        param_3[0x7e] = iVar2 + 1;
        piVar6 = param_3 + lVar5 * 6 + 6;
        if (iVar7 == -1) {
          iVar2 = 0x10;
          goto LAB_00a11904;
        }
LAB_00a11830:
        *piVar6 = iVar7;
        iVar7 = param_3[1];
        param_3[0] = -1;
        param_3[1] = -1;
LAB_00a11908:
        uVar4 = 1;
        goto LAB_00a11910;
      }
      break;
    case 0x10007:
      iVar2 = param_3[0x7e];
      lVar5 = (long)iVar2;
      if (iVar2 != 0x14) {
        iVar7 = *param_3;
        param_3[0x7e] = iVar2 + 1;
        piVar6 = param_3 + lVar5 * 6 + 6;
        if (iVar7 != -1) goto LAB_00a11830;
        iVar2 = 0x11;
LAB_00a11904:
        iVar7 = 0;
        *piVar6 = iVar2;
        goto LAB_00a11908;
      }
      break;
    case 0x10008:
      if (__s1 == (char *)0x0) {
        ERR_new();
        uVar4 = 0x144;
      }
      else {
        iVar2 = strncmp(__s1,"ASCII",5);
        if (iVar2 == 0) {
          param_3[3] = 1;
          return 1;
        }
        iVar2 = strncmp(__s1,"UTF8",4);
        if (iVar2 == 0) {
          param_3[3] = 2;
          return 1;
        }
        iVar2 = strncmp(__s1,"HEX",3);
        if (iVar2 == 0) {
          param_3[3] = 3;
          return 1;
        }
        iVar2 = strncmp(__s1,"BITLIST",7);
        if (iVar2 == 0) {
          param_3[3] = 4;
          return 1;
        }
        ERR_new();
        uVar4 = 0x150;
      }
      ERR_set_debug("crypto/asn1/asn1_gen.c",uVar4,"asn1_cb");
      uVar4 = 0xa0;
      goto LAB_00a11780;
    }
    ERR_new();
    ERR_set_debug("crypto/asn1/asn1_gen.c",0x1d9,"append_exp");
    uVar4 = 0xae;
LAB_00a11780:
    ERR_set_error(0xd,uVar4,0);
    return 0xffffffff;
  }
  goto LAB_00a11548;
LAB_00a11534:
  uVar8 = uVar8 + 1;
  DAT_00d21960 = DAT_00d21960 + 2;
  if (0x30 < uVar8) {
LAB_00a11548:
    ERR_new();
    ERR_set_debug("crypto/asn1/asn1_gen.c",0x10a,"asn1_cb");
    ERR_set_error(0xd,0xc2,"tag=%s",param_1);
    return 0xffffffff;
  }
  goto LAB_00a11510;
}

