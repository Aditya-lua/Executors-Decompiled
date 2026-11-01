
undefined8 FUN_006e3300(long param_1,int param_2)

{
  int iVar1;
  undefined8 *puVar2;
  int in_w8;
  
  if (param_2 < in_w8) {
    puVar2 = (undefined8 *)func_0x006e60a0();
    iVar1 = *(int *)((long)puVar2 + 0xc);
  }
  else {
    puVar2 = (undefined8 *)(*(long *)(param_1 + 8) + (long)param_2 * 0x10);
    iVar1 = *(int *)((long)puVar2 + 0xc);
  }
  if (iVar1 == 2) {
    return *puVar2;
  }
  return 0;
}

