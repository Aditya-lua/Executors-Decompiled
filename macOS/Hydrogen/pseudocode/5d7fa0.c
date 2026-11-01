
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

long FUN_005d7fa0(void)

{
  uint uVar1;
  code *pcVar2;
  long lVar3;
  undefined8 *puVar4;
  undefined8 uVar5;
  ulong uVar6;
  undefined8 extraout_x8;
  uint *extraout_x9;
  undefined1 auVar7 [16];
  
  pcVar2 = 
  ___ZN3std4hash6random11RandomState3new4KEYS29__u7b__u7b_constant_u7d__u7d_28__u7b__u7b_closure_u7d__u7d_3VAL17h3498d7596e36c0fdE
  ;
  auVar7 = (*
           ___ZN3std4hash6random11RandomState3new4KEYS29__u7b__u7b_constant_u7d__u7d_28__u7b__u7b_closure_u7d__u7d_3VAL17h3498d7596e36c0fdE
           )(&
             __ZN3std4hash6random11RandomState3new4KEYS29__u7b__u7b_constant_u7d__u7d_28__u7b__u7b_closure_u7d__u7d_3VAL17h3498d7596e36c0fdE
            );
  uVar5 = auVar7._8_8_;
  uVar1 = *auVar7._0_8_;
  uVar6 = (ulong)uVar1;
  if ((uVar1 & 1) != 0) goto LAB_005d7fc8;
  if (extraout_x9 == (uint *)0x0) {
LAB_005d7ff4:
    uVar6 = func_0x0042b2b8(uVar6,auVar7._0_8_,uVar5);
  }
  else {
    uVar6 = *(ulong *)(extraout_x9 + 2);
    uVar5 = *(undefined8 *)(extraout_x9 + 4);
    extraout_x9[0] = 0;
    extraout_x9[1] = 0;
    if ((*extraout_x9 & 1) == 0) goto LAB_005d7ff4;
  }
  auVar7 = (*pcVar2)(uVar6,&
                           __ZN3std4hash6random11RandomState3new4KEYS29__u7b__u7b_constant_u7d__u7d_28__u7b__u7b_closure_u7d__u7d_3VAL17h3498d7596e36c0fdE
                    );
  puVar4 = auVar7._0_8_;
  *puVar4 = 1;
  puVar4[1] = extraout_x8;
  puVar4[2] = auVar7._8_8_;
LAB_005d7fc8:
  lVar3 = (*pcVar2)(&
                    __ZN3std4hash6random11RandomState3new4KEYS29__u7b__u7b_constant_u7d__u7d_28__u7b__u7b_closure_u7d__u7d_3VAL17h3498d7596e36c0fdE
                   );
  return lVar3 + 8;
}

