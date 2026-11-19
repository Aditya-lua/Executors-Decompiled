/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f39c4
 */

undefined8
ossl_c2i_uint64_int(ulong *param_1,undefined8 param_2,undefined8 *param_3,undefined8 param_4)

{
  ulong uVar1;
  undefined8 uVar2;
  ulong uVar3;
  byte *pbVar4;
  byte abStack_38 [8];
  
  uVar1 = FUN_009f2ec4(0,0,*param_3);
  uVar2 = 0;
  if (uVar1 != 0) {
    if (uVar1 < 9) {
      FUN_009f2ec4(abStack_38,param_2,*param_3,param_4);
      uVar3 = 0;
      pbVar4 = abStack_38;
      do {
        uVar1 = uVar1 - 1;
        uVar3 = (ulong)*pbVar4 | uVar3 << 8;
        pbVar4 = pbVar4 + 1;
      } while (uVar1 != 0);
      uVar2 = 1;
      *param_1 = uVar3;
    }
    else {
      ERR_new();
      ERR_set_debug("crypto/asn1/a_int.c",0x274,"ossl_c2i_uint64_int");
      ERR_set_error(0xd,0xdf,0);
      uVar2 = 0;
    }
  }
  return uVar2;
}

