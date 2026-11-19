/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008adea0
 */

void FUN_008adea0(long param_1,uint param_2,int param_3,uint param_4)

{
  ulong uVar1;
  long lVar2;
  int iVar3;
  undefined8 uVar4;
  uint extraout_w1;
  long lVar5;
  long lVar6;
  ulong uVar7;
  undefined4 *unaff_x22;
  long local_58;
  int local_50;
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  iVar3 = param_3 - (param_2 + 1);
  if (iVar3 == 0 || param_3 < (int)(param_2 + 1)) {
LAB_008adf78:
    if (param_4 != 0) {
      if ((int)param_4 < 1) {
        if (param_4 < 0xffffd8f1) {
          uVar7 = FUN_008aea7c(param_1,param_4);
        }
        else {
          uVar7 = *(long *)(param_1 + 0x68) + (long)(int)param_4 * 0x10;
        }
      }
      else {
        uVar7 = (*(long *)(param_1 + 0x70) + (ulong)param_4 * 0x10) - 0x10;
        if (*(ulong *)(param_1 + 0x68) <= uVar7) {
          unaff_x22 = &DAT_00d1f000;
          if ((DAT_00d1f1e0 & 1) == 0) goto LAB_008ae098;
          goto LAB_008adfac;
        }
      }
      goto LAB_008adff4;
    }
    lVar6 = *(long *)(param_1 + 0x58);
    lVar5 = 0;
  }
  else {
    lVar6 = *(long *)(param_1 + 0x68);
    lVar5 = *(long *)(param_1 + 0x50);
    uVar7 = *(ulong *)(lVar5 + 0x18);
    if ((ulong)(lVar6 + (long)iVar3 * 0x10) <= uVar7) goto LAB_008adf78;
    if ((iVar3 < 0x1f41) &&
       (unaff_x22 = (undefined4 *)(long)iVar3,
       (long)unaff_x22 + (lVar6 - *(long *)(param_1 + 0x70) >> 4) < 0x1f41)) {
      if (*(long *)(param_1 + 0x48) - lVar6 <= (long)(ulong)(uint)(iVar3 * 0x10)) {
        local_58 = CONCAT44(local_58._4_4_,iVar3);
        iVar3 = FUN_008b3edc(param_1,&LAB_008aa604,&local_58);
        if (iVar3 != 0) goto LAB_008ae070;
        lVar5 = *(long *)(param_1 + 0x50);
        lVar6 = *(long *)(param_1 + 0x68);
        uVar7 = *(ulong *)(lVar5 + 0x18);
      }
      uVar1 = lVar6 + (long)unaff_x22 * 0x10;
      if (uVar7 < uVar1) {
        *(ulong *)(lVar5 + 0x18) = uVar1;
      }
      goto LAB_008adf78;
    }
LAB_008ae070:
    FUN_008b9568(param_1,"stack overflow");
    if (*(long *)(lVar2 + 0x28) != local_48) goto LAB_008ae0fc;
    FUN_008aa5f4(param_1);
    param_2 = extraout_w1;
LAB_008ae098:
    iVar3 = __cxa_guard_acquire(&DAT_00d1f1e0);
    if (iVar3 != 0) {
                    /* try { // try from 008ae0b8 to 008ae0bb has its CatchHandler @ 008ae0d4 */
      uVar4 = FUN_007fe1ec(DAT_00cca8c8);
      *(undefined8 *)(unaff_x22 + 0x76) = uVar4;
      __cxa_guard_release(&DAT_00d1f1e0);
    }
LAB_008adfac:
    uVar7 = (long)&DWORD_007f2ef0 + *(long *)(unaff_x22 + 0x76);
LAB_008adff4:
    lVar6 = *(long *)(param_1 + 0x58);
    lVar5 = uVar7 - lVar6;
  }
  local_58 = *(long *)(param_1 + 0x68) + (long)(int)~param_2 * 0x10;
  local_50 = param_3;
  FUN_008b47f0(param_1,&LAB_008ae100,&local_58,local_58 - lVar6,lVar5);
  if (param_3 == -1) {
    if (*(ulong *)(*(long *)(param_1 + 0x50) + 0x18) <= *(ulong *)(param_1 + 0x68)) {
      *(ulong *)(*(long *)(param_1 + 0x50) + 0x18) = *(ulong *)(param_1 + 0x68);
    }
  }
  if (*(long *)(lVar2 + 0x28) == local_48) {
    return;
  }
LAB_008ae0fc:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

