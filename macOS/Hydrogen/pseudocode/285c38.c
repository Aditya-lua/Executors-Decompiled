
/* WARNING: Possible PIC construction at 0x00285c98: Changing call to branch */
/* WARNING: Possible PIC construction at 0x002861cc: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00285c9c) */
/* WARNING: Removing unreachable block (ram,0x00285ccc) */
/* WARNING: Removing unreachable block (ram,0x00285ce8) */
/* WARNING: Removing unreachable block (ram,0x00285d0c) */
/* WARNING: Removing unreachable block (ram,0x00285d14) */
/* WARNING: Removing unreachable block (ram,0x00285d1c) */
/* WARNING: Removing unreachable block (ram,0x00285d64) */
/* WARNING: Removing unreachable block (ram,0x00285d74) */
/* WARNING: Removing unreachable block (ram,0x00285d88) */
/* WARNING: Removing unreachable block (ram,0x00285da0) */
/* WARNING: Removing unreachable block (ram,0x00285da8) */
/* WARNING: Removing unreachable block (ram,0x00285d6c) */
/* WARNING: Removing unreachable block (ram,0x00285dac) */
/* WARNING: Removing unreachable block (ram,0x00285dc8) */
/* WARNING: Removing unreachable block (ram,0x00285de0) */
/* WARNING: Removing unreachable block (ram,0x00285de8) */
/* WARNING: Removing unreachable block (ram,0x00285d30) */
/* WARNING: Removing unreachable block (ram,0x00285d34) */
/* WARNING: Removing unreachable block (ram,0x00285d48) */
/* WARNING: Removing unreachable block (ram,0x00285d60) */
/* WARNING: Removing unreachable block (ram,0x00285cdc) */
/* WARNING: Removing unreachable block (ram,0x00285e44) */
/* WARNING: Removing unreachable block (ram,0x00285e24) */
/* WARNING: Removing unreachable block (ram,0x00285e70) */
/* WARNING: Removing unreachable block (ram,0x00285ecc) */
/* WARNING: Removing unreachable block (ram,0x00285edc) */
/* WARNING: Removing unreachable block (ram,0x00286178) */
/* WARNING: Removing unreachable block (ram,0x00285ee4) */
/* WARNING: Removing unreachable block (ram,0x00286194) */
/* WARNING: Removing unreachable block (ram,0x00285eec) */
/* WARNING: Removing unreachable block (ram,0x00285fb8) */
/* WARNING: Removing unreachable block (ram,0x00286000) */
/* WARNING: Removing unreachable block (ram,0x00286028) */
/* WARNING: Removing unreachable block (ram,0x00286058) */
/* WARNING: Removing unreachable block (ram,0x00286074) */
/* WARNING: Removing unreachable block (ram,0x00286098) */
/* WARNING: Removing unreachable block (ram,0x002860a0) */
/* WARNING: Removing unreachable block (ram,0x002860a8) */
/* WARNING: Removing unreachable block (ram,0x002860f0) */
/* WARNING: Removing unreachable block (ram,0x00286100) */
/* WARNING: Removing unreachable block (ram,0x00286114) */
/* WARNING: Removing unreachable block (ram,0x0028612c) */
/* WARNING: Removing unreachable block (ram,0x00286134) */
/* WARNING: Removing unreachable block (ram,0x002860f8) */
/* WARNING: Removing unreachable block (ram,0x00286138) */
/* WARNING: Removing unreachable block (ram,0x00286154) */
/* WARNING: Removing unreachable block (ram,0x0028616c) */
/* WARNING: Removing unreachable block (ram,0x00286174) */
/* WARNING: Removing unreachable block (ram,0x002860bc) */
/* WARNING: Removing unreachable block (ram,0x002860c0) */
/* WARNING: Removing unreachable block (ram,0x002860d4) */
/* WARNING: Removing unreachable block (ram,0x002860ec) */
/* WARNING: Removing unreachable block (ram,0x00286068) */
/* WARNING: Removing unreachable block (ram,0x002861b0) */
/* WARNING: Removing unreachable block (ram,0x00285eb0) */
/* WARNING: Removing unreachable block (ram,0x002861d0) */
/* WARNING: Removing unreachable block (ram,0x00286250) */
/* WARNING: Removing unreachable block (ram,0x002861f8) */
/* WARNING: Removing unreachable block (ram,0x00286210) */
/* WARNING: Removing unreachable block (ram,0x0028626c) */
/* WARNING: Removing unreachable block (ram,0x00286230) */

