undefined8 FUN_180c326f0(void)

{
  undefined8 unaff_RBX;
  undefined8 unaff_RSI;
  undefined8 *unaff_RDI;
  
  FUN_180f29110();
  if (*(int *)((longlong)unaff_RDI + 0x14) == 0) {
    FUN_180c144e0(*unaff_RDI,unaff_RDI[5],&UNK_180f85400,0xe1);
  }
  else {
    FUN_180c3a540();
  }
  *unaff_RDI = unaff_RSI;
  unaff_RDI[5] = unaff_RBX;
  return 1;
}

