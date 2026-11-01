
char FUN_005860dc(void)

{
  char cVar1;
  undefined8 extraout_x1;
  undefined8 uVar2;
  long lVar3;
  long lStack_68;
  long lStack_60;
  long lStack_58;
  
  func_0x00187bd4();
  __Unwind_Resume();
  func_0x005ca790(&lStack_68);
  lVar3 = 0;
  do {
    if (lStack_58 * 8 == lVar3) {
      cVar1 = '\x02';
      if (lStack_68 == 0) {
        return '\x02';
      }
      goto code_r0x00586198;
    }
    uVar2 = *(undefined8 *)(lStack_60 + lVar3);
    cVar1 = func_0x0058a0f4(extraout_x1,0,1,uVar2);
    if ((cVar1 != '\x02') || (cVar1 = func_0x00582368(uVar2,extraout_x1), cVar1 != '\x02')) break;
    cVar1 = func_0x0058a0f4(extraout_x1,1,1,uVar2);
    lVar3 = lVar3 + 8;
  } while (cVar1 == '\x02');
  if (lStack_68 != 0) {
code_r0x00586198:
    func_0x00187bd4(lStack_60,lStack_68 << 3,8);
  }
  return cVar1;
}

