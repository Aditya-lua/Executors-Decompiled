/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5768c..0xb57740 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5768c_0 {
    char padding_0[108];
    char field_6c;
} st_b5768c_0;


int sub_b5768c(st_b5768c_0 *a0, long long a1, long long a2, long long a3)
{
    long long i;  // x19
    long long v3;  // x20
    long long v4;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    i = a3;
    v3 = a2;
    v4 = a1;
    if ((unsigned long long)a3 > 0x3fffffff)
    {
        do
        {
            sub_9fc404(v3, v4, 0x40000000, &a0[1].padding_0[83], &a0->padding_0[32], &a0[2].padding_0[0x66], &a0[4].padding_0[12], __ROL__(a0->field_6c, 31) & 0x80000001 & 1);
            i += 0xffffffffc0000000;
            v3 += 0x40000000;
            v4 += 0x40000000;
        } while ((unsigned long long)i > 0x3fffffff);
    }
    if (i)
        sub_9fc404(v3, v4, i, &a0[1].padding_0[83], &a0->padding_0[32], &a0[2].padding_0[0x66], &a0[4].padding_0[12], __ROL__(a0->field_6c, 31) & 0x80000001 & 1);
    return 1;
}
