/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00985fa0
 */

/* ix::SocketConnect::connectToAddress(addrinfo const*, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >&, std::__ndk1::function<bool ()>
   const&) */

ulong ix::SocketConnect::connectToAddress
                (addrinfo *param_1,basic_string_conflict *param_2,function *param_3)

{
  undefined8 uVar1;
  basic_string_conflict bVar2;
  long lVar3;
  long *plVar4;
  uint __fd;
  int iVar5;
  ulong uVar6;
  ix *this;
  char *pcVar7;
  size_t sVar8;
  basic_string_conflict *pbVar9;
  bool bVar10;
  ulong local_98 [2];
  void *local_88;
  long *local_80;
  undefined7 uStack_78;
  undefined1 local_71;
  undefined7 uStack_70;
  long local_68;
  
  lVar3 = tpidr_el0;
  local_68 = *(long *)(lVar3 + 0x28);
  std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
  assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)param_2,
         "no error",8);
  __fd = socket(param_1->ai_family,param_1->ai_socktype,param_1->ai_protocol);
  if ((int)__fd < 0) {
    pcVar7 = "Cannot create a socket";
    uVar6 = 0x16;
LAB_0098620c:
    std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)param_2
           ,pcVar7,uVar6);
  }
  else {
    local_98[0] = CONCAT44(local_98[0]._4_4_,1);
    setsockopt(__fd,6,1,local_98,4);
    fcntl(__fd,4,0x800);
    iVar5 = ::connect(__fd,(sockaddr *)param_1->ai_canonname,param_1->ai_addrlen);
    if ((iVar5 != -1) || (uVar6 = Socket::isWaitNeeded(), (uVar6 & 1) != 0)) {
      do {
        this = (ix *)0x0;
        if ((*(long **)(param_3 + 0x20) != (long *)0x0) &&
           (this = (ix *)(**(code **)(**(long **)(param_3 + 0x20) + 0x30))(), ((ulong)this & 1) != 0
           )) {
          Socket::closeSocket(__fd);
          pcVar7 = "Cancelled";
          uVar6 = 9;
          goto LAB_0098620c;
        }
        createSelectInterrupt(this);
                    /* try { // try from 00986088 to 009860bb has its CatchHandler @ 009862b0 */
        iVar5 = Socket::poll(false,10,__fd,(unique_ptr *)&local_80);
        if (iVar5 == 1) {
          bVar10 = false;
          param_1 = (addrinfo *)(ulong)__fd;
        }
        else if (iVar5 == 2) {
          bVar10 = true;
        }
        else {
          if (iVar5 == 3) {
            Socket::closeSocket(__fd);
            local_98[1] = 0;
            local_98[0] = 0x1e;
            builtin_strncpy((char *)((ulong)local_98 | 1),"Connect error: ",0xf);
            local_88 = (void *)0x0;
                    /* try { // try from 009860dc to 009860fb has its CatchHandler @ 00986294 */
            iVar5 = Socket::getErrno();
            pcVar7 = strerror(iVar5);
            sVar8 = strlen(pcVar7);
            pbVar9 = (basic_string_conflict *)
                     std::__ndk1::
                     basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                     ::append((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                               *)local_98,pcVar7,sVar8);
          }
          else {
                    /* try { // try from 00986114 to 0098611b has its CatchHandler @ 009862b0 */
            Socket::closeSocket(__fd);
            local_98[1] = 0;
            local_98[0] = 0x1e;
            builtin_strncpy((char *)((ulong)local_98 | 1),"Connect error: ",0xf);
            local_88 = (void *)0x0;
                    /* try { // try from 0098613c to 0098615b has its CatchHandler @ 00986298 */
            iVar5 = Socket::getErrno();
            pcVar7 = strerror(iVar5);
            sVar8 = strlen(pcVar7);
            pbVar9 = (basic_string_conflict *)
                     std::__ndk1::
                     basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                     ::append((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                               *)local_98,pcVar7,sVar8);
          }
          uVar1 = *(undefined8 *)(pbVar9 + 0x10);
          bVar2 = *pbVar9;
          uStack_70 = (undefined7)((ulong)*(undefined8 *)(pbVar9 + 8) >> 8);
          uStack_78 = (undefined7)*(undefined8 *)(pbVar9 + 1);
          local_71 = (undefined1)((ulong)*(undefined8 *)(pbVar9 + 1) >> 0x38);
          *(undefined8 *)pbVar9 = 0;
          *(undefined8 *)(pbVar9 + 8) = 0;
          *(undefined8 *)(pbVar9 + 0x10) = 0;
          if (((byte)*param_2 & 1) == 0) {
            *(undefined2 *)param_2 = 0;
          }
          else {
            **(undefined1 **)(param_2 + 0x10) = 0;
            *(undefined8 *)(param_2 + 8) = 0;
            if (((byte)*param_2 & 1) != 0) {
              operator_delete(*(void **)(param_2 + 0x10));
              *(undefined8 *)param_2 = 0;
            }
          }
          *param_2 = bVar2;
          *(ulong *)(param_2 + 8) = CONCAT71(uStack_70,local_71);
          *(ulong *)(param_2 + 1) = CONCAT17(local_71,uStack_78);
          *(undefined8 *)(param_2 + 0x10) = uVar1;
          uStack_70 = 0;
          uStack_78 = 0;
          local_71 = 0;
          if ((local_98[0] & 1) != 0) {
            operator_delete(local_88);
          }
          bVar10 = false;
          param_1 = (addrinfo *)0xffffffff;
        }
        plVar4 = local_80;
        local_80 = (long *)0x0;
        if (plVar4 != (long *)0x0) {
          (**(code **)(*plVar4 + 8))();
        }
      } while (bVar10);
      goto LAB_00986244;
    }
    iVar5 = Socket::getErrno();
    pcVar7 = strerror(iVar5);
    sVar8 = strlen(pcVar7);
    std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)param_2
           ,pcVar7,sVar8);
    Socket::closeSocket(__fd);
  }
  param_1 = (addrinfo *)0xffffffff;
LAB_00986244:
  if (*(long *)(lVar3 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return (ulong)param_1 & 0xffffffff;
}

