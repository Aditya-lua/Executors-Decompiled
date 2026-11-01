
undefined8 FUN_001238e4(undefined8 param_1,char *param_2,uint param_3)

{
  float fVar1;
  int iVar2;
  undefined8 uVar3;
  int in_w8;
  long lVar4;
  undefined8 uVar5;
  long *unaff_x23;
  uint uVar6;
  float fVar7;
  float fVar8;
  undefined4 uStack0000000000000008;
  float fStack000000000000000c;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined4 in_stack_00000048;
  undefined4 uStack000000000000004c;
  undefined4 in_stack_00000050;
  undefined8 uStack0000000000000054;
  
  if (in_w8 == 0) {
    if (param_2 == (char *)0x0) {
      uVar6 = 0x1a;
    }
    else {
      if (*param_2 == '\0') goto LAB_001238e8;
      uVar6 = 0x10001e;
    }
    uVar3 = func_0x000c0ed4();
    uVar5 = func_0x00122970(uVar3,uVar6 | param_3);
    if (param_2 != (char *)0x0) {
      lVar4 = *unaff_x23;
      in_stack_00000038 = *(undefined8 *)(&UNK_000049d0 + lVar4);
      in_stack_00000030 = *(undefined8 *)(&UNK_000049c8 + lVar4);
      in_stack_00000040 = *(undefined8 *)(&UNK_000049d8 + lVar4);
      in_stack_00000048 = (undefined4)*(undefined8 *)(&UNK_000049e0 + lVar4);
      uStack0000000000000054 = *(undefined8 *)(&UNK_000049ec + lVar4);
      uStack000000000000004c = (undefined4)*(undefined8 *)(&UNK_000049e4 + lVar4);
      in_stack_00000050 = (undefined4)((ulong)*(undefined8 *)(&UNK_000049e4 + lVar4) >> 0x20);
      in_stack_00000018 = *(undefined8 *)(&UNK_000049b0 + lVar4);
      in_stack_00000010 = *(undefined8 *)(&UNK_000049a8 + lVar4);
      in_stack_00000028 = *(undefined8 *)(&UNK_000049c0 + lVar4);
      in_stack_00000020 = *(undefined8 *)(&UNK_000049b8 + lVar4);
      fVar7 = (*(float *)(&UNK_000049bc + lVar4) - *(float *)(&UNK_00003924 + lVar4)) -
              *(float *)(&UNK_00003d38 + lVar4);
      fVar8 = *(float *)(&UNK_000049b8 + lVar4);
      fVar1 = *(float *)(&UNK_000049b4 + lVar4);
      if (*(float *)(&UNK_000049b4 + lVar4) < fVar7) {
        fVar1 = fVar7;
      }
      fVar7 = *(float *)(&UNK_00003928 + lVar4);
      uVar3 = func_0x000d5210("#CLOSE",0,uVar3);
      uStack0000000000000008 = fVar1;
      fStack000000000000000c = fVar8 + fVar7;
      iVar2 = func_0x0010c1d4(uVar3,&uStack0000000000000008);
      if (iVar2 != 0) {
        *param_2 = '\0';
      }
      *(undefined8 *)(&UNK_000049d0 + lVar4) = in_stack_00000038;
      *(undefined8 *)(&UNK_000049c8 + lVar4) = in_stack_00000030;
      *(ulong *)(&UNK_000049e0 + lVar4) = CONCAT44(uStack000000000000004c,in_stack_00000048);
      *(undefined8 *)(&UNK_000049d8 + lVar4) = in_stack_00000040;
      *(undefined8 *)(&UNK_000049ec + lVar4) = uStack0000000000000054;
      *(ulong *)(&UNK_000049e4 + lVar4) = CONCAT44(in_stack_00000050,uStack000000000000004c);
      *(undefined8 *)(&UNK_000049b0 + lVar4) = in_stack_00000018;
      *(undefined8 *)(&UNK_000049a8 + lVar4) = in_stack_00000010;
      *(undefined8 *)(&UNK_000049c0 + lVar4) = in_stack_00000028;
      *(undefined8 *)(&UNK_000049b8 + lVar4) = in_stack_00000020;
    }
  }
  else {
LAB_001238e8:
    uVar5 = 0;
  }
  return uVar5;
}

