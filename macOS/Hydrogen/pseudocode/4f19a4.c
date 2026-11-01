
void FUN_004f19a4(void)

{
  code *pcVar1;
  int iVar2;
  undefined8 uVar3;
  long lVar4;
  undefined8 *puVar5;
  undefined8 *unaff_x23;
  long *unaff_x25;
  long unaff_x28;
  long unaff_x29;
  
  *(undefined8 *)(unaff_x29 + -0xa0) = 0xe0000020;
  *(long *)(unaff_x29 + -0xb0) = unaff_x29 + -0x80;
  *(undefined **)(unaff_x29 + -0xa8) = &UNK_009e8008;
  iVar2 = func_0x0050f9f0();
  if (iVar2 != 0) {
    func_0x007a2810(&UNK_008a36e0,0x37,unaff_x29 + -0x59,&UNK_009e8068,&UNK_009e8038);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x4f289c);
    (*pcVar1)();
  }
  *(undefined8 *)(unaff_x29 + -200) = *(undefined8 *)(unaff_x29 + -0x78);
  *(undefined8 *)(unaff_x29 + -0xd0) = *(undefined8 *)(unaff_x29 + -0x80);
  *(undefined8 *)(unaff_x29 + -0xc0) = *(undefined8 *)(unaff_x29 + -0x70);
  func_0x00525e7c(unaff_x29 + -0xb0,*(undefined8 *)(unaff_x28 + 0x10));
  func_0x00525f7c(unaff_x29 + -0x80,unaff_x29 + -0xb0,8,0);
  uVar3 = func_0x0051ced0();
  unaff_x23[1] = uVar3;
  *unaff_x23 = 0x8000000000000009;
  lVar4 = unaff_x25[2];
  if (lVar4 != 0) {
    puVar5 = (undefined8 *)(unaff_x25[1] + 8);
    do {
      if (puVar5[-1] != 0) {
        func_0x00187bd4(*puVar5,puVar5[-1],1);
      }
      puVar5 = puVar5 + 3;
      lVar4 = lVar4 + -1;
    } while (lVar4 != 0);
  }
  if (*unaff_x25 != 0) {
    func_0x00187bd4(unaff_x25[1],*unaff_x25 * 0x18,8);
  }
  return;
}

