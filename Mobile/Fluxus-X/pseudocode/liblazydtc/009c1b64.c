/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c1b64
 */

void tls1_get_formatlist(long param_1,long *param_2,undefined8 *param_3)

{
  undefined8 uVar1;
  
  if (*(long *)(param_1 + 0xaa8) != 0) {
    *param_2 = *(long *)(param_1 + 0xaa8);
    *param_3 = *(undefined8 *)(param_1 + 0xaa0);
    return;
  }
  *param_2 = (long)&DAT_0074cd88;
  uVar1 = 2;
  if ((*(byte *)(*(long *)(param_1 + 0x898) + 0x1e) & 3) == 0) {
    uVar1 = 3;
  }
  *param_3 = uVar1;
  return;
}

