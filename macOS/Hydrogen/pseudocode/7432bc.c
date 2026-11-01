
undefined8 FUN_007432bc(long param_1)

{
  undefined8 *puVar1;
  
  puVar1 = *(undefined8 **)(param_1 + 0x1b0);
  if (puVar1 != (undefined8 *)0x0) {
    (*pcRam0000000000a2b5f0)(puVar1[1]);
    *puVar1 = 0;
    puVar1[1] = 0;
    if (*(int *)(puVar1 + 2) != -1) {
      _close();
    }
    *(undefined4 *)(puVar1 + 2) = 0xffffffff;
  }
  return 0;
}

