/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a2dec
 */

/* ix::WebSocketPerMessageDeflateDecompressor::init(unsigned char, bool) */

undefined8 __thiscall
ix::WebSocketPerMessageDeflateDecompressor::init
          (WebSocketPerMessageDeflateDecompressor *this,uchar param_1,bool param_2)

{
  int iVar1;
  undefined8 uVar2;
  undefined4 uVar3;
  
  iVar1 = inflateInit2_(this + 0x4008,-(uint)param_1,"1.3.1",0x70);
  uVar2 = 0;
  if (iVar1 == 0) {
    uVar3 = 2;
    if (param_2) {
      uVar3 = 3;
    }
    uVar2 = 1;
    *(undefined4 *)this = uVar3;
  }
  return uVar2;
}

