
void FUN_0006c96c(long param_1)

{
  long *plVar1;
  long lVar2;
  ulong uVar3;
  long *plVar4;
  long in_x9;
  long *in_x10;
  long *in_x11;
  long *in_x12;
  int in_w13;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  
code_r0x0006c96c:
  if (-1 < in_w13) goto LAB_0006c93c;
  do {
    in_x12 = (long *)*in_x10;
LAB_0006c93c:
    do {
      *(undefined1 *)((long)in_x12 + in_x9) =
           *(undefined1 *)((long)in_x11 + in_x9 + *(long *)(unaff_x20 + 0x100));
      in_x9 = in_x9 + 1;
      if (param_1 == in_x9) {
        *(undefined8 *)(unaff_x20 + 0x100) = 0;
        *(long *)(unaff_x20 + 0x108) = param_1;
        plVar1 = (long *)(unaff_x20 + 0xe8);
        if ((char)*(byte *)(unaff_x20 + 0xff) < '\0') {
          uVar3 = *(ulong *)(unaff_x20 + 0xf0);
        }
        else {
          uVar3 = (ulong)*(byte *)(unaff_x20 + 0xff);
        }
        if (uVar3 < (ulong)(param_1 + unaff_x19)) {
          __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEmc
                    (plVar1,(param_1 + unaff_x19) - uVar3,0);
        }
        if (unaff_x19 != 0) {
          lVar2 = 0;
          do {
            plVar4 = plVar1;
            if (*(char *)(unaff_x20 + 0xff) < '\0') {
              plVar4 = (long *)*plVar1;
            }
            *(undefined1 *)((long)plVar4 + lVar2 + *(long *)(unaff_x20 + 0x108)) =
                 *(undefined1 *)(unaff_x21 + lVar2);
            lVar2 = lVar2 + 1;
          } while (unaff_x19 != lVar2);
        }
        *(long *)(unaff_x20 + 0x108) = *(long *)(unaff_x20 + 0x108) + unaff_x19;
        return;
      }
      in_x12 = in_x10;
      if (-1 < *(char *)(unaff_x20 + 0xff)) {
        in_w13 = (int)*(char *)(unaff_x20 + 0xff);
        in_x11 = in_x10;
        goto code_r0x0006c96c;
      }
      in_x11 = (long *)*in_x10;
    } while (-1 < *(char *)(unaff_x20 + 0xff));
  } while( true );
}

