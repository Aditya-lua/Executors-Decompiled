/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad9c70..0xad9d08 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ad9c70_0 {
    char padding_0[8];
    char *field_8;
} st_ad9c70_0;


unsigned long long sub_ad9c70(st_ad9c70_0 *a0, long long a1, long long a2, long long a3, unsigned int a4, unsigned int a5)
{
    char *v2;  // x0
    char *v3;  // x19
    char *v4;  // x0
    unsigned long long v5;  // x20
    unsigned long long v6;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_ada6e0(a1, 0, 1, a2, a3);
    if (!v2)
        return 0xffffffff;
    v3 = v2;
    v4 = a0->field_8;
    if (v4 || (v4 = sub_ad61b4(NULL), a0->field_8 = v4, v4))
    {
        *(unsigned int *)&v3[40] = a4;
        *(unsigned int *)&v3[44] = a5;
        *(unsigned long long *)&v3[48] = 0;
        v6 = sub_ad68a0(v4, v3);
        if (0 < (int)v6)
            return v6;
        v5 = (unsigned int)v6 - 1;
    }
    else
    {
        v5 = 0xffffffff;
    }
    sub_ad9be4(v3);
    return v5;
}
