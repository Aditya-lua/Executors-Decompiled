/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb43be8..0xb43c84 (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b43be8_0 {
    char padding_0[8];
    long long field_8;
} st_b43be8_0;


unsigned long long sub_b43be8(st_b43be8_0 *a0, long long a1, long long a2)
{
    unsigned long long v10;  // x24
    unsigned long long v11;  // x23
    unsigned long long v12;  // x22
    unsigned long long v13;  // x21
    unsigned long long v14;  // x20
    unsigned long long v15;  // x19
    unsigned long long v16;  // x30
    long long v17;  // x19
    long long v18;  // x20
    unsigned long long v19;  // x0
    char v0;  // [bp-0x44]
    unsigned long long v1;  // [bp-0x40]
    unsigned long long v2;  // [bp-0x38]
    unsigned long long v3;  // [bp-0x30]
    unsigned long long v4;  // [bp-0x28]
    unsigned long long v5;  // [bp-0x20]
    unsigned long long v6;  // [bp-0x18]
    char *v7;  // [bp-0x10]
    unsigned long long v8;  // [bp-0x8]
    char v9;  // [bp+0x0]

    if (!a2)
        return 1;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = v15;
    v7 = &v9;
    v8 = v16;
    v17 = a2;
    v18 = a1;
    if ((unsigned long long)a2 > 0x7fffffff)
    {
        do
        {
            v19 = sub_c672c8(a0->field_8, 0, &v0, v18, 0x7fffffff);
            if (!(unsigned int)v19)
                return v19;
        } while ((v18 += 0x7fffffff, v17 += 0xffffffff80000001, (unsigned long long)v17 > 0x7fffffff));
    }
    return sub_c672c8(a0->field_8, 0, &v0, v18, v17);
}
