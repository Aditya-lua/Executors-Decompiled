
undefined8 FUN_0078d998(undefined8 param_1,long param_2)

{
  if (*(long *)(param_2 + 1000) != 0) {
    func_0x00729820(*(long *)(param_2 + 1000) + 0x58);
    func_0x00729820(*(long *)(param_2 + 1000) + 0x98);
    (*pcRam0000000000a2b5f0)(*(undefined8 *)(param_2 + 1000));
    *(undefined8 *)(param_2 + 1000) = 0;
  }
  return 0;
}

