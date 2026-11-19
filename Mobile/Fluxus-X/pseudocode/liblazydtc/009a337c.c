/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a337c
 */

/* ix::SocketOpenSSL::SocketOpenSSL(ix::SocketTLSOptions const&, int) */

void __thiscall
ix::SocketOpenSSL::SocketOpenSSL(SocketOpenSSL *this,SocketTLSOptions *param_1,int param_2)

{
  long lVar1;
  SocketOpenSSL *local_68;
  code *local_60;
  undefined8 uStack_58;
  undefined ***local_50;
  code **local_48;
  SocketOpenSSL **ppSStack_40;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  Socket::Socket((Socket *)this,param_2);
  *(undefined8 *)(this + 0x40) = 0;
  *(undefined8 *)(this + 0x48) = 0;
  *(undefined ***)this = &PTR__SocketOpenSSL_00c524b0;
                    /* try { // try from 009a33c4 to 009a33cf has its CatchHandler @ 009a34e8 */
  SocketTLSOptions::SocketTLSOptions((SocketTLSOptions *)(this + 0x58),param_1);
  *(undefined8 *)(this + 0x100) = 0;
  *(undefined8 *)(this + 0xe8) = 0;
  *(undefined8 *)(this + 0xe0) = 0;
  *(undefined8 *)(this + 0xf8) = 0;
  *(undefined8 *)(this + 0xf0) = 0;
  uStack_58 = 0;
  local_60 = openSSLInitialize;
  local_68 = this;
  if (_openSSLInitFlag != -1) {
    local_48 = &local_60;
    ppSStack_40 = &local_68;
    local_50 = &local_48;
                    /* try { // try from 009a3420 to 009a3437 has its CatchHandler @ 009a3460 */
    std::__ndk1::__call_once
              ((ulong *)&_openSSLInitFlag,&local_50,
               std::__ndk1::
               __call_once_proxy<std::__ndk1::tuple<void(ix::SocketOpenSSL::*&&)(),ix::SocketOpenSSL*&&>>
              );
  }
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

