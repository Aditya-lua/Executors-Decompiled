/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb0b9d0..0xb0baac (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b0b9d0_0 {
    char padding_0[32];
    char field_20;
    char padding_21[75];
    char field_6c;
    char padding_6d[51];
    unsigned int field_a0;
} st_b0b9d0_0;


int sub_b0b9d0(st_b0b9d0_0 *a0, long long a1, long long a2, long long a3)
{
    long long i;  // x20
    long long v5;  // x21
    long long v6;  // x22
    long long v0;  // [bp-0x50]
    unsigned int v1;  // [bp-0x44]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    i = a3;
    v5 = a2;
    v6 = a1;
    v1 = a0->field_a0;
    if ((unsigned long long)a3 > 0x3fffffff)
    {
        do
        {
            *(unsigned int *)&v0 = __ROL__(a0->field_6c, 31) & 0x80000001 & 1;
            sub_9f85e0(v5, v6, 0x40000000, &a0[1].padding_0[28], &a0[1].padding_6d[47], &a0[2].padding_6d[11], &a0->field_20, &v1, v0);
            i += 0xffffffffc0000000;
            v5 += 0x40000000;
            v6 += 0x40000000;
        } while ((unsigned long long)i > 0x3fffffff);
    }
    if (i)
    {
        *(unsigned int *)&v0 = __ROL__(a0->field_6c, 31) & 0x80000001 & 1;
        sub_9f85e0(v5, v6, i, &a0[1].padding_0[28], &a0[1].padding_6d[47], &a0[2].padding_6d[11], &a0->field_20, &v1, v0);
    }
    a0->field_a0 = v1;
    return 1;
}
