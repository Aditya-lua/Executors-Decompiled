/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a5abc
 */

/* ix::SocketTLSOptions::isUsingSystemDefaults() const */

bool __thiscall ix::SocketTLSOptions::isUsingSystemDefaults(SocketTLSOptions *this)

{
  ulong uVar1;
  SocketTLSOptions SVar2;
  undefined *__s2;
  int iVar3;
  size_t __n;
  SocketTLSOptions *__s1;
  
  __s2 = kTLSCAFileUseSystemDefaults;
  __n = strlen(kTLSCAFileUseSystemDefaults);
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
                    /* try { // try from 009a5b48 to 009a5b4b has its CatchHandler @ 009a5b4c */
      std::__ndk1::__basic_string_common<true>::__throw_out_of_range();
                    /* WARNING: Subroutine does not return */
                    /* catch(type#1 @ 00000000) { ... } // from try @ 009a5b48 with catch @ 009a5b4c
                        */
      FUN_007fe114();
    }
    __s1 = *(SocketTLSOptions **)(this + 0x40);
    if (((byte)SVar2 & 1) == 0) {
      __s1 = this + 0x31;
    }
    iVar3 = memcmp(__s1,__s2,__n);
    if (iVar3 != 0) goto LAB_009a5b30;
  }
  iVar3 = 0;
LAB_009a5b30:
  return iVar3 == 0;
}

