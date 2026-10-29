/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x21f38..0x22004 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_21f38_0 {
    char padding_0[8];
    uint128_t field_8;
} st_21f38_0;

typedef struct st_21f38_1 {
    unsigned long long field_0;
    uint128_t field_8;
} st_21f38_1;

extern char g_e61f08;

long long sub_21f38(unsigned long a0, st_21f38_0 *a1, st_21f38_0 *a2, st_21f38_1 *a3)
{
    st_21f38_0 *v8;  // x20
    st_21f38_0 *i;  // x23
    unsigned long v0;  // [bp-0x70]
    st_21f38_1 **v1;  // [bp-0x68]
    char *v2;  // [bp-0x60]
    char v3;  // [bp-0x58]
    st_21f38_1 *v4;  // [bp-0x50]
    st_21f38_1 *v5;  // [bp-0x48]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v8 = a1;
    v4 = a3;
    v5 = a3;
    v0 = a0;
    v1 = &v4;
    v2 = &v5;
    v3 = 0;
    if (a1 != a2)
    {
        i = v8;
        do
        {
            a3->field_0 = &g_e61f08;
            *(int128_t *)&(&a3->field_0)[1] = *(int128_t *)(i->padding_0)[1];
            sub_5c38((char *)&a3->field_8 + 8, (char *)&i->field_8 + 8);
            a3 = &v5[1].field_8;
            v5 = a3;
            i = &i[1].field_8;
        } while (i != a2);
    }
    v3 = 1;
    sub_1a708(a0, v8, a2);
    return sub_1815c(&v0);
}
