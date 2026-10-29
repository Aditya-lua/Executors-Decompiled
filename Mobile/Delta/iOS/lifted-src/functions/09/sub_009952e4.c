/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9952e4..0x995594 (688 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9952e4_0 {
    long long field_0;
    long long field_8;
    char padding_10[12];
    int field_1c;
} st_9952e4_0;

extern char g_10002b0;

int sub_9952e4(st_9952e4_0 *a0, unsigned long a1, long long a2, long long a3, long long a4, long long n, unsigned long a6, unsigned long a7, unsigned long a8, long long a9, unsigned int a10, long long a11)
{
    long long v9;  // x20
    long long v10;  // x0
    long long v19;  // x0
    long long v20;  // x21
    unsigned int v21;  // w0
    long long v11;  // x0
    long long v13;  // x0
    long long v14;  // x20
    long long v15;  // x1
    long long v17;  // x1
    uint128_t v0;  // [bp-0xd0]
    uint128_t v1;  // [bp-0xc0]
    unsigned long long v2;  // [bp-0xb0]
    char v3;  // [bp-0xa8]
    uint128_t v4;  // [bp-0x80]
    uint128_t v5;  // [bp-0x70]
    unsigned long long v6;  // [bp-0x60]
    unsigned long v7;  // [bp-0x58]
    char *v8;  // [bp-0x10]

    v8 = &a8;
    v7 = *(long long *)&g_10002b0;
    v9 = a0->field_1c == 1;
    v10 = sub_a6bf4c(n, "ssl/record/methods/tls13_meth.c", 33);
    a0[134].field_0 = v10;
    if (v10)
    {
        v11 = sub_a6bf4c(n, "ssl/record/methods/tls13_meth.c", 37);
        a0[134].field_8 = v11;
        if (v11)
        {
            _memcpy(a0[134].field_0, a4, n);
            if (a11 && a10 == 855 && sub_a4fe08(a8, "NULL"))
            {
                v13 = sub_a58724(a0->field_0, "HMAC", a0->field_8);
                if (v13 && !(v14 = sub_a57e48(), a0[129].field_8 = v14, !v14))
                {
                    sub_a58aa4(v13);
                    v15 = sub_a50a58(a11);
                    sub_a71bbc(sub_a71618("digest", v15, 0), v15, 0);
                    v4 = v0;
                    v5 = v1;
                    v6 = v2;
                    if (!sub_a58104(v14, a2, a3, &v3))
                    {
                        sub_a368c8();
                        v17 = 57;
                    }
                    else
                    {
                        if (*(long long *)&g_10002b0 == v7)
                            return 1;
                        ___stack_chk_fail();
                    }
                }
                else
                {
                    sub_a368c8(sub_a58aa4());
                    v17 = 49;
                }
            }
            else
            {
                v19 = sub_a4bc70();
                a0[129].field_0 = v19;
                if (v19)
                {
                    v20 = v19;
                    v21 = sub_a4fdf4(a8);
                    if ((int)sub_a4c694(v20, a8, 0, 0, 0, v9) >= 1 && (int)sub_a4d5dc(v20, 9, n, 0) >= 1 && (v21 != 7 || (int)sub_a4d5dc(v20, 0x11, a9, 0) >= 1) && (int)sub_a4c694(v20, 0, 0, a2, 0, v9) > 0)
                    {
                        if (*(long long *)&g_10002b0 == v7)
                            return 1;
                        ___stack_chk_fail();
                    }
                    sub_a368c8();
                    v17 = 80;
                }
                else
                {
                    sub_a368c8();
                    v17 = 65;
                }
            }
            sub_a369bc("ssl/record/methods/tls13_meth.c", v17, "tls13_set_crypto_state");
            sub_a36abc(20, 0xc0103, 0);
        }
    }
    if (*(long long *)&g_10002b0 == v7)
        return -0x2;
    ___stack_chk_fail();
}
