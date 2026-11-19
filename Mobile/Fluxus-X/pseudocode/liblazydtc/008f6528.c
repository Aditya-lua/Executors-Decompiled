/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f6528
 */

/* std::__ndk1::__split_buffer<std::__ndk1::function<void ()>*,
   std::__ndk1::allocator<std::__ndk1::function<void ()>*>&>::push_back(std::__ndk1::function<void
   ()>*&&) */

void __thiscall
std::__ndk1::
__split_buffer<std::__ndk1::function<void()>*,std::__ndk1::allocator<std::__ndk1::function<void()>*>&>
::push_back(__split_buffer<std::__ndk1::function<void()>*,std::__ndk1::allocator<std::__ndk1::function<void()>*>&>
            *this,function **param_1)

{
  long lVar1;
  ulong uVar2;
  undefined8 *puVar3;
  size_t __n;
  undefined8 *puVar4;
  void *pvVar5;
  logic_error *this_00;
  long lVar6;
  ulong uVar7;
  undefined8 *puVar8;
  ulong uVar9;
  undefined8 *puVar10;
  ulong uVar11;
  ulong uVar12;
  undefined8 *puVar13;
  ulong uVar14;
  undefined8 *puVar15;
  undefined8 *puVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  
  puVar16 = *(undefined8 **)(this + 0x10);
  if (puVar16 != *(undefined8 **)(this + 0x18)) goto LAB_008f66b0;
  puVar15 = *(undefined8 **)this;
  puVar8 = *(undefined8 **)(this + 8);
  if (puVar15 <= puVar8 && (long)puVar8 - (long)puVar15 != 0) {
    lVar6 = (long)puVar8 - (long)puVar15 >> 3;
    lVar1 = lVar6 + 2;
    if (-1 < lVar6 + 1) {
      lVar1 = lVar6 + 1;
    }
    __n = (long)puVar16 - (long)puVar8;
    puVar16 = puVar8 + -(lVar1 >> 1);
    if (__n == 0) {
      puVar8 = puVar16;
    }
    else {
      memmove(puVar16,puVar8,__n);
      puVar8 = (undefined8 *)(*(long *)(this + 8) + (lVar1 >> 1) * -8);
    }
    puVar16 = puVar16 + ((long)__n >> 3);
    *(undefined8 **)(this + 8) = puVar8;
    *(undefined8 **)(this + 0x10) = puVar16;
    goto LAB_008f66b0;
  }
  lVar1 = (long)*(undefined8 **)(this + 0x18) - (long)puVar15;
  uVar7 = lVar1 >> 2;
  if (lVar1 == 0) {
    uVar7 = 1;
  }
  if (uVar7 == 0) {
    pvVar5 = (void *)0x0;
  }
  else {
    if (uVar7 >> 0x3d != 0) {
      this_00 = (logic_error *)__cxa_allocate_exception(0x10);
                    /* try { // try from 008f66e4 to 008f66ef has its CatchHandler @ 008f6718 */
      logic_error::logic_error
                (this_00,"allocator<T>::allocate(size_t n) \'n\' exceeds maximum supported size");
      *(undefined ***)this_00 = &PTR__domain_error_00cb0630;
                    /* WARNING: Subroutine does not return */
      __cxa_throw(this_00,&length_error::typeinfo,domain_error::~domain_error);
    }
    pvVar5 = operator_new(uVar7 << 3);
  }
  uVar9 = uVar7 >> 2;
  puVar3 = (undefined8 *)((long)pvVar5 + uVar9 * 8);
  if (puVar8 == puVar16) {
    puVar16 = puVar3;
  }
  else {
    uVar11 = (ulong)((long)puVar16 + (-8 - (long)puVar8)) >> 3;
    uVar2 = uVar11 + 1;
    puVar15 = puVar3;
    if (uVar2 < 4) {
LAB_008f6680:
      do {
        puVar13 = puVar8 + 1;
        *puVar15 = *puVar8;
        puVar15 = puVar15 + 1;
        puVar8 = puVar13;
      } while (puVar16 != puVar13);
    }
    else {
      if ((puVar3 < puVar8 + uVar11 + 1) &&
         (puVar8 < (undefined8 *)((long)pvVar5 + (uVar9 + uVar11) * 8 + 8))) goto LAB_008f6680;
      uVar12 = uVar2 & 0x3ffffffffffffffc;
      puVar13 = puVar8 + 2;
      puVar15 = puVar3 + uVar12;
      puVar8 = puVar8 + uVar12;
      puVar10 = (undefined8 *)((long)pvVar5 + uVar9 * 8 + 0x10);
      uVar14 = uVar12;
      do {
        puVar4 = puVar13 + -1;
        uVar17 = puVar13[-2];
        uVar19 = puVar13[1];
        uVar18 = *puVar13;
        puVar13 = puVar13 + 4;
        uVar14 = uVar14 - 4;
        puVar10[-1] = *puVar4;
        puVar10[-2] = uVar17;
        puVar10[1] = uVar19;
        *puVar10 = uVar18;
        puVar10 = puVar10 + 4;
      } while (uVar14 != 0);
      if (uVar2 != uVar12) goto LAB_008f6680;
    }
    puVar15 = *(undefined8 **)this;
    puVar16 = (undefined8 *)((long)pvVar5 + (uVar9 + uVar11 + 1) * 8);
  }
  *(void **)this = pvVar5;
  *(undefined8 **)(this + 8) = puVar3;
  *(undefined8 **)(this + 0x10) = puVar16;
  *(void **)(this + 0x18) = (void *)((long)pvVar5 + uVar7 * 8);
  if (puVar15 != (undefined8 *)0x0) {
    operator_delete(puVar15);
    puVar16 = *(undefined8 **)(this + 0x10);
  }
LAB_008f66b0:
  *puVar16 = *param_1;
  *(long *)(this + 0x10) = *(long *)(this + 0x10) + 8;
  return;
}

