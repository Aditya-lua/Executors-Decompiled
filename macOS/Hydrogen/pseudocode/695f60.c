
void FUN_00695f60(code *param_1)

{
  code *pcVar1;
  long *plVar2;
  ulong uVar3;
  long lVar4;
  undefined8 uVar5;
  ulong unaff_x19;
  long unaff_x20;
  long *unaff_x21;
  long *unaff_x22;
  
  (*param_1)();
  plVar2 = (long *)(**(code **)(*unaff_x21 + 0xa0))();
  (**(code **)(*plVar2 + 0x48))();
  uVar3 = (**(code **)(*unaff_x22 + 0x18))();
  if (uVar3 == 0) {
    uVar5 = ___cxa_allocate_exception(0x28);
    func_0x0000a968();
    func_0x005ef2f0(uVar5);
    ___cxa_throw(uVar5,&UNK_009b2e78,&DAT_00026d7c);
LAB_0069612c:
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x696130);
    (*pcVar1)();
  }
  if (uVar3 < unaff_x19) {
    uVar5 = ___cxa_allocate_exception(0x28);
    func_0x0000a968();
    func_0x0002703c(uVar5);
    ___cxa_throw(uVar5,&DAT_009b2ee0,&DAT_000270bc);
    goto LAB_0069612c;
  }
  uVar3 = unaff_x21[3];
  lVar4 = unaff_x21[4];
  if (uVar3 != unaff_x19) {
    if (lVar4 != 0) {
      if (uVar3 != 0) {
        do {
          *(undefined1 *)(lVar4 + -1 + uVar3) = 0;
          uVar3 = uVar3 - 1;
        } while (uVar3 != 0);
      }
      func_0x00611644();
    }
    if (unaff_x19 == 0) {
      unaff_x21[3] = 0;
      unaff_x21[4] = 0;
      goto LAB_00696010;
    }
    lVar4 = func_0x006115d0();
  }
  unaff_x21[3] = unaff_x19;
  unaff_x21[4] = lVar4;
  unaff_x21[2] = -1;
  if ((unaff_x20 != 0) && (lVar4 != 0)) {
    _memcpy();
  }
LAB_00696010:
  unaff_x21[2] = -1;
  (**(code **)(*unaff_x21 + 0xa0))();
  (**(code **)(*unaff_x22 + 0x30))();
  return;
}

