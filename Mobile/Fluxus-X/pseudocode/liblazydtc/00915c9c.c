/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00915c9c
 */

undefined8 FUN_00915c9c(long param_1)

{
  *(undefined8 *)(param_1 + 0xae0) = 0;
  *(undefined8 *)(param_1 + 0xb28) = 0;
  *(undefined8 *)(param_1 + 0xb20) = 0;
  *(undefined8 *)(param_1 + 0xb18) = 0;
  *(undefined8 *)(param_1 + 0xb10) = 0;
  *(undefined8 *)(param_1 + 0xb08) = 0;
  *(undefined8 *)(param_1 + 0xb00) = 0;
  *(undefined4 *)(param_1 + 0x1330) = 0;
  *(undefined8 *)(param_1 + 0x1328) = 0;
  *(undefined8 *)(param_1 + 0x1338) = 0xffffffffffffffff;
  *(byte *)(param_1 + 0xc34) = *(byte *)(param_1 + 0xc34) & 0xfd;
  *(byte *)(param_1 + 0x140c) = *(byte *)(param_1 + 0x140c) & 0xfe;
  *(undefined4 *)(param_1 + 0x1378) = 0;
  *(undefined8 *)(param_1 + 0x1358) = 0;
  *(undefined8 *)(param_1 + 0x1350) = 0;
  *(undefined8 *)(param_1 + 0x1348) = 0;
  *(undefined8 *)(param_1 + 0x1340) = 0;
  (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x1360));
  *(undefined8 *)(param_1 + 0x1360) = 0;
  (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x1368));
  *(undefined1 *)(param_1 + 0x137c) = 0;
  *(undefined1 *)(param_1 + 0x13aa) = 0;
  *(undefined8 *)(param_1 + 0x13d8) = 0;
  *(undefined8 *)(param_1 + 0x13e8) = 0;
  *(undefined4 *)(param_1 + 0x13f0) = 0;
  *(undefined8 *)(param_1 + 0x1370) = 0;
  *(undefined8 *)(param_1 + 0x1368) = 0;
  FUN_00968e9c(param_1);
  return 0;
}

