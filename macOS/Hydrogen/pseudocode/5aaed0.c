
undefined8 FUN_005aaed0(void)

{
  int iVar1;
  ulong uVar2;
  undefined8 uVar3;
  long in_x9;
  char *unaff_x19;
  long *unaff_x20;
  uint *puVar4;
  long unaff_x21;
  undefined8 *unaff_x23;
  long lVar5;
  char in_wzr;
  undefined8 uStack0000000000000008;
  dword dStack0000000000000010;
  undefined *in_stack_00000018;
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000028;
  dword *in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  
  if (in_x9 == 0) {
    uVar3 = (**(code **)(unaff_x23[1] + 0x18))(*unaff_x23,&UNK_008aec74,1);
    goto code_r0x005aaeec;
  }
  uVar2 = (**(code **)(unaff_x23[1] + 0x18))(*unaff_x23,&UNK_008aec7a,1);
  if ((uVar2 & 1) == 0) {
    unaff_x20[1] = unaff_x20[1] + 1;
    lVar5 = *(long *)(unaff_x21 + 0x10);
    if (lVar5 == 0) {
code_r0x005aada8:
      uVar2 = func_0x005a9a80();
      if ((uVar2 & 1) == 0) {
        unaff_x20[1] = unaff_x20[1] + -1;
        uVar2 = (**(code **)(((undefined8 *)*unaff_x20)[1] + 0x18))
                          (*(undefined8 *)*unaff_x20,&UNK_008aec7a,1);
        if ((uVar2 & 1) == 0) {
          uVar3 = func_0x005a9610((char)unaff_x20[2],*(undefined1 *)((long)unaff_x20 + 0x11));
          goto code_r0x005aaeec;
        }
      }
    }
    else {
      uVar2 = func_0x005a9610((char)unaff_x20[2],*(undefined1 *)((long)unaff_x20 + 0x11));
      if (((uVar2 & 1) == 0) &&
         (uVar2 = (**(code **)(unaff_x23[1] + 0x18))(*unaff_x23,&UNK_008aecad,0xd), (uVar2 & 1) == 0
         )) {
        puVar4 = *(uint **)(unaff_x21 + 8);
        uStack0000000000000008 = puVar4 + 2;
        if ((*puVar4 & 1) == 0) {
          _dStack0000000000000010 = &uStack0000000000000008;
          in_stack_00000018 = &DAT_005c91c4;
          uStack0000000000000020 = &UNK_009f1e10;
          in_stack_00000028 = 1;
          in_stack_00000038 = 1;
          in_stack_00000040 = 0;
          in_stack_00000030 = &dStack0000000000000010;
          uVar2 = func_0x0046849c(*unaff_x23,unaff_x23[1],&uStack0000000000000020);
        }
        else {
          _dStack0000000000000010 = &uStack0000000000000008;
          in_stack_00000018 = &DAT_005c91c4;
          uStack0000000000000020 = &UNK_009f1e20;
          in_stack_00000028 = 1;
          in_stack_00000038 = 1;
          in_stack_00000040 = 0;
          in_stack_00000030 = &dStack0000000000000010;
          uVar2 = func_0x0046849c(*unaff_x23,unaff_x23[1],&uStack0000000000000020);
        }
        if ((uVar2 & 1) == 0) {
          if (lVar5 == 1) {
code_r0x005aad7c:
            uStack0000000000000020 = &UNK_009f1d90;
            in_stack_00000028 = 1;
            in_stack_00000038 = 0;
            in_stack_00000040 = 0;
            in_stack_00000030 = &MACH_HEADER.cpusubtype;
            uVar2 = func_0x001ee828(*unaff_x23,unaff_x23[1],&uStack0000000000000020);
            if ((uVar2 & 1) == 0) goto code_r0x005aada8;
          }
          else {
            uVar2 = (**(code **)(unaff_x23[1] + 0x18))(*unaff_x23,&UNK_008aec76,2);
            if ((uVar2 & 1) == 0) {
              puVar4 = puVar4 + 6;
              lVar5 = lVar5 * 0x10 + -0x20;
              do {
                uStack0000000000000008 = puVar4;
                _dStack0000000000000010 = &uStack0000000000000008;
                in_stack_00000030 = &dStack0000000000000010;
                if ((puVar4[-2] & 1) == 0) {
                  in_stack_00000018 = &DAT_005c91c4;
                  uStack0000000000000020 = &UNK_009f1e10;
                  in_stack_00000028 = 1;
                  in_stack_00000038 = 1;
                  in_stack_00000040 = 0;
                  iVar1 = func_0x0046849c(*unaff_x23,unaff_x23[1],&uStack0000000000000020);
                }
                else {
                  in_stack_00000018 = &DAT_005c91c4;
                  uStack0000000000000020 = &UNK_009f1e20;
                  in_stack_00000028 = 1;
                  in_stack_00000038 = 1;
                  in_stack_00000040 = 0;
                  iVar1 = func_0x0046849c(*unaff_x23,unaff_x23[1],&uStack0000000000000020);
                }
                if (iVar1 != 0) break;
                if (lVar5 == 0) goto code_r0x005aad7c;
                uVar2 = (**(code **)(unaff_x23[1] + 0x18))(*unaff_x23,&UNK_008aec76,2);
                puVar4 = puVar4 + 4;
                lVar5 = lVar5 + -0x10;
              } while ((uVar2 & 1) == 0);
            }
          }
        }
      }
    }
  }
  uVar3 = 1;
code_r0x005aaeec:
  if (*unaff_x19 == '\x01') {
    *unaff_x19 = in_wzr;
  }
  else {
    func_0x007b05dc();
  }
  return uVar3;
}

