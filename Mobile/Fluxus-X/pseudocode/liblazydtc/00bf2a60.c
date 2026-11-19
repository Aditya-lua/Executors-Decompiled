/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bf2a60
 */

/* WARNING: Type propagation algorithm not settling */
/* std::__ndk1::__money_put<wchar_t>::__format(wchar_t*, wchar_t*&, wchar_t*&, unsigned int, wchar_t
   const*, wchar_t const*, std::__ndk1::ctype<wchar_t> const&, bool,
   std::__ndk1::money_base::pattern const&, wchar_t, wchar_t, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&,
   std::__ndk1::basic_string<wchar_t, std::__ndk1::char_traits<wchar_t>,
   std::__ndk1::allocator<wchar_t> > const&, std::__ndk1::basic_string<wchar_t,
   std::__ndk1::char_traits<wchar_t>, std::__ndk1::allocator<wchar_t> > const&, int) */

void std::__ndk1::__money_put<wchar_t>::__format
               (wchar_t *param_1,wchar_t **param_2,wchar_t **param_3,uint param_4,wchar_t *param_5,
               wchar_t *param_6,ctype *param_7,bool param_8,pattern *param_9,wchar_t param_10,
               wchar_t param_11,basic_string_conflict *param_12,basic_string_conflict *param_13,
               basic_string_conflict *param_14,int param_15)

