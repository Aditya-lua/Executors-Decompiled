/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0097f170
 */

/* std::__ndk1::basic_filebuf<char, std::__ndk1::char_traits<char> >::overflow(int) */

void __thiscall
std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::overflow
          (basic_filebuf<char,std::__ndk1::char_traits<char>> *this,int param_1)

{
  long lVar1;
  uint uVar2;
  int iVar3;
  size_t sVar4;
  long *plVar5;
  size_t sVar6;
  bad_cast *this_00;
  void *pvVar7;
  undefined1 *puVar8;
  FILE *__s;
  long lVar9;
  ulong uVar10;
  code *pcVar11;
  void *__ptr;
  long lVar12;
  void *local_80;
  long local_78;
  undefined1 local_6c [4];
  long local_68;
  
  lVar1 = tpidr_el0;
  local_68 = *(long *)(lVar1 + 0x28);
  if (*(long *)(this + 0x78) != 0) {
    if (((byte)this[0x9c] >> 4 & 1) == 0) {
      uVar10 = *(ulong *)(this + 0x60);
      *(undefined8 *)(this + 0x10) = 0;
      *(undefined8 *)(this + 0x18) = 0;
      *(undefined8 *)(this + 0x20) = 0;
      if (uVar10 < 9) {
        *(undefined8 *)(this + 0x28) = 0;
        uVar10 = 0;
        pvVar7 = (void *)0x0;
        *(undefined8 *)(this + 0x38) = 0;
        *(undefined8 *)(this + 0x30) = 0;
      }
      else {
        if (this[0xa2] == (basic_filebuf<char,std::__ndk1::char_traits<char>>)0x0) {
          pvVar7 = *(void **)(this + 0x68);
          uVar10 = *(ulong *)(this + 0x70);
        }
        else {
          pvVar7 = *(void **)(this + 0x40);
        }
        uVar10 = (long)pvVar7 + (uVar10 - 1);
        *(void **)(this + 0x28) = pvVar7;
        *(void **)(this + 0x30) = pvVar7;
        *(ulong *)(this + 0x38) = uVar10;
      }
      *(undefined4 *)(this + 0x9c) = 0x10;
    }
    else {
      pvVar7 = *(void **)(this + 0x28);
      uVar10 = *(ulong *)(this + 0x38);
    }
    puVar8 = *(undefined1 **)(this + 0x30);
    __ptr = pvVar7;
    if (param_1 != -1) {
      if (puVar8 == (undefined1 *)0x0) {
        puVar8 = local_6c;
        *(undefined1 **)(this + 0x28) = puVar8;
        *(undefined1 **)(this + 0x30) = puVar8;
        *(ulong *)(this + 0x38) = (ulong)puVar8 | 1;
      }
      *puVar8 = (char)param_1;
      __ptr = *(void **)(this + 0x28);
      puVar8 = (undefined1 *)(*(long *)(this + 0x30) + 1);
      *(undefined1 **)(this + 0x30) = puVar8;
    }
    sVar6 = (long)puVar8 - (long)__ptr;
    if (sVar6 == 0) {
LAB_0097f2a4:
      iVar3 = 0;
      if (param_1 != -1) {
        iVar3 = param_1;
      }
      goto LAB_0097f390;
    }
    if (this[0xa2] == (basic_filebuf<char,std::__ndk1::char_traits<char>>)0x0) {
      lVar9 = *(long *)(this + 0x40);
      plVar5 = *(long **)(this + 0x80);
      local_78 = lVar9;
      if (plVar5 == (long *)0x0) {
LAB_0097f364:
        this_00 = (bad_cast *)__cxa_allocate_exception(8);
        bad_cast::bad_cast(this_00);
                    /* WARNING: Subroutine does not return */
        __cxa_throw(this_00,&bad_cast::typeinfo,bad_cast::~bad_cast);
      }
      lVar12 = *(long *)(this + 0x60);
      pcVar11 = *(code **)(*plVar5 + 0x18);
      while( true ) {
        uVar2 = (*pcVar11)(plVar5,this + 0x88,__ptr,puVar8,&local_80,lVar9,lVar9 + lVar12,&local_78)
        ;
        __ptr = *(void **)(this + 0x28);
        if (local_80 == __ptr) break;
        if (uVar2 == 3) {
          __s = *(FILE **)(this + 0x78);
          sVar6 = *(long *)(this + 0x30) - (long)__ptr;
          goto LAB_0097f288;
        }
        if ((1 < uVar2) ||
           (sVar4 = local_78 - (long)*(void **)(this + 0x40),
           sVar6 = fwrite(*(void **)(this + 0x40),1,sVar4,*(FILE **)(this + 0x78)), sVar6 != sVar4))
        break;
        if (uVar2 != 1) goto LAB_0097f298;
        puVar8 = *(undefined1 **)(this + 0x30);
        *(void **)(this + 0x28) = local_80;
        *(undefined1 **)(this + 0x38) = puVar8;
        plVar5 = *(long **)(this + 0x80);
        *(undefined1 **)(this + 0x30) = puVar8;
        if (plVar5 == (long *)0x0) goto LAB_0097f364;
        lVar9 = *(long *)(this + 0x40);
        lVar12 = *(long *)(this + 0x60);
        pcVar11 = *(code **)(*plVar5 + 0x18);
        __ptr = local_80;
      }
    }
    else {
      __s = *(FILE **)(this + 0x78);
LAB_0097f288:
      sVar4 = fwrite(__ptr,1,sVar6,__s);
      if (sVar4 == sVar6) {
LAB_0097f298:
        *(void **)(this + 0x30) = pvVar7;
        *(void **)(this + 0x28) = pvVar7;
        *(ulong *)(this + 0x38) = uVar10;
        goto LAB_0097f2a4;
      }
    }
  }
  iVar3 = -1;
LAB_0097f390:
  if (*(long *)(lVar1 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(iVar3);
  }
  return;
}

