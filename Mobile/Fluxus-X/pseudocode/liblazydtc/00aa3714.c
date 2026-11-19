/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa3714
 */

int FUN_00aa3714(byte *param_1,int param_2,int param_3)

{
  undefined4 uVar1;
  int iVar2;
  int iVar3;
  uint uVar4;
  long lVar5;
  DSO *pDVar6;
  uint *puVar7;
  char *ptr;
  ERR_STRING_DATA *str;
  char *pcVar8;
  char *pcVar9;
  undefined8 uVar10;
  DSO_FUNC_TYPE pDVar11;
  code *pcVar12;
  uint *puVar13;
  char **ppcVar14;
  ulong uVar15;
  int iVar16;
  char *ptr_00;
  uint uVar17;
  long lVar18;
  long lVar19;
  undefined8 local_60;
  int *local_58;
  
  lVar18 = *(long *)(param_1 + 0x58);
  if (lVar18 == 0) {
    local_60 = 0;
    local_58 = (int *)0x0;
    if ((*param_1 & 1) != 0) {
      ERR_new();
      pcVar9 = "provider_init";
      uVar10 = 0x351;
LAB_00aa391c:
      ERR_set_debug("crypto/provider_core.c",uVar10,pcVar9);
      uVar1 = 0xc0103;
LAB_00aa392c:
      ERR_set_error(0xf,uVar1,0);
      return -1;
    }
    pDVar11 = *(DSO_FUNC_TYPE *)(param_1 + 0x40);
    if (pDVar11 == (DSO_FUNC_TYPE)0x0) {
      pDVar6 = *(DSO **)(param_1 + 0x38);
      if (pDVar6 == (DSO *)0x0) {
        lVar19 = DSO_new();
        *(long *)(param_1 + 0x38) = lVar19;
        if (lVar19 == 0) {
          return -1;
        }
        lVar19 = ossl_lib_ctx_get_data(*(undefined8 *)(param_1 + 0x50),1,&DAT_00c6d4c8);
        if (lVar19 == 0) {
          ERR_new();
          pcVar9 = "get_provider_store";
          uVar10 = 0x156;
          goto LAB_00aa391c;
        }
        iVar2 = CRYPTO_THREAD_read_lock(*(undefined8 *)(lVar19 + 0x18));
        if (iVar2 == 0) {
          return -1;
        }
        if (*(char **)(lVar19 + 0x28) == (char *)0x0) {
          CRYPTO_THREAD_unlock(*(undefined8 *)(lVar19 + 0x18));
          pcVar8 = (char *)ossl_safe_getenv("OPENSSL_MODULES");
          ptr = (char *)0x0;
          pcVar9 = "/home/z/my-project/build/stage-arm64/lib/ossl-modules";
          if (pcVar8 != (char *)0x0) {
            pcVar9 = pcVar8;
          }
        }
        else {
          ptr = CRYPTO_strdup(*(char **)(lVar19 + 0x28),"crypto/provider_core.c",0x36f);
          CRYPTO_THREAD_unlock(*(undefined8 *)(lVar19 + 0x18));
          pcVar9 = ptr;
          if (ptr == (char *)0x0) {
            ERR_new();
            ERR_set_debug("crypto/provider_core.c",0x372,"provider_init");
            uVar1 = 0xc0100;
            goto LAB_00aa392c;
          }
        }
        DSO_ctrl(*(DSO **)(param_1 + 0x38),2,2,(void *)0x0);
        pcVar8 = *(char **)(param_1 + 0x30);
        if (pcVar8 == (char *)0x0) {
          pcVar8 = DSO_convert_filename(*(DSO **)(param_1 + 0x38),*(char **)(param_1 + 0x28));
          ptr_00 = pcVar8;
          if (pcVar8 != (char *)0x0) goto LAB_00aa3bd0;
          pcVar9 = (char *)0x0;
LAB_00aa3c04:
          DSO_free(*(DSO **)(param_1 + 0x38));
          param_1[0x38] = 0;
          param_1[0x39] = 0;
          param_1[0x3a] = 0;
          param_1[0x3b] = 0;
          param_1[0x3c] = 0;
          param_1[0x3d] = 0;
          param_1[0x3e] = 0;
          param_1[0x3f] = 0;
        }
        else {
          ptr_00 = (char *)0x0;
LAB_00aa3bd0:
          pcVar9 = DSO_merge(*(DSO **)(param_1 + 0x38),pcVar8,pcVar9);
          if ((pcVar9 == (char *)0x0) ||
             (pDVar6 = DSO_load(*(DSO **)(param_1 + 0x38),pcVar9,(DSO_METHOD *)0x0,0),
             pDVar6 == (DSO *)0x0)) goto LAB_00aa3c04;
        }
        CRYPTO_free(pcVar9);
        CRYPTO_free(ptr_00);
        CRYPTO_free(ptr);
        pDVar6 = *(DSO **)(param_1 + 0x38);
        if (pDVar6 == (DSO *)0x0) {
          ERR_new();
          ERR_set_debug("crypto/provider_core.c",0x397,"provider_init");
          uVar10 = *(undefined8 *)(param_1 + 0x28);
          pcVar9 = "name=%s";
          uVar1 = 0x80025;
          goto LAB_00aa3aa4;
        }
      }
      pDVar11 = DSO_bind_func(pDVar6,"OSSL_provider_init");
      *(DSO_FUNC_TYPE *)(param_1 + 0x40) = pDVar11;
      if (pDVar11 == (DSO_FUNC_TYPE)0x0) {
        ERR_new();
        ERR_set_debug("crypto/provider_core.c",0x3a3,"provider_init");
        uVar10 = *(undefined8 *)(param_1 + 0x28);
        uVar1 = 0x8010c;
        pcVar9 = "name=%s, provider has no provider init function";
        goto LAB_00aa3aa4;
      }
    }
    iVar2 = (*pDVar11)(param_1,&DAT_00c6d4e0,&local_58,&local_60);
    if (iVar2 == 0) {
      ERR_new();
      ERR_set_debug("crypto/provider_core.c",0x3ab,"provider_init");
      uVar10 = *(undefined8 *)(param_1 + 0x28);
      uVar1 = 0xc0105;
      pcVar9 = "name=%s";
LAB_00aa3aa4:
      ERR_set_error(0xf,uVar1,pcVar9,uVar10);
      return -1;
    }
    *(undefined8 *)(param_1 + 0xd0) = local_60;
    *(int **)(param_1 + 0xd8) = local_58;
    if (local_58 != (int *)0x0) {
      pcVar12 = (code *)0x0;
      do {
        switch(*local_58) {
        case 0x400:
          *(undefined8 *)(param_1 + 0x70) = *(undefined8 *)(local_58 + 2);
          break;
        case 0x401:
          *(undefined8 *)(param_1 + 0x78) = *(undefined8 *)(local_58 + 2);
          break;
        case 0x402:
          *(undefined8 *)(param_1 + 0x80) = *(undefined8 *)(local_58 + 2);
          break;
        case 0x403:
          *(undefined8 *)(param_1 + 0x98) = *(undefined8 *)(local_58 + 2);
          break;
        case 0x404:
          *(undefined8 *)(param_1 + 0xa0) = *(undefined8 *)(local_58 + 2);
          break;
        case 0x405:
          pcVar12 = *(code **)(local_58 + 2);
          break;
        case 0x406:
          *(undefined8 *)(param_1 + 0x88) = *(undefined8 *)(local_58 + 2);
          break;
        case 0x407:
          *(undefined8 *)(param_1 + 0x90) = *(undefined8 *)(local_58 + 2);
          break;
        default:
          if (*local_58 == 0) goto LAB_00aa396c;
        }
        local_58 = local_58 + 4;
      } while( true );
    }
    goto LAB_00aa3b38;
  }
  goto joined_r0x00aa3744;
LAB_00aa396c:
  if (pcVar12 != (code *)0x0) {
    puVar7 = (uint *)(*pcVar12)();
    uVar17 = *puVar7;
    if (uVar17 == 0) {
      lVar19 = 0;
    }
    else {
      lVar19 = 0;
      puVar13 = puVar7;
      do {
        puVar13 = puVar13 + 4;
        if (uVar17 >> 0x17 != 0) {
          return -1;
        }
        uVar17 = *puVar13;
        lVar19 = lVar19 + 1;
      } while (uVar17 != 0);
    }
    str = (ERR_STRING_DATA *)CRYPTO_zalloc(lVar19 * 0x10 + 0x20,"crypto/provider_core.c",0x3f4);
    *(ERR_STRING_DATA **)(param_1 + 0x68) = str;
    if (str == (ERR_STRING_DATA *)0x0) {
      return -1;
    }
    uVar17 = *(uint *)(param_1 + 0x60);
    str->error = (ulong)((uVar17 & 0xff) << 0x17);
    str->string = *(char **)(param_1 + 0x28);
    if (lVar19 != -1) {
      uVar15 = 1;
      ppcVar14 = &str[1].string;
      puVar7 = puVar7 + 2;
      do {
        uVar15 = uVar15 + 1;
        ((ERR_STRING_DATA *)(ppcVar14 + -1))->error = (long)(int)puVar7[-2];
        *ppcVar14 = *(char **)puVar7;
        ppcVar14 = ppcVar14 + 2;
        puVar7 = puVar7 + 4;
      } while (uVar15 <= lVar19 + 1U);
    }
    ERR_load_strings(uVar17,str);
  }
LAB_00aa3b38:
  param_2 = 0;
  *param_1 = *param_1 | 1;
joined_r0x00aa3744:
  if (((param_3 == 0) || ((param_1[200] & 1) == 0)) ||
     (iVar2 = ossl_provider_up_ref_parent(param_1,1), iVar2 != 0)) {
    if (param_2 == 0) {
LAB_00aa377c:
      iVar3 = *(int *)(param_1 + 0x20);
      uVar17 = 1;
      iVar2 = iVar3 + 1;
      *(int *)(param_1 + 0x20) = iVar2;
      *param_1 = *param_1 | 2;
      if ((lVar18 != 0) && (iVar3 == 0)) {
        lVar19 = *(long *)(param_1 + 0x58);
        iVar3 = OPENSSL_sk_num(*(undefined8 *)(lVar19 + 0x10));
        if (iVar3 < 1) {
          uVar17 = 1;
        }
        else {
          iVar16 = 0;
          uVar17 = 1;
          do {
            lVar5 = OPENSSL_sk_value(*(undefined8 *)(lVar19 + 0x10),iVar16);
            uVar4 = (**(code **)(lVar5 + 8))(param_1,*(undefined8 *)(lVar5 + 0x20));
            iVar16 = iVar16 + 1;
            uVar17 = uVar4 & uVar17;
          } while (iVar3 != iVar16);
        }
      }
      if (param_2 != 0) {
        CRYPTO_THREAD_unlock(*(undefined8 *)(param_1 + 8));
        CRYPTO_THREAD_unlock(*(undefined8 *)(lVar18 + 0x20));
      }
      if (uVar17 == 0) {
        iVar2 = -1;
      }
      return iVar2;
    }
    iVar2 = CRYPTO_THREAD_read_lock(*(undefined8 *)(lVar18 + 0x20));
    if (iVar2 != 0) {
      iVar2 = CRYPTO_THREAD_write_lock(*(undefined8 *)(param_1 + 8));
      if (iVar2 != 0) goto LAB_00aa377c;
      CRYPTO_THREAD_unlock(*(undefined8 *)(lVar18 + 0x20));
    }
    if (param_3 == 0) {
      return -1;
    }
    if ((param_1[200] & 1) == 0) {
      return -1;
    }
    ossl_provider_free_parent(param_1,1);
  }
  return -1;
}

