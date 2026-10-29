/* 7ff70c971630 FUN_7ff70c971630 */

/* WARNING: Type propagation algorithm not settling */

int FUN_7ff70c971630(undefined8 param_1)

{
  code *pcVar1;
  int iVar2;
  int iVar3;
  char *pcVar4;
  ulonglong uVar5;
  uint uVar6;
  undefined8 *******pppppppuVar7;
  undefined8 *puVar8;
  byte *unaff_RDI;
  undefined8 uStack_a8;
  undefined1 auStack_78 [16];
  undefined8 *******apppppppuStack_68 [3];
  ulonglong uStack_50;
  undefined8 uStack_48;
  undefined8 *******apppppppuStack_40 [3];
  ulonglong uStack_28;
  undefined8 uStack_20;
  
  uStack_20 = 0xfffffffffffffffe;
  uVar6 = 0xcb84de1;
  pcVar4 = (char *)func_0x7ff70d65ebf4();
  *(uint *)(pcVar4 + -0x7b) = *(uint *)(pcVar4 + -0x7b) ^ uVar6;
  *unaff_RDI = *unaff_RDI >> 4 | *unaff_RDI << 4;
  *pcVar4 = *pcVar4 + (char)pcVar4;
  FUN_7ff70c971860(apppppppuStack_68,&UNK_7ff70cb9271a,param_1);
  pppppppuVar7 = apppppppuStack_68;
  if (7 < uStack_50) {
    pppppppuVar7 = apppppppuStack_68[0];
  }
  FUN_7ff70cb129f0(auStack_78,pppppppuVar7);
  FUN_7ff70c971860(apppppppuStack_40,&UNK_7ff70cb92784,param_1);
  pppppppuVar7 = apppppppuStack_40;
  if (7 < uStack_28) {
    pppppppuVar7 = apppppppuStack_40[0];
  }
  uStack_a8 = 0x7ff70c9716c7;
  iVar2 = func_0x7ff70d61bc8b(0xffffffff80000002,pppppppuVar7,&uStack_48);
  if (iVar2 == 0) {
    puVar8 = &uStack_a8;
    uStack_a8 = uStack_48;
    func_0x7ff70d653ae5();
    iVar3 = FUN_7ff70cb12a10(auStack_78);
    pppppppuVar7 = apppppppuStack_40[0];
    if (uStack_28 < 8) {
      pppppppuVar7 = apppppppuStack_40;
    }
    if (iVar3 != 0) {
      func_0x7ff70d6c145a(0xffffffff80000002);
      goto joined_r0x7ff70c971735;
    }
    iVar2 = func_0x7ff70d8d0f7f(0xffffffff80000002,pppppppuVar7);
    iVar3 = -0x3ffffeb3;
    if (iVar2 == 0) {
      iVar3 = 0;
    }
  }
  else {
    iVar3 = 0;
    if (iVar2 != 2) {
      iVar3 = -0x3ffffeb3;
    }
joined_r0x7ff70c971735:
    puVar8 = (undefined8 *)&stack0xffffffffffffff60;
  }
  if (7 < uStack_28) {
    uVar5 = uStack_28 * 2 + 2;
    pppppppuVar7 = apppppppuStack_40[0];
    if (0xfff < uVar5) {
      pppppppuVar7 = (undefined8 *******)apppppppuStack_40[0][-1];
      if (0x1f < (ulonglong)((longlong)apppppppuStack_40[0] + (-8 - (longlong)pppppppuVar7)))
      goto LAB_7ff70c9717f9;
      uVar5 = uStack_28 * 2 + 0x29;
    }
    *(undefined8 *)((longlong)puVar8 + -8) = 0x7ff70c971773;
    thunk_FUN_7ff70ca90250(pppppppuVar7,uVar5);
  }
  if (7 < uStack_50) {
    uVar5 = uStack_50 * 2 + 2;
    pppppppuVar7 = apppppppuStack_68[0];
    if (0xfff < uVar5) {
      pppppppuVar7 = (undefined8 *******)apppppppuStack_68[0][-1];
      if (0x1f < (ulonglong)((longlong)apppppppuStack_68[0] + (-8 - (longlong)pppppppuVar7))) {
LAB_7ff70c9717f9:
                    /* WARNING: Does not return */
        pcVar1 = (code *)invalidInstructionException();
        (*pcVar1)();
      }
      uVar5 = uStack_50 * 2 + 0x29;
    }
    *(undefined8 *)((longlong)puVar8 + -8) = 0x7ff70c9717b5;
    thunk_FUN_7ff70ca90250(pppppppuVar7,uVar5);
  }
  return iVar3;
}


