/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e539c
 */

/* cpr::AcceptEncoding::AcceptEncoding(std::initializer_list<cpr::AcceptEncodingMethods> const&) */

void __thiscall cpr::AcceptEncoding::AcceptEncoding(AcceptEncoding *this,initializer_list *param_1)

{
  AcceptEncoding *pAVar1;
  int *piVar2;
  byte bVar3;
  ulong uVar4;
  long lVar5;
  size_t __n;
  int iVar6;
  char *pcVar7;
  ulong uVar8;
  logic_error *this_00;
  long *plVar9;
  ulong uVar10;
  char *pcVar11;
  long *plVar12;
  char *pcVar13;
  ulong uVar14;
  long lVar15;
  char *pcVar16;
  void *pvVar17;
  ulong uVar18;
  ulong uVar19;
  ulong unaff_x24;
  int *piVar20;
  ulong local_90;
  ulong uStack_88;
  char *local_80;
  __murmur2_or_cityhash<unsigned_long,64ul> a_Stack_70 [8];
  long local_68;
  
  lVar5 = tpidr_el0;
  local_68 = *(long *)(lVar5 + 0x28);
  *(undefined8 *)(this + 8) = 0;
  *(undefined8 *)this = 0;
  *(undefined8 *)(this + 0x18) = 0;
  *(undefined8 *)(this + 0x10) = 0;
  *(undefined4 *)(this + 0x20) = 0x3f800000;
  if (*(long *)(param_1 + 8) == 0) {
LAB_008e577c:
    if (*(long *)(lVar5 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
      __stack_chk_fail();
    }
    return;
  }
  piVar20 = *(int **)param_1;
  pAVar1 = this + 0x10;
  pcVar13 = (char *)((ulong)&local_90 | 1);
  piVar2 = piVar20 + *(long *)(param_1 + 8);
LAB_008e5408:
  if (DAT_00d1ff00 != (long *)0x0) {
    plVar9 = DAT_00d1ff00;
    do {
      if (*piVar20 < (int)plVar9[4]) {
        plVar9 = (long *)*plVar9;
      }
      else {
        if (*piVar20 <= (int)plVar9[4]) goto LAB_008e5444;
        plVar9 = (long *)plVar9[1];
      }
      if (plVar9 == (long *)0x0) break;
    } while( true );
  }
  goto LAB_008e57b0;
LAB_008e5444:
  if (plVar9 == (long *)0x0) {
LAB_008e57b0:
    this_00 = (logic_error *)__cxa_allocate_exception(0x10);
                    /* try { // try from 008e57bc to 008e57c7 has its CatchHandler @ 008e5800 */
    std::logic_error::logic_error(this_00,"map::at:  key not found");
    *(undefined ***)this_00 = &PTR__domain_error_00cb0670;
                    /* try { // try from 008e57d8 to 008e57f7 has its CatchHandler @ 008e57fc */
                    /* WARNING: Subroutine does not return */
    __cxa_throw(this_00,&std::out_of_range::typeinfo,std::domain_error::~domain_error);
  }
  uStack_88 = 0;
  local_80 = (char *)0x0;
  local_90 = 0;
  if ((plVar9[5] & 1U) == 0) {
    local_80 = (char *)plVar9[7];
    uStack_88 = plVar9[6];
    local_90 = plVar9[5];
  }
  else {
    uVar14 = plVar9[6];
    if (0xffffffffffffffef < uVar14) {
                    /* WARNING: Subroutine does not return */
      std::__ndk1::__basic_string_common<true>::__throw_length_error();
    }
    pvVar17 = (void *)plVar9[7];
    if (uVar14 < 0x17) {
      local_90 = (ulong)(byte)((int)uVar14 << 1);
      pcVar7 = pcVar13;
      if (uVar14 != 0) goto LAB_008e54b8;
    }
    else {
      uVar8 = uVar14 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 008e54a0 to 008e54a7 has its CatchHandler @ 008e5818 */
      pcVar7 = operator_new(uVar8);
      local_90 = uVar8 | 1;
      uStack_88 = uVar14;
      local_80 = pcVar7;
LAB_008e54b8:
      memcpy(pcVar7,pvVar17,uVar14);
    }
    pcVar7[uVar14] = '\0';
  }
  pcVar7 = pcVar13;
  uVar14 = local_90 >> 1 & 0x7f;
  if ((local_90 & 1) != 0) {
    pcVar7 = local_80;
    uVar14 = uStack_88;
  }
                    /* try { // try from 008e54e8 to 008e54ef has its CatchHandler @ 008e58a8 */
  uVar8 = std::__ndk1::__murmur2_or_cityhash<unsigned_long,64ul>::operator()
                    (a_Stack_70,pcVar7,uVar14);
  uVar14 = local_90;
  uVar19 = *(ulong *)(this + 8);
  if (uVar19 != 0) {
    uVar18 = uVar19 - 1;
    if ((uVar18 & uVar19) == 0) {
      unaff_x24 = uVar18 & uVar8;
    }
    else {
      unaff_x24 = uVar8;
      if (uVar19 <= uVar8) {
        uVar10 = 0;
        if (uVar19 != 0) {
          uVar10 = uVar8 / uVar19;
        }
        unaff_x24 = uVar8 - uVar10 * uVar19;
      }
    }
    plVar9 = *(long **)(*(long *)this + unaff_x24 * 8);
    if ((plVar9 != (long *)0x0) && (plVar9 = (long *)*plVar9, plVar9 != (long *)0x0)) {
      __n = local_90 >> 1 & 0x7f;
      pcVar7 = pcVar13;
      if ((local_90 & 1) != 0) {
        __n = uStack_88;
        pcVar7 = local_80;
      }
      do {
        uVar10 = plVar9[1];
        if (uVar10 != uVar8) {
          if ((uVar18 & uVar19) == 0) {
            uVar10 = uVar10 & uVar18;
          }
          else if (uVar19 <= uVar10) {
            uVar4 = 0;
            if (uVar19 != 0) {
              uVar4 = uVar10 / uVar19;
            }
            if (uVar10 - uVar4 * uVar19 == unaff_x24) goto LAB_008e5590;
            break;
          }
          if (uVar10 != unaff_x24) break;
        }
LAB_008e5590:
        bVar3 = *(byte *)(plVar9 + 2);
        uVar10 = (ulong)(bVar3 >> 1);
        if ((bVar3 & 1) != 0) {
          uVar10 = plVar9[3];
        }
        if (uVar10 == __n) {
          pvVar17 = (void *)plVar9[4];
          if ((bVar3 & 1) == 0) {
            pvVar17 = (void *)((long)plVar9 + 0x11);
          }
          if ((bVar3 & 1) == 0) {
            if (__n == 0) goto joined_r0x008e56cc;
            pcVar11 = (char *)((long)plVar9 + 0x11);
            lVar15 = -(ulong)(bVar3 >> 1);
            pcVar16 = pcVar7;
            while (*pcVar11 == *pcVar16) {
              pcVar11 = pcVar11 + 1;
              lVar15 = lVar15 + 1;
              pcVar16 = pcVar16 + 1;
              if (lVar15 == 0) goto joined_r0x008e56cc;
            }
          }
          else if ((__n == 0) || (iVar6 = memcmp(pvVar17,pcVar7,__n), iVar6 == 0))
          goto joined_r0x008e56cc;
        }
        plVar9 = (long *)*plVar9;
      } while (plVar9 != (long *)0x0);
    }
  }
                    /* try { // try from 008e561c to 008e5623 has its CatchHandler @ 008e5850 */
  plVar9 = operator_new(0x28);
  pcVar7 = local_80;
  uVar18 = uStack_88;
  uVar14 = local_90;
  uStack_88 = 0;
  local_80 = (char *)0x0;
  local_90 = 0;
  plVar9[4] = (long)pcVar7;
  plVar9[3] = uVar18;
  plVar9[2] = uVar14;
  *plVar9 = 0;
  plVar9[1] = uVar8;
  if ((uVar19 == 0) ||
     (*(float *)(this + 0x20) * (float)uVar19 < (float)(*(long *)(this + 0x18) + 1))) {
    if (uVar19 < 3) {
      uVar14 = 1;
    }
    else {
      uVar14 = (ulong)((uVar19 - 1 & uVar19) != 0);
    }
    uVar14 = uVar14 | uVar19 << 1;
    uVar19 = (ulong)((float)(*(long *)(this + 0x18) + 1) / *(float *)(this + 0x20));
    if (uVar19 <= uVar14) {
      uVar19 = uVar14;
    }
                    /* try { // try from 008e56a0 to 008e56a7 has its CatchHandler @ 008e5828 */
    std::__ndk1::
    __hash_table<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::hash<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::equal_to<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
    ::rehash((__hash_table<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::hash<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::equal_to<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
              *)this,uVar19);
    uVar19 = *(ulong *)(this + 8);
    if ((uVar19 - 1 & uVar19) == 0) {
      unaff_x24 = uVar19 - 1 & uVar8;
    }
    else if (uVar8 < uVar19) {
      unaff_x24 = uVar8;
    }
    else {
      uVar14 = 0;
      if (uVar19 != 0) {
        uVar14 = uVar8 / uVar19;
      }
      unaff_x24 = uVar8 - uVar14 * uVar19;
    }
  }
  lVar15 = *(long *)this;
  plVar12 = *(long **)(lVar15 + unaff_x24 * 8);
  if (plVar12 == (long *)0x0) {
    *plVar9 = *(long *)pAVar1;
    *(long **)pAVar1 = plVar9;
    *(AcceptEncoding **)(lVar15 + unaff_x24 * 8) = pAVar1;
    if (*plVar9 == 0) goto LAB_008e574c;
    uVar14 = *(ulong *)(*plVar9 + 8);
    if ((uVar19 - 1 & uVar19) == 0) {
      uVar14 = uVar14 & uVar19 - 1;
    }
    else if (uVar19 <= uVar14) {
      uVar8 = 0;
      if (uVar19 != 0) {
        uVar8 = uVar14 / uVar19;
      }
      uVar14 = uVar14 - uVar8 * uVar19;
    }
    plVar12 = (long *)(*(long *)this + uVar14 * 8);
  }
  else {
    *plVar9 = *plVar12;
  }
  *plVar12 = (long)plVar9;
LAB_008e574c:
  *(long *)(this + 0x18) = *(long *)(this + 0x18) + 1;
  uVar14 = local_90;
joined_r0x008e56cc:
  if ((uVar14 & 1) != 0) {
    operator_delete(local_80);
  }
  piVar20 = piVar20 + 1;
  if (piVar20 == piVar2) goto LAB_008e577c;
  goto LAB_008e5408;
}

