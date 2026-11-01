
undefined8 FUN_006ecb5c(long param_1)

{
  char cVar1;
  long lVar2;
  long lVar3;
  long *plVar4;
  int in_w9;
  int iVar5;
  uint in_w10;
  long unaff_x19;
  long *unaff_x20;
  uint unaff_w21;
  char *unaff_x22;
  long lVar6;
  long lVar7;
  long *plStack0000000000000000;
  long *plStack0000000000000008;
  
  if (unaff_w21 < in_w9 * (in_w10 & 0xffff | 0xcccc0000)) {
    param_1 = param_1 + (ulong)unaff_w21 * -0x28;
    lVar7 = **(long **)(param_1 + 8);
    if (lVar7 != 0) {
      cVar1 = *unaff_x22;
      if (cVar1 != '\0') {
        lVar6 = 0;
        plStack0000000000000000 = (long *)(lVar7 + 0x28);
        plStack0000000000000008 = unaff_x20 + 7;
        do {
          unaff_x22 = unaff_x22 + 1;
          switch(cVar1) {
          case 'a':
            if (*(char *)(lVar7 + 3) == '\0') {
              *(undefined1 *)((long)unaff_x20 + 0x2a) = *(undefined1 *)(*(long *)(lVar7 + 0x18) + 5)
              ;
              *(undefined1 *)((long)unaff_x20 + 0x29) = *(undefined1 *)(*(long *)(lVar7 + 0x18) + 4)
              ;
            }
            else {
              *(undefined2 *)((long)unaff_x20 + 0x29) = 0x100;
            }
            break;
          case 'f':
            lVar6 = lVar7;
            break;
          case 'l':
            if (param_1 == 0) {
              if (*(char *)(lVar7 + 3) != '\0') goto code_r0x006eccf0;
              *(undefined4 *)((long)unaff_x20 + 0x24) =
                   *(undefined4 *)(*(long *)(lVar7 + 0x18) + 0xa4);
            }
            else if ((*(int *)((long)*(long **)(param_1 + 8) + 0xc) == 7) &&
                    (lVar2 = **(long **)(param_1 + 8), *(char *)(lVar2 + 3) == '\0')) {
              lVar3 = *(long *)(param_1 + 0x18);
              lVar2 = *(long *)(lVar2 + 0x18);
              iVar5 = 0;
              if (lVar3 != 0) {
                iVar5 = 0;
                if (*(long *)(lVar2 + 0x10) != lVar3) {
                  iVar5 = (int)((ulong)(lVar3 - *(long *)(lVar2 + 0x10)) >> 2) + -1;
                }
              }
              lVar3 = *(long *)(lVar2 + 0x38) - (lVar2 + 0x38);
              if (lVar3 == 0) {
                *(undefined4 *)((long)unaff_x20 + 0x24) = 0;
              }
              else {
                *(uint *)((long)unaff_x20 + 0x24) =
                     *(int *)((*(ulong *)(lVar2 + 0x40U) ^ lVar2 + 0x40U) +
                             (long)(iVar5 >> (*(uint *)(lVar2 + 0xa0) & 0x1f)) * 4) +
                     (uint)*(byte *)(lVar3 + iVar5);
              }
            }
            else {
code_r0x006eccf0:
              *(undefined4 *)((long)unaff_x20 + 0x24) = 0xffffffff;
            }
            break;
          case 'n':
            if (param_1 == 0) {
              if (*(char *)(lVar7 + 3) == '\0') {
                plVar4 = (long *)(*(long *)(lVar7 + 0x18) + 0x60);
                lVar2 = *plVar4 + (long)plVar4;
                goto joined_r0x006ecd98;
              }
              lVar2 = (long)plStack0000000000000000 - *plStack0000000000000000;
              if (lVar2 != 0) goto code_r0x006ecd74;
code_r0x006ecd9c:
              *unaff_x20 = 0;
            }
            else {
              lVar2 = **(long **)(param_1 + 8);
              if (*(char *)(lVar2 + 3) == '\0') {
                plVar4 = (long *)(*(long *)(lVar2 + 0x18) + 0x60);
                lVar2 = *plVar4 + (long)plVar4;
joined_r0x006ecd98:
                if (lVar2 == 0) goto code_r0x006ecd9c;
                lVar2 = lVar2 + 0x18;
              }
              else {
                lVar2 = (lVar2 + 0x28) - *(long *)(lVar2 + 0x28);
                if (lVar2 == 0) goto code_r0x006ecd9c;
              }
code_r0x006ecd74:
              *unaff_x20 = lVar2;
            }
            break;
          case 's':
            if (*(char *)(lVar7 + 3) == '\0') {
              plVar4 = (long *)(*(long *)(lVar7 + 0x18) + 0x58);
              lVar3 = *plVar4 - (long)plVar4;
              lVar2 = lVar3 + 0x18;
              unaff_x20[1] = (long)"Lua";
              unaff_x20[2] = lVar2;
              *(undefined4 *)(unaff_x20 + 4) = *(undefined4 *)(*(long *)(lVar7 + 0x18) + 0xa4);
              lVar2 = func_0x006f4f8c(plStack0000000000000008,0x100,lVar2,
                                      *(undefined4 *)(lVar3 + 0x14));
              unaff_x20[3] = lVar2;
            }
            else {
              unaff_x20[1] = (long)"C";
              unaff_x20[2] = (long)"=[C]";
              *(undefined4 *)(unaff_x20 + 4) = 0xffffffff;
              unaff_x20[3] = (long)"[C]";
            }
            break;
          case 'u':
            *(undefined1 *)(unaff_x20 + 5) = *(undefined1 *)(lVar7 + 4);
          }
          cVar1 = *unaff_x22;
        } while (cVar1 != '\0');
        if (lVar6 != 0) {
          if ((*(byte *)(unaff_x19 + 1) >> 2 & 1) != 0) {
            func_0x006f0ed4();
          }
          plVar4 = *(long **)(unaff_x19 + 8);
          *plVar4 = lVar6;
          *(undefined4 *)((long)plVar4 + 0xc) = 7;
          lVar7 = *(long *)(unaff_x19 + 8);
          if (*(long *)(unaff_x19 + 0x28) - lVar7 < 0x11) {
            func_0x006ee1d4();
            lVar7 = *(long *)(unaff_x19 + 8);
          }
          *(long *)(unaff_x19 + 8) = lVar7 + 0x10;
        }
      }
      return 1;
    }
  }
  return 0;
}

