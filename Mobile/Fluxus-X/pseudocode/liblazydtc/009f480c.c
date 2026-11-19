/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f480c
 */

undefined8
FUN_009f480c(long param_1,long *param_2,undefined8 param_3,uint *param_4,undefined8 param_5,
            undefined8 param_6,undefined4 param_7,undefined8 param_8,undefined8 param_9)

{
  char *pcVar1;
  int iVar2;
  undefined8 uVar3;
  undefined8 in_stack_ffffffffffffff80;
  char local_68 [4];
  char local_64 [4];
  char *local_60;
  char *local_58;
  
  if (param_1 == 0) {
    return 0;
  }
  local_60 = (char *)*param_2;
  if ((*param_4 >> 4 & 1) == 0) {
    uVar3 = FUN_009f5488(param_1,param_2,param_3,param_4,param_5,param_6,param_7,param_8,param_9);
    return uVar3;
  }
  uVar3 = FUN_009f5200(&local_58,0,0,local_64,local_68,&local_60,param_3,param_4[2],
                       CONCAT44((int)((ulong)in_stack_ffffffffffffff80 >> 0x20),*param_4) &
                       0xffffffff000000c0,(char)param_5,param_6);
  pcVar1 = local_60;
  if ((int)uVar3 == -1) {
    return uVar3;
  }
  if ((int)uVar3 == 0) {
    ERR_new();
    uVar3 = 0x20d;
  }
  else {
    if (local_68[0] == '\0') {
      ERR_new();
      ERR_set_debug("crypto/asn1/tasn_dec.c",0x212,"asn1_template_ex_d2i");
      uVar3 = 0x78;
      goto LAB_009f499c;
    }
    iVar2 = FUN_009f5488(param_1,&local_60,local_58,param_4,0,param_6,param_7,param_8,param_9);
    if (iVar2 != 0) {
      local_58 = pcVar1 + ((long)local_58 - (long)local_60);
      if (local_64[0] == '\0') {
        if (local_58 == (char *)0x0) goto LAB_009f4a14;
        ERR_new();
        ERR_set_debug("crypto/asn1/tasn_dec.c",0x229,"asn1_template_ex_d2i");
        uVar3 = 0x77;
      }
      else {
        if (((1 < (long)local_58) && (*local_60 == '\0')) && (local_60[1] == '\0')) {
          local_60 = local_60 + 2;
LAB_009f4a14:
          *param_2 = (long)local_60;
          return 1;
        }
        ERR_new();
        ERR_set_debug("crypto/asn1/tasn_dec.c",0x221,"asn1_template_ex_d2i");
        uVar3 = 0x89;
      }
      goto LAB_009f499c;
    }
    ERR_new();
    uVar3 = 0x219;
  }
  ERR_set_debug("crypto/asn1/tasn_dec.c",uVar3,"asn1_template_ex_d2i");
  uVar3 = 0x8010a;
LAB_009f499c:
  ERR_set_error(0xd,uVar3,0);
  return 0;
}

