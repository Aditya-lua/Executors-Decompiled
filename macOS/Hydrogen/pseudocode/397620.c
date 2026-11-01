
/* WARNING: Control flow encountered bad instruction data */

void FUN_00397620(void)

{
  undefined2 *in_x4;
  undefined8 in_x9;
  undefined2 unaff_h8;
  undefined2 unaff_00005102;
  undefined2 unaff_00005104;
  undefined2 unaff_00005106;
  undefined2 in_register_00005108;
  undefined2 in_register_0000510a;
  undefined2 in_register_0000510c;
  undefined2 in_register_0000510e;
  undefined2 unaff_h9;
  undefined2 unaff_00005122;
  undefined2 unaff_00005124;
  undefined2 unaff_00005126;
  undefined2 in_register_00005128;
  undefined2 in_register_0000512a;
  undefined2 in_register_0000512c;
  undefined2 in_register_0000512e;
  undefined1 in_z19 [32];
  undefined1 in_z20 [32];
  undefined4 in_p4;
  
  *in_x4 = unaff_h8;
  in_x4[1] = unaff_00005102;
  in_x4[2] = unaff_00005104;
  in_x4[3] = unaff_00005106;
  in_x4[4] = in_register_00005108;
  in_x4[5] = in_register_0000510a;
  in_x4[6] = in_register_0000510c;
  in_x4[7] = in_register_0000510e;
  in_x4[8] = unaff_h9;
  in_x4[9] = unaff_00005122;
  in_x4[10] = unaff_00005124;
  in_x4[0xb] = unaff_00005126;
  in_x4[0xc] = in_register_00005128;
  in_x4[0xd] = in_register_0000512a;
  in_x4[0xe] = in_register_0000512c;
  in_x4[0xf] = in_register_0000512e;
  SVE_ldff1h(in_z19,in_p4,in_x9,in_z20,0);
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}

