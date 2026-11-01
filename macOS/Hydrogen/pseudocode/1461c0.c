
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_001461c0(long param_1)

{
  long lVar1;
  undefined2 *puVar2;
  undefined4 *puVar3;
  long *unaff_x19;
  long *unaff_x20;
  long unaff_x22;
  undefined1 uStack0000000000000020;
  long lStack0000000000000028;
  long lStack0000000000000030;
  undefined4 uStack0000000000000038;
  
  *(undefined1 *)(param_1 + 0x30) = 0;
  lVar1 = _UNK_00813420;
  lStack0000000000000030 = _UNK_00813428;
  lStack0000000000000028 = _UNK_00813420;
  uStack0000000000000038 = 5;
  if (unaff_x20 < unaff_x19) {
    unaff_x20[2] = _UNK_00813428;
    unaff_x20[1] = lVar1;
    *unaff_x20 = param_1;
    *(undefined4 *)(unaff_x20 + 3) = 5;
    plRam0000000000a395f8 = unaff_x20 + 4;
  }
  else {
    _uStack0000000000000020 = param_1;
    plRam0000000000a395f8 = (long *)func_0x0014a284(0xa395f0,&uStack0000000000000020);
    if (lStack0000000000000030 < 0) {
      __ZdlPv(_uStack0000000000000020);
    }
  }
  if (cRam0000000000a395af < '\0') {
    uRam0000000000a395a0 = 2;
    puVar2 = (undefined2 *)
             CONCAT53(uRam0000000000a3959b,CONCAT12(uRam0000000000a3959a,uRam0000000000a39598));
    *puVar2 = 0x2a2f;
    *(undefined1 *)(puVar2 + 1) = 0;
  }
  else {
    cRam0000000000a395af = '\x02';
    uRam0000000000a39598 = 0x2a2f;
    uRam0000000000a3959a = 0;
  }
  if (cRam0000000000a395c7 < '\0') {
    uRam0000000000a395b8 = 2;
    puVar2 = (undefined2 *)
             CONCAT53(uRam0000000000a395b3,CONCAT12(uRam0000000000a395b2,uRam0000000000a395b0));
    *puVar2 = 0x2f2a;
    *(undefined1 *)(puVar2 + 1) = 0;
  }
  else {
    cRam0000000000a395c7 = '\x02';
    uRam0000000000a395b0 = 0x2f2a;
    uRam0000000000a395b2 = 0;
  }
  if (cRam0000000000a395df < '\0') {
    uRam0000000000a395d0 = 2;
    puVar2 = puRam0000000000a395c8;
  }
  else {
    puVar2 = (undefined2 *)0xa395c8;
    cRam0000000000a395df = '\x02';
  }
  *puVar2 = 0x2f2f;
  *(undefined1 *)(puVar2 + 1) = 0;
  uRam0000000000a39608 = 0;
  uRam0000000000a395e1 = 0;
  if (cRam0000000000a3951f < '\0') {
    uRam0000000000a39510 = 3;
    puVar3 = puRam0000000000a39508;
  }
  else {
    cRam0000000000a3951f = '\x03';
    puVar3 = (undefined4 *)0xa39508;
  }
  *puVar3 = 0x4c5153;
  *(undefined1 *)(unaff_x22 + 0xac) = 1;
  return 0xa39508;
}

