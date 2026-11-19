/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a2168
 */

/* ix::WebSocketPerMessageDeflate::init(ix::WebSocketPerMessageDeflateOptions const&) */

undefined8 __thiscall
ix::WebSocketPerMessageDeflate::init
          (WebSocketPerMessageDeflate *this,WebSocketPerMessageDeflateOptions *param_1)

{
  byte bVar1;
  uchar uVar2;
  uchar uVar3;
  ulong uVar4;
  undefined8 uVar5;
  
  bVar1 = WebSocketPerMessageDeflateOptions::getClientNoContextTakeover(param_1);
  uVar2 = WebSocketPerMessageDeflateOptions::getClientMaxWindowBits(param_1);
  uVar3 = WebSocketPerMessageDeflateOptions::getServerMaxWindowBits(param_1);
  uVar4 = WebSocketPerMessageDeflateCompressor::init
                    (*(WebSocketPerMessageDeflateCompressor **)this,uVar2,(bool)(bVar1 & 1));
  if ((uVar4 & 1) == 0) {
    return 0;
  }
  uVar5 = WebSocketPerMessageDeflateDecompressor::init
                    (*(WebSocketPerMessageDeflateDecompressor **)(this + 8),uVar3,(bool)(bVar1 & 1))
  ;
  return uVar5;
}

