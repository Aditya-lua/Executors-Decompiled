
void FUN_006ef8d0(long param_1)

{
  bool in_CY;
  undefined1 *puVar1;
  long lVar2;
  ulong in_x9;
  ulong unaff_x19;
  long unaff_x20;
  long unaff_x21;
  undefined8 *unaff_x22;
  
  if (in_CY) {
    do {
      lVar2 = param_1;
      if (in_x9 == unaff_x19) {
        return;
      }
      param_1 = *(long *)(lVar2 + 0x20);
    } while ((param_1 != 0) && (in_x9 = *(ulong *)(param_1 + 8), unaff_x19 <= in_x9));
    unaff_x22 = (undefined8 *)(lVar2 + 0x20);
  }
  puVar1 = (undefined1 *)func_0x006f3878();
  puVar1[1] = *(byte *)(*(long *)(unaff_x20 + 0x18) + 0x20) & 3;
  *puVar1 = 0xc;
  puVar1[2] = *(undefined1 *)(unaff_x20 + 4);
  puVar1[3] = 0;
  *(ulong *)(puVar1 + 8) = unaff_x19;
  *(undefined8 *)(puVar1 + 0x20) = *unaff_x22;
  *unaff_x22 = puVar1;
  *(long *)(puVar1 + 0x10) = unaff_x21 + 0x300;
  lVar2 = *(long *)(unaff_x21 + 0x318);
  *(long *)(puVar1 + 0x18) = lVar2;
  *(undefined1 **)(lVar2 + 0x10) = puVar1;
  *(undefined1 **)(unaff_x21 + 0x318) = puVar1;
  return;
}

