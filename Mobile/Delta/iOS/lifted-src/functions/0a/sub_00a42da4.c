/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa42da4..0xa42fa8 (516 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a42da4_1 {
    char padding_0[248];
    char field_f8;
    char padding_f9[247];
    struct st_a42da4_1 *field_1f0;
    unsigned long long field_1f8;
    unsigned long long field_200;
    unsigned long long field_208;
} st_a42da4_1;

typedef struct st_a42da4_0 {
    char padding_0[40];
    uint128_t field_28;
} st_a42da4_0;

extern char g_9b8de4;
extern char g_9b9120;
extern char g_9b96e0;
extern char g_9b9740;
extern unsigned long long g_9bdca0;
extern unsigned long long g_9be260;
extern unsigned int g_f0d568;

unsigned int sub_a42da4(st_a42da4_0 *a0, unsigned long a1, unsigned int a2, unsigned int a3)
{
    st_a42da4_1 *v2;  // x0
    st_a42da4_1 *v3;  // x21
    st_a42da4_1 *v12;  // x2
    unsigned long v13;  // x8
    unsigned long v14;  // x8
    unsigned int v4;  // w0
    unsigned long long v5;  // x24
    long long v6;  // x23
    unsigned long v7;  // x9
    unsigned long long v8;  // x8
    unsigned long long v10;  // x9
    long long v11;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9ffdd8();
    if (!a1 && !a2)
        return 1;
    v3 = v2;
    if (!a1)
    {
LABEL_a42f78:
        if (!a2)
            return 1;
        v3->field_1f8 = &v3->field_f8;
        *(int128_t *)&(a0->padding_0)[1] = *(int128_t *)a2;
        return 1;
    }
    v4 = sub_a50904(a0);
    if ((int)v4 <= 0)
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/e_aes.c", 3240, "aes_xts_init_key");
        sub_a36abc(6, 130, 0);
        return 0;
    }
    v5 = v4 / 2;
    v6 = (unsigned int)v5 * 8;
    if (a3)
    {
        if (!sub_a66f20(a1, a1 + v5, v5))
        {
            sub_a368c8();
            sub_a369bc("crypto/evp/e_aes.c", 3261, "aes_xts_init_key");
            sub_a36abc(6, 192, 0);
            return 0;
        }
        *(unsigned long long *)&v3[1].padding_0[0] = 0;
        v7 = g_f0d568;
        if (!(g_f0d568 >> 2 & 1))
            goto LABEL_a42e8c;
        sub_9b9440(a1, v6, v3);
        v3->field_200 = &g_9b96e0;
        v8 = "_@";
        goto LABEL_a42f28;
    }
    else
    {
        *(unsigned long long *)&v3[1].padding_0[0] = 0;
        v7 = g_f0d568;
        if (!(g_f0d568 >> 2 & 1))
        {
LABEL_a42e8c:
            if (v7 & 1)
            {
                v10 = &g_9bdca0;
                if (!a3)
                    v10 = &g_9be260;
                *(unsigned long long *)&v3[1].padding_0[0] = v10;
            }
            v11 = v6;
            v12 = v3;
            if (a3)
            {
                sub_9b8880(a1, v11, v12);
                v13 = &g_9b8de4;
            }
            else
            {
                sub_9b8ba4(a1, v11, v12);
                v13 = &g_9b9120;
            }
            v3->field_200 = v13;
            sub_9b8880(a1 + (v5 & 0xffffffff), v6, &v3->field_f8);
            v14 = &g_9b8de4;
        }
        else
        {
            sub_9b9660(a1, v6, v3);
            v3->field_200 = &g_9b9740;
            v8 = "_@";
LABEL_a42f28:
            *(unsigned long long *)&v3[1].padding_0[0] = v8;
            sub_9b9440(a1 + v5, v6, &v3->field_f8);
            v14 = &g_9b96e0;
        }
        v3->field_208 = v14;
        v3->field_1f0 = v3;
        goto LABEL_a42f78;
    }
}
