
void FUN_004346e4(void)

{
  byte bVar1;
  long lVar2;
  bool bVar3;
  ulong uVar4;
  char *pcVar5;
  char *pcVar6;
  char *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long lVar7;
  long unaff_x23;
  char *unaff_x26;
  undefined1 unaff_w27;
  char *unaff_x28;
  long unaff_x29;
  long *in_stack_00000000;
  undefined8 uStack0000000000000048;
  long in_stack_00000050;
  long in_stack_00000058;
  undefined1 uStack0000000000000060;
  
  do {
    uVar4 = *(ulong *)(unaff_x29 + -0x60);
    pcVar6 = *(char **)(unaff_x29 + -0x68);
    lVar7 = unaff_x22;
    lVar2 = in_stack_00000058;
joined_r0x004346ec:
    do {
      in_stack_00000058 = lVar7;
      bVar3 = false;
      if (in_stack_00000058 != 0) {
        bVar3 = false;
        pcVar5 = (char *)(unaff_x23 + in_stack_00000058 + -1);
        if (pcVar5 != (char *)0x0) {
          bVar3 = *pcVar5 != '/';
        }
      }
      if ((uVar4 == 0) || (*pcVar6 != '/')) {
        lVar7 = in_stack_00000058;
        if (bVar3) {
          if (uStack0000000000000048 == in_stack_00000058) {
            in_stack_00000058 = lVar2;
            func_0x007a0000(&uStack0000000000000048,lVar7,1,1,1);
            unaff_x23 = in_stack_00000050;
          }
          *(undefined1 *)(unaff_x23 + in_stack_00000058) = unaff_w27;
          lVar7 = in_stack_00000058 + 1;
          goto LAB_0043474c;
        }
      }
      else {
        lVar7 = 0;
LAB_0043474c:
        lVar2 = lVar7;
      }
      in_stack_00000058 = lVar2;
      if ((ulong)(uStack0000000000000048 - lVar7) < uVar4) {
        func_0x007a0000(&uStack0000000000000048,lVar7,uVar4,1,1);
        lVar7 = in_stack_00000058;
        unaff_x23 = in_stack_00000050;
      }
      _memcpy(unaff_x23 + lVar7,pcVar6,uVar4);
      unaff_x22 = lVar7 + uVar4;
      in_stack_00000058 = unaff_x22;
      func_0x004245b4(unaff_x29 + -0x90,&uStack0000000000000060);
      bVar1 = *(byte *)(unaff_x29 + -0x90);
      if (bVar1 == 10) {
        if ((unaff_x20 != 0) && (*(char *)(unaff_x21 + unaff_x20 + -1) == '/')) {
          if ((unaff_x22 != 0) &&
             ((pcVar6 = (char *)(in_stack_00000050 + unaff_x22 + -1), pcVar6 != (char *)0x0 &&
              (*pcVar6 != '/')))) {
            if (uStack0000000000000048 == unaff_x22) {
              func_0x007a0000(&uStack0000000000000048,unaff_x22,1,1,1);
              unaff_x22 = in_stack_00000058;
            }
            *(undefined1 *)(in_stack_00000050 + unaff_x22) = 0x2f;
            unaff_x22 = unaff_x22 + 1;
          }
          in_stack_00000058 = unaff_x22;
        }
        in_stack_00000000[1] = in_stack_00000050;
        *in_stack_00000000 = uStack0000000000000048;
        in_stack_00000000[2] = in_stack_00000058;
        return;
      }
      uVar4 = (ulong)bVar1 - 5;
      if (3 < bVar1 - 6) {
        uVar4 = 0;
      }
      lVar2 = in_stack_00000058;
      if (1 < (long)uVar4) {
        if (uVar4 == 2) {
          uVar4 = 1;
          pcVar6 = unaff_x28;
          lVar7 = unaff_x22;
        }
        else if (uVar4 == 3) {
          uVar4 = 2;
          pcVar6 = unaff_x19;
          lVar7 = unaff_x22;
        }
        else {
          uVar4 = *(ulong *)(unaff_x29 + -0x80);
          pcVar6 = *(char **)(unaff_x29 + -0x88);
          lVar7 = unaff_x22;
        }
        goto joined_r0x004346ec;
      }
      pcVar6 = unaff_x26;
      lVar7 = unaff_x22;
    } while (uVar4 != 0);
  } while( true );
}

