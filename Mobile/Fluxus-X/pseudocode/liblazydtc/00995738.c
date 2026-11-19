/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00995738
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* ix::WebSocketTransport::WebSocketTransport() */

void __thiscall ix::WebSocketTransport::WebSocketTransport(WebSocketTransport *this)

{
  char *pcVar1;
  undefined8 uVar2;
  ulong uVar3;
  
  *(undefined8 *)this = 0;
  *(undefined8 *)(this + 8) = 0;
  *(undefined8 *)(this + 0x10) = 0;
  *(undefined2 *)(this + 0x18) = 1;
  memset((vector<unsigned_char,std::__ndk1::allocator<unsigned_char>> *)(this + 0x20),0,0x70);
  *(undefined8 *)(this + 0xb0) = 0;
  *(WebSocketTransport **)(this + 0x98) = this + 0x90;
  *(undefined8 *)(this + 0xa0) = 0;
  this[0xac] = (WebSocketTransport)0x0;
  *(undefined8 *)(this + 0xd0) = 0;
  *(undefined8 *)(this + 0xd8) = 0;
  *(undefined8 *)(this + 0xc0) = 0;
  *(undefined8 *)(this + 200) = 0;
  *(WebSocketTransport **)(this + 0x90) = this + 0x90;
  *(undefined8 *)(this + 0xb8) = 0;
  *(undefined4 *)(this + 0xe0) = 1;
  *(undefined8 *)(this + 0x110) = 0;
  *(undefined8 *)(this + 0x150) = 0;
  *(undefined8 *)(this + 0x158) = 0;
  *(undefined8 *)(this + 0x140) = 0;
  *(undefined8 *)(this + 0x148) = 0;
  *(undefined8 *)(this + 0x130) = 0;
  *(undefined8 *)(this + 0x138) = 0;
  *(undefined8 *)(this + 0x120) = 0;
  *(undefined8 *)(this + 0x128) = 0;
  *(undefined8 *)(this + 0x168) = 0;
  this[0x170] = (WebSocketTransport)0x0;
  *(undefined8 *)(this + 0x178) = 0;
  *(undefined2 *)(this + 0x160) = 0x3f3;
                    /* try { // try from 009957f8 to 0099580f has its CatchHandler @ 009959dc */
  WebSocketPerMessageDeflateOptions::WebSocketPerMessageDeflateOptions
            ((WebSocketPerMessageDeflateOptions *)(this + 0x180),false,false,false,'\x0f','\x0f');
  this[0x185] = (WebSocketTransport)0x0;
  memset(this + 0x188,0,0x78);
  this[0x1e8] = (WebSocketTransport)0xc;
  *(undefined2 *)(this + 0x1ed) = 0x4d45;
  *(undefined4 *)(this + 0x1e9) = 0x54535953;
  this[0x1ef] = (WebSocketTransport)0x0;
  *(undefined8 *)(this + 0x210) = 0;
  *(undefined8 *)(this + 0x208) = 0;
  *(undefined8 *)(this + 0x200) = 0;
  this[0x200] = (WebSocketTransport)0xe;
  *(undefined2 *)(this + 0x205) = 0x4c55;
  *(undefined4 *)(this + 0x201) = 0x41464544;
  this[0x207] = (WebSocketTransport)0x54;
  this[0x208] = (WebSocketTransport)0x0;
  *(undefined2 *)(this + 0x218) = 0;
  *(undefined8 *)(this + 0x230) = 0;
  *(undefined8 *)(this + 0x228) = 0;
  *(undefined8 *)(this + 0x220) = 0;
  this[0x238] = (WebSocketTransport)0x0;
  this[0x240] = (WebSocketTransport)0x0;
  *(undefined8 *)(this + 0x264) = 0;
  *(undefined8 *)(this + 0x25c) = 0;
  *(undefined8 *)(this + 0x254) = 0;
  *(undefined8 *)(this + 0x24c) = 0;
  *(undefined8 *)(this + 0x244) = 0;
  uVar2 = std::__ndk1::chrono::steady_clock::now();
  *(undefined8 *)(this + 0x270) = uVar2;
  this[0x278] = (WebSocketTransport)0x1;
  *(undefined2 *)(this + 0x280) = 0;
  *(undefined4 *)(this + 0x27c) = 0xffffffff;
  this[0x288] = (WebSocketTransport)0x2c;
  *(undefined8 *)(this + 0x297) = 0x7461656274726165;
  *(undefined8 *)(this + 0x291) = 0x6165683a3a74656b;
  *(undefined8 *)(this + 0x289) = 0x636f736265777869;
  this[0x29f] = (WebSocketTransport)0x0;
  *(undefined4 *)(this + 0x2a0) = 2;
  *(undefined8 *)(this + 0x2d0) = 0;
  *(undefined8 *)(this + 0x2c8) = 0;
  *(undefined8 *)(this + 0x2c0) = 0;
  *(undefined8 *)(this + 0x2b8) = 0;
  *(undefined8 *)(this + 0x2b0) = 0;
  *(undefined8 *)(this + 0x2a8) = 0;
  uVar2 = std::__ndk1::chrono::steady_clock::now();
  *(undefined8 *)(this + 0x2d8) = uVar2;
                    /* try { // try from 0099592c to 00995933 has its CatchHandler @ 009959e8 */
  std::__ndk1::mutex::lock((mutex *)(this + 0x138));
  if ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
      (this + 0x120) !=
      (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
      &WebSocketCloseConstants::kInternalErrorMessage) {
    if ((WebSocketCloseConstants::kInternalErrorMessage & 1) == 0) {
      uVar3 = (ulong)(WebSocketCloseConstants::kInternalErrorMessage >> 1);
      pcVar1 = (char *)&DAT_00d21729;
    }
    else {
      uVar3 = ram0x00d21730;
      pcVar1 = DAT_00d21738;
    }
                    /* try { // try from 0099595c to 00995963 has its CatchHandler @ 009959c0 */
    std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
           (this + 0x120),pcVar1,uVar3);
  }
  std::__ndk1::mutex::unlock((mutex *)(this + 0x138));
  uVar3 = *(long *)(this + 0x28) - *(long *)(this + 0x20);
  if (uVar3 >> 0xf == 0) {
                    /* try { // try from 00995984 to 0099598b has its CatchHandler @ 009959e8 */
    std::__ndk1::vector<unsigned_char,std::__ndk1::allocator<unsigned_char>>::__append
              ((vector<unsigned_char,std::__ndk1::allocator<unsigned_char>> *)(this + 0x20),
               0x8000 - uVar3);
  }
  else if (uVar3 != 0x8000) {
    *(long *)(this + 0x28) = *(long *)(this + 0x20) + 0x8000;
  }
  return;
}

