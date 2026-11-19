/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00959338
 */

void FUN_00959338(long param_1,long *param_2)

{
  ulong uVar1;
  ulong uVar2;
  long lVar3;
  ushort uVar4;
  undefined8 uVar5;
  ulong uVar6;
  long lVar7;
  long lVar8;
  undefined1 auStack_54 [4];
  ulong local_50;
  long local_48;
  
  lVar3 = tpidr_el0;
  local_48 = *(long *)(lVar3 + 0x28);
  lVar7 = *(long *)(param_1 + 0x20);
  *param_2 = 0;
  if (*(long *)(lVar7 + 0x470) == 0) {
    uVar6 = *(ulong *)(lVar7 + 0x468);
    if (uVar6 == 0) goto LAB_00959420;
    if (0x8fff < uVar6) {
      uVar6 = 0x9000;
    }
    local_50 = uVar6;
    uVar5 = FUN_00935b84(param_1,*(undefined8 *)(lVar7 + 0x460),uVar6,&local_50,auStack_54);
    if (((int)uVar5 != 0x51) && ((int)uVar5 != 0)) goto LAB_009594e8;
    if (local_50 != 0) {
      *(ulong *)(lVar7 + 0x470) = local_50;
      *(undefined8 *)(lVar7 + 0x478) = 0;
      *(ulong *)(lVar7 + 0x468) = *(long *)(lVar7 + 0x468) - local_50;
      goto LAB_00959374;
    }
  }
  else {
LAB_00959374:
    lVar8 = *(long *)(param_1 + 0x20);
    if (*(long *)(lVar8 + 0x470) == 0) {
LAB_009593b4:
      lVar8 = *(long *)(lVar7 + 0x470);
    }
    else {
      uVar6 = *(long *)(lVar8 + 0x470) - *(long *)(lVar8 + 0x478);
      uVar5 = FUN_009434ec(param_1,*(long *)(lVar8 + 0x460) + *(long *)(lVar8 + 0x478),uVar6,
                           &local_50);
      if ((int)uVar5 != 0) goto LAB_009594e8;
      if (local_50 == uVar6) {
        *(undefined8 *)(lVar8 + 0x470) = 0;
        goto LAB_009593b4;
      }
      *(ulong *)(lVar8 + 0x478) = *(long *)(lVar8 + 0x478) + local_50;
      lVar8 = *(long *)(lVar7 + 0x470);
    }
    if ((lVar8 != 0) || (*(long *)(lVar7 + 0x468) != 0)) {
      uVar5 = 0x51;
      goto LAB_009594e8;
    }
LAB_00959420:
    lVar8 = *(long *)(param_1 + 0x20);
    lVar7 = *(long *)(lVar8 + 0x458);
    uVar5 = FUN_0094358c(param_1,lVar7 + *(long *)(lVar8 + 0x480),0x9000 - *(long *)(lVar8 + 0x480),
                         &local_50);
    if ((int)uVar5 != 0) goto LAB_009594e8;
    if (local_50 != 0) {
      uVar5 = 0;
      uVar6 = *(long *)(lVar8 + 0x480) + local_50;
      *(ulong *)(lVar8 + 0x480) = uVar6;
      if (3 < uVar6) {
        uVar6 = FUN_0095a72c(lVar7 + 2);
        uVar6 = (uVar6 & 0xffff) + 4;
        uVar5 = 0;
        if (uVar6 <= *(ulong *)(lVar8 + 0x480)) {
          if (0x24 < uVar6) {
            uVar2 = (ulong)*(byte *)(lVar7 + 0x24) << 1 | 1;
            uVar1 = uVar2 + 0x26;
            if ((uVar1 <= uVar6) &&
               (uVar4 = FUN_0095a71c(lVar7 + uVar2 + 0x24), uVar6 < uVar1 + uVar4)) {
              uVar5 = 0x1a;
              goto LAB_009594e8;
            }
          }
          uVar5 = 0;
          *param_2 = lVar7;
        }
      }
      goto LAB_009594e8;
    }
  }
  uVar5 = 0;
LAB_009594e8:
  if (*(long *)(lVar3 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar5);
  }
  return;
}

