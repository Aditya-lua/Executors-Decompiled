/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c29740
 */

undefined8 __cxa_current_exception_type(void)

{
  long *plVar1;
  undefined8 uVar2;
  long lVar3;
  
  plVar1 = (long *)__cxa_get_globals_fast();
  uVar2 = 0;
  if (plVar1 != (long *)0x0) {
    lVar3 = *plVar1;
    if ((lVar3 == 0) || (*(ulong *)(lVar3 + 0x60) >> 8 != 0x434c4e47432b2b)) {
      uVar2 = 0;
    }
    else {
      uVar2 = *(undefined8 *)(lVar3 + 0x10);
    }
  }
  return uVar2;
}

