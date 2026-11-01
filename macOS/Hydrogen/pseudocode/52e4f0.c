
void FUN_0052e4f0(void)

{
  code *pcVar1;
  int iVar2;
  undefined8 uVar3;
  undefined8 *unaff_x19;
  long unaff_x29;
  
  iVar2 = func_0x0050f9f0();
  if (iVar2 != 0) {
    func_0x007a2810(&UNK_008a7f30,0x37,unaff_x29 + -0x31,&UNK_009eaa50,&UNK_009eaa20);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x52e63c);
    (*pcVar1)();
  }
  uVar3 = func_0x0051ba54();
  *unaff_x19 = 0x8000000000000000;
  unaff_x19[1] = uVar3;
  return;
}

