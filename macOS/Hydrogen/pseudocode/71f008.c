
void FUN_0071f008(long param_1)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  long lVar3;
  char cVar4;
  undefined1 in_ZR;
  long in_x9;
  long in_x10;
  long in_x11;
  long in_x12;
  long in_x13;
  undefined1 in_w14;
  undefined8 uVar5;
  undefined8 uVar6;
  long *in_stack_00000088;
  long in_stack_00000090;
  
  while (!(bool)in_ZR) {
    puVar1 = (undefined8 *)(in_x9 + in_x11);
    puVar2 = (undefined8 *)(in_x13 + in_x11);
    cVar4 = *(char *)(puVar1 + 3);
    if (cVar4 == *(char *)(puVar2 + 3)) {
      if (cVar4 != '\0') {
        puVar1 = (undefined8 *)(in_x13 + in_x11);
        puVar2 = (undefined8 *)(in_x9 + in_x11);
        *puVar2 = *puVar1;
        uVar5 = puVar1[1];
        puVar2[2] = puVar1[2];
        puVar2[1] = uVar5;
      }
    }
    else if (cVar4 == '\0') {
      uVar6 = puVar2[1];
      uVar5 = *puVar2;
      puVar1[2] = puVar2[2];
      puVar1[1] = uVar6;
      *puVar1 = uVar5;
      *(undefined1 *)(puVar1 + 3) = in_w14;
    }
    else {
      *(undefined1 *)(puVar1 + 3) = 0;
    }
    in_x9 = in_x9 + 0x20;
    in_x12 = in_x12 + -0x20;
    in_x13 = in_x13 + 0x20;
    in_ZR = in_x13 + in_x11 == in_x10;
  }
  *(long *)(param_1 + 8) = in_x11 - in_x12;
  lVar3 = *in_stack_00000088 + in_stack_00000090 * 8;
  if (lVar3 != in_stack_00000088[1]) {
    in_stack_00000088[1] = lVar3;
  }
  return;
}

