/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00be39a0
 */

/* std::__ndk1::__num_get<wchar_t>::__stage2_float_loop(wchar_t, bool&, char&, char*, char*&,
   wchar_t, wchar_t, std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&, unsigned int*, unsigned int*&, unsigned int&, wchar_t*) */

undefined8
std::__ndk1::__num_get<wchar_t>::__stage2_float_loop
          (wchar_t param_1,bool *param_2,char *param_3,char *param_4,char **param_5,wchar_t param_6,
          wchar_t param_7,basic_string_conflict *param_8,uint *param_9,uint **param_10,
          uint *param_11,wchar_t *param_12)

{
  uint uVar1;
  wchar_t *pwVar2;
  byte bVar3;
  byte bVar4;
  byte bVar5;
  wchar_t *pwVar6;
  uint uVar7;
  char *pcVar8;
  uint *puVar9;
  long lVar10;
  byte *pbVar11;
  ulong uVar12;
  
  if (param_1 == param_6) {
    if (*param_2 == true) {
      pcVar8 = *param_5;
      *param_2 = false;
      *param_5 = pcVar8 + 1;
      *pcVar8 = '.';
      uVar12 = (ulong)((byte)*param_8 >> 1);
      if (((byte)*param_8 & 1) != 0) {
        uVar12 = *(ulong *)(param_8 + 8);
      }
      if ((uVar12 == 0) || (puVar9 = *param_10, 0x9f < (long)puVar9 - (long)param_9)) {
        return 0;
      }
      *puVar9 = *param_11;
      *param_10 = puVar9 + 1;
      return 0;
    }
  }
  else {
    if (param_1 == param_7) {
      uVar12 = (ulong)((byte)*param_8 >> 1);
      if (((byte)*param_8 & 1) != 0) {
        uVar12 = *(ulong *)(param_8 + 8);
      }
      if (uVar12 != 0) {
        if (*param_2 != true) {
          return 0xffffffff;
        }
        puVar9 = *param_10;
        if ((long)puVar9 - (long)param_9 < 0xa0) {
          *puVar9 = *param_11;
          *param_10 = puVar9 + 1;
          *param_11 = 0;
          return 0;
        }
        return 0;
      }
    }
    pwVar6 = wmemchr(param_12,param_1,0x1c);
    pwVar2 = param_12 + 0x1c;
    if (pwVar6 != (wchar_t *)0x0) {
      pwVar2 = pwVar6;
    }
    lVar10 = (long)pwVar2 - (long)param_12 >> 2;
    if (lVar10 < 0x1c) {
      uVar12 = (long)pwVar2 - (long)param_12 & 0xfffffffffffffffb;
      bVar4 = "0123456789abcdefABCDEFxX+-pPiInN"[lVar10];
      uVar7 = (uint)bVar4;
      if (uVar12 == 0x58) {
        *param_3 = 'P';
      }
      else {
        if (uVar12 == 0x60) {
          pbVar11 = (byte *)*param_5;
          if (pbVar11 != (byte *)param_4) {
            bVar5 = pbVar11[-1];
            bVar3 = *param_3;
            uVar7 = (uint)bVar5;
            if (0xffffffe5 < bVar5 - 0x7b) {
              uVar7 = bVar5 ^ 0x20;
            }
            uVar1 = (uint)bVar3;
            if (0xffffffe5 < bVar3 - 0x7b) {
              uVar1 = bVar3 ^ 0x20;
            }
            if (uVar7 != uVar1) {
              return 0xffffffff;
            }
          }
          *param_5 = (char *)(pbVar11 + 1);
          *pbVar11 = bVar4;
          return 0;
        }
        bVar3 = *param_3;
        if (0xffffffe5 < uVar7 - 0x7b) {
          uVar7 = uVar7 ^ 0x20;
        }
        if (uVar7 == bVar3) {
          if (0xffffffe5 < uVar7 - 0x5b) {
            bVar3 = bVar3 | 0x20;
          }
          *param_3 = bVar3;
          if (*param_2 == true) {
            *param_2 = false;
            uVar12 = (ulong)((byte)*param_8 >> 1);
            if (((byte)*param_8 & 1) != 0) {
              uVar12 = *(ulong *)(param_8 + 8);
            }
            if ((uVar12 != 0) && (puVar9 = *param_10, (long)puVar9 - (long)param_9 < 0xa0)) {
              *puVar9 = *param_11;
              *param_10 = puVar9 + 1;
            }
          }
        }
      }
      pbVar11 = (byte *)*param_5;
      *param_5 = (char *)(pbVar11 + 1);
      *pbVar11 = bVar4;
      if (lVar10 < 0x16) {
        *param_11 = *param_11 + 1;
        return 0;
      }
      return 0;
    }
  }
  return 0xffffffff;
}

