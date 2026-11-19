/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0092f258
 */

undefined8 FUN_0092f258(long param_1,undefined8 *param_2,undefined8 *param_3)

{
  long lVar1;
  char *pcVar2;
  long lVar3;
  
  *param_2 = 0;
  *param_3 = 0;
  lVar3 = *(long *)(param_1 + 0xc0);
  if (lVar3 == 0) {
    pcVar2 = "transfer has no multi handle";
LAB_0092f328:
    FUN_00904b80(param_1,pcVar2);
    return 2;
  }
  if (*(uint *)(param_1 + 0x6e4) == 0) {
    pcVar2 = "transfer buffer size is 0";
    goto LAB_0092f328;
  }
  if ((*(byte *)(lVar3 + 0x231) >> 5 & 1) != 0) {
    FUN_00904b80(param_1,"attempt to borrow xfer_buf when already borrowed");
    return 0x51;
  }
  if (*(long *)(lVar3 + 0xd8) != 0) {
    if ((ulong)*(uint *)(param_1 + 0x6e4) <= *(ulong *)(lVar3 + 0xe0)) goto LAB_0092f2e8;
    (*(code *)PTR_free_00cc4678)();
    lVar3 = *(long *)(param_1 + 0xc0);
    *(undefined8 *)(lVar3 + 0xd8) = 0;
    *(undefined8 *)(lVar3 + 0xe0) = 0;
  }
  lVar1 = (*(code *)PTR_malloc_00cc4670)(*(undefined4 *)(param_1 + 0x6e4));
  lVar3 = *(long *)(param_1 + 0xc0);
  *(long *)(lVar3 + 0xd8) = lVar1;
  if (lVar1 == 0) {
    FUN_00904b80(param_1,"could not allocate xfer_buf of %zu bytes");
    return 0x1b;
  }
  *(ulong *)(lVar3 + 0xe0) = (ulong)*(uint *)(param_1 + 0x6e4);
LAB_0092f2e8:
  *(byte *)(lVar3 + 0x231) = *(byte *)(lVar3 + 0x231) | 0x20;
  *param_2 = *(undefined8 *)(*(long *)(param_1 + 0xc0) + 0xd8);
  *param_3 = *(undefined8 *)(*(long *)(param_1 + 0xc0) + 0xe0);
  return 0;
}

