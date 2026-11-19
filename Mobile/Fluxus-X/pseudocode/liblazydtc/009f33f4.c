/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f33f4
 */

undefined8 ASN1_INTEGER_get_uint64(ulong *param_1,uint *param_2)

{
  uint uVar1;
  undefined8 uVar2;
  long lVar3;
  byte *pbVar4;
  ulong uVar5;
  
  if (param_2 == (uint *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/asn1/a_int.c",0x16d,"asn1_string_get_uint64");
    uVar2 = 0xc0102;
  }
  else if ((param_2[1] & 0xfffffeff) == 2) {
    if ((param_2[1] >> 8 & 1) == 0) {
      uVar1 = *param_2;
      lVar3 = (long)(int)uVar1;
      if (uVar1 < 9) {
        if (*(byte **)(param_2 + 2) == (byte *)0x0) {
          return 0;
        }
        if (uVar1 == 0) {
          uVar5 = 0;
        }
        else {
          uVar5 = 0;
          pbVar4 = *(byte **)(param_2 + 2);
          do {
            lVar3 = lVar3 + -1;
            uVar5 = (ulong)*pbVar4 | uVar5 << 8;
            pbVar4 = pbVar4 + 1;
          } while (lVar3 != 0);
        }
        *param_1 = uVar5;
        return 1;
      }
      ERR_new();
      ERR_set_debug("crypto/asn1/a_int.c",0xdb,"asn1_get_uint64");
      uVar2 = 0xdf;
    }
    else {
      ERR_new();
      ERR_set_debug("crypto/asn1/a_int.c",0x175,"asn1_string_get_uint64");
      uVar2 = 0xe2;
    }
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/asn1/a_int.c",0x171,"asn1_string_get_uint64");
    uVar2 = 0xe1;
  }
  ERR_set_error(0xd,uVar2,0);
  return 0;
}

