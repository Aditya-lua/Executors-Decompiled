
/* WARNING: Removing unreachable block (ram,0x006f9714) */
/* WARNING: Removing unreachable block (ram,0x006f9618) */
/* WARNING: Removing unreachable block (ram,0x006f961c) */

undefined4 FUN_006f94c8(void)

{
  char cVar1;
  bool bVar2;
  int iVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  undefined8 unaff_x19;
  long unaff_x20;
  char *unaff_x21;
  int unaff_w22;
  ulong unaff_x25;
  ulong unaff_x26;
  ulong uVar7;
  long unaff_x29;
  
  uVar7 = 0;
  do {
    lVar4 = _strpbrk(unaff_x21 + uVar7,"^$*+?.([%-");
    if (lVar4 != 0) {
      if (*unaff_x21 != '^') {
        lVar4 = *(long *)(unaff_x29 + -0x58);
        uVar7 = (unaff_x20 + (unaff_x26 & 0xffffffff)) - 1;
        goto code_r0x006f9660;
      }
      *(ulong *)(unaff_x29 + -0x60) = unaff_x25 - 1;
      lVar4 = func_0x006f9748();
      if (lVar4 == 0) goto LAB_006f968c;
      goto joined_r0x006f96c0;
    }
    lVar4 = _strlen(unaff_x21 + uVar7);
    uVar7 = uVar7 + lVar4 + 1;
  } while (uVar7 <= unaff_x25);
  if (unaff_x25 == 0) {
LAB_006f9720:
    func_0x006e3870();
    func_0x006e3870();
    return 2;
  }
  uVar7 = (*(long *)(unaff_x29 + -0x58) - (unaff_x26 & 0xffffffff)) + 1;
  if (unaff_x25 <= uVar7) {
    lVar4 = uVar7 - (unaff_x25 - 1);
    if (lVar4 != 0) {
      cVar1 = *unaff_x21;
      lVar6 = unaff_x20 + (unaff_x26 & 0xffffffff) + -1;
      do {
        lVar5 = _memchr(lVar6,(long)cVar1,lVar4);
        if (lVar5 == 0) break;
        lVar5 = lVar5 + 1;
        iVar3 = _memcmp(lVar5,unaff_x21 + 1,unaff_x25 - 1);
        if (iVar3 == 0) goto LAB_006f9720;
        lVar4 = (lVar4 + lVar6) - lVar5;
        lVar6 = lVar5;
      } while (lVar4 != 0);
    }
  }
LAB_006f968c:
  func_0x006e383c();
  return 1;
  while (bVar2 = uVar7 < (ulong)(unaff_x20 + lVar4), uVar7 = uVar7 + 1, bVar2) {
code_r0x006f9660:
    lVar6 = func_0x006f9748();
    if (lVar6 != 0) {
joined_r0x006f96c0:
      if (unaff_w22 != 0) {
        func_0x006e3870();
        func_0x006e3870();
        func_0x006e6978(unaff_x19,0,"too many captures");
        return 2;
      }
      func_0x006e6978(unaff_x19,1,"too many captures");
      iVar3 = 0;
      do {
        func_0x006fa2fc();
        iVar3 = iVar3 + 1;
      } while (iVar3 != 1);
      return 1;
    }
  }
  goto LAB_006f968c;
}

