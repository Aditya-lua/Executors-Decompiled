
void FUN_0071efec(long param_1,undefined1 param_2 [16])

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  long lVar3;
  char cVar4;
  long in_x9;
  long in_x10;
  long in_x11;
  long in_x12;
  long in_x13;
  undefined1 in_w14;
  undefined8 *in_x15;
  undefined8 uVar5;
  undefined8 uVar6;
  long *in_stack_00000088;
  long in_stack_00000090;
  
  uVar6 = param_2._8_8_;
  uVar5 = param_2._0_8_;
  do {
    in_x15[1] = uVar6;
    *in_x15 = uVar5;
    *(undefined1 *)(in_x15 + 3) = in_w14;
    while( true ) {
      while( true ) {
        in_x9 = in_x9 + 0x20;
        in_x12 = in_x12 + -0x20;
        in_x13 = in_x13 + 0x20;
        if (in_x13 + in_x11 == in_x10) {
          *(long *)(param_1 + 8) = in_x11 - in_x12;
          lVar3 = *in_stack_00000088 + in_stack_00000090 * 8;
          if (lVar3 != in_stack_00000088[1]) {
            in_stack_00000088[1] = lVar3;
          }
          return;
        }
        in_x15 = (undefined8 *)(in_x9 + in_x11);
        puVar1 = (undefined8 *)(in_x13 + in_x11);
        cVar4 = *(char *)(in_x15 + 3);
        if (cVar4 != *(char *)(puVar1 + 3)) break;
        if (cVar4 != '\0') {
          puVar1 = (undefined8 *)(in_x13 + in_x11);
          puVar2 = (undefined8 *)(in_x9 + in_x11);
          *puVar2 = *puVar1;
          uVar5 = puVar1[1];
          puVar2[2] = puVar1[2];
          puVar2[1] = uVar5;
        }
      }
      if (cVar4 == '\0') break;
      *(undefined1 *)(in_x15 + 3) = 0;
    }
    uVar6 = puVar1[1];
    uVar5 = *puVar1;
    in_x15[2] = puVar1[2];
  } while( true );
}

