
void FUN_006150d0(byte *param_1)

{
  code *pcVar1;
  undefined8 *puVar2;
  long in_x9;
  uint uVar3;
  uint unaff_w19;
  uint unaff_w20;
  long unaff_x21;
  uint *unaff_x22;
  long unaff_x23;
  
  if (unaff_x21 == 0) {
    if (unaff_w20 != 0) goto LAB_00615140;
  }
  else {
    uVar3 = 0;
    do {
      uVar3 = (uint)*param_1 | uVar3 << 8;
      *unaff_x22 = uVar3;
      in_x9 = in_x9 + -1;
      param_1 = param_1 + 1;
    } while (in_x9 != 0);
    if (uVar3 < unaff_w20 || unaff_w19 < uVar3) {
LAB_00615140:
      puVar2 = (undefined8 *)___cxa_allocate_exception(0x28);
      *(undefined4 *)(puVar2 + 1) = 1;
      puVar2[2] = 0x6f63656420524542;
      puVar2[3] = 0x726f727265206564;
      *(undefined1 *)(puVar2 + 4) = 0;
      *(undefined1 *)((long)puVar2 + 0x27) = 0x10;
      *puVar2 = &UNK_009f60b8;
      ___cxa_throw(puVar2,&UNK_009f6090,&DAT_0060f08c);
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x615268);
      (*pcVar1)();
    }
  }
  if (unaff_x23 != 0) {
    if (unaff_x21 != 0) {
      do {
        *(undefined1 *)(unaff_x23 + -1 + unaff_x21) = 0;
        unaff_x21 = unaff_x21 + -1;
      } while (unaff_x21 != 0);
    }
    func_0x00611644();
  }
  return;
}

