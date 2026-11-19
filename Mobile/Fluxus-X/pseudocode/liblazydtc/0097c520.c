/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0097c520
 */

/* ix::HttpServer::makeRedirectServer(std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&) */

void __thiscall ix::HttpServer::makeRedirectServer(HttpServer *this,basic_string_conflict *param_1)

{
  long lVar1;
  long *plVar2;
  void *pvVar3;
  code *pcVar4;
  ulong uVar5;
  void *pvVar6;
  ulong uVar7;
  undefined8 local_d8;
  ulong uStack_d0;
  void *local_c8;
  long alStack_c0 [4];
  long *local_a0;
  function<std::__ndk1::shared_ptr<ix::HttpResponse>(std::__ndk1::shared_ptr<ix::HttpRequest>,std::__ndk1::shared_ptr<ix::ConnectionState>)>
  afStack_90 [32];
  function<std::__ndk1::shared_ptr<ix::HttpResponse>(std::__ndk1::shared_ptr<ix::HttpRequest>,std::__ndk1::shared_ptr<ix::ConnectionState>)>
  *local_70;
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  local_d8 = 0;
  uStack_d0 = 0;
  local_c8 = (void *)0x0;
  if (((byte)*param_1 & 1) == 0) {
    local_c8 = *(void **)(param_1 + 0x10);
    uStack_d0 = *(ulong *)(param_1 + 8);
    local_d8 = *(ulong *)param_1;
  }
  else {
    uVar5 = *(ulong *)(param_1 + 8);
    if (0xffffffffffffffef < uVar5) {
                    /* WARNING: Subroutine does not return */
      std::__ndk1::__basic_string_common<true>::__throw_length_error();
    }
    pvVar6 = *(void **)(param_1 + 0x10);
    if (uVar5 < 0x17) {
      pvVar3 = (void *)((long)&local_d8 + 1);
      local_d8 = (ulong)(byte)((int)uVar5 << 1);
      if (uVar5 != 0) goto LAB_0097c5c4;
    }
    else {
      uVar7 = uVar5 + 0x10 & 0xfffffffffffffff0;
      pvVar3 = operator_new(uVar7);
      local_d8 = uVar7 | 1;
      uStack_d0 = uVar5;
      local_c8 = pvVar3;
LAB_0097c5c4:
      memcpy(pvVar3,pvVar6,uVar5);
    }
    *(undefined1 *)((long)pvVar3 + uVar5) = 0;
  }
  local_a0 = (long *)0x0;
                    /* try { // try from 0097c5dc to 0097c5e3 has its CatchHandler @ 0097c7ac */
  plVar2 = operator_new(0x28);
  pvVar6 = local_c8;
  uVar5 = uStack_d0;
  *plVar2 = (long)&PTR_LAB_00c51ad8;
  plVar2[2] = 0;
  plVar2[1] = (long)this;
  plVar2[3] = 0;
  plVar2[4] = 0;
  if ((local_d8 & 1) == 0) {
    plVar2[4] = (long)local_c8;
    plVar2[3] = uStack_d0;
    plVar2[2] = local_d8;
  }
  else {
    if (0xffffffffffffffef < uStack_d0) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 0097c740 to 0097c743 has its CatchHandler @ 0097c744 */
      std::__ndk1::__basic_string_common<true>::__throw_length_error();
    }
    if (uStack_d0 < 0x17) {
      pvVar3 = (void *)((long)plVar2 + 0x11);
      *(char *)(plVar2 + 2) = (char)((int)uStack_d0 << 1);
      if (uStack_d0 != 0) goto LAB_0097c670;
    }
    else {
      uVar7 = uStack_d0 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 0097c658 to 0097c65f has its CatchHandler @ 0097c744 */
      pvVar3 = operator_new(uVar7);
      plVar2[3] = uVar5;
      plVar2[4] = (long)pvVar3;
      plVar2[2] = uVar7 | 1;
LAB_0097c670:
      memcpy(pvVar3,pvVar6,uVar5);
    }
    *(undefined1 *)((long)pvVar3 + uVar5) = 0;
  }
  local_a0 = plVar2;
                    /* try { // try from 0097c688 to 0097c68f has its CatchHandler @ 0097c75c */
  local_70 = (function<std::__ndk1::shared_ptr<ix::HttpResponse>(std::__ndk1::shared_ptr<ix::HttpRequest>,std::__ndk1::shared_ptr<ix::ConnectionState>)>
              *)FUN_0097f914(plVar2);
  std::__ndk1::
  function<std::__ndk1::shared_ptr<ix::HttpResponse>(std::__ndk1::shared_ptr<ix::HttpRequest>,std::__ndk1::shared_ptr<ix::ConnectionState>)>
  ::swap(afStack_90,(function *)(this + 0x2f0));
  if (afStack_90 == local_70) {
    pcVar4 = *(code **)(*(long *)local_70 + 0x20);
LAB_0097c6c8:
    (*pcVar4)();
  }
  else if (local_70 !=
           (function<std::__ndk1::shared_ptr<ix::HttpResponse>(std::__ndk1::shared_ptr<ix::HttpRequest>,std::__ndk1::shared_ptr<ix::ConnectionState>)>
            *)0x0) {
    pcVar4 = *(code **)(*(long *)local_70 + 0x28);
    goto LAB_0097c6c8;
  }
  if (alStack_c0 == local_a0) {
    pcVar4 = *(code **)(*local_a0 + 0x20);
  }
  else {
    if (local_a0 == (long *)0x0) goto LAB_0097c6f8;
    pcVar4 = *(code **)(*local_a0 + 0x28);
  }
  (*pcVar4)();
LAB_0097c6f8:
  if ((local_d8 & 1) != 0) {
    operator_delete(local_c8);
  }
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

