/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0097919c
 */

/* std::__ndk1::deque<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,
   std::__ndk1::function<void (std::__ndk1::shared_ptr<ix::HttpResponse> const&)> >,
   std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,
   std::__ndk1::function<void (std::__ndk1::shared_ptr<ix::HttpResponse> const&)> > >
   >::__add_back_capacity() */

void __thiscall
std::__ndk1::
deque<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>>>
::__add_back_capacity
          (deque<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>>>
           *this)

{
  long lVar1;
  pair **pppVar2;
  size_t __n;
  long lVar3;
  undefined8 *puVar4;
  void *pvVar5;
  pair *ppVar6;
  logic_error *this_00;
  long lVar7;
  ulong uVar8;
  pair **pppVar9;
  undefined8 *puVar10;
  void *pvVar11;
  undefined8 *puVar12;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  undefined8 *puVar16;
  pair **pppVar17;
  undefined8 *__src;
  undefined8 *puVar18;
  undefined8 uVar19;
  undefined8 *puVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  pair *local_88;
  pair *local_80;
  pair *ppStack_78;
  pair *local_70;
  pair *ppStack_68;
  deque<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>>>
  *pdStack_60;
  long local_58;
  
  lVar3 = tpidr_el0;
  local_58 = *(long *)(lVar3 + 0x28);
  if (*(ulong *)(this + 0x20) < 0x40) {
    uVar8 = *(long *)(this + 0x10) - *(long *)(this + 8) >> 3;
    lVar7 = *(long *)(this + 0x18) - *(long *)this;
    if ((ulong)(lVar7 >> 3) <= uVar8) {
      uVar13 = lVar7 >> 2;
      pdStack_60 = this + 0x18;
      if (lVar7 == 0) {
        uVar13 = 1;
      }
      ppStack_68 = (pair *)0x0;
      if (uVar13 == 0) {
        local_80 = (pair *)0x0;
      }
      else {
        if (uVar13 >> 0x3d != 0) {
          this_00 = (logic_error *)__cxa_allocate_exception(0x10);
                    /* try { // try from 009795e4 to 009795ef has its CatchHandler @ 00979658 */
          logic_error::logic_error
                    (this_00,"allocator<T>::allocate(size_t n) \'n\' exceeds maximum supported size"
                    );
LAB_0097960c:
          *(undefined ***)this_00 = &PTR__domain_error_00cb0630;
                    /* WARNING: Subroutine does not return */
          __cxa_throw(this_00,&length_error::typeinfo,domain_error::~domain_error);
        }
        local_80 = operator_new(uVar13 << 3);
      }
      ppStack_78 = local_80 + uVar8 * 8;
      ppStack_68 = local_80 + uVar13 * 8;
      local_70 = ppStack_78;
                    /* try { // try from 0097934c to 00979353 has its CatchHandler @ 0097967c */
      local_88 = operator_new(0x1000);
                    /* try { // try from 0097935c to 00979367 has its CatchHandler @ 0097966c */
      __split_buffer<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>*,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>*>&>
      ::push_back((__split_buffer<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>*,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>*>&>
                   *)&local_80,&local_88);
      pppVar17 = *(pair ***)(this + 0x10);
      while (pppVar9 = *(pair ***)(this + 8), pppVar17 != pppVar9) {
        pppVar17 = pppVar17 + -1;
                    /* try { // try from 0097937c to 00979387 has its CatchHandler @ 00979680 */
        __split_buffer<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>*,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>*>&>
        ::push_front((__split_buffer<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>*,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>*>&>
                      *)&local_80,pppVar17);
      }
      ppVar6 = *(pair **)this;
      *(pair **)(this + 8) = ppStack_78;
      *(pair **)this = local_80;
      pppVar2 = *(pair ***)(this + 0x10);
      uVar19 = *(undefined8 *)(this + 0x18);
      *(pair **)(this + 0x18) = ppStack_68;
      *(pair **)(this + 0x10) = local_70;
      local_70 = (pair *)pppVar2;
      if (pppVar2 != pppVar17) {
        local_70 = (pair *)((long)pppVar2 +
                           (~((long)pppVar2 + (-8 - (long)pppVar9)) & 0xfffffffffffffff8U));
      }
      local_80 = ppVar6;
      ppStack_78 = (pair *)pppVar9;
      ppStack_68 = (pair *)uVar19;
      if (ppVar6 != (pair *)0x0) {
        operator_delete(ppVar6);
      }
      goto LAB_0097952c;
    }
    if (*(long *)(this + 0x18) != *(long *)(this + 0x10)) {
      local_80 = operator_new(0x1000);
      __split_buffer<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>*,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>*>>
      ::push_back((__split_buffer<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>*,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>*>>
                   *)this,&local_80);
      goto LAB_0097952c;
    }
    local_80 = operator_new(0x1000);
    __split_buffer<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>*,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>*>>
    ::push_front((__split_buffer<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>*,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>*>>
                  *)this,&local_80);
    puVar10 = *(undefined8 **)(this + 8);
    puVar20 = *(undefined8 **)(this + 0x10);
    __src = puVar10 + 1;
    uVar19 = *puVar10;
    *(undefined8 **)(this + 8) = __src;
    if (puVar20 == *(undefined8 **)(this + 0x18)) {
      puVar18 = *(undefined8 **)this;
      lVar7 = (long)__src - (long)puVar18;
      if (__src < puVar18 || lVar7 == 0) {
        lVar7 = (long)*(undefined8 **)(this + 0x18) - (long)puVar18;
        uVar8 = lVar7 >> 2;
        if (lVar7 == 0) {
          uVar8 = 1;
        }
        if (uVar8 == 0) {
          pvVar5 = (void *)0x0;
        }
        else {
          if (uVar8 >> 0x3d != 0) {
            this_00 = (logic_error *)__cxa_allocate_exception(0x10);
                    /* try { // try from 00979640 to 0097964b has its CatchHandler @ 00979650 */
            logic_error::logic_error
                      (this_00,
                       "allocator<T>::allocate(size_t n) \'n\' exceeds maximum supported size");
            goto LAB_0097960c;
          }
          pvVar5 = operator_new(uVar8 << 3);
        }
        uVar13 = uVar8 >> 2;
        puVar12 = (undefined8 *)((long)pvVar5 + uVar13 * 8);
        pvVar11 = (void *)((long)pvVar5 + uVar8 * 8);
        if (__src == puVar20) goto LAB_00979500;
        uVar14 = (ulong)((long)puVar20 + (-0x10 - (long)puVar10)) >> 3;
        uVar8 = uVar14 + 1;
        lVar7 = ((ulong)((long)puVar20 + (-8 - (long)__src)) >> 3) + 1;
        puVar18 = puVar12;
        if (uVar8 < 4) {
        }
        else if ((puVar10 + uVar14 + 2 <= puVar12) ||
                ((undefined8 *)((long)pvVar5 + (uVar13 + uVar14) * 8 + 8) <= __src)) {
          uVar15 = uVar8 & 0x3ffffffffffffffc;
          puVar10 = puVar10 + 3;
          puVar18 = puVar12 + uVar15;
          __src = __src + uVar15;
          puVar16 = (undefined8 *)((long)pvVar5 + uVar13 * 8 + 0x10);
          uVar14 = uVar15;
          do {
            puVar4 = puVar10 + -1;
            uVar21 = puVar10[-2];
            uVar23 = puVar10[1];
            uVar22 = *puVar10;
            puVar10 = puVar10 + 4;
            uVar14 = uVar14 - 4;
            puVar16[-1] = *puVar4;
            puVar16[-2] = uVar21;
            puVar16[1] = uVar23;
            *puVar16 = uVar22;
            puVar16 = puVar16 + 4;
          } while (uVar14 != 0);
          if (uVar8 == uVar15) goto LAB_009794a8;
        }
        do {
          puVar10 = __src + 1;
          *puVar18 = *__src;
          puVar18 = puVar18 + 1;
          __src = puVar10;
        } while (puVar20 != puVar10);
        goto LAB_009794a8;
      }
      goto LAB_00979200;
    }
  }
  else {
    puVar10 = *(undefined8 **)(this + 8);
    puVar20 = *(undefined8 **)(this + 0x10);
    *(ulong *)(this + 0x20) = *(ulong *)(this + 0x20) - 0x40;
    __src = puVar10 + 1;
    uVar19 = *puVar10;
    *(undefined8 **)(this + 8) = __src;
    if (puVar20 == *(undefined8 **)(this + 0x18)) {
      puVar18 = *(undefined8 **)this;
      lVar7 = (long)__src - (long)puVar18;
      if (__src < puVar18 || lVar7 == 0) {
        lVar7 = (long)*(undefined8 **)(this + 0x18) - (long)puVar18;
        uVar8 = lVar7 >> 2;
        if (lVar7 == 0) {
          uVar8 = 1;
        }
        if (uVar8 == 0) {
          pvVar5 = (void *)0x0;
        }
        else {
          if (uVar8 >> 0x3d != 0) {
            this_00 = (logic_error *)__cxa_allocate_exception(0x10);
                    /* try { // try from 00979600 to 0097960b has its CatchHandler @ 00979654 */
            logic_error::logic_error
                      (this_00,
                       "allocator<T>::allocate(size_t n) \'n\' exceeds maximum supported size");
            goto LAB_0097960c;
          }
          pvVar5 = operator_new(uVar8 << 3);
        }
        uVar13 = uVar8 >> 2;
        puVar12 = (undefined8 *)((long)pvVar5 + uVar13 * 8);
        pvVar11 = (void *)((long)pvVar5 + uVar8 * 8);
        if (__src == puVar20) {
LAB_00979500:
          puVar20 = puVar12;
        }
        else {
          uVar14 = (ulong)((long)puVar20 + (-0x10 - (long)puVar10)) >> 3;
          uVar8 = uVar14 + 1;
          lVar7 = ((ulong)((long)puVar20 + (-8 - (long)__src)) >> 3) + 1;
          puVar18 = puVar12;
          if (uVar8 < 4) {
          }
          else if ((puVar10 + uVar14 + 2 <= puVar12) ||
                  ((undefined8 *)((long)pvVar5 + (uVar13 + uVar14) * 8 + 8) <= __src)) {
            uVar15 = uVar8 & 0x3ffffffffffffffc;
            puVar10 = puVar10 + 3;
            puVar18 = puVar12 + uVar15;
            __src = __src + uVar15;
            puVar16 = (undefined8 *)((long)pvVar5 + uVar13 * 8 + 0x10);
            uVar14 = uVar15;
            do {
              puVar4 = puVar10 + -1;
              uVar21 = puVar10[-2];
              uVar23 = puVar10[1];
              uVar22 = *puVar10;
              puVar10 = puVar10 + 4;
              uVar14 = uVar14 - 4;
              puVar16[-1] = *puVar4;
              puVar16[-2] = uVar21;
              puVar16[1] = uVar23;
              *puVar16 = uVar22;
              puVar16 = puVar16 + 4;
            } while (uVar14 != 0);
            if (uVar8 == uVar15) goto LAB_009794a8;
          }
          do {
            puVar10 = __src + 1;
            *puVar18 = *__src;
            puVar18 = puVar18 + 1;
            __src = puVar10;
          } while (puVar20 != puVar10);
LAB_009794a8:
          puVar18 = *(undefined8 **)this;
          puVar20 = (undefined8 *)((long)pvVar5 + (lVar7 + uVar13) * 8);
        }
        *(void **)this = pvVar5;
        *(undefined8 **)(this + 8) = puVar12;
        *(undefined8 **)(this + 0x10) = puVar20;
        *(void **)(this + 0x18) = pvVar11;
        if (puVar18 != (undefined8 *)0x0) {
          operator_delete(puVar18);
          puVar20 = *(undefined8 **)(this + 0x10);
        }
      }
      else {
LAB_00979200:
        lVar7 = lVar7 >> 3;
        lVar1 = lVar7 + 2;
        if (-1 < lVar7 + 1) {
          lVar1 = lVar7 + 1;
        }
        __n = (long)puVar20 - (long)__src;
        puVar20 = __src + -(lVar1 >> 1);
        if (__n == 0) {
          puVar10 = puVar20;
        }
        else {
          memmove(puVar20,__src,__n);
          puVar10 = (undefined8 *)(*(long *)(this + 8) + (lVar1 >> 1) * -8);
        }
        puVar20 = puVar20 + ((long)__n >> 3);
        *(undefined8 **)(this + 8) = puVar10;
        *(undefined8 **)(this + 0x10) = puVar20;
      }
    }
  }
  *puVar20 = uVar19;
  *(long *)(this + 0x10) = *(long *)(this + 0x10) + 8;
LAB_0097952c:
  if (*(long *)(lVar3 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