{
  long lVar1;
  basic_string_conflict *pbVar2;
  basic_string_conflict bVar3;
  pattern pVar4;
  bool bVar5;
  wchar_t wVar6;
  ulong uVar7;
  uint uVar8;
  long lVar9;
  wchar_t *pwVar10;
  wchar_t *pwVar11;
  wchar_t *pwVar12;
  ulong uVar13;
  wchar_t *pwVar14;
  uint uVar15;
  ulong uVar16;
  long lVar17;
  wchar_t *pwVar18;
  
  lVar1 = 4;
  if (!param_8) {
    lVar1 = 0;
  }
  lVar17 = 0;
  *param_3 = param_1;
  pwVar10 = param_1;
  pwVar18 = param_1;
  do {
    pVar4 = param_9[lVar17];
    if ((byte)pVar4 < 2) {
      if (pVar4 != (pattern)0x0) {
        if (pVar4 == (pattern)0x1) {
          lVar9 = *(long *)param_7;
          *param_2 = pwVar10;
          wVar6 = (**(code **)(lVar9 + 0x58))(param_7,0x20);
          pwVar10 = *param_3;
          *pwVar10 = wVar6;
LAB_00bf2c90:
          pwVar10 = pwVar10 + 1;
          *param_3 = pwVar10;
          pwVar18 = pwVar10;
        }
        goto LAB_00bf2b10;
      }
      *param_2 = pwVar10;
LAB_00bf2b0c:
      pwVar18 = pwVar10;
    }
    else if (pVar4 == (pattern)0x2) {
      bVar3 = *param_13;
      uVar7 = (ulong)((byte)bVar3 >> 1);
      if (((byte)bVar3 & 1) != 0) {
        uVar7 = *(ulong *)(param_13 + 8);
      }
      if (((param_4 >> 9 & 1) != 0) && (uVar7 != 0)) {
        pbVar2 = param_13 + 4;
        if (((byte)bVar3 & 1) != 0) {
          pbVar2 = *(basic_string_conflict **)(param_13 + 0x10);
        }
        memmove(pwVar10,pbVar2,uVar7 * 4);
        pwVar10 = pwVar10 + uVar7;
        *param_3 = pwVar10;
        goto LAB_00bf2b0c;
      }
    }
    else if (pVar4 == (pattern)0x3) {
      bVar5 = ((byte)*param_14 & 1) != 0;
      uVar7 = (ulong)((byte)*param_14 >> 1);
      if (bVar5) {
        uVar7 = *(ulong *)(param_14 + 8);
      }
      if (uVar7 != 0) {
        pbVar2 = param_14 + 4;
        if (bVar5) {
          pbVar2 = *(basic_string_conflict **)(param_14 + 0x10);
        }
        *pwVar10 = *(wchar_t *)pbVar2;
        goto LAB_00bf2c90;
      }
    }
    else if (pVar4 == (pattern)0x4) {
      param_5 = (wchar_t *)((long)param_5 + lVar1);
      pwVar11 = param_5;
      if (param_5 < param_6) {
        do {
          uVar7 = (**(code **)(*(long *)param_7 + 0x18))(param_7,0x40,*pwVar11);
          if ((uVar7 & 1) == 0) break;
          pwVar11 = pwVar11 + 1;
        } while (pwVar11 < param_6);
      }
      if (0 < param_15) {
        if (param_5 < pwVar11) {
          pwVar10 = *param_3;
          uVar8 = param_15;
          do {
            uVar15 = uVar8;
            pwVar11 = pwVar11 + -1;
            pwVar14 = pwVar10 + 1;
            *pwVar10 = *pwVar11;
            if (pwVar11 <= param_5) break;
            pwVar10 = pwVar14;
            uVar8 = uVar15 - 1;
          } while (uVar15 != 1);
          *param_3 = pwVar14;
          uVar8 = uVar15 - 1;
          if (uVar15 != 1) goto LAB_00bf2ca0;
        }
        else {
          uVar8 = param_15;
LAB_00bf2ca0:
          wVar6 = (**(code **)(*(long *)param_7 + 0x58))(param_7,0x30);
          pwVar10 = *param_3;
          pwVar14 = pwVar10;
          if (0 < (int)uVar8) {
            if (7 < uVar8) {
              uVar13 = (ulong)uVar8;
              uVar16 = uVar13 & 0x7ffffff8;
              pwVar14 = pwVar10 + uVar16;
              uVar8 = uVar8 - (int)uVar16;
              pwVar10 = pwVar10 + 4;
              uVar7 = uVar16;
              do {
                uVar7 = uVar7 - 8;
                *(ulong *)(pwVar10 + -2) = CONCAT44(wVar6,wVar6);
                *(ulong *)(pwVar10 + -4) = CONCAT44(wVar6,wVar6);
                *(ulong *)(pwVar10 + 2) = CONCAT44(wVar6,wVar6);
                *(ulong *)pwVar10 = CONCAT44(wVar6,wVar6);
                pwVar10 = pwVar10 + 8;
              } while (uVar7 != 0);
              if (uVar16 == uVar13) goto LAB_00bf2d24;
            }
            uVar8 = uVar8 + 1;
            pwVar10 = pwVar14;
            do {
              uVar8 = uVar8 - 1;
              pwVar14 = pwVar10 + 1;
              *pwVar10 = wVar6;
              pwVar10 = pwVar14;
            } while (1 < uVar8);
          }
        }
LAB_00bf2d24:
        *pwVar14 = param_10;
        *param_3 = pwVar14 + 1;
      }
      if (pwVar11 == param_5) {
        wVar6 = (**(code **)(*(long *)param_7 + 0x58))(param_7,0x30);
        pwVar10 = *param_3 + 1;
        **param_3 = wVar6;
        *param_3 = pwVar10;
      }
      else {
        bVar3 = *param_12;
        uVar7 = (ulong)((byte)bVar3 >> 1);
        if (((byte)bVar3 & 1) != 0) {
          uVar7 = *(ulong *)(param_12 + 8);
        }
        if (uVar7 == 0) {
          uVar8 = 0xffffffff;
        }
        else {
          pbVar2 = param_12 + 1;
          if (((byte)bVar3 & 1) != 0) {
            pbVar2 = *(basic_string_conflict **)(param_12 + 0x10);
          }
          uVar8 = (uint)(byte)*pbVar2;
        }
        uVar7 = 0;
        uVar15 = 0;
        do {
          pwVar14 = *param_3;
          pwVar10 = pwVar14;
          if (uVar15 == uVar8) {
            pwVar10 = pwVar14 + 1;
            *pwVar14 = param_11;
            uVar7 = (ulong)((int)uVar7 + 1);
            *param_3 = pwVar10;
            bVar3 = *param_12;
            uVar13 = (ulong)((byte)bVar3 >> 1);
            if (((byte)bVar3 & 1) != 0) {
              uVar13 = *(ulong *)(param_12 + 8);
            }
            if (uVar7 < uVar13) {
              pbVar2 = param_12 + 1;
              if (((byte)bVar3 & 1) != 0) {
                pbVar2 = *(basic_string_conflict **)(param_12 + 0x10);
              }
              if (pbVar2[uVar7] == (basic_string_conflict)0xff) {
                uVar15 = 0;
                uVar8 = 0xffffffff;
                goto LAB_00bf2da8;
              }
              uVar8 = (uint)(byte)pbVar2[uVar7];
            }
            uVar15 = 0;
          }
LAB_00bf2da8:
          pwVar11 = pwVar11 + -1;
          uVar15 = uVar15 + 1;
          *pwVar10 = *pwVar11;
          *param_3 = pwVar10 + 1;
        } while (pwVar11 != param_5);
        pwVar10 = pwVar10 + 1;
      }
      if ((pwVar18 != pwVar10) && (pwVar11 = pwVar10 + 0xffffffffffffffff, pwVar18 < pwVar11)) {
        do {
          pwVar12 = pwVar18 + 1;
          wVar6 = *pwVar18;
          *pwVar18 = *pwVar11;
          pwVar14 = pwVar11 + 0xffffffffffffffff;
          *pwVar11 = wVar6;
          pwVar11 = pwVar14;
          pwVar18 = pwVar12;
        } while (pwVar12 < pwVar14);
      }
      goto LAB_00bf2b0c;
    }
LAB_00bf2b10:
    lVar17 = lVar17 + 1;
    if (lVar17 == 4) {
      bVar3 = *param_14;
      uVar7 = (ulong)((byte)bVar3 >> 1);
      if (((byte)bVar3 & 1) != 0) {
        uVar7 = *(ulong *)(param_14 + 8);
      }
      if (1 < uVar7) {
        pbVar2 = param_14 + 4;
        if (((byte)bVar3 & 1) != 0) {
          pbVar2 = *(basic_string_conflict **)(param_14 + 0x10);
        }
        if (uVar7 * 4 != 4) {
          memmove(pwVar10,pbVar2 + 4,(size_t)(pbVar2 + (uVar7 * 4 - (long)(pbVar2 + 4))));
        }
        pwVar10 = (wchar_t *)((long)pwVar10 + (long)(pbVar2 + (uVar7 * 4 - (long)(pbVar2 + 4))));
        *param_3 = pwVar10;
      }
      if ((param_4 & 0xb0) != 0x10) {
        if ((param_4 & 0xb0) != 0x20) {
          pwVar10 = param_1;
        }
        *param_2 = pwVar10;
      }
      return;
    }
  } while( true );
}

