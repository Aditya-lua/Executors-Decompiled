/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0097ee64
 */

/* std::__ndk1::basic_filebuf<char, std::__ndk1::char_traits<char> >::underflow() */

void __thiscall
std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::underflow
          (basic_filebuf<char,std::__ndk1::char_traits<char>> *this)

{
  basic_filebuf<char,std::__ndk1::char_traits<char>> *__ptr;
  long lVar1;
  bool bVar2;
  int iVar3;
  size_t sVar4;
  long *plVar5;
  bad_cast *this_00;
  void *__src;
  long lVar6;
  basic_filebuf<char,std::__ndk1::char_traits<char>> *pbVar7;
  byte *pbVar8;
  long lVar9;
  ulong uVar10;
  byte *local_58;
  undefined1 auStack_4c [4];
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  if (*(long *)(this + 0x78) == 0) {
    uVar10 = 0xffffffff;
    goto LAB_0097f0bc;
  }
  if (((byte)this[0x9c] >> 3 & 1) == 0) {
    *(undefined8 *)(this + 0x28) = 0;
    *(undefined8 *)(this + 0x30) = 0;
    lVar6 = 0x70;
    if (this[0xa2] != (basic_filebuf<char,std::__ndk1::char_traits<char>>)0x0) {
      lVar6 = 0x60;
    }
    *(undefined8 *)(this + 0x38) = 0;
    lVar9 = 0x68;
    if (this[0xa2] != (basic_filebuf<char,std::__ndk1::char_traits<char>>)0x0) {
      lVar9 = 0x40;
    }
    lVar9 = *(long *)(this + lVar9);
    lVar6 = *(long *)(this + lVar6);
    *(undefined4 *)(this + 0x9c) = 8;
    bVar2 = true;
    pbVar8 = (byte *)(lVar9 + lVar6);
    *(long *)(this + 0x10) = lVar9;
    *(byte **)(this + 0x18) = pbVar8;
    *(byte **)(this + 0x20) = pbVar8;
    if (pbVar8 != (byte *)0x0) goto LAB_0097eee8;
LAB_0097ef1c:
    pbVar8 = (byte *)((ulong)auStack_4c | 1);
    *(undefined1 **)(this + 0x10) = auStack_4c;
    *(byte **)(this + 0x18) = pbVar8;
    *(byte **)(this + 0x20) = pbVar8;
    if (!bVar2) goto LAB_0097ef30;
LAB_0097eeec:
    uVar10 = 0;
    if (pbVar8 != *(byte **)(this + 0x20)) goto LAB_0097eefc;
LAB_0097ef5c:
    memmove(*(void **)(this + 0x10),pbVar8 + -uVar10,uVar10);
    if (this[0xa2] == (basic_filebuf<char,std::__ndk1::char_traits<char>>)0x0) {
      __src = *(void **)(this + 0x48);
      lVar6 = *(long *)(this + 0x50);
      if (lVar6 - (long)__src != 0) {
        memmove(*(void **)(this + 0x40),__src,lVar6 - (long)__src);
        __src = *(void **)(this + 0x48);
        lVar6 = *(long *)(this + 0x50);
      }
      pbVar7 = *(basic_filebuf<char,std::__ndk1::char_traits<char>> **)(this + 0x40);
      __ptr = pbVar7 + (lVar6 - (long)__src);
      *(basic_filebuf<char,std::__ndk1::char_traits<char>> **)(this + 0x48) = __ptr;
      if (pbVar7 == this + 0x58) {
        lVar6 = 8;
      }
      else {
        lVar6 = *(long *)(this + 0x60);
      }
      sVar4 = (long)(pbVar7 + lVar6) - (long)__ptr;
      *(basic_filebuf<char,std::__ndk1::char_traits<char>> **)(this + 0x50) = pbVar7 + lVar6;
      *(undefined8 *)(this + 0x90) = *(undefined8 *)(this + 0x88);
      if (*(long *)(this + 0x70) - uVar10 <= sVar4) {
        sVar4 = *(long *)(this + 0x70) - uVar10;
      }
      sVar4 = fread(__ptr,1,sVar4,*(FILE **)(this + 0x78));
      if (sVar4 == 0) goto LAB_0097f0a0;
      plVar5 = *(long **)(this + 0x80);
      if (plVar5 == (long *)0x0) {
        this_00 = (bad_cast *)__cxa_allocate_exception(8);
        bad_cast::bad_cast(this_00);
                    /* WARNING: Subroutine does not return */
        __cxa_throw(this_00,&bad_cast::typeinfo,bad_cast::~bad_cast);
      }
      *(size_t *)(this + 0x50) = *(long *)(this + 0x48) + sVar4;
      iVar3 = (**(code **)(*plVar5 + 0x20))
                        (plVar5,this + 0x88,*(undefined8 *)(this + 0x40),
                         *(long *)(this + 0x48) + sVar4,this + 0x48,*(long *)(this + 0x10) + uVar10,
                         *(long *)(this + 0x10) + *(long *)(this + 0x70),&local_58);
      if (iVar3 == 3) {
        pbVar8 = *(byte **)(this + 0x40);
        local_58 = *(byte **)(this + 0x50);
        *(byte **)(this + 0x10) = pbVar8;
      }
      else {
        pbVar8 = (byte *)(*(long *)(this + 0x10) + uVar10);
        if (local_58 == pbVar8) goto LAB_0097f0a0;
      }
LAB_0097f094:
      *(byte **)(this + 0x18) = pbVar8;
      *(byte **)(this + 0x20) = local_58;
      uVar10 = (ulong)*pbVar8;
    }
    else {
      sVar4 = fread((void *)(*(long *)(this + 0x10) + uVar10),1,
                    (*(long *)(this + 0x20) - uVar10) - *(long *)(this + 0x10),
                    *(FILE **)(this + 0x78));
      if (sVar4 != 0) {
        pbVar8 = (byte *)(*(long *)(this + 0x10) + uVar10);
        local_58 = pbVar8 + sVar4;
        goto LAB_0097f094;
      }
LAB_0097f0a0:
      uVar10 = 0xffffffff;
    }
  }
  else {
    pbVar8 = *(byte **)(this + 0x18);
    bVar2 = false;
    if (pbVar8 == (byte *)0x0) goto LAB_0097ef1c;
LAB_0097eee8:
    if (bVar2) goto LAB_0097eeec;
LAB_0097ef30:
    lVar6 = (long)*(byte **)(this + 0x20) - *(long *)(this + 0x10);
    if (lVar6 < 0) {
      lVar6 = lVar6 + 1;
    }
    uVar10 = lVar6 >> 1;
    if (3 < uVar10) {
      uVar10 = 4;
    }
    if (pbVar8 == *(byte **)(this + 0x20)) goto LAB_0097ef5c;
LAB_0097eefc:
    uVar10 = (ulong)*pbVar8;
  }
  if (*(undefined1 **)(this + 0x10) == auStack_4c) {
    *(undefined8 *)(this + 0x10) = 0;
    *(undefined8 *)(this + 0x18) = 0;
    *(undefined8 *)(this + 0x20) = 0;
  }
LAB_0097f0bc:
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar10);
  }
  return;
}

