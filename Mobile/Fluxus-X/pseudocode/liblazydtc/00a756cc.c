/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a756cc
 */

EVP_PKEY_CTX * EVP_PKEY_CTX_dup(EVP_PKEY_CTX *ctx)

{
  int iVar1;
  EVP_PKEY_CTX *ctx_00;
  undefined8 uVar2;
  char *pcVar3;
  long lVar4;
  code *pcVar5;
  undefined8 local_28;
  
  if ((*(ENGINE **)(ctx + 0x80) != (ENGINE *)0x0) &&
     (iVar1 = ENGINE_init(*(ENGINE **)(ctx + 0x80)), iVar1 == 0)) {
    ERR_new();
    ERR_set_debug("crypto/evp/pmeth_lib.c",0x1e0,"EVP_PKEY_CTX_dup");
    ERR_set_error(6,0x80026,0);
    return (EVP_PKEY_CTX *)0x0;
  }
  ctx_00 = (EVP_PKEY_CTX *)CRYPTO_zalloc(0xb0,"crypto/evp/pmeth_lib.c",0x1e4);
  if (ctx_00 == (EVP_PKEY_CTX *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/evp/pmeth_lib.c",0x1e6,"EVP_PKEY_CTX_dup");
    ERR_set_error(6,0xc0100,0);
    return (EVP_PKEY_CTX *)0x0;
  }
  uVar2 = 0;
  if (*(long *)(ctx + 0x88) != 0) {
    EVP_PKEY_up_ref();
    uVar2 = *(undefined8 *)(ctx + 0x88);
  }
  *(undefined8 *)(ctx_00 + 0x88) = uVar2;
  *(undefined4 *)ctx_00 = *(undefined4 *)ctx;
  *(undefined8 *)(ctx_00 + 8) = *(undefined8 *)(ctx + 8);
  uVar2 = *(undefined8 *)(ctx + 0x18);
  *(undefined8 *)(ctx_00 + 0x10) = 0;
  *(undefined8 *)(ctx_00 + 0x18) = uVar2;
  if (*(char **)(ctx + 0x10) != (char *)0x0) {
    pcVar3 = CRYPTO_strdup(*(char **)(ctx + 0x10),"crypto/evp/pmeth_lib.c",0x1f2);
    *(char **)(ctx_00 + 0x10) = pcVar3;
    if (pcVar3 == (char *)0x0) goto switchD_00a75788_caseD_2;
  }
  *(undefined4 *)(ctx_00 + 0x74) = *(undefined4 *)(ctx + 0x74);
  iVar1 = *(int *)ctx;
  if (iVar1 < 0x100) {
    switch(iVar1) {
    case 2:
    case 4:
      goto switchD_00a75788_caseD_2;
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
    case 0x10:
    case 0x20:
switchD_00a75788_caseD_10:
      if (*(long *)(ctx + 0x28) != 0) {
        *(long *)(ctx_00 + 0x28) = *(long *)(ctx + 0x28);
        iVar1 = EVP_SIGNATURE_up_ref();
        if (iVar1 == 0) goto switchD_00a75788_caseD_2;
      }
      if (*(long *)(ctx + 0x30) != 0) {
        if (*(long *)(ctx + 0x28) == 0) goto switchD_00a75788_caseD_2;
        pcVar5 = *(code **)(*(long *)(ctx + 0x28) + 0xb0);
        if (pcVar5 == (code *)0x0) {
          lVar4 = *(long *)(ctx_00 + 0x30);
        }
        else {
          lVar4 = (*pcVar5)();
          *(long *)(ctx_00 + 0x30) = lVar4;
        }
        if (lVar4 != 0) {
          return ctx_00;
        }
        EVP_SIGNATURE_free(*(undefined8 *)(ctx_00 + 0x28));
LAB_00a759fc:
        *(undefined8 *)(ctx_00 + 0x28) = 0;
        goto switchD_00a75788_caseD_2;
      }
      break;
    default:
      if ((iVar1 == 0x40) || (iVar1 == 0x80)) goto switchD_00a75788_caseD_10;
    }
  }
  else if (iVar1 < 0x800) {
    if (iVar1 == 0x100) goto switchD_00a75788_caseD_10;
    if ((iVar1 == 0x200) || (iVar1 == 0x400)) {
      if (*(long *)(ctx + 0x28) != 0) {
        *(long *)(ctx_00 + 0x28) = *(long *)(ctx + 0x28);
        iVar1 = EVP_ASYM_CIPHER_up_ref();
        if (iVar1 == 0) goto switchD_00a75788_caseD_2;
      }
      if (*(long *)(ctx + 0x30) != 0) {
        if (*(long *)(ctx + 0x28) == 0) goto switchD_00a75788_caseD_2;
        pcVar5 = *(code **)(*(long *)(ctx + 0x28) + 0x60);
        if (pcVar5 == (code *)0x0) {
          lVar4 = *(long *)(ctx_00 + 0x30);
        }
        else {
          lVar4 = (*pcVar5)();
          *(long *)(ctx_00 + 0x30) = lVar4;
        }
        if (lVar4 != 0) {
          return ctx_00;
        }
        EVP_ASYM_CIPHER_free(*(undefined8 *)(ctx_00 + 0x28));
        goto LAB_00a759fc;
      }
    }
  }
  else {
    if ((iVar1 == 0x2000) || (iVar1 == 0x1000)) {
      if (*(long *)(ctx + 0x28) != 0) {
        *(long *)(ctx_00 + 0x28) = *(long *)(ctx + 0x28);
        iVar1 = EVP_KEM_up_ref();
        if (iVar1 == 0) goto switchD_00a75788_caseD_2;
      }
      if (*(long *)(ctx + 0x30) == 0) goto switchD_00a75788_caseD_3;
      if (*(long *)(ctx + 0x28) == 0) goto switchD_00a75788_caseD_2;
      pcVar5 = *(code **)(*(long *)(ctx + 0x28) + 0x60);
      if (pcVar5 == (code *)0x0) {
        lVar4 = *(long *)(ctx_00 + 0x30);
      }
      else {
        lVar4 = (*pcVar5)();
        *(long *)(ctx_00 + 0x30) = lVar4;
      }
      if (lVar4 != 0) {
        return ctx_00;
      }
      EVP_KEM_free(*(undefined8 *)(ctx_00 + 0x28));
      goto LAB_00a759fc;
    }
    if (iVar1 == 0x800) {
      if (*(long *)(ctx + 0x28) != 0) {
        *(long *)(ctx_00 + 0x28) = *(long *)(ctx + 0x28);
        iVar1 = EVP_KEYEXCH_up_ref();
        if (iVar1 == 0) goto switchD_00a75788_caseD_2;
      }
      if (*(long *)(ctx + 0x30) != 0) {
        if (*(long *)(ctx + 0x28) == 0) goto switchD_00a75788_caseD_2;
        pcVar5 = *(code **)(*(long *)(ctx + 0x28) + 0x58);
        if (pcVar5 == (code *)0x0) {
          lVar4 = *(long *)(ctx_00 + 0x30);
        }
        else {
          lVar4 = (*pcVar5)();
          *(long *)(ctx_00 + 0x30) = lVar4;
        }
        if (lVar4 != 0) {
          return ctx_00;
        }
        EVP_KEYEXCH_free(*(undefined8 *)(ctx_00 + 0x28));
        goto LAB_00a759fc;
      }
    }
  }
switchD_00a75788_caseD_3:
  uVar2 = *(undefined8 *)(ctx + 0x78);
  *(undefined8 *)(ctx_00 + 0x80) = *(undefined8 *)(ctx + 0x80);
  *(undefined8 *)(ctx_00 + 0x78) = uVar2;
  uVar2 = 0;
  if (*(long *)(ctx + 0x90) != 0) {
    EVP_PKEY_up_ref();
    uVar2 = *(undefined8 *)(ctx + 0x90);
  }
  *(undefined8 *)(ctx_00 + 0x90) = uVar2;
  if (*(long *)(ctx + 0x78) == 0) {
    if (*(int *)ctx_00 == 0) {
      local_28 = *(undefined8 *)(ctx + 0x20);
      lVar4 = evp_pkey_export_to_provider
                        (*(undefined8 *)(ctx + 0x88),*(undefined8 *)(ctx + 8),&local_28,
                         *(undefined8 *)(ctx + 0x10));
      if ((lVar4 != 0) && (iVar1 = EVP_KEYMGMT_up_ref(local_28), iVar1 != 0)) {
        EVP_KEYMGMT_free(*(undefined8 *)(ctx_00 + 0x20));
        *(undefined8 *)(ctx_00 + 0x20) = local_28;
        return ctx_00;
      }
    }
  }
  else {
    iVar1 = (**(code **)(*(long *)(ctx + 0x78) + 0x10))(ctx_00,ctx);
    if (0 < iVar1) {
      return ctx_00;
    }
  }
switchD_00a75788_caseD_2:
  *(undefined8 *)(ctx_00 + 0x78) = 0;
  EVP_PKEY_CTX_free(ctx_00);
  return (EVP_PKEY_CTX *)0x0;
}

