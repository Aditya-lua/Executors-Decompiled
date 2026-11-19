/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f5060
 */

/* std::__ndk1::__hash_table<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >, std::__ndk1::hash<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >,
   std::__ndk1::equal_to<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > >, std::__ndk1::allocator<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >
   >::__node_insert_multi(std::__ndk1::__hash_node<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >, void*>*) */

__hash_node * __thiscall
std::__ndk1::
__hash_table<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::hash<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::equal_to<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
::__node_insert_multi
          (__hash_table<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::hash<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::equal_to<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
           *this,__hash_node *param_1)

{
  ulong uVar1;
  size_t __n;
  size_t sVar2;
  byte bVar3;
  __hash_node _Var4;
  long lVar5;
  byte bVar6;
  bool bVar7;
  int iVar8;
  ulong uVar9;
  __hash_node *p_Var10;
  ulong uVar11;
  __hash_node *p_Var12;
  __hash_table<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::hash<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::equal_to<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
  *p_Var13;
  ulong uVar14;
  void *__s1;
  long lVar15;
  ulong uVar16;
  ulong uVar17;
  ulong uVar18;
  undefined8 *puVar19;
  undefined8 *puVar20;
  __murmur2_or_cityhash<unsigned_long,64ul> a_Stack_70 [8];
  long local_68;
  
  lVar5 = tpidr_el0;
  local_68 = *(long *)(lVar5 + 0x28);
  uVar9 = (ulong)((byte)param_1[0x10] >> 1);
  p_Var10 = param_1 + 0x11;
  if (((byte)param_1[0x10] & 1) != 0) {
    uVar9 = *(ulong *)(param_1 + 0x18);
    p_Var10 = *(__hash_node **)(param_1 + 0x20);
  }
                    /* try { // try from 008f50b4 to 008f50bb has its CatchHandler @ 008f535c */
  uVar9 = __murmur2_or_cityhash<unsigned_long,64ul>::operator()(a_Stack_70,p_Var10,uVar9);
  *(ulong *)(param_1 + 8) = uVar9;
  uVar16 = *(ulong *)(this + 8);
  if ((uVar16 == 0) ||
     (*(float *)(this + 0x20) * (float)uVar16 < (float)(*(long *)(this + 0x18) + 1))) {
    if (uVar16 < 3) {
      uVar9 = 1;
    }
    else {
      uVar9 = (ulong)((uVar16 - 1 & uVar16) != 0);
    }
    uVar9 = uVar9 | uVar16 << 1;
    uVar16 = (ulong)((float)(*(long *)(this + 0x18) + 1) / *(float *)(this + 0x20));
    if (uVar16 <= uVar9) {
      uVar16 = uVar9;
    }
    rehash(this,uVar16);
    uVar16 = *(ulong *)(this + 8);
    uVar9 = *(ulong *)(param_1 + 8);
  }
  uVar17 = uVar16 - 1;
  uVar1 = uVar17 & uVar16;
  if (uVar1 == 0) {
    uVar18 = uVar17 & uVar9;
  }
  else {
    uVar18 = uVar9;
    if (uVar16 <= uVar9) {
      uVar18 = 0;
      if (uVar16 != 0) {
        uVar18 = uVar9 / uVar16;
      }
      uVar18 = uVar9 - uVar18 * uVar16;
    }
  }
  puVar19 = *(undefined8 **)(*(long *)this + uVar18 * 8);
  if (puVar19 == (undefined8 *)0x0) {
    p_Var13 = this + 0x10;
    *(undefined8 *)param_1 = *(undefined8 *)p_Var13;
    *(__hash_node **)p_Var13 = param_1;
    *(__hash_table<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::hash<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::equal_to<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
      **)(*(long *)this + uVar18 * 8) = p_Var13;
    if (*(long *)param_1 == 0) goto LAB_008f5318;
    uVar9 = *(ulong *)(*(long *)param_1 + 8);
    if (uVar1 == 0) {
      uVar9 = uVar9 & uVar17;
    }
    else if (uVar16 <= uVar9) {
      uVar1 = 0;
      if (uVar16 != 0) {
        uVar1 = uVar9 / uVar16;
      }
      uVar9 = uVar9 - uVar1 * uVar16;
    }
  }
  else {
    bVar3 = 0;
LAB_008f527c:
    do {
      do {
        bVar6 = bVar3;
        puVar20 = puVar19;
        puVar19 = (undefined8 *)*puVar20;
        if (puVar19 == (undefined8 *)0x0) goto LAB_008f5288;
        uVar11 = puVar19[1];
        if (uVar1 == 0) {
          uVar14 = uVar11 & uVar17;
        }
        else {
          uVar14 = uVar11;
          if (uVar16 <= uVar11) {
            uVar14 = 0;
            if (uVar16 != 0) {
              uVar14 = uVar11 / uVar16;
            }
            uVar14 = uVar11 - uVar14 * uVar16;
          }
        }
        if (uVar14 != uVar18) goto LAB_008f5288;
        bVar7 = false;
        if (uVar11 == uVar9) {
          bVar3 = *(byte *)(puVar19 + 2);
          _Var4 = param_1[0x10];
          __n = (ulong)(bVar3 >> 1);
          if ((bVar3 & 1) != 0) {
            __n = puVar19[3];
          }
          sVar2 = (ulong)((byte)_Var4 >> 1);
          if (((byte)_Var4 & 1) != 0) {
            sVar2 = *(size_t *)(param_1 + 0x18);
          }
          bVar7 = false;
          if (__n == sVar2) {
            __s1 = (void *)puVar19[4];
            if ((bVar3 & 1) == 0) {
              __s1 = (void *)((long)puVar19 + 0x11);
            }
            p_Var10 = param_1 + 0x11;
            if (((byte)_Var4 & 1) != 0) {
              p_Var10 = *(__hash_node **)(param_1 + 0x20);
            }
            if ((bVar3 & 1) == 0) {
              if (__n != 0) {
                p_Var12 = (__hash_node *)((long)puVar19 + 0x11);
                lVar15 = -(ulong)(bVar3 >> 1);
                do {
                  bVar3 = bVar6;
                  if (*p_Var12 != *p_Var10) goto LAB_008f5254;
                  p_Var12 = p_Var12 + 1;
                  lVar15 = lVar15 + 1;
                  p_Var10 = p_Var10 + 1;
                } while (lVar15 != 0);
              }
            }
            else if (__n != 0) {
              iVar8 = memcmp(__s1,p_Var10,__n);
              bVar7 = iVar8 == 0;
              goto LAB_008f524c;
            }
            bVar3 = 1;
            goto LAB_008f527c;
          }
        }
LAB_008f524c:
        bVar3 = bVar6 | bVar7;
      } while (bVar7);
LAB_008f5254:
    } while ((bool)(bVar6 ^ 1));
LAB_008f5288:
    *(undefined8 **)param_1 = puVar19;
    *puVar20 = param_1;
    if (*(long *)param_1 == 0) goto LAB_008f5318;
    uVar9 = *(ulong *)(*(long *)param_1 + 8);
    if (uVar1 == 0) {
      uVar9 = uVar9 & uVar17;
    }
    else if (uVar16 <= uVar9) {
      uVar1 = 0;
      if (uVar16 != 0) {
        uVar1 = uVar9 / uVar16;
      }
      uVar9 = uVar9 - uVar1 * uVar16;
    }
    if (uVar9 == uVar18) goto LAB_008f5318;
  }
  *(__hash_node **)(*(long *)this + uVar9 * 8) = param_1;
LAB_008f5318:
  *(long *)(this + 0x18) = *(long *)(this + 0x18) + 1;
  if (*(long *)(lVar5 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return param_1;
}

