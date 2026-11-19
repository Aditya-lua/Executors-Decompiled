/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a5b50
 */

/* ix::SocketTLSOptions::isUsingInMemoryCAs() const */

bool __thiscall ix::SocketTLSOptions::isUsingInMemoryCAs(SocketTLSOptions *this)

{
  size_t __n;
  SocketTLSOptions *pSVar1;
  byte bVar2;
  undefined *__s2;
  bool bVar3;
  int iVar4;
  size_t __n_00;
  SocketTLSOptions *pSVar5;
  ulong uVar6;
  SocketTLSOptions *pSVar7;
  
  __s2 = kTLSInMemoryMarker;
  if (((byte)this[0x30] & 1) == 0) {
    pSVar7 = this + 0x31;
    uVar6 = (ulong)((byte)this[0x30] >> 1);
  }
  else {
    uVar6 = *(ulong *)(this + 0x38);
    pSVar7 = *(SocketTLSOptions **)(this + 0x40);
  }
  __n_00 = strlen(kTLSInMemoryMarker);
  if (__n_00 == 0) {
    bVar3 = true;
  }
  else {
    pSVar1 = pSVar7 + uVar6;
    if ((long)__n_00 <= (long)uVar6) {
      bVar2 = *__s2;
      pSVar5 = pSVar7;
      do {
        __n = (uVar6 - __n_00) + 1;
        if ((__n == 0) ||
           (pSVar5 = memchr(pSVar5,(uint)bVar2,__n), pSVar5 == (SocketTLSOptions *)0x0)) break;
        iVar4 = memcmp(pSVar5,__s2,__n_00);
        if (iVar4 == 0) goto LAB_009a5bf4;
        pSVar5 = pSVar5 + 1;
        uVar6 = (long)pSVar1 - (long)pSVar5;
      } while ((long)__n_00 <= (long)uVar6);
    }
    pSVar5 = pSVar1;
LAB_009a5bf4:
    bVar3 = (long)pSVar5 - (long)pSVar7 != -1 && pSVar5 != pSVar1;
  }
  return bVar3;
}

