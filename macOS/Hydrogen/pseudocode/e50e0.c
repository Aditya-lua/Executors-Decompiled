
/* WARNING: Possible PIC construction at 0x000e52d0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x000e52ec: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x000e52d4) */
/* WARNING: Removing unreachable block (ram,0x000e4d88) */
/* WARNING: Removing unreachable block (ram,0x000e52ec) */
/* WARNING: Removing unreachable block (ram,0x000e4da4) */
/* WARNING: Removing unreachable block (ram,0x000e4d68) */
/* WARNING: Removing unreachable block (ram,0x000e4dac) */
/* WARNING: Removing unreachable block (ram,0x000e4e64) */
/* WARNING: Removing unreachable block (ram,0x000e4e8c) */
/* WARNING: Removing unreachable block (ram,0x000e4e94) */
/* WARNING: Removing unreachable block (ram,0x000e4e98) */
/* WARNING: Removing unreachable block (ram,0x000e4e6c) */
/* WARNING: Removing unreachable block (ram,0x000e4e70) */
/* WARNING: Removing unreachable block (ram,0x000e4eb0) */
/* WARNING: Removing unreachable block (ram,0x000e4eb4) */
/* WARNING: Removing unreachable block (ram,0x000e4eb8) */
/* WARNING: Removing unreachable block (ram,0x000e4ecc) */
/* WARNING: Removing unreachable block (ram,0x000e4ec4) */
/* WARNING: Removing unreachable block (ram,0x000e4ed0) */
/* WARNING: Removing unreachable block (ram,0x000e4ef0) */
/* WARNING: Removing unreachable block (ram,0x000e4f4c) */
/* WARNING: Removing unreachable block (ram,0x000e4ef8) */
/* WARNING: Removing unreachable block (ram,0x000e4f54) */
/* WARNING: Removing unreachable block (ram,0x000e4f04) */
/* WARNING: Removing unreachable block (ram,0x000e4f6c) */
/* WARNING: Removing unreachable block (ram,0x000e4fc0) */
/* WARNING: Removing unreachable block (ram,0x000e4fd4) */
/* WARNING: Removing unreachable block (ram,0x000e52f0) */
/* WARNING: Removing unreachable block (ram,0x000e532c) */
/* WARNING: Removing unreachable block (ram,0x000e5354) */
/* WARNING: Removing unreachable block (ram,0x000e535c) */
/* WARNING: Removing unreachable block (ram,0x000e5364) */
/* WARNING: Removing unreachable block (ram,0x000e5490) */
/* WARNING: Removing unreachable block (ram,0x000e53ac) */
/* WARNING: Removing unreachable block (ram,0x000e5410) */
/* WARNING: Removing unreachable block (ram,0x000e5420) */
/* WARNING: Removing unreachable block (ram,0x000e5430) */
/* WARNING: Removing unreachable block (ram,0x000e5454) */
/* WARNING: Removing unreachable block (ram,0x000e5464) */
/* WARNING: Removing unreachable block (ram,0x000e547c) */
/* WARNING: Removing unreachable block (ram,0x000e5308) */

void FUN_000e50e0(ulong param_1)

