
/* WARNING: Removing unreachable block (ram,0x00420014) */

void FUN_0041ff00(void)

{
  undefined8 uVar1;
  ulong uVar2;
  undefined2 uVar3;
  undefined8 *puVar4;
  ulong uVar5;
  undefined2 *puVar6;
  undefined8 *extraout_x8;
  undefined *puVar7;
  undefined8 in_stack_00000010;
  long in_stack_00000018;
  undefined8 in_stack_00000020;
  uint uStack_220;
  undefined4 uStack_21c;
  undefined1 uStack_218;
  undefined7 uStack_217;
  undefined1 uStack_210;
  undefined1 auStack_200 [30];
  undefined2 uStack_1e2;
  undefined2 *puStack_1e0;
  undefined2 uStack_1d8;
  undefined6 uStack_1d6;
  undefined2 uStack_1d0;
  undefined6 uStack_1ce;
  undefined2 uStack_1c8;
  int aiStack_58 [2];
  undefined8 uStack_50;
  
  _freeaddrinfo(in_stack_00000010);
  if (in_stack_00000018 != 0) {
    func_0x00187bd4(in_stack_00000020,in_stack_00000018 << 5,4);
  }
  puVar4 = (undefined8 *)__Unwind_Resume();
  uVar1 = *puVar4;
  uVar2 = puVar4[1];
  uVar3 = *(undefined2 *)(puVar4 + 2);
  uVar5 = func_0x004644e4(uVar1,uVar2);
  if ((uVar5 & 1) == 0) {
    puVar6 = (undefined2 *)func_0x00187bd0(0x20,4);
    if (puVar6 != (undefined2 *)0x0) {
      *puVar6 = 0;
      *(int *)(puVar6 + 1) = (int)(uVar5 >> 8);
      puVar6[3] = uVar3;
      *extraout_x8 = puVar6;
      extraout_x8[1] = puVar6;
      extraout_x8[2] = 1;
      extraout_x8[3] = puVar6 + 0x10;
      return;
    }
code_r0x004200d0:
    func_0x007a1f18(4,0x20);
code_r0x004200dc:
    func_0x007a0c5c(&uStack_220,uVar1,uVar2,&puStack_1e0);
    puVar7 = (undefined *)CONCAT71(uStack_217,uStack_218);
  }
  else {
    func_0x004645e0(&uStack_220,uVar1,uVar2);
    if ((uStack_220 & 1) == 0) {
      puVar6 = (undefined2 *)func_0x00187bd0(0x20,4);
      if (puVar6 != (undefined2 *)0x0) {
        uStack_1ce = (undefined6)uStack_217;
        uStack_1c8 = (undefined2)(CONCAT17(uStack_210,uStack_217) >> 0x30);
        uStack_1d6 = (undefined6)CONCAT43(uStack_21c,uStack_220._1_3_);
        uStack_1d0 = (undefined2)
                     (CONCAT17(uStack_218,CONCAT43(uStack_21c,uStack_220._1_3_)) >> 0x30);
        *puVar6 = 1;
        *(ulong *)(puVar6 + 5) = CONCAT62(uStack_1ce,uStack_1d0);
        *(ulong *)(puVar6 + 1) = CONCAT62(uStack_1d6,uStack_1d8);
        puVar6[9] = uStack_1c8;
        *(undefined4 *)(puVar6 + 10) = 0;
        *(undefined4 *)(puVar6 + 0xc) = 0;
        puVar6[0xe] = uVar3;
        *extraout_x8 = puVar6;
        extraout_x8[1] = puVar6;
        extraout_x8[2] = 1;
        extraout_x8[3] = puVar6 + 0x10;
        return;
      }
      goto code_r0x004200d0;
    }
    puStack_1e0 = &uStack_1e2;
    uStack_1e2 = uVar3;
    if (0x17f < uVar2) goto code_r0x004200dc;
    _memcpy(&uStack_1d8,uVar1,uVar2);
    *(undefined1 *)((long)&uStack_1d8 + uVar2) = 0;
    func_0x00462a54(aiStack_58,&uStack_1d8,uVar2 + 1);
    if (aiStack_58[0] == 1) {
      puVar7 = &UNK_009dae48;
      goto code_r0x004200c8;
    }
    func_0x00433174(&uStack_220,&puStack_1e0,uStack_50);
    puVar7 = (undefined *)CONCAT71(uStack_217,uStack_218);
  }
  if ((uStack_220 & 1) == 0) {
    func_0x0041fc04(extraout_x8,auStack_200);
    return;
  }
code_r0x004200c8:
  *extraout_x8 = 0;
  extraout_x8[1] = puVar7;
  return;
}

