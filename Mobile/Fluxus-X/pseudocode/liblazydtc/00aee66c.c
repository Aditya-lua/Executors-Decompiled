/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aee66c
 */

void * UI_add_user_data(UI *ui,void *user_data)

{
  void *pvVar1;
  uint uVar2;
  
  uVar2 = *(uint *)(ui + 0x28);
  pvVar1 = *(void **)(ui + 0x10);
  if ((uVar2 >> 1 & 1) != 0) {
    (**(code **)(*(long *)ui + 0x38))(ui,pvVar1);
    uVar2 = *(uint *)(ui + 0x28);
    pvVar1 = (void *)0x0;
  }
  *(void **)(ui + 0x10) = user_data;
  *(uint *)(ui + 0x28) = uVar2 & 0xfffffffd;
  return pvVar1;
}