undefined * FUN_00285c38(void)

{
  undefined8 uVar1;
  undefined *puVar2;
  long unaff_x20;
  ulong unaff_x23;
  byte *unaff_x25;
  ulong unaff_x26;
  long unaff_x28;
  long unaff_x29;
  long in_stack_00000008;
  undefined8 uStack0000000000000010;
  byte bStack0000000000000018;
  byte bStack0000000000000019;
  byte bStack000000000000001a;
  byte bStack000000000000001b;
  byte bStack000000000000001f;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  undefined1 uStack0000000000000030;
  undefined1 uStack0000000000000128;
  long lStack_1a0;
  long lStack_198;
  undefined8 uStack_190;
  undefined8 uStack_188;
  undefined1 auStack_180 [296];
  long lStack_58;
  
  *(undefined8 *)(unaff_x29 + -0x78) = uStack0000000000000020;
  uStack0000000000000028 = *(undefined8 *)(unaff_x29 + -0x98);
  uStack0000000000000020 = *(undefined8 *)(unaff_x29 + -0xa0);
  uVar1 = 0x10;
  if ((*(byte *)(unaff_x28 + 0x108) & 1) != 0) {
    uVar1 = 0x20;
  }
  func_0x002b3d9c(&uStack0000000000000030,0,&uStack0000000000000128,unaff_x29 + -0x90,uVar1);
  lStack_58 = *(long *)PTR____stack_chk_guard_009b01e8;
  func_0x002f51d0(auStack_180,&uStack0000000000000020);
  func_0x002f52c0(auStack_180,in_stack_00000008,unaff_x26 & 0xfffffffffffffff0);
  if ((unaff_x26 & 0xf) != 0) {
    uStack_190 = 0;
    uStack_188 = 0;
    ___memcpy_chk(&uStack_190,in_stack_00000008 + (unaff_x26 & 0xfffffffffffffff0),unaff_x26 & 0xf,
                  0x10);
    func_0x002f52c0(auStack_180,&uStack_190,0x10);
  }
  func_0x002f52c0(auStack_180);
  if ((unaff_x23 & 0xf) != 0) {
    uStack_190 = 0;
    uStack_188 = 0;
    ___memcpy_chk(&uStack_190,unaff_x20 + (unaff_x23 & 0xfffffffffffffff0),unaff_x23 & 0xf,0x10);
    func_0x002f52c0(auStack_180,&uStack_190,0x10);
  }
  lStack_1a0 = unaff_x26 << 3;
  lStack_198 = unaff_x23 << 3;
  func_0x002f52c0(auStack_180,&lStack_1a0,0x10);
  puVar2 = (undefined *)func_0x002f53b8(auStack_180,&uStack0000000000000010);
  uStack0000000000000010._0_1_ = (byte)uStack0000000000000010 ^ *unaff_x25;
  uStack0000000000000010._1_1_ = uStack0000000000000010._1_1_ ^ unaff_x25[1];
  uStack0000000000000010._2_1_ = uStack0000000000000010._2_1_ ^ unaff_x25[2];
  uStack0000000000000010._3_1_ = uStack0000000000000010._3_1_ ^ unaff_x25[3];
  uStack0000000000000010._4_1_ = uStack0000000000000010._4_1_ ^ unaff_x25[4];
  uStack0000000000000010._5_1_ = uStack0000000000000010._5_1_ ^ unaff_x25[5];
  uStack0000000000000010._6_1_ = uStack0000000000000010._6_1_ ^ unaff_x25[6];
  uStack0000000000000010._7_1_ = uStack0000000000000010._7_1_ ^ unaff_x25[7];
  bStack0000000000000018 = bStack0000000000000018 ^ unaff_x25[8];
  bStack0000000000000019 = bStack0000000000000019 ^ unaff_x25[9];
  bStack000000000000001a = bStack000000000000001a ^ unaff_x25[10];
  bStack000000000000001b = bStack000000000000001b ^ unaff_x25[0xb];
  bStack000000000000001f = bStack000000000000001f & 0x7f;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_58) {
    return puVar2;
  }
  ___stack_chk_fail();
  return &UNK_009cde48;
}

