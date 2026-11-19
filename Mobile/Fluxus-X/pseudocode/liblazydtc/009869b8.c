/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009869b8
 */

/* ix::DNSLookup::resolveCancellable(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >&, std::__ndk1::function<bool ()> const&) */

void ix::DNSLookup::resolveCancellable(basic_string_conflict *param_1,function *param_2)

{
  long *plVar1;
  basic_string_conflict *pbVar2;
  char cVar3;
  bool bVar4;
  long lVar5;
  __shared_weak_count *this;
  __shared_weak_count *p_Var6;
  ulong uVar7;
  undefined8 *puVar8;
  long in_x2;
  undefined8 *in_x8;
  long lVar9;
  undefined8 uVar10;
  void *__src;
  void *__dest;
  __shared_weak_count *p_Var11;
  ulong uVar12;
  basic_string_conflict *local_b8;
  code *local_b0;
  undefined8 uStack_a8;
  ulong local_a0;
  ulong uStack_98;
  void *local_90;
  undefined4 local_7c;
  undefined8 local_78;
  __shared_weak_count *local_70;
  long local_68;
  
  lVar5 = tpidr_el0;
  local_68 = *(long *)(lVar5 + 0x28);
  std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
  assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)param_2,
         "no error",8);
  if (((byte)param_1[0xb0] & 1) != 0) {
    *in_x8 = 0;
    in_x8[1] = 0;
    goto LAB_00986ccc;
  }
  if (*(__shared_weak_count **)(param_1 + 8) == (__shared_weak_count *)0x0) {
LAB_00986d5c:
    puVar8 = (undefined8 *)__cxa_allocate_exception(8);
    *puVar8 = &PTR__bad_weak_ptr_00cac890;
                    /* WARNING: Subroutine does not return */
    __cxa_throw(puVar8,&std::__ndk1::bad_weak_ptr::typeinfo,std::__ndk1::bad_weak_ptr::~bad_weak_ptr
               );
  }
  uVar10 = *(undefined8 *)param_1;
  this = (__shared_weak_count *)
         std::__ndk1::__shared_weak_count::lock(*(__shared_weak_count **)(param_1 + 8));
  if (this == (__shared_weak_count *)0x0) goto LAB_00986d5c;
  p_Var6 = this + 0x10;
  do {
    cVar3 = '\x01';
    bVar4 = (bool)ExclusiveMonitorPass(p_Var6,0x10);
    if (bVar4) {
      *(long *)p_Var6 = *(long *)p_Var6 + 1;
      cVar3 = ExclusiveMonitorsStatus();
    }
  } while (cVar3 != '\0');
  local_7c = *(undefined4 *)(param_1 + 0x28);
  uStack_98 = 0;
  local_90 = (void *)0x0;
  local_a0 = 0;
  local_78 = uVar10;
  local_70 = this;
  if (((byte)param_1[0x10] & 1) == 0) {
    local_90 = *(void **)(param_1 + 0x20);
    uStack_98 = *(ulong *)(param_1 + 0x18);
    local_a0 = *(ulong *)(param_1 + 0x10);
    goto LAB_00986ae0;
  }
  uVar7 = *(ulong *)(param_1 + 0x18);
  if (0xffffffffffffffef < uVar7) {
                    /* try { // try from 00986d8c to 00986d93 has its CatchHandler @ 00986dc0 */
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__basic_string_common<true>::__throw_length_error();
  }
  __src = *(void **)(param_1 + 0x20);
  if (uVar7 < 0x17) {
    __dest = (void *)((ulong)&local_a0 | 1);
    local_a0 = (ulong)(byte)((int)uVar7 << 1);
    if (uVar7 != 0) goto LAB_00986acc;
  }
  else {
    uVar12 = uVar7 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 00986ab4 to 00986abb has its CatchHandler @ 00986dc0 */
    __dest = operator_new(uVar12);
    local_a0 = uVar12 | 1;
    uStack_98 = uVar7;
    local_90 = __dest;
LAB_00986acc:
    memcpy(__dest,__src,uVar7);
  }
  *(undefined1 *)((long)__dest + uVar7) = 0;
LAB_00986ae0:
  uStack_a8 = 0;
  local_b0 = run;
  local_b8 = param_1;
                    /* try { // try from 00986af8 to 00986aff has its CatchHandler @ 00986df8 */
  p_Var6 = operator_new(0x20);
  *(undefined8 *)(p_Var6 + 0x10) = 0;
  p_Var11 = p_Var6 + 8;
  *(undefined8 *)p_Var11 = 0;
  *(undefined ***)p_Var6 = &PTR____shared_ptr_emplace_00c51fe8;
                    /* try { // try from 00986b24 to 00986b3f has its CatchHandler @ 00986dd4 */
  FUN_00987494((thread *)(p_Var6 + 0x18),&local_b0,&local_b8,&local_78,&local_a0,&local_7c);
                    /* try { // try from 00986b40 to 00986b47 has its CatchHandler @ 00986e0c */
  std::__ndk1::thread::detach((thread *)(p_Var6 + 0x18));
