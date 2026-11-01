
void FUN_0077e034(long param_1,undefined8 param_2)

{
  *(byte *)(param_1 + 0x24) = *(byte *)(param_1 + 0x24) & 0xfe;
  if (*(long *)(param_1 + 0x10) != 0) {
    (*pcRam0000000000a2b5f0)();
    *(undefined8 *)(param_1 + 0x10) = 0;
  }
                    /* WARNING: Could not recover jumptable at 0x0077e07c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(**(long **)(param_1 + 8) + 0x20))(*(long **)(param_1 + 8),param_2);
  return;
}

