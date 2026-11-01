
undefined8 FUN_00621a74(ulong param_1,undefined8 *param_2)

{
  ulong uVar1;
  undefined8 *puVar2;
  ulong unaff_x19;
  long unaff_x21;
  
  uVar1 = param_1 & 0xff;
  if (unaff_x19 < uVar1) {
    if (0x16 < uVar1 + unaff_x19) {
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE7reserveEm(param_2,uVar1 << 1)
      ;
      param_2 = *(undefined8 **)(unaff_x21 + 0x18);
      param_1 = (ulong)*(byte *)((long)param_2 + 0x17);
    }
    if (((uint)param_1 >> 7 & 1) != 0) {
      puVar2 = (undefined8 *)*param_2;
      param_1 = param_2[1];
      goto LAB_00621ae0;
    }
  }
  param_1 = param_1 & 0xff;
  puVar2 = param_2;
LAB_00621ae0:
  func_0x0064b410(param_2,(long)puVar2 + param_1);
  return 0;
}

