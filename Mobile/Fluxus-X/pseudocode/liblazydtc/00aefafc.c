/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aefafc
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

uint FUN_00aefafc(UI *param_1,UI_STRING *param_2,int param_3,int param_4)

{
  FILE *__stream;
  int iVar1;
  uint uVar2;
  char *pcVar3;
  uint uVar4;
  sigaction *psVar5;
  long lVar6;
  _union_1457 local_470;
  undefined1 *puStack_468;
  undefined8 local_460;
  undefined8 uStack_458;
  char acStack_70 [16];
  
  lVar6 = -0x1f;
  psVar5 = (sigaction *)&DAT_00d22388;
  DAT_00d22360 = 0;
  DAT_00d2235c = 0;
  local_460 = 0;
  uStack_458 = 0;
  local_470.sa_handler = (__sighandler_t)0x0;
  puStack_468 = &LAB_00aefdd0;
  do {
    uVar2 = (int)lVar6 + 0x20;
    if ((0xc < (uVar2 & 0x7fffffff)) || ((1 << (ulong)(uVar2 & 0x1f) & 0x1600U) == 0)) {
      sigaction((int)lVar6 + 0x20,(sigaction *)&local_470,psVar5);
    }
    lVar6 = lVar6 + 1;
    psVar5 = (sigaction *)((psVar5->sa_mask).__val + 3);
  } while (lVar6 != 0);
  signal(0x1c,(__sighandler_t)0x0);
  DAT_00d2235c = 1;
  if (param_3 == 0) {
    _DAT_00d22768 = _DAT_00d22338;
    uRam0000000000d22780 = uRam0000000000d22350;
    _DAT_00d22778 = _DAT_00d22348;
    DAT_00d22788 = DAT_00d22358;
    uRam0000000000d22770 = uRam0000000000d22340 & 0xfffffff7ffffffff;
    if (DAT_00d22320 != '\x01') goto LAB_00aefc14;
    iVar1 = fileno(DAT_00d22328);
    iVar1 = tcsetattr(iVar1,0,(termios *)&DAT_00d22768);
    if (iVar1 != -1) goto LAB_00aefc14;
    uVar2 = -(uint)(DAT_00d22360 == 2);
  }
  else {
LAB_00aefc14:
    DAT_00d2235c = 2;
    local_470.sa_handler = (__sighandler_t)((ulong)local_470.sa_handler & 0xffffffffffffff00);
    pcVar3 = fgets((char *)&local_470,0x3ff,DAT_00d22328);
    if (pcVar3 == (char *)0x0) {
LAB_00aefcb8:
      uVar2 = 0;
    }
    else {
      iVar1 = feof(DAT_00d22328);
      __stream = DAT_00d22328;
      uVar2 = 0;
      if (iVar1 == 0) {
        iVar1 = ferror(DAT_00d22328);
        uVar2 = 0;
        if (iVar1 == 0) {
          pcVar3 = strchr((char *)&local_470,10);
          if (pcVar3 == (char *)0x0) {
            do {
              pcVar3 = fgets(acStack_70,4,__stream);
              if (pcVar3 == (char *)0x0) goto LAB_00aefcb8;
              pcVar3 = strchr(acStack_70,10);
            } while (pcVar3 == (char *)0x0);
          }
          else if (param_4 != 0) {
            *pcVar3 = '\0';
          }
          uVar2 = UI_set_result(param_1,param_2,(char *)&local_470);
          uVar2 = uVar2 >> 0x1f ^ 1;
        }
      }
    }
    if (DAT_00d22360 == 2) {
      uVar2 = 0xffffffff;
    }
    uVar4 = uVar2;
    if (param_3 != 0) goto LAB_00aefcd0;
  }
  fputc(10,DAT_00d22330);
  uVar4 = uVar2;
  if ((param_3 == 0) && (1 < DAT_00d2235c)) {
    DAT_00d22788 = DAT_00d22358;
    uRam0000000000d22770 = uRam0000000000d22340;
    _DAT_00d22768 = _DAT_00d22338;
    uRam0000000000d22780 = uRam0000000000d22350;
    _DAT_00d22778 = _DAT_00d22348;
    if (DAT_00d22320 == '\x01') {
      iVar1 = fileno(DAT_00d22328);
      iVar1 = tcsetattr(iVar1,0,(termios *)&DAT_00d22768);
      uVar4 = 0;
      if (iVar1 != -1) {
        uVar4 = uVar2;
      }
    }
  }
LAB_00aefcd0:
  if (0 < DAT_00d2235c) {
    psVar5 = (sigaction *)&DAT_00d22388;
    lVar6 = -0x1f;
    do {
      uVar2 = (int)lVar6 + 0x20U & 0x7fffffff;
      if ((uVar2 != 10) && (uVar2 != 0xc)) {
        sigaction((int)lVar6 + 0x20,psVar5,(sigaction *)0x0);
      }
      lVar6 = lVar6 + 1;
      psVar5 = (sigaction *)((psVar5->sa_mask).__val + 3);
    } while (lVar6 != 0);
  }
  OPENSSL_cleanse(&local_470,0x400);
  return uVar4;
}

