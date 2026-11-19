/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e6b34
 */

/* std::__ndk1::__hash_table<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >, std::__ndk1::hash<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >,
   std::__ndk1::equal_to<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > >, std::__ndk1::allocator<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > > >::__rehash(unsigned long) */

void __thiscall
std::__ndk1::
__hash_table<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::hash<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::equal_to<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
::__rehash(__hash_table<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::hash<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::equal_to<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
           *this,ulong param_1)

{
  size_t sVar1;
  size_t __n;
  char *__s1;
  byte bVar2;
  byte bVar3;
  ulong uVar4;
  char *pcVar5;
  size_t sVar6;
  long *plVar7;
  int iVar8;
  void *pvVar9;
  logic_error *this_00;
  void *pvVar10;
  ulong uVar11;
  long *plVar12;
  char *__s2;
  long *plVar13;
  long *plVar14;
  long *plVar15;
  ulong uVar16;
  ulong uVar17;
  
  if (param_1 == 0) {
    pvVar9 = *(void **)this;
    *(undefined8 *)this = 0;
    if (pvVar9 != (void *)0x0) {
      operator_delete(pvVar9);
    }
    *(undefined8 *)(this + 8) = 0;
  }
  else {
    if (param_1 >> 0x3d != 0) {
      this_00 = (logic_error *)__cxa_allocate_exception(0x10);
                    /* try { // try from 008e6d84 to 008e6d8f has its CatchHandler @ 008e6db8 */
      logic_error::logic_error
                (this_00,"allocator<T>::allocate(size_t n) \'n\' exceeds maximum supported size");
      *(undefined ***)this_00 = &PTR__domain_error_00cb0630;
                    /* WARNING: Subroutine does not return */
      __cxa_throw(this_00,&length_error::typeinfo,domain_error::~domain_error);
    }
    pvVar9 = operator_new(param_1 << 3);
    pvVar10 = *(void **)this;
    *(void **)this = pvVar9;
    if (pvVar10 != (void *)0x0) {
      operator_delete(pvVar10);
    }
    uVar11 = 0;
    *(ulong *)(this + 8) = param_1;
    do {
      *(undefined8 *)(*(long *)this + uVar11 * 8) = 0;
      uVar11 = uVar11 + 1;
    } while (param_1 != uVar11);
    plVar14 = *(long **)(this + 0x10);
    if (plVar14 != (long *)0x0) {
      uVar11 = plVar14[1];
      uVar16 = param_1 - 1;
      if ((uVar16 & param_1) == 0) {
        uVar11 = uVar11 & uVar16;
      }
      else if (param_1 <= uVar11) {
        uVar17 = 0;
        if (param_1 != 0) {
          uVar17 = uVar11 / param_1;
        }
        uVar11 = uVar11 - uVar17 * param_1;
      }
      *(__hash_table<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::hash<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::equal_to<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
        **)(*(long *)this + uVar11 * 8) = this + 0x10;
      for (plVar15 = (long *)*plVar14; plVar15 != (long *)0x0; plVar15 = (long *)*plVar15) {
        uVar17 = plVar15[1];
        if ((uVar16 & param_1) == 0) {
          uVar17 = uVar17 & uVar16;
          if (uVar17 == uVar11) goto LAB_008e6c24;
LAB_008e6c38:
          if (*(long *)(*(long *)this + uVar17 * 8) == 0) {
            *(long **)(*(long *)this + uVar17 * 8) = plVar14;
          }
          else {
            plVar13 = plVar15;
            if ((long *)*plVar15 != (long *)0x0) {
              bVar3 = *(byte *)(plVar15 + 2);
              __n = (ulong)(bVar3 >> 1);
              if ((bVar3 & 1) != 0) {
                __n = plVar15[3];
              }
              plVar7 = (long *)*plVar15;
              do {
                plVar12 = plVar7;
                bVar2 = *(byte *)(plVar12 + 2);
                sVar1 = (ulong)(bVar2 >> 1);
                if ((bVar2 & 1) != 0) {
                  sVar1 = plVar12[3];
                }
                if (__n != sVar1) break;
                __s2 = (char *)plVar12[4];
                __s1 = (char *)((long)plVar15 + 0x11);
                if ((bVar3 & 1) != 0) {
                  __s1 = (char *)plVar15[4];
                }
                if ((bVar2 & 1) == 0) {
                  __s2 = (char *)((long)plVar12 + 0x11);
                }
                pcVar5 = (char *)((long)plVar15 + 0x11);
                sVar1 = -(ulong)(bVar3 >> 1);
                sVar6 = __n;
                if ((bVar3 & 1) == 0) {
                  while (sVar6 != 0) {
                    if (*pcVar5 != *__s2) goto LAB_008e6d18;
                    __s2 = __s2 + 1;
                    sVar1 = sVar1 + 1;
                    pcVar5 = pcVar5 + 1;
                    sVar6 = sVar1;
                  }
                }
                else if ((__n != 0) && (iVar8 = memcmp(__s1,__s2,__n), iVar8 != 0)) break;
                plVar7 = (long *)*plVar12;
                plVar13 = plVar12;
              } while ((long *)*plVar12 != (long *)0x0);
            }
LAB_008e6d18:
            *plVar14 = *plVar13;
            *plVar13 = **(long **)(*(long *)this + uVar17 * 8);
            **(long **)(*(long *)this + uVar17 * 8) = (long)plVar15;
            uVar17 = uVar11;
            plVar15 = plVar14;
          }
        }
        else {
          if (param_1 <= uVar17) {
            uVar4 = 0;
            if (param_1 != 0) {
              uVar4 = uVar17 / param_1;
            }
            uVar17 = uVar17 - uVar4 * param_1;
          }
          if (uVar17 != uVar11) goto LAB_008e6c38;
LAB_008e6c24:
          uVar17 = uVar11;
        }
        plVar14 = plVar15;
        uVar11 = uVar17;
      }
    }
  }
  return;
}

