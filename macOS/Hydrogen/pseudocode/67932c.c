
void FUN_0067932c(void)

{
  long lVar1;
  long lVar2;
  ulong uVar3;
  long unaff_x19;
  long lVar4;
  undefined1 uStack0000000000000008;
  undefined *puStack0000000000000010;
  undefined1 *puStack0000000000000018;
  ulong uStack0000000000000028;
  ulong uStack0000000000000030;
  long lStack0000000000000038;
  ulong uStack0000000000000048;
  ulong uStack0000000000000050;
  long lStack0000000000000058;
  
  puStack0000000000000018 = &uStack0000000000000008;
  uStack0000000000000028 = 0x1fffffffffffffff;
  uStack0000000000000030 = 0;
  lStack0000000000000038 = 0;
  _uStack0000000000000008 = &UNK_009fae50;
  puStack0000000000000010 = &UNK_00a099a8;
  uStack0000000000000050 = 0;
  lStack0000000000000058 = 0;
  uStack0000000000000048 = 0x1fffffffffffffff;
  lVar1 = func_0x0062bd24(&uStack0000000000000008);
  lVar4 = *(long *)(lVar1 + 0x10);
  *(undefined8 *)(unaff_x19 + 8) = 0x1fffffffffffffff;
  *(long *)(unaff_x19 + 0x10) = lVar4;
  func_0x006108a0(lVar4);
  if (lVar4 == 0) {
    lVar2 = 0;
    *(undefined8 *)(unaff_x19 + 0x18) = 0;
    lVar1 = *(long *)(lVar1 + 0x18);
    if (lVar1 == 0) goto LAB_006793a4;
  }
  else {
    lVar2 = func_0x006115d0(lVar4 << 3);
    *(long *)(unaff_x19 + 0x18) = lVar2;
    lVar1 = *(long *)(lVar1 + 0x18);
    if (lVar2 == lVar1) goto LAB_006793a4;
  }
  _memcpy(lVar2,lVar1,lVar4 << 3);
LAB_006793a4:
  _uStack0000000000000008 = &UNK_009fae50;
  uVar3 = uStack0000000000000048;
  if (uStack0000000000000050 <= uStack0000000000000048) {
    uVar3 = uStack0000000000000050;
  }
  if (lStack0000000000000058 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(lStack0000000000000058 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  _uStack0000000000000008 = &UNK_00a00d18;
  uVar3 = uStack0000000000000028;
  if (uStack0000000000000030 <= uStack0000000000000028) {
    uVar3 = uStack0000000000000030;
  }
  if (lStack0000000000000038 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(lStack0000000000000038 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  return;
}

