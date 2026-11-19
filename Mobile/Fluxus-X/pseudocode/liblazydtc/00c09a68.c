/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c09a68
 */

/* WARNING: Type propagation algorithm not settling */

void FUN_00c09a68(undefined4 *param_1,
                 basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                 *param_2,ulong param_3,char param_4,char param_5,byte param_6)

{
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar1;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar2;
  ulong uVar3;
  undefined4 uVar4;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> bVar5;
  size_t __n;
  bool bVar6;
  bool bVar7;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar8;
  undefined2 uVar9;
  long lVar10;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar12;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar11;
  long lVar13;
  long lVar14;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar15;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar16;
  
  if ((param_3 & 1) == 0) {
    bVar6 = false;
  }
  else {
    uVar3 = (ulong)((byte)*param_2 >> 1);
    if (((byte)*param_2 & 1) != 0) {
      uVar3 = *(ulong *)(param_2 + 8);
    }
    bVar6 = uVar3 == 4;
  }
  if (param_4 == '\x01') {
    if (param_6 < 2) {
      if (param_6 == 0) {
        *param_1 = 0x4000203;
joined_r0x00c09c48:
        if (param_5 == '\0') {
          return;
        }
        if (param_5 == '\x02') {
          return;
        }
        if (param_5 != '\x01') goto LAB_00c09e34;
        goto joined_r0x00c09e2c;
      }
      if (param_6 != 1) goto LAB_00c09e34;
      *(undefined1 *)param_1 = 3;
      *(undefined1 *)((long)param_1 + 3) = 4;
    }
    else {
      if (param_6 == 2) {
        *(undefined1 *)param_1 = 2;
        *(undefined1 *)((long)param_1 + 3) = 3;
        if (param_5 == '\x02') {
          uVar9 = 0x104;
          goto LAB_00c09eac;
        }
        if (param_5 != '\x01') {
          if (param_5 == '\0') {
            *(undefined2 *)((long)param_1 + 1) = 0x400;
            return;
          }
          goto LAB_00c09e34;
        }
        uVar9 = 0x400;
        goto LAB_00c09f2c;
      }
      if (param_6 != 3) {
        if (param_6 == 4) {
          *(undefined1 *)param_1 = 2;
          *(undefined1 *)((long)param_1 + 3) = 4;
          if (param_5 == '\x02') {
            uVar9 = 0x300;
            goto LAB_00c09f2c;
          }
          if (param_5 == '\x01') {
            uVar9 = 0x103;
            goto LAB_00c09eac;
          }
          if (param_5 == '\0') {
            *(undefined2 *)((long)param_1 + 1) = 3;
            return;
          }
        }
        goto LAB_00c09e34;
      }
      *(undefined1 *)param_1 = 3;
      *(undefined1 *)((long)param_1 + 3) = 4;
    }
    if (param_5 == '\x02') {
      uVar9 = 0x201;
LAB_00c09eac:
      *(undefined2 *)((long)param_1 + 1) = uVar9;
      if (bVar6) {
        bVar5 = *param_2;
        uVar3 = (ulong)((byte)bVar5 >> 1);
        if (((byte)bVar5 & 1) != 0) {
          uVar3 = *(ulong *)(param_2 + 8);
        }
        lVar10 = uVar3 - 1;
        if (((byte)bVar5 & 1) == 0) {
          pbVar8 = param_2 + 4;
          *param_2 = SUB41((int)lVar10 << 1,0);
        }
        else {
          pbVar8 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                     **)(param_2 + 0x10);
          *(long *)(param_2 + 8) = lVar10;
        }
        *(undefined4 *)(pbVar8 + lVar10 * 4) = 0;
        return;
      }
      return;
    }
    if (param_5 == '\x01') {
      uVar9 = 2;
LAB_00c09f2c:
      *(undefined2 *)((long)param_1 + 1) = uVar9;
      if (bVar6) {
        return;
      }
      std::__ndk1::
      basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::
      push_back(param_2,L' ');
      return;
    }
    if (param_5 == '\0') {
      *(undefined2 *)((long)param_1 + 1) = 2;
      return;
    }
LAB_00c09e34:
    *param_1 = 0x4000302;
    return;
  }
  if (param_4 != '\0') goto LAB_00c09e34;
  if (bVar6) {
    bVar7 = ((byte)*param_2 & 1) != 0;
    uVar3 = (ulong)((byte)*param_2 >> 1);
    if (bVar7) {
      uVar3 = *(ulong *)(param_2 + 8);
    }
    pbVar8 = param_2 + 4;
    if (bVar7) {
      pbVar8 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                 **)(param_2 + 0x10);
    }
    if (uVar3 * 4 != 0xc) {
      pbVar2 = pbVar8 + uVar3 * 4;
      if (pbVar8 + 0x10 == pbVar2) {
        uVar4 = *(undefined4 *)(pbVar2 + -4);
        __n = (long)(pbVar2 + -4) - (long)pbVar8;
        if (__n != 0) {
          memmove(pbVar2 + -__n,pbVar8,__n);
        }
        *(undefined4 *)pbVar8 = uVar4;
      }
      else {
        pbVar1 = pbVar8 + 0xc;
        if ((long)pbVar2 - (long)pbVar1 == 0xc) {
          pbVar12 = pbVar8 + 0x10;
          do {
            uVar4 = *(undefined4 *)pbVar8;
            *(undefined4 *)pbVar8 = *(undefined4 *)(pbVar12 + -4);
            *(undefined4 *)(pbVar12 + -4) = uVar4;
            if (pbVar8 + 4 == pbVar1) break;
            bVar7 = pbVar12 != pbVar2;
            pbVar12 = pbVar12 + 4;
            pbVar8 = pbVar8 + 4;
          } while (bVar7);
        }
        else {
          lVar10 = 3;
          lVar14 = (long)pbVar2 - (long)pbVar1 >> 2;
          do {
            lVar13 = lVar14;
            lVar14 = 0;
            if (lVar13 != 0) {
              lVar14 = lVar10 / lVar13;
            }
            lVar14 = lVar10 - lVar14 * lVar13;
            lVar10 = lVar13;
          } while (lVar14 != 0);
          pbVar12 = pbVar8 + lVar13 * 4;
          do {
            pbVar11 = pbVar12 + -4;
            uVar4 = *(undefined4 *)pbVar11;
            pbVar15 = pbVar11;
            pbVar12 = pbVar12 + 8;
            do {
              pbVar16 = pbVar12;
              pbVar12 = pbVar16 + 0xc;
              if ((long)pbVar2 - (long)pbVar16 < 0xd) {
                pbVar12 = pbVar1 + -((long)pbVar2 - (long)pbVar16);
              }
              *(undefined4 *)pbVar15 = *(undefined4 *)pbVar16;
              pbVar15 = pbVar16;
            } while (pbVar12 != pbVar11);
            *(undefined4 *)pbVar16 = uVar4;
            pbVar12 = pbVar11;
          } while (pbVar11 != pbVar8);
        }
      }
    }
  }
  if (param_6 < 2) {
    if (param_6 == 0) {
      *param_1 = 0x2000403;
      goto joined_r0x00c09c48;
    }
    if (param_6 != 1) goto LAB_00c09e34;
    *(undefined1 *)param_1 = 3;
    *(undefined1 *)((long)param_1 + 3) = 2;
    if (param_5 == '\x02') {
      uVar9 = 0x401;
      goto LAB_00c09f5c;
    }
    if (param_5 != '\x01') {
      if (param_5 == '\0') {
        *(undefined2 *)((long)param_1 + 1) = 4;
        return;
      }
      goto LAB_00c09e34;
    }
    uVar9 = 4;
  }
  else {
    if (param_6 == 2) {
      *(undefined1 *)param_1 = 4;
      *(undefined1 *)((long)param_1 + 3) = 3;
      if (param_5 != '\x02') {
        if (param_5 == '\x01') {
          if (!bVar6) {
            std::__ndk1::
            basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
            ::insert(param_2,0,1,L' ');
          }
          goto LAB_00c09dc8;
        }
LAB_00c09dc4:
        if (param_5 == '\0') {
LAB_00c09dc8:
          *(undefined2 *)((long)param_1 + 1) = 0x200;
          return;
        }
        goto LAB_00c09e34;
      }
LAB_00c09e5c:
      uVar9 = 0x102;
LAB_00c09f5c:
      *(undefined2 *)((long)param_1 + 1) = uVar9;
      if (bVar6) {
        pbVar8 = param_2 + 4;
        if (((byte)*param_2 & 1) != 0) {
          pbVar8 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                     **)(param_2 + 0x10);
        }
        FUN_00c0be60(param_2,pbVar8);
        return;
      }
      return;
    }
    if (param_6 == 3) {
      *(undefined1 *)param_1 = 4;
      *(undefined1 *)((long)param_1 + 3) = 2;
      if (param_5 != '\x02') {
        if (param_5 == '\x01') {
          uVar9 = 0x301;
          goto LAB_00c09f5c;
        }
        if (param_5 == '\0') {
          *(undefined2 *)((long)param_1 + 1) = 0x300;
          return;
        }
        goto LAB_00c09e34;
      }
      uVar9 = 3;
    }
    else {
      if (param_6 != 4) goto LAB_00c09e34;
      *(undefined1 *)param_1 = 4;
      *(undefined1 *)((long)param_1 + 3) = 3;
      if (param_5 == '\x02') goto LAB_00c09e5c;
      if (param_5 != '\x01') goto LAB_00c09dc4;
      uVar9 = 0x200;
    }
  }
  *(undefined2 *)((long)param_1 + 1) = uVar9;
joined_r0x00c09e2c:
  if (bVar6) {
    return;
  }
  std::__ndk1::
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::insert
            (param_2,0,1,L' ');
  return;
}

