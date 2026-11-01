
char FUN_00585efc(undefined8 param_1,undefined8 param_2)

{
  long lVar1;
  long lVar2;
  char cVar3;
  undefined8 uVar4;
  long lVar5;
  long lVar6;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long in_stack_00000018;
  
  func_0x005c0b20(&uStack0000000000000008);
  lVar2 = in_stack_00000010;
  lVar1 = uStack0000000000000008;
  lVar5 = 0;
  lVar6 = in_stack_00000018 * 8;
  do {
    if (lVar6 == lVar5) {
      cVar3 = '\x02';
      if (lVar1 == 0) {
        return '\x02';
      }
      goto LAB_00585f98;
    }
    uVar4 = *(undefined8 *)(lVar2 + lVar5);
    cVar3 = func_0x0058a0f4(param_2,0,1,uVar4);
    if ((cVar3 != '\x02') || (cVar3 = func_0x00582368(uVar4,param_2), cVar3 != '\x02')) break;
    cVar3 = func_0x0058a0f4(param_2,1,1,uVar4);
    lVar5 = lVar5 + 8;
  } while (cVar3 == '\x02');
  if (lVar1 != 0) {
LAB_00585f98:
    func_0x00187bd4(lVar2,lVar1 << 3,8);
  }
  return cVar3;
}

