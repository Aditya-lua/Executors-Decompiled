/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ea70c
 */

/* std::__ndk1::__split_buffer<cpr::Cookie, std::__ndk1::allocator<cpr::Cookie>&>::~__split_buffer()
    */

void __thiscall
std::__ndk1::__split_buffer<cpr::Cookie,std::__ndk1::allocator<cpr::Cookie>&>::~__split_buffer
          (__split_buffer<cpr::Cookie,std::__ndk1::allocator<cpr::Cookie>&> *this)

{
  long lVar1;
  byte bVar2;
  long lVar3;
  byte *pbVar4;
  
  lVar1 = *(long *)(this + 8);
  lVar3 = *(long *)(this + 0x10);
  do {
    if (lVar3 == lVar1) {
      if (*(void **)this == (void *)0x0) {
        return;
      }
      operator_delete(*(void **)this);
      return;
    }
    pbVar4 = (byte *)(lVar3 + -0x78);
    *(byte **)(this + 0x10) = pbVar4;
    if ((*(byte *)(lVar3 + -0x28) & 1) == 0) {
      if ((*(byte *)(lVar3 + -0x48) & 1) == 0) goto LAB_008ea754;
LAB_008ea778:
      operator_delete(*(void **)(lVar3 + -0x38));
      if ((*(byte *)(lVar3 + -0x60) & 1) != 0) goto LAB_008ea788;
LAB_008ea75c:
      bVar2 = *pbVar4;
    }
    else {
      operator_delete(*(void **)(lVar3 + -0x18));
      if ((*(byte *)(lVar3 + -0x48) & 1) != 0) goto LAB_008ea778;
LAB_008ea754:
      if ((*(byte *)(lVar3 + -0x60) & 1) == 0) goto LAB_008ea75c;
LAB_008ea788:
      operator_delete(*(void **)(lVar3 + -0x50));
      bVar2 = *pbVar4;
    }
    if ((bVar2 & 1) != 0) {
      operator_delete(*(void **)(lVar3 + -0x68));
    }
    lVar3 = *(long *)(this + 0x10);
  } while( true );
}

