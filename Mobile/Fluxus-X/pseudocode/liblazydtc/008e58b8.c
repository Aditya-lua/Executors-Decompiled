/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e58b8
 */

/* std::__ndk1::unordered_set<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >, std::__ndk1::hash<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >,
   std::__ndk1::equal_to<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > >, std::__ndk1::allocator<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >
   >::unordered_set(std::initializer_list<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >) */

void std::__ndk1::
     unordered_set<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::hash<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::equal_to<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
     ::unordered_set(__hash_table<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::hash<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::equal_to<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
                     *param_1,byte *param_2,long param_3)

{
  byte *pbVar1;
  byte bVar2;
  long lVar3;
  size_t __n;
  int iVar4;
  basic_string_conflict *pbVar5;
  byte *pbVar6;
  long *plVar7;
  basic_string_conflict *pbVar8;
  byte *pbVar9;
  long lVar10;
  ulong uVar11;
  ulong uVar12;
  byte *pbVar13;
  void *__s1;
  basic_string_conflict *pbVar14;
  basic_string_conflict *pbVar15;
  basic_string_conflict *unaff_x28;
  long *local_80 [3];
  long local_68;
  
  lVar3 = tpidr_el0;
  local_68 = *(long *)(lVar3 + 0x28);
  *(undefined8 *)(param_1 + 8) = 0;
  *(undefined8 *)param_1 = 0;
  *(undefined8 *)(param_1 + 0x18) = 0;
  *(undefined8 *)(param_1 + 0x10) = 0;
  *(undefined4 *)(param_1 + 0x20) = 0x3f800000;
  if (param_3 != 0) {
    pbVar6 = param_2 + param_3 * 0x18;
    do {
      uVar11 = *(ulong *)(param_2 + 8);
      pbVar1 = *(byte **)(param_2 + 0x10);
      if ((*param_2 & 1) == 0) {
        pbVar1 = param_2 + 1;
        uVar11 = (ulong)(*param_2 >> 1);
      }
                    /* try { // try from 008e5930 to 008e5937 has its CatchHandler @ 008e5c50 */
      pbVar5 = (basic_string_conflict *)
               __murmur2_or_cityhash<unsigned_long,64ul>::operator()
                         ((__murmur2_or_cityhash<unsigned_long,64ul> *)local_80,pbVar1,uVar11);
      pbVar15 = *(basic_string_conflict **)(param_1 + 8);
      if (pbVar15 != (basic_string_conflict *)0x0) {
        pbVar14 = pbVar15 + -1;
        if (((ulong)pbVar14 & (ulong)pbVar15) == 0) {
          unaff_x28 = (basic_string_conflict *)((ulong)pbVar14 & (ulong)pbVar5);
        }
        else {
          unaff_x28 = pbVar5;
          if (pbVar15 <= pbVar5) {
            uVar11 = 0;
            if (pbVar15 != (basic_string_conflict *)0x0) {
              uVar11 = (ulong)pbVar5 / (ulong)pbVar15;
            }
            unaff_x28 = pbVar5 + -(uVar11 * (long)pbVar15);
          }
        }
        plVar7 = *(long **)(*(long *)param_1 + (long)unaff_x28 * 8);
        if ((plVar7 != (long *)0x0) && (plVar7 = (long *)*plVar7, plVar7 != (long *)0x0)) {
          __n = (ulong)(*param_2 >> 1);
          pbVar1 = param_2 + 1;
          if ((*param_2 & 1) != 0) {
            __n = *(size_t *)(param_2 + 8);
            pbVar1 = *(byte **)(param_2 + 0x10);
          }
          do {
            pbVar8 = (basic_string_conflict *)plVar7[1];
            if (pbVar8 != pbVar5) {
              if (((ulong)pbVar14 & (ulong)pbVar15) == 0) {
                pbVar8 = (basic_string_conflict *)((ulong)pbVar8 & (ulong)pbVar14);
              }
              else if (pbVar15 <= pbVar8) {
                uVar11 = 0;
                if (pbVar15 != (basic_string_conflict *)0x0) {
                  uVar11 = (ulong)pbVar8 / (ulong)pbVar15;
                }
                if (pbVar8 + -(uVar11 * (long)pbVar15) == unaff_x28) goto LAB_008e59d4;
                break;
              }
              if (pbVar8 != unaff_x28) break;
            }
LAB_008e59d4:
            bVar2 = *(byte *)(plVar7 + 2);
            uVar11 = (ulong)(bVar2 >> 1);
            if ((bVar2 & 1) != 0) {
              uVar11 = plVar7[3];
            }
            if (uVar11 == __n) {
              __s1 = (void *)plVar7[4];
              if ((bVar2 & 1) == 0) {
                __s1 = (void *)((long)plVar7 + 0x11);
              }
              if ((bVar2 & 1) == 0) {
                if (__n == 0) goto LAB_008e5b84;
                pbVar9 = (byte *)((long)plVar7 + 0x11);
                lVar10 = -(ulong)(bVar2 >> 1);
                pbVar13 = pbVar1;
                while (*pbVar9 == *pbVar13) {
                  pbVar9 = pbVar9 + 1;
                  lVar10 = lVar10 + 1;
                  pbVar13 = pbVar13 + 1;
                  if (lVar10 == 0) goto LAB_008e5b84;
                }
              }
              else if ((__n == 0) || (iVar4 = memcmp(__s1,pbVar1,__n), iVar4 == 0))
              goto LAB_008e5b84;
            }
            plVar7 = (long *)*plVar7;
          } while (plVar7 != (long *)0x0);
        }
      }
                    /* try { // try from 008e5a54 to 008e5a67 has its CatchHandler @ 008e5c08 */
      __hash_table<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::hash<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::equal_to<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
      ::
      __construct_node_hash<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const&>
                ((ulong)param_1,pbVar5);
      if ((pbVar15 == (basic_string_conflict *)0x0) ||
         (*(float *)(param_1 + 0x20) * (float)pbVar15 < (float)(*(long *)(param_1 + 0x18) + 1))) {
        if (pbVar15 < (basic_string_conflict *)0x3) {
          uVar11 = 1;
        }
        else {
          uVar11 = (ulong)(((ulong)(pbVar15 + -1) & (ulong)pbVar15) != 0);
        }
        uVar11 = uVar11 | (long)pbVar15 << 1;
        uVar12 = (ulong)((float)(*(long *)(param_1 + 0x18) + 1) / *(float *)(param_1 + 0x20));
        if (uVar12 <= uVar11) {
          uVar12 = uVar11;
        }
                    /* try { // try from 008e5ac0 to 008e5ac7 has its CatchHandler @ 008e5bcc */
        __hash_table<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::hash<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::equal_to<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
        ::rehash(param_1,uVar12);
        pbVar15 = *(basic_string_conflict **)(param_1 + 8);
        if (((ulong)(pbVar15 + -1) & (ulong)pbVar15) == 0) {
          unaff_x28 = (basic_string_conflict *)((ulong)(pbVar15 + -1) & (ulong)pbVar5);
        }
        else if (pbVar5 < pbVar15) {
          unaff_x28 = pbVar5;
        }
        else {
          uVar11 = 0;
          if (pbVar15 != (basic_string_conflict *)0x0) {
            uVar11 = (ulong)pbVar5 / (ulong)pbVar15;
          }
          unaff_x28 = pbVar5 + -(uVar11 * (long)pbVar15);
        }
      }
      plVar7 = *(long **)(*(long *)param_1 + (long)unaff_x28 * 8);
      if (plVar7 == (long *)0x0) {
        *local_80[0] = *(long *)(param_1 + 0x10);
        *(long **)(param_1 + 0x10) = local_80[0];
        *(__hash_table<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::hash<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::equal_to<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
          **)(*(long *)param_1 + (long)unaff_x28 * 8) = param_1 + 0x10;
        if (*local_80[0] != 0) {
          pbVar5 = *(basic_string_conflict **)(*local_80[0] + 8);
          if (((ulong)(pbVar15 + -1) & (ulong)pbVar15) == 0) {
            pbVar5 = (basic_string_conflict *)((ulong)pbVar5 & (ulong)(pbVar15 + -1));
          }
          else if (pbVar15 <= pbVar5) {
            uVar11 = 0;
            if (pbVar15 != (basic_string_conflict *)0x0) {
              uVar11 = (ulong)pbVar5 / (ulong)pbVar15;
            }
            pbVar5 = pbVar5 + -(uVar11 * (long)pbVar15);
          }
          *(long **)(*(long *)param_1 + (long)pbVar5 * 8) = local_80[0];
        }
      }
      else {
        *local_80[0] = *plVar7;
        *plVar7 = (long)local_80[0];
      }
      *(long *)(param_1 + 0x18) = *(long *)(param_1 + 0x18) + 1;
LAB_008e5b84:
      param_2 = param_2 + 0x18;
    } while (param_2 != pbVar6);
  }
  if (*(long *)(lVar3 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

