/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c29558
 */

undefined8 __cxa_throw(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  long lVar1;
  
  lVar1 = __cxa_get_globals();
  *(int *)(lVar1 + 8) = *(int *)(lVar1 + 8) + 1;
  lVar1 = __cxa_init_primary_exception(param_1,param_2,param_3);
  *(undefined8 *)(lVar1 + 8) = 1;
  FUN_00c2bd40(lVar1 + 0x60);
  lVar1 = FUN_00c295b4(lVar1);
  __cxa_begin_catch(lVar1 + 0x60);
  lVar1 = FUN_00c0d774(*(undefined8 *)(lVar1 + 0x28));
  return *(undefined8 *)(lVar1 + -8);
}

