
ulong FUN_00682bcc(void)

{
  undefined1 (*pauVar1) [16];
  ulong uVar2;
  long lVar3;
  ulong *puVar4;
  ulong unaff_x19;
  long *unaff_x20;
  ulong unaff_x21;
  long unaff_x22;
  long unaff_x23;
  long unaff_x24;
  ulong *unaff_x25;
  long unaff_x26;
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  long in_stack_00000008;
  
  while( true ) {
    if (unaff_x26 != in_stack_00000008) {
      puVar4 = unaff_x25;
      lVar3 = unaff_x24;
      do {
        uVar2 = (*puVar4 & 0xff00ff00ff00ff00) >> 8 | (*puVar4 & 0xff00ff00ff00ff) << 8;
        uVar2 = (uVar2 & 0xffff0000ffff0000) >> 0x10 | (uVar2 & 0xffff0000ffff) << 0x10;
        *puVar4 = uVar2 >> 0x20 | uVar2 << 0x20;
        lVar3 = lVar3 + -1;
        puVar4 = puVar4 + 1;
      } while (lVar3 != 0);
    }
    (**(code **)(*unaff_x20 + 200))();
    unaff_x19 = unaff_x19 - unaff_x21;
    if (unaff_x19 < unaff_x21) break;
    _memcpy();
    lVar3 = 0;
    do {
      pauVar1 = (undefined1 (*) [16])(unaff_x22 + lVar3);
      auVar5 = NEON_rev64(*pauVar1,1);
      auVar6 = NEON_rev64(pauVar1[1],1);
      auVar7 = NEON_rev64(pauVar1[2],1);
      auVar8 = NEON_rev64(pauVar1[3],1);
      *(long *)(*pauVar1 + 8) = auVar5._8_8_;
      *(long *)*pauVar1 = auVar5._0_8_;
      *(long *)(pauVar1[1] + 8) = auVar6._8_8_;
      *(long *)pauVar1[1] = auVar6._0_8_;
      *(long *)(pauVar1[2] + 8) = auVar7._8_8_;
      *(long *)pauVar1[2] = auVar7._0_8_;
      *(long *)(pauVar1[3] + 8) = auVar8._8_8_;
      *(long *)pauVar1[3] = auVar8._0_8_;
      lVar3 = lVar3 + 0x40;
    } while (unaff_x23 != lVar3);
  }
  return unaff_x19;
}

