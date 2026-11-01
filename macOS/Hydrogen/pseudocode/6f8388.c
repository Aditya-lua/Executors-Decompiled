
/* WARNING: Removing unreachable block (ram,0x006f94b4) */
/* WARNING: Removing unreachable block (ram,0x006f94c8) */
/* WARNING: Removing unreachable block (ram,0x006f94d4) */
/* WARNING: Removing unreachable block (ram,0x006f94e8) */
/* WARNING: Removing unreachable block (ram,0x006f9500) */
/* WARNING: Removing unreachable block (ram,0x006f9510) */
/* WARNING: Removing unreachable block (ram,0x006f9524) */
/* WARNING: Removing unreachable block (ram,0x006f9530) */
/* WARNING: Removing unreachable block (ram,0x006f9534) */
/* WARNING: Removing unreachable block (ram,0x006f9548) */
/* WARNING: Removing unreachable block (ram,0x006f971c) */
/* WARNING: Removing unreachable block (ram,0x006f9720) */
/* WARNING: Removing unreachable block (ram,0x006f9564) */
/* WARNING: Removing unreachable block (ram,0x006f9574) */
/* WARNING: Removing unreachable block (ram,0x006f95dc) */
/* WARNING: Removing unreachable block (ram,0x006f9618) */
/* WARNING: Removing unreachable block (ram,0x006f961c) */
/* WARNING: Removing unreachable block (ram,0x006f963c) */

uint FUN_006f8388(long param_1)

{
  bool bVar1;
  int iVar2;
  undefined8 uVar3;
  long lVar4;
  char *pcVar5;
  uint uVar6;
  ulong uVar7;
  uint uVar8;
  undefined4 auStack_2a0 [2];
  long lStack_298;
  ulong uStack_290;
  char *pcStack_288;
  undefined8 uStack_280;
  uint uStack_278;
  long lStack_70;
  int iStack_68;
  undefined4 uStack_64;
  
  if (*(long *)PTR____stack_chk_guard_009b01e8 == param_1) {
    return 1;
  }
  uVar3 = ___stack_chk_fail();
  lVar4 = func_0x006e67c8(uVar3,1,&iStack_68);
  pcVar5 = (char *)func_0x006e67c8(uVar3,2,&lStack_70);
  iVar2 = func_0x006e6c08(uVar3,3,1);
  uVar8 = (iStack_68 + 1U & iVar2 >> 0x1f) + iVar2;
  if ((int)uVar8 < 1) {
    uVar8 = 1;
  }
  else if ((int)(iStack_68 + 1U) < (int)uVar8) goto LAB_006f968c;
  uVar7 = (lVar4 + (ulong)uVar8) - 1;
  lStack_298 = lVar4;
  uStack_280 = uVar3;
  if (*pcVar5 == '^') {
    auStack_2a0[0] = 200;
    uStack_290 = lVar4 + CONCAT44(uStack_64,iStack_68);
    pcStack_288 = pcVar5 + lStack_70;
    uStack_278 = 0;
    lStack_70 = lStack_70 + -1;
    lVar4 = func_0x006f9748(auStack_2a0,uVar7,pcVar5 + 1);
    if (lVar4 != 0) {
LAB_006f96c4:
      uVar6 = uStack_278;
      uVar8 = uStack_278;
      if (uStack_278 < 2) {
        uVar8 = 1;
      }
      func_0x006e6978(uStack_280,uVar8,"too many captures");
      if ((int)uVar8 < 1) {
        return uVar6;
      }
      uVar6 = 0;
      do {
        func_0x006fa2fc(auStack_2a0,uVar6,uVar7,lVar4);
        uVar6 = uVar6 + 1;
      } while (uVar8 != uVar6);
      return uVar8;
    }
  }
  else {
    auStack_2a0[0] = 200;
    uStack_290 = lVar4 + CONCAT44(uStack_64,iStack_68);
    pcStack_288 = pcVar5 + lStack_70;
    do {
      uStack_278 = 0;
      lVar4 = func_0x006f9748(auStack_2a0,uVar7,pcVar5);
      if (lVar4 != 0) goto LAB_006f96c4;
      bVar1 = uVar7 < uStack_290;
      uVar7 = uVar7 + 1;
    } while (bVar1);
  }
LAB_006f968c:
  func_0x006e383c(uVar3);
  return 1;
}

