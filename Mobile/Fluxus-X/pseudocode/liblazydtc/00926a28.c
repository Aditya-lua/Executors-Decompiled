/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00926a28
 */

long * curl_mime_addpart(long param_1)

{
  long lVar1;
  long *plVar2;
  
  if (param_1 == 0) {
    plVar2 = (long *)0x0;
  }
  else {
    plVar2 = (long *)(*(code *)PTR_malloc_00cc4670)(0x1b8);
    if (plVar2 != (long *)0x0) {
      memset(plVar2 + 1,0,0x1a8);
      *(undefined4 *)(plVar2 + 0xf) = 0;
      plVar2[0x10] = 0;
      plVar2[0x11] = 0;
      *plVar2 = param_1;
      plVar2[0x36] = 1;
      lVar1 = param_1;
      if (*(long *)(param_1 + 0x10) != 0) {
        lVar1 = *(long *)(param_1 + 0x10);
      }
      *(long **)(lVar1 + 8) = plVar2;
      *(long **)(param_1 + 0x10) = plVar2;
    }
  }
  return plVar2;
}

