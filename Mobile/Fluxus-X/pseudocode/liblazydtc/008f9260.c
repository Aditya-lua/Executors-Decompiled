/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f9260
 */

/* std::__ndk1::__vector_base<cpr::Cookie, std::__ndk1::allocator<cpr::Cookie> >::~__vector_base()
    */

void __thiscall
std::__ndk1::__vector_base<cpr::Cookie,std::__ndk1::allocator<cpr::Cookie>>::~__vector_base
          (__vector_base<cpr::Cookie,std::__ndk1::allocator<cpr::Cookie>> *this)

{
  byte bVar1;
  void *pvVar2;
  void *pvVar3;
  void *pvVar4;
  
  pvVar3 = *(void **)this;
  if (pvVar3 == (void *)0x0) {
    return;
  }
  pvVar2 = *(void **)(this + 8);
  if (*(void **)(this + 8) == pvVar3) {
    pvVar2 = pvVar3;
  }
  else {
    do {
      if ((*(byte *)((long)pvVar2 + -0x28) & 1) == 0) {
        if ((*(byte *)((long)pvVar2 + -0x48) & 1) == 0) goto LAB_008f92c4;
LAB_008f92a0:
        operator_delete(*(void **)((long)pvVar2 + -0x38));
        bVar1 = *(byte *)((long)pvVar2 + -0x60);
      }
      else {
        operator_delete(*(void **)((long)pvVar2 + -0x18));
        if ((*(byte *)((long)pvVar2 + -0x48) & 1) != 0) goto LAB_008f92a0;
LAB_008f92c4:
        bVar1 = *(byte *)((long)pvVar2 + -0x60);
      }
      if ((bVar1 & 1) != 0) {
        operator_delete(*(void **)((long)pvVar2 + -0x50));
      }
      pvVar4 = (void *)((long)pvVar2 + -0x78);
      if ((*(byte *)((long)pvVar2 + -0x78) & 1) != 0) {
        operator_delete(*(void **)((long)pvVar2 + -0x68));
      }
      pvVar2 = pvVar4;
    } while (pvVar3 != pvVar4);
    pvVar2 = *(void **)this;
  }
  *(void **)(this + 8) = pvVar3;
  operator_delete(pvVar2);
  return;
}

