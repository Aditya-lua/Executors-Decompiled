/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc576c4..0xc57770 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c576c4_0 {
    struct st_c576c4_1 *field_0;
    unsigned long long field_8;
} st_c576c4_0;

typedef struct st_c576c4_1 {
    char field_0;
} st_c576c4_1;


void* sub_c576c4(void* a0, st_c576c4_0 *a1)
{
    char *v0;  // x12
    unsigned long long v1;  // x10
    unsigned long long v2;  // x9
    unsigned long long v3;  // w11
    char *v4;  // x8
    unsigned long v5;  // x10
    char *v6;  // x12
    unsigned long v7;  // x13
    unsigned long long v8;  // 4118

    v0 = a1->field_0;
    v1 = a1->field_8;
    if (!v1)
    {
        *(unsigned short *)a0 = 19;
        *(unsigned short *)&a0[6] = 0;
        *(unsigned int *)&a0[2] = 0;
        *(char **)&a0[8] = v0;
        return a0;
    }
    v2 = 0;
    v3 = 0;
    v4 = &v0[v1];
    v5 = v1 - 1;
    v6 = v0 + 1;
    while (1)
    {
        v7 = *(v6 - 1);
        if (v3 == 63 && 1 < (unsigned int)v7)
        {
            a1->field_0 = v6;
            a1->field_8 = v5;
            *(char *)a0 = 6;
            return a0;
        }
        v2 |= (v7 & 127) << ((char)v3 & 63);
        if (!(v7 >> 7 & 1))
        {
            a1->field_0 = v6;
            a1->field_8 = v5;
            *(unsigned long long *)&a0[8] = v2;
            *(char *)a0 = 82;
            return a0;
        }
        v6 += 1;
        v3 += 7;
        v5 -= 1;
        v8 = arm64g_calculate_condition(18, v5, 1, 0);
        if (!(v8 & 1))
        {
            a1->field_0 = v4;
            a1->field_8 = 0;
            *(unsigned short *)a0 = 19;
            *(unsigned short *)&a0[6] = 0;
            *(unsigned int *)&a0[2] = 0;
            *(char **)&a0[8] = v4;
            return a0;
        }
    }
}
