/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5e158..0xc5e1f8 (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c5e158_0 {
    struct st_c5e158_1 *field_0;
    unsigned long long field_8;
} st_c5e158_0;

typedef struct st_c5e158_1 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned long long field_10;
} st_c5e158_1;

extern char g_efd4e0;

long long sub_c5e158(st_c5e158_0 *a0, unsigned long a1, unsigned long long a2)
{
    unsigned long long *v2;  // x23
    unsigned long v3;  // x9
    unsigned long v4;  // x24
    unsigned long v5;  // x10
    unsigned long long v6;  // x22
    unsigned long long v7;  // x21
    unsigned long long *v8;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_0;
    v3 = v2[1];
    v4 = v2[2];
    if (v3 < v4)
        v5 = v3;
    else
        v5 = v4;
    v6 = v3 - v5;
    if (v6 < a2)
        v7 = v6;
    else
        v7 = a2;
    _memcpy();
    v2[2] = v7 + v4;
    if (a2 > v6)
    {
        v8 = &a0->field_8;
        if (a0->field_8)
            sub_c40ff0(v8);
        *v8 = &g_efd4e0;
    }
    return a2 > v6;
}
