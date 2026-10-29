/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa978d4..0xa97af4 (544 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_df0000;
extern char g_10002b0;

int sub_a978d4(long long *a0, long long a1, int a2, long long a3, long long a4, long long a5, long long a6)
{
    long long v13;  // x0
    unsigned long long *v14;  // x26
    unsigned long v16;  // x2
    long long v17;  // x0
    long long v18;  // x0
    long long v19;  // x0
    long long v20;  // x20
    long long v21;  // x0
    uint128_t v0;  // [bp-0x110]
    uint128_t v1;  // [bp-0x100]
    unsigned long long v2;  // [bp-0xf0]
    unsigned long v3;  // [bp-0xe8]
    uint128_t v4;  // [bp-0xb8]
    uint128_t v5;  // [bp-0xa8]
    unsigned long long v6;  // [bp-0x98]
    uint128_t v7;  // [bp-0x90]
    uint128_t v8;  // [bp-0x80]
    unsigned long long v9;  // [bp-0x70]
    unsigned long v10;  // [bp-0x68]
    char *v11;  // [bp-0x10]
    char v12;  // [bp+0x0]

    v11 = &v12;
    v10 = *(long long *)&g_10002b0;
    v3 = 16;
    v13 = a0;
    if (v13)
    {
        *a0 = 0;
        a0[1] = 0;
        v14 = a0 + 4;
        sub_a4bca0(a0[4]);
        sub_a57f0c(a0[6]);
        sub_a58aa4(a0[5]);
        v13 = 0;
        *v14 = 0;
        a0[5] = 0;
        a0[6] = 0;
        if (a1 && a3 && a4)
        {
            sub_a71618("cipher", sub_a509dc(a3), 0);
            v16 = a2;
            v4 = v0;
            v5 = v1;
            v6 = v2;
            v7 = v0;
            v8 = v1;
            v9 = v2;
            v17 = sub_a4bc70(sub_a71bbc(sub_a71670("key", a1, v16), a1, v16));
            *v14 = v17;
            if (v17 && !(v18 = sub_a58724(a5, "CMAC", a6), a0[5] = v18, !v18 || (v19 = sub_a57e48(), a0[6] = v19, !v19 || !sub_a58410() || !sub_a4d02c(*v14, a4, 0, a1 + v16, 0))))
            {
                v20 = sub_a57f5c(a0[6]);
                if (!v20 || !sub_a58164(v20, &g_df0000, 16) || !sub_a58170(v20, a0, &v3, 16))
                    goto LABEL_a97a88;
                sub_a57f0c(v20);
                *(double *)&a0[7] = 4.2439915814e-314;
                v13 = 1;
            }
            else
            {
                v20 = 0;
LABEL_a97a88:
                sub_a4bca0(a0[4]);
                a0[4] = 0;
                sub_a57f0c(a0[6]);
                a0[6] = 0;
                sub_a57f0c(v20);
                sub_a58aa4(a0[5]);
                v21 = 0;
                a0[5] = 0;
                v13 = 0;
            }
        }
    }
    if (*(long long *)&g_10002b0 == v10)
        return v13;
    ___stack_chk_fail();
}
