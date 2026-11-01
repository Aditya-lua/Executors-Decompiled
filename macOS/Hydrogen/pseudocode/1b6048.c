
undefined8 FUN_001b6048(void)

{
  long *plVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  long *plVar5;
  long lVar6;
  
  __Unwind_Resume();
  lVar2 = func_0x007a2668();
  if (*(long *)(lVar2 + 0x28) != 0) {
    lVar3 = *(long *)(lVar2 + 0x20);
    lVar2 = lVar3 + *(long *)(lVar2 + 0x28) * 0x30;
    do {
      plVar5 = *(long **)(lVar3 + 8);
      lVar4 = *(long *)(lVar3 + 0x10) << 5;
      while (lVar4 != 0) {
        lVar6 = *plVar5;
        plVar1 = plVar5 + 3;
        plVar5 = plVar5 + 4;
        lVar4 = lVar4 + -0x20;
        if (lVar6 != -0x7fffffffffffffff && (short)*plVar1 != 5) {
          return 1;
        }
      }
      lVar3 = lVar3 + 0x30;
    } while (lVar3 != lVar2);
  }
  return 0;
}

