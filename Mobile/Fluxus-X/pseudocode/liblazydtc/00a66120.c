/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a66120
 */

undefined8
evp_keymgmt_util_get_deflt_digest_name
          (undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  char *pcVar1;
  int iVar2;
  char *pcVar3;
  long lVar4;
  undefined8 uVar5;
  undefined8 local_1b0;
  undefined8 uStack_1a8;
  undefined8 uStack_1a0;
  undefined8 uStack_198;
  ulong local_190;
  char acStack_188 [100];
  char acStack_124 [100];
  undefined8 local_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  ulong local_a0 [6];
  undefined8 local_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  ulong local_50;
  
  memset(acStack_124,0,100);
  memset(acStack_188,0,100);
  OSSL_PARAM_construct_utf8_string(&local_1b0,"default-digest",acStack_124,100);
  local_a0[0] = local_190;
  uStack_b8 = uStack_1a8;
  local_c0 = local_1b0;
  uStack_a8 = uStack_198;
  uStack_b0 = uStack_1a0;
  OSSL_PARAM_construct_utf8_string(&local_1b0,"mandatory-digest",acStack_188,100);
  local_a0[5] = local_190;
  local_a0[4] = uStack_198;
  local_a0[3] = uStack_1a0;
  local_a0[2] = uStack_1a8;
  local_a0[1] = local_1b0;
  OSSL_PARAM_construct_end(&local_1b0);
  local_50 = local_190;
  uStack_68 = uStack_1a8;
  local_70 = local_1b0;
  uStack_58 = uStack_198;
  uStack_60 = uStack_1a0;
  iVar2 = evp_keymgmt_get_params(param_1,param_2,&local_c0);
  if (iVar2 == 0) {
    uVar5 = 0;
  }
  else {
    iVar2 = OSSL_PARAM_modified(local_a0 + 1);
    if (iVar2 == 0) {
      iVar2 = OSSL_PARAM_modified(&local_c0);
      if (iVar2 == 0) {
        return 0xfffffffe;
      }
      lVar4 = 0;
      pcVar3 = acStack_124;
      uVar5 = 1;
    }
    else {
      pcVar3 = acStack_188;
      uVar5 = 2;
      lVar4 = 1;
    }
    pcVar1 = "UNDEF";
    if (1 < local_a0[lVar4 * 5]) {
      pcVar1 = pcVar3;
    }
    OPENSSL_strlcpy(param_3,pcVar1,param_4);
  }
  return uVar5;
}

