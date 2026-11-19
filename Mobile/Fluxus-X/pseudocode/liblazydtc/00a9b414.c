/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9b414
 */

undefined8 OPENSSL_DIR_end(undefined8 *param_1)

{
  int iVar1;
  undefined4 *puVar2;
  
  if ((param_1 != (undefined8 *)0x0) && ((undefined8 *)*param_1 != (undefined8 *)0x0)) {
    iVar1 = closedir(*(DIR **)*param_1);
    free((void *)*param_1);
    if (iVar1 == 0) {
      return 1;
    }
    if (iVar1 == -1) {
      return 0;
    }
  }
  puVar2 = (undefined4 *)__errno();
  *puVar2 = 0x16;
  return 0;
}

