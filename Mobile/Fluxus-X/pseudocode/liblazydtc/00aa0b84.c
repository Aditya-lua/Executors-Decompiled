/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa0b84
 */

int BN_asc2bn(BIGNUM **a,char *str)

{
  char *pcVar1;
  char *str_00;
  int iVar2;
  
  pcVar1 = str;
  if (*str == '-') {
    pcVar1 = str + 1;
  }
  str_00 = str + 1;
  if (*str != '-') {
    str_00 = str;
  }
  if ((*pcVar1 == '0') && ((byte)(str_00[1] | 0x20U) == 0x78)) {
    iVar2 = BN_hex2bn(a,str_00 + 2);
    if (iVar2 == 0) {
      return 0;
    }
  }
  else {
    iVar2 = BN_dec2bn(a,str_00);
    if (iVar2 == 0) {
      return 0;
    }
  }
  if ((*str == '-') && ((*a)->top != 0)) {
    (*a)->neg = 1;
  }
  return 1;
}

