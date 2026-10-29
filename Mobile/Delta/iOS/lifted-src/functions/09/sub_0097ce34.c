/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97ce34..0x97cebc (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97ce34_0 {
    char padding_0[96];
    long long field_60;
} st_97ce34_0;


unsigned long long sub_97ce34(unsigned long a0, unsigned long long a1)
{
    unsigned long long v3;  // x0
    st_97ce34_0 *v4;  // x8
    unsigned long long v5;  // x0
    unsigned long long v6;  // x0
    unsigned long long v7;  // x0
    st_97ce34_0 *v0;  // [bp-0x68]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_97f48c();
    if (!(unsigned int)v3)
        return v3;
    v4 = v0;
    v5 = sub_975fec(v4->field_60);
    if (v5 == a1)
        return v5;
    v6 = sub_981440(v4->field_60, a1);
    if (!(unsigned int)v6)
        return v6;
    v7 = sub_9d5018(v5);
    if (!a1)
        return v7;
    return sub_9d46fc(a1, 0x66, 1, 0);
}
