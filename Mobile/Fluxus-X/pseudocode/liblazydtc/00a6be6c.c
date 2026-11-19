/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6be6c
 */

int EVP_PKEY_copy_parameters(EVP_PKEY *to,EVP_PKEY *from)

{
  int iVar1;
  uint uVar2;
  stack_st_X509_ATTRIBUTE *psVar3;
  undefined8 uVar4;
  long lVar5;
  code *pcVar6;
  long local_30;
  EVP_PKEY *local_28;
  
  local_28 = (EVP_PKEY *)0x0;
  iVar1 = to->type;
  if (iVar1 == 0) {
LAB_00a6beec:
    if (*(long *)&to[1].save_parameters != 0) goto LAB_00a6bef4;
    if ((from->type == 0) || (*(long *)&from[1].save_parameters != 0)) {
      iVar1 = EVP_PKEY_set_type_by_keymgmt(to);
      if (iVar1 == 0) goto LAB_00a6c0bc;
      goto LAB_00a6bef8;
    }
    iVar1 = FUN_00a6d2f4(to,0,from->type,0,0xffffffff,0);
    if (iVar1 != 0) goto LAB_00a6bef8;
LAB_00a6c0bc:
    uVar2 = 0;
  }
  else {
    if (*(long *)&to[1].save_parameters == 0) {
      if (*(long *)&from[1].save_parameters != 0) {
        iVar1 = evp_pkey_copy_downgraded(&local_28,from);
        if (iVar1 == 0) goto LAB_00a6c0bc;
        iVar1 = to->type;
        from = local_28;
        if (iVar1 == 0) goto LAB_00a6beec;
      }
      if (*(long *)&to[1].save_parameters != 0) goto LAB_00a6bef4;
      if (iVar1 == from->type) goto LAB_00a6bef8;
      ERR_new();
      uVar4 = 0xa0;
LAB_00a6c130:
      ERR_set_debug("crypto/evp/p_lib.c",uVar4,"EVP_PKEY_copy_parameters");
      uVar4 = 0x65;
    }
    else {
LAB_00a6bef4:
      if (from == (EVP_PKEY *)0x0) {
LAB_00a6bf5c:
        if (*(long *)&to[1].save_parameters == 0) {
          if ((*(long *)&to->references == 0) ||
             (pcVar6 = *(code **)(*(long *)&to->references + 0x80), pcVar6 == (code *)0x0)) {
LAB_00a6bfc4:
            if (*(long *)&from[1].save_parameters != 0) goto LAB_00a6bfcc;
            if (((to->type == from->type) && (*(long *)&to->references != 0)) &&
               (pcVar6 = *(code **)(*(long *)&to->references + 0x90), pcVar6 != (code *)0x0)) {
              iVar1 = (*pcVar6)(to,from);
              goto joined_r0x00a6c058;
            }
            goto LAB_00a6c05c;
          }
          iVar1 = (*pcVar6)(to);
          lVar5 = *(long *)&to[1].save_parameters;
          if (iVar1 == 0) goto LAB_00a6bfc0;
        }
        else {
          iVar1 = evp_keymgmt_util_has(to,4);
          lVar5 = *(long *)&to[1].save_parameters;
          if (iVar1 != 0) {
LAB_00a6bfc0:
            if (lVar5 == 0) goto LAB_00a6bfc4;
LAB_00a6bfcc:
            iVar1 = FUN_00a6c90c(to,from,4);
joined_r0x00a6c058:
            if (iVar1 == 1) {
              uVar2 = 1;
              goto LAB_00a6c0c0;
            }
LAB_00a6c05c:
            ERR_new();
            ERR_set_debug("crypto/evp/p_lib.c",0xae,"EVP_PKEY_copy_parameters");
            uVar4 = 0x99;
            goto LAB_00a6c080;
          }
        }
        if (lVar5 != 0) {
          if (*(long *)&from[1].save_parameters != 0) {
            uVar2 = evp_keymgmt_util_copy(to,from,4);
            goto LAB_00a6c0c0;
          }
          if (to[1].attributes == (stack_st_X509_ATTRIBUTE *)0x0) {
            local_30 = lVar5;
            lVar5 = evp_pkey_export_to_provider(from,0,&local_30,0);
            if (lVar5 != 0) {
              psVar3 = (stack_st_X509_ATTRIBUTE *)
                       evp_keymgmt_dup(*(undefined8 *)&to[1].save_parameters,lVar5,4);
              to[1].attributes = psVar3;
              uVar2 = (uint)(psVar3 != (stack_st_X509_ATTRIBUTE *)0x0);
              goto LAB_00a6c0c0;
            }
            ERR_new();
            uVar4 = 0xca;
            goto LAB_00a6c130;
          }
        }
        if ((*(long *)&from->references != 0) &&
           (pcVar6 = *(code **)(*(long *)&from->references + 0x88), pcVar6 != (code *)0x0)) {
          uVar2 = (*pcVar6)(to,from);
          goto LAB_00a6c0c0;
        }
        goto LAB_00a6c0bc;
      }
LAB_00a6bef8:
      if (*(long *)&from[1].save_parameters == 0) {
        if (((*(long *)&from->references == 0) ||
            (pcVar6 = *(code **)(*(long *)&from->references + 0x80), pcVar6 == (code *)0x0)) ||
           (iVar1 = (*pcVar6)(from), iVar1 == 0)) goto LAB_00a6bf5c;
      }
      else {
        iVar1 = evp_keymgmt_util_has(from,4);
        if (iVar1 != 0) goto LAB_00a6bf5c;
      }
      ERR_new();
      ERR_set_debug("crypto/evp/p_lib.c",0xa6,"EVP_PKEY_copy_parameters");
      uVar4 = 0x67;
    }
LAB_00a6c080:
    ERR_set_error(6,uVar4,0);
    uVar2 = 0;
  }
LAB_00a6c0c0:
  EVP_PKEY_free(local_28);
  return uVar2;
}

