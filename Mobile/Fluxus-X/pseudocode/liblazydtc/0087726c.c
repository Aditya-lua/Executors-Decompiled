/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0087726c
 */

void FUN_0087726c(long param_1,
                 basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                 *param_2)

{
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar1;
  int iVar2;
  bool bVar3;
  undefined8 *__s;
  undefined8 uVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  long lVar10;
  ulong *puVar11;
  ulong uVar12;
  undefined8 *puVar13;
  void *unaff_x19;
  long unaff_x23;
  undefined8 *puVar14;
  
  uVar5 = *(ulong *)(param_1 + 0x248);
  if (uVar5 == 0) {
    puVar14 = (undefined8 *)0x0;
    __s = (undefined8 *)0x0;
    uVar5 = *(ulong *)(param_1 + 0x230);
  }
  else {
    if (uVar5 >> 0x3c != 0) {
      uVar4 = FUN_00879df8();
                    /* catch() { ... } // from try @ 008773f8 with catch @ 00877510 */
                    /* catch() { ... } // from try @ 00877430 with catch @ 00877518 */
      if (unaff_x19 != (void *)0x0) {
        operator_delete(unaff_x19,unaff_x23 - (long)unaff_x19);
      }
                    /* WARNING: Subroutine does not return */
      FUN_00c2c090(uVar4);
    }
    __s = operator_new(uVar5 * 0x10);
    puVar14 = __s + uVar5 * 2;
    memset(__s,0,uVar5 * 0x10);
    uVar5 = *(ulong *)(param_1 + 0x230);
  }
  if (uVar5 != 0) {
    puVar11 = *(ulong **)(param_1 + 0x238);
    uVar9 = *puVar11;
    if (uVar9 == 0) {
      uVar6 = 0;
      do {
        if (uVar5 - 1 == uVar6) goto LAB_008773ac;
        uVar9 = puVar11[uVar6 + 1];
        uVar6 = uVar6 + 1;
      } while (uVar9 == 0);
    }
    else {
      uVar6 = 0;
    }
    uVar12 = (uVar9 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar9 & 0x5555555555555555) << 1;
    uVar12 = (uVar12 & 0xcccccccccccccccc) >> 2 | (uVar12 & 0x3333333333333333) << 2;
    uVar12 = (uVar12 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar12 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar12 = (uVar12 & 0xff00ff00ff00ff00) >> 8 | (uVar12 & 0xff00ff00ff00ff) << 8;
    uVar12 = (uVar12 & 0xffff0000ffff0000) >> 0x10 | (uVar12 & 0xffff0000ffff) << 0x10;
    uVar12 = LZCOUNT(uVar12 >> 0x20 | uVar12 << 0x20) | uVar6 << 6;
    lVar10 = *(long *)(param_1 + 0x220);
code_r0x00877334:
    do {
      do {
        puVar13 = (undefined8 *)(lVar10 + uVar12 * 0x18);
        uVar9 = uVar9 - 1 & uVar9;
        iVar2 = *(int *)(puVar13 + 2);
        uVar4 = *puVar13;
        (__s + (ulong)(iVar2 - 1) * 2)[1] = puVar13[1];
        __s[(ulong)(iVar2 - 1) * 2] = uVar4;
        if (uVar9 == 0) {
          uVar7 = uVar6;
          uVar8 = uVar5;
          if (uVar5 <= uVar6 + 1) {
            uVar8 = uVar6 + 1;
          }
          do {
            uVar6 = uVar7 + 1;
            if (uVar5 <= uVar6) {
              uVar9 = 0;
              uVar6 = uVar8;
              if (uVar8 != uVar5) goto code_r0x00877334;
              goto LAB_00877390;
            }
            uVar9 = puVar11[uVar7 + 1];
            uVar7 = uVar6;
          } while (uVar9 == 0);
        }
        uVar12 = (uVar9 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar9 & 0x5555555555555555) << 1;
        uVar12 = (uVar12 & 0xcccccccccccccccc) >> 2 | (uVar12 & 0x3333333333333333) << 2;
        uVar12 = (uVar12 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar12 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar12 = (uVar12 & 0xff00ff00ff00ff00) >> 8 | (uVar12 & 0xff00ff00ff00ff) << 8;
        uVar12 = (uVar12 & 0xffff0000ffff0000) >> 0x10 | (uVar12 & 0xffff0000ffff) << 0x10;
        uVar12 = LZCOUNT(uVar12 >> 0x20 | uVar12 << 0x20) | uVar6 << 6;
        uVar8 = uVar6;
      } while (uVar6 != uVar5);
LAB_00877390:
      uVar6 = uVar8;
    } while (uVar9 != 0);
  }
LAB_008773ac:
  uVar5 = (ulong)((long)puVar14 - (long)__s) >> 4 & 0xffffffff;
  do {
                    /* try { // try from 008773c4 to 008773cb has its CatchHandler @ 00877514 */
    FUN_00877148(param_2,(uint)uVar5 & 0x7f | (uint)(0x7f < uVar5) << 7);
    bVar3 = 0x7f < uVar5;
    uVar5 = uVar5 >> 7;
  } while (bVar3);
  if (__s != puVar14) {
    puVar13 = __s;
    do {
      uVar5 = (ulong)*(uint *)(puVar13 + 1);
      do {
                    /* try { // try from 00877430 to 00877437 has its CatchHandler @ 00877518 */
        FUN_00877148(param_2,(uint)uVar5 & 0x7f | (uint)(0x7f < uVar5) << 7);
        bVar3 = 0x7f < uVar5;
        uVar5 = uVar5 >> 7;
      } while (bVar3);
      uVar9 = *(ulong *)param_2;
      uVar6 = puVar13[1];
      uVar5 = 0x16;
      if (((byte)*param_2 & 1) != 0) {
        uVar5 = (uVar9 & 0xfffffffffffffffe) - 1;
      }
      uVar12 = uVar9 >> 1 & 0x7f;
      if ((uVar9 & 1) != 0) {
        uVar12 = *(ulong *)(param_2 + 8);
      }
      if (uVar5 - uVar12 < uVar6) {
                    /* try { // try from 008773f8 to 0087740f has its CatchHandler @ 00877510 */
        std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
        ::__grow_by_and_replace
                  (param_2,uVar5,(uVar6 - uVar5) + uVar12,uVar12,uVar12,0,uVar6,(char *)*puVar13);
      }
      else if (uVar6 != 0) {
        pbVar1 = param_2 + 1;
        if ((uVar9 & 1) != 0) {
          pbVar1 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                     **)(param_2 + 0x10);
        }
        memmove(pbVar1 + uVar12,(char *)*puVar13,uVar6);
        lVar10 = uVar12 + uVar6;
        if (((byte)*param_2 & 1) == 0) {
          *param_2 = SUB41((int)lVar10 << 1,0);
          pbVar1[lVar10] =
               (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x0;
        }
        else {
          *(long *)(param_2 + 8) = lVar10;
          pbVar1[lVar10] =
               (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x0;
        }
      }
      puVar13 = puVar13 + 2;
    } while (puVar13 != puVar14);
  }
  if (__s == (undefined8 *)0x0) {
    return;
  }
  operator_delete(__s,(long)puVar14 - (long)__s);
  return;
}

