
void FUN_0025e388(void)

{
  long lVar1;
  long unaff_x19;
  long lVar2;
  long unaff_x22;
  undefined8 *puVar3;
  
  lVar1 = *(long *)(unaff_x19 + 8);
  lVar2 = *(long *)(unaff_x19 + 0x10);
  if (lVar2 != 0) goto LAB_0025e3b0;
  do {
    if (unaff_x22 != 0) {
      func_0x00187bd4(lVar1,unaff_x22 * 0x18,8);
    }
    __Unwind_Resume();
LAB_0025e3b0:
    puVar3 = (undefined8 *)(lVar1 + 8);
    do {
      if (puVar3[-1] != 0) {
        func_0x00187bd4(*puVar3,puVar3[-1],1);
      }
      puVar3 = puVar3 + 3;
      lVar2 = lVar2 + -1;
    } while (lVar2 != 0);
  } while( true );
}

