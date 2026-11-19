/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c209c
 */

undefined8 tls12_get_psigalgs(long param_1,int param_2,long *param_3)

{
  uint uVar1;
  long lVar2;
  undefined2 *puVar3;
  
  lVar2 = *(long *)(param_1 + 0x898);
  uVar1 = *(uint *)(lVar2 + 0x1c) & 0x30000;
  if (uVar1 == 0x10000) {
    puVar3 = &DAT_0074cd8c;
  }
  else {
    if (uVar1 != 0x20000) {
      if (uVar1 == 0x30000) {
        *param_3 = (long)&DAT_0074cd8c;
        return 2;
      }
      if ((*(int *)(param_1 + 0x38) == param_2) && (*(long *)(lVar2 + 0x1a8) != 0)) {
        *param_3 = *(long *)(lVar2 + 0x1a8);
        return *(undefined8 *)(*(long *)(param_1 + 0x898) + 0x1b0);
      }
      if (*(long *)(lVar2 + 0x198) == 0) {
        *param_3 = (long)&DAT_0074cd90;
        return 0x1c;
      }
      *param_3 = *(long *)(lVar2 + 0x198);
      return *(undefined8 *)(*(long *)(param_1 + 0x898) + 0x1a0);
    }
    puVar3 = &DAT_0074cd8e;
  }
  *param_3 = (long)puVar3;
  return 1;
}

