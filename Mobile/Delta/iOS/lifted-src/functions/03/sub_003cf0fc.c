/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3cf0fc..0x3cf210 (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3cf0fc_0 {
    char field_0;
} st_3cf0fc_0;

typedef struct st_3cf0fc_1 {
    unsigned long long field_0;
} st_3cf0fc_1;

extern st_3cf0fc_1 *g_f0b120;

int sub_3cf0fc(void* a0, unsigned long a1, unsigned int a2)
{
    unsigned long long v4;  // x8
    unsigned int v5;  // w20
    unsigned long long v6;  // 4123
    unsigned long long v7;  // x9
    unsigned int v8;  // w10
    unsigned long long v9;  // x19
    unsigned long long ptr;  // x0
    st_3cf0fc_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_3cf0fc_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    *(unsigned long *)&a0[32] = a1;
    if (!(int)a0[56])
        g_f0b120();
    v4 = (long long)a0[40];
    v5 = a1 - v4;
    v6 = arm64g_calculate_condition(33, v5, a2, 0);
    if (v6 & 1)
        g_f0b120();
    v7 = (int)a0[48] - v4;
    v8 = v5 + a2;
    if (v8 > (unsigned int)v7)
    {
        do
        {
            if (v7 >> 31 & 1)
                g_f0b120();
        } while ((v7 = (unsigned int)v7 * 2, (unsigned int)v7 < v8));
    }
    v9 = v7 & 0xffffffff;
    ptr = _realloc(v4, v9);
    if (ptr)
    {
        *(unsigned long long *)&a0[32] = ptr + v5;
        *(unsigned long long *)&a0[40] = ptr;
        *(unsigned long long *)&a0[48] = ptr + v9;
        return 1;
    }
    g_f0b120();
}
