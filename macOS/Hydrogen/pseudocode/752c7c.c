
/* WARNING: Removing unreachable block (ram,0x00752bf4) */
/* WARNING: Removing unreachable block (ram,0x00752c00) */
/* WARNING: Removing unreachable block (ram,0x00752c08) */
/* WARNING: Removing unreachable block (ram,0x00752c10) */
/* WARNING: Removing unreachable block (ram,0x00752c18) */
/* WARNING: Removing unreachable block (ram,0x00752c20) */
/* WARNING: Removing unreachable block (ram,0x00752c3c) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_00752c7c(long param_1)

{
  int iVar1;
  long lVar2;
  uint uVar3;
  ulong uVar4;
  undefined8 uVar5;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  undefined8 *unaff_x22;
  uint *unaff_x23;
  
  if (0 < *(int *)(param_1 + 8)) {
    func_0x0073cab8();
  }
  func_0x00734f74();
  *(undefined1 *)(unaff_x21 + 0x658) = 2;
  uVar5 = _UNK_008cd520;
  if (((*(byte *)(unaff_x20 + 0x398) >> 2 & 1) != 0) &&
     ((*(int *)(unaff_x19 + 0x130) == 0x197 ||
      ((*(int *)(unaff_x19 + 0x130) < 300 && ((*unaff_x23 >> 0x12 & 1) != 0)))))) {
    uVar4 = *(ulong *)(unaff_x19 + 0xd10) & *(ulong *)(unaff_x19 + 0xd00);
    uVar3 = (uint)uVar4;
    if ((uVar3 >> 2 & 1) == 0) {
      if (((uVar3 & 0xffffffbf) >> 1 & 1) == 0) {
        if (((uVar3 & 0xffffffbf) >> 3 & 1) == 0) {
          if ((uVar4 & 1) == 0) {
            if ((uVar3 >> 7 & 1) == 0) {
              *(undefined8 *)(unaff_x21 + 0x28) = _UNK_008cd528;
              *(undefined8 *)(unaff_x21 + 0x20) = uVar5;
              *(uint *)(&UNK_00001344 + unaff_x19) = *(uint *)(&UNK_00001344 + unaff_x19) | 0x80;
              goto code_r0x00752d5c;
            }
            uVar5 = 0x80;
            *(undefined8 *)(unaff_x21 + 0x20) = 0x80;
          }
          else {
            uVar5 = 1;
            *(undefined8 *)(unaff_x19 + 0xd08) = 1;
          }
        }
        else {
          uVar5 = 8;
          *(undefined8 *)(unaff_x19 + 0xd08) = 8;
        }
      }
      else {
        uVar5 = 2;
        *(undefined8 *)(unaff_x19 + 0xd08) = 2;
      }
    }
    else {
      uVar5 = 4;
      *(undefined8 *)(unaff_x19 + 0xd08) = 4;
    }
    *(undefined8 *)(unaff_x19 + 0xd10) = 0;
    *(undefined8 *)(&UNK_00001380 + unaff_x19) = uVar5;
  }
code_r0x00752d5c:
  func_0x00752e58();
  (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x19 + 0x1a8));
  *(undefined8 *)(unaff_x19 + 0x1a8) = 0;
  lVar2 = (*pcRam0000000000a2b600)
                    (*(undefined8 *)
                      ("/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation" +
                      unaff_x19 + 0x28));
  *(long *)(unaff_x19 + 0x1a8) = lVar2;
  if (lVar2 == 0) {
    return 0x1b;
  }
  iVar1 = *(int *)(unaff_x19 + 0x130);
  if (((399 < iVar1) && (((uint)*unaff_x22 >> 0x16 & 1) != 0)) &&
     ((*(long *)((long)&dylib_command_00001108.dylib.name.offset + unaff_x19) == 0 ||
      ((iVar1 != 0x1a0 || (*(char *)(unaff_x21 + 0x65a) != '\0')))))) {
    if (iVar1 == 0x197) {
      if ((*(byte *)(*(long *)(unaff_x19 + 0x18) + 0x398) >> 2 & 1) == 0) goto LAB_00752e1c;
    }
    else if ((iVar1 != 0x191) ||
            (*(long *)((long)&linkedit_data_command_00001318.cmd + unaff_x19) == 0))
    goto LAB_00752e1c;
    if ((char)(&UNK_00001344)[unaff_x19] < '\0') {
LAB_00752e1c:
      func_0x0073c9e4();
      return 0x16;
    }
  }
  return 0;
}

