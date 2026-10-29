/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5739c..0xb5743c (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5739c_0 {
    char padding_0[32];
    char field_20;
    char padding_21[75];
    char field_6c;
    char padding_6d[51];
    unsigned int field_a0;
} st_b5739c_0;


int sub_b5739c(st_b5739c_0 *a0, long long a1, long long a2, long long i)
{
    unsigned int v3;  // w8
    long long v4;  // x23
    unsigned int v0;  // [bp-0x44]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a0->field_a0;
    v0 = a0->field_a0;
    if (i)
    {
        if ((unsigned long long)i < 0x40000000)
            v4 = i;
        else
            v4 = 0x40000000;
        do
        {
            sub_9f8e44(a2, a1, v4, &a0[1].padding_0[28], &a0->field_20, &v0, __ROL__(a0->field_6c, 31) & 0x80000001 & 1);
            a2 += v4;
            a1 += v4;
            i -= v4;
            if ((unsigned long long)i < (unsigned long long)v4)
                v4 = i;
        } while (i);
        v3 = v0;
    }
    a0->field_a0 = v3;
    return 1;
}
