/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c0f18
 */

void tls1_get_supported_groups(long param_1,long *param_2,undefined8 *param_3)

{
  uint uVar1;
  undefined2 *puVar2;
  
  uVar1 = *(uint *)(*(long *)(param_1 + 0x898) + 0x1c) & 0x30000;
  if (uVar1 == 0x10000) {
    puVar2 = &DAT_0074cd84;
  }
  else {
    if (uVar1 != 0x20000) {
      if (uVar1 == 0x30000) {
        *param_2 = (long)&DAT_0074cd84;
        *param_3 = 2;
        return;
      }
      if (*(long *)(param_1 + 0xac8) == 0) {
        *param_2 = *(long *)(*(long *)(param_1 + 0x9a8) + 0x288);
        *param_3 = *(undefined8 *)(*(long *)(param_1 + 0x9a8) + 0x290);
        return;
      }
      *param_2 = *(long *)(param_1 + 0xac8);
      *param_3 = *(undefined8 *)(param_1 + 0xac0);
      return;
    }
    puVar2 = &DAT_0074cd86;
  }
  *param_2 = (long)puVar2;
  *param_3 = 1;
  return;
}

