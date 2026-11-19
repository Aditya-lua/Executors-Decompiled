/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a5cbc
 */

/* ix::SocketTLSOptions::isUsingDefaultCiphers() const */

bool __thiscall ix::SocketTLSOptions::isUsingDefaultCiphers(SocketTLSOptions *this)

{
  size_t sVar1;
  SocketTLSOptions SVar2;
  undefined *__s2;
  int iVar3;
  size_t __n;
  SocketTLSOptions *__s1;
  
  __s2 = kTLSCiphersUseDefault;
  SVar2 = this[0x48];
  if (((byte)SVar2 & 1) == 0) {
    if ((byte)SVar2 >> 1 == 0) {
      return true;
    }
  }
  else if (*(long *)(this + 0x50) == 0) {
    return true;
  }
  __n = strlen(kTLSCiphersUseDefault);
  sVar1 = (ulong)((byte)SVar2 >> 1);
  if (((byte)SVar2 & 1) != 0) {
    sVar1 = *(size_t *)(this + 0x50);
  }
  if (__n != sVar1) {
    return false;
  }
  if (__n != 0) {
    if (__n == 0xffffffffffffffff) {
                    /* try { // try from 009a5d68 to 009a5d6f has its CatchHandler @ 009a5d70 */
      std::__ndk1::__basic_string_common<true>::__throw_out_of_range();
                    /* WARNING: Subroutine does not return */
                    /* catch(type#1 @ 00000000) { ... } // from try @ 009a5d68 with catch @ 009a5d70
                        */
      FUN_007fe114();
    }
    __s1 = *(SocketTLSOptions **)(this + 0x58);
    if (((byte)SVar2 & 1) == 0) {
      __s1 = this + 0x49;
    }
    iVar3 = memcmp(__s1,__s2,__n);
    if (iVar3 != 0) goto LAB_009a5d40;
  }
  iVar3 = 0;
LAB_009a5d40:
  return iVar3 == 0;
}

