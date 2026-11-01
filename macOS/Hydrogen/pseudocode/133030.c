
void FUN_00133030(void)

{
  int iVar1;
  undefined8 uVar2;
  undefined4 uVar3;
  undefined4 *puVar4;
  int unaff_w19;
  long unaff_x22;
  int unaff_w23;
  long unaff_x24;
  undefined8 uVar5;
  long unaff_x27;
  long unaff_x28;
  float unaff_s8;
  float unaff_s9;
  float unaff_s10;
  float unaff_s11;
  float unaff_s12;
  undefined8 in_stack_00000018;
  int *in_stack_00000020;
  undefined8 in_stack_00000030;
  undefined8 uStack0000000000000038;
  float in_stack_00000040;
  undefined1 uStack0000000000000054;
  undefined4 uStack0000000000000058;
  float in_stack_00000060;
  
  func_0x000bc130(unaff_s10 + *(float *)(&UNK_0000393c + unaff_x27),&uStack0000000000000054,0,1);
  func_0x000bbdd0(1);
  uVar5 = *(undefined8 *)(unaff_x22 + 0x2a8);
  uVar2 = func_0x000bba44(0x3f800000,0);
  uVar3 = 2;
  if ((*(byte *)(unaff_x24 + (long)unaff_w23 * 0x70 + 0x6d) & 3) != 1) {
    uVar3 = 3;
  }
  func_0x001068e8(unaff_s12 + unaff_s10,uVar5,uVar2,uVar3);
  if ((in_stack_00000018._4_4_ != 0) && (unaff_w19 != *(short *)(unaff_x28 + 0x218))) {
    func_0x001320a0(in_stack_00000030);
    func_0x00132120();
  }
  in_stack_00000040 = unaff_s11 + unaff_s9 + *(float *)(&UNK_00003928 + unaff_x27);
  func_0x000bcb14(*(undefined8 *)(unaff_x22 + 0x2a8),&uStack0000000000000058,
                  (long)&uStack0000000000000038 + 4);
  if ((unaff_s8 - uStack0000000000000058 < in_stack_00000060 && uStack0000000000000038._3_1_ != '\0'
      ) && (*in_stack_00000020 == 0)) {
    func_0x000d9148("%.*s");
  }
  iVar1 = func_0x000d6f58(1);
  if ((iVar1 != 0) && (iVar1 = func_0x000c2648(0), iVar1 != 0)) {
    puVar4 = *(undefined4 **)(&UNK_00004e18 + lRam0000000000a334c0);
    if (unaff_w19 == -1) {
      unaff_w19 = puVar4[0x1d];
    }
    if ((*(byte *)(puVar4 + 1) & 7) != 0) {
      *(undefined1 *)((long)puVar4 + 0x23b) = 1;
      if (unaff_w19 == puVar4[0x1b]) {
        unaff_w19 = -1;
      }
      *(short *)(puVar4 + 0x89) = (short)unaff_w19;
      *(undefined2 *)((long)puVar4 + 0x7a) = *(undefined2 *)(puVar4 + 0x1e);
      uVar2 = func_0x000b89a8("##ContextMenu",0,*puVar4);
      func_0x000d94ec(uVar2,0);
    }
  }
  return;
}

