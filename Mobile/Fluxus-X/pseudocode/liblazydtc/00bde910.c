/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bde910
 */

/* std::__ndk1::__num_get<char>::__stage2_int_loop(char, int, char*, char*&, unsigned int&, char,
   std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >
   const&, unsigned int*, unsigned int*&, char*) */

undefined8
std::__ndk1::__num_get<char>::__stage2_int_loop
          (char param_1,int param_2,char *param_3,char **param_4,uint *param_5,char param_6,
          basic_string_conflict *param_7,uint *param_8,uint **param_9,char *param_10)

{
  ulong uVar1;
  char *pcVar2;
  char *pcVar3;
  undefined8 uVar4;
  char cVar5;
  long lVar6;
  uint *puVar7;
  char *pcVar8;
  
  pcVar8 = *param_4;
  if (pcVar8 == param_3) {
    if (param_1 == param_10[0x18]) {
      cVar5 = '+';
LAB_00bde9f4:
      *param_4 = pcVar8 + 1;
      *pcVar8 = cVar5;
      *param_5 = 0;
      return 0;
    }
    if (param_1 == param_10[0x19]) {
      cVar5 = '-';
      goto LAB_00bde9f4;
    }
  }
  uVar1 = (ulong)((byte)*param_7 >> 1);
  if (((byte)*param_7 & 1) != 0) {
    uVar1 = *(ulong *)(param_7 + 8);
  }
  if ((param_1 == param_6) && (uVar1 != 0)) {
    puVar7 = *param_9;
    if ((long)puVar7 - (long)param_8 < 0xa0) {
      *puVar7 = *param_5;
      *param_9 = puVar7 + 1;
      *param_5 = 0;
      return 0;
    }
    return 0;
  }
  pcVar3 = memchr(param_10,(uint)(byte)param_1,0x1a);
  pcVar2 = param_10 + 0x1a;
  if (pcVar3 != (char *)0x0) {
    pcVar2 = pcVar3;
  }
  lVar6 = (long)pcVar2 - (long)param_10;
  if (lVar6 < 0x18) {
    if (param_2 == 8) {
LAB_00bdea2c:
      if ((long)(ulong)(uint)param_2 <= lVar6) goto LAB_00bde9dc;
    }
    else if (param_2 == 0x10) {
      if (0x15 < lVar6) {
        if (pcVar8 == param_3) {
          return 0xffffffff;
        }
        if (2 < (long)pcVar8 - (long)param_3) {
          return 0xffffffff;
        }
        if (pcVar8[-1] == '0') {
          *param_5 = 0;
          cVar5 = "0123456789abcdefABCDEFxX+-pPiInN"[lVar6];
          *param_4 = pcVar8 + 1;
          *pcVar8 = cVar5;
          return 0;
        }
        return 0xffffffff;
      }
    }
    else if (param_2 == 10) goto LAB_00bdea2c;
    uVar4 = 0;
    cVar5 = "0123456789abcdefABCDEFxX+-pPiInN"[lVar6];
    *param_4 = pcVar8 + 1;
    *pcVar8 = cVar5;
    *param_5 = *param_5 + 1;
  }
  else {
LAB_00bde9dc:
    uVar4 = 0xffffffff;
  }
  return uVar4;
}

