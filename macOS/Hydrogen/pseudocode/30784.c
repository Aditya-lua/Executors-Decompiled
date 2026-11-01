
void FUN_00030784(void)

{
  ulong uVar1;
  undefined8 *puVar2;
  byte bVar3;
  undefined8 *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  undefined1 *unaff_x24;
  undefined8 uStack0000000000000008;
  ulong in_stack_00000010;
  undefined8 in_stack_00000018;
  
  if (unaff_x21 != unaff_x23) {
    _memcpy();
    unaff_x24 = unaff_x24 + unaff_x22;
  }
  *unaff_x24 = 0;
  uVar1 = in_stack_00000010;
  puVar2 = uStack0000000000000008;
  if (-1 < (char)in_stack_00000018._7_1_) {
    uVar1 = (ulong)in_stack_00000018._7_1_;
    puVar2 = &uStack0000000000000008;
  }
  (**(code **)(**(long **)(unaff_x20 + 0x10) + 0x20))
            (*(long **)(unaff_x20 + 0x10),puVar2,(long)puVar2 + uVar1);
  bVar3 = *(byte *)((long)unaff_x19 + 0x17);
  uVar1 = unaff_x19[1];
  if (-1 < (char)bVar3) {
    uVar1 = (ulong)bVar3;
  }
  if (uVar1 != 1) {
    if (uVar1 == 0xc) {
      puVar2 = (undefined8 *)*unaff_x19;
      if (-1 < (char)bVar3) {
        puVar2 = unaff_x19;
      }
      *(undefined1 *)((long)puVar2 + 0xb) = *(undefined1 *)((long)puVar2 + 3);
    }
    else if ((char)bVar3 < '\0') {
      *(undefined1 *)*unaff_x19 = 0;
      unaff_x19[1] = 0;
    }
    else {
      *(undefined1 *)unaff_x19 = 0;
      *(undefined1 *)((long)unaff_x19 + 0x17) = 0;
    }
  }
  if ((char)in_stack_00000018._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000008);
  }
  return;
}

