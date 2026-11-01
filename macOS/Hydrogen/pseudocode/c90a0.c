
void FUN_000c90a0(void)

{
  undefined1 (*pauVar1) [16];
  long lVar2;
  uint uVar3;
  char cVar4;
  char *pcVar5;
  int in_w8;
  undefined8 *puVar6;
  long unaff_x19;
  int *unaff_x20;
  long lVar7;
  long unaff_x21;
  uint unaff_w22;
  int unaff_w25;
  long unaff_x26;
  long unaff_x27;
  undefined1 *unaff_x28;
  long lVar8;
  undefined8 uVar9;
  undefined1 auVar10 [16];
  uint *in_stack_00000040;
  undefined1 *in_stack_00000048;
  
  while( true ) {
    pauVar1 = (undefined1 (*) [16])(unaff_x19 + unaff_x21);
    puVar6 = (undefined8 *)(*(long *)(&UNK_00003f90 + unaff_x27) + (long)in_w8 * (long)unaff_w25);
    auVar10 = *pauVar1;
    uVar9 = *(undefined8 *)(*pauVar1 + 0xc);
    *(undefined8 *)((long)puVar6 + 0x14) = *(undefined8 *)(pauVar1[1] + 4);
    *(undefined8 *)((long)puVar6 + 0xc) = uVar9;
    puVar6[1] = auVar10._8_8_;
    *puVar6 = auVar10._0_8_;
    in_w8 = *(int *)(&UNK_00003f88 + unaff_x27) + 1;
    *(int *)(&UNK_00003f88 + unaff_x27) = in_w8;
    unaff_x21 = unaff_x21 + 0x1c;
    unaff_x26 = unaff_x26 + -1;
    if (unaff_x26 == 0) break;
    unaff_x19 = *(long *)(unaff_x27 + 0x3f80);
    if (in_w8 == *(int *)(&UNK_00003f8c + unaff_x27)) {
      func_0x000ebbac();
      in_w8 = *unaff_x20;
    }
  }
  uVar3 = *(uint *)(&UNK_00003f78 + unaff_x27);
  if ((((byte)unaff_x28[0x2858] >> 6 & 1) != 0) && (0 < (int)uVar3)) {
    lVar8 = 0;
    lVar7 = 0;
    do {
      switch(*(undefined4 *)(*(long *)(unaff_x27 + 0x3f80) + lVar8)) {
      case 1:
        lVar2 = *(long *)(unaff_x27 + 0x3f80) + lVar8;
        if ((*(float *)(lVar2 + 0xc) == -3.4028235e+38) &&
           (*(float *)(lVar2 + 0x10) == -3.4028235e+38)) {
          if (((byte)(&UNK_0000603c)[lRam0000000000a334c0] >> 6 & 1) != 0) {
            pcVar5 = "[io] %s: MousePos (-FLT_MAX, -FLT_MAX)\n";
            goto code_r0x000c9304;
          }
        }
        else if (((byte)(&UNK_0000603c)[lRam0000000000a334c0] >> 6 & 1) != 0) {
          pcVar5 = "[io] %s: MousePos (%.1f, %.1f) (%s)\n";
          goto code_r0x000c9304;
        }
        break;
      case 2:
        if (((byte)(&UNK_0000603c)[lRam0000000000a334c0] >> 6 & 1) != 0) {
          pcVar5 = "[io] %s: MouseWheel (%.3f, %.3f) (%s)\n";
code_r0x000c9304:
          func_0x000bae48(pcVar5);
        }
        break;
      case 3:
        if (((byte)(&UNK_0000603c)[lRam0000000000a334c0] >> 6 & 1) != 0) {
          pcVar5 = "[io] %s: MouseButton %d %s (%s)\n";
          goto code_r0x000c9304;
        }
        break;
      case 4:
        if (((byte)(&UNK_0000603c)[lRam0000000000a334c0] >> 6 & 1) != 0) {
          pcVar5 = "[io] %s: Key \"%s\" %s\n";
          goto code_r0x000c9304;
        }
        break;
      case 5:
        if (((byte)(&UNK_0000603c)[lRam0000000000a334c0] >> 6 & 1) != 0) {
          pcVar5 = "[io] %s: Text: %c (U+%08X)\n";
          goto code_r0x000c9304;
        }
        break;
      case 6:
        if (((byte)(&UNK_0000603c)[lRam0000000000a334c0] >> 6 & 1) != 0) {
          pcVar5 = "[io] %s: AppFocused %d\n";
          goto code_r0x000c9304;
        }
      }
      lVar7 = lVar7 + 1;
      uVar3 = *in_stack_00000040;
      lVar8 = lVar8 + 0x1c;
      unaff_x28 = in_stack_00000048;
    } while (lVar7 < (int)uVar3);
  }
  if (unaff_w22 == uVar3) {
    if (*(int *)(&UNK_00003f7c + unaff_x27) < 0) {
      func_0x000ebbac(in_stack_00000040,0);
      *(undefined4 *)(&UNK_00003f78 + unaff_x27) = 0;
      cVar4 = unaff_x28[0xec];
    }
    else {
      *(undefined4 *)(&UNK_00003f78 + unaff_x27) = 0;
      cVar4 = unaff_x28[0xec];
    }
  }
  else {
    _memmove(*(long *)(unaff_x27 + 0x3f80),*(long *)(unaff_x27 + 0x3f80) + (ulong)unaff_w22 * 0x1c,
             ((long)(int)uVar3 - (ulong)unaff_w22) * 0x1c);
    *(uint *)(&UNK_00003f78 + unaff_x27) = *(int *)(&UNK_00003f78 + unaff_x27) - unaff_w22;
    cVar4 = unaff_x28[0xec];
  }
  if (cVar4 != '\0') {
    _bzero(unaff_x27 + 0xb58,0x29a);
    lVar7 = 0x298;
    uVar9 = NEON_fmov(0xbf800000,4);
    puVar6 = (undefined8 *)(unaff_x27 + 0xe98);
    do {
      *(undefined1 *)((long)puVar6 + -0x34) = 0;
      *(undefined1 *)((long)puVar6 + -0x24) = 0;
      *(undefined1 *)((long)puVar6 + -0x14) = 0;
      *(undefined1 *)((long)puVar6 + -4) = 0;
      puVar6[-6] = uVar9;
      puVar6[-4] = uVar9;
      puVar6[-2] = uVar9;
      *puVar6 = uVar9;
      lVar7 = lVar7 + -4;
      puVar6 = puVar6 + 8;
    } while (lVar7 != 0);
    *unaff_x28 = 0;
    *(undefined8 *)(&UNK_000037e8 + unaff_x27) = uVar9;
    unaff_x28[0x10] = 0;
    *(undefined8 *)(&UNK_000037f8 + unaff_x27) = uVar9;
    *(undefined8 *)(unaff_x27 + 0xe5c) = 0;
    *(undefined8 *)(unaff_x27 + 0xe40) = 0xff7fffffff7fffff;
    *(undefined4 *)(unaff_x27 + 0xe48) = 0;
    *(undefined1 *)(unaff_x27 + 0xe4c) = 0;
    _memset_pattern16(&UNK_00003890 + unaff_x27,&UNK_0080c390,0x14);
    auVar10 = NEON_fmov(0xbf800000,4);
    *(long *)(unaff_x28 + 200) = auVar10._8_8_;
    *(long *)(unaff_x28 + 0xc0) = auVar10._0_8_;
    *(undefined4 *)(&UNK_000038b4 + unaff_x27) = 0xbf800000;
    *(undefined8 *)(unaff_x27 + 0xe50) = 0;
    if (*(int *)(&UNK_000038dc + unaff_x27) < 0) {
      func_0x000c202c(&UNK_000038d8 + unaff_x27,0);
    }
    *(undefined4 *)(&UNK_000038d8 + unaff_x27) = 0;
  }
  return;
}

