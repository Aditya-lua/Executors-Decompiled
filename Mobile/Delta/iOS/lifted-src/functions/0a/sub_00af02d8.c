/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf02d8..0xaf04ec (532 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_af02d8(void* a0, unsigned long long a1)
{
    char *v8;  // x0
    long long v9;  // x1
    unsigned long v18;  // x8
    unsigned long long v19;  // x0
    long long v20;  // x20
    unsigned int v21;  // w21
    unsigned long v22;  // x8
    unsigned long long v23;  // x0
    long long v24;  // x20
    unsigned int v25;  // w21
    unsigned long v26;  // x8
    unsigned long long v27;  // x0
    unsigned long v10;  // x8
    long long v28;  // x20
    unsigned int v29;  // w21
    unsigned long v30;  // x8
    unsigned long long v31;  // x0
    long long v32;  // x20
    unsigned int v33;  // w21
    unsigned long v34;  // x8
    unsigned long long v35;  // x0
    unsigned long v36;  // x9
    unsigned long long v37;  // x0
    unsigned long long v11;  // x0
    char *v12;  // x20
    unsigned int v13;  // w21
    unsigned long v14;  // x8
    unsigned long long v15;  // x0
    long long v16;  // x20
    unsigned int v17;  // w21
    unsigned long long v0;  // [bp-0x80], Other Possible Types: unsigned long
    unsigned long v1;  // [bp-0x78]
    unsigned long v2;  // [bp-0x70]
    unsigned long v3;  // [bp-0x68]
    char v4;  // [bp-0x60]
    unsigned long v5;  // [bp-0x38]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    if ((unsigned int)a1 != 16)
    {
        if ((unsigned int)a1 == 4)
        {
            v2 = (char)a0[2];
            v3 = (char)a0[3];
            v0 = *(char *)a0;
            v1 = (char)a0[1];
        }
        else
        {
            v0 = a1;
        }
        v8 = &v4;
        v9 = 40;
        goto LABEL_af04a4;
    }
    else
    {
        v10 = *(short *)a0;
        v0 = (unsigned int)((v10 & 0xff00) >> 8) | (unsigned int)v10 * 0x100 & 0xff00ff00;
        v11 = sub_9d5b44(&v4, 40, "%X:");
        if (!(v11 >> 31 & 1))
        {
            v12 = &(&v4)[v11 & 0xffffffff];
            v13 = 40 - v11;
            v14 = (short)a0[2];
            v0 = (unsigned int)((v14 & 0xff00) >> 8) | (unsigned int)v14 * 0x100 & 0xff00ff00;
            v15 = sub_9d5b44(v12, v13, "%X:");
            if (!(v15 >> 31 & 1))
            {
                v16 = &v12[v15 & 0xffffffff];
                v17 = v13 - v15;
                v18 = (short)a0[4];
                v0 = (unsigned int)((v18 & 0xff00) >> 8) | (unsigned int)v18 * 0x100 & 0xff00ff00;
                v19 = sub_9d5b44(v16, v17, "%X:");
                if (!(v19 >> 31 & 1))
                {
                    v20 = v16 + (v19 & 0xffffffff);
                    v21 = v17 - v19;
                    v22 = (short)a0[6];
                    v0 = (unsigned int)((v22 & 0xff00) >> 8) | (unsigned int)v22 * 0x100 & 0xff00ff00;
                    v23 = sub_9d5b44(v20, v21, "%X:");
                    if (!(v23 >> 31 & 1))
                    {
                        v24 = v20 + (v23 & 0xffffffff);
                        v25 = v21 - v23;
                        v26 = (short)a0[8];
                        v0 = (unsigned int)((v26 & 0xff00) >> 8) | (unsigned int)v26 * 0x100 & 0xff00ff00;
                        v27 = sub_9d5b44(v24, v25, "%X:");
                        if (!(v27 >> 31 & 1))
                        {
                            v28 = v24 + (v27 & 0xffffffff);
                            v29 = v25 - v27;
                            v30 = (short)a0[10];
                            v0 = (unsigned int)((v30 & 0xff00) >> 8) | (unsigned int)v30 * 0x100 & 0xff00ff00;
                            v31 = sub_9d5b44(v28, v29, "%X:");
                            if (!(v31 >> 31 & 1))
                            {
                                v32 = v28 + (v31 & 0xffffffff);
                                v33 = v29 - v31;
                                v34 = (short)a0[12];
                                v0 = (unsigned int)((v34 & 0xff00) >> 8) | (unsigned int)v34 * 0x100 & 0xff00ff00;
                                v35 = sub_9d5b44(v32, v33, "%X:");
                                if (!(v35 >> 31 & 1))
                                {
                                    v9 = (int)(v33 - v35);
                                    v36 = (short)a0[14];
                                    v0 = (unsigned int)((v36 & 0xff00) >> 8) | (unsigned int)v36 * 0x100 & 0xff00ff00;
                                    v8 = v32 + (v35 & 0xffffffff);
LABEL_af04a4:
                                    sub_9d5b44(v8, v9);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    v37 = sub_a6d9b4(&v4, "crypto/x509/v3_utl.c", 1087);
    if (*(long long *)&g_10002b0 == v5)
        return v37;
    ___stack_chk_fail();
}
