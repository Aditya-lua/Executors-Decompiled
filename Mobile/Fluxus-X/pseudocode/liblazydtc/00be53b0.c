/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00be53b0
 */

/* std::__ndk1::__num_put_base::__identify_padding(char*, char*, std::__ndk1::ios_base const&) */

char * std::__ndk1::__num_put_base::__identify_padding
                 (char *param_1,char *param_2,ios_base *param_3)

{
  char cVar1;
  
  if ((*(uint *)(param_3 + 8) & 0xb0) == 0x20) {
    return param_2;
  }
  if ((*(uint *)(param_3 + 8) & 0xb0) == 0x10) {
    cVar1 = *param_1;
    if ((cVar1 == '-') || (cVar1 == '+')) {
      return param_1 + 1;
    }
    if ((1 < (long)param_2 - (long)param_1) &&
       ((cVar1 == '0' && ((byte)(param_1[1] | 0x20U) == 0x78)))) {
      param_1 = param_1 + 2;
    }
  }
  return param_1;
}

