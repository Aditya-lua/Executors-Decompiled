
void FUN_007b07b4(ulong param_1,uint param_2)

{
  uint uVar1;
  ulong uVar2;
  undefined8 uVar3;
  ulong *unaff_x19;
  undefined1 *unaff_x20;
  long unaff_x21;
  ulong unaff_x22;
  ulong unaff_x23;
  undefined1 auVar4 [12];
  
  if (param_1 == unaff_x19[3]) {
    if (param_2 <= (uint)unaff_x19[4]) goto LAB_007b0760;
code_r0x007b07c4:
    uVar1 = (uint)unaff_x19[5] ^ (uint)unaff_x19[5] << 0xd;
    uVar1 = uVar1 ^ uVar1 >> 0x11;
    uVar1 = uVar1 ^ uVar1 << 5;
    *(uint *)(unaff_x19 + 5) = uVar1;
    auVar4 = func_0x00428d2c(param_1,param_2,0,uVar1 % 1000000);
    *(undefined1 (*) [12])(unaff_x19 + 3) = auVar4;
  }
  else {
    if ((long)unaff_x19[3] < (long)param_1) goto code_r0x007b07c4;
LAB_007b0760:
    if ((unaff_x22 & 1) == 0) {
      uVar3 = 0;
      if ((unaff_x23 & 1) == 0) {
        *unaff_x20 = 0;
      }
      else {
        *unaff_x20 = 2;
      }
      goto LAB_007b0818;
    }
  }
  uVar3 = 1;
  if ((unaff_x23 & 1) == 0) {
    *unaff_x20 = 1;
  }
LAB_007b0818:
  *(undefined8 *)(unaff_x21 + 0x88) = uVar3;
  _pthread_mutex_lock();
  uVar2 = *unaff_x19;
  *unaff_x19 = uVar2 - 1;
  LORelease();
  if ((3 < uVar2) && (((uint)uVar2 >> 1 & 1) == 0)) {
    func_0x007b0f88();
  }
  *(undefined1 *)(unaff_x21 + 0x70) = 0;
  _pthread_cond_signal(unaff_x21 + 0x40);
                    /* WARNING: Could not recover jumptable at 0x007b3b50. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__pthread_mutex_unlock_00a252d0)();
  return;
}

