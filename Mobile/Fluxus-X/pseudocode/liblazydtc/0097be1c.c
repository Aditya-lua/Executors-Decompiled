/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0097be1c
 */

/* WARNING: Type propagation algorithm not settling */
/* ix::HttpServer::handleConnection(std::__ndk1::unique_ptr<ix::Socket,
   std::__ndk1::default_delete<ix::Socket> >, std::__ndk1::shared_ptr<ix::ConnectionState>) */

void __thiscall
ix::HttpServer::handleConnection(HttpServer *this,undefined8 *param_2,undefined8 *param_3)

{
  __shared_weak_count *p_Var1;
  __shared_weak_count *p_Var2;
  __shared_weak_count *p_Var3;
  byte bVar4;
  char cVar5;
  long lVar6;
  bool bVar7;
  int iVar8;
  long lVar9;
  long *plVar10;
  ulong uVar11;
  undefined8 *puVar12;
  void *__s1;
  piecewise_construct_t *local_110;
  __shared_weak_count *local_108;
  undefined8 local_100;
  __shared_weak_count *local_f8;
  long local_f0;
  __shared_weak_count *local_e8;
  piecewise_construct_t *local_e0;
  __shared_weak_count *local_d8;
  long local_d0;
  __shared_weak_count *local_c8;
  undefined8 local_c0;
  __shared_weak_count *local_b8;
  long *local_b0;
  piecewise_construct_t local_a8;
  undefined7 uStack_a7;
  undefined1 uStack_a0;
  undefined7 uStack_9f;
  undefined1 uStack_98;
  undefined4 uStack_97;
  undefined1 uStack_93;
  undefined2 uStack_92;
  char local_90;
  byte local_88;
  void *local_78;
  long local_70;
  __shared_weak_count *local_68;
  long local_58;
  
  lVar6 = tpidr_el0;
  local_58 = *(long *)(lVar6 + 0x28);
  Http::parseRequest((unique_ptr *)param_2,*(int *)(this + 800));
  p_Var3 = local_68;
  if (local_90 == '\0') goto LAB_0097c234;
  if (local_68 != (__shared_weak_count *)0x0) {
    p_Var1 = local_68 + 8;
    do {
      cVar5 = '\x01';
      bVar7 = (bool)ExclusiveMonitorPass(p_Var1,0x10);
      if (bVar7) {
        *(long *)p_Var1 = *(long *)p_Var1 + 1;
        cVar5 = ExclusiveMonitorsStatus();
      }
    } while (cVar5 != '\0');
  }
  local_e0 = &local_a8;
  uStack_9f = 0;
  uStack_98 = 0;
  uStack_97 = 0;
  uStack_93 = 0;
  uStack_92 = 0;
  local_a8 = (piecewise_construct_t)0xe;
  uStack_a7 = 0x65646172677055;
  uStack_a0 = 0;
                    /* try { // try from 0097beb8 to 0097becf has its CatchHandler @ 0097c478 */
  lVar9 = std::__ndk1::
          __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
          ::
          __emplace_unique_key_args<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::piecewise_construct_t_const&,std::__ndk1::tuple<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>&&>,std::__ndk1::tuple<>>
                    ((basic_string_conflict *)(local_70 + 0x60),&local_a8,(tuple *)&DAT_007497e2,
                     (tuple *)&local_e0);
  bVar4 = *(byte *)(lVar9 + 0x38);
  bVar7 = false;
  uVar11 = (ulong)(bVar4 >> 1);
  if ((bVar4 & 1) != 0) {
    uVar11 = *(ulong *)(lVar9 + 0x40);
  }
  if (uVar11 == 9) {
    __s1 = *(void **)(lVar9 + 0x48);
    if ((bVar4 & 1) == 0) {
      __s1 = (void *)(lVar9 + 0x39);
    }
    iVar8 = memcmp(__s1,"websocket",9);
    bVar7 = iVar8 == 0;
    if (((byte)local_a8 & 1) == 0) goto LAB_0097c0b4;
LAB_0097bf20:
    operator_delete((void *)CONCAT26(uStack_92,CONCAT15(uStack_93,CONCAT41(uStack_97,uStack_98))));
    if (bVar7) goto LAB_0097c0b8;
LAB_0097bf2c:
    local_f0 = local_70;
    local_e8 = p_Var3;
    if (p_Var3 != (__shared_weak_count *)0x0) {
      p_Var1 = p_Var3 + 8;
      do {
        cVar5 = '\x01';
        bVar7 = (bool)ExclusiveMonitorPass(p_Var1,0x10);
        if (bVar7) {
          *(long *)p_Var1 = *(long *)p_Var1 + 1;
          cVar5 = ExclusiveMonitorsStatus();
        }
      } while (cVar5 != '\0');
    }
    local_100 = *param_3;
    local_f8 = (__shared_weak_count *)param_3[1];
    if (local_f8 != (__shared_weak_count *)0x0) {
      p_Var1 = local_f8 + 8;
      do {
        cVar5 = '\x01';
        bVar7 = (bool)ExclusiveMonitorPass(p_Var1,0x10);
        if (bVar7) {
          *(long *)p_Var1 = *(long *)p_Var1 + 1;
          cVar5 = ExclusiveMonitorsStatus();
        }
      } while (cVar5 != '\0');
    }
    plVar10 = *(long **)(this + 0x310);
    if (plVar10 == (long *)0x0) {
      puVar12 = (undefined8 *)__cxa_allocate_exception(8);
      *puVar12 = &PTR__bad_function_call_00cac7b8;
                    /* try { // try from 0097c2d8 to 0097c2eb has its CatchHandler @ 0097c368 */
                    /* WARNING: Subroutine does not return */
      __cxa_throw(puVar12,&std::__ndk1::bad_function_call::typeinfo,
                  std::bad_exception::~bad_exception);
    }
                    /* try { // try from 0097bf80 to 0097bf8f has its CatchHandler @ 0097c368 */
    (**(code **)(*plVar10 + 0x30))(&local_e0,plVar10,&local_f0,&local_100);
    p_Var1 = local_f8;
    if (local_f8 != (__shared_weak_count *)0x0) {
      p_Var2 = local_f8 + 8;
      do {
        lVar9 = *(long *)p_Var2;
        cVar5 = '\x01';
        bVar7 = (bool)ExclusiveMonitorPass(p_Var2,0x10);
        if (bVar7) {
          *(long *)p_Var2 = lVar9 + -1;
          cVar5 = ExclusiveMonitorsStatus();
        }
      } while (cVar5 != '\0');
      if (lVar9 == 0) {
        (**(code **)(*(long *)local_f8 + 0x10))(local_f8);
        std::__ndk1::__shared_weak_count::__release_weak(p_Var1);
      }
    }
    p_Var1 = local_e8;
    if (local_e8 != (__shared_weak_count *)0x0) {
      p_Var2 = local_e8 + 8;
      do {
        lVar9 = *(long *)p_Var2;
        cVar5 = '\x01';
        bVar7 = (bool)ExclusiveMonitorPass(p_Var2,0x10);
        if (bVar7) {
          *(long *)p_Var2 = lVar9 + -1;
          cVar5 = ExclusiveMonitorsStatus();
        }
      } while (cVar5 != '\0');
      if (lVar9 == 0) {
        (**(code **)(*(long *)local_e8 + 0x10))(local_e8);
        std::__ndk1::__shared_weak_count::__release_weak(p_Var1);
      }
    }
    local_110 = local_e0;
    local_108 = local_d8;
    if (local_d8 != (__shared_weak_count *)0x0) {
      p_Var1 = local_d8 + 8;
      do {
        cVar5 = '\x01';
        bVar7 = (bool)ExclusiveMonitorPass(p_Var1,0x10);
        if (bVar7) {
          *(long *)p_Var1 = *(long *)p_Var1 + 1;
          cVar5 = ExclusiveMonitorsStatus();
        }
      } while (cVar5 != '\0');
    }
                    /* try { // try from 0097c020 to 0097c02b has its CatchHandler @ 0097c30c */
    uVar11 = Http::sendResponse(&local_110,param_2);
    p_Var1 = local_108;
    if (local_108 != (__shared_weak_count *)0x0) {
      p_Var2 = local_108 + 8;
      do {
        lVar9 = *(long *)p_Var2;
        cVar5 = '\x01';
        bVar7 = (bool)ExclusiveMonitorPass(p_Var2,0x10);
        if (bVar7) {
          *(long *)p_Var2 = lVar9 + -1;
          cVar5 = ExclusiveMonitorsStatus();
        }
      } while (cVar5 != '\0');
      if (lVar9 == 0) {
        (**(code **)(*(long *)local_108 + 0x10))(local_108);
        std::__ndk1::__shared_weak_count::__release_weak(p_Var1);
      }
    }
    p_Var1 = local_d8;
    if ((uVar11 & 1) == 0) {
      uStack_92 = 0;
      local_a8 = (piecewise_construct_t)0x28;
      uStack_97 = 0x65736e6f;
      uStack_9f = 0x73657220646e65;
      uStack_98 = 0x70;
      uStack_a7 = 0x20746f6e6e6143;
      uStack_a0 = 0x73;
      uStack_93 = 0;
                    /* try { // try from 0097c084 to 0097c08f has its CatchHandler @ 0097c2ec */
      SocketServer::logError((SocketServer *)this,(basic_string_conflict *)&local_a8);
      p_Var1 = local_d8;
      if (((byte)local_a8 & 1) != 0) {
        operator_delete((void *)CONCAT26(uStack_92,CONCAT15(uStack_93,CONCAT41(uStack_97,uStack_98))
                                        ));
        p_Var1 = local_d8;
      }
    }
    if (p_Var1 != (__shared_weak_count *)0x0) {
      p_Var2 = p_Var1 + 8;
      do {
        lVar9 = *(long *)p_Var2;
        cVar5 = '\x01';
        bVar7 = (bool)ExclusiveMonitorPass(p_Var2,0x10);
        if (bVar7) {
          *(long *)p_Var2 = lVar9 + -1;
          cVar5 = ExclusiveMonitorsStatus();
        }
      } while (cVar5 != '\0');
      if (lVar9 == 0) {
        (**(code **)(*(long *)p_Var1 + 0x10))(p_Var1);
        std::__ndk1::__shared_weak_count::__release_weak(p_Var1);
      }
    }
  }
  else {
    if (((byte)local_a8 & 1) != 0) goto LAB_0097bf20;
LAB_0097c0b4:
    if (!bVar7) goto LAB_0097bf2c;
LAB_0097c0b8:
    local_b0 = (long *)*param_2;
    *param_2 = 0;
    local_c0 = *param_3;
    local_b8 = (__shared_weak_count *)param_3[1];
    if (local_b8 != (__shared_weak_count *)0x0) {
      p_Var1 = local_b8 + 8;
      do {
        cVar5 = '\x01';
        bVar7 = (bool)ExclusiveMonitorPass(p_Var1,0x10);
        if (bVar7) {
          *(long *)p_Var1 = *(long *)p_Var1 + 1;
          cVar5 = ExclusiveMonitorsStatus();
        }
      } while (cVar5 != '\0');
    }
    local_d0 = local_70;
    local_c8 = p_Var3;
    if (p_Var3 != (__shared_weak_count *)0x0) {
      p_Var1 = p_Var3 + 8;
      do {
        cVar5 = '\x01';
        bVar7 = (bool)ExclusiveMonitorPass(p_Var1,0x10);
        if (bVar7) {
          *(long *)p_Var1 = *(long *)p_Var1 + 1;
          cVar5 = ExclusiveMonitorsStatus();
        }
      } while (cVar5 != '\0');
    }
                    /* try { // try from 0097c108 to 0097c11b has its CatchHandler @ 0097c3e4 */
    WebSocketServer::handleUpgrade((WebSocketServer *)this,&local_b0,&local_c0,&local_d0);
    p_Var1 = local_c8;
    if (local_c8 != (__shared_weak_count *)0x0) {
      p_Var2 = local_c8 + 8;
      do {
        lVar9 = *(long *)p_Var2;
        cVar5 = '\x01';
        bVar7 = (bool)ExclusiveMonitorPass(p_Var2,0x10);
        if (bVar7) {
          *(long *)p_Var2 = lVar9 + -1;
          cVar5 = ExclusiveMonitorsStatus();
        }
      } while (cVar5 != '\0');
      if (lVar9 == 0) {
        (**(code **)(*(long *)local_c8 + 0x10))(local_c8);
        std::__ndk1::__shared_weak_count::__release_weak(p_Var1);
      }
    }
    p_Var1 = local_b8;
    if (local_b8 != (__shared_weak_count *)0x0) {
      p_Var2 = local_b8 + 8;
      do {
        lVar9 = *(long *)p_Var2;
        cVar5 = '\x01';
        bVar7 = (bool)ExclusiveMonitorPass(p_Var2,0x10);
        if (bVar7) {
          *(long *)p_Var2 = lVar9 + -1;
          cVar5 = ExclusiveMonitorsStatus();
        }
      } while (cVar5 != '\0');
      if (lVar9 == 0) {
        (**(code **)(*(long *)local_b8 + 0x10))(local_b8);
        std::__ndk1::__shared_weak_count::__release_weak(p_Var1);
      }
    }
    plVar10 = local_b0;
    local_b0 = (long *)0x0;
    if (plVar10 != (long *)0x0) {
      (**(code **)(*plVar10 + 8))();
    }
  }
  if (p_Var3 != (__shared_weak_count *)0x0) {
    p_Var1 = p_Var3 + 8;
    do {
      lVar9 = *(long *)p_Var1;
      cVar5 = '\x01';
      bVar7 = (bool)ExclusiveMonitorPass(p_Var1,0x10);
      if (bVar7) {
        *(long *)p_Var1 = lVar9 + -1;
        cVar5 = ExclusiveMonitorsStatus();
      }
    } while (cVar5 != '\0');
    if (lVar9 == 0) {
      (**(code **)(*(long *)p_Var3 + 0x10))(p_Var3);
      std::__ndk1::__shared_weak_count::__release_weak(p_Var3);
    }
  }
LAB_0097c234:
                    /* try { // try from 0097c238 to 0097c23b has its CatchHandler @ 0097c4cc */
  ConnectionState::setTerminated((ConnectionState *)*param_3);
  if (local_68 != (__shared_weak_count *)0x0) {
    p_Var3 = local_68 + 8;
    do {
      lVar9 = *(long *)p_Var3;
      cVar5 = '\x01';
      bVar7 = (bool)ExclusiveMonitorPass(p_Var3,0x10);
      if (bVar7) {
        *(long *)p_Var3 = lVar9 + -1;
        cVar5 = ExclusiveMonitorsStatus();
      }
    } while (cVar5 != '\0');
    if (lVar9 == 0) {
      (**(code **)(*(long *)local_68 + 0x10))(local_68);
      std::__ndk1::__shared_weak_count::__release_weak(local_68);
    }
  }
  if ((local_88 & 1) != 0) {
    operator_delete(local_78);
  }
  if (*(long *)(lVar6 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

