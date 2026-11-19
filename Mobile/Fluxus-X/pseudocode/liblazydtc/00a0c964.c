/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0c964
 */

int CONF_module_add(char *name,undefined1 *ifunc,undefined1 *ffunc)

{
  long lVar1;
  
  lVar1 = FUN_00a0c990(0,name,ifunc,ffunc);
  return (int)(lVar1 != 0);
}