{
  int *piVar1;
  uint uVar2;
  int iVar3;
  int iVar4;
  uint uVar5;
  ulong uVar6;
  float *in_x9;
  float *pfVar7;
  long lVar8;
  long in_x10;
  long lVar9;
  long lVar10;
  long unaff_x19;
  long unaff_x20;
  int unaff_w22;
  int unaff_w23;
  long unaff_x24;
  long unaff_x25;
  long unaff_x27;
  undefined1 *unaff_x28;
  ulong uStack0000000000000008;
  double dStack0000000000000010;
  double dStack0000000000000018;
  double dStack0000000000000020;
  double dStack0000000000000028;
  ulong uStack0000000000000030;
  long in_stack_00000050;
  undefined8 uStack0000000000000058;
  undefined1 uStack0000000000000060;
  int iStack0000000000000068;
  int iStack000000000000006c;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined8 in_stack_00000098;
  undefined1 uStack00000000000000a0;
  
  do {
    dStack0000000000000010 = (double)*in_x9;
    dStack0000000000000018 = (double)in_x9[1];
    dStack0000000000000020 = (double)in_x9[2];
    dStack0000000000000028 = (double)in_x9[3];
    uStack0000000000000030 = (ulong)(uint)in_x9[4];
    uStack0000000000000008 = param_1;
    iVar3 = func_0x000b875c(unaff_x28,300 - in_x10);
    uStack0000000000000008 = unaff_x19 + 2;
    if (unaff_x25 == 0) {
      uVar6 = uStack0000000000000008;
    }
    else {
      uVar6 = (ulong)*(ushort *)(unaff_x25 + uStack0000000000000008 * 2);
    }
    pfVar7 = (float *)(unaff_x24 + (long)(int)uVar6 * (long)unaff_w22);
    in_stack_00000098 = *(undefined8 *)pfVar7;
    dStack0000000000000010 = (double)*pfVar7;
    dStack0000000000000018 = (double)pfVar7[1];
    dStack0000000000000020 = (double)pfVar7[2];
    dStack0000000000000028 = (double)pfVar7[3];
    uStack0000000000000030 = (ulong)(uint)pfVar7[4];
    func_0x000b875c(unaff_x28 + iVar3,unaff_x27 - (long)(unaff_x28 + iVar3));
    uStack0000000000000058 = 0;
    func_0x0010f27c(&uStack00000000000000a0,0,0,&uStack0000000000000058);
    if (unaff_x20 != 0) {
      lVar8 = *(long *)(lRam0000000000a334c0 + 0x4000);
      if (((&UNK_00004b7b)[lRam0000000000a334c0] == '\0') ||
         ((&UNK_00004b7a)[lRam0000000000a334c0] != '\0')) {
        if (((*(uint *)(&UNK_000049b0 + lRam0000000000a334c0) & 1) != 0) &&
           (((*(uint *)(&UNK_000049b0 + lRam0000000000a334c0) >> 7 & 1) != 0 ||
            (*(long *)(&UNK_00004008 + lRam0000000000a334c0) == lVar8)))) {
          iVar3 = *(int *)(&UNK_000049a8 + lRam0000000000a334c0);
          iVar4 = *(int *)(&UNK_00004064 + lRam0000000000a334c0);
          if ((iVar4 == 0) ||
             (((iVar4 == iVar3 || ((&UNK_00004071)[lRam0000000000a334c0] != '\0')) ||
              (iVar4 == *(int *)(lVar8 + 0x84))))) {
            if ((((*(long *)(&UNK_00004b18 + lRam0000000000a334c0) != 0) &&
                 (lVar9 = *(long *)(*(long *)(&UNK_00004b18 + lRam0000000000a334c0) + 0x388),
                 lVar9 != 0)) &&
                ((*(char *)(lVar9 + 0xbf) != '\0' &&
                 ((lVar10 = *(long *)(lVar8 + 0x388), lVar9 != lVar10 &&
                  ((*(byte *)(lVar9 + 0x17) & 0xc) != 0)))))) &&
               (*(long *)(lVar10 + 0x388) != lVar9)) {
              do {
                if (lVar10 == lVar9) goto LAB_000e5258;
                lVar10 = *(long *)(lVar10 + 0x380);
              } while (lVar10 != 0);
              if (((&UNK_000049ad)[lRam0000000000a334c0] & 1) == 0) goto LAB_000e5038;
            }
LAB_000e5258:
            if ((((*(uint *)(&UNK_000049ac + lRam0000000000a334c0) >> 2 & 1) == 0) &&
                ((iVar3 != *(int *)(lVar8 + 0x84) || (*(char *)(lVar8 + 0xc0) == '\0')))) &&
               (((*(uint *)(&UNK_000049ac + lRam0000000000a334c0) >> 9 & 1) == 0 ||
                ((iVar3 == 0 || (*(int *)(&UNK_00004054 + lRam0000000000a334c0) == iVar3))))))
            goto LAB_000e52a0;
          }
        }
      }
      else if ((((byte)(&UNK_000049ac)[lRam0000000000a334c0] >> 2 & 1) == 0) &&
              ((*(int *)(&UNK_00004b20 + lRam0000000000a334c0) != 0 &&
               (*(int *)(&UNK_00004b20 + lRam0000000000a334c0) ==
                *(int *)(&UNK_000049a8 + lRam0000000000a334c0))))) {
LAB_000e52a0:
        uVar5 = *(uint *)(unaff_x20 + 0x30);
        *(uint *)(unaff_x20 + 0x30) = uVar5 & 0xfffffffe;
        func_0x000f0ff4(0x3f800000);
        *(uint *)(unaff_x20 + 0x30) = uVar5;
      }
    }
LAB_000e5038:
    uVar5 = (int)unaff_x19 + 3;
    unaff_w23 = unaff_w23 + 1;
    if (iStack000000000000006c <= unaff_w23) {
      do {
        iVar3 = func_0x000bb10c(&uStack0000000000000060);
        lVar8 = lRam0000000000a334c0;
        if (iVar3 == 0) {
          lVar9 = *(long *)(lRam0000000000a334c0 + 0x4000);
          func_0x000d8674(0);
          uVar5 = *(int *)(lVar9 + 0x198) - 1;
          *(uint *)(lVar9 + 0x198) = uVar5;
          uVar2 = 1 << (ulong)(uVar5 & 0x1f);
          uVar5 = *(uint *)(lVar9 + 0x19c);
          if ((uVar5 & uVar2) != 0) {
            piVar1 = (int *)(&UNK_00004af0 + lVar8);
            if ((((&UNK_00004b78)[lVar8] != '\0') && (*(int *)(&UNK_00004bd0 + lVar8) == 0)) &&
               (*(long *)(&UNK_00004b18 + lVar8) == lVar9)) {
              lVar10 = *(long *)(&UNK_00004af8 + lVar8);
              iVar3 = *piVar1;
              iVar4 = func_0x000daf30();
              if (iVar4 != 0) {
                func_0x000daf68(&UNK_00004c08 + lVar8,lVar10 + (long)iVar3 * 0x18 + -0x18);
              }
            }
            *piVar1 = *piVar1 + -1;
            uVar5 = *(uint *)(lVar9 + 0x19c);
          }
          *(uint *)(lVar9 + 0x19c) = uVar5 & uVar2 - 1;
          *(int *)(*(long *)(lRam0000000000a334c0 + 0x4000) + 0x100) =
               *(int *)(*(long *)(lRam0000000000a334c0 + 0x4000) + 0x100) + -1;
          return;
        }
      } while (iStack000000000000006c <= iStack0000000000000068);
      uVar5 = *(int *)(in_stack_00000050 + 0x1c) + iStack0000000000000068 * 3;
      unaff_w23 = iStack0000000000000068;
    }
    in_stack_00000090 = 0;
    in_stack_00000098 = 0;
    unaff_x19 = (long)(int)uVar5;
    if (unaff_x25 != 0) {
      uVar5 = (uint)*(ushort *)(unaff_x25 + unaff_x19 * 2);
    }
    pfVar7 = (float *)(unaff_x24 + (long)(int)uVar5 * (long)unaff_w22);
    in_stack_00000088 = *(undefined8 *)pfVar7;
    dStack0000000000000010 = (double)*pfVar7;
    dStack0000000000000018 = (double)pfVar7[1];
    dStack0000000000000020 = (double)pfVar7[2];
    dStack0000000000000028 = (double)pfVar7[3];
    uStack0000000000000030 = (ulong)(uint)pfVar7[4];
    uStack0000000000000008 = unaff_x19;
    iVar3 = func_0x000b875c(&uStack00000000000000a0,300);
    param_1 = unaff_x19 + 1;
    if (unaff_x25 == 0) {
      uVar6 = param_1;
    }
    else {
      uVar6 = (ulong)*(ushort *)(unaff_x25 + param_1 * 2);
    }
    in_x10 = (long)iVar3;
    unaff_x28 = &uStack00000000000000a0 + in_x10;
    in_x9 = (float *)(unaff_x24 + (long)(int)uVar6 * (long)unaff_w22);
    in_stack_00000090 = *(undefined8 *)in_x9;
  } while( true );
}

