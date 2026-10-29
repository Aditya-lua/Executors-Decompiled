/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99b3fc..0x99b910 (1300 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99b3fc_0 {
    char padding_0[1];
    char field_1;
    char field_2;
    char field_3;
} st_99b3fc_0;

extern char g_10002b0;

unsigned long long sub_99b3fc(void* a0, long long a1, long long a2, long long a3, long long a4, st_99b3fc_0 **a5, void* a6, unsigned int a7)
{
    void* v10;  // x20
    unsigned int v11;  // w0
    long long v20;  // x28
    unsigned long long v21;  // x8
    unsigned long long v22;  // x10
    unsigned long long v23;  // x8
    long long v24;  // x21
    unsigned long v25;  // x25
    long long v26;  // x0
    unsigned long v27;  // x20
    long long v28;  // x1
    long long v29;  // x1
    unsigned int v12;  // w9
    long long v13;  // x28
    long long *v14;  // x22
    unsigned long v15;  // x10
    unsigned long v16;  // x19
    unsigned long v17;  // x27
    unsigned long v18;  // x0
    unsigned long long v19;  // x2
    long long v0;  // [bp-0x198]
    st_99b3fc_0 **v1;  // [bp-0x180]
    unsigned long v2;  // [bp-0x178]
    char *v3;  // [bp-0x170]
    char v4;  // [bp-0x130]
    char v5;  // [bp-0xf0]
    char v6;  // [bp-0xb0]
    unsigned long v7;  // [bp-0x70]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v10 = a0;
    v7 = *(long long *)&g_10002b0;
    v11 = sub_a50ac8(a1);
    if ((int)v11 <= 0)
    {
        sub_c65154(v10);
LABEL_99b6b4:
        v16 = 0;
LABEL_99b6b8:
        v25 = 0;
        goto LABEL_99b6bc;
    }
    v1 = a5;
    if (v9)
    {
        if ((int)v10[240] != 2 || *(int *)((long long)v10[0x900] + 836))
            v12 = 0;
        else
            v12 = (int)a6[836] != 0;
        v13 = "ext binder";
    }
    else
    {
        v12 = 0;
        v13 = "res binder";
    }
    v14 = (long long)v10[8];
    if ((int)v10[120])
        v12 = 1;
    if (!v9)
        v12 = 1;
    v15 = a6 + 16;
    if (v12)
        v15 = v10 + 1404;
    if (!sub_96ef34())
        goto LABEL_99b6b4;
    v16 = sub_a3f728();
    if (!v16 || (int)sub_a3fe04(v16, a1, 0) < 1 || (int)sub_a3ff7c(v16, &v6, 0) <= 0)
    {
        sub_a368c8();
        v29 = 1529;
        goto LABEL_99b654;
    }
    v17 = v11;
    *(unsigned int *)&v0 = 1;
    if (!sub_96ede8(v10, a1, v15, v13, 10, &v6, v17, &v5, v17, v0) || !sub_96ee98(v10, a1, &v5, &v4, v17))
        goto LABEL_99b6b8;
    if ((int)sub_a3fe04(v16, a1, 0) > 0)
    {
        if ((int)v10[2256] == 1)
        {
            v18 = sub_9d46fc((long long)v10[424], 3, 0, &v3);
            if ((long long)v18 >= 1)
            {
                v19 = v18;
                v20 = 786691;
                if ((int)v10[120])
                {
                    v21 = v19 - 4;
                    if (v19 < 4 || (v22 = v3[1] * 0x10000 | v3[2] * 0x100 | v3[3], v21 <= v22 || (v23 = v21 + ~v22, v21 + ~v22 < 3 || (v3[5 + v22] * 0x10000 | v3[6 + v22] * 0x100 | v3[7 + v22]) > v21 + ~v22 - 3)))
                        v24 = 1580;
                    else
                        goto LABEL_99b730;
                }
                else
                {
LABEL_99b730:
                    if ((int)sub_a3fe10(v16) > 0)
                        goto LABEL_99b740;
                    v24 = 1587;
                }
            }
            else
            {
                v20 = 332;
                v24 = 1563;
            }
            sub_a368c8();
            sub_a369bc("ssl/statem/extensions.c", v24, "tls_psk_do_binder");
LABEL_99b668:
            sub_9a58a4(v10, 80, v20, 0);
            goto LABEL_99b6b8;
        }
LABEL_99b740:
        if ((int)sub_a3fe10(v16, a2, a3) >= 1 && (int)sub_a3ff7c(v16, &v6, 0) > 0)
        {
            v25 = sub_a5a654(*v14, "HMAC", v14[142], &v4, v17);
            if (v25)
            {
                if (!a7)
                    v1 = &v3;
                v2 = v17;
                v26 = sub_a50a58();
                if ((int)sub_a565c4(v16, 0, v26, *v14, v14[142], v25, 0) < 1 || (int)sub_a56f14(v16, &v6, v17) < 1 || (int)sub_a5727c(v16, v1, &v2) < 1 || v2 != v17)
                {
                    sub_a368c8();
                    v28 = 1616;
                    goto LABEL_99b870;
                }
                else if (a7 || !sub_a66f20(a4, &v3, v17))
                {
                    v27 = 1;
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("ssl/statem/extensions.c", 1626, "tls_psk_do_binder");
                    sub_9a58a4(v10, 0x33, 253, 0);
                    v27 = 0;
                }
            }
            else
            {
                sub_a368c8();
                v28 = 1602;
LABEL_99b870:
                sub_a369bc("ssl/statem/extensions.c", v28, "tls_psk_do_binder");
                sub_9a58a4(v10, 80, 0xc0103, 0);
LABEL_99b6bc:
                v27 = 0xffffffff;
            }
        }
        else
        {
            sub_a368c8();
            v29 = 1594;
LABEL_99b654:
            sub_a369bc("ssl/statem/extensions.c", v29, "tls_psk_do_binder");
            v20 = 786691;
            goto LABEL_99b668;
        }
    }
    else
    {
        sub_a368c8();
        v29 = 1547;
        goto LABEL_99b654;
    }
    sub_a66ec0(&v5, 64);
    sub_a66ec0(&v4, 64);
    sub_a5a4c8(v25);
    sub_a3f73c(v16);
    if (*(long long *)&g_10002b0 == v7)
        return v27;
    ___stack_chk_fail();
}
