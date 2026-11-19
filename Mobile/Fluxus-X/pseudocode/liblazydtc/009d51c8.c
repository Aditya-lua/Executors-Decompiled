/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d51c8
 */

undefined8 tls_parse_stoc_etm(long param_1)

{
  int iVar1;
  
  if (((*(byte *)(param_1 + 0x9ea) >> 3 & 1) == 0) &&
     (*(int *)(*(long *)(param_1 + 0x2e0) + 0x28) != 0x40)) {
    iVar1 = *(int *)(*(long *)(param_1 + 0x2e0) + 0x24);
    if (iVar1 < 0x40000) {
      if ((iVar1 != 4) && (iVar1 != 0x400)) goto LAB_009d521c;
    }
    else if ((iVar1 != 0x40000) && ((iVar1 != 0x400000 && (iVar1 != 0x800000)))) {
LAB_009d521c:
      *(undefined4 *)(param_1 + 0xb2c) = 1;
      return 1;
    }
  }
  return 1;
}

