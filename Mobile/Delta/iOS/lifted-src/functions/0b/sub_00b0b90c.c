/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb0b90c..0xb0b9d0 (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b0b90c_0 {
    char padding_0[160];
    unsigned int field_a0;
} st_b0b90c_0;


int sub_b0b90c(st_b0b90c_0 *a0, long long a1, long long a2, long long a3)
{
    long long i;  // x20
    long long v4;  // x21
    long long v5;  // x22
    unsigned int v0;  // [bp-0x44]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    i = a3;
    v4 = a2;
    v5 = a1;
    v0 = a0->field_a0;
    if ((unsigned long long)a3 > 0x3fffffff)
    {
        do
        {
            sub_9fbec4(v4, v5, 0x40000000, &a0[1].padding_0[28], &a0[1].padding_0[156], &a0[2].padding_0[120], &a0->padding_0[32], &v0);
            i += 0xffffffffc0000000;
            v4 += 0x40000000;
            v5 += 0x40000000;
        } while ((unsigned long long)i > 0x3fffffff);
    }
    if (i)
        sub_9fbec4(v4, v5, i, &a0[1].padding_0[28], &a0[1].padding_0[156], &a0[2].padding_0[120], &a0->padding_0[32], &v0);
    a0->field_a0 = v0;
    return 1;
}
