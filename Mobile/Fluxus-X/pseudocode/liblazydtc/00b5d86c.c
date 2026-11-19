/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5d86c
 */

undefined8 FUN_00b5d86c(long param_1,char *param_2,long param_3)

{
  int iVar1;
  undefined8 uVar2;
  undefined1 auStack_68 [56];
  
  uVar2 = ossl_prov_is_running();
  if ((int)uVar2 == 0) {
    return uVar2;
  }
  if ((param_2 == (char *)0x0) || (*param_2 == '\0')) {
    if (param_3 == 0) {
      if (*(long *)(param_1 + 8) == 0) {
        ERR_new();
        ERR_set_debug("providers/implementations/signature/eddsa_sig.c",0x6b,
                      "eddsa_digest_signverify_init");
        uVar2 = 0x72;
        goto LAB_00b5d974;
      }
    }
    else {
      iVar1 = ossl_ecx_key_up_ref(param_3);
      if (iVar1 == 0) {
        ERR_new();
        ERR_set_debug("providers/implementations/signature/eddsa_sig.c",0x70,
                      "eddsa_digest_signverify_init");
        uVar2 = 0xc0103;
        goto LAB_00b5d974;
      }
      *(undefined8 *)(param_1 + 0x118) = 0;
      iVar1 = WPACKET_init_der(auStack_68,param_1 + 0x10,0x100);
      if (*(int *)(param_3 + 0x60) == 3) {
        if (iVar1 != 0) {
          iVar1 = ossl_DER_w_algorithmIdentifier_ED448(auStack_68,0xffffffff,param_3);
joined_r0x00b5d998:
          if ((iVar1 != 0) && (iVar1 = WPACKET_finish(auStack_68), iVar1 != 0)) {
            WPACKET_get_total_written(auStack_68,param_1 + 0x118);
            uVar2 = WPACKET_get_curr(auStack_68);
            *(undefined8 *)(param_1 + 0x110) = uVar2;
          }
        }
      }
      else {
        if (*(int *)(param_3 + 0x60) != 2) {
          ERR_new();
          ERR_set_debug("providers/implementations/signature/eddsa_sig.c",0x86,
                        "eddsa_digest_signverify_init");
          ERR_set_error(0x39,0xc0103,0);
          ossl_ecx_key_free(param_3);
          goto LAB_00b5d97c;
        }
        if (iVar1 != 0) {
          iVar1 = ossl_DER_w_algorithmIdentifier_ED25519(auStack_68,0xffffffff,param_3);
          goto joined_r0x00b5d998;
        }
      }
      WPACKET_cleanup(auStack_68);
      *(long *)(param_1 + 8) = param_3;
    }
    uVar2 = 1;
  }
  else {
    ERR_new();
    ERR_set_debug("providers/implementations/signature/eddsa_sig.c",99,
                  "eddsa_digest_signverify_init");
    uVar2 = 0x7a;
LAB_00b5d974:
    ERR_set_error(0x39,uVar2,0);
LAB_00b5d97c:
    uVar2 = 0;
  }
  return uVar2;
}

