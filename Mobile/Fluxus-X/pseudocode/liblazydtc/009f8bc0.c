/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f8bc0
 */

undefined8
FUN_009f8bc0(long *param_1,undefined8 param_2,int param_3,undefined8 param_4,undefined8 param_5,
            long param_6)

{
  undefined8 uVar1;
  uint uVar2;
  long *plVar3;
  int local_44;
  long local_40;
  undefined8 uStack_38;
  
  local_40 = 0;
  local_44 = 0;
  plVar3 = (long *)*param_1;
  uStack_38 = param_2;
  if (plVar3 == (long *)0x0) {
    plVar3 = (long *)CRYPTO_zalloc(8,"crypto/asn1/x_int64.c",0x1f);
    *param_1 = (long)plVar3;
    if (plVar3 == (long *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/asn1/x_int64.c",0x20,"uint64_new");
      uVar1 = 0xc0100;
      goto LAB_009f8cd4;
    }
  }
  if (param_3 == 0) {
    local_40 = 0;
LAB_009f8c68:
    *plVar3 = local_40;
    return 1;
  }
  uVar1 = ossl_c2i_uint64_int(&local_40,&local_44,&uStack_38,(long)param_3);
  if ((int)uVar1 == 0) {
    return uVar1;
  }
  uVar2 = (uint)*(undefined8 *)(param_6 + 0x28);
  if (((uVar2 >> 1 & 1) == 0) && (local_44 != 0)) {
    ERR_new();
    ERR_set_debug("crypto/asn1/x_int64.c",0x61,"uint64_c2i");
    uVar1 = 0xe2;
  }
  else {
    if ((-1 < local_40) || (((uVar2 >> 1 & 1) == 0 || (local_44 != 0)))) {
      if (local_44 != 0) {
        local_40 = -local_40;
      }
      goto LAB_009f8c68;
    }
    ERR_new();
    ERR_set_debug("crypto/asn1/x_int64.c",0x66,"uint64_c2i");
    uVar1 = 0xdf;
  }
LAB_009f8cd4:
  ERR_set_error(0xd,uVar1,0);
  return 0;
}

