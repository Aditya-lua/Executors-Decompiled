/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa647a0..0xa64954 (436 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a647a0_0 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
} st_a647a0_0;

extern char g_10002b0;

long long sub_a647a0(long long a0, long long a1, long long a2, unsigned int a3, unsigned long a4, long long a5, unsigned long a6, long long a7, unsigned long a8, long long a9)
{
    st_a647a0_0 *iter;  // x26
    st_a647a0_0 *v9;  // x25
    unsigned int v10;  // w0
    uint128_t v0;  // [bp-0x160]
    uint128_t v1;  // [bp-0x150]
    unsigned long v2;  // [bp-0x140]
    unsigned int v3;  // [bp-0x134]
    char v4;  // [bp-0x130]
    uint640_t v5;  // [bp-0x108], Other Possible Types: char
    unsigned long v6;  // [bp-0x68]
    char *v7;  // [bp-0x10]

    v7 = &a8;
    v6 = *(long long *)&g_10002b0;
    v3 = a3;
    iter = &v5;
    sub_a6ffac("mode", &v3);
    if (a4)
    {
        sub_a71670("salt", a4, a5);
        v5 = _INSERT(*(uint640_t *)&v5, 0, v0);
        *(uint128_t *)((char *)&v5 + 16) = v1;
        *(unsigned long *)((char *)&v5 + 32) = v2;
        iter = (char *)&v5 + 40;
    }
    if (a6)
    {
        v9 = iter + 1;
        sub_a71670("key", a6, a7);
        iter->field_0 = v0;
        iter->field_10 = v1;
        iter->field_20 = v2;
        iter = v9;
    }
    if (a8)
    {
        sub_a71670("info", a8, a9);
        iter->field_20 = v2;
        iter->field_0 = v0;
        iter->field_10 = v1;
        iter += 1;
    }
    sub_a71bbc();
    iter->field_20 = v2;
    iter->field_0 = v0;
    iter->field_10 = v1;
    v10 = sub_a53798(a0, a1, a2, &v4);
    if (0 >= (int)v10)
    {
        sub_a368c8();
        sub_a369bc("crypto/hpke/hpke_util.c", 269, "kdf_derive");
        sub_a36abc(57, 164, 0);
    }
    if (*(long long *)&g_10002b0 == v6)
        return (int)v10 > 0;
    ___stack_chk_fail((int)v10 > 0);
}
