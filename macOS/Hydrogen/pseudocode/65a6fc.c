
void FUN_0065a6fc(long param_1)

{
  long lVar1;
  bool in_ZR;
  ulong uVar2;
  undefined8 *unaff_x19;
  
  if (in_ZR) {
    *(undefined1 *)((long)unaff_x19 + 0xe9) = 0;
    for (; param_1 != 0; param_1 = param_1 + -1) {
      *(undefined4 *)((long)unaff_x19 + param_1 * 4 + 0xa4) = 0;
    }
  }
  unaff_x19[7] = &UNK_009b66c8;
  uVar2 = unaff_x19[0x12];
  if ((ulong)unaff_x19[0x13] <= (ulong)unaff_x19[0x12]) {
    uVar2 = unaff_x19[0x13];
  }
  *(undefined1 *)((long)unaff_x19 + 0x89) = 0;
  if ((undefined8 *)unaff_x19[0x14] == unaff_x19 + 9 && uVar2 != 0) {
    do {
      *(undefined4 *)((long)unaff_x19 + uVar2 * 4 + 0x44) = 0;
      uVar2 = uVar2 - 1;
    } while (uVar2 != 0);
  }
  *unaff_x19 = &UNK_00a12330;
  unaff_x19[1] = &UNK_00a123f0;
  lVar1 = unaff_x19[5];
  uVar2 = unaff_x19[3];
  if ((ulong)unaff_x19[4] <= (ulong)unaff_x19[3]) {
    uVar2 = unaff_x19[4];
  }
  if (lVar1 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined1 *)(lVar1 + -1 + uVar2) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644();
  }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)();
  return;
}

