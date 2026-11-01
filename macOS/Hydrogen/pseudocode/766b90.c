
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_00766b90(void)

{
  undefined1 *puVar1;
  long lVar2;
  int in_w8;
  long lVar3;
  long in_x10;
  long extraout_x10;
  long unaff_x19;
  long unaff_x20;
  undefined8 unaff_x21;
  long *unaff_x22;
  undefined8 unaff_x23;
  ulong unaff_x25;
  long unaff_x26;
  long unaff_x27;
  long lVar4;
  long in_stack_00000010;
  long in_stack_00000028;
  
  if (0 < in_w8) {
    func_0x0073cab8();
  }
  lVar4 = unaff_x25 + unaff_x27 + 0x19;
  if (unaff_x25 == 0) goto LAB_00766cb0;
  if (unaff_x25 >> 0x10 == 0) {
    *(byte *)(unaff_x20 + in_x10) = *(byte *)(unaff_x20 + in_x10) | 0x80;
    lVar4 = lVar4 + 2;
    puVar1 = (undefined1 *)(unaff_x20 + unaff_x27 + 0x19);
    *puVar1 = (char)(unaff_x25 >> 8);
    puVar1[1] = (char)unaff_x25;
    _memcpy(puVar1 + 2);
    if (unaff_x22 == (long *)0x0) goto LAB_00766d38;
    goto LAB_00766cf4;
  }
LAB_00766bf0:
  func_0x0073c9e4();
  unaff_x23 = 8;
LAB_00766bfc:
  unaff_x21 = 0xa2b5f0;
  (*pcRam0000000000a2b5f0)();
  (*pcRam0000000000a2b5f0)(*(undefined8 *)((long)&linkedit_data_command_00001318.cmd + unaff_x19));
  *(undefined8 *)((long)&linkedit_data_command_00001318.cmd + unaff_x19) = 0;
  (*pcRam0000000000a2b5f0)
            (*(undefined8 *)((long)&linkedit_data_command_00001318.dataoff + unaff_x19));
  *(undefined8 *)((long)&linkedit_data_command_00001318.dataoff + unaff_x19) = 0;
  if ((int)unaff_x23 == 0) {
    *(undefined8 *)(*(long *)(unaff_x19 + 0x18) + 1000) = _UNK_008300d0;
    lVar3 = *(long *)PTR____stack_chk_guard_009b01e8;
  }
  else {
    func_0x0073c9e4();
    lVar3 = *(long *)PTR____stack_chk_guard_009b01e8;
  }
  if (lVar3 == in_stack_00000028) {
    return unaff_x23;
  }
  ___stack_chk_fail();
  in_x10 = extraout_x10;
LAB_00766cb0:
  if (unaff_x22 != (long *)0x0) {
LAB_00766cf4:
    if ((ulong)unaff_x22 >> 0x10 != 0) goto LAB_00766bf0;
    *(byte *)(unaff_x20 + in_x10) = *(byte *)(unaff_x20 + in_x10) | 0x40;
    puVar1 = (undefined1 *)(unaff_x20 + lVar4);
    *puVar1 = (char)((ulong)unaff_x22 >> 8);
    puVar1[1] = (char)unaff_x22;
    _memcpy(puVar1 + 2,unaff_x21,unaff_x22);
  }
LAB_00766d38:
  if ((int)unaff_x23 == 0) {
    unaff_x22 = *(long **)(unaff_x19 + 0x1b0);
    unaff_x23 = func_0x007841a0();
    if ((int)unaff_x23 == 0) {
      func_0x0073c8fc();
      lVar3 = unaff_x26 - in_stack_00000010;
      if (lVar3 == 0) {
        unaff_x23 = 0;
        *unaff_x22 = 0;
        unaff_x22[1] = 0;
      }
      else {
        lVar2 = func_0x0077e8e4(unaff_x20 + in_stack_00000010,lVar3);
        if (lVar2 == 0) {
          unaff_x23 = 0x1b;
        }
        else {
          unaff_x23 = 0;
          *unaff_x22 = lVar2;
          unaff_x22[1] = lVar3;
        }
      }
    }
  }
  goto LAB_00766bfc;
}

