
void FUN_006e2188(ulong param_1)

{
  long lVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  long unaff_x19;
  undefined8 uVar4;
  
  puVar2 = (undefined8 *)(*(long *)(unaff_x19 + 0x10) + (param_1 & 0xffffffff) * 0x10);
  if (*(undefined8 **)(unaff_x19 + 8) <= puVar2) {
    lVar1 = __dyld_get_image_header(0);
    puVar2 = (undefined8 *)(lVar1 + 0x4e8dd08);
  }
  puVar3 = *(undefined8 **)(unaff_x19 + 8);
  uVar4 = *puVar2;
  puVar3[1] = puVar2[1];
  *puVar3 = uVar4;
  *(long *)(unaff_x19 + 8) = *(long *)(unaff_x19 + 8) + 0x10;
  return;
}

