/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a61a4c
 */

bool OSSL_ENCODER_to_bio(long param_1,undefined8 param_2)

{
  int iVar1;
  undefined8 uVar2;
  char *pcVar3;
  long local_68;
  undefined8 uStack_60;
  undefined8 local_58;
  undefined8 uStack_50;
  undefined8 local_48;
  undefined8 uStack_40;
  undefined8 local_38;
  undefined8 uStack_30;
  undefined8 local_28;
  
  local_28 = 0;
  uStack_30 = 0;
  local_38 = 0;
  uStack_40 = 0;
  local_48 = 0;
  uStack_50 = 0;
  local_58 = 0;
  local_68 = param_1;
  uStack_60 = param_2;
  if ((param_1 == 0) || (*(long *)(param_1 + 0x18) == 0)) {
    local_58 = 0;
  }
  else {
    iVar1 = OPENSSL_sk_num();
    local_58 = CONCAT44(local_58._4_4_,iVar1);
    if (iVar1 != 0) {
      if ((*(long *)(param_1 + 0x28) != 0) && (*(long *)(param_1 + 0x20) != 0)) {
        iVar1 = FUN_00a61b40(&local_68);
        return 0 < iVar1;
      }
      ERR_new();
      ERR_set_debug("crypto/encode_decode/encoder_lib.c",0x3f,"OSSL_ENCODER_to_bio");
      uVar2 = 0xc0105;
      pcVar3 = (char *)0x0;
      goto LAB_00a61ae0;
    }
  }
  ERR_new();
  ERR_set_debug("crypto/encode_decode/encoder_lib.c",0x37,"OSSL_ENCODER_to_bio");
  pcVar3 = 
  "No encoders were found. For standard encoders you need at least one of the default or base providers available. Did you forget to load them?"
  ;
  uVar2 = 0x65;
LAB_00a61ae0:
  ERR_set_error(0x3b,uVar2,pcVar3);
  return false;
}

