/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f320c
 */

undefined8 FUN_009f320c(ulong *param_1,uint *param_2,uint param_3)

{
  uint uVar1;
  undefined8 uVar2;
  char *pcVar3;
  ulong uVar4;
  long lVar5;
  byte *pbVar6;
  ulong uVar7;
  
  if (param_2 == (uint *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/asn1/a_int.c",0x14a,"asn1_string_get_int64");
    uVar2 = 0xc0102;
  }
  else if ((param_2[1] & 0xfffffeff) == param_3) {
    uVar1 = *param_2;
    lVar5 = (long)(int)uVar1;
    if (uVar1 < 9) {
      if (*(byte **)(param_2 + 2) == (byte *)0x0) {
        return 0;
      }
      if (uVar1 == 0) {
        uVar7 = 0;
      }
      else {
        uVar7 = 0;
        pbVar6 = *(byte **)(param_2 + 2);
        do {
          lVar5 = lVar5 + -1;
          uVar7 = (ulong)*pbVar6 | uVar7 << 8;
          pbVar6 = pbVar6 + 1;
        } while (lVar5 != 0);
      }
      if ((param_2[1] >> 8 & 1) != 0) {
        if ((long)uVar7 < 0) {
          uVar4 = 0x8000000000000000;
          if (uVar7 != 0x8000000000000000) {
            ERR_new();
            ERR_set_debug("crypto/asn1/a_int.c",0x10f,"asn1_get_int64");
            uVar2 = 0xe0;
            goto LAB_009f32ac;
          }
        }
        else {
          uVar4 = -uVar7;
        }
        *param_1 = uVar4;
        return 1;
      }
      if (-1 < (long)uVar7) {
        *param_1 = uVar7;
        return 1;
      }
      ERR_new();
      pcVar3 = "asn1_get_int64";
      uVar2 = 0x116;
    }
    else {
      ERR_new();
      pcVar3 = "asn1_get_uint64";
      uVar2 = 0xdb;
    }
    ERR_set_debug("crypto/asn1/a_int.c",uVar2,pcVar3);
    uVar2 = 0xdf;
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/asn1/a_int.c",0x14e,"asn1_string_get_int64");
    uVar2 = 0xe1;
  }
LAB_009f32ac:
  ERR_set_error(0xd,uVar2,0);
  return 0;
}

