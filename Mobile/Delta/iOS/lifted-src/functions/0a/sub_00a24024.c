/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa24024..0xa24320 (764 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_d6e190;
extern long long g_d6e1b0;
extern char g_d6e1d1;
extern char g_10002b0;

long long sub_a24024(unsigned long a0, long long a1, long long a2, long long a3)
{
    long long v19;  // x20
    char *v20;  // x21
    long long i;  // x22
    long long v22;  // x22
    char *v23;  // x21
    long long v24;  // x0
    long long v25;  // x1
    long long v26;  // x1
    char v0;  // [bp-0x268]
    char v1;  // [bp-0x248]
    char v2;  // [bp-0x228]
    char v3;  // [bp-0x208]
    char v4;  // [bp-0x1e8]
    char v5;  // [bp-0x1c8]
    char v6;  // [bp-0x1a8]
    char v7;  // [bp-0x188]
    char v8;  // [bp-0x168]
    char v9;  // [bp-0x148]
    char v10;  // [bp-0x128]
    char v11;  // [bp-0x108]
    char v12;  // [bp-0xe8]
    char v13;  // [bp-0xc8]
    char v14;  // [bp-0xa8]
    char v15;  // [bp-0x88]
    unsigned long v16;  // [bp-0x48]
    char *v17;  // [bp-0x10]
    char v18;  // [bp+0x0]

    v17 = &v18;
    v19 = a2;
    v16 = *(long long *)&g_10002b0;
    if (!sub_9e4cdc(a1, 4))
    {
        sub_a368c8();
        v26 = 1300;
        goto LABEL_a242a8;
    }
    if (0x100 >= (int)sub_9e46a8(v19) && !sub_9e5c94(v19) || !(v19 = sub_9de208(a3), !v19 || !sub_9e5dac()))
    {
        if (sub_9e42c8(&v0, v19, 4))
        {
            sub_a21cd0(&v2, &v0, &g_d6e190);
            sub_a21f80(&v3, &v2, 1);
            sub_a21cd0(&v4, &v2, &v3);
            sub_a21cd0(&v5, &v4, &v3);
            sub_a21cd0(&v6, &v5, &v3);
            sub_a21f80(&v7, &v5, 1);
            sub_a21cd0(&v8, &v7, &v5);
            sub_a21f80(&v9, &v7, 1);
            sub_a21cd0(&v9, &v9, &v2);
            sub_a21f80(&v10, &v9, 1);
            sub_a21cd0(&v11, &v10, &v5);
            sub_a21cd0(&v12, &v10, &v9);
            sub_a21f80(&v13, &v12, 2);
            sub_a21cd0(&v13, &v13, &v4);
            sub_a21f80(&v14, &v13, 8);
            sub_a21cd0(&v14, &v14, &v13);
            sub_a21f80(&v15, &v14, 16);
            sub_a21cd0(&v15, &v15, &v14);
            sub_a21f80(&v1, &v15, 64);
            sub_a21cd0(&v1, &v1, &v15);
            v20 = &g_d6e1d1;
            i = 27;
            do
            {
                v22 = i;
                sub_a21f80(&v1, &v1, *(v20 - 1));
                v23 = v20 + 2;
                sub_a21cd0(&v1, &v1, &(&v2)[32 * *v20]);
                i = v22 - 1;
                v20 = v23;
            } while (i);
            sub_a21cd0(&v1, &v1, &g_d6e1b0);
            v24 = sub_9e4320(a1, &v1, 4) != 0;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/ec/ecp_nistz256.c", 1316, "ecp_nistz256_inv_mod_ord");
            v25 = 146;
LABEL_a242b8:
            sub_a36abc(16, v25, 0);
            v24 = 0;
        }
    }
    else
    {
        sub_a368c8();
        v26 = 1309;
LABEL_a242a8:
        sub_a369bc("crypto/ec/ecp_nistz256.c", v26, "ecp_nistz256_inv_mod_ord");
        v25 = 524291;
        goto LABEL_a242b8;
    }
    if (*(long long *)&g_10002b0 == v16)
        return v24;
    ___stack_chk_fail();
}
