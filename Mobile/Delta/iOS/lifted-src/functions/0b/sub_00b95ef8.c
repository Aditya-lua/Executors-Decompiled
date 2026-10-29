/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb95ef8..0xb96074 (380 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b95ef8_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    char field_10;
} st_b95ef8_0;

extern unsigned long long g_b7a7fc;
extern unsigned long long g_b7e018;
extern unsigned long long g_b96074;
extern long long g_cb8c42;
extern long long g_cb8c60;
extern long long g_cba67f;

unsigned long long sub_b95ef8(st_b95ef8_0 **a0, long long *a1)
{
    st_b95ef8_0 *v13;  // x23
    unsigned long v14;  // x21
    unsigned long long v15;  // x0
    unsigned long long v16;  // x0
    unsigned long long v17;  // x0
    char v0;  // [bp-0xb8]
    long long v1;  // [bp-0xb0]
    unsigned long v2;  // [bp-0xa0]
    long long v3;  // [bp-0x98]
    char *v4;  // [bp-0x88]
    unsigned long long v5;  // [bp-0x80]
    char *v6;  // [bp-0x78]
    unsigned long long v7;  // [bp-0x70]
    char *v8;  // [bp-0x68]
    unsigned long long v9;  // [bp-0x60]
    unsigned long v10;  // [bp-0x58]
    char *v11;  // [bp-0x10]
    char v12;  // [bp+0x0]

    v11 = &v12;
    v13 = *a0;
    v14 = v13->field_10;
    v15 = sub_b94cf4(v13->field_0, v14);
    v2 = v13->field_0;
    if (v15 & 1)
    {
        v4 = &v2;
        v5 = &g_b7e018;
    }
    else
    {
        v4 = &v2;
        v5 = &g_b7e018;
    }
    sub_b71ea8(&v0);
    v16 = sub_b94e50(v13->field_8, v14);
    v10 = v13->field_8;
    if (v16 & 1)
    {
        v4 = &v10;
        v5 = &g_b7e018;
        sub_b71ea8(&v2, &g_cb8c42, &v4);
    }
    else
    {
        v4 = &v10;
        v5 = &g_b7e018;
        sub_b71ea8(&v2, &g_cba67f, &v4);
    }
    v4 = &v0;
    v5 = &g_b7a7fc;
    v6 = &v13->field_10;
    v7 = &g_b96074;
    v8 = &v2;
    v9 = &g_b7a7fc;
    v17 = sub_be769c(*a1, a1[1], &g_cb8c60, &v4);
    if (v2)
        _free(v3);
    if (v0)
        _free(v1);
    return v17;
}
