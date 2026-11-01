
void FUN_0012ee58(long param_1)

{
  int iVar1;
  int *piVar2;
  long lVar3;
  long unaff_x19;
  ulong unaff_x21;
  int *unaff_x22;
  float *unaff_x23;
  int unaff_w24;
  uint unaff_w25;
  short unaff_w26;
  int iVar4;
  int unaff_w28;
  undefined4 uVar5;
  float unaff_s11;
  float unaff_s12;
  undefined8 uStack0000000000000008;
  undefined4 uStack0000000000000010;
  float in_stack_00000018;
  
code_r0x0012ee58:
  uVar5 = *(undefined4 *)(*(long *)(unaff_x19 + 0x18) + (long)(int)param_1 * (long)unaff_w24 + 0xc);
LAB_0012ecfc:
  *(undefined4 *)(unaff_x19 + 0xe0) = uVar5;
code_r0x0012ed00:
  *(short *)(unaff_x19 + 0x212) = unaff_w26;
  *(undefined2 *)(unaff_x19 + 0x7a) = *(undefined2 *)(unaff_x19 + 0x78);
  do {
    *(short *)(unaff_x19 + 0x20c) = unaff_w26;
    func_0x000d7420(4);
    do {
      do {
        do {
          unaff_x21 = unaff_x21 + 1;
          if ((long)*(int *)(unaff_x19 + 0x6c) <= (long)unaff_x21) {
            return;
          }
        } while ((*(uint *)(*(long *)(unaff_x19 + 0x48) + (unaff_x21 >> 5 & 0x7ffffff) * 4) >>
                  (ulong)((uint)unaff_x21 & 0x1f) & 1) == 0);
        unaff_w26 = *(short *)(*(long *)(unaff_x19 + 0x28) + unaff_x21 * 2);
        lVar3 = *(long *)(unaff_x19 + 0x18);
      } while ((((*(uint *)(lVar3 + (long)(int)unaff_w26 * (long)unaff_w24) & unaff_w25) != 0) ||
               (((*(uint *)(unaff_x19 + 4) >> 0xb & 1) != 0 &&
                (*(char *)(unaff_x19 + 0x23a) == '\0')))) ||
              ((iVar4 = (int)unaff_w26,
               *(char *)(lVar3 + (long)iVar4 * (long)unaff_w24 + 0x65) == '\0' &&
               (*(short *)(unaff_x19 + 0x214) != unaff_w26))));
      piVar2 = unaff_x22;
      if (*(short *)(unaff_x19 + 0x78) != 0) {
        piVar2 = (int *)(*(long *)(unaff_x19 + 0x1c8) +
                         (long)(int)*(short *)(unaff_x19 + 0x78) * (long)unaff_w28 + -0x18);
      }
      iVar1 = iVar4 + *piVar2 + 1;
      in_stack_00000018 = *(float *)(lVar3 + (long)iVar4 * (long)unaff_w24 + 0xc);
      uStack0000000000000010 = in_stack_00000018 + unaff_s11;
      in_stack_00000018 = in_stack_00000018 + unaff_s12;
      func_0x000d0e24(&uStack0000000000000010,iVar1,0,8);
      uStack0000000000000008._6_2_ = 0;
      iVar1 = func_0x0010b53c(&uStack0000000000000010,iVar1,(long)&uStack0000000000000008 + 7,
                              (long)&uStack0000000000000008 + 6,&UNK_00040910);
      if ((iVar1 == 0) || (iVar1 = func_0x000d7098(0), iVar1 == 0)) {
        if (uStack0000000000000008._6_1_ != '\0') {
          if (*(short *)(unaff_x19 + 0x214) != -1) goto code_r0x0012ed00;
          param_1 = (long)*(short *)(unaff_x19 + 0x21e);
          if (param_1 != -1) goto code_r0x0012ee58;
          uVar5 = 0xff7fffff;
          goto LAB_0012ecfc;
        }
      }
      else {
        if (*(char *)(*(long *)(unaff_x19 + 0x18) + (long)iVar4 * (long)unaff_w24 + 0x62) != '\0') {
          *(undefined1 *)
           (*(long *)(unaff_x19 + 0x18) + (long)(int)unaff_w26 * (long)unaff_w24 + 0x6c) = 1;
          *(short *)(unaff_x19 + 0x210) = unaff_w26;
        }
        func_0x000c24fc();
        uStack0000000000000008._6_2_ = uStack0000000000000008._6_2_ & 0xff00;
      }
    } while ((uStack0000000000000008._7_1_ == '\0') || (*unaff_x23 <= 0.06));
  } while( true );
}

