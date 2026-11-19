/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00be30ac
 */

/* std::__ndk1::__num_get<wchar_t>::__stage2_int_loop(wchar_t, int, char*, char*&, unsigned int&,
   wchar_t, std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&, unsigned int*, unsigned int*&, wchar_t*) */

undefined8
std::__ndk1::__num_get<wchar_t>::__stage2_int_loop
          (wchar_t param_1,int param_2,char *param_3,char **param_4,uint *param_5,wchar_t param_6,
          basic_string_conflict *param_7,uint *param_8,uint **param_9,wchar_t *param_10)

{
  ulong uVar1;
  wchar_t *pwVar2;
  wchar_t *pwVar3;
  undefined8 uVar4;
  char *pcVar5;
  long lVar6;
  char cVar7;
  uint *puVar8;
  
  pcVar5 = *param_4;
  if (pcVar5 == param_3) {
    if (param_1 == param_10[0x18]) {
      cVar7 = '+';
LAB_00be3188:
      *param_4 = pcVar5 + 1;
      *pcVar5 = cVar7;
      *param_5 = 0;
      return 0;
    }
    if (param_1 == param_10[0x19]) {
      cVar7 = '-';
      goto LAB_00be3188;
    }
  }
  uVar1 = (ulong)((byte)*param_7 >> 1);
  if (((byte)*param_7 & 1) != 0) {
    uVar1 = *(ulong *)(param_7 + 8);
  }
  if ((param_1 == param_6) && (uVar1 != 0)) {
    puVar8 = *param_9;
    if ((long)puVar8 - (long)param_8 < 0xa0) {
      *puVar8 = *param_5;
      *param_9 = puVar8 + 1;
      *param_5 = 0;
      return 0;
    }
    return 0;
  }
  pwVar3 = wmemchr(param_10,param_1,0x1a);
  pwVar2 = param_10 + 0x1a;
  if (pwVar3 != (wchar_t *)0x0) {
    pwVar2 = pwVar3;
  }
  lVar6 = (long)pwVar2 - (long)param_10 >> 2;
  if (lVar6 < 0x18) {
    if (param_2 == 8) {
LAB_00be31c0:
      if ((long)(ulong)(uint)param_2 <= lVar6) goto LAB_00be3170;
    }
    else if (param_2 == 0x10) {
      if (0x15 < lVar6) {
        pcVar5 = *param_4;
        if (pcVar5 == param_3) {
          return 0xffffffff;
        }
        if (2 < (long)pcVar5 - (long)param_3) {
          return 0xffffffff;
        }
        if (pcVar5[-1] == '0') {
          *param_5 = 0;
          cVar7 = "0123456789abcdefABCDEFxX+-pPiInN"[lVar6];
          *param_4 = pcVar5 + 1;
          *pcVar5 = cVar7;
          return 0;
        }
        return 0xffffffff;
      }
    }
    else if (param_2 == 10) goto LAB_00be31c0;
    uVar4 = 0;
    pcVar5 = *param_4;
    cVar7 = "0123456789abcdefABCDEFxX+-pPiInN"[lVar6];
    *param_4 = pcVar5 + 1;
    *pcVar5 = cVar7;
    *param_5 = *param_5 + 1;
  }
  else {
LAB_00be3170:
    uVar4 = 0xffffffff;
  }
  return uVar4;
}

