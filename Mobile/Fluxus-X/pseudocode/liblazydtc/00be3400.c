/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00be3400
 */

/* std::__ndk1::__num_get<char>::__stage2_float_loop(char, bool&, char&, char*, char*&, char, char,
   std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >
   const&, unsigned int*, unsigned int*&, unsigned int&, char*) */

undefined8
std::__ndk1::__num_get<char>::__stage2_float_loop
          (char param_1,bool *param_2,char *param_3,char *param_4,char **param_5,char param_6,
          char param_7,basic_string_conflict *param_8,uint *param_9,uint **param_10,uint *param_11,
          char *param_12)

{
  uint uVar1;
  ulong uVar2;
  byte bVar3;
  byte bVar4;
  byte bVar5;
  char *pcVar6;
  uint uVar7;
  char *pcVar8;
  uint *puVar9;
  ulong uVar10;
  byte *pbVar11;
  
  if (param_1 == param_6) {
    if (*param_2 == true) {
      pcVar8 = *param_5;
      *param_2 = false;
      *param_5 = pcVar8 + 1;
      *pcVar8 = '.';
      uVar10 = (ulong)((byte)*param_8 >> 1);
      if (((byte)*param_8 & 1) != 0) {
        uVar10 = *(ulong *)(param_8 + 8);
      }
      if ((uVar10 == 0) || (puVar9 = *param_10, 0x9f < (long)puVar9 - (long)param_9)) {
        return 0;
      }
      *puVar9 = *param_11;
      *param_10 = puVar9 + 1;
      return 0;
    }
  }
  else {
    if (param_1 == param_7) {
      uVar10 = (ulong)((byte)*param_8 >> 1);
      if (((byte)*param_8 & 1) != 0) {
        uVar10 = *(ulong *)(param_8 + 8);
      }
      if (uVar10 != 0) {
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
    pcVar6 = memchr(param_12,(uint)(byte)param_1,0x1c);
    pcVar8 = param_12 + 0x1c;
    if (pcVar6 != (char *)0x0) {
      pcVar8 = pcVar6;
    }
    uVar10 = (long)pcVar8 - (long)param_12;
    if ((long)uVar10 < 0x1c) {
      bVar4 = "0123456789abcdefABCDEFxX+-pPiInN"[uVar10];
      uVar7 = (uint)bVar4;
      if ((uVar10 & 0xfffffffffffffffe) == 0x16) {
        *param_3 = 'P';
        pbVar11 = (byte *)*param_5;
        *param_5 = (char *)(pbVar11 + 1);
        *pbVar11 = bVar4;
        return 0;
      }
      if ((uVar10 & 0xfffffffffffffffe) == 0x18) {
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
          uVar2 = (ulong)((byte)*param_8 >> 1);
          if (((byte)*param_8 & 1) != 0) {
            uVar2 = *(ulong *)(param_8 + 8);
          }
          if ((uVar2 != 0) && (puVar9 = *param_10, (long)puVar9 - (long)param_9 < 0xa0)) {
            *puVar9 = *param_11;
            *param_10 = puVar9 + 1;
          }
        }
      }
      pbVar11 = (byte *)*param_5;
      *param_5 = (char *)(pbVar11 + 1);
      *pbVar11 = bVar4;
      if ((long)uVar10 < 0x16) {
        *param_11 = *param_11 + 1;
        return 0;
      }
      return 0;
    }
  }
  return 0xffffffff;
}

