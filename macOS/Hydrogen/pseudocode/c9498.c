
void FUN_000c9498(void)

{
  char cVar1;
  uint uVar2;
  undefined8 *puVar3;
  long lVar4;
  uint *unaff_x19;
  ulong unaff_x20;
  undefined8 unaff_x21;
  uint unaff_w22;
  ulong unaff_x23;
  undefined8 unaff_x24;
  long unaff_x25;
  long unaff_x27;
  long unaff_x28;
  undefined8 uVar5;
  undefined1 auVar6 [16];
  undefined1 *in_stack_00000048;
  
  func_0x000bae48();
  do {
    unaff_x20 = unaff_x20 + 1;
    uVar2 = *unaff_x19;
    unaff_x28 = unaff_x28 + 0x1c;
    if ((long)(int)uVar2 <= (long)unaff_x20) {
      if (unaff_w22 == uVar2) {
        if (*(int *)(&UNK_00003f7c + unaff_x27) < 0) {
          func_0x000ebbac();
          *(undefined4 *)(&UNK_00003f78 + unaff_x27) = 0;
          cVar1 = in_stack_00000048[0xec];
        }
        else {
          *(undefined4 *)(&UNK_00003f78 + unaff_x27) = 0;
          cVar1 = in_stack_00000048[0xec];
        }
      }
      else {
        _memmove(*(long *)(unaff_x27 + 0x3f80),
                 *(long *)(unaff_x27 + 0x3f80) + (ulong)unaff_w22 * 0x1c,
                 ((long)(int)uVar2 - (ulong)unaff_w22) * 0x1c);
        *(uint *)(&UNK_00003f78 + unaff_x27) = *(int *)(&UNK_00003f78 + unaff_x27) - unaff_w22;
        cVar1 = in_stack_00000048[0xec];
      }
      if (cVar1 != '\0') {
        _bzero(unaff_x27 + 0xb58,0x29a);
        lVar4 = 0x298;
        uVar5 = NEON_fmov(0xbf800000,4);
        puVar3 = (undefined8 *)(unaff_x27 + 0xe98);
        do {
          *(undefined1 *)((long)puVar3 + -0x34) = 0;
          *(undefined1 *)((long)puVar3 + -0x24) = 0;
          *(undefined1 *)((long)puVar3 + -0x14) = 0;
          *(undefined1 *)((long)puVar3 + -4) = 0;
          puVar3[-6] = uVar5;
          puVar3[-4] = uVar5;
          puVar3[-2] = uVar5;
          *puVar3 = uVar5;
          lVar4 = lVar4 + -4;
          puVar3 = puVar3 + 8;
        } while (lVar4 != 0);
        *in_stack_00000048 = 0;
        *(undefined8 *)(&UNK_000037e8 + unaff_x27) = uVar5;
        in_stack_00000048[0x10] = 0;
        *(undefined8 *)(&UNK_000037f8 + unaff_x27) = uVar5;
        *(undefined8 *)(unaff_x27 + 0xe5c) = 0;
        *(undefined8 *)(unaff_x27 + 0xe40) = 0xff7fffffff7fffff;
        *(undefined4 *)(unaff_x27 + 0xe48) = 0;
        *(undefined1 *)(unaff_x27 + 0xe4c) = 0;
        _memset_pattern16(&UNK_00003890 + unaff_x27,&UNK_0080c390,0x14);
        auVar6 = NEON_fmov(0xbf800000,4);
        *(long *)(in_stack_00000048 + 200) = auVar6._8_8_;
        *(long *)(in_stack_00000048 + 0xc0) = auVar6._0_8_;
        *(undefined4 *)(&UNK_000038b4 + unaff_x27) = 0xbf800000;
        *(undefined8 *)(unaff_x27 + 0xe50) = 0;
        if (*(int *)(&UNK_000038dc + unaff_x27) < 0) {
          func_0x000c202c(&UNK_000038d8 + unaff_x27,0);
        }
        *(undefined4 *)(&UNK_000038d8 + unaff_x27) = 0;
      }
      return;
    }
    uVar5 = unaff_x24;
    if (unaff_x23 <= unaff_x20) {
      uVar5 = unaff_x21;
    }
    uVar2 = *(int *)(*(long *)(unaff_x27 + 0x3f80) + unaff_x28) - 1;
  } while (5 < uVar2);
                    /* WARNING: Could not recover jumptable at 0x000c934c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&UNK_000c9350 + (ulong)*(byte *)(unaff_x25 + (ulong)uVar2) * 4))(uVar5);
  return;
}

