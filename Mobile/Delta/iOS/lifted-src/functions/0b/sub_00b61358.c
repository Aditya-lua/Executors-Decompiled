/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb61358..0xb614fc (420 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b61358_1 {
    char padding_0[16];
    unsigned int field_10;
    char padding_14[36];
    unsigned int field_38;
} st_b61358_1;

typedef struct st_b61358_0 {
    char padding_0[56];
    struct st_b61358_1 *field_38;
    char padding_40[8];
    struct st_b61358_2 *field_48;
} st_b61358_0;

typedef struct st_b61358_2 {
    unsigned long long field_0;
} st_b61358_2;


unsigned int sub_b61358(st_b61358_0 *a0, unsigned int a1)
{
    unsigned long long v6;  // 4122
    unsigned int *v0;  // [bp-0x30]
    unsigned int v1;  // [bp-0x28]
    unsigned int v2;  // [bp-0x24]
    unsigned int v3;  // [bp-0x14]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v2 = a1;
    if (sub_b611f4(a0))
    {
        v3 = 0xfffffffe;
        return v3;
    }
    v0 = a0->field_38;
    if ((int)v2 < 0)
    {
        v6 = arm64g_calculate_condition(177, v2, 15, 0);
        if (v6 & 1)
        {
            v3 = 0xfffffffe;
            return v3;
        }
        v1 = 0;
        v2 = -v2;
    }
    else
    {
        v1 = ((int)(v2) >> 4) + 5;
        if ((int)v2 < 48)
            v2 &= 15;
    }
    if (v2 && (8 > (int)v2 || 15 < (int)v2))
    {
        v3 = 0xfffffffe;
        return v3;
    }
    if (*(long long *)&v0[18] && v0[14] != v2)
        a0->field_48();
    v0[4] = v1;
    v0[14] = v2;
    v3 = sub_b612e0(a0);
    return v3;
}
