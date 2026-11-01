
undefined8 FUN_005aa730(ulong param_1)

{
  int iVar1;
  ulong uVar2;
  undefined8 uVar3;
  long *unaff_x19;
  long *plVar4;
  long *unaff_x20;
  ulong unaff_x22;
  undefined8 *puVar5;
  long unaff_x25;
  long unaff_x26;
  long unaff_x27;
  ulong unaff_x28;
  
  do {
    if (((param_1 & 1) != 0) ||
       (uVar2 = (**(code **)(((undefined8 *)*unaff_x19)[1] + 0x18))
                          (*(undefined8 *)*unaff_x19,&UNK_008aed9c,4), (uVar2 & 1) != 0)) {
      return 1;
    }
    do {
      uVar2 = func_0x005ab01c();
      if ((uVar2 & 1) != 0) {
        return 1;
      }
      plVar4 = unaff_x20;
      if (unaff_x25 != 0) {
        puVar5 = (undefined8 *)*unaff_x19;
        uVar2 = (**(code **)(puVar5[1] + 0x18))(*puVar5,&UNK_008aecac,1);
        if ((uVar2 & 1) != 0) {
          return 1;
        }
        uVar2 = func_0x0046849c(*puVar5,puVar5[1]);
        goto joined_r0x005aa7cc;
      }
      while( true ) {
        unaff_x20 = plVar4 + 0x10;
        unaff_x25 = unaff_x25 + -1;
        unaff_x27 = unaff_x27 + -0x80;
        if ((unaff_x27 == 0) || (unaff_x20 == (long *)0x0)) {
          puVar5 = (undefined8 *)*unaff_x19;
          unaff_x19[1] = unaff_x19[1] + -1;
          if ((unaff_x22 & 1) == 0) {
            if ((unaff_x26 != 0) &&
               (uVar2 = (**(code **)(puVar5[1] + 0x18))(*puVar5,&UNK_008aec74,1), (uVar2 & 1) != 0))
            {
              return 1;
            }
          }
          else {
            uVar2 = (**(code **)(puVar5[1] + 0x18))(*puVar5,&UNK_008aec7a,1);
            if ((uVar2 & 1) != 0) {
              return 1;
            }
            iVar1 = func_0x005a9610((char)unaff_x19[2],*(undefined1 *)((long)unaff_x19 + 0x11));
            if (iVar1 != 0) {
              return 1;
            }
          }
          uVar3 = (**(code **)(puVar5[1] + 0x18))(*puVar5,&UNK_008aecaa,1);
          return uVar3;
        }
        if (((unaff_x22 & 1) != 0) &&
           (uVar2 = func_0x005a9610((char)unaff_x19[2],*(undefined1 *)((long)unaff_x19 + 0x11)),
           (uVar2 & 1) != 0)) {
          return 1;
        }
        if ((unaff_x25 != 0) || (*unaff_x20 != 0xc)) break;
        if (plVar4[0x18] == 0xb) {
          uVar2 = (**(code **)(((undefined8 *)*unaff_x19)[1] + 0x18))
                            (*(undefined8 *)*unaff_x19,&UNK_008aec78,1);
          if ((uVar2 & 1) != 0) {
            return 1;
          }
          uVar2 = func_0x005ab01c();
          if ((uVar2 & 1) != 0) {
            return 1;
          }
          uVar2 = (**(code **)(((undefined8 *)*unaff_x19)[1] + 0x18))
                            (*(undefined8 *)*unaff_x19,&UNK_008aec79,1);
joined_r0x005aa7cc:
          plVar4 = unaff_x20;
          if ((uVar2 & 1) != 0) {
            return 1;
          }
        }
        else {
          uVar2 = func_0x005ab01c();
          plVar4 = unaff_x20;
          if ((uVar2 & 1) != 0) {
            return 1;
          }
        }
      }
    } while (((unaff_x28 & 1) != 0) || (*unaff_x20 == 0xc));
    uVar2 = (**(code **)(((undefined8 *)*unaff_x19)[1] + 0x18))
                      (*(undefined8 *)*unaff_x19,&UNK_008aecab,1);
    if ((uVar2 & 1) != 0) {
      return 1;
    }
    param_1 = func_0x005ab01c();
  } while( true );
}

