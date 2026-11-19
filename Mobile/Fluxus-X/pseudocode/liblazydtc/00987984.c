/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00987984
 */

/* ix::SocketServer::SocketServer(int, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&, int, unsigned long, int)
    */

void __thiscall
ix::SocketServer::SocketServer
          (SocketServer *this,int param_1,basic_string_conflict *param_2,int param_3,ulong param_4,
          int param_5)

{
  ix *this_00;
  ulong __n;
  void *__src;
  SocketServer *pSVar1;
  SocketServer *__dest;
  ulong uVar2;
  undefined8 uVar3;
  
  *(int *)(this + 8) = param_1;
  *(undefined ***)this = &PTR__SocketServer_00c52040;
  pSVar1 = this + 0x10;
  *(undefined8 *)pSVar1 = 0;
  *(undefined8 *)(this + 0x18) = 0;
  *(undefined8 *)(this + 0x20) = 0;
  if (((byte)*param_2 & 1) == 0) {
    *(undefined8 *)(this + 0x20) = *(undefined8 *)(param_2 + 0x10);
    uVar3 = *(undefined8 *)param_2;
    *(undefined8 *)(this + 0x18) = *(undefined8 *)(param_2 + 8);
    *(undefined8 *)pSVar1 = uVar3;
    goto LAB_00987a50;
  }
  __n = *(ulong *)(param_2 + 8);
  if (0xffffffffffffffef < __n) {
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__basic_string_common<true>::__throw_length_error();
  }
  __src = *(void **)(param_2 + 0x10);
  if (__n < 0x17) {
    __dest = this + 0x11;
    *pSVar1 = SUB41((int)__n << 1,0);
    if (__n != 0) goto LAB_00987a3c;
  }
  else {
    uVar2 = __n + 0x10 & 0xfffffffffffffff0;
    __dest = operator_new(uVar2);
    *(ulong *)(this + 0x18) = __n;
    *(SocketServer **)(this + 0x20) = __dest;
    *(ulong *)(this + 0x10) = uVar2 | 1;
LAB_00987a3c:
    memcpy(__dest,__src,__n);
  }
  __dest[__n] = (SocketServer)0x0;
LAB_00987a50:
  *(undefined8 *)(this + 0x44) = 0;
  *(int *)(this + 0x38) = param_5;
  *(undefined4 *)(this + 0x3c) = 0xffffffff;
  *(undefined8 *)(this + 0x5c) = 0;
  *(undefined8 *)(this + 100) = 0;
  *(undefined8 *)(this + 0x4c) = 0;
  *(undefined8 *)(this + 0x54) = 0;
  *(ulong *)(this + 0x30) = param_4;
  *(int *)(this + 0x28) = param_3;
  this[0x40] = (SocketServer)0x0;
  *(undefined8 *)(this + 0x70) = 0;
  this[0x78] = (SocketServer)0x0;
  *(undefined8 *)(this + 0x80) = 0;
  *(SocketServer **)(this + 0x88) = this + 0x88;
  *(SocketServer **)(this + 0x90) = this + 0x88;
  memset(this + 0x98,0,0x88);
  *(undefined ***)(this + 0x120) = &PTR_LAB_00c52108;
  *(SocketServer **)(this + 0x140) = this + 0x120;
  *(code **)(this + 0x128) = ConnectionState::createConnectionState;
  this_00 = memset(this + 0x150,0,0x48);
  this[0x180] = (SocketServer)0xc;
  *(undefined4 *)(this + 0x181) = 0x54535953;
  *(undefined2 *)(this + 0x185) = 0x4d45;
  this[0x187] = (SocketServer)0x0;
  *(undefined8 *)(this + 0x1a8) = 0;
  *(undefined8 *)(this + 0x198) = 0;
  this[0x198] = (SocketServer)0xe;
  *(undefined8 *)(this + 0x1a0) = 0;
  *(undefined2 *)(this + 0x19d) = 0x4c55;
  *(undefined4 *)(this + 0x199) = 0x41464544;
  this[0x19f] = (SocketServer)0x54;
  this[0x1a0] = (SocketServer)0x0;
  *(undefined2 *)(this + 0x1b0) = 0;
  *(undefined8 *)(this + 0x1c8) = 0;
  *(undefined8 *)(this + 0x1b8) = 0;
  *(undefined8 *)(this + 0x1c0) = 0;
  this[0x1d0] = (SocketServer)0x0;
                    /* try { // try from 00987b94 to 00987b97 has its CatchHandler @ 00987bd0 */
  createSelectInterrupt(this_00);
  memset(this + 0x1e0,0,0x59);
  return;
}

