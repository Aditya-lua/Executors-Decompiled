/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e55d4..0x9e56a0 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e55d4_0 {
    struct st_9e55d4_1 *field_0;
    unsigned int field_8;
    int field_c;
} st_9e55d4_0;

typedef struct st_9e55d4_1 {
    unsigned long long field_0;
} st_9e55d4_1;


unsigned long long sub_9e55d4(st_9e55d4_0 *a0, unsigned long long a1)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long long v12;  // x20
    unsigned long v13;  // x8
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (a1 >> 31 & 1)
        return 0;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    v12 = (unsigned int)a1 >> 6;
    v13 = a0->field_8;
    if ((int)v12 >= (int)v13)
    {
        if ((int)v12 >= a0->field_c)
        {
            a0 = a0;
            if (!sub_9e49b8())
                return 0;
            v13 = a0->field_8;
        }
        if ((int)v12 >= (int)v13)
            _bzero(&a0->field_0[(int)v13], (((v12 - v13) * 8 | v12 - v13 >> 61) & 0x7fffffff8 & 0x7ffffffff) + 8);
        a0->field_8 = (unsigned int)v12 + 1;
    }
    *(unsigned long long *)&a0->field_0[v12 & 0xffffffff] = *(long long *)&a0->field_0[v12 & 0xffffffff] | 1 << ((char)a1 & 63);
    return 1;
}
