
void FUN_000511d0(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  long *unaff_x20;
  
  func_0x0078cc0c(param_1,param_2,0,param_4,0,8);
  if (unaff_x20[4] != 0) {
    func_0x00741830();
    unaff_x20[4] = 0;
  }
  if (unaff_x20[8] != 0) {
    _free();
    unaff_x20[8] = 0;
  }
  __ZNSt3__15mutex6unlockEv();
  if (((int)unaff_x20[2] != 0) && (unaff_x20[1] != 0)) {
    func_0x006e5bd0();
    *(undefined4 *)(unaff_x20 + 2) = 0;
  }
  if (*unaff_x20 != 0) {
    if (*(int *)((long)unaff_x20 + 0x14) != 0) {
      func_0x006e5bd0();
      *(undefined4 *)((long)unaff_x20 + 0x14) = 0;
    }
    if ((int)unaff_x20[3] != 0) {
      func_0x006e5bd0(*unaff_x20);
      *(undefined4 *)(unaff_x20 + 3) = 0;
    }
  }
  __ZNSt3__15mutexD1Ev();
  __ZdlPv();
  return;
}

