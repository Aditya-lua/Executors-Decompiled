
undefined8 _aws_lc_0_24_0_DH_set0_key(long param_1,long param_2,long param_3)

{
  uint uVar1;
  undefined8 *puVar2;
  
  if (param_2 != 0) {
    puVar2 = *(undefined8 **)(param_1 + 0x18);
    if (puVar2 != (undefined8 *)0x0) {
      uVar1 = *(uint *)((long)puVar2 + 0x14);
      if ((uVar1 >> 1 & 1) == 0) {
        func_0x0036e3d8(*puVar2);
        uVar1 = *(uint *)((long)puVar2 + 0x14);
      }
      if ((uVar1 & 1) == 0) {
        *puVar2 = 0;
      }
      else {
        func_0x0036e3d8(puVar2);
      }
    }
    *(long *)(param_1 + 0x18) = param_2;
  }
  if (param_3 != 0) {
    puVar2 = *(undefined8 **)(param_1 + 0x20);
    if (puVar2 != (undefined8 *)0x0) {
      uVar1 = *(uint *)((long)puVar2 + 0x14);
      if ((uVar1 >> 1 & 1) == 0) {
        func_0x0036e3d8(*puVar2);
        uVar1 = *(uint *)((long)puVar2 + 0x14);
      }
      if ((uVar1 & 1) == 0) {
        *puVar2 = 0;
      }
      else {
        func_0x0036e3d8(puVar2);
      }
    }
    *(long *)(param_1 + 0x20) = param_3;
  }
  return 1;
}

