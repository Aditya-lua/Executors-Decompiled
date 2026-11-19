/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0092f388
 */

undefined8 FUN_0092f388(long param_1,undefined8 *param_2,undefined8 *param_3)

{
  long lVar1;
  char *pcVar2;
  long lVar3;
  
  *param_2 = 0;
  *param_3 = 0;
  lVar3 = *(long *)(param_1 + 0xc0);
  if (lVar3 == 0) {
    pcVar2 = "transfer has no multi handle";
LAB_0092f458:
    FUN_00904b80(param_1,pcVar2);
    return 2;
  }
  if (*(uint *)(param_1 + 0x6e8) == 0) {
    pcVar2 = "transfer upload buffer size is 0";
    goto LAB_0092f458;
  }
  if ((*(byte *)(lVar3 + 0x231) >> 6 & 1) != 0) {
    FUN_00904b80(param_1,"attempt to borrow xfer_ulbuf when already borrowed");
    return 0x51;
  }
  if (*(long *)(lVar3 + 0xe8) != 0) {
    if ((ulong)*(uint *)(param_1 + 0x6e8) <= *(ulong *)(lVar3 + 0xf0)) goto LAB_0092f418;
    (*(code *)PTR_free_00cc4678)();
    lVar3 = *(long *)(param_1 + 0xc0);
    *(undefined8 *)(lVar3 + 0xe8) = 0;
    *(undefined8 *)(lVar3 + 0xf0) = 0;
  }
  lVar1 = (*(code *)PTR_malloc_00cc4670)(*(undefined4 *)(param_1 + 0x6e8));
  lVar3 = *(long *)(param_1 + 0xc0);
  *(long *)(lVar3 + 0xe8) = lVar1;
  if (lVar1 == 0) {
    FUN_00904b80(param_1,"could not allocate xfer_ulbuf of %zu bytes");
    return 0x1b;
  }
  *(ulong *)(lVar3 + 0xf0) = (ulong)*(uint *)(param_1 + 0x6e8);
LAB_0092f418:
  *(byte *)(lVar3 + 0x231) = *(byte *)(lVar3 + 0x231) | 0x40;
  *param_2 = *(undefined8 *)(*(long *)(param_1 + 0xc0) + 0xe8);
  *param_3 = *(undefined8 *)(*(long *)(param_1 + 0xc0) + 0xf0);
  return 0;
}

