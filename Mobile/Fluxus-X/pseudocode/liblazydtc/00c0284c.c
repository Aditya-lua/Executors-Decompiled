/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0284c
 */

/* std::__ndk1::__num_put_base::__format_float(char*, char const*, unsigned int) */

bool std::__ndk1::__num_put_base::__format_float(char *param_1,char *param_2,uint param_3)

{
  uint uVar1;
  bool bVar2;
  char *pcVar3;
  char *pcVar4;
  char cVar5;
  char cVar6;
  
  pcVar3 = param_1;
  if ((param_3 >> 0xb & 1) != 0) {
    pcVar3 = param_1 + 1;
    *param_1 = '+';
  }
  pcVar4 = pcVar3;
  if ((param_3 >> 10 & 1) != 0) {
    pcVar4 = pcVar3 + 1;
    *pcVar3 = '#';
  }
  uVar1 = param_3 & 0x104;
  pcVar3 = pcVar4;
  if (uVar1 != 0x104) {
    pcVar3 = pcVar4 + 2;
    pcVar4[0] = '.';
    pcVar4[1] = '*';
  }
  cVar6 = *param_2;
  if (cVar6 != '\0') {
    pcVar4 = pcVar3;
    do {
      param_2 = param_2 + 1;
      pcVar3 = pcVar4 + 1;
      *pcVar4 = cVar6;
      cVar6 = *param_2;
      pcVar4 = pcVar3;
    } while (cVar6 != '\0');
  }
  if (uVar1 == 0x100) {
    bVar2 = (param_3 & 0x4000) == 0;
    cVar5 = 'E';
    cVar6 = 'e';
  }
  else if (uVar1 == 4) {
    bVar2 = (param_3 & 0x4000) == 0;
    cVar5 = 'F';
    cVar6 = 'f';
  }
  else if (uVar1 == 0x104) {
    bVar2 = (param_3 & 0x4000) == 0;
    cVar5 = 'A';
    cVar6 = 'a';
  }
  else {
    bVar2 = (param_3 & 0x4000) == 0;
    cVar5 = 'G';
    cVar6 = 'g';
  }
  if (!bVar2) {
    cVar6 = cVar5;
  }
  *pcVar3 = cVar6;
  return uVar1 != 0x104;
}

