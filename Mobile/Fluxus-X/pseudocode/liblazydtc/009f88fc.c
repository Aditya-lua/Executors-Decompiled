/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f88fc
 */

undefined8
FUN_009f88fc(long *param_1,undefined8 param_2,int param_3,undefined8 param_4,undefined8 param_5,
            long param_6)

{
  undefined8 uVar1;
  uint uVar2;
  undefined4 *puVar3;
  int local_44;
  ulong local_40;
  undefined8 uStack_38;
  
  local_40 = 0;
  local_44 = 0;
  puVar3 = (undefined4 *)*param_1;
  uStack_38 = param_2;
  if (puVar3 == (undefined4 *)0x0) {
    puVar3 = (undefined4 *)CRYPTO_zalloc(8,"crypto/asn1/x_int64.c",0x1f);
    *param_1 = (long)puVar3;
    if (puVar3 == (undefined4 *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/asn1/x_int64.c",0x20,"uint64_new");
      uVar1 = 0xc0100;
      goto LAB_009f8a14;
    }
  }
  if (param_3 == 0) {
    local_40 = 0;
    goto LAB_009f89a4;
  }
  uVar1 = ossl_c2i_uint64_int(&local_40,&local_44,&uStack_38,(long)param_3);
  if ((int)uVar1 == 0) {
    return uVar1;
  }
  uVar2 = (uint)*(ulong *)(param_6 + 0x28);
  if (((uVar2 >> 1 & 1) == 0) && (local_44 != 0)) {
    ERR_new();
    ERR_set_debug("crypto/asn1/x_int64.c",200,"uint32_c2i");
    uVar1 = 0xe2;
  }
  else if (local_44 == 0) {
    if ((((uint)(local_40 >> 0x1f != 0) & uVar2 >> 1) == 0) &&
       ((*(ulong *)(param_6 + 0x28) & 2) != 0 || local_40 >> 0x20 == 0)) goto LAB_009f89a4;
    ERR_new();
    ERR_set_debug("crypto/asn1/x_int64.c",0xd4,"uint32_c2i");
    uVar1 = 0xdf;
  }
  else {
    if (local_40 < 0x80000001) {
      local_40 = -local_40;
LAB_009f89a4:
      *puVar3 = (int)local_40;
      return 1;
    }
    ERR_new();
    ERR_set_debug("crypto/asn1/x_int64.c",0xcd,"uint32_c2i");
    uVar1 = 0xe0;
  }
LAB_009f8a14:
  ERR_set_error(0xd,uVar1,0);
  return 0;
}

