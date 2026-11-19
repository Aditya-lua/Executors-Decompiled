/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a689b4
 */

void * EVP_Q_mac(void)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  long lVar4;
  long *ptr;
  long in_x3;
  undefined8 in_x4;
  long in_x5;
  long in_x6;
  long in_x7;
  long lVar5;
  char *pcVar6;
  undefined8 in_stack_00000000;
  void *in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 *in_stack_00000018;
  undefined8 local_d8;
  undefined8 uStack_d0;
  undefined8 local_c8;
  undefined8 uStack_c0;
  undefined8 local_b8;
  undefined8 local_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 local_90;
  undefined8 local_58;
  
  lVar2 = EVP_MAC_fetch();
  memset(&local_b0,0,0x50);
  local_58 = 0;
  if (in_stack_00000018 != (undefined8 *)0x0) {
    *in_stack_00000018 = 0;
  }
  if (lVar2 == 0) {
    return (void *)0x0;
  }
  if (in_x3 != 0) {
    uVar3 = EVP_MAC_settable_ctx_params(lVar2);
    pcVar6 = "digest";
    lVar4 = OSSL_PARAM_locate_const(uVar3,"digest");
    if (lVar4 == 0) {
      pcVar6 = "cipher";
      lVar4 = OSSL_PARAM_locate_const(uVar3,"cipher");
      if (lVar4 == 0) {
        ERR_new();
        ERR_set_debug("crypto/evp/mac_lib.c",0x10f,"EVP_Q_mac");
        ERR_set_error(6,0x80106,0);
        in_stack_00000008 = (void *)0x0;
        goto LAB_00a68c08;
      }
    }
    OSSL_PARAM_construct_utf8_string(&local_d8,pcVar6,in_x3,0);
    local_90 = local_b8;
    uStack_a8 = uStack_d0;
    local_b0 = local_d8;
    uStack_98 = uStack_c0;
    uStack_a0 = local_c8;
  }
  lVar4 = in_x7;
  if (in_x5 != 0 || in_x6 != 0) {
    lVar4 = in_x5;
  }
  ptr = (long *)EVP_MAC_CTX_new(lVar2);
  if (ptr == (long *)0x0) {
    in_stack_00000008 = (void *)0x0;
    goto LAB_00a68c08;
  }
  lVar5 = *ptr;
  if (*(code **)(lVar5 + 0x88) == (code *)0x0) {
LAB_00a68aec:
    iVar1 = (**(code **)(lVar5 + 0x48))(ptr[1],lVar4,in_x6,in_x4);
    if (((iVar1 == 0) ||
        (iVar1 = (**(code **)(*ptr + 0x50))(ptr[1],in_x7,in_stack_00000000), iVar1 == 0)) ||
       (iVar1 = FUN_00a6867c(ptr,0,in_stack_00000008,&local_58,in_stack_00000010), iVar1 == 0))
    goto LAB_00a68bd8;
    if (in_stack_00000008 == (void *)0x0) {
      in_stack_00000008 = CRYPTO_malloc((int)local_58,"crypto/evp/mac_lib.c",0x120);
      if (in_stack_00000008 != (void *)0x0) {
        iVar1 = FUN_00a6867c(ptr,0,in_stack_00000008,0,local_58);
        if (iVar1 == 0) {
          CRYPTO_free(in_stack_00000008);
          goto LAB_00a68bd8;
        }
        goto LAB_00a68b40;
      }
    }
    else {
LAB_00a68b40:
      if ((in_stack_00000018 != (undefined8 *)0x0) && (in_stack_00000008 != (void *)0x0)) {
        *in_stack_00000018 = local_58;
      }
    }
  }
  else {
    iVar1 = (**(code **)(lVar5 + 0x88))(ptr[1],&local_b0);
    if (iVar1 != 0) {
      lVar5 = *ptr;
      if (*(code **)(lVar5 + 0x88) != (code *)0x0) {
        iVar1 = (**(code **)(lVar5 + 0x88))(ptr[1],in_x4);
        if (iVar1 == 0) goto LAB_00a68bd8;
        lVar5 = *ptr;
      }
      goto LAB_00a68aec;
    }
LAB_00a68bd8:
    in_stack_00000008 = (void *)0x0;
  }
  (**(code **)(*ptr + 0x40))(ptr[1]);
  ptr[1] = 0;
  EVP_MAC_free(*ptr);
  CRYPTO_free(ptr);
LAB_00a68c08:
  EVP_MAC_free(lVar2);
  return in_stack_00000008;
}

