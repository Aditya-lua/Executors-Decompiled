/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e4b20
 */

void * FUN_008e4b20(void)

{
  void *pvVar1;
  int __prot;
  void *pvVar2;
  int __flags;
  int unaff_w19;
  void *unaff_x20;
  
  __prot = FUN_008e4bc8();
  __flags = 0x22;
  if (unaff_x20 != (void *)0x0) {
    __flags = 0x32;
  }
  pvVar2 = mmap(unaff_x20,(long)unaff_w19,__prot,__flags,-1,0);
  pvVar1 = (void *)0x0;
  if (pvVar2 != (void *)0xffffffffffffffff) {
    pvVar1 = pvVar2;
  }
  return pvVar1;
}

