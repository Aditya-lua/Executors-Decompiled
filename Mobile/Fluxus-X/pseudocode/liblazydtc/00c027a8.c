/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c027a8
 */

/* std::__ndk1::__num_put_base::__format_int(char*, char const*, bool, unsigned int) */

void std::__ndk1::__num_put_base::__format_int
               (char *param_1,char *param_2,bool param_3,uint param_4)

{
  char *pcVar1;
  char *pcVar2;
  char cVar3;
  
  pcVar1 = param_1;
  if (((((param_4 >> 0xb & 1) != 0) && ((param_4 & 0x4a) != 8)) && ((param_4 & 0x4a) != 0x40)) &&
     (param_3)) {
    pcVar1 = param_1 + 1;
    *param_1 = '+';
  }
  pcVar2 = pcVar1;
  if ((param_4 >> 9 & 1) != 0) {
    pcVar2 = pcVar1 + 1;
    *pcVar1 = '#';
  }
  cVar3 = *param_2;
  if (cVar3 != '\0') {
    pcVar1 = pcVar2;
    do {
      param_2 = param_2 + 1;
      pcVar2 = pcVar1 + 1;
      *pcVar1 = cVar3;
      cVar3 = *param_2;
      pcVar1 = pcVar2;
    } while (cVar3 != '\0');
  }
  if ((param_4 & 0x4a) == 0x40) {
    *pcVar2 = 'o';
    return;
  }
  if ((param_4 & 0x4a) == 8) {
    cVar3 = 'x';
    if ((param_4 & 0x4000) != 0) {
      cVar3 = 'X';
    }
    *pcVar2 = cVar3;
    return;
  }
  cVar3 = 'd';
  if (!param_3) {
    cVar3 = 'u';
  }
  *pcVar2 = cVar3;
  return;
}

