
/* WARNING: Removing unreachable block (ram,0x00078e14) */
/* WARNING: Removing unreachable block (ram,0x00078ea4) */
/* WARNING: Type propagation algorithm not settling */

void FUN_00078ccc(void)

{
  undefined8 *******pppppppuVar1;
  undefined4 uVar2;
  undefined8 uVar3;
  undefined8 extraout_x1;
  undefined8 *extraout_x8;
  uint unaff_w22;
  undefined8 in_stack_00000000;
  long in_stack_00000010;
  char acStack_98 [8];
  undefined2 uStack_90;
  undefined1 uStack_8e;
  char cStack_81;
  undefined8 auStack_80 [2];
  char cStack_69;
  undefined8 *******apppppppuStack_68 [2];
  char cStack_51;
  undefined1 auStack_50 [23];
  undefined1 uStack_39;
  undefined1 uStack_31;
  
  __ZdlPv();
  func_0x000781f4();
  uVar3 = __Unwind_Resume();
  func_0x000781f4();
  uVar3 = __Unwind_Resume(uVar3);
  func_0x000781f4();
  uVar3 = __Unwind_Resume(uVar3);
  func_0x000781f4();
  uVar3 = __Unwind_Resume(uVar3);
  func_0x000781f4();
  uVar3 = __Unwind_Resume(uVar3);
  func_0x000780c4();
  func_0x000781f4();
  __Unwind_Resume(uVar3);
  uVar3 = func_0x0001753c();
  if (in_stack_00000010 < 0) {
    __ZdlPv(in_stack_00000000);
    unaff_w22 = unaff_w22 & 1;
  }
  if (unaff_w22 != 0) {
    ___cxa_free_exception();
  }
  func_0x000781f4();
  uVar2 = __Unwind_Resume(uVar3);
  cStack_81 = '\n';
  uStack_90 = 0x726f;
  acStack_98[0] = s_type_error_008d23b6[0];
  acStack_98[1] = s_type_error_008d23b6[1];
  acStack_98[2] = s_type_error_008d23b6[2];
  acStack_98[3] = s_type_error_008d23b6[3];
  acStack_98[4] = s_type_error_008d23b6[4];
  acStack_98[5] = s_type_error_008d23b6[5];
  acStack_98[6] = s_type_error_008d23b6[6];
  acStack_98[7] = s_type_error_008d23b6[7];
  uStack_8e = 0;
  uStack_31 = 0x2e;
  __ZNSt3__19to_stringEi(auStack_50);
  func_0x00079404(auStack_80,"[json.exception.",acStack_98,&uStack_31,auStack_50,"] ");
  uStack_39 = 0;
  auStack_50[0] = 0;
  func_0x00079304(apppppppuStack_68,auStack_80,auStack_50,extraout_x1);
  if (cStack_69 < '\0') {
    __ZdlPv(auStack_80[0]);
  }
  if (cStack_81 < '\0') {
    __ZdlPv(acStack_98);
  }
  pppppppuVar1 = apppppppuStack_68[0];
  if (-1 < cStack_51) {
    pppppppuVar1 = apppppppuStack_68;
  }
  *extraout_x8 = &UNK_009b9460;
  *(undefined4 *)(extraout_x8 + 1) = uVar2;
  __ZNSt13runtime_errorC1EPKc(extraout_x8 + 2,pppppppuVar1);
  *extraout_x8 = &UNK_009b9438;
  if (cStack_51 < '\0') {
    __ZdlPv(apppppppuStack_68[0]);
    return;
  }
  return;
}

