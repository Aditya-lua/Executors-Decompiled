/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6867c
 */

undefined8 FUN_00a6867c(long *param_1,int param_2,long param_3,ulong *param_4,ulong param_5)

{
  ulong uVar1;
  int iVar2;
  undefined8 uVar3;
  code *pcVar4;
  int local_cc;
  ulong local_c8;
  undefined8 uStack_c0;
  undefined8 local_b8;
  undefined8 uStack_b0;
  undefined8 local_a8;
  ulong local_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 local_80;
  ulong local_78;
  undefined8 uStack_70;
  undefined8 local_68;
  undefined8 uStack_60;
  undefined8 local_58;
  ulong local_48;
  
  local_cc = param_2;
  if ((param_1 == (long *)0x0) || (*param_1 == 0)) {
    ERR_new();
    ERR_set_debug("crypto/evp/mac_lib.c",0x8a,"evp_mac_final");
    uVar3 = 0xda;
    goto LAB_00a6875c;
  }
  if (*(long *)(*param_1 + 0x58) == 0) {
    ERR_new();
    ERR_set_debug("crypto/evp/mac_lib.c",0x8e,"evp_mac_final");
    uVar3 = 0xbc;
    goto LAB_00a6875c;
  }
  local_48 = 0;
  if (param_1[1] == 0) {
LAB_00a687bc:
    uVar1 = 0;
  }
  else {
    memset(&local_a0,0,0x50);
    OSSL_PARAM_construct_size_t(&local_c8,&DAT_002d7e7d,&local_48);
    local_80 = local_a8;
    uStack_98 = uStack_c0;
    local_a0 = local_c8;
    uStack_88 = uStack_b0;
    uStack_90 = local_b8;
    pcVar4 = *(code **)(*param_1 + 0x80);
    if (pcVar4 == (code *)0x0) {
      pcVar4 = *(code **)(*param_1 + 0x78);
      if (pcVar4 == (code *)0x0) goto LAB_00a687bc;
      iVar2 = (*pcVar4)(&local_a0);
    }
    else {
      iVar2 = (*pcVar4)(param_1[1],&local_a0);
    }
    if (iVar2 == 0) goto LAB_00a687bc;
    uVar1 = local_48;
  }
  if (param_3 == 0) {
    if (param_4 != (ulong *)0x0) {
      *param_4 = uVar1;
      return 1;
    }
    ERR_new();
    ERR_set_debug("crypto/evp/mac_lib.c",0x95,"evp_mac_final");
    uVar3 = 0xc0102;
  }
  else {
    if (uVar1 <= param_5) {
      if (local_cc != 0) {
        OSSL_PARAM_construct_int(&local_c8,&DAT_002dbfe7,&local_cc);
        local_80 = local_a8;
        uStack_98 = uStack_c0;
        local_a0 = local_c8;
        uStack_88 = uStack_b0;
        uStack_90 = local_b8;
        OSSL_PARAM_construct_end(&local_c8);
        local_58 = local_a8;
        uStack_60 = uStack_b0;
        local_68 = local_b8;
        uStack_70 = uStack_c0;
        local_78 = local_c8;
        if ((*(code **)(*param_1 + 0x88) != (code *)0x0) &&
           (iVar2 = (**(code **)(*param_1 + 0x88))(param_1[1],&local_a0), iVar2 < 1)) {
          ERR_new();
          ERR_set_debug("crypto/evp/mac_lib.c",0xa4,"evp_mac_final");
          uVar3 = 0xe3;
          goto LAB_00a6875c;
        }
      }
      uVar3 = (**(code **)(*param_1 + 0x58))(param_1[1],param_3,&local_c8,param_5);
      if (param_4 == (ulong *)0x0) {
        return uVar3;
      }
      *param_4 = local_c8;
      return uVar3;
    }
    ERR_new();
    ERR_set_debug("crypto/evp/mac_lib.c",0x9c,"evp_mac_final");
    uVar3 = 0x9b;
  }
LAB_00a6875c:
  ERR_set_error(6,uVar3,0);
  return 0;
}

