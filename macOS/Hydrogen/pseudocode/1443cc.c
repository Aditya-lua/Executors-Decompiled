
/* WARNING: Removing unreachable block (ram,0x001441dc) */
/* WARNING: Removing unreachable block (ram,0x00144210) */
/* WARNING: Removing unreachable block (ram,0x00144494) */

void FUN_001443cc(void)

{
  char in_NG;
  char in_OV;
  char cVar1;
  int iVar2;
  long lVar3;
  ulong uVar4;
  long lVar5;
  int *piVar6;
  char *in_x10;
  char *in_x12;
  long unaff_x19;
  long *plVar7;
  char *unaff_x20;
  long unaff_x21;
  long unaff_x23;
  long unaff_x24;
  long unaff_x25;
  long unaff_x26;
  ulong unaff_x27;
  long *unaff_x28;
  long unaff_x29;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  long in_stack_00000020;
  long in_stack_00000028;
  undefined8 uStack0000000000000030;
  undefined8 uStack0000000000000038;
  undefined8 uStack0000000000000040;
  undefined8 uStack0000000000000048;
  long in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 uStack0000000000000060;
  long *in_stack_00000068;
  long in_stack_000000d8;
  ulong in_stack_000000e0;
  
code_r0x001443cc:
  if (in_NG == in_OV) {
    in_x10 = in_x12;
  }
  for (; in_x10 != unaff_x20; in_x10 = in_x10 + 1) {
    cVar1 = ___toupper((long)*in_x10);
    *in_x10 = cVar1;
  }
LAB_00144378:
  if ((*(byte *)(*unaff_x28 + (unaff_x24 - unaff_x21) * 0xc + 8) >> 2 & 1) == 0) {
    lVar3 = func_0x0014ad38(in_stack_00000010,&uStack0000000000000048);
    if (lVar3 != 0) {
      uStack0000000000000030._4_4_ = 1;
      goto code_r0x00144420;
    }
    lVar3 = func_0x0014af64(in_stack_00000000,&uStack0000000000000048);
    if (lVar3 != 0) {
      uStack0000000000000030._4_4_ = 8;
      goto code_r0x00144420;
    }
  }
  lVar3 = func_0x0014af64(in_stack_00000018,&uStack0000000000000048);
  if (lVar3 != 0) {
    uStack0000000000000030._4_4_ = 9;
  }
code_r0x00144420:
  if (unaff_x26 != unaff_x25) {
    if (unaff_x27 < 2) {
      unaff_x27 = 1;
    }
    piVar6 = (int *)(*unaff_x28 + in_stack_00000028 + uStack0000000000000040 * 0xc + 4);
    do {
      *piVar6 = uStack0000000000000030._4_4_;
      unaff_x27 = unaff_x27 - 1;
      piVar6 = piVar6 + 3;
    } while (unaff_x27 != 0);
  }
  unaff_x24 = uStack0000000000000038;
  if (uStack0000000000000038 != unaff_x23) goto code_r0x001442bc;
  do {
    do {
      in_stack_00000020 = in_stack_00000020 + 1;
      if (in_stack_00000008._4_4_ == (int)in_stack_00000020) {
        if ((char)in_stack_00000058._7_1_ < '\0') {
          __ZdlPv(uStack0000000000000048);
        }
        if (uStack0000000000000060 != (long *)0x0) {
          in_stack_00000068 = uStack0000000000000060;
          __ZdlPv();
        }
        return;
      }
      unaff_x28 = (long *)(*(long *)(unaff_x19 + 8) + in_stack_00000020 * 0x18);
      plVar7 = unaff_x28 + 1;
    } while (*unaff_x28 == *plVar7);
    uVar4 = (*plVar7 - *unaff_x28 >> 2) * -0x5555555555555555;
    if (*(byte *)(unaff_x29 + -0x61) < uVar4) {
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEmc
                (unaff_x29 + -0x78,uVar4 - *(byte *)(unaff_x29 + -0x61),0);
      lVar3 = *unaff_x28;
      if (*plVar7 != lVar3) goto code_r0x00144230;
    }
    else {
      *(byte *)(unaff_x29 + -0x61) = (byte)uVar4 & 0x7f;
      *(undefined1 *)(unaff_x29 + -0x78 + uVar4) = 0;
      lVar3 = *unaff_x28;
      if (*plVar7 != lVar3) {
code_r0x00144230:
        lVar5 = 0;
        uVar4 = 0;
        do {
          *(undefined1 *)(unaff_x29 + -0x78 + uVar4) = *(undefined1 *)(lVar3 + lVar5);
          *(undefined4 *)((undefined1 *)(lVar3 + lVar5) + 4) = 0;
          uVar4 = uVar4 + 1;
          lVar3 = *unaff_x28;
          lVar5 = lVar5 + 0xc;
        } while (uVar4 < (ulong)((*plVar7 - lVar3 >> 2) * -0x5555555555555555));
      }
    }
    uVar4 = in_stack_000000e0;
    unaff_x21 = in_stack_000000d8;
    if (-1 < (char)*(byte *)(unaff_x29 + -0x61)) {
      uVar4 = (ulong)*(byte *)(unaff_x29 + -0x61);
      unaff_x21 = unaff_x29 + -0x78;
    }
    if (uVar4 != 0) {
      unaff_x23 = unaff_x21 + uVar4;
      in_stack_00000028 = unaff_x21 * -0xc;
      unaff_x24 = unaff_x21;
code_r0x001442bc:
      do {
        uStack0000000000000038 = 0;
        uStack0000000000000040 = 0;
        uStack0000000000000030._4_4_ = 0;
        if ((*(code **)(unaff_x19 + 0x208) != (code *)0x0) &&
           (uVar4 = (**(code **)(unaff_x19 + 0x208))
                              (unaff_x24,unaff_x23,&uStack0000000000000040,&uStack0000000000000038,
                               (long)&uStack0000000000000030 + 4), (uVar4 & 1) != 0)) {
          unaff_x27 = uStack0000000000000038 - uStack0000000000000040;
          unaff_x26 = uStack0000000000000038;
          unaff_x25 = uStack0000000000000040;
joined_r0x001442f8:
          uStack0000000000000038 = unaff_x26;
          uStack0000000000000040 = unaff_x25;
          if (uStack0000000000000030._4_4_ != 7) goto code_r0x00144420;
          func_0x0006db60(&uStack0000000000000048,unaff_x25,unaff_x26,unaff_x27);
          if (*(char *)(unaff_x19 + 0x228) != '\0') goto LAB_00144378;
          in_x12 = (char *)&uStack0000000000000048;
          in_NG = (char)in_stack_00000058._7_1_ < '\0';
          in_OV = '\0';
          unaff_x20 = uStack0000000000000048 + in_stack_00000050;
          if (!(bool)in_NG) {
            unaff_x20 = in_x12 + in_stack_00000058._7_1_;
          }
          in_x10 = uStack0000000000000048;
          goto code_r0x001443cc;
        }
        lVar5 = *(long *)(unaff_x19 + 0x238);
        for (lVar3 = *(long *)(unaff_x19 + 0x230); lVar3 != lVar5; lVar3 = lVar3 + 0x48) {
          iVar2 = func_0x00034500(lVar3,unaff_x24,unaff_x23,&uStack0000000000000060,0x40);
          if (iVar2 != 0) {
            unaff_x25 = *uStack0000000000000060;
            unaff_x26 = uStack0000000000000060[1];
            uStack0000000000000030._4_4_ = *(int *)(lVar3 + 0x40);
            unaff_x27 = unaff_x26 - unaff_x25;
            goto joined_r0x001442f8;
          }
        }
        unaff_x24 = unaff_x24 + 1;
      } while (unaff_x24 != unaff_x23);
    }
  } while( true );
}

