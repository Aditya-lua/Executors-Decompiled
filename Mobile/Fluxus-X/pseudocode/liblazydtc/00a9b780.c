/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9b780
 */

undefined8 FUN_00a9b780(byte *param_1,ulong param_2,ulong *param_3,char *param_4,char param_5)

{
  char cVar1;
  uint uVar2;
  uint uVar3;
  byte *pbVar4;
  undefined8 uVar5;
  char *pcVar6;
  ulong uVar7;
  
  uVar7 = 0;
  while( true ) {
    pbVar4 = param_1;
    param_4 = param_4 + 1;
    do {
      pcVar6 = param_4;
      cVar1 = pcVar6[-1];
      if (cVar1 == '\0') {
        if (param_3 != (ulong *)0x0) {
          *param_3 = uVar7;
        }
        return 1;
      }
      param_4 = pcVar6 + 1;
    } while ((param_5 != '\0') && (cVar1 == param_5));
    if (*pcVar6 == '\0') break;
    uVar2 = OPENSSL_hexchar2int();
    uVar3 = OPENSSL_hexchar2int(cVar1);
    if ((int)(uVar3 | uVar2) < 0) {
      ERR_new();
      ERR_set_debug("crypto/o_str.c",0xa0,"hexstr2buf_sep");
      uVar5 = 0x66;
LAB_00a9b8b0:
      ERR_set_error(0xf,uVar5,0);
      return 0;
    }
    uVar7 = uVar7 + 1;
    param_1 = (byte *)0x0;
    if (pbVar4 != (byte *)0x0) {
      if (param_2 < uVar7) {
        ERR_new();
        ERR_set_debug("crypto/o_str.c",0xa6,"hexstr2buf_sep");
        uVar5 = 0x74;
        goto LAB_00a9b8b0;
      }
      *pbVar4 = (byte)uVar2 | (byte)(uVar3 << 4);
      param_1 = pbVar4 + 1;
    }
  }
  ERR_new();
  ERR_set_debug("crypto/o_str.c",0x9a,"hexstr2buf_sep");
  uVar5 = 0x67;
  goto LAB_00a9b8b0;
}

