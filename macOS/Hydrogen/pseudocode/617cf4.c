
ulong FUN_00617cf4(undefined8 param_1,undefined8 param_2,ulong param_3,undefined8 param_4,
                  undefined8 param_5)

{
  byte bVar1;
  long lVar2;
  long lVar3;
  int in_w8;
  uint uVar4;
  ulong uVar5;
  uint uVar6;
  int iVar7;
  uint uVar8;
  uint unaff_w21;
  undefined1 auVar9 [16];
  undefined8 in_stack_00000000;
  long in_stack_00000010;
  undefined8 in_stack_00000018;
  long in_stack_00000028;
  undefined8 in_stack_00000030;
  
  if (in_w8 < 0) {
    __ZdlPv(in_stack_00000030);
  }
  if (in_stack_00000028 < 0) {
    __ZdlPv(in_stack_00000018);
  }
  if (in_stack_00000010 < 0) {
    __ZdlPv(in_stack_00000000);
    unaff_w21 = unaff_w21 & 1;
  }
  if (unaff_w21 != 0) {
    ___cxa_free_exception();
  }
  auVar9 = __Unwind_Resume();
  lVar2 = auVar9._0_8_;
  iVar7 = *(int *)(lVar2 + 0x28);
  if (iVar7 == 0) {
    uVar5 = 0;
    *(undefined8 *)(lVar2 + 0x20) = 0;
    goto LAB_00617e10;
  }
  if (iVar7 == 1) {
    while (lVar3 = func_0x0066ad70(lVar2,1,*(undefined8 *)(lVar2 + 0x68),
                                   (long)*(int *)(lVar2 + 0x40),0,param_5,&UNK_008ba5c8), lVar3 == 0
          ) {
      *(undefined4 *)(lVar2 + 0x44) = 0;
      *(undefined4 *)(lVar2 + 0x48) = 0;
      do {
        uVar5 = *(ulong *)(lVar2 + 0x20);
LAB_00617e10:
        if (param_3 <= uVar5) {
          if ((int)param_4 == 0) {
            return 0;
          }
          uVar4 = *(uint *)(lVar2 + 0x44);
          if (0 < *(int *)(lVar2 + 0x48)) {
            uVar4 = uVar4 + 1;
            *(uint *)(lVar2 + 0x44) = uVar4;
          }
          if (0 < (int)uVar4) {
            lVar3 = 0;
            do {
              *(undefined1 *)(*(long *)(lVar2 + 0x68) + lVar3) =
                   *(undefined1 *)
                    (*(long *)(lVar2 + 0x30) + (ulong)*(byte *)(*(long *)(lVar2 + 0x68) + lVar3));
              lVar3 = lVar3 + 1;
              uVar4 = *(uint *)(lVar2 + 0x44);
            } while (lVar3 < (int)uVar4);
            if (0 < (int)uVar4 && *(int *)(lVar2 + 0x38) != -1) {
              _memset(*(long *)(lVar2 + 0x68) + (ulong)uVar4,*(int *)(lVar2 + 0x38),
                      (long)*(int *)(lVar2 + 0x40) - (long)(int)uVar4);
              uVar4 = *(uint *)(lVar2 + 0x40);
              *(uint *)(lVar2 + 0x44) = uVar4;
            }
          }
          goto code_r0x00617db8;
        }
        iVar7 = *(int *)(lVar2 + 0x44);
        if (iVar7 == 0) {
          _bzero(*(undefined8 *)(lVar2 + 0x68),(long)*(int *)(lVar2 + 0x40));
          iVar7 = *(int *)(lVar2 + 0x44);
        }
        lVar3 = *(long *)(lVar2 + 0x20);
        *(long *)(lVar2 + 0x20) = lVar3 + 1;
        bVar1 = *(byte *)(auVar9._8_8_ + lVar3);
        uVar4 = (uint)bVar1;
        uVar6 = *(int *)(lVar2 + 0x3c) - *(int *)(lVar2 + 0x48);
        *(byte *)(*(long *)(lVar2 + 0x68) + (long)iVar7) =
             *(byte *)(*(long *)(lVar2 + 0x68) + (long)iVar7) | bVar1 >> (ulong)(8 - uVar6 & 0x1f);
        uVar8 = 8;
        if (uVar6 < 9) {
          do {
            uVar5 = (long)*(int *)(lVar2 + 0x44) + 1;
            *(int *)(lVar2 + 0x44) = (int)uVar5;
            *(undefined4 *)(lVar2 + 0x48) = 0;
            uVar8 = uVar8 - uVar6;
            if (uVar8 == 0) goto LAB_00617ec4;
            uVar4 = uVar4 << (ulong)(uVar6 & 0x1f) & 0xff;
            uVar6 = *(uint *)(lVar2 + 0x3c);
            *(byte *)(*(long *)(lVar2 + 0x68) + uVar5) =
                 *(byte *)(*(long *)(lVar2 + 0x68) + uVar5) |
                 (byte)(uVar4 >> (ulong)(8 - uVar6 & 0x1f));
          } while (uVar6 <= uVar8);
        }
        uVar5 = (ulong)*(uint *)(lVar2 + 0x44);
        *(uint *)(lVar2 + 0x48) = *(int *)(lVar2 + 0x48) + uVar8;
LAB_00617ec4:
      } while ((int)uVar5 != *(int *)(lVar2 + 0x40));
      if (0 < (int)uVar5) {
        lVar3 = 0;
        do {
          *(undefined1 *)(*(long *)(lVar2 + 0x68) + lVar3) =
               *(undefined1 *)
                (*(long *)(lVar2 + 0x30) + (ulong)*(byte *)(*(long *)(lVar2 + 0x68) + lVar3));
          lVar3 = lVar3 + 1;
        } while (lVar3 < *(int *)(lVar2 + 0x44));
      }
    }
    iVar7 = *(int *)(lVar2 + 0x40);
  }
  else {
    if (iVar7 != 2) {
      return 0;
    }
    uVar4 = *(uint *)(lVar2 + 0x44);
code_r0x00617db8:
    lVar3 = func_0x0066ad70(lVar2,2,*(undefined8 *)(lVar2 + 0x68),(long)(int)uVar4,param_4,param_5,
                            &UNK_008ba5c8);
    if (lVar3 == 0) {
      *(undefined4 *)(lVar2 + 0x44) = 0;
      *(undefined4 *)(lVar2 + 0x48) = 0;
      return 0;
    }
    iVar7 = *(int *)(lVar2 + 0x44);
  }
  uVar5 = (long)iVar7 - *(long *)(lVar2 + 0x20);
  if (uVar5 < 2) {
    uVar5 = 1;
  }
  return uVar5;
}

