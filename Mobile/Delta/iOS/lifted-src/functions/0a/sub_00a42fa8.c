/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa42fa8..0xa430a0 (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a42fa8_1 {
    char padding_0[496];
    struct st_a42fa8_0 *field_1f0;
    struct st_a42fa8_0 *field_1f8;
    char padding_200[16];
    struct st_a42fa8_0 *field_210;
} st_a42fa8_1;

typedef struct st_a42fa8_0 {
    struct st_a42fa8_0 *field_0;
} st_a42fa8_0;

extern char g_1000001;

st_a42fa8_0 ** sub_a42fa8(long long a0, st_a42fa8_0 **a1, st_a42fa8_0 **a2, long long a3)
{
    st_a42fa8_1 *v2;  // x0
    st_a42fa8_1 *v3;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9ffdd8();
    if (!v2->field_1f0)
        return 0;
    v3 = v2;
    if ((unsigned long long)a3 < 16)
    {
        return 0;
    }
    else if (!a2)
    {
        return 0;
    }
    else if (!a1)
    {
        return 0;
    }
    else if (!v3->field_1f8)
    {
        return 0;
    }
    else if ((unsigned long long)a3 >= &g_1000001)
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/e_aes.c", 3360, "aes_xts_cipher");
        sub_a36abc(6, 191, 0);
    }
    else if (v3->field_210)
    {
        v3->field_210();
    }
    else if (!sub_a98764(&v3->field_1f0, a0 + 40, a2, a1, a3, sub_a50720(a0)))
    {
        return 1;
    }
    return 0;
}
