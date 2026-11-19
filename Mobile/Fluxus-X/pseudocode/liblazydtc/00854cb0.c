/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00854cb0
 */

undefined8
FUN_00854cb0(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *param_1
            )

{
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar1;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar2;
  ulong uVar3;
  uint uVar4;
  void *pvVar5;
  long lVar6;
  int iVar7;
  ulong uVar8;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar9;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar10;
  int iVar11;
  ulong uVar12;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> bVar13;
  uint uVar14;
  uint uVar15;
  ulong uVar16;
  char cVar17;
  
  bVar13 = *param_1;
  uVar3 = (ulong)((byte)bVar13 >> 1);
  if (((byte)bVar13 & 1) != 0) {
    uVar3 = *(ulong *)(param_1 + 8);
  }
  if (uVar3 != 0) {
    pbVar9 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
              (param_1 + 0x10);
    if (((byte)bVar13 & 1) == 0) {
      pbVar9 = param_1 + 1;
    }
    pvVar5 = memchr(pbVar9,0x5c,uVar3);
    if (pvVar5 == (void *)0x0) {
      return 1;
    }
    if ((long)pvVar5 - (long)pbVar9 == -1) {
      return 1;
    }
    uVar16 = 0;
    pbVar9 = param_1 + 1;
    uVar12 = 0;
    do {
      pbVar10 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
                 (param_1 + 0x10);
      pbVar2 = pbVar9;
      if (((byte)*param_1 & 1) != 0) {
        pbVar2 = pbVar10;
      }
      if (pbVar2[uVar12] ==
          (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x5c) {
        if (uVar12 + 1 == uVar3) {
          return 0;
        }
        pbVar2 = pbVar9;
        if (((byte)*param_1 & 1) != 0) {
          pbVar2 = pbVar10;
        }
        bVar13 = pbVar2[uVar12 + 1];
        uVar8 = uVar12 + 2;
        uVar14 = (uint)(byte)bVar13;
        if ((byte)bVar13 < 0x75) {
          if (uVar14 == 10) {
            pbVar2 = pbVar9;
            if (((byte)*param_1 & 1) != 0) {
              pbVar2 = pbVar10;
            }
            pbVar2[uVar16] =
                 (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0xa
            ;
            uVar16 = uVar16 + 1;
          }
          else if (uVar14 == 0xd) {
            pbVar2 = pbVar9;
            if (((byte)*param_1 & 1) != 0) {
              pbVar2 = pbVar10;
            }
            pbVar2[uVar16] =
                 (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0xa
            ;
            if (uVar8 < uVar3) {
              pbVar2 = pbVar9;
              if (((byte)*param_1 & 1) != 0) {
                pbVar2 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                           **)(param_1 + 0x10);
              }
              uVar12 = uVar12 + 3;
              if (pbVar2[uVar8] !=
                  (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)
                  0xa) {
                uVar12 = uVar8;
              }
              uVar8 = uVar12;
              uVar16 = uVar16 + 1;
            }
            else {
              uVar16 = uVar16 + 1;
            }
          }
          else {
            if (bVar13 == (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                           )0x0) {
              return 0;
            }
LAB_00854fb4:
            uVar15 = uVar14 - 0x30;
            if (uVar15 < 10) {
              if (uVar8 == uVar3) {
                uVar8 = uVar3;
              }
              else {
                pbVar2 = pbVar9;
                if (((byte)*param_1 & 1) != 0) {
                  pbVar2 = pbVar10;
                }
                if ((byte)pbVar2[uVar8] - 0x30 < 10) {
                  pbVar1 = pbVar2 + uVar8;
                  uVar8 = uVar12 + 3;
                  uVar15 = ((uint)(byte)*pbVar1 + uVar15 * 10) - 0x30;
                  if ((uVar8 != uVar3) && ((byte)pbVar2[uVar8] - 0x30 < 10)) {
                    uVar15 = ((uint)(byte)pbVar2[uVar8] + uVar15 * 10) - 0x30;
                    uVar8 = uVar12 + 4;
                  }
                }
              }
              if (0xff < uVar15) {
                return 0;
              }
              pbVar2 = pbVar9;
              if (((byte)*param_1 & 1) != 0) {
                pbVar2 = pbVar10;
              }
              pbVar2[uVar16] = SUB41(uVar15,0);
              uVar16 = uVar16 + 1;
            }
            else {
              if ((byte)bVar13 < 0x6e) {
                if (uVar14 == 0x61) {
                  bVar13 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                            )0x7;
                }
                else if (uVar14 == 0x62) {
                  bVar13 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                            )0x8;
                }
                else if (uVar14 == 0x66) {
                  bVar13 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                            )0xc;
                }
              }
              else if (uVar14 == 0x73 || (byte)bVar13 < 0x73) {
                if (bVar13 == (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                               )0x6e) {
                  bVar13 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                            )0xa;
                }
                else if (bVar13 == (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                                    )0x72) {
                  bVar13 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                            )0xd;
                }
              }
              else if (bVar13 == (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                                  )0x74) {
                bVar13 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                          )0x9;
              }
              else if (bVar13 == (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                                  )0x76) {
                bVar13 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                          )0xb;
              }
              pbVar2 = pbVar9;
              if (((byte)*param_1 & 1) != 0) {
                pbVar2 = pbVar10;
              }
              pbVar2[uVar16] = bVar13;
              uVar16 = uVar16 + 1;
            }
          }
        }
        else if (bVar13 == (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                            )0x75) {
          if (uVar3 < uVar12 + 5) {
            return 0;
          }
          pbVar2 = pbVar9;
          if (((byte)*param_1 & 1) != 0) {
            pbVar2 = pbVar10;
          }
          if (pbVar2[uVar8] !=
              (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x7b)
          {
            return 0;
          }
          uVar8 = uVar12 + 3;
          pbVar2 = pbVar9;
          if (((byte)*param_1 & 1) != 0) {
            pbVar2 = pbVar10;
          }
          if (pbVar2[uVar8] ==
              (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x7d)
          {
            return 0;
          }
          iVar7 = 0;
          pbVar2 = pbVar9;
          if (((byte)*param_1 & 1) != 0) {
            pbVar2 = pbVar10;
          }
          iVar11 = 0x10;
          do {
            if (uVar3 == uVar8) {
              return 0;
            }
            bVar13 = pbVar2[uVar8];
            if ((byte)bVar13 == 0x7d) goto LAB_0085509c;
            uVar14 = (byte)bVar13 - 0x30;
            if ((9 < uVar14) && (5 < ((byte)bVar13 | 0x20) - 0x61)) {
              return 0;
            }
            uVar8 = uVar8 + 1;
            if (9 < uVar14) {
              uVar14 = ((byte)bVar13 | 0x20) - 0x57;
            }
            iVar11 = iVar11 + -1;
            iVar7 = uVar14 + iVar7 * 0x10;
          } while (iVar11 != 0);
          uVar8 = uVar12 + 0x13;
LAB_0085509c:
          if (uVar8 == uVar3) {
            return 0;
          }
          if (pbVar2[uVar8] !=
              (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x7d)
          {
            return 0;
          }
          lVar6 = FUN_00855184(pbVar2 + uVar16,iVar7);
          if (lVar6 == 0) {
            return 0;
          }
          uVar8 = uVar8 + 1;
          uVar16 = lVar6 + uVar16;
        }
        else if (uVar14 == 0x78) {
          if (uVar3 < uVar12 + 4) {
            return 0;
          }
          pbVar2 = pbVar9;
          if (((byte)*param_1 & 1) != 0) {
            pbVar2 = pbVar10;
          }
          bVar13 = pbVar2[uVar8];
          uVar14 = (byte)bVar13 - 0x30;
          if ((9 < uVar14) && (5 < (((byte)bVar13 | 0x20) - 0x61 & 0xff))) {
            return 0;
          }
          uVar15 = (byte)pbVar2[uVar12 + 3] - 0x30;
          uVar4 = (byte)pbVar2[uVar12 + 3] | 0x20;
          if ((9 < uVar15) && (5 < (uVar4 - 0x61 & 0xff))) {
            return 0;
          }
          cVar17 = '\0';
          if (9 < (uVar14 & 0xff)) {
            cVar17 = '\t';
          }
          if (9 < (uVar15 & 0xff)) {
            uVar15 = uVar4 - 0x57;
          }
          pbVar2[uVar16] =
               (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)
               ((char)uVar15 + ((char)bVar13 + cVar17) * '\x10');
          uVar8 = uVar12 + 4;
          uVar16 = uVar16 + 1;
        }
        else {
          if (uVar14 != 0x7a) goto LAB_00854fb4;
          if (uVar8 < uVar3) {
            pbVar2 = pbVar9;
            if (((byte)*param_1 & 1) != 0) {
              pbVar2 = pbVar10;
            }
            while (((byte)pbVar2[uVar8] - 9 < 5 || ((byte)pbVar2[uVar8] == 0x20))) {
              uVar8 = uVar8 + 1;
              if (uVar3 == uVar8) goto LAB_00855120;
            }
          }
        }
      }
      else {
        pbVar2 = pbVar9;
        if (((byte)*param_1 & 1) != 0) {
          pbVar2 = pbVar10;
        }
        pbVar2[uVar16] = pbVar2[uVar12];
        uVar8 = uVar12 + 1;
        uVar16 = uVar16 + 1;
      }
      uVar12 = uVar8;
    } while (uVar8 < uVar3);
LAB_00855120:
    bVar13 = *param_1;
    uVar3 = (ulong)((byte)bVar13 >> 1);
    if (((byte)bVar13 & 1) != 0) {
      uVar3 = *(ulong *)(param_1 + 8);
    }
    if (uVar16 < uVar3 || uVar16 - uVar3 == 0) {
      if (((byte)bVar13 & 1) == 0) {
        *param_1 = SUB41((int)uVar16 << 1,0);
      }
      else {
        pbVar9 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **
                  )(param_1 + 0x10);
        *(ulong *)(param_1 + 8) = uVar16;
      }
      pbVar9[uVar16] =
           (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x0;
    }
    else {
      std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
      append(param_1,uVar16 - uVar3,'\0');
    }
  }
  return 1;
}