LAB_00986b60:
  if (((byte)param_1[0xb0] & 1) == 0) goto code_r0x00986b6c;
  if (*(long **)(in_x2 + 0x20) == (long *)0x0) {
    puVar8 = (undefined8 *)__cxa_allocate_exception(8);
    *puVar8 = &PTR__bad_function_call_00cac7b8;
                    /* try { // try from 00986dac to 00986dbf has its CatchHandler @ 00986e0c */
                    /* WARNING: Subroutine does not return */
    __cxa_throw(puVar8,&std::__ndk1::bad_function_call::typeinfo,std::bad_exception::~bad_exception)
    ;
  }
  uVar7 = (**(code **)(**(long **)(in_x2 + 0x20) + 0x30))();
  if ((uVar7 & 1) == 0) {
    std::__ndk1::mutex::lock((mutex *)(param_1 + 0x88));
    std::__ndk1::mutex::unlock((mutex *)(param_1 + 0x88));
    if (param_1 + 0x70 != (basic_string_conflict *)param_2) {
      uVar7 = *(ulong *)(param_1 + 0x78);
      pbVar2 = *(basic_string_conflict **)(param_1 + 0x80);
      if (((byte)param_1[0x70] & 1) == 0) {
        pbVar2 = param_1 + 0x71;
        uVar7 = (ulong)((byte)param_1[0x70] >> 1);
      }
      std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
      assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
             param_2,(char *)pbVar2,uVar7);
    }
    std::__ndk1::mutex::lock((mutex *)(param_1 + 0x48));
    *in_x8 = *(undefined8 *)(param_1 + 0x38);
    lVar9 = *(long *)(param_1 + 0x40);
    in_x8[1] = lVar9;
    if (lVar9 != 0) {
      plVar1 = (long *)(lVar9 + 8);
      do {
        cVar3 = '\x01';
        bVar4 = (bool)ExclusiveMonitorPass(plVar1,0x10);
        if (bVar4) {
          *plVar1 = *plVar1 + 1;
          cVar3 = ExclusiveMonitorsStatus();
        }
      } while (cVar3 != '\0');
    }
    std::__ndk1::mutex::unlock((mutex *)(param_1 + 0x48));
    goto LAB_00986c74;
  }
  std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
  assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)param_2,
         "cancellation requested",0x16);
  goto LAB_00986bec;
code_r0x00986b6c:
  lVar9 = *(long *)(param_1 + 0x30);
  if (0 < lVar9) {
    local_b0 = (code *)(lVar9 * 1000000);
    if (0x8637bd05af6 < lVar9) {
      local_b0 = (code *)0x7fffffffffffffff;
    }
                    /* try { // try from 00986b88 to 00986b8f has its CatchHandler @ 00986e10 */
    std::__ndk1::this_thread::sleep_for((duration *)&local_b0);
  }
  if (*(long **)(in_x2 + 0x20) == (long *)0x0) {
    puVar8 = (undefined8 *)__cxa_allocate_exception(8);
    *puVar8 = &PTR__bad_function_call_00cac7b8;
                    /* try { // try from 00986d48 to 00986d5b has its CatchHandler @ 00986e0c */
                    /* WARNING: Subroutine does not return */
    __cxa_throw(puVar8,&std::__ndk1::bad_function_call::typeinfo,std::bad_exception::~bad_exception)
    ;
  }
                    /* try { // try from 00986ba0 to 00986ba3 has its CatchHandler @ 00986e14 */
  uVar7 = (**(code **)(**(long **)(in_x2 + 0x20) + 0x30))();
  if ((uVar7 & 1) != 0) goto LAB_00986ba8;
  goto LAB_00986b60;
LAB_00986ba8:
                    /* try { // try from 00986ba8 to 00986c3f has its CatchHandler @ 00986e0c */
  std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
  assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)param_2,
         "cancellation requested",0x16);
LAB_00986bec:
  *in_x8 = 0;
  in_x8[1] = 0;
LAB_00986c74:
  do {
    lVar9 = *(long *)p_Var11;
    cVar3 = '\x01';
    bVar4 = (bool)ExclusiveMonitorPass(p_Var11,0x10);
    if (bVar4) {
      *(long *)p_Var11 = lVar9 + -1;
      cVar3 = ExclusiveMonitorsStatus();
    }
  } while (cVar3 != '\0');
  if (lVar9 == 0) {
    (**(code **)(*(long *)p_Var6 + 0x10))(p_Var6);
    std::__ndk1::__shared_weak_count::__release_weak(p_Var6);
  }
  if ((local_a0 & 1) != 0) {
    operator_delete(local_90);
  }
  if (local_70 != (__shared_weak_count *)0x0) {
    std::__ndk1::__shared_weak_count::__release_weak(local_70);
  }
  p_Var6 = this + 8;
  do {
    lVar9 = *(long *)p_Var6;
    cVar3 = '\x01';
    bVar4 = (bool)ExclusiveMonitorPass(p_Var6,0x10);
    if (bVar4) {
      *(long *)p_Var6 = lVar9 + -1;
      cVar3 = ExclusiveMonitorsStatus();
    }
  } while (cVar3 != '\0');
  if (lVar9 == 0) {
    (**(code **)(*(long *)this + 0x10))(this);
    std::__ndk1::__shared_weak_count::__release_weak(this);
  }
LAB_00986ccc:
  if (*(long *)(lVar5 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

