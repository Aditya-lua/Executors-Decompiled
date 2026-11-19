/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bf19c4
 */

/* std::__ndk1::__money_put<char>::__format(char*, char*&, char*&, unsigned int, char const*, char
   const*, std::__ndk1::ctype<char> const&, bool, std::__ndk1::money_base::pattern const&, char,
   char, std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&,
   std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >
   const&, int) */

void std::__ndk1::__money_put<char>::__format
               (char *param_1,char **param_2,char **param_3,uint param_4,char *param_5,char *param_6
               ,ctype *param_7,bool param_8,pattern *param_9,char param_10,char param_11,
               basic_string_conflict *param_12,basic_string_conflict *param_13,
               basic_string_conflict *param_14,int param_15)

{
  size_t __n;
  basic_string_conflict *pbVar1;
  char *pcVar2;
  basic_string_conflict bVar3;
  pattern pVar4;
  bool bVar5;
  char cVar6;
  uint uVar7;
  char *pcVar8;
  basic_string_conflict *pbVar9;
  ulong uVar10;
  char *pcVar11;
  uint uVar12;
  char *pcVar13;
  ulong uVar14;
  long lVar15;
  char *pcVar16;
  ulong uVar17;
  undefined1 (*pauVar18) [16];
  undefined1 (*pauVar19) [16];
  long lVar20;
  int iVar21;
  int iVar22;
  char *pcVar23;
  undefined8 uVar24;
  undefined1 auVar25 [16];
  undefined8 uVar26;
  undefined1 auVar27 [16];
  undefined1 auVar28 [16];
  undefined1 auVar29 [16];
  
  lVar20 = 0;
  *param_3 = param_1;
  do {
    pVar4 = param_9[lVar20];
    if ((byte)pVar4 < 2) {
      if (pVar4 == (pattern)0x0) {
        *param_2 = *param_3;
      }
      else if (pVar4 == (pattern)0x1) {
        lVar15 = *(long *)param_7;
        *param_2 = *param_3;
        cVar6 = (**(code **)(lVar15 + 0x38))(param_7,0x20);
        pcVar8 = *param_3;
        *param_3 = pcVar8 + 1;
        *pcVar8 = cVar6;
      }
    }
    else if (pVar4 == (pattern)0x2) {
      bVar3 = *param_13;
      __n = (ulong)((byte)bVar3 >> 1);
      if (((byte)bVar3 & 1) != 0) {
        __n = *(size_t *)(param_13 + 8);
      }
      if (((param_4 >> 9 & 1) != 0) && (__n != 0)) {
        pcVar8 = *param_3;
        pbVar1 = param_13 + 1;
        if (((byte)bVar3 & 1) != 0) {
          pbVar1 = *(basic_string_conflict **)(param_13 + 0x10);
        }
        memmove(pcVar8,pbVar1,__n);
        *param_3 = pcVar8 + __n;
      }
    }
    else if (pVar4 == (pattern)0x3) {
      bVar5 = ((byte)*param_14 & 1) != 0;
      uVar10 = (ulong)((byte)*param_14 >> 1);
      if (bVar5) {
        uVar10 = *(ulong *)(param_14 + 8);
      }
      if (uVar10 != 0) {
        pbVar9 = (basic_string_conflict *)*param_3;
        pbVar1 = param_14 + 1;
        if (bVar5) {
          pbVar1 = *(basic_string_conflict **)(param_14 + 0x10);
        }
        bVar3 = *pbVar1;
        *param_3 = (char *)(pbVar9 + 1);
        *pbVar9 = bVar3;
      }
    }
    else if (pVar4 == (pattern)0x4) {
      param_5 = param_5 + param_8;
      pcVar8 = param_5;
      if (param_5 < param_6) {
        do {
          if (((long)*pcVar8 < 0) ||
             (((uint)*(undefined8 *)(*(long *)(param_7 + 0x10) + (long)*pcVar8 * 8) >> 6 & 1) == 0))
          goto LAB_00bf1ad0;
          pcVar8 = pcVar8 + 1;
        } while (pcVar8 < param_6);
        pcVar8 = param_6;
      }
LAB_00bf1ad0:
      pcVar23 = *param_3;
      if (0 < param_15) {
        if (param_5 < pcVar8) {
          iVar22 = param_15;
          do {
            iVar21 = iVar22;
            pcVar8 = pcVar8 + -1;
            pcVar13 = *param_3;
            cVar6 = *pcVar8;
            *param_3 = pcVar13 + 1;
            *pcVar13 = cVar6;
            if (pcVar8 <= param_5) break;
            iVar22 = iVar21 + -1;
          } while (iVar21 != 1);
          iVar22 = iVar21 + -1;
          if (iVar21 != 1) goto LAB_00bf1c18;
        }
        else {
          iVar22 = param_15;
LAB_00bf1c18:
          cVar6 = (**(code **)(*(long *)param_7 + 0x38))(param_7,0x30);
          if (0 < iVar22) {
            uVar7 = iVar22 + 1;
            do {
              pcVar13 = *param_3;
              uVar7 = uVar7 - 1;
              *param_3 = pcVar13 + 1;
              *pcVar13 = cVar6;
            } while (1 < uVar7);
          }
        }
        pcVar13 = *param_3;
        *param_3 = pcVar13 + 1;
        *pcVar13 = param_10;
      }
      if (pcVar8 == param_5) {
        cVar6 = (**(code **)(*(long *)param_7 + 0x38))(param_7,0x30);
        pcVar8 = *param_3;
        *param_3 = pcVar8 + 1;
        *pcVar8 = cVar6;
      }
      else {
        bVar3 = *param_12;
        uVar10 = (ulong)((byte)bVar3 >> 1);
        if (((byte)bVar3 & 1) != 0) {
          uVar10 = *(ulong *)(param_12 + 8);
        }
        if (uVar10 == 0) {
          uVar7 = 0xffffffff;
        }
        else {
          pbVar1 = param_12 + 1;
          if (((byte)bVar3 & 1) != 0) {
            pbVar1 = *(basic_string_conflict **)(param_12 + 0x10);
          }
          uVar7 = (uint)(byte)*pbVar1;
        }
        uVar10 = 0;
        uVar12 = 0;
        do {
          if (uVar12 == uVar7) {
            pcVar13 = *param_3;
            uVar10 = (ulong)((int)uVar10 + 1);
            *param_3 = pcVar13 + 1;
            *pcVar13 = param_11;
            bVar3 = *param_12;
            uVar17 = (ulong)((byte)bVar3 >> 1);
            if (((byte)bVar3 & 1) != 0) {
              uVar17 = *(ulong *)(param_12 + 8);
            }
            if (uVar10 < uVar17) {
              pbVar1 = param_12 + 1;
              if (((byte)bVar3 & 1) != 0) {
                pbVar1 = *(basic_string_conflict **)(param_12 + 0x10);
              }
              if (pbVar1[uVar10] == (basic_string_conflict)0xff) {
                uVar12 = 0;
                uVar7 = 0xffffffff;
                goto LAB_00bf1d84;
              }
              uVar7 = (uint)(byte)pbVar1[uVar10];
            }
            uVar12 = 0;
          }
LAB_00bf1d84:
          pcVar13 = *param_3;
          pcVar8 = pcVar8 + -1;
          cVar6 = *pcVar8;
          uVar12 = uVar12 + 1;
          *param_3 = pcVar13 + 1;
          *pcVar13 = cVar6;
        } while (pcVar8 != param_5);
      }
      pcVar8 = *param_3;
      if ((pcVar23 != pcVar8) && (pcVar13 = pcVar8 + -1, pcVar23 < pcVar13)) {
        pcVar16 = pcVar8 + -2;
        pcVar11 = pcVar23 + 1;
        pcVar2 = pcVar16;
        if (pcVar16 <= pcVar11) {
          pcVar2 = pcVar23 + 1;
        }
        pcVar2 = pcVar2 + ~(ulong)pcVar23;
        lVar15 = 1;
        if (pcVar2 != (char *)0x0) {
          lVar15 = 2;
        }
        uVar10 = lVar15 + ((long)pcVar2 - (ulong)(pcVar2 != (char *)0x0) >> 1);
        if (7 < uVar10) {
          if (pcVar16 <= pcVar11) {
            pcVar16 = pcVar23 + 1;
          }
          pcVar16 = pcVar16 + ~(ulong)pcVar23;
          uVar17 = (long)pcVar16 - (ulong)(pcVar16 != (char *)0x0) >> 1;
          if (pcVar16 != (char *)0x0) {
            uVar17 = uVar17 + 1;
          }
          if ((pcVar8 <= pcVar23) || (pcVar11 + uVar17 <= pcVar8 + ~uVar17)) {
            if (uVar10 < 0x20) {
              uVar14 = 0;
            }
            else {
              uVar14 = uVar10 & 0xffffffffffffffe0;
              pauVar18 = (undefined1 (*) [16])(pcVar23 + 0x10);
              pauVar19 = (undefined1 (*) [16])(pcVar8 + -0x10);
              uVar17 = uVar14;
              do {
                uVar17 = uVar17 - 0x20;
                auVar25 = NEON_rev64(*pauVar19,1);
                auVar27 = NEON_rev64(pauVar19[-1],1);
                auVar28 = NEON_rev64(pauVar18[-1],1);
                auVar29 = NEON_rev64(*pauVar18,1);
                auVar25 = NEON_ext(auVar25,auVar25,8,1);
                auVar27 = NEON_ext(auVar27,auVar27,8,1);
                auVar28 = NEON_ext(auVar28,auVar28,8,1);
                auVar29 = NEON_ext(auVar29,auVar29,8,1);
                *(long *)(pauVar18[-1] + 8) = auVar25._8_8_;
                *(long *)pauVar18[-1] = auVar25._0_8_;
                *(long *)(*pauVar18 + 8) = auVar27._8_8_;
                *(long *)*pauVar18 = auVar27._0_8_;
                pauVar18 = pauVar18 + 2;
                *(long *)(pauVar19[-1] + 8) = auVar29._8_8_;
                *(long *)pauVar19[-1] = auVar29._0_8_;
                *(long *)(*pauVar19 + 8) = auVar28._8_8_;
                *(long *)*pauVar19 = auVar28._0_8_;
                pauVar19 = pauVar19 + -2;
              } while (uVar17 != 0);
              if (uVar10 == uVar14) goto LAB_00bf1a60;
              if ((uVar10 & 0x18) == 0) {
                pcVar13 = pcVar13 + -uVar14;
                pcVar23 = pcVar23 + uVar14;
                goto LAB_00bf1eb8;
              }
            }
            uVar17 = uVar10 & 0xfffffffffffffff8;
            pcVar8 = pcVar8 + -uVar14;
            pcVar11 = pcVar23 + uVar14;
            pcVar13 = pcVar13 + -uVar17;
            pcVar23 = pcVar23 + uVar17;
            lVar15 = uVar14 - uVar17;
            do {
              pcVar8 = pcVar8 + -8;
              lVar15 = lVar15 + 8;
              uVar24 = NEON_rev64(*(undefined8 *)pcVar8,1);
              uVar26 = NEON_rev64(*(undefined8 *)pcVar11,1);
              *(undefined8 *)pcVar11 = uVar24;
              *(undefined8 *)pcVar8 = uVar26;
              pcVar11 = pcVar11 + 8;
            } while (lVar15 != 0);
            if (uVar10 == uVar17) goto LAB_00bf1a60;
          }
        }
LAB_00bf1eb8:
        do {
          pcVar11 = pcVar23 + 1;
          cVar6 = *pcVar23;
          *pcVar23 = *pcVar13;
          pcVar8 = pcVar13 + -1;
          *pcVar13 = cVar6;
          pcVar13 = pcVar8;
          pcVar23 = pcVar11;
        } while (pcVar11 < pcVar8);
      }
    }
LAB_00bf1a60:
    lVar20 = lVar20 + 1;
    if (lVar20 == 4) {
      bVar3 = *param_14;
      uVar10 = (ulong)((byte)bVar3 >> 1);
      if (((byte)bVar3 & 1) != 0) {
        uVar10 = *(ulong *)(param_14 + 8);
      }
      if (1 < uVar10) {
        pcVar8 = *param_3;
        pbVar1 = param_14 + 1;
        if (((byte)bVar3 & 1) != 0) {
          pbVar1 = *(basic_string_conflict **)(param_14 + 0x10);
        }
        if (uVar10 != 1) {
          memmove(pcVar8,pbVar1 + 1,(size_t)(pbVar1 + (uVar10 - (long)(pbVar1 + 1))));
        }
        *param_3 = pcVar8 + (long)(pbVar1 + (uVar10 - (long)(pbVar1 + 1)));
      }
      if ((param_4 & 0xb0) != 0x10) {
        if ((param_4 & 0xb0) == 0x20) {
          param_1 = *param_3;
        }
        *param_2 = param_1;
      }
      return;
    }
  } while( true );
}

