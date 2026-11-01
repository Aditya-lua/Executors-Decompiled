
void FUN_001fbd44(void)

{
  code *pcVar1;
  undefined8 *puVar2;
  undefined8 *unaff_x19;
  long unaff_x29;
  uint7 uStack0000000000000019;
  undefined7 uStack0000000000000021;
  undefined7 uStack0000000000000029;
  undefined7 uStack0000000000000031;
  undefined7 uStack0000000000000039;
  undefined7 uStack0000000000000041;
  undefined7 uStack0000000000000049;
  undefined7 uStack0000000000000051;
  undefined7 uStack0000000000000059;
  undefined7 uStack0000000000000061;
  undefined7 uStack0000000000000069;
  undefined8 in_stack_00000078;
  undefined1 uStack0000000000000080;
  undefined7 uStack0000000000000081;
  undefined1 uStack0000000000000088;
  undefined7 uStack0000000000000089;
  undefined1 uStack0000000000000090;
  undefined7 uStack0000000000000091;
  undefined1 uStack0000000000000098;
  undefined7 uStack0000000000000099;
  undefined1 uStack00000000000000a0;
  undefined7 uStack00000000000000a1;
  undefined1 uStack00000000000000a8;
  undefined7 uStack00000000000000a9;
  undefined1 uStack00000000000000b0;
  undefined7 uStack00000000000000b1;
  undefined1 uStack00000000000000b8;
  undefined7 uStack00000000000000b9;
  undefined1 uStack00000000000000c0;
  undefined7 uStack00000000000000c1;
  undefined1 uStack00000000000000c8;
  undefined7 uStack00000000000000c9;
  
  func_0x00244d50(unaff_x29 + -0x70,0x20);
  uStack0000000000000088 = (undefined1)*(undefined8 *)(unaff_x29 + -0x68);
  uStack0000000000000089 = (undefined7)((ulong)*(undefined8 *)(unaff_x29 + -0x68) >> 8);
  uStack0000000000000080 = (undefined1)*(undefined8 *)(unaff_x29 + -0x70);
  uStack0000000000000081 = (undefined7)((ulong)*(undefined8 *)(unaff_x29 + -0x70) >> 8);
  uStack0000000000000098 = (undefined1)*(undefined8 *)(unaff_x29 + -0x58);
  uStack0000000000000099 = (undefined7)((ulong)*(undefined8 *)(unaff_x29 + -0x58) >> 8);
  uStack0000000000000090 = (undefined1)*(undefined8 *)(unaff_x29 + -0x60);
  uStack0000000000000091 = (undefined7)((ulong)*(undefined8 *)(unaff_x29 + -0x60) >> 8);
  uStack00000000000000c8 = (undefined1)*(undefined8 *)(unaff_x29 + -0x28);
  uStack00000000000000c9 = (undefined7)((ulong)*(undefined8 *)(unaff_x29 + -0x28) >> 8);
  uStack00000000000000c0 = (undefined1)*(undefined8 *)(unaff_x29 + -0x30);
  uStack00000000000000c1 = (undefined7)((ulong)*(undefined8 *)(unaff_x29 + -0x30) >> 8);
  uStack00000000000000b8 = (undefined1)*(undefined8 *)(unaff_x29 + -0x38);
  uStack00000000000000b9 = (undefined7)((ulong)*(undefined8 *)(unaff_x29 + -0x38) >> 8);
  uStack00000000000000b0 = (undefined1)*(undefined8 *)(unaff_x29 + -0x40);
  uStack00000000000000b1 = (undefined7)((ulong)*(undefined8 *)(unaff_x29 + -0x40) >> 8);
  uStack00000000000000a8 = (undefined1)*(undefined8 *)(unaff_x29 + -0x48);
  uStack00000000000000a9 = (undefined7)((ulong)*(undefined8 *)(unaff_x29 + -0x48) >> 8);
  uStack00000000000000a0 = (undefined1)*(undefined8 *)(unaff_x29 + -0x50);
  uStack00000000000000a1 = (undefined7)((ulong)*(undefined8 *)(unaff_x29 + -0x50) >> 8);
  uStack0000000000000021 = uStack0000000000000081;
  uStack0000000000000019 = in_stack_00000078._1_7_;
  uStack0000000000000031 = uStack0000000000000091;
  uStack0000000000000029 = uStack0000000000000089;
  uStack0000000000000061 = uStack00000000000000c1;
  uStack0000000000000059 = uStack00000000000000b9;
  uStack0000000000000051 = uStack00000000000000b1;
  uStack0000000000000049 = uStack00000000000000a9;
  uStack0000000000000041 = uStack00000000000000a1;
  uStack0000000000000039 = uStack0000000000000099;
  uStack0000000000000069 = uStack00000000000000c9;
  puVar2 = (undefined8 *)func_0x00187bd0(0x70,8);
  if (puVar2 == (undefined8 *)0x0) {
    func_0x007a1f18(8,0x70);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x1fbe28);
    (*pcVar1)();
  }
  puVar2[9] = CONCAT71(uStack0000000000000049,uStack00000000000000a8);
  puVar2[8] = CONCAT71(uStack0000000000000041,uStack00000000000000a0);
  puVar2[0xb] = CONCAT71(uStack0000000000000059,uStack00000000000000b8);
  puVar2[10] = CONCAT71(uStack0000000000000051,uStack00000000000000b0);
  puVar2[0xd] = CONCAT71(uStack0000000000000069,uStack00000000000000c8);
  puVar2[0xc] = CONCAT71(uStack0000000000000061,uStack00000000000000c0);
  puVar2[1] = 1;
  *puVar2 = 1;
  puVar2[3] = (ulong)uStack0000000000000019 << 8;
  puVar2[2] = 0;
  puVar2[5] = CONCAT71(uStack0000000000000029,uStack0000000000000088);
  puVar2[4] = CONCAT71(uStack0000000000000021,uStack0000000000000080);
  puVar2[7] = CONCAT71(uStack0000000000000039,uStack0000000000000098);
  puVar2[6] = CONCAT71(uStack0000000000000031,uStack0000000000000090);
  *unaff_x19 = puVar2;
  unaff_x19[1] = &UNK_009c5ad0;
  *(undefined1 *)(unaff_x19 + 2) = 2;
  return;
}

