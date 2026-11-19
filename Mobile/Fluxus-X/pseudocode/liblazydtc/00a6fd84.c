/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6fd84
 */

ulong FUN_00a6fd84(uint param_1,long param_2,undefined8 *param_3)

{
  uint uVar1;
  undefined4 uVar2;
  int iVar3;
  ulong uVar4;
  undefined8 uVar5;
  size_t sVar6;
  void *pvVar7;
  undefined8 uVar8;
  char *pcVar9;
  long lVar10;
  undefined4 uVar11;
  int *piVar12;
  ulong uVar13;
  undefined8 uVar14;
  undefined8 *puVar15;
  undefined8 *puVar16;
  undefined8 *puVar17;
  undefined1 auVar18 [16];
  int local_78;
  undefined4 uStack_74;
  undefined8 uStack_70;
  undefined8 local_68;
  undefined8 uStack_60;
  undefined8 local_58;
  
  auVar18 = FUN_00a70a34();
  uVar4 = auVar18._0_8_;
  uVar13 = uVar4 & 0xffffffff;
  if (auVar18._0_4_ < 1) {
    return uVar13;
  }
  switch(param_1) {
  case 0:
  case 8:
    uVar13 = (ulong)*(uint *)((long)param_3 + 0x1c);
    if (param_1 == 7) goto switchD_00a6fdd8_caseD_7;
    if ((param_1 | 8) != 8) {
      return uVar13;
    }
    if (*(int *)(param_3 + 1) != 1) {
      return uVar13;
    }
    iVar3 = *(int *)(param_2 + 0x30);
    if (param_1 != 0) {
      lVar10 = (long)(int)*(uint *)((long)param_3 + 0x1c);
      if (iVar3 == 0) goto LAB_00a701fc;
LAB_00a7020c:
      switch(iVar3) {
      case 1:
        uVar4 = OSSL_PARAM_set_int(param_3[6],uVar13);
        return uVar4;
      case 2:
        if (param_3[4] == 0) {
          uVar4 = OSSL_PARAM_set_uint(param_3[6],uVar13);
          return uVar4;
        }
        uVar4 = OSSL_PARAM_set_BN();
        return uVar4;
      default:
        ERR_new(uVar4,auVar18._8_8_,lVar10);
        ERR_set_debug("crypto/evp/ctrl_params_translate.c",0x2b3,"default_fixup_args");
        uVar11 = *(undefined4 *)(param_3 + 1);
        uVar2 = *(undefined4 *)(param_2 + 0x30);
        pcVar9 = "[action:%d, state:%d] unsupported OSSL_PARAM data type %d";
        break;
      case 4:
        uVar4 = OSSL_PARAM_set_utf8_string(param_3[6],param_3[4]);
        return uVar4;
      case 5:
        uVar4 = OSSL_PARAM_set_octet_string(param_3[6],param_3[4]);
        return uVar4;
      case 7:
        uVar4 = OSSL_PARAM_set_octet_ptr(param_3[6],*(undefined8 *)param_3[4]);
        return uVar4;
      }
      goto LAB_00a70328;
    }
    lVar10 = param_3[5];
    if (iVar3 != 0) goto LAB_00a7020c;
LAB_00a701fc:
    if (*(long *)(param_2 + 0x38) != 0) {
      iVar3 = *(int *)(param_3[6] + 8);
      goto LAB_00a7020c;
    }
    ERR_new(uVar4,auVar18._8_8_,lVar10);
    ERR_set_debug("crypto/evp/ctrl_params_translate.c",0x297,"default_fixup_args");
    uVar11 = 0xc0103;
LAB_00a7053c:
    ERR_set_error(6,uVar11,0);
    goto LAB_00a70094;
  case 1:
    if (*(int *)(param_3 + 1) != 0) {
      if (*(int *)(param_2 + 0xc) == 0) goto switchD_00a700d4_caseD_3;
      piVar12 = (int *)*param_3;
      iVar3 = *piVar12;
      if (iVar3 < 0x80) {
        switch(iVar3) {
        case 2:
        case 4:
        case 8:
          goto switchD_00a700d4_caseD_2;
        case 3:
        case 5:
        case 6:
        case 7:
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
        case 0x10:
        case 0x20:
switchD_00a700d4_caseD_10:
          lVar10 = *(long *)(piVar12 + 0xc);
joined_r0x00a700dc:
          if (lVar10 == 0) {
LAB_00a703fc:
            ERR_new();
            ERR_set_debug("crypto/evp/ctrl_params_translate.c",0x1b3,"default_fixup_args");
            ERR_set_error(6,0x93,0);
            return 0xfffffffe;
          }
          break;
        default:
          if (iVar3 == 0x40) goto switchD_00a700d4_caseD_10;
        }
      }
      else if (iVar3 < 0x400) {
        if ((iVar3 == 0x80) || (iVar3 == 0x100)) goto switchD_00a700d4_caseD_10;
        if (iVar3 == 0x200) goto LAB_00a70268;
      }
      else {
        if (0xfff < iVar3) {
          if ((iVar3 != 0x1000) && (iVar3 != 0x2000)) goto switchD_00a700d4_caseD_3;
LAB_00a702a4:
          if (*(long *)(piVar12 + 0xc) == 0) goto LAB_00a703fc;
          if ((iVar3 != 2) && (iVar3 != 8)) {
LAB_00a705ac:
            if (iVar3 != 4) goto switchD_00a700d4_caseD_3;
          }
switchD_00a700d4_caseD_2:
          lVar10 = *(long *)(piVar12 + 10);
          goto joined_r0x00a700dc;
        }
        if (iVar3 == 0x400) {
LAB_00a70268:
          if (*(long *)(piVar12 + 0xc) == 0) goto LAB_00a703fc;
          if (iVar3 < 8) {
            if (iVar3 != 2) goto LAB_00a705ac;
          }
          else if (iVar3 != 8) {
            if ((iVar3 == 0x2000) || (iVar3 == 0x1000)) goto LAB_00a702a4;
            goto switchD_00a700d4_caseD_3;
          }
          goto switchD_00a700d4_caseD_2;
        }
        if (iVar3 == 0x800) goto switchD_00a700d4_caseD_10;
      }
switchD_00a700d4_caseD_3:
      switch(*(undefined4 *)(param_2 + 0x30)) {
      case 1:
        puVar15 = (undefined8 *)param_3[6];
        OSSL_PARAM_construct_int(&local_78,*(undefined8 *)(param_2 + 0x28),(long)param_3 + 0x1c);
        break;
      case 2:
        if ((BIGNUM *)param_3[4] == (BIGNUM *)0x0) {
          puVar15 = (undefined8 *)param_3[6];
          OSSL_PARAM_construct_uint(&local_78,*(undefined8 *)(param_2 + 0x28),(long)param_3 + 0x1c);
          break;
        }
        if (*(int *)(param_3 + 1) == 2) {
          iVar3 = BN_num_bits((BIGNUM *)param_3[4]);
          uVar1 = iVar3 + 0xe;
          if (-1 < (int)(iVar3 + 7U)) {
            uVar1 = iVar3 + 7U;
          }
          param_3[0x11] = (long)((ulong)uVar1 << 0x20) >> 0x23;
          pvVar7 = CRYPTO_malloc((int)uVar1 >> 3,"crypto/evp/ctrl_params_translate.c",0x1ce);
          param_3[0xf] = pvVar7;
          if (pvVar7 != (void *)0x0) {
            iVar3 = BN_bn2nativepad(param_3[4],pvVar7,*(undefined4 *)(param_3 + 0x11));
            if (iVar3 < 0) {
              CRYPTO_free((void *)param_3[0xf]);
              param_3[0xf] = 0;
              return 0;
            }
            puVar15 = (undefined8 *)param_3[6];
            OSSL_PARAM_construct_BN
                      (&local_78,*(undefined8 *)(param_2 + 0x28),param_3[0xf],param_3[0x11]);
            break;
          }
          ERR_new();
          ERR_set_debug("crypto/evp/ctrl_params_translate.c",0x1cf,"default_fixup_args");
          uVar11 = 0xc0100;
          goto LAB_00a7053c;
        }
        ERR_new();
        ERR_set_debug("crypto/evp/ctrl_params_translate.c",0x1e1,"default_fixup_args");
        uVar11 = *(undefined4 *)(param_3 + 1);
        pcVar9 = "[action:%d, state:%d] trying to get a BIGNUM via ctrl call";
        goto LAB_00a70080;
      default:
        return uVar13;
      case 4:
        puVar15 = (undefined8 *)param_3[6];
        OSSL_PARAM_construct_utf8_string
                  (&local_78,*(undefined8 *)(param_2 + 0x28),param_3[4],
                   (long)*(int *)((long)param_3 + 0x1c));
        break;
      case 5:
        puVar15 = (undefined8 *)param_3[6];
        OSSL_PARAM_construct_octet_string
                  (&local_78,*(undefined8 *)(param_2 + 0x28),param_3[4],
                   (long)*(int *)((long)param_3 + 0x1c));
        break;
      case 6:
        puVar15 = (undefined8 *)param_3[6];
        OSSL_PARAM_construct_utf8_ptr
                  (&local_78,*(undefined8 *)(param_2 + 0x28),param_3[4],
                   (long)*(int *)((long)param_3 + 0x1c));
        break;
      case 7:
        puVar15 = (undefined8 *)param_3[6];
        OSSL_PARAM_construct_octet_ptr
                  (&local_78,*(undefined8 *)(param_2 + 0x28),param_3[4],
                   (long)*(int *)((long)param_3 + 0x1c));
      }
      puVar15[4] = local_58;
      puVar15[3] = uStack_60;
      puVar15[2] = local_68;
      puVar15[1] = uStack_70;
      *puVar15 = CONCAT44(uStack_74,local_78);
      return uVar13;
    }
    ERR_new();
    ERR_set_debug("crypto/evp/ctrl_params_translate.c",0x19d,"default_fixup_args");
    uVar11 = *(undefined4 *)(param_3 + 1);
    pcVar9 = "[action:%d, state:%d]";
LAB_00a70080:
    uVar8 = 0x8010c;
    param_1 = 1;
    break;
  case 2:
    if (*(int *)(param_3 + 1) != 1) {
      return uVar13;
    }
    if ((*(uint *)(param_2 + 0x30) & 0xfffffffc) == 4) {
      *(int *)((long)param_3 + 0x1c) = (int)*(undefined8 *)(param_3[6] + 0x20);
      return uVar13;
    }
    return uVar13;
  default:
    ERR_new();
    ERR_set_debug("crypto/evp/ctrl_params_translate.c",0x18c,"default_fixup_args");
    uVar11 = *(undefined4 *)(param_3 + 1);
    uVar8 = 0xc0101;
    pcVar9 = "[action:%d, state:%d]";
    break;
  case 4:
    puVar15 = (undefined8 *)param_3[2];
    uVar8 = param_3[4];
    local_78 = 0;
    if (*(int *)(param_3 + 1) == 2) {
      puVar17 = puVar15;
      if (param_2 != 0) {
        puVar16 = *(undefined8 **)(param_2 + 0x28);
        param_3[2] = puVar16;
        puVar17 = puVar16;
        if (*(int *)(param_3 + 3) != 0) {
          puVar17 = param_3 + 8;
          *(undefined4 *)puVar17 = 0x786568;
          uVar4 = OPENSSL_strlcat(puVar17,puVar16,0x32);
          if (uVar4 < 4) {
            ERR_new();
            ERR_set_debug("crypto/evp/ctrl_params_translate.c",0x237,"default_fixup_args");
            ERR_set_error(6,0xc0103,0);
            return 0xffffffff;
          }
        }
      }
      uVar5 = EVP_PKEY_CTX_settable_params(*param_3);
      pcVar9 = (char *)param_3[4];
      uVar14 = param_3[6];
      sVar6 = strlen(pcVar9);
      iVar3 = OSSL_PARAM_allocate_from_text(uVar14,uVar5,puVar17,pcVar9,sVar6,&local_78);
      if (iVar3 != 0) {
        param_3[0xf] = *(undefined8 *)(param_3[6] + 0x10);
        param_3[0x11] = *(undefined8 *)(param_3[6] + 0x18);
        return uVar13;
      }
      if (local_78 == 0) {
        ERR_new();
        ERR_set_debug("crypto/evp/ctrl_params_translate.c",0x244,"default_fixup_args");
        ERR_set_error(6,0x93,"[action:%d, state:%d] name=%s, value=%s",*(undefined4 *)(param_3 + 1),
                      4,puVar15,uVar8);
        return 0xfffffffe;
      }
      return 0;
    }
    ERR_new();
    ERR_set_debug("crypto/evp/ctrl_params_translate.c",0x226,"default_fixup_args");
    uVar11 = *(undefined4 *)(param_3 + 1);
    pcVar9 = "[action:%d, state:%d] only setting allowed";
    uVar8 = 0x93;
    param_1 = 4;
    break;
  case 5:
    goto switchD_00a6fdd8_caseD_5;
  case 7:
switchD_00a6fdd8_caseD_7:
    if (*(int *)(param_3 + 1) == 1) {
      if (*(int *)(param_2 + 0x30) == 7) {
        param_3[4] = param_3 + 0x10;
        return uVar13;
      }
      return uVar13;
    }
    if (*(int *)(param_3 + 1) != 2) {
      return uVar13;
    }
    switch(*(undefined4 *)(param_2 + 0x30)) {
    case 1:
      uVar4 = OSSL_PARAM_get_int(param_3[6],(long)param_3 + 0x1c);
      return uVar4;
    case 2:
      if (param_3[4] == 0) {
        iVar3 = OSSL_PARAM_get_uint(param_3[6],(long)param_3 + 0x1c);
      }
      else {
        iVar3 = OSSL_PARAM_get_BN();
      }
      if (iVar3 != 0) {
        return 1;
      }
      break;
    default:
      ERR_new();
      ERR_set_debug("crypto/evp/ctrl_params_translate.c",0x285,"default_fixup_args");
      uVar11 = *(undefined4 *)(param_3 + 1);
      uVar2 = *(undefined4 *)(param_2 + 0x30);
      pcVar9 = "[action:%d, state:%d] unknown OSSL_PARAM data type %d";
LAB_00a70328:
      ERR_set_error(6,0x8010c,pcVar9,uVar11,param_1,uVar2);
      break;
    case 4:
      uVar4 = OSSL_PARAM_get_utf8_string(param_3[6],param_3[4],param_3[5]);
      return uVar4;
    case 5:
      uVar4 = OSSL_PARAM_get_octet_string(param_3[6],param_3 + 4,param_3[5],(long)param_3 + 0x1c);
      return uVar4;
    case 7:
      uVar4 = OSSL_PARAM_get_octet_ptr(param_3[6],param_3[4],param_3 + 5);
      return uVar4;
    }
    goto LAB_00a70094;
  }
  ERR_set_error(6,uVar8,pcVar9,uVar11,param_1);
LAB_00a70094:
  uVar13 = 0;
switchD_00a6fdd8_caseD_5:
  return uVar13;
}

