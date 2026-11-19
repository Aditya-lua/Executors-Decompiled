/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00beeb40
 */

basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *
FUN_00beeb40(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *param_1
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
  bool bVar8;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *__dest;
  byte bVar9;
  char *pcVar10;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar11;
  ulong uVar12;
  ulong uVar13;
  undefined8 local_78;
  ulong local_70;
  char *local_68;
  
  uVar5 = *(ulong *)param_1;
  sVar6 = *(size_t *)(param_1 + 8);
  bVar8 = ((byte)*param_1 & 1) != 0;
  uVar12 = (uVar5 & 0xfffffffffffffffe) - 1;
  __n = (ulong)((byte)*param_1 >> 1);
  if (bVar8) {
    __n = sVar6;
  }
  uVar4 = 0x16;
  if (bVar8) {
    uVar4 = uVar12;
  }
  uVar7 = param_3 - (long)param_2;
  if (uVar7 != 0) {
    pbVar11 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
               (param_1 + 0x10);
    uVar13 = uVar5 >> 1 & 0x7f;
    if ((uVar5 & 1) == 0) {
      sVar2 = uVar13;
      pbVar3 = param_1 + 1;
    }
    else {
      sVar2 = sVar6;
      pbVar3 = pbVar11;
    }
    if ((param_2 < pbVar3) || (pbVar3 + sVar2 + 1 <= param_2)) {
      if (uVar4 - __n < uVar7) {
        uVar5 = __n + uVar7;
        if (-uVar4 - 9 < uVar5 - uVar4) goto LAB_00beee04;
        if (uVar4 < 0x7ffffffffffffff3) {
          if (uVar5 <= uVar4 * 2) {
            uVar5 = uVar4 * 2;
          }
          uVar13 = 0x1a;
          if ((uVar5 | 7) != 0x17) {
            uVar13 = (uVar5 | 7) + 1;
          }
          uVar12 = 0x17;
          if (0x16 < uVar5) {
            uVar12 = uVar13;
          }
        }
        else {
          uVar12 = 0xfffffffffffffff7;
        }
        __dest = operator_new(uVar12);
        if (__n != 0) {
          memmove(__dest,pbVar3,__n);
        }
        if (uVar4 + 1 != 0x17) {
          operator_delete(pbVar3,uVar4 + 1);
        }
        *(size_t *)(param_1 + 8) = __n;
        *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
         (param_1 + 0x10) = __dest;
        *(ulong *)param_1 = uVar12 | 1;
      }
      else {
        __dest = param_1 + 1;
        if ((uVar5 & 1) != 0) {
          __dest = pbVar11;
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
LAB_00beee04:
                    /* WARNING: Subroutine does not return */
        FUN_007fe124();
      }
      if (uVar7 < 0x17) {
        pcVar10 = (char *)((ulong)&local_78 | 1);
        local_78 = CONCAT71(local_78._1_7_,(char)((int)uVar7 << 1));
      }
      else {
        uVar4 = 0x1a;
        if ((uVar7 | 7) != 0x17) {
          uVar4 = (uVar7 | 7) + 1;
        }
        pcVar10 = operator_new(uVar4);
        local_78 = uVar4 | 1;
        local_70 = uVar7;
        local_68 = pcVar10;
      }
      memcpy(pcVar10,param_2,uVar7);
      pcVar10[uVar7] = '\0';
      bVar9 = (byte)local_78 & 1;
      if ((local_78 & 1) == 0) {
        uVar4 = (ulong)((byte)local_78 >> 1);
        pcVar10 = (char *)((long)&local_78 + 1);
      }
      else {
        uVar4 = local_70;
        pcVar10 = local_68;
      }
      uVar7 = 0x16;
      if ((uVar5 & 1) != 0) {
        uVar7 = uVar12;
      }
      if ((uVar5 & 1) != 0) {
        uVar13 = sVar6;
      }
      if (uVar7 - uVar13 < uVar4) {
                    /* try { // try from 00beece4 to 00beecfb has its CatchHandler @ 00beee08 */
        std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
        ::__grow_by_and_replace
                  (param_1,uVar7,(uVar4 - uVar7) + uVar13,uVar13,uVar13,0,uVar4,pcVar10);
        bVar9 = (byte)local_78 & 1;
      }
      else if (uVar4 != 0) {
        pbVar3 = param_1 + 1;
        if ((uVar5 & 1) != 0) {
          pbVar3 = pbVar11;
        }
        memmove(pbVar3 + uVar13,pcVar10,uVar4);
        lVar1 = uVar13 + uVar4;
        if (((byte)*param_1 & 1) == 0) {
          *param_1 = SUB41((int)lVar1 << 1,0);
        }
        else {
          *(long *)(param_1 + 8) = lVar1;
        }
        pbVar3[lVar1] =
             (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x0;
      }
      if (bVar9 != 0) {
        operator_delete(local_68,local_78 & 0xfffffffffffffffe);
      }
    }
  }
  return param_1;
}

