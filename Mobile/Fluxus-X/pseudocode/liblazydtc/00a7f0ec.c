/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7f0ec
 */

ulong ossl_ffc_params_simple_validate
                (undefined8 param_1,long param_2,undefined4 param_3,byte *param_4)

{
  byte *pbVar1;
  int iVar2;
  int iVar3;
  ulong uVar4;
  BIGNUM *local_98;
  BIGNUM *local_90;
  undefined4 local_60;
  undefined4 local_58;
  undefined4 local_34;
  
  local_34 = 0;
  memset(&local_98,0,0x60);
  if (param_2 == 0) {
    return 0;
  }
  pbVar1 = (byte *)&local_34;
  if (param_4 != (byte *)0x0) {
    pbVar1 = param_4;
  }
  uVar4 = ossl_ffc_params_copy(&local_98,param_2);
  if ((int)uVar4 == 0) {
    return uVar4;
  }
  local_58 = 2;
  local_60 = 0xffffffff;
  if ((*(byte *)(param_2 + 0x40) >> 2 & 1) == 0) {
    if ((local_98 != (BIGNUM *)0x0) && (local_90 != (BIGNUM *)0x0)) {
      iVar2 = BN_num_bits(local_98);
      iVar3 = BN_num_bits(local_90);
      iVar2 = ossl_ffc_params_FIPS186_4_gen_verify
                        (param_1,&local_98,0,param_3,(long)iVar2,(long)iVar3,pbVar1,0);
joined_r0x00a7f200:
      if (iVar2 != 0) goto LAB_00a7f24c;
    }
  }
  else {
    if ((local_98 != (BIGNUM *)0x0) && (local_90 != (BIGNUM *)0x0)) {
      iVar2 = BN_num_bits(local_98);
      iVar3 = BN_num_bits(local_90);
      iVar2 = ossl_ffc_params_FIPS186_2_gen_verify
                        (param_1,&local_98,0,param_3,(long)iVar2,(long)iVar3,pbVar1,0);
      goto joined_r0x00a7f200;
    }
    pbVar1[0] = 0;
    pbVar1[1] = 8;
    pbVar1[2] = 0;
    pbVar1[3] = 0;
  }
  iVar2 = 0;
  if ((*pbVar1 >> 3 & 1) != 0) {
    ERR_new();
    ERR_set_debug("crypto/ffc/ffc_params_validate.c",0x7d,"ossl_ffc_params_simple_validate");
    ERR_set_error(5,0x78,0);
    iVar2 = 0;
  }
LAB_00a7f24c:
  ossl_ffc_params_cleanup(&local_98);
  return (ulong)(iVar2 != 0);
}

