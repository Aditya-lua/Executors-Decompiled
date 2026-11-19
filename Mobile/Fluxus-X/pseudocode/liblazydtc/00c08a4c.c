/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c08a4c
 */

/* WARNING: Type propagation algorithm not settling */

void FUN_00c08a4c(undefined4 *param_1,
                 basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                 *param_2,ulong param_3,char param_4,char param_5,byte param_6)

{
  ulong uVar1;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> bVar2;
  bool bVar3;
  undefined2 uVar4;
  long lVar5;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar6;
  
  if ((param_3 & 1) == 0) {
    bVar3 = false;
  }
  else {
    uVar1 = (ulong)((byte)*param_2 >> 1);
    if (((byte)*param_2 & 1) != 0) {
      uVar1 = *(ulong *)(param_2 + 8);
    }
    bVar3 = uVar1 == 4;
  }
  if (param_4 == '\x01') {
    if (param_6 < 2) {
      if (param_6 == 0) {
        *param_1 = 0x4000203;
joined_r0x00c08d14:
        if (param_5 == '\0') {
          return;
        }
        if (param_5 == '\x02') {
          return;
        }
        if (param_5 != '\x01') goto LAB_00c08d28;
        goto joined_r0x00c08cfc;
      }
      if (param_6 != 1) goto LAB_00c08d28;
      *(undefined1 *)param_1 = 3;
      *(undefined1 *)((long)param_1 + 3) = 4;
    }
    else {
      if (param_6 == 2) {
        *(undefined1 *)param_1 = 2;
        *(undefined1 *)((long)param_1 + 3) = 3;
        if (param_5 == '\x02') {
          uVar4 = 0x104;
          goto LAB_00c08da4;
        }
        if (param_5 != '\x01') {
          if (param_5 == '\0') {
            *(undefined2 *)((long)param_1 + 1) = 0x400;
            return;
          }
          goto LAB_00c08d28;
        }
        uVar4 = 0x400;
        goto LAB_00c08e20;
      }
      if (param_6 != 3) {
        if (param_6 == 4) {
          *(undefined1 *)param_1 = 2;
          *(undefined1 *)((long)param_1 + 3) = 4;
          if (param_5 == '\x02') {
            uVar4 = 0x300;
            goto LAB_00c08e20;
          }
          if (param_5 == '\x01') {
            uVar4 = 0x103;
            goto LAB_00c08da4;
          }
          if (param_5 == '\0') {
            *(undefined2 *)((long)param_1 + 1) = 3;
            return;
          }
        }
        goto LAB_00c08d28;
      }
      *(undefined1 *)param_1 = 3;
      *(undefined1 *)((long)param_1 + 3) = 4;
    }
    if (param_5 == '\x02') {
      uVar4 = 0x201;
LAB_00c08da4:
      *(undefined2 *)((long)param_1 + 1) = uVar4;
      if (!bVar3) {
        return;
      }
      bVar2 = *param_2;
      uVar1 = (ulong)((byte)bVar2 >> 1);
      if (((byte)bVar2 & 1) != 0) {
        uVar1 = *(ulong *)(param_2 + 8);
      }
      lVar5 = uVar1 - 1;
      if (((byte)bVar2 & 1) == 0) {
        pbVar6 = param_2 + 1;
        *param_2 = SUB41((int)lVar5 << 1,0);
      }
      else {
        pbVar6 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **
                  )(param_2 + 0x10);
        *(long *)(param_2 + 8) = lVar5;
      }
      pbVar6[lVar5] =
           (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x0;
      return;
    }
    if (param_5 == '\x01') {
      uVar4 = 2;
LAB_00c08e20:
      *(undefined2 *)((long)param_1 + 1) = uVar4;
      if (!bVar3) {
        std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
        ::push_back(param_2,' ');
        return;
      }
      return;
    }
    if (param_5 == '\0') {
      *(undefined2 *)((long)param_1 + 1) = 2;
      return;
    }
LAB_00c08d28:
    *param_1 = 0x4000302;
    return;
  }
  if (param_4 != '\0') goto LAB_00c08d28;
  if (bVar3) {
    uVar1 = *(ulong *)(param_2 + 8);
    pbVar6 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
              (param_2 + 0x10);
    if (((byte)*param_2 & 1) == 0) {
      pbVar6 = param_2 + 1;
      uVar1 = (ulong)((byte)*param_2 >> 1);
    }
    FUN_00c0bc14(pbVar6,pbVar6 + 3,pbVar6 + uVar1);
  }
  if (param_6 < 2) {
    if (param_6 == 0) {
      *param_1 = 0x2000403;
      goto joined_r0x00c08d14;
    }
    if (param_6 != 1) goto LAB_00c08d28;
    *(undefined1 *)param_1 = 3;
    *(undefined1 *)((long)param_1 + 3) = 2;
    if (param_5 == '\x02') {
      uVar4 = 0x401;
      goto LAB_00c08e4c;
    }
    if (param_5 != '\x01') {
      if (param_5 == '\0') {
        *(undefined2 *)((long)param_1 + 1) = 4;
        return;
      }
      goto LAB_00c08d28;
    }
    uVar4 = 4;
  }
  else {
    if (param_6 == 2) {
      *(undefined1 *)param_1 = 4;
      *(undefined1 *)((long)param_1 + 3) = 3;
      if (param_5 != '\x02') {
        if (param_5 == '\x01') {
          if (!bVar3) {
            std::__ndk1::
            basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::insert
                      (param_2,0,1,' ');
          }
          goto LAB_00c08c30;
        }
LAB_00c08c2c:
        if (param_5 == '\0') {
LAB_00c08c30:
          *(undefined2 *)((long)param_1 + 1) = 0x200;
          return;
        }
        goto LAB_00c08d28;
      }
LAB_00c08d4c:
      uVar4 = 0x102;
LAB_00c08e4c:
      *(undefined2 *)((long)param_1 + 1) = uVar4;
      if (!bVar3) {
        return;
      }
      pbVar6 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
                (param_2 + 0x10);
      if (((byte)*param_2 & 1) == 0) {
        pbVar6 = param_2 + 1;
      }
      FUN_00c0bbbc(param_2,pbVar6);
      return;
    }
    if (param_6 == 3) {
      *(undefined1 *)param_1 = 4;
      *(undefined1 *)((long)param_1 + 3) = 2;
      if (param_5 != '\x02') {
        if (param_5 == '\x01') {
          uVar4 = 0x301;
          goto LAB_00c08e4c;
        }
        if (param_5 == '\0') {
          *(undefined2 *)((long)param_1 + 1) = 0x300;
          return;
        }
        goto LAB_00c08d28;
      }
      uVar4 = 3;
    }
    else {
      if (param_6 != 4) goto LAB_00c08d28;
      *(undefined1 *)param_1 = 4;
      *(undefined1 *)((long)param_1 + 3) = 3;
      if (param_5 == '\x02') goto LAB_00c08d4c;
      if (param_5 != '\x01') goto LAB_00c08c2c;
      uVar4 = 0x200;
    }
  }
  *(undefined2 *)((long)param_1 + 1) = uVar4;
joined_r0x00c08cfc:
  if (!bVar3) {
    std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    insert(param_2,0,1,' ');
    return;
  }
  return;
}

