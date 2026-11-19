/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a390c
 */

/* WARNING: Type propagation algorithm not settling */
/* ix::SocketOpenSSL::~SocketOpenSSL() */

void __thiscall ix::SocketOpenSSL::~SocketOpenSSL(SocketOpenSSL *this)

{
  SocketOpenSSL SVar1;
  
  *(undefined ***)this = &PTR__SocketOpenSSL_00c524b0;
                    /* try { // try from 009a392c to 009a392f has its CatchHandler @ 009a39bc */
  close(this);
  std::__ndk1::mutex::~mutex((mutex *)(this + 0xe0));
  if (((byte)this[0xc0] & 1) == 0) {
    SVar1 = this[0xa0];
  }
  else {
    operator_delete(*(void **)(this + 0xd0));
    SVar1 = this[0xa0];
  }
  if (((byte)SVar1 & 1) == 0) {
    SVar1 = this[0x88];
  }
  else {
    operator_delete(*(void **)(this + 0xb0));
    SVar1 = this[0x88];
  }
  if (((byte)SVar1 & 1) == 0) {
    SVar1 = this[0x70];
  }
  else {
    operator_delete(*(void **)(this + 0x98));
    SVar1 = this[0x70];
  }
  if (((byte)SVar1 & 1) == 0) {
    SVar1 = this[0x58];
  }
  else {
    operator_delete(*(void **)(this + 0x80));
    SVar1 = this[0x58];
  }
  if (((byte)SVar1 & 1) != 0) {
    operator_delete(*(void **)(this + 0x68));
  }
  Socket::~Socket((Socket *)this);
  return;
}

