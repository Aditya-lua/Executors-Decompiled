
void FUN_0013422c(void)

{
  byte bVar1;
  undefined8 uVar2;
  short sVar3;
  int *unaff_x19;
  int iVar4;
  int *unaff_x22;
  uint unaff_w26;
  byte *pbVar5;
  int *in_stack_00000018;
  long in_stack_00000028;
  
  do {
    func_0x000ba738();
    do {
      sVar3 = (short)unaff_x22[3];
      if (0 < sVar3) {
        iVar4 = 0;
        pbVar5 = (byte *)((long)unaff_x22 + 0x22);
        do {
          if (((unaff_w26 >> 3 & 1) == 0) || ((unaff_w26 & 7) != 0 || *(int *)(pbVar5 + -10) != 0))
          {
            if ((unaff_w26 & 7) != 0 || *(int *)(pbVar5 + -10) != 0) goto LAB_0013429c;
          }
          else if (*(short *)(pbVar5 + -2) != -1) {
LAB_0013429c:
            func_0x000ba738();
            if (*(int *)(pbVar5 + -10) != 0) {
              func_0x000ba738();
            }
            if ((unaff_w26 & 1) != 0) {
              bVar1 = *pbVar5;
              if ((bVar1 >> 3 & 1) != 0) {
                func_0x000ba738();
                bVar1 = *pbVar5;
              }
              if ((bVar1 >> 3 & 1) == 0) {
                func_0x000ba738();
              }
            }
            if ((unaff_w26 >> 2 & 1) != 0) {
              func_0x000ba738();
            }
            if ((unaff_w26 >> 1 & 1) != 0) {
              func_0x000ba738();
            }
            if (((unaff_w26 >> 3 & 1) != 0) && (*(short *)(pbVar5 + -2) != -1)) {
              func_0x000ba738();
            }
            func_0x000ba48c();
            sVar3 = (short)unaff_x22[3];
          }
          iVar4 = iVar4 + 1;
          pbVar5 = pbVar5 + 0x10;
        } while (iVar4 < sVar3);
      }
      func_0x000ba48c();
      do {
        unaff_x22 = (int *)((long)unaff_x22 + (long)unaff_x22[-1]);
        if (unaff_x22 ==
            (int *)(*(long *)(&UNK_00005f98 + in_stack_00000028) + (long)*in_stack_00000018 + 4)) {
          return;
        }
      } while ((*unaff_x22 == 0) || (unaff_w26 = unaff_x22[1], (unaff_w26 & 0xf) == 0));
      iVar4 = 0;
      if (*unaff_x19 != 0) {
        iVar4 = *unaff_x19 + -1;
      }
      iVar4 = iVar4 + (short)unaff_x22[3] * 0x32 + 0x1e;
      if (unaff_x19[1] < iVar4) {
        uVar2 = func_0x000b810c((long)iVar4);
        if (*(long *)(unaff_x19 + 2) != 0) {
          _memcpy(uVar2,*(long *)(unaff_x19 + 2),(long)*unaff_x19);
          func_0x000b83d4(*(undefined8 *)(unaff_x19 + 2));
        }
        *(undefined8 *)(unaff_x19 + 2) = uVar2;
        unaff_x19[1] = iVar4;
      }
      func_0x000ba738();
    } while ((float)unaff_x22[2] == 0.0);
  } while( true );
}

