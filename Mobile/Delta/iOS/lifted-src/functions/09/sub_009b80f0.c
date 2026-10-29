/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b80f0..0x9b83c8 (728 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b80f0_1 {
    char padding_0[8];
    struct st_9b80f0_2 *field_8;
    char padding_10[2160];
    struct st_9b80f0_0 *field_880;
} st_9b80f0_1;

typedef struct st_9b80f0_0 {
    char padding_0[32];
    void* field_20;
} st_9b80f0_0;

typedef struct st_9b80f0_2 {
    long long field_0;
} st_9b80f0_2;

extern char g_10002b0;

long long sub_9b80f0(st_9b80f0_1 *a0, long long *a1)
{
    st_9b80f0_1 *v6;  // x19
    unsigned long long v7;  // x0
    long long v8;  // x2
    unsigned long v9;  // x20
    unsigned long v10;  // x19
    long long v11;  // x1
    long long v12;  // x2
    long long v13;  // x1
    unsigned long v0;  // [bp-0x80]
    char v1;  // [bp-0x78]
    char v2;  // [bp-0x58]
    unsigned long v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = a0;
    v3 = *(long long *)&g_10002b0;
    v0 = 32;
    v7 = sub_9ac420();
    if ((unsigned int)v7)
    {
        if ((int)sub_9ac444(v6, &v2) <= 0)
        {
            sub_a368c8();
            sub_a369bc("ssl/statem/statem_srvr.c", 3376, "tls_process_cke_gost18");
            v8 = 786691;
            goto LABEL_9b8270;
        }
        else if ((long long)v6->field_880->field_20[248] || (long long)v6->field_880->field_20[208])
        {
            v9 = sub_a5d5a8(*(long long *)v6->field_8);
            if (!v9)
            {
                sub_a368c8();
                sub_a369bc("ssl/statem/statem_srvr.c", 3389, "tls_process_cke_gost18");
                v11 = 80;
                v12 = 524294;
            }
            else if ((int)sub_a37fa8(v9) > 0)
            {
                if ((int)sub_a5e1f4(v9, 0xffffffff, 0x400, 8, 32, &v2) <= 0)
                {
                    sub_a368c8();
                    v13 = 3401;
                    goto LABEL_9b8344;
                }
                if ((int)sub_a5e1f4(v9, 0xffffffff, 0x400, 12, v7, 0) <= 0)
                {
                    sub_a368c8();
                    v13 = 3408;
LABEL_9b8344:
                    sub_a369bc("ssl/statem/statem_srvr.c", v13, "tls_process_cke_gost18");
                    v11 = 80;
                    v12 = 274;
                }
                else if ((int)sub_a37fb4(v9, &v1, &v0, *a1, a1[1]) > 0)
                {
                    v10 = sub_9568f8(v6, &v1, v0, 0) != 0;
                    goto LABEL_9b8360;
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("ssl/statem/statem_srvr.c", 3415, "tls_process_cke_gost18");
                    v11 = 50;
                    v12 = 147;
                }
            }
            else
            {
                sub_a368c8();
                sub_a369bc("ssl/statem/statem_srvr.c", 3393, "tls_process_cke_gost18");
                v11 = 80;
                v12 = 786691;
            }
            sub_9a58a4(v6, v11, v12, 0);
            v10 = 0;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("ssl/statem/statem_srvr.c", 3383, "tls_process_cke_gost18");
            v8 = 236;
LABEL_9b8270:
            sub_9a58a4(v6, 80, v8, 0);
            v10 = 0;
            v9 = 0;
        }
LABEL_9b8360:
        sub_a5d6b0(v9);
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_srvr.c", 3371, "tls_process_cke_gost18");
        sub_9a58a4(v6, 80, 0xc0103, 0);
        v10 = 0;
    }
    if (*(long long *)&g_10002b0 == v3)
        return v10;
    ___stack_chk_fail();
}
