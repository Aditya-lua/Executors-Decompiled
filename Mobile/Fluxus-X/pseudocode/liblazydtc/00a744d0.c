/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a744d0
 */

/* WARNING: Type propagation algorithm not settling */

int EVP_PKEY_generate(EVP_PKEY *param_1,undefined8 *param_2)

{
  int iVar1;
  ENGINE *pEVar2;
  EVP_PKEY *pEVar3;
  EVP_PKEY *pEVar4;
  long lVar5;
  code *pcVar6;
  EVP_PKEY *pkey;
  int iVar7;
  undefined1 auVar8 [16];
  char *local_40;
  undefined1 auStack_38 [8];
  
  auVar8._8_8_ = param_2;
  auVar8._0_8_ = param_1;
  if (param_2 == (undefined8 *)0x0) {
    return -1;
  }
  if (param_1 == (EVP_PKEY *)0x0) {
    pkey = (EVP_PKEY *)0x0;
LAB_00a7451c:
    ERR_new(auVar8._0_8_,auVar8._8_8_);
    ERR_set_debug("crypto/evp/pmeth_gn.c",0xf4,"EVP_PKEY_generate");
    ERR_set_error(6,0x96,0);
    iVar1 = -2;
  }
  else {
    if ((param_1->type & 6) == 0) {
      ERR_new();
      ERR_set_debug("crypto/evp/pmeth_gn.c",0xf8,"EVP_PKEY_generate");
      ERR_set_error(6,0x97,0);
      pkey = (EVP_PKEY *)0x0;
      iVar1 = -1;
      goto LAB_00a7458c;
    }
    pEVar4 = (EVP_PKEY *)*param_2;
    if (pEVar4 == (EVP_PKEY *)0x0) {
      pEVar4 = EVP_PKEY_new();
      *param_2 = pEVar4;
      if (pEVar4 == (EVP_PKEY *)0x0) {
        ERR_new(0,0);
        ERR_set_debug("crypto/evp/pmeth_gn.c",0x94,"EVP_PKEY_generate");
        ERR_set_error(6,0xc0100,0);
        return -1;
      }
      lVar5 = *(long *)&param_1->save_parameters;
      pEVar3 = pEVar4;
      pkey = pEVar4;
      if (lVar5 == 0) goto LAB_00a7462c;
LAB_00a745b4:
      pEVar2 = param_1[2].engine;
      param_1[1].attributes = (stack_st_X509_ATTRIBUTE *)auStack_38;
      param_1[2].type = 2;
      if (pEVar2 == (ENGINE *)0x0) {
LAB_00a745fc:
        lVar5 = evp_keymgmt_util_gen(*param_2,(param_1->pkey).ptr,lVar5,&LAB_00a74728,param_1);
        param_1[1].attributes = (stack_st_X509_ATTRIBUTE *)0x0;
        if (lVar5 == 0) {
          iVar7 = 0;
        }
        else {
          evp_pkey_free_legacy(*param_2);
          iVar7 = 1;
        }
      }
      else {
        local_40 = (param_1->pkey).ptr;
        auVar8 = evp_pkey_export_to_provider
                           (pEVar2,*(undefined8 *)&param_1->references,&local_40,param_1->ameth);
        if (local_40 == (char *)0x0) goto LAB_00a7451c;
        iVar1 = evp_keymgmt_gen_set_template
                          ((param_1->pkey).ptr,*(undefined8 *)&param_1->save_parameters,auVar8._0_8_
                          );
        if (iVar1 != 0) {
          lVar5 = *(long *)&param_1->save_parameters;
          goto LAB_00a745fc;
        }
        iVar7 = 0;
        param_1[1].attributes = (stack_st_X509_ATTRIBUTE *)0x0;
      }
      *(int *)*param_2 = param_1[2].save_type;
      iVar1 = 0;
      if (iVar7 != 0) {
        return iVar7;
      }
    }
    else {
      pkey = (EVP_PKEY *)0x0;
      lVar5 = *(long *)&param_1->save_parameters;
      pEVar3 = param_1;
      if (lVar5 != 0) goto LAB_00a745b4;
LAB_00a7462c:
      auVar8._8_8_ = pEVar4;
      auVar8._0_8_ = pEVar3;
      if ((param_1[2].engine == (ENGINE *)0x0) || (*(long *)(param_1[2].engine + 0x60) == 0)) {
        if (param_1->type == 4) {
          pcVar6 = *(code **)(*(long *)&param_1[2].references + 0x38);
        }
        else {
          if (param_1->type != 2) goto LAB_00a7451c;
          pcVar6 = *(code **)(*(long *)&param_1[2].references + 0x28);
        }
        iVar1 = (*pcVar6)(param_1);
        if (0 < iVar1) {
          return iVar1;
        }
      }
      else {
        ERR_new(pEVar3,pEVar4);
        ERR_set_debug("crypto/evp/pmeth_gn.c",0xfd,"EVP_PKEY_generate");
        ERR_set_error(6,0xcc,0);
        iVar1 = -1;
      }
    }
  }
  if (pkey != (EVP_PKEY *)0x0) {
    *param_2 = 0;
  }
LAB_00a7458c:
  EVP_PKEY_free(pkey);
  return iVar1;
}

