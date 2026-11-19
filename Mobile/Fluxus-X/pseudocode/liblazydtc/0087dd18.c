/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0087dd18
 */

void FUN_0087dd18(undefined8 *param_1,char *param_2)

{
  char cVar1;
  int iVar2;
  undefined8 uVar3;
  
  if (param_2 == (char *)0x0) {
LAB_0087ddc8:
    param_1[4] = 0;
    param_1[1] = 0;
    *param_1 = 0;
    param_1[3] = 0;
    param_1[2] = 0;
  }
  else {
    cVar1 = *param_2;
    if (((cVar1 == 'p') && (param_2[1] == 'i')) && (param_2[2] == '\0')) {
      *(undefined4 *)((long)param_1 + 0x24) = 0;
      *(undefined4 *)param_1 = 3;
      uVar3 = 0x400921fb54442d18;
      *(undefined8 *)((long)param_1 + 0xc) = 0;
      *(undefined8 *)((long)param_1 + 4) = 0;
    }
    else {
      iVar2 = strcmp(param_2,"huge");
      if (iVar2 == 0) {
        *(undefined4 *)((long)param_1 + 0x24) = 0;
        *(undefined4 *)param_1 = 3;
        uVar3 = 0x7ff0000000000000;
        *(undefined8 *)((long)param_1 + 0xc) = 0;
        *(undefined8 *)((long)param_1 + 4) = 0;
      }
      else {
        iVar2 = strcmp(param_2,"nan");
        if (iVar2 == 0) {
          *(undefined4 *)((long)param_1 + 0x24) = 0;
          *(undefined4 *)param_1 = 3;
          uVar3 = 0x7ff8000000000000;
          *(undefined8 *)((long)param_1 + 0xc) = 0;
          *(undefined8 *)((long)param_1 + 4) = 0;
        }
        else if ((cVar1 == 'e') && (param_2[1] == '\0')) {
          *(undefined4 *)((long)param_1 + 0x24) = 0;
          *(undefined4 *)param_1 = 3;
          *(undefined8 *)((long)param_1 + 0xc) = 0;
          *(undefined8 *)((long)param_1 + 4) = 0;
          uVar3 = 0x4005bf0a8b145769;
        }
        else {
          iVar2 = strcmp(param_2,"phi");
          if (iVar2 == 0) {
            *(undefined4 *)((long)param_1 + 0x24) = 0;
            *(undefined4 *)param_1 = 3;
            *(undefined8 *)((long)param_1 + 0xc) = 0;
            *(undefined8 *)((long)param_1 + 4) = 0;
            uVar3 = 0x3ff9e3779b97f4a8;
          }
          else {
            iVar2 = strcmp(param_2,"sqrt2");
            if (iVar2 == 0) {
              *(undefined4 *)((long)param_1 + 0x24) = 0;
              *(undefined4 *)param_1 = 3;
              *(undefined8 *)((long)param_1 + 0xc) = 0;
              *(undefined8 *)((long)param_1 + 4) = 0;
              uVar3 = 0x3ff6a09e667f3bcd;
            }
            else {
              iVar2 = strcmp(param_2,"tau");
              if (iVar2 != 0) goto LAB_0087ddc8;
              *(undefined4 *)((long)param_1 + 0x24) = 0;
              *(undefined4 *)param_1 = 3;
              *(undefined8 *)((long)param_1 + 0xc) = 0;
              *(undefined8 *)((long)param_1 + 4) = 0;
              uVar3 = 0x401921fb54442d18;
            }
          }
        }
      }
    }
    *(undefined8 *)((long)param_1 + 0x1c) = 0;
    *(undefined8 *)((long)param_1 + 0x14) = 0;
    param_1[1] = uVar3;
  }
  return;
}

