
void FUN_00618528(long param_1)

{
  byte bVar1;
  undefined *puVar2;
  int iVar3;
  ulong uVar4;
  long unaff_x19;
  undefined4 uVar5;
  ulong unaff_x21;
  ulong uVar6;
  uint unaff_w22;
  ulong uVar7;
  
  _memset(param_1,0xff,0x400);
  puVar2 = PTR___DefaultRuneLocale_009b0028;
  if (unaff_w22 != 0) {
    uVar7 = (ulong)unaff_w22;
    if ((unaff_x21 & 1) == 0) {
      uVar6 = 0;
      do {
        *(int *)(param_1 + (ulong)*(byte *)(unaff_x19 + uVar6) * 4) = (int)uVar6;
        uVar6 = uVar6 + 1;
      } while (uVar7 != uVar6);
    }
    else {
      uVar6 = 0;
      do {
        while( true ) {
          bVar1 = *(byte *)(unaff_x19 + uVar6);
          uVar5 = (undefined4)uVar6;
          if (-1 < (char)bVar1) break;
          iVar3 = ___maskrune((ulong)bVar1,0x100);
          uVar4 = (ulong)*(byte *)(unaff_x19 + uVar6);
          if (iVar3 != 0) goto LAB_00618598;
LAB_00618554:
          *(undefined4 *)(param_1 + uVar4 * 4) = uVar5;
          uVar6 = uVar6 + 1;
          if (uVar7 == uVar6) {
            return;
          }
        }
        uVar4 = (ulong)*(byte *)(unaff_x19 + uVar6);
        if ((*(uint *)(puVar2 + (ulong)bVar1 * 4 + 0x3c) & 0x100) == 0) goto LAB_00618554;
LAB_00618598:
        iVar3 = ___toupper(uVar4);
        *(undefined4 *)(param_1 + (long)iVar3 * 4) = uVar5;
        iVar3 = ___tolower(*(undefined1 *)(unaff_x19 + uVar6));
        *(undefined4 *)(param_1 + (long)iVar3 * 4) = uVar5;
        uVar6 = uVar6 + 1;
      } while (uVar7 != uVar6);
    }
  }
  return;
}

