/* 7ff70c988d30 FUN_7ff70c988d30 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_7ff70c988d30(longlong param_1)

{
  undefined8 *puVar1;
  undefined8 uVar2;
  
  puVar1 = *(undefined8 **)(param_1 + 0x11b8);
  while (puVar1 != (undefined8 *)0x0) {
    uVar2 = *puVar1;
    puVar1 = (undefined8 *)puVar1[2];
    (*_DAT_7ff70cbebad8)(uVar2);
  }
  FUN_7ff70c990fa0(param_1 + 0x11b8,0);
  *(undefined8 *)(param_1 + 0x1238) = 0;
  return 0;
}


