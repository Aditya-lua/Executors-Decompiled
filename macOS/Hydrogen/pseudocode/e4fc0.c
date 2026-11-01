
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

void FUN_000e4fc0(void)

{
  undefined1 *puVar1;
  int *piVar2;
  int iVar3;
  int iVar4;
  uint uVar5;
  uint uVar6;
  ulong uVar7;
  long lVar8;
  long lVar9;
  long lVar10;
  long unaff_x20;
  int unaff_w22;
  ulong uVar11;
  long unaff_x24;
  long unaff_x25;
  long unaff_x27;
  long in_stack_00000050;
  undefined8 uStack0000000000000058;
  undefined8 uStack0000000000000060;
  int iStack0000000000000068;
  int iStack000000000000006c;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined8 in_stack_00000098;
  undefined1 uStack00000000000000a0;
  
  func_0x000e6400();
  in_stack_00000080 = 0;
  _iStack0000000000000068 = 0;
  uStack0000000000000060 = 0;
  in_stack_00000078 = 0;
  in_stack_00000070 = 0;
  func_0x000bab98(0xbf800000,&uStack0000000000000060,(ulong)*(uint *)(in_stack_00000050 + 0x20) / 3)
  ;
  do {
    do {
      iVar3 = func_0x000bb10c(&uStack0000000000000060);
      lVar10 = lRam0000000000a334c0;
      if (iVar3 == 0) {
        lVar8 = *(long *)(lRam0000000000a334c0 + 0x4000);
        func_0x000d8674(0);
        uVar5 = *(int *)(lVar8 + 0x198) - 1;
        *(uint *)(lVar8 + 0x198) = uVar5;
        uVar6 = 1 << (ulong)(uVar5 & 0x1f);
        uVar5 = *(uint *)(lVar8 + 0x19c);
        if ((uVar5 & uVar6) != 0) {
          piVar2 = (int *)(&UNK_00004af0 + lVar10);
          if ((((&UNK_00004b78)[lVar10] != '\0') && (*(int *)(&UNK_00004bd0 + lVar10) == 0)) &&
             (*(long *)(&UNK_00004b18 + lVar10) == lVar8)) {
            lVar9 = *(long *)(&UNK_00004af8 + lVar10);
            iVar3 = *piVar2;
            iVar4 = func_0x000daf30();
            if (iVar4 != 0) {
              func_0x000daf68(&UNK_00004c08 + lVar10,lVar9 + (long)iVar3 * 0x18 + -0x18);
            }
          }
          *piVar2 = *piVar2 + -1;
          uVar5 = *(uint *)(lVar8 + 0x19c);
        }
        *(uint *)(lVar8 + 0x19c) = uVar5 & uVar6 - 1;
        *(int *)(*(long *)(lRam0000000000a334c0 + 0x4000) + 0x100) =
             *(int *)(*(long *)(lRam0000000000a334c0 + 0x4000) + 0x100) + -1;
        return;
      }
      uVar11 = _iStack0000000000000068 & 0xffffffff;
    } while (iStack000000000000006c <= iStack0000000000000068);
    uVar5 = *(int *)(in_stack_00000050 + 0x1c) + iStack0000000000000068 * 3;
    do {
      in_stack_00000090 = 0;
      in_stack_00000098 = 0;
      lVar10 = (long)(int)uVar5;
      uVar6 = uVar5;
      if (unaff_x25 != 0) {
        uVar6 = (uint)*(ushort *)(unaff_x25 + lVar10 * 2);
      }
      in_stack_00000088 = *(undefined8 *)(unaff_x24 + (long)(int)uVar6 * (long)unaff_w22);
      iVar3 = func_0x000b875c(&uStack00000000000000a0,300);
      uVar7 = lVar10 + 1;
      if (unaff_x25 != 0) {
        uVar7 = (ulong)*(ushort *)(unaff_x25 + uVar7 * 2);
      }
      puVar1 = &uStack00000000000000a0 + iVar3;
      in_stack_00000090 = *(undefined8 *)(unaff_x24 + (long)(int)uVar7 * (long)unaff_w22);
      iVar3 = func_0x000b875c(puVar1,300 - (long)iVar3);
      uVar7 = lVar10 + 2;
      if (unaff_x25 != 0) {
        uVar7 = (ulong)*(ushort *)(unaff_x25 + uVar7 * 2);
      }
      in_stack_00000098 = *(undefined8 *)(unaff_x24 + (long)(int)uVar7 * (long)unaff_w22);
      func_0x000b875c(puVar1 + iVar3,unaff_x27 - (long)(puVar1 + iVar3));
      uStack0000000000000058 = 0;
      func_0x0010f27c(&uStack00000000000000a0,0,0,&uStack0000000000000058);
      if (unaff_x20 != 0) {
        lVar10 = *(long *)(lRam0000000000a334c0 + 0x4000);
        if (((&UNK_00004b7b)[lRam0000000000a334c0] == '\0') ||
           ((&UNK_00004b7a)[lRam0000000000a334c0] != '\0')) {
          if (((*(uint *)(&UNK_000049b0 + lRam0000000000a334c0) & 1) != 0) &&
             (((*(uint *)(&UNK_000049b0 + lRam0000000000a334c0) >> 7 & 1) != 0 ||
              (*(long *)(&UNK_00004008 + lRam0000000000a334c0) == lVar10)))) {
            iVar3 = *(int *)(&UNK_000049a8 + lRam0000000000a334c0);
            iVar4 = *(int *)(&UNK_00004064 + lRam0000000000a334c0);
            if ((iVar4 == 0) ||
               (((iVar4 == iVar3 || ((&UNK_00004071)[lRam0000000000a334c0] != '\0')) ||
                (iVar4 == *(int *)(lVar10 + 0x84))))) {
              if ((((*(long *)(&UNK_00004b18 + lRam0000000000a334c0) != 0) &&
                   (lVar8 = *(long *)(*(long *)(&UNK_00004b18 + lRam0000000000a334c0) + 0x388),
                   lVar8 != 0)) &&
                  ((*(char *)(lVar8 + 0xbf) != '\0' &&
                   ((lVar9 = *(long *)(lVar10 + 0x388), lVar8 != lVar9 &&
                    ((*(byte *)(lVar8 + 0x17) & 0xc) != 0)))))) &&
                 (*(long *)(lVar9 + 0x388) != lVar8)) {
                do {
                  if (lVar9 == lVar8) goto code_r0x000e5258;
                  lVar9 = *(long *)(lVar9 + 0x380);
                } while (lVar9 != 0);
                if (((&UNK_000049ad)[lRam0000000000a334c0] & 1) == 0) goto code_r0x000e5038;
              }
code_r0x000e5258:
              if ((((*(uint *)(&UNK_000049ac + lRam0000000000a334c0) >> 2 & 1) == 0) &&
                  ((iVar3 != *(int *)(lVar10 + 0x84) || (*(char *)(lVar10 + 0xc0) == '\0')))) &&
                 (((*(uint *)(&UNK_000049ac + lRam0000000000a334c0) >> 9 & 1) == 0 ||
                  ((iVar3 == 0 || (*(int *)(&UNK_00004054 + lRam0000000000a334c0) == iVar3))))))
              goto code_r0x000e52a0;
            }
          }
        }
        else if ((((byte)(&UNK_000049ac)[lRam0000000000a334c0] >> 2 & 1) == 0) &&
                ((*(int *)(&UNK_00004b20 + lRam0000000000a334c0) != 0 &&
                 (*(int *)(&UNK_00004b20 + lRam0000000000a334c0) ==
                  *(int *)(&UNK_000049a8 + lRam0000000000a334c0))))) {
code_r0x000e52a0:
          uVar6 = *(uint *)(unaff_x20 + 0x30);
          *(uint *)(unaff_x20 + 0x30) = uVar6 & 0xfffffffe;
          func_0x000f0ff4(0x3f800000);
          *(uint *)(unaff_x20 + 0x30) = uVar6;
        }
      }
code_r0x000e5038:
      uVar5 = uVar5 + 3;
      uVar6 = (int)uVar11 + 1;
      uVar11 = (ulong)uVar6;
    } while ((int)uVar6 < iStack000000000000006c);
  } while( true );
}

