/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00993040
 */

/* ix::WebSocketServer::WebSocketServer(int, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&, int, unsigned long, int,
   int) */

void __thiscall
ix::WebSocketServer::WebSocketServer
          (WebSocketServer *this,int param_1,basic_string_conflict *param_2,int param_3,
          ulong param_4,int param_5,int param_6)

{
  SocketServer::SocketServer((SocketServer *)this,param_1,param_2,param_3,param_4,param_6);
  *(undefined2 *)(this + 0x240) = 0x101;
  *(int *)(this + 0x23c) = param_5;
  *(undefined8 *)(this + 0x270) = 0;
  *(undefined8 *)(this + 0x2a0) = 0;
  *(undefined8 *)(this + 0x2d0) = 0;
  *(undefined8 *)(this + 0x2c8) = 0;
  *(undefined8 *)(this + 0x2c0) = 0;
  *(undefined8 *)(this + 0x2b8) = 0;
  *(undefined8 *)(this + 0x2b0) = 0;
  *(undefined8 *)(this + 0x2e8) = 0;
  *(undefined8 *)(this + 0x2e0) = 0;
  *(undefined ***)this = &PTR__WebSocketServer_00c522f0;
  *(WebSocketServer **)(this + 0x2d8) = this + 0x2e0;
  return;
}

