
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_004a4a4c(char *param_1)

{
  int iVar1;
  code *pcVar2;
  long lVar3;
  undefined1 uVar4;
  long in_x9;
  long in_x10;
  ulong in_x11;
  int in_w12;
  long in_x15;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  ulong uVar5;
  long unaff_x24;
  long unaff_x25;
  long unaff_x26;
  long unaff_x27;
  int unaff_w28;
  long unaff_x29;
  long in_stack_00000000;
  long in_stack_00000008;
  long in_stack_00000010;
  ulong uStack0000000000000020;
  ulong uStack0000000000000030;
  undefined8 in_stack_00000038;
  undefined1 uStack0000000000000040;
  undefined1 uStack0000000000000044;
  undefined1 in_stack_00000048;
  undefined8 uStack0000000000000050;
  long *in_stack_00000058;
  undefined8 uStack0000000000000068;
  long in_stack_00000080;
  undefined8 in_stack_00000088;
  long in_stack_00000090;
  undefined1 uStack00000000000000f0;
  
  if (in_w12 == 0) {
    uVar4 = 0;
    uStack0000000000000020 = 0x8000000000000000;
    uVar5 = 0x8000000000000000;
    uStack0000000000000030 = in_x11;
LAB_004a4bf4:
    if (in_x10 != 0) {
      if (*param_1 != '\0') {
        *(undefined **)(unaff_x24 + 0x40) = &UNK_009e36d0;
        *(undefined8 *)(unaff_x24 + 0x48) = 1;
        *(undefined8 *)(unaff_x24 + 0x58) = 0;
        *(undefined8 *)(unaff_x24 + 0x60) = 0;
        *(undefined8 *)(unaff_x24 + 0x50) = 8;
        func_0x007a2420(&uStack00000000000000f0,&UNK_009e36e0);
                    /* WARNING: Does not return */
        pcVar2 = (code *)SoftwareBreakpoint(1,0x4a4da0);
        (*pcVar2)();
      }
      lVar3 = *(long *)(unaff_x24 + 0x70);
      unaff_x19[6] = *(long *)(unaff_x24 + 0x78);
      unaff_x19[5] = lVar3;
      lVar3 = *(long *)(unaff_x24 + 0x80);
      *unaff_x19 = (long)(param_1 + 1);
      unaff_x19[1] = in_x10 + -1;
      unaff_x19[2] = unaff_x27;
      unaff_x19[3] = unaff_x20;
      unaff_x19[4] = unaff_x21;
      unaff_x19[7] = lVar3;
      unaff_x19[8] = unaff_x26;
      unaff_x19[9] = unaff_x25;
      unaff_x19[10] = unaff_x23;
      unaff_x19[0xb] = uStack0000000000000020;
      unaff_x19[0xc] = in_stack_00000008;
      unaff_x19[0xd] = in_stack_00000000;
      unaff_x19[0xe] = uVar5;
      unaff_x19[0xf] = in_stack_00000010;
      unaff_x19[0x10] = in_x11;
      unaff_x19[0x11] = unaff_x22;
      unaff_x19[0x12] = in_x15;
      *(undefined1 *)(unaff_x19 + 0x13) = uVar4;
      *(char *)((long)unaff_x19 + 0x99) = (char)uStack0000000000000030;
      *(bool *)((long)unaff_x19 + 0x9a) = in_stack_00000038._4_4_ != 0;
      *(undefined1 *)((long)unaff_x19 + 0x9b) = in_stack_00000048;
      *(undefined1 *)((long)unaff_x19 + 0x9c) = uStack0000000000000044;
      *(undefined1 *)((long)unaff_x19 + 0x9d) = uStack0000000000000040;
      if (in_stack_00000080 != 0) {
        func_0x00187bd4(in_stack_00000088,in_stack_00000080 << 2,4);
      }
      if (unaff_w28 == 0) {
        return;
      }
      if (uStack0000000000000050 != 2) {
        func_0x005ec378(&uStack0000000000000050,&uStack0000000000000068);
      }
      func_0x004a38e0(&uStack0000000000000050);
      return;
    }
    unaff_x19[4] = (long)param_1;
    unaff_x19[5] = 0;
    *(undefined1 *)(unaff_x19 + 6) = 0x17;
    lVar3 = _UNK_0089fb20;
    unaff_x19[3] = _UNK_0089fb28;
    unaff_x19[2] = lVar3;
    if ((uVar5 | 0x8000000000000000) != 0x8000000000000000) {
      func_0x00187bd4(in_stack_00000010,uVar5 << 2,4);
    }
  }
  else {
    if (in_x10 == 0) {
      unaff_x19[4] = (long)param_1;
      unaff_x19[5] = 0;
      *(undefined1 *)(unaff_x19 + 6) = 0x17;
      lVar3 = _UNK_0089fb20;
      unaff_x19[3] = _UNK_0089fb28;
      unaff_x19[2] = lVar3;
      goto LAB_004a4ab8;
    }
    uStack0000000000000030 = (ulong)*(byte *)(in_x9 + 1);
    func_0x004baad0(&uStack00000000000000f0,in_x9 + 2,in_x11 - 2,in_stack_00000090);
    lVar3 = *(long *)(unaff_x24 + 0x48);
    uStack0000000000000020 = *(ulong *)(unaff_x24 + 0x58);
    in_stack_00000008 = *(long *)(unaff_x24 + 0x60);
    if (*(int *)(unaff_x24 + 0x40) == 1) {
      unaff_x19[4] = *(long *)(unaff_x24 + 0x50);
      unaff_x19[5] = uStack0000000000000020;
      unaff_x19[6] = in_stack_00000008;
      unaff_x19[2] = -0x8000000000000000;
      unaff_x19[3] = lVar3;
      goto LAB_004a4ab8;
    }
    in_stack_00000000 = *(long *)(unaff_x24 + 0x68);
    func_0x004baa44(&uStack00000000000000f0,lVar3,*(long *)(unaff_x24 + 0x50),
                    (in_stack_00000090 - 1U >> (uStack0000000000000030 & 0x3f)) + 1);
    param_1 = *(char **)(unaff_x24 + 0x48);
    in_x10 = *(long *)(unaff_x24 + 0x50);
    uVar5 = *(ulong *)(unaff_x24 + 0x58);
    in_stack_00000010 = *(long *)(unaff_x24 + 0x60);
    if (*(int *)(unaff_x24 + 0x40) != 1) {
      in_x11 = *(ulong *)(unaff_x24 + 0x68);
      uVar4 = 1;
      goto LAB_004a4bf4;
    }
    unaff_x19[4] = in_x10;
    unaff_x19[5] = uVar5;
    unaff_x19[6] = in_stack_00000010;
    unaff_x19[2] = -0x8000000000000000;
    unaff_x19[3] = (long)param_1;
  }
  if ((uStack0000000000000020 | 0x8000000000000000) != 0x8000000000000000) {
    func_0x00187bd4(in_stack_00000008,uStack0000000000000020,1);
  }
LAB_004a4ab8:
  if (unaff_x26 != 0) {
    func_0x00187bd4();
  }
  func_0x0048a7a8(unaff_x29 + -0xc0);
  if (unaff_x27 != 0) {
    func_0x00187bd4();
  }
  if (in_stack_00000080 != 0) {
    func_0x00187bd4(in_stack_00000088,in_stack_00000080 << 2,4);
  }
  iVar1 = 0;
  if (uStack0000000000000050 != 2) {
    iVar1 = unaff_w28;
  }
  if (((iVar1 == 1) &&
      (func_0x005ec378(&uStack0000000000000050,&uStack0000000000000068),
      lVar3 = uStack0000000000000050, uStack0000000000000050 != 2)) &&
     (func_0x005ec3ac(&uStack0000000000000050,uStack0000000000000068), lVar3 != 0)) {
    lVar3 = *in_stack_00000058;
    *in_stack_00000058 = lVar3 + -1;
    LORelease();
    if (lVar3 == 1) {
      DataMemoryBarrier(2,1);
      func_0x005e80f0((ulong)&uStack0000000000000050 | 8);
    }
  }
  return;
}

