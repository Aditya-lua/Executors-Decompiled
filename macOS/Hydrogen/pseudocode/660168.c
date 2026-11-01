
/* WARNING: Type propagation algorithm not settling */

undefined8 FUN_00660168(void)

{
  undefined8 *******pppppppuVar1;
  undefined8 uVar2;
  long *plVar3;
  int in_w8;
  undefined8 unaff_x20;
  uint unaff_w21;
  long unaff_x29;
  undefined1 auVar4 [16];
  undefined8 in_stack_00000000;
  long in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined7 uStack_68;
  undefined4 uStack_61;
  undefined1 uStack_5d;
  char cStack_51;
  undefined8 *******pppppppuStack_50;
  long lStack_48;
  long lStack_40;
  
  if (in_w8 < 0) {
    __ZdlPv(in_stack_00000018);
  }
  if (in_stack_00000010 < 0) {
    __ZdlPv(in_stack_00000000);
    unaff_w21 = unaff_w21 & 1;
  }
  if (unaff_w21 != 0) {
    ___cxa_free_exception();
    func_0x00087574(unaff_x29 + -0x50);
    __Unwind_Resume();
    unaff_x20 = func_0x0001753c();
  }
  func_0x00087574(unaff_x29 + -0x50);
  auVar4 = __Unwind_Resume(unaff_x20);
  cStack_51 = '\v';
  uStack_68 = s_ThisObject__008e578e._0_7_;
  uStack_61._0_1_ = s_ThisObject__008e578e[7];
  uStack_61 = CONCAT31(0x3a7463,(char)uStack_61);
  uStack_5d = 0;
  uVar2 = _strlen(&UNK_008be795);
  plVar3 = (long *)__ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                             (&uStack_68,&UNK_008be795,uVar2);
  lStack_48 = plVar3[1];
  pppppppuStack_50 = (undefined8 *******)*plVar3;
  lStack_40 = plVar3[2];
  plVar3[1] = 0;
  plVar3[2] = 0;
  *plVar3 = 0;
  pppppppuVar1 = pppppppuStack_50;
  if (-1 < lStack_40) {
    pppppppuVar1 = &pppppppuStack_50;
  }
  uVar2 = (**(code **)(*auVar4._0_8_ + 0x10))(auVar4._0_8_,pppppppuVar1,&UNK_00a04e98,auVar4._8_8_);
  if (lStack_40 < 0) {
    __ZdlPv(pppppppuStack_50);
  }
  if (cStack_51 < '\0') {
    __ZdlPv(CONCAT17((char)uStack_61,uStack_68));
    return uVar2;
  }
  s_ThisObject__008e578e[0] = s_ThisObject__008e578e[0];
  s_ThisObject__008e578e[1] = s_ThisObject__008e578e[1];
  s_ThisObject__008e578e[2] = s_ThisObject__008e578e[2];
  s_ThisObject__008e578e[3] = s_ThisObject__008e578e[3];
  s_ThisObject__008e578e[4] = s_ThisObject__008e578e[4];
  s_ThisObject__008e578e[5] = s_ThisObject__008e578e[5];
  s_ThisObject__008e578e[6] = s_ThisObject__008e578e[6];
  s_ThisObject__008e578e[7] = s_ThisObject__008e578e[7];
  return uVar2;
}

