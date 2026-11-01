
/* WARNING: Possible PIC construction at 0x00231034: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00231168: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00231038) */
/* WARNING: Removing unreachable block (ram,0x00231128) */
/* WARNING: Removing unreachable block (ram,0x00231148) */
/* WARNING: Removing unreachable block (ram,0x00231150) */
/* WARNING: Removing unreachable block (ram,0x00231158) */
/* WARNING: Removing unreachable block (ram,0x00231164) */
/* WARNING: Removing unreachable block (ram,0x0023116c) */

void FUN_00230fe0(void)

{
  long lVar1;
  undefined8 uVar2;
  long lVar3;
  long unaff_x19;
  
  uVar2 = __Unwind_Resume();
  func_0x002315a4(*(undefined8 *)(unaff_x19 + 0x48),*(undefined8 *)(unaff_x19 + 0x50));
  __Unwind_Resume(uVar2);
  lVar3 = func_0x007a2668();
  lVar1 = **(long **)(lVar3 + 0x38);
  **(long **)(lVar3 + 0x38) = lVar1 + -1;
  LORelease();
  if (lVar1 == 1) {
    DataMemoryBarrier(2,1);
    func_0x001fa1d4();
  }
  func_0x00230538(lVar3);
  *(undefined1 *)(lVar3 + 0x138) = 0;
  *(undefined1 *)(lVar3 + 0x139) = 0;
  *(undefined1 *)(lVar3 + 0x13a) = 0;
  *(undefined1 *)(lVar3 + 0x13b) = 0;
  *(undefined1 *)(lVar3 + 0x13c) = 0;
  *(undefined1 *)(lVar3 + 0x13d) = 0;
  *(undefined1 *)(lVar3 + 0x13e) = 0;
  *(undefined1 *)(lVar3 + 0x13f) = 0;
  *(undefined1 *)(lVar3 + 0x140) = 0;
  *(undefined1 *)(lVar3 + 0x141) = 0;
  *(undefined1 *)(lVar3 + 0x142) = 0;
  *(undefined1 *)(lVar3 + 0x143) = 0;
  *(undefined1 *)(lVar3 + 0x144) = 0;
  *(undefined1 *)(lVar3 + 0x145) = 0;
  *(undefined1 *)(lVar3 + 0x146) = 0;
  *(undefined1 *)(lVar3 + 0x147) = 0;
  *(undefined1 *)(lVar3 + 0x148) = 0;
  *(undefined1 *)(lVar3 + 0x149) = 0;
  *(undefined1 *)(lVar3 + 0x14a) = 0;
  *(undefined1 *)(lVar3 + 0x14b) = 0;
  *(undefined1 *)(lVar3 + 0x14c) = 0;
  *(undefined1 *)(lVar3 + 0x14d) = 0;
  *(undefined1 *)(lVar3 + 0x14e) = 0;
  *(undefined1 *)(lVar3 + 0x14f) = 0;
  *(undefined1 *)(lVar3 + 0x150) = 0;
  *(undefined1 *)(lVar3 + 0x151) = 0;
  *(undefined1 *)(lVar3 + 0x152) = 0;
  *(undefined1 *)(lVar3 + 0x153) = 0;
  *(undefined1 *)(lVar3 + 0x154) = 0;
  *(undefined1 *)(lVar3 + 0x155) = 0;
  *(undefined1 *)(lVar3 + 0x156) = 0;
  *(undefined1 *)(lVar3 + 0x157) = 0;
  *(undefined1 *)(lVar3 + 0x158) = 0;
  *(undefined1 *)(lVar3 + 0x159) = 0;
  *(undefined1 *)(lVar3 + 0x15a) = 0;
  *(undefined1 *)(lVar3 + 0x15b) = 0;
  *(undefined1 *)(lVar3 + 0x15c) = 0;
  *(undefined1 *)(lVar3 + 0x15d) = 0;
  *(undefined1 *)(lVar3 + 0x15e) = 0;
  *(undefined1 *)(lVar3 + 0x15f) = 0;
  *(undefined1 *)(lVar3 + 0x160) = 0;
  *(undefined1 *)(lVar3 + 0x161) = 0;
  *(undefined1 *)(lVar3 + 0x162) = 0;
  *(undefined1 *)(lVar3 + 0x163) = 0;
  *(undefined1 *)(lVar3 + 0x164) = 0;
  *(undefined1 *)(lVar3 + 0x165) = 0;
  *(undefined1 *)(lVar3 + 0x166) = 0;
  *(undefined1 *)(lVar3 + 0x167) = 0;
  *(undefined1 *)(lVar3 + 0x168) = 0;
  *(undefined1 *)(lVar3 + 0x169) = 0;
  *(undefined1 *)(lVar3 + 0x16a) = 0;
  *(undefined1 *)(lVar3 + 0x16b) = 0;
  *(undefined1 *)(lVar3 + 0x16c) = 0;
  *(undefined1 *)(lVar3 + 0x16d) = 0;
  *(undefined1 *)(lVar3 + 0x16e) = 0;
  *(undefined1 *)(lVar3 + 0x16f) = 0;
  *(undefined1 *)(lVar3 + 0x170) = 0;
  *(undefined1 *)(lVar3 + 0x171) = 0;
  *(undefined1 *)(lVar3 + 0x172) = 0;
  *(undefined1 *)(lVar3 + 0x173) = 0;
  *(undefined1 *)(lVar3 + 0x174) = 0;
  *(undefined1 *)(lVar3 + 0x175) = 0;
  *(undefined1 *)(lVar3 + 0x176) = 0;
  *(undefined1 *)(lVar3 + 0x177) = 0;
  return;
}

