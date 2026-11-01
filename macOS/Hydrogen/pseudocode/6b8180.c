
void FUN_006b8180(long param_1)

{
  long lVar1;
  uint *in_x9;
  uint *puVar2;
  undefined8 uVar3;
  uint *in_x10;
  undefined8 *puVar4;
  long lVar5;
  uint *unaff_x19;
  undefined8 *unaff_x20;
  
  do {
    puVar2 = in_x9;
    if (puVar2 == unaff_x19) {
      return;
    }
    if (in_x10[2] < *in_x10) {
      uVar3 = *(undefined8 *)puVar2;
      lVar1 = param_1;
      do {
        lVar5 = lVar1;
        puVar4 = (undefined8 *)((long)unaff_x20 + lVar5);
        puVar4[1] = *puVar4;
        if (lVar5 == 0) {
          puVar4 = unaff_x20;
          goto LAB_006b8174;
        }
        lVar1 = lVar5 + -8;
      } while ((uint)uVar3 < *(uint *)(puVar4 + -1));
      puVar4 = (undefined8 *)((long)unaff_x20 + lVar5);
LAB_006b8174:
      *puVar4 = uVar3;
    }
    param_1 = param_1 + 8;
    in_x9 = puVar2 + 2;
    in_x10 = puVar2;
  } while( true );
}

