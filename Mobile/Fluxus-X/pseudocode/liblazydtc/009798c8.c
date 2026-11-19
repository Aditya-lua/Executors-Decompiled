/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009798c8
 */

/* std::__ndk1::__split_buffer<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,
   std::__ndk1::function<void (std::__ndk1::shared_ptr<ix::HttpResponse> const&)> >*,
   std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,
   std::__ndk1::function<void (std::__ndk1::shared_ptr<ix::HttpResponse> const&)> >*>
   >::push_front(std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,
   std::__ndk1::function<void (std::__ndk1::shared_ptr<ix::HttpResponse> const&)> >*&&) */

void __thiscall
std::__ndk1::
__split_buffer<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>*,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>*>>
::push_front(__split_buffer<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>*,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>*>>
             *this,pair **param_1)

{
  long lVar1;
  ulong uVar2;
  size_t __n;
  undefined8 *puVar3;
  void *pvVar4;
  logic_error *this_00;
  long lVar5;
  ulong uVar6;
  undefined8 *puVar7;
  undefined8 *puVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  undefined8 *puVar12;
  undefined8 *puVar13;
  ulong uVar14;
  undefined8 *__src;
  undefined8 *puVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  
  __src = *(undefined8 **)(this + 8);
  if (__src != *(undefined8 **)this) {
    puVar15 = __src;
    goto LAB_00979a60;
  }
  puVar7 = *(undefined8 **)(this + 0x10);
  puVar15 = *(undefined8 **)(this + 0x18);
  if (puVar7 < puVar15) {
    lVar5 = (long)puVar15 - (long)puVar7 >> 3;
    lVar1 = lVar5 + 2;
    if (-1 < lVar5 + 1) {
      lVar1 = lVar5 + 1;
    }
    __n = (long)puVar7 - (long)__src;
    puVar7 = puVar7 + (lVar1 >> 1);
    if (__n == 0) {
      puVar15 = puVar7;
    }
    else {
      puVar15 = (undefined8 *)((long)puVar7 - __n);
      memmove(puVar15,__src,__n);
      puVar7 = (undefined8 *)(*(long *)(this + 0x10) + (lVar1 >> 1) * 8);
    }
    *(undefined8 **)(this + 8) = puVar15;
    *(undefined8 **)(this + 0x10) = puVar7;
    goto LAB_00979a60;
  }
  lVar1 = (long)puVar15 - (long)*(undefined8 **)this;
  uVar6 = lVar1 >> 2;
  if (lVar1 == 0) {
    uVar6 = 1;
  }
  if (uVar6 == 0) {
    pvVar4 = (void *)0x0;
  }
  else {
    if (uVar6 >> 0x3d != 0) {
      this_00 = (logic_error *)__cxa_allocate_exception(0x10);
                    /* try { // try from 00979a98 to 00979aa3 has its CatchHandler @ 00979acc */
      logic_error::logic_error
                (this_00,"allocator<T>::allocate(size_t n) \'n\' exceeds maximum supported size");
      *(undefined ***)this_00 = &PTR__domain_error_00cb0630;
                    /* WARNING: Subroutine does not return */
      __cxa_throw(this_00,&length_error::typeinfo,domain_error::~domain_error);
    }
    pvVar4 = operator_new(uVar6 << 3);
  }
  uVar11 = uVar6 + 3 >> 2;
  puVar15 = (undefined8 *)((long)pvVar4 + uVar11 * 8);
  if (__src == puVar7) {
    puVar7 = puVar15;
  }
  else {
    uVar9 = (ulong)((long)puVar7 + (-8 - (long)__src)) >> 3;
    uVar2 = uVar9 + 1;
    puVar8 = puVar15;
    if (uVar2 < 4) {
LAB_00979a30:
      do {
        puVar13 = __src + 1;
        *puVar8 = *__src;
        puVar8 = puVar8 + 1;
        __src = puVar13;
      } while (puVar7 != puVar13);
    }
    else {
      if ((puVar15 < __src + uVar9 + 1) &&
         (__src < (undefined8 *)((long)pvVar4 + (uVar9 + uVar11) * 8 + 8))) goto LAB_00979a30;
      uVar10 = uVar2 & 0x3ffffffffffffffc;
      puVar13 = __src + 2;
      puVar8 = puVar15 + uVar10;
      __src = __src + uVar10;
      puVar12 = (undefined8 *)((long)pvVar4 + uVar11 * 8 + 0x10);
      uVar14 = uVar10;
      do {
        puVar3 = puVar13 + -1;
        uVar16 = puVar13[-2];
        uVar18 = puVar13[1];
        uVar17 = *puVar13;
        puVar13 = puVar13 + 4;
        uVar14 = uVar14 - 4;
        puVar12[-1] = *puVar3;
        puVar12[-2] = uVar16;
        puVar12[1] = uVar18;
        *puVar12 = uVar17;
        puVar12 = puVar12 + 4;
      } while (uVar14 != 0);
      if (uVar2 != uVar10) goto LAB_00979a30;
    }
    __src = *(undefined8 **)this;
    puVar7 = (undefined8 *)((long)pvVar4 + (uVar9 + uVar11 + 1) * 8);
  }
  *(void **)this = pvVar4;
  *(undefined8 **)(this + 8) = puVar15;
  *(undefined8 **)(this + 0x10) = puVar7;
  *(void **)(this + 0x18) = (void *)((long)pvVar4 + uVar6 * 8);
  if (__src != (undefined8 *)0x0) {
    operator_delete(__src);
    puVar15 = *(undefined8 **)(this + 8);
  }
LAB_00979a60:
  puVar15[-1] = *param_1;
  *(long *)(this + 8) = *(long *)(this + 8) + -8;
  return;
}

