/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009933cc
 */

/* WARNING: Heritage AFTER dead removal. Example location: x0 : 0x00993444 */
/* WARNING: Restarted to delay deadcode elimination for space: register */
/* ix::WebSocketServer::getClients() */

void ix::WebSocketServer::getClients(void)

{
  mutex *this;
  __tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
  *p_Var1;
  long *plVar2;
  char cVar3;
  bool bVar4;
  long lVar5;
  __tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
  *in_x0;
  __tree_node_base *p_Var6;
  long *in_x8;
  __tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
  *p_Var7;
  long lVar8;
  long *plVar9;
  __tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
  *p_Var10;
  undefined1 auStack_68 [8];
  undefined8 local_60;
  long local_58;
  
  lVar5 = tpidr_el0;
  local_58 = *(long *)(lVar5 + 0x28);
  this = (mutex *)(in_x0 + 0x2b0);
  std::__ndk1::mutex::lock(this);
  plVar9 = in_x8 + 1;
  *plVar9 = 0;
  in_x8[2] = 0;
  *in_x8 = (long)plVar9;
  p_Var1 = in_x0 + 0x2e0;
  p_Var10 = *(__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
              **)(in_x0 + 0x2d8);
  do {
    while( true ) {
      if (p_Var10 == p_Var1) {
        std::__ndk1::mutex::unlock(this);
        if (*(long *)(lVar5 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
          __stack_chk_fail();
        }
        return;
      }
                    /* try { // try from 00993434 to 0099346b has its CatchHandler @ 0099354c */
      in_x0 = (__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
               *)std::__ndk1::
                 __tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
                 ::__find_equal<std::__ndk1::shared_ptr<ix::WebSocket>>
                           (in_x0,plVar9,&local_60,auStack_68,p_Var10 + 0x20);
      if (*(long *)in_x0 == 0) break;
      p_Var7 = *(__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
                 **)(p_Var10 + 8);
      if (*(__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
            **)(p_Var10 + 8) !=
          (__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
           *)0x0) goto LAB_009934d4;
LAB_009934e4:
      p_Var7 = p_Var10 + 0x10;
      if (*(__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
            **)*(__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
                 **)p_Var7 == p_Var10) {
        p_Var10 = *(__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
                    **)p_Var7;
      }
      else {
        do {
          lVar8 = *(long *)p_Var7;
          p_Var7 = (__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
                    *)(lVar8 + 0x10);
          p_Var10 = *(__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
                      **)p_Var7;
        } while (*(long *)p_Var10 != lVar8);
      }
    }
    p_Var6 = operator_new(0x30);
    *(undefined8 *)(p_Var6 + 0x20) = *(undefined8 *)(p_Var10 + 0x20);
    lVar8 = *(long *)(p_Var10 + 0x28);
    *(long *)(p_Var6 + 0x28) = lVar8;
    if (lVar8 != 0) {
      plVar2 = (long *)(lVar8 + 8);
      do {
        cVar3 = '\x01';
        bVar4 = (bool)ExclusiveMonitorPass(plVar2,0x10);
        if (bVar4) {
          *plVar2 = *plVar2 + 1;
          cVar3 = ExclusiveMonitorsStatus();
        }
      } while (cVar3 != '\0');
    }
    *(undefined8 *)p_Var6 = 0;
    *(undefined8 *)(p_Var6 + 8) = 0;
    *(undefined8 *)(p_Var6 + 0x10) = local_60;
    *(__tree_node_base **)in_x0 = p_Var6;
    if (*(long *)*in_x8 != 0) {
      *in_x8 = *(long *)*in_x8;
      p_Var6 = *(__tree_node_base **)in_x0;
    }
    in_x0 = (__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
             *)in_x8[1];
    std::__ndk1::__tree_balance_after_insert<std::__ndk1::__tree_node_base<void*>*>
              ((__tree_node_base *)in_x0,p_Var6);
    in_x8[2] = in_x8[2] + 1;
    p_Var7 = *(__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
               **)(p_Var10 + 8);
    if (*(__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
          **)(p_Var10 + 8) ==
        (__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
         *)0x0) goto LAB_009934e4;
LAB_009934d4:
    do {
      p_Var10 = p_Var7;
      p_Var7 = *(__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
                 **)p_Var10;
    } while (*(__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
               **)p_Var10 !=
             (__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
              *)0x0);
  } while( true );
}

