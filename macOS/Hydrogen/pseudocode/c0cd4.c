
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_000c0cd4(void)

{
  byte bVar1;
  undefined8 uVar2;
  uint in_w8;
  int iVar3;
  long lVar4;
  uint uVar5;
  byte *in_x9;
  uint in_w10;
  uint in_w11;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x23;
  
  while( true ) {
    if (((in_w10 == 0x23) && (in_w11 == 0x23)) && (*in_x9 == 0x23)) {
      in_w8 = 0xffffffff;
    }
    in_w8 = *(uint *)(unaff_x23 + (ulong)(in_w8 & 0xff ^ in_w10) * 4) ^ in_w8 >> 8;
    if (in_w11 == 0) break;
    bVar1 = *in_x9;
    in_x9 = in_x9 + 1;
    in_w10 = in_w11;
    in_w11 = (uint)bVar1;
  }
  uVar5 = ~in_w8;
  *(uint *)(unaff_x19 + 2) = uVar5;
  iVar3 = (int)unaff_x19[0x20];
  if (iVar3 == *(int *)((long)unaff_x19 + 0x104)) {
    func_0x000eb9f0();
    iVar3 = (int)unaff_x19[0x20];
    uVar5 = *(uint *)(unaff_x19 + 2);
  }
  *(uint *)(unaff_x19[0x21] + (long)iVar3 * 4) = uVar5;
  lVar4 = unaff_x19[0x20];
  *(int *)(unaff_x19 + 0x20) = (int)lVar4 + 1;
  uVar5 = *(uint *)(unaff_x19[0x21] + (long)(int)lVar4 * 4);
  uVar5 = *(uint *)(unaff_x23 + ((ulong)uVar5 & 0xff ^ 0xdc) * 4) ^ ~uVar5 >> 8;
  uVar5 = *(uint *)(unaff_x23 + (ulong)(uVar5 & 0xff ^ 0x4d) * 4) ^ uVar5 >> 8;
  uVar5 = *(uint *)(unaff_x23 + (ulong)(uVar5 & 0xff ^ 0x4f) * 4) ^ uVar5 >> 8;
  uVar5 = *(uint *)(unaff_x23 + (ulong)(uVar5 & 0xff ^ 0x56) * 4) ^ uVar5 >> 8;
  uVar5 = *(uint *)(unaff_x23 + (ulong)(uVar5 & 0xff ^ 0x45) * 4) ^ uVar5 >> 8 ^ 0xffffffff;
  lVar4 = *unaff_x19;
  if (*(uint *)(&UNK_0000404c + lVar4) == uVar5) {
    func_0x000c167c(uVar5,0xb,"#MOVE",0);
    lVar4 = *unaff_x19;
  }
  *(uint *)((long)unaff_x19 + 0x84) = uVar5;
  uVar2 = _UNK_0080c2e0;
  *(undefined8 *)((long)unaff_x19 + 0xa4) = _UNK_0080c2e8;
  *(undefined8 *)((long)unaff_x19 + 0x9c) = uVar2;
  *(undefined2 *)((long)unaff_x19 + 0xdc) = 0xffff;
  *(undefined4 *)(unaff_x19 + 0x1c) = 0xffffffff;
  *(uint *)(unaff_x19 + 0x1d) = (uint)*(byte *)((long)unaff_x19 + 0xeb) << 0x18;
  *(undefined8 *)((long)unaff_x19 + 0xf4) = 0x7f7fffff7f7fffff;
  *(undefined8 *)((long)unaff_x19 + 0xec) = 0x7f7fffff7f7fffff;
  unaff_x19[0x4e] = -0x407fffff00000001;
  unaff_x19[0x54] = -0xc0800000;
  unaff_x19[0x55] = unaff_x20;
  unaff_x19[0x5d] = (long)(&UNK_00003d40 + lVar4);
  unaff_x19[0x5e] = unaff_x19[1];
  unaff_x19[0x7d] = 0x7f7fffff7f7fffff;
  unaff_x19[0x7c] = 0x7f7fffff7f7fffff;
  return;
}

