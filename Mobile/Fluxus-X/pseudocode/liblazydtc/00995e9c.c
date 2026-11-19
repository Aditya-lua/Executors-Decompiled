/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00995e9c
 */

/* ix::WebSocketTransport::configure(ix::WebSocketPerMessageDeflateOptions const&,
   ix::SocketTLSOptions const&, bool, int) */

void __thiscall
ix::WebSocketTransport::configure
          (WebSocketTransport *this,WebSocketPerMessageDeflateOptions *param_1,
          SocketTLSOptions *param_2,bool param_3,int param_4)

{
  byte bVar1;
  
  this[0x184] = *(WebSocketTransport *)(param_1 + 4);
  *(undefined4 *)(this + 0x180) = *(undefined4 *)param_1;
  bVar1 = WebSocketPerMessageDeflateOptions::enabled
                    ((WebSocketPerMessageDeflateOptions *)(this + 0x180));
  this[0x185] = (WebSocketTransport)(bVar1 & 1);
  SocketTLSOptions::operator=((SocketTLSOptions *)(this + 0x1b8),param_2);
  this[0x278] = (WebSocketTransport)param_3;
  *(int *)(this + 0x27c) = param_4;
  return;
}

