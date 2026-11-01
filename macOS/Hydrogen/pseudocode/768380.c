
void FUN_00768380(void)

{
  bool in_ZR;
  ulong unaff_x20;
  long unaff_x21;
  
  if (in_ZR) {
    (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x21 + 0xf8));
    *(undefined8 *)(unaff_x21 + 0xf8) = 0;
    *(undefined8 *)(unaff_x21 + 0x100) = 0;
    *(byte *)(unaff_x21 + 0x271) = *(byte *)(unaff_x21 + 0x271) & 0xef;
    (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x21 + 0x108));
    *(undefined8 *)(unaff_x21 + 0x108) = 0;
    *(undefined8 *)(unaff_x21 + 0x110) = 0;
    *(byte *)(unaff_x21 + 0x271) = *(byte *)(unaff_x21 + 0x271) & 0xdf;
    (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x21 + 0x118));
    *(undefined8 *)(unaff_x21 + 0x118) = 0;
    *(undefined8 *)(unaff_x21 + 0x120) = 0;
    *(byte *)(unaff_x21 + 0x271) = *(byte *)(unaff_x21 + 0x271) & 0xbf;
  }
  if ((0x2eff7U >> (unaff_x20 & 0x3f) & 1) == 0) {
                    /* WARNING: Could not recover jumptable at 0x007683b4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (**(code **)(&UNK_00a1f040 + (unaff_x20 & 0xffffffff) * 8))();
    return;
  }
  return;
}

