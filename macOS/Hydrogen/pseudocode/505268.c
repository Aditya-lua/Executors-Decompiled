
long FUN_00505268(void)

{
  undefined8 uVar1;
  long lVar2;
  int iVar3;
  long lVar4;
  long lVar5;
  undefined1 auVar6 [16];
  
  auVar6 = __Unwind_Resume();
  lVar4 = *(long *)(auVar6._0_8_ + 0x90);
  if (lVar4 != 0) {
    lVar5 = *(long *)(auVar6._0_8_ + 0x88);
    uVar1 = *auVar6._8_8_;
    lVar2 = auVar6._8_8_[1];
    lVar4 = lVar4 * 600;
    do {
      if ((*(long *)(lVar5 + 0x220) == lVar2) &&
         (iVar3 = _memcmp(*(undefined8 *)(lVar5 + 0x218),uVar1,lVar2), iVar3 == 0)) {
        return lVar5;
      }
      lVar5 = lVar5 + 600;
      lVar4 = lVar4 + -600;
    } while (lVar4 != 0);
  }
  return 0;
}

