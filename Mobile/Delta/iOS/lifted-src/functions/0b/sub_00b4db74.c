/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4db74..0xb4dc7c (264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4db74_0 {
    char padding_0[8];
    unsigned long long field_8;
    long long field_10;
    char padding_18[272];
    long long field_128;
    char padding_130[64];
    long long field_170;
    char padding_178[16];
    long long field_188;
    long long field_190;
    long long field_198;
} st_b4db74_0;


unsigned long long sub_b4db74(st_b4db74_0 *a0, unsigned long long a1, unsigned long long *a2, unsigned long a3, long long a4, unsigned long long a5)
{
    unsigned long long v4;  // x0
    unsigned long long v5;  // x0
    unsigned long v6;  // x8
    unsigned long v0;  // [bp-0x60]
    unsigned int v1;  // [bp-0x54]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = sub_a16b20(a0->field_10);
    v5 = sub_a2f9e0(v4);
    if (!(unsigned int)v5)
        return v5;
    v6 = (int)v4;
    if (!a1)
    {
        *a2 = v6;
        return 1;
    }
    if (a3 < v6 || a0->field_170 && a0->field_170 != a5)
        return 0;
    if ((int)a0->field_198)
    {
        v0 = a0->field_8;
        if (1 <= (int)sub_a1eee4())
        {
            *a2 = v1;
            return 1;
        }
    }
    else if ((int)sub_a20084(0, a4, a5, a1, &v1, a0->field_188, a0->field_190, a0->field_10) >= 1)
    {
        *a2 = v1;
        return 1;
    }
    return 0;
}
