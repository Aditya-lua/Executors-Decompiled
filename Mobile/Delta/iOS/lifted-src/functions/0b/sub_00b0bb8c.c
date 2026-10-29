/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb0bb8c..0xb0bc58 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b0bb8c_0 {
    char padding_0[108];
    char field_6c;
} st_b0bb8c_0;


int sub_b0bb8c(st_b0bb8c_0 *a0, long long a1, long long a2, long long a3)
{
    long long i;  // x19
    long long v4;  // x20
    long long v5;  // x21
    long long v0;  // [bp-0x50]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    i = a3;
    v4 = a2;
    v5 = a1;
    if ((unsigned long long)a3 > 0x3fffffff)
    {
        do
        {
            *(unsigned int *)&v0 = __ROL__(a0->field_6c, 31) & 0x80000001 & 1;
            sub_9f8794(v4, v5, 8, 0x40000000, &a0[1].padding_0[83], &a0[2].padding_0[0x66], &a0[4].padding_0[12], &a0->padding_0[32], v0);
            i += 0xffffffffc0000000;
            v4 += 0x40000000;
            v5 += 0x40000000;
        } while ((unsigned long long)i > 0x3fffffff);
    }
    if (i)
    {
        *(unsigned int *)&v0 = __ROL__(a0->field_6c, 31) & 0x80000001 & 1;
        sub_9f8794(v4, v5, 8, i, &a0[1].padding_0[83], &a0[2].padding_0[0x66], &a0[4].padding_0[12], &a0->padding_0[32], v0);
    }
    return 1;
}
