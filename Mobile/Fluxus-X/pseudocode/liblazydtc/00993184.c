/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00993184
 */

/* ix::WebSocketServer::stop() */

void __thiscall ix::WebSocketServer::stop(WebSocketServer *this)

{
  __shared_weak_count *p_Var1;
  WebSocket *this_00;
  __shared_weak_count *this_01;
  char cVar2;
  long lVar3;
  bool bVar4;
  __tree_node *p_Var5;
  long lVar6;
  __tree_node *p_Var7;
  __tree_node *local_70;
  __tree_node *local_68 [2];
  long local_58;
  
  lVar3 = tpidr_el0;
  local_58 = *(long *)(lVar3 + 0x28);
  SocketServer::stopAcceptingConnections((SocketServer *)this);
  getClients();
  p_Var7 = local_70;
  do {
    while( true ) {
      if (p_Var7 == (__tree_node *)local_68) {
                    /* try { // try from 009932a8 to 009932af has its CatchHandler @ 009932ec */
        SocketServer::stop((SocketServer *)this);
        std::__ndk1::
        __tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
        ::destroy((__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
                   *)&local_70,local_68[0]);
        if (*(long *)(lVar3 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
          __stack_chk_fail();
        }
        return;
      }
      this_00 = *(WebSocket **)(p_Var7 + 0x20);
      this_01 = *(__shared_weak_count **)(p_Var7 + 0x28);
      if (this_01 != (__shared_weak_count *)0x0) {
        p_Var1 = this_01 + 8;
        do {
          cVar2 = '\x01';
          bVar4 = (bool)ExclusiveMonitorPass(p_Var1,0x10);
          if (bVar4) {
            *(long *)p_Var1 = *(long *)p_Var1 + 1;
            cVar2 = ExclusiveMonitorsStatus();
          }
        } while (cVar2 != '\0');
      }
                    /* try { // try from 00993204 to 0099320f has its CatchHandler @ 009932f4 */
      WebSocket::close(this_00,1000,
                       (basic_string_conflict *)&WebSocketCloseConstants::kNormalClosureMessage);
      if (this_01 == (__shared_weak_count *)0x0) break;
      p_Var1 = this_01 + 8;
      do {
        lVar6 = *(long *)p_Var1;
        cVar2 = '\x01';
        bVar4 = (bool)ExclusiveMonitorPass(p_Var1,0x10);
        if (bVar4) {
          *(long *)p_Var1 = lVar6 + -1;
          cVar2 = ExclusiveMonitorsStatus();
        }
      } while (cVar2 != '\0');
      if (lVar6 != 0) break;
      (**(code **)(*(long *)this_01 + 0x10))(this_01);
      std::__ndk1::__shared_weak_count::__release_weak(this_01);
      p_Var5 = *(__tree_node **)(p_Var7 + 8);
      if (*(__tree_node **)(p_Var7 + 8) == (__tree_node *)0x0) goto LAB_00993264;
LAB_00993234:
      do {
        p_Var7 = p_Var5;
        p_Var5 = *(__tree_node **)p_Var7;
      } while (*(__tree_node **)p_Var7 != (__tree_node *)0x0);
    }
    p_Var5 = *(__tree_node **)(p_Var7 + 8);
    if (*(__tree_node **)(p_Var7 + 8) != (__tree_node *)0x0) goto LAB_00993234;
LAB_00993264:
    p_Var5 = p_Var7 + 0x10;
    bVar4 = (__tree_node *)*(__tree_node ***)*(__tree_node **)p_Var5 != p_Var7;
    p_Var7 = *(__tree_node **)p_Var5;
    if (bVar4) {
      do {
        lVar6 = *(long *)p_Var5;
        p_Var5 = (__tree_node *)(lVar6 + 0x10);
        p_Var7 = *(__tree_node **)p_Var5;
      } while (*(long *)p_Var7 != lVar6);
    }
  } while( true );
}

