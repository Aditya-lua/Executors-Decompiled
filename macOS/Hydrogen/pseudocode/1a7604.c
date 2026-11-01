
void FUN_001a7604(long param_1,long *param_2)

{
  ushort uVar1;
  long lVar2;
  ushort *puVar3;
  long lVar4;
  uint uVar5;
  long unaff_x21;
  uint uVar6;
  undefined1 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  long *plStack0000000000000030;
  
  lVar2 = *(long *)(unaff_x21 + 0x10);
  *(undefined1 *)(param_2[1] + lVar2) = 0xff;
  lVar2 = lVar2 + 1;
  param_2[2] = lVar2;
  uStack0000000000000018 = 0x1515151515151515;
  _uStack0000000000000010 = 0x1515151515151515;
  uStack0000000000000028 = 0x1515151515151515;
  uStack0000000000000020 = 0x1515151515151515;
  plStack0000000000000030 = param_2;
  if (*(long *)(param_1 + 0x10) != 0) {
    puVar3 = (ushort *)(*(long *)(param_1 + 8) + 2);
    lVar4 = *(long *)(param_1 + 0x10) << 2;
    do {
      uVar1 = puVar3[-1];
      if (uVar1 < 5) {
        uVar5 = 0x302;
        if (uVar1 != 3) {
          uVar5 = 0x303;
        }
        uVar6 = 0x301;
        if (uVar1 != 2) {
          uVar6 = uVar5;
        }
        uVar5 = 2;
        if (uVar1 != 0) {
          uVar5 = 0x300;
        }
        if (uVar1 < 2) {
          uVar6 = uVar5;
        }
      }
      else if (uVar1 < 7) {
        uVar6 = 0x304;
        if (uVar1 != 5) {
          uVar6 = 0xfeff;
        }
      }
      else if (uVar1 == 7) {
        uVar6 = 0xfefd;
      }
      else if (uVar1 == 8) {
        uVar6 = 0xfefc;
      }
      else {
        uVar6 = (uint)*puVar3;
      }
      if ((ulong)(*param_2 - lVar2) < 2) {
        func_0x0079b61c(param_2,lVar2,2,1,1);
        lVar2 = param_2[2];
      }
      *(ushort *)(param_2[1] + lVar2) = (ushort)(uVar6 >> 8) | (ushort)((uVar6 & 0xff00ff) << 8);
      lVar2 = lVar2 + 2;
      param_2[2] = lVar2;
      puVar3 = puVar3 + 2;
      lVar4 = lVar4 + -4;
    } while (lVar4 != 0);
  }
  func_0x0024031c(&uStack0000000000000010);
  return;
}

