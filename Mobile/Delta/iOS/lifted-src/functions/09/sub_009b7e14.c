/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b7e14..0x9b80f0 (732 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b7e14_0 {
    unsigned long long field_0;
    long long field_8;
} st_9b7e14_0;

typedef struct st_9b7e14_2 {
    char padding_0[208];
    unsigned long long field_d0;
} st_9b7e14_2;

typedef struct st_9b7e14_4 {
    char padding_0[8];
    struct st_9b7e14_5 *field_8;
    char padding_10[752];
    struct st_9b7e14_1 *field_300;
    char padding_308[1400];
    struct st_9b7e14_3 *field_880;
} st_9b7e14_4;

typedef struct st_9b7e14_1 {
    char padding_0[32];
    unsigned int field_20;
} st_9b7e14_1;

typedef struct st_9b7e14_3 {
    char padding_0[32];
    struct st_9b7e14_2 *field_20;
} st_9b7e14_3;

typedef struct st_9b7e14_5 {
    long long field_0;
} st_9b7e14_5;

extern long long g_e89610;
extern char g_10002b0;

unsigned long long sub_9b7e14(st_9b7e14_4 *a0, st_9b7e14_0 *a1)
{
    unsigned long v6;  // x9
    unsigned long long v7;  // x0
    long long v16;  // x1
    st_9b7e14_4 *v17;  // x0
    long long v18;  // x1
    unsigned long long v8;  // x19
    unsigned long long v9;  // x0
    unsigned long long v10;  // x21
    long long v11;  // x11
    long long v12;  // x10
    long long v13;  // x1
    unsigned long long v14;  // 4114
    unsigned long long v15;  // x22
    unsigned long v0;  // [bp-0x68]
    unsigned long v1;  // [bp-0x60]
    char v2;  // [bp-0x58]
    unsigned long v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *(long long *)&g_10002b0;
    v1 = 32;
    v6 = a0->field_300->field_20;
    if (!(v6 >> 7 & 1))
    {
        if (v6 >> 5 & 1)
LABEL_9b7e80:
    }
    else
    {
        if (!*(long long *)&a0->field_880->field_20[1].padding_0[32] && !a0->field_880->field_20->field_d0)
            goto LABEL_9b7e80;
    }
    v7 = sub_a5d5a8(*(long long *)a0->field_8);
    if (v7)
    {
        v8 = v7;
        if ((int)sub_a37fa8() > 0)
        {
            v9 = sub_9af2b4(a0);
            if (v9 && 0 >= (int)sub_a532b8(v8, v9))
                sub_a35af4();
            v0 = a1->field_0;
            v10 = sub_9cae2c(0, &v0, a1->field_8, &g_e89610);
            if (!v10 || !*(long long *)v10 || sub_9c5344(*(long long *)v10) != 16)
            {
                sub_a368c8();
                v16 = 3311;
                goto LABEL_9b7f8c;
            }
            v11 = a1->field_8;
            v12 = v0 - a1->field_0;
            if ((unsigned long long)v12 > (unsigned long long)v11)
            {
                sub_a368c8();
                v13 = 3316;
                goto LABEL_9b80c0;
            }
            a1->field_0 = a1->field_0 + v12;
            a1->field_8 = v11 - v12;
            v14 = arm64g_calculate_condition(20, v11, v12, 0);
            if (!(v14 & 1))
            {
                if ((int)sub_a37fb4(v8, &v2, &v1, *(long long *)(*(long long *)(*(long long *)v10 + 8) + 8), *(int *)*(long long *)(*(long long *)v10 + 8)) <= 0)
                {
                    sub_a368c8();
                    v16 = 3331;
LABEL_9b7f8c:
                    sub_a369bc("ssl/statem/statem_srvr.c", v16, "tls_process_cke_gost");
                    v17 = a0;
                    v18 = 50;
                    goto LABEL_9b7f98;
                }
                if (!sub_9568f8(a0, &v2, v1, 0))
                    goto LABEL_9b7fe0;
                v15 = 1;
                if ((int)sub_a5e1f4(v8, 0xffffffff, 0xffffffff, 2, 2, 0) >= 1)
                    *(unsigned int *)&a0->padding_10[180] = 1;
            }
            else
            {
                sub_a368c8();
                v13 = 3321;
LABEL_9b80c0:
                sub_a369bc("ssl/statem/statem_srvr.c", v13, "tls_process_cke_gost");
                v17 = a0;
                v18 = 80;
LABEL_9b7f98:
                sub_9a58a4(v17, v18, 147, 0);
LABEL_9b7fe0:
                v15 = 0;
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("ssl/statem/statem_srvr.c", 3289, "tls_process_cke_gost");
            sub_9a58a4(a0, 80, 0xc0103, 0);
            v10 = 0;
            goto LABEL_9b7fe0;
        }
        sub_a5d6b0(v8);
        sub_9cd960(v10, &g_e89610);
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_srvr.c", 3285, "tls_process_cke_gost");
        sub_9a58a4(a0, 80, 0x80006, 0);
        v15 = 0;
    }
    if (*(long long *)&g_10002b0 == v3)
        return v15;
    ___stack_chk_fail();
}
