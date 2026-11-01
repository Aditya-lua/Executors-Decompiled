
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined * FUN_0042f504(void)

{
  long *plVar1;
  byte bVar2;
  int iVar3;
  undefined *puVar4;
  uint *puVar5;
  ulong uVar6;
  long unaff_x19;
  undefined8 uVar7;
  long unaff_x20;
  long unaff_x29;
  long in_xzr;
  undefined1 uStack0000000000000010;
  
  _memcpy();
  *(undefined1 *)(unaff_x20 + unaff_x19) = 0;
  func_0x00462a54(unaff_x29 + -0x50,&uStack0000000000000010,unaff_x19 + 1);
  if ((*(uint *)(unaff_x29 + -0x50) & 1) == 0) {
    uVar7 = *(undefined8 *)(unaff_x29 + -0x48);
    func_0x004286b0(unaff_x29 + -0x38);
    iVar3 = _unsetenv(uVar7);
    if (iVar3 == -1) {
      puVar5 = (uint *)___error();
      puVar4 = (undefined *)((ulong)*puVar5 << 0x20 | 2);
      plVar1 = *(long **)(unaff_x29 + -0x30);
      bVar2 = *(byte *)(unaff_x29 + -0x28);
    }
    else {
      puVar4 = (undefined *)0x0;
      plVar1 = *(long **)(unaff_x29 + -0x30);
      bVar2 = *(byte *)(unaff_x29 + -0x28);
    }
    if ((((bVar2 & 1) == 0) &&
        ((___ZN3std9panicking11panic_count18GLOBAL_PANIC_COUNT17h44f8b48277a7bf95E &
         0x7fffffffffffffff) != 0)) && (uVar6 = func_0x007a1140(), (uVar6 & 1) == 0)) {
      *(undefined1 *)(plVar1 + 1) = 1;
    }
    if (*plVar1 == 1) {
      *plVar1 = in_xzr;
    }
    else {
      func_0x007a1ae8(plVar1);
    }
  }
  else {
    puVar4 = &UNK_009dae48;
  }
  return puVar4;
}

