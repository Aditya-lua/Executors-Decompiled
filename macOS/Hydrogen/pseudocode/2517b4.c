
void FUN_002517b4(undefined8 param_1,undefined1 param_2 [16],undefined8 param_3,long *param_4)

{
  uint uVar1;
  undefined *puVar2;
  long *unaff_x19;
  undefined *unaff_x20;
  long lVar3;
  long unaff_x22;
  undefined1 unaff_w23;
  undefined1 unaff_w24;
  undefined2 unaff_w25;
  undefined2 unaff_w26;
  undefined1 auVar4 [16];
  undefined8 uStack0000000000000000;
  undefined2 uStack0000000000000009;
  ushort uStack000000000000000b;
  undefined1 uStack0000000000000014;
  
  uVar1 = (int)unaff_x20 - 0x10;
  uStack000000000000000b = (ushort)(uVar1 >> 8) & 0xff | (ushort)((uVar1 & 0xff00ff) << 8);
  uStack0000000000000009 = 0x103;
  _uStack0000000000000014 =
       CONCAT13(param_2[6],CONCAT12(param_2[4],CONCAT11(param_2[2],param_2[0])));
  lVar3 = *param_4;
  uStack0000000000000000 = param_1;
  auVar4 = func_0x0024751c(param_3,&uStack0000000000000014);
  puVar2 = auVar4._8_8_;
  if (auVar4._0_8_ != 0) {
    if (puVar2 < &UNK_00004001) {
      if (puVar2 < unaff_x20) {
        param_4[1] = (long)puVar2;
        unaff_x20 = puVar2;
      }
      unaff_x19[1] = lVar3;
      unaff_x19[2] = (long)unaff_x20;
      *(undefined1 *)(unaff_x19 + 3) = unaff_w23;
      *(undefined1 *)((long)unaff_x19 + 0x19) = unaff_w24;
      *(undefined2 *)((long)unaff_x19 + 0x1a) = unaff_w25;
      unaff_x22 = unaff_x22 + 0x10;
      *(undefined2 *)((long)unaff_x19 + 0x1c) = unaff_w26;
    }
    else {
      unaff_x22 = unaff_x22 + 0xb;
    }
  }
  *unaff_x19 = unaff_x22;
  return;
}

