/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x981d40..0x981ea8 (360 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_981d40_0 {
    char padding_0[56];
    long long field_38;
} st_981d40_0;

extern char g_10002b0;

unsigned long long sub_981d40(st_981d40_0 *a0, unsigned long long a1, void* a2)
{
    unsigned long long v22;  // x0
    char v0;  // [bp-0x500]
    unsigned int v1;  // [bp-0x4f4]
    char v2;  // [bp-0x4f0]
    double v3;  // [bp-0x4b8]
    uint128_t v4;  // [bp-0x4b0]
    unsigned long v5;  // [bp-0x4a3]
    uint128_t v6;  // [bp-0x49b]
    unsigned long v7;  // [bp-0x48e]
    long long v8;  // [bp-0x488]
    long long v9;  // [bp-0x480]
    long long v10;  // [bp-0x478]
    long long v11;  // [bp-0x470]
    char *v12;  // [bp-0x468]
    char v13;  // [bp-0x460]
    char *v14;  // [bp-0x60]
    char v15;  // [bp-0x58]
    unsigned long long v16;  // [bp-0x50]
    long long v17;  // [bp-0x48]
    long long v18;  // [bp-0x40]
    unsigned long v19;  // [bp-0x38]
    char *v20;  // [bp-0x10]
    char v21;  // [bp+0x0]

    v20 = &v21;
    v19 = *(long long *)&g_10002b0;
    v4 = (int128_t)a2[29];
    v5 = (long long)a2[42];
    v8 = 0;
    v9 = 0;
    v7 = (long long)a2[21];
    v6 = (int128_t)a2[8];
    v1 = 1;
    v3 = 3e-323;
    v10 = 0;
    v11 = 4;
    v12 = &v1;
    v14 = &v13;
    v16 = a1;
    v17 = 0;
    v18 = 0;
    v22 = sub_c68800(&v2, &v13, 0x400, 0);
    if ((unsigned int)v22)
    {
        v22 = sub_c639ec(&v2, (char)a2[8], &v3, 0);
        if ((unsigned int)v22)
        {
            v22 = sub_c68d5c(&v2, v1, 4);
            if ((unsigned int)v22)
            {
                v22 = sub_c68eb8(&v2, &v15);
                if ((unsigned int)v22)
                {
                    v22 = sub_a6eaf8(&v2);
                    if ((unsigned int)v22)
                    {
                        v22 = sub_9d427c(a0->field_38, &v14, 40, 1, 0, &v0);
                        if (!(unsigned int)v22)
                        {
                            sub_a368c8();
                            sub_a369bc("ssl/quic/quic_port.c", 1299, "port_send_version_negotiation");
                            v22 = sub_a36abc(20, 387, "port version negotiation send failed");
                        }
                    }
                }
            }
        }
    }
    if (*(long long *)&g_10002b0 == v19)
        return v22;
    ___stack_chk_fail();
}
