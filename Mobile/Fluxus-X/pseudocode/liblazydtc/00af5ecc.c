/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af5ecc
 */

undefined2 X509v3_addr_get_afi(undefined8 *param_1)

{
  undefined2 uVar1;
  undefined1 *puVar2;
  int *piVar3;
  
  uVar1 = 0;
  if (param_1 != (undefined8 *)0x0) {
    piVar3 = (int *)*param_1;
    if (piVar3 == (int *)0x0) {
      return 0;
    }
    puVar2 = *(undefined1 **)(piVar3 + 2);
    if (puVar2 == (undefined1 *)0x0) {
      return 0;
    }
    uVar1 = 0;
    if (1 < *piVar3) {
      uVar1 = CONCAT11(*puVar2,puVar2[1]);
    }
  }
  return uVar1;
}

