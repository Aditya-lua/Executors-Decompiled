/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b664e4
 */

undefined8
ossl_cipher_tlsunpadblock
          (undefined8 param_1,int param_2,long param_3,long *param_4,long param_5,undefined8 param_6
          ,undefined8 param_7,undefined8 param_8,undefined4 param_9)

{
  undefined8 uVar1;
  long lVar2;
  
  if (param_2 < 0x302) {
    if (param_2 != 0x100) {
      if (param_2 == 0x300) {
        uVar1 = ssl3_cbc_remove_padding_and_mac
                          (param_4,*param_4,param_3,param_6,param_7,param_5,param_8,param_1);
        return uVar1;
      }
      if (param_2 != 0x301) {
        return 0;
      }
      lVar2 = *param_4;
      goto LAB_00b66550;
    }
  }
  else if (((1 < param_2 - 0x302U) && (param_2 != 0xfefd)) && (param_2 != 0xfeff)) {
    return 0;
  }
  param_3 = param_3 + param_5;
  lVar2 = *param_4 - param_5;
  *param_4 = lVar2;
LAB_00b66550:
  uVar1 = tls1_cbc_remove_padding_and_mac
                    (param_4,lVar2,param_3,param_6,param_7,param_5,param_8,param_9);
  return uVar1;
}

