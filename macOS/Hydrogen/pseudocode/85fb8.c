
long FUN_00085fb8(long param_1,undefined8 param_2,undefined8 *param_3)

{
  byte bVar1;
  bool in_ZR;
  undefined8 *puVar2;
  undefined8 uVar3;
  byte *pbVar4;
  undefined1 *puVar5;
  long *unaff_x19;
  long lVar6;
  undefined8 uStack0000000000000008;
  ulong in_stack_00000010;
  undefined8 uStack0000000000000018;
  
  if (in_ZR) {
    uVar3 = *param_3;
    pbVar4 = (byte *)*unaff_x19;
    bVar1 = *pbVar4;
    *pbVar4 = 5;
    in_stack_00000010 = (ulong)bVar1;
    uStack0000000000000018 = *(undefined8 *)(pbVar4 + 8);
    *(undefined8 *)(pbVar4 + 8) = uVar3;
    func_0x00078220(&uStack0000000000000018);
    return *unaff_x19;
  }
  if (**(char **)(param_1 + -8) != '\x02') {
    uVar3 = *param_3;
    puVar5 = (undefined1 *)unaff_x19[4];
    *puVar5 = 5;
    uStack0000000000000008 = *(undefined8 *)(puVar5 + 8);
    *(undefined8 *)(puVar5 + 8) = uVar3;
    func_0x00078220(&uStack0000000000000008);
    return unaff_x19[4];
  }
  lVar6 = *(long *)(*(char **)(param_1 + -8) + 8);
  puVar2 = *(undefined8 **)(lVar6 + 8);
  if (puVar2 < *(undefined8 **)(lVar6 + 0x10)) {
    *puVar2 = 0;
    puVar2[1] = 0;
    uVar3 = *param_3;
    *(undefined1 *)puVar2 = 5;
    puVar2[1] = uVar3;
    puVar2 = puVar2 + 2;
  }
  else {
    puVar2 = (undefined8 *)func_0x000860c0(lVar6);
  }
  *(undefined8 **)(lVar6 + 8) = puVar2;
  return *(long *)(*(long *)(*(long *)(unaff_x19[2] + -8) + 8) + 8) + -0x10;
}

