/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f7610
 */

undefined8 FUN_009f7610(long ***param_1,ulong *param_2,undefined8 param_3,undefined8 param_4)

{
  undefined8 uVar1;
  long **pplVar2;
  ulong uVar3;
  long ***ppplVar4;
  long ***local_38;
  
  uVar1 = (*(code *)param_2[4])();
  uVar3 = *param_2;
  ppplVar4 = param_1;
  if (((uint)uVar3 >> 0xc & 1) != 0) {
    ppplVar4 = (long ***)&local_38;
    local_38 = param_1;
  }
  if ((uVar3 & 1) == 0) {
    if ((uVar3 & 0x300) == 0) {
      if ((uVar3 & 6) == 0) {
        uVar1 = FUN_009f7310(ppplVar4,uVar1,(uint)uVar3 & 0x1000,param_3,param_4);
        return uVar1;
      }
      pplVar2 = (long **)OPENSSL_sk_new_null();
      if (pplVar2 == (long **)0x0) {
        ERR_new();
        ERR_set_debug("crypto/asn1/tasn_new.c",0xe9,"asn1_template_new");
        ERR_set_error(0xd,0xc0100,0);
        return 0;
      }
      *ppplVar4 = pplVar2;
    }
    else {
      *ppplVar4 = (long **)0x0;
    }
  }
  else {
    FUN_009f787c(ppplVar4,param_2);
  }
  return 1;
}

