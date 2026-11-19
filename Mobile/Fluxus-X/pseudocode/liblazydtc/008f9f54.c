/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f9f54
 */

/* std::__ndk1::deque<std::__ndk1::shared_ptr<cpr::Interceptor>,
   std::__ndk1::allocator<std::__ndk1::shared_ptr<cpr::Interceptor> > >::__add_back_capacity() */

void __thiscall
std::__ndk1::
deque<std::__ndk1::shared_ptr<cpr::Interceptor>,std::__ndk1::allocator<std::__ndk1::shared_ptr<cpr::Interceptor>>>
::__add_back_capacity
          (deque<std::__ndk1::shared_ptr<cpr::Interceptor>,std::__ndk1::allocator<std::__ndk1::shared_ptr<cpr::Interceptor>>>
           *this)

{
  long lVar1;
  shared_ptr **ppsVar2;
  size_t __n;
  long lVar3;
  undefined8 *puVar4;
  void *pvVar5;
  shared_ptr *psVar6;
  logic_error *this_00;
  long lVar7;
  ulong uVar8;
  shared_ptr **ppsVar9;
  undefined8 *puVar10;
  void *pvVar11;
  undefined8 *puVar12;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  undefined8 *puVar16;
  shared_ptr **ppsVar17;
  undefined8 *__src;
  undefined8 *puVar18;
  undefined8 uVar19;
  undefined8 *puVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  shared_ptr *local_88;
  shared_ptr *local_80;
  shared_ptr *psStack_78;
  shared_ptr *local_70;
  shared_ptr *psStack_68;
  deque<std::__ndk1::shared_ptr<cpr::Interceptor>,std::__ndk1::allocator<std::__ndk1::shared_ptr<cpr::Interceptor>>>
  *pdStack_60;
  long local_58;
  
  lVar3 = tpidr_el0;
  local_58 = *(long *)(lVar3 + 0x28);
  if (*(ulong *)(this + 0x20) < 0x100) {
    uVar8 = *(long *)(this + 0x10) - *(long *)(this + 8) >> 3;
    lVar7 = *(long *)(this + 0x18) - *(long *)this;
    if ((ulong)(lVar7 >> 3) <= uVar8) {
      uVar13 = lVar7 >> 2;
      pdStack_60 = this + 0x18;
      if (lVar7 == 0) {
        uVar13 = 1;
      }
      psStack_68 = (shared_ptr *)0x0;
      if (uVar13 == 0) {
        local_80 = (shared_ptr *)0x0;
      }
      else {
        if (uVar13 >> 0x3d != 0) {
          this_00 = (logic_error *)__cxa_allocate_exception(0x10);
                    /* try { // try from 008fa39c to 008fa3a7 has its CatchHandler @ 008fa410 */
          logic_error::logic_error
                    (this_00,"allocator<T>::allocate(size_t n) \'n\' exceeds maximum supported size"
                    );
LAB_008fa3c4:
          *(undefined ***)this_00 = &PTR__domain_error_00cb0630;
                    /* WARNING: Subroutine does not return */
          __cxa_throw(this_00,&length_error::typeinfo,domain_error::~domain_error);
        }
        local_80 = operator_new(uVar13 << 3);
      }
      psStack_78 = local_80 + uVar8 * 8;
      psStack_68 = local_80 + uVar13 * 8;
      local_70 = psStack_78;
                    /* try { // try from 008fa104 to 008fa10b has its CatchHandler @ 008fa434 */
      local_88 = operator_new(0x1000);
                    /* try { // try from 008fa114 to 008fa11f has its CatchHandler @ 008fa424 */
      __split_buffer<std::__ndk1::shared_ptr<cpr::Interceptor>*,std::__ndk1::allocator<std::__ndk1::shared_ptr<cpr::Interceptor>*>&>
      ::push_back((__split_buffer<std::__ndk1::shared_ptr<cpr::Interceptor>*,std::__ndk1::allocator<std::__ndk1::shared_ptr<cpr::Interceptor>*>&>
                   *)&local_80,&local_88);
      ppsVar17 = *(shared_ptr ***)(this + 0x10);
      while (ppsVar9 = *(shared_ptr ***)(this + 8), ppsVar17 != ppsVar9) {
        ppsVar17 = ppsVar17 + -1;
                    /* try { // try from 008fa134 to 008fa13f has its CatchHandler @ 008fa438 */
        __split_buffer<std::__ndk1::shared_ptr<cpr::Interceptor>*,std::__ndk1::allocator<std::__ndk1::shared_ptr<cpr::Interceptor>*>&>
        ::push_front((__split_buffer<std::__ndk1::shared_ptr<cpr::Interceptor>*,std::__ndk1::allocator<std::__ndk1::shared_ptr<cpr::Interceptor>*>&>
                      *)&local_80,ppsVar17);
      }
      psVar6 = *(shared_ptr **)this;
      *(shared_ptr **)(this + 8) = psStack_78;
      *(shared_ptr **)this = local_80;
      ppsVar2 = *(shared_ptr ***)(this + 0x10);
      uVar19 = *(undefined8 *)(this + 0x18);
      *(shared_ptr **)(this + 0x18) = psStack_68;
      *(shared_ptr **)(this + 0x10) = local_70;
      local_70 = (shared_ptr *)ppsVar2;
      if (ppsVar2 != ppsVar17) {
        local_70 = (shared_ptr *)
                   ((long)ppsVar2 + (~((long)ppsVar2 + (-8 - (long)ppsVar9)) & 0xfffffffffffffff8U))
        ;
      }
      local_80 = psVar6;
      psStack_78 = (shared_ptr *)ppsVar9;
      psStack_68 = (shared_ptr *)uVar19;
      if (psVar6 != (shared_ptr *)0x0) {
        operator_delete(psVar6);
      }
      goto LAB_008fa2e4;
    }
    if (*(long *)(this + 0x18) != *(long *)(this + 0x10)) {
      local_80 = operator_new(0x1000);
      __split_buffer<std::__ndk1::shared_ptr<cpr::Interceptor>*,std::__ndk1::allocator<std::__ndk1::shared_ptr<cpr::Interceptor>*>>
      ::push_back((__split_buffer<std::__ndk1::shared_ptr<cpr::Interceptor>*,std::__ndk1::allocator<std::__ndk1::shared_ptr<cpr::Interceptor>*>>
                   *)this,&local_80);
      goto LAB_008fa2e4;
    }
    local_80 = operator_new(0x1000);
    __split_buffer<std::__ndk1::shared_ptr<cpr::Interceptor>*,std::__ndk1::allocator<std::__ndk1::shared_ptr<cpr::Interceptor>*>>
    ::push_front((__split_buffer<std::__ndk1::shared_ptr<cpr::Interceptor>*,std::__ndk1::allocator<std::__ndk1::shared_ptr<cpr::Interceptor>*>>
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
                    /* try { // try from 008fa3f8 to 008fa403 has its CatchHandler @ 008fa408 */
            logic_error::logic_error
                      (this_00,
                       "allocator<T>::allocate(size_t n) \'n\' exceeds maximum supported size");
            goto LAB_008fa3c4;
          }
          pvVar5 = operator_new(uVar8 << 3);
        }
        uVar13 = uVar8 >> 2;
        puVar12 = (undefined8 *)((long)pvVar5 + uVar13 * 8);
        pvVar11 = (void *)((long)pvVar5 + uVar8 * 8);
        if (__src == puVar20) goto LAB_008fa2b8;
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
          if (uVar8 == uVar15) goto LAB_008fa260;
        }
        do {
          puVar10 = __src + 1;
          *puVar18 = *__src;
          puVar18 = puVar18 + 1;
          __src = puVar10;
        } while (puVar20 != puVar10);
        goto LAB_008fa260;
      }
      goto LAB_008f9fb8;
    }
  }
  else {
    puVar10 = *(undefined8 **)(this + 8);
    puVar20 = *(undefined8 **)(this + 0x10);
    *(ulong *)(this + 0x20) = *(ulong *)(this + 0x20) - 0x100;
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
                    /* try { // try from 008fa3b8 to 008fa3c3 has its CatchHandler @ 008fa40c */
            logic_error::logic_error
                      (this_00,
                       "allocator<T>::allocate(size_t n) \'n\' exceeds maximum supported size");
            goto LAB_008fa3c4;
          }
          pvVar5 = operator_new(uVar8 << 3);
        }
        uVar13 = uVar8 >> 2;
        puVar12 = (undefined8 *)((long)pvVar5 + uVar13 * 8);
        pvVar11 = (void *)((long)pvVar5 + uVar8 * 8);
        if (__src == puVar20) {
LAB_008fa2b8:
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
            if (uVar8 == uVar15) goto LAB_008fa260;
          }
          do {
            puVar10 = __src + 1;
            *puVar18 = *__src;
            puVar18 = puVar18 + 1;
            __src = puVar10;
          } while (puVar20 != puVar10);
LAB_008fa260:
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
LAB_008f9fb8:
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
LAB_008fa2e4:
  if (*(long *)(lVar3 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

