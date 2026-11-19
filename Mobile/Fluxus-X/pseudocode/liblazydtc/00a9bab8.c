/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9bab8
 */

char * ossl_buf2hexstr_sep(byte *param_1,long param_2,char param_3)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  char *pcVar4;
  char *pcVar5;
  char *pcVar6;
  
  if (param_2 == 0) {
    pcVar4 = (char *)CRYPTO_zalloc(1,"crypto/o_str.c",0x110);
    return pcVar4;
  }
  uVar1 = param_2 << 1 | 1;
  uVar2 = uVar1;
  if (param_3 != '\0') {
    uVar2 = param_2 * 3;
  }
  pcVar4 = CRYPTO_malloc((int)uVar2,"crypto/o_str.c",0x113);
  if (pcVar4 == (char *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/o_str.c",0x114,"ossl_buf2hexstr_sep");
    ERR_set_error(0xf,0xc0100,0);
  }
  else {
    uVar3 = param_2 * 3;
    if (param_3 == '\0') {
      uVar3 = uVar1;
    }
    if (uVar2 < uVar3) {
      ERR_new();
      ERR_set_debug("crypto/o_str.c",0xee,"buf2hexstr_sep");
      ERR_set_error(0xf,0x74,0);
      CRYPTO_free(pcVar4);
      pcVar4 = (char *)0x0;
    }
    else {
      pcVar5 = pcVar4;
      do {
        *pcVar5 = "0123456789ABCDEF"[*param_1 >> 4];
        pcVar5[1] = "0123456789ABCDEF"[(ulong)*param_1 & 0xf];
        if (param_3 == '\0') {
          pcVar6 = pcVar5 + 2;
        }
        else {
          pcVar6 = pcVar5 + 3;
          pcVar5[2] = param_3;
        }
        param_2 = param_2 + -1;
        param_1 = param_1 + 1;
        pcVar5 = pcVar6;
      } while (param_2 != 0);
      pcVar5 = pcVar6 + -1;
      if (param_3 == '\0') {
        pcVar5 = pcVar6;
      }
      *pcVar5 = '\0';
    }
  }
  return pcVar4;
}

