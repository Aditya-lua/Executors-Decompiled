/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00826e2c
 */

basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *
FUN_00826e2c(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *param_1
            ,basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *param_2
            ,long param_3)

{
  long lVar1;
  size_t __n;
  size_t sVar2;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar3;
  ulong uVar4;
  ulong uVar5;
  size_t sVar6;
  ulong uVar7;
  long lVar8;
  bool bVar9;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *__dest;
  byte bVar10;
  char *pcVar11;
  ulong uVar12;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar13;
  ulong uVar14;
  undefined8 local_80;
  ulong local_78;
  char *local_70;
  long local_68;
  
  lVar8 = tpidr_el0;
  local_68 = *(long *)(lVar8 + 0x28);
  uVar5 = *(ulong *)param_1;
  sVar6 = *(size_t *)(param_1 + 8);
  bVar9 = ((byte)*param_1 & 1) != 0;
  uVar14 = (uVar5 & 0xfffffffffffffffe) - 1;
  __n = (ulong)((byte)*param_1 >> 1);
  if (bVar9) {
    __n = sVar6;
  }
  uVar4 = 0x16;
  if (bVar9) {
    uVar4 = uVar14;
  }
  uVar7 = param_3 - (long)param_2;
  if (uVar7 != 0) {
    pbVar13 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
               (param_1 + 0x10);
    uVar12 = uVar5 >> 1 & 0x7f;
    if ((uVar5 & 1) == 0) {
      sVar2 = uVar12;
      pbVar3 = param_1 + 1;
    }
    else {
      sVar2 = sVar6;
      pbVar3 = pbVar13;
    }
    if ((param_2 < pbVar3) || (pbVar3 + sVar2 + 1 <= param_2)) {
      if (uVar4 - __n < uVar7) {
        uVar5 = __n + uVar7;
        if (-uVar4 - 9 < uVar5 - uVar4) goto LAB_00827114;
        if (uVar4 < 0x7ffffffffffffff3) {
          if (uVar5 <= uVar4 * 2) {
            uVar5 = uVar4 * 2;
          }
          uVar12 = 0x1a;
          if ((uVar5 | 7) != 0x17) {
            uVar12 = (uVar5 | 7) + 1;
          }
          uVar14 = 0x17;
          if (0x16 < uVar5) {
            uVar14 = uVar12;
          }
        }
        else {
          uVar14 = 0xfffffffffffffff7;
        }
        __dest = operator_new(uVar14);
        if (__n != 0) {
          memmove(__dest,pbVar3,__n);
        }
        if (uVar4 + 1 != 0x17) {
          operator_delete(pbVar3,uVar4 + 1);
        }
        *(size_t *)(param_1 + 8) = __n;
        *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
         (param_1 + 0x10) = __dest;
        *(ulong *)param_1 = uVar14 | 1;
      }
      else {
        __dest = param_1 + 1;
        if ((uVar5 & 1) != 0) {
          __dest = pbVar13;
        }
      }
      memmove(__dest + __n,param_2,uVar7);
      (__dest + __n)[uVar7] =
           (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x0;
      if (((byte)*param_1 & 1) == 0) {
        *param_1 = SUB41((int)(__n + uVar7) << 1,0);
      }
      else {
        *(size_t *)(param_1 + 8) = __n + uVar7;
      }
    }
    else {
      if (0xfffffffffffffff7 < uVar7) {
LAB_00827114:
        if (*(long *)(lVar8 + 0x28) == local_68) {
                    /* WARNING: Subroutine does not return */
          FUN_007fe124();
        }
        goto LAB_00827164;
      }
      if (uVar7 < 0x17) {
        pcVar11 = (char *)((ulong)&local_80 | 1);
        local_80 = CONCAT71(local_80._1_7_,(char)((int)uVar7 << 1));
      }
      else {
        uVar4 = 0x1a;
        if ((uVar7 | 7) != 0x17) {
          uVar4 = (uVar7 | 7) + 1;
        }
        pcVar11 = operator_new(uVar4);
        local_80 = uVar4 | 1;
        local_78 = uVar7;
        local_70 = pcVar11;
      }
      memcpy(pcVar11,param_2,uVar7);
      pcVar11[uVar7] = '\0';
      bVar10 = (byte)local_80 & 1;
      if ((local_80 & 1) == 0) {
        uVar4 = (ulong)((byte)local_80 >> 1);
        pcVar11 = (char *)((long)&local_80 + 1);
      }
      else {
        uVar4 = local_78;
        pcVar11 = local_70;
      }
      uVar7 = 0x16;
      if ((uVar5 & 1) != 0) {
        uVar7 = uVar14;
      }
      if ((uVar5 & 1) != 0) {
        uVar12 = sVar6;
      }
      if (uVar7 - uVar12 < uVar4) {
                    /* try { // try from 00826fdc to 00826ff7 has its CatchHandler @ 0082712c */
        std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
        ::__grow_by_and_replace
                  (param_1,uVar7,(uVar4 - uVar7) + uVar12,uVar12,uVar12,0,uVar4,pcVar11);
        bVar10 = (byte)local_80 & 1;
      }
      else if (uVar4 != 0) {
        pbVar3 = param_1 + 1;
        if ((uVar5 & 1) != 0) {
          pbVar3 = pbVar13;
        }
        memmove(pbVar3 + uVar12,pcVar11,uVar4);
        lVar1 = uVar12 + uVar4;
        if (((byte)*param_1 & 1) == 0) {
          *param_1 = SUB41((int)lVar1 << 1,0);
        }
        else {
          *(long *)(param_1 + 8) = lVar1;
        }
        pbVar3[lVar1] =
             (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x0;
      }
      if (bVar10 != 0) {
        operator_delete(local_70,local_80 & 0xfffffffffffffffe);
      }
    }
  }
  if (*(long *)(lVar8 + 0x28) == local_68) {
    return param_1;
  }
LAB_00827164:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

