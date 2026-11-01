
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00220220(void)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  code *pcVar4;
  undefined8 *puVar5;
  long lVar6;
  long *unaff_x19;
  undefined8 *unaff_x20;
  char *unaff_x21;
  long *unaff_x22;
  undefined1 uStack0000000000000008;
  
  puVar5 = (undefined8 *)func_0x00187bd0(0x2a,1);
  uVar3 = _UNK_0082807c;
  uVar2 = _UNK_0082806c;
  if (puVar5 == (undefined8 *)0x0) {
    func_0x007a1f00(1,0x2a,&UNK_009c6a18);
                    /* WARNING: Does not return */
    pcVar4 = (code *)SoftwareBreakpoint(1,0x220300);
    (*pcVar4)();
  }
  uVar1 = CONCAT62(_UNK_00828086,_UNK_00828084);
  puVar5[1] = _UNK_00828074;
  *puVar5 = uVar2;
  puVar5[3] = uVar1;
  puVar5[2] = uVar3;
  uVar2 = CONCAT26(_UNK_0082808c,_UNK_00828086);
  *(undefined8 *)((long)puVar5 + 0x22) = _UNK_0082808e;
  *(undefined8 *)((long)puVar5 + 0x1a) = uVar2;
  unaff_x20[2] = 0x2a;
  unaff_x20[3] = puVar5;
  unaff_x20[4] = 0x2a;
  uVar2 = _UNK_008281d0;
  unaff_x20[1] = _UNK_008281d8;
  *unaff_x20 = uVar2;
  if (*unaff_x22 != 0) {
    func_0x00187bd4(unaff_x22[1],*unaff_x22,1);
  }
  if (((*unaff_x21 == '\0') && (lVar6 = *(long *)(unaff_x21 + 8), lVar6 != -0x8000000000000000)) &&
     (lVar6 != 0)) {
    func_0x00187bd4(*(undefined8 *)(unaff_x21 + 0x10),lVar6,1);
  }
  lVar6 = *unaff_x19;
  *unaff_x19 = lVar6 + -1;
  LORelease();
  if (lVar6 == 1) {
    DataMemoryBarrier(2,1);
    func_0x001f9b44(&uStack0000000000000008);
  }
  return;
}

