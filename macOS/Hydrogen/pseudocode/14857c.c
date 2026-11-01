
void FUN_0014857c(void)

{
  ulong uVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  long unaff_x19;
  long unaff_x20;
  undefined8 *unaff_x21;
  undefined8 *unaff_x22;
  undefined1 uStack000000000000000f;
  
  if (*(char *)((long)unaff_x22 + 0x17) < '\0') {
    func_0x00017634();
  }
  else {
    uVar3 = *unaff_x22;
    unaff_x21[1] = unaff_x22[1];
    *unaff_x21 = uVar3;
    unaff_x21[2] = unaff_x22[2];
  }
  *(undefined1 *)(unaff_x20 + 0x10) = 1;
  uVar1 = *(ulong *)(unaff_x19 + 0x18);
  puVar2 = *(undefined8 **)(unaff_x19 + 0x10);
  if (-1 < (char)*(byte *)(unaff_x19 + 0x27)) {
    uVar1 = (ulong)*(byte *)(unaff_x19 + 0x27);
    puVar2 = unaff_x21;
  }
  uVar3 = func_0x00027c78(&uStack000000000000000f,puVar2,uVar1);
  *(undefined8 *)(unaff_x19 + 8) = uVar3;
  return;
}

