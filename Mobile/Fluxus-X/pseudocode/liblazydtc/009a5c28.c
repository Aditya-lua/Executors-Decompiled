/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a5c28
 */

/* ix::SocketTLSOptions::isPeerVerifyDisabled() const */

bool __thiscall ix::SocketTLSOptions::isPeerVerifyDisabled(SocketTLSOptions *this)

{
  ulong uVar1;
  SocketTLSOptions SVar2;
  undefined *__s2;
  int iVar3;
  size_t __n;
  SocketTLSOptions *__s1;
  
  __s2 = kTLSCAFileDisableVerify;
  __n = strlen(kTLSCAFileDisableVerify);
  SVar2 = this[0x30];
  uVar1 = (ulong)((byte)SVar2 >> 1);
  if (((byte)SVar2 & 1) != 0) {
    uVar1 = *(ulong *)(this + 0x38);
  }
  if (__n != uVar1) {
    return false;
  }
  if (__n != 0) {
    if (__n == 0xffffffffffffffff) {
                    /* try { // try from 009a5cb4 to 009a5cb7 has its CatchHandler @ 009a5cb8 */
      std::__ndk1::__basic_string_common<true>::__throw_out_of_range();
                    /* WARNING: Subroutine does not return */
                    /* catch(type#1 @ 00000000) { ... } // from try @ 009a5cb4 with catch @ 009a5cb8
                        */
      FUN_007fe114();
    }
    __s1 = *(SocketTLSOptions **)(this + 0x40);
    if (((byte)SVar2 & 1) == 0) {
      __s1 = this + 0x31;
    }
    iVar3 = memcmp(__s1,__s2,__n);
    if (iVar3 != 0) goto LAB_009a5c9c;
  }
  iVar3 = 0;
LAB_009a5c9c:
  return iVar3 == 0;
}

