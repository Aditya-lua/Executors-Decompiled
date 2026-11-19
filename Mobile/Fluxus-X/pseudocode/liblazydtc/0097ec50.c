/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0097ec50
 */

/* std::__ndk1::basic_filebuf<char, std::__ndk1::char_traits<char> >::sync() */

undefined8 __thiscall
std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::sync
          (basic_filebuf<char,std::__ndk1::char_traits<char>> *this)

{
  long lVar1;
  bool bVar2;
  int iVar3;
  size_t sVar4;
  bad_cast *this_00;
  long lVar5;
  undefined8 uVar6;
  size_t __n;
  long local_50;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  if (*(long *)(this + 0x78) != 0) {
    if (*(long **)(this + 0x80) == (long *)0x0) {
      this_00 = (bad_cast *)__cxa_allocate_exception(8);
      bad_cast::bad_cast(this_00);
                    /* WARNING: Subroutine does not return */
      __cxa_throw(this_00,&bad_cast::typeinfo,bad_cast::~bad_cast);
    }
    if ((*(uint *)(this + 0x9c) >> 4 & 1) == 0) {
      if ((*(uint *)(this + 0x9c) >> 3 & 1) != 0) {
        local_50 = *(long *)(this + 0x90);
        if (this[0xa2] == (basic_filebuf<char,std::__ndk1::char_traits<char>>)0x0) {
          iVar3 = (**(code **)(**(long **)(this + 0x80) + 0x30))();
          lVar5 = *(long *)(this + 0x50) - *(long *)(this + 0x48);
          if (iVar3 < 1) {
            if (*(long *)(this + 0x18) == *(long *)(this + 0x20)) {
              bVar2 = false;
            }
            else {
              iVar3 = (**(code **)(**(long **)(this + 0x80) + 0x40))
                                (*(long **)(this + 0x80),&local_50,*(undefined8 *)(this + 0x40),
                                 *(long *)(this + 0x48),
                                 *(long *)(this + 0x18) - *(long *)(this + 0x10));
              bVar2 = true;
              lVar5 = ((*(long *)(this + 0x48) + lVar5) - (long)iVar3) - *(long *)(this + 0x40);
            }
          }
          else {
            bVar2 = false;
            lVar5 = lVar5 + (*(long *)(this + 0x20) - *(long *)(this + 0x18)) * (long)iVar3;
          }
        }
        else {
          bVar2 = false;
          lVar5 = *(long *)(this + 0x20) - *(long *)(this + 0x18);
        }
        iVar3 = fseeko(*(FILE **)(this + 0x78),-lVar5,1);
        if (iVar3 != 0) goto LAB_0097ede0;
        if (bVar2) {
          *(long *)(this + 0x88) = local_50;
        }
        *(undefined4 *)(this + 0x9c) = 0;
        *(undefined8 *)(this + 0x18) = 0;
        *(undefined8 *)(this + 0x20) = 0;
        *(undefined8 *)(this + 0x10) = 0;
        *(undefined8 *)(this + 0x48) = *(undefined8 *)(this + 0x40);
        *(undefined8 *)(this + 0x50) = *(undefined8 *)(this + 0x40);
      }
    }
    else {
      if (*(long *)(this + 0x30) != *(long *)(this + 0x28)) {
        uVar6 = 0xffffffff;
        iVar3 = (**(code **)(*(long *)this + 0x68))(this,0xffffffff);
        if (iVar3 == -1) goto LAB_0097ee0c;
      }
      do {
        iVar3 = (**(code **)(**(long **)(this + 0x80) + 0x28))
                          (*(long **)(this + 0x80),this + 0x88,*(long *)(this + 0x40),
                           *(long *)(this + 0x40) + *(long *)(this + 0x60),&local_50);
        __n = local_50 - (long)*(void **)(this + 0x40);
        sVar4 = fwrite(*(void **)(this + 0x40),1,__n,*(FILE **)(this + 0x78));
        if (sVar4 != __n) goto LAB_0097ede0;
      } while (iVar3 == 1);
      if ((iVar3 == 2) || (iVar3 = fflush(*(FILE **)(this + 0x78)), iVar3 != 0)) {
LAB_0097ede0:
        uVar6 = 0xffffffff;
        goto LAB_0097ee0c;
      }
    }
  }
  uVar6 = 0;
LAB_0097ee0c:
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar6;
}

