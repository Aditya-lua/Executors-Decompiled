/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d0448..0x3d04d8 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d0448_0 {
    char field_0;
    char padding_1[1023];
    char field_400;
    char padding_401[255];
    char field_500;
} st_3d0448_0;


unsigned short * sub_3d0448(unsigned short *a0, st_3d0448_0 *a1)
{
    unsigned int idx;  // x8
    unsigned long v1;  // x14
    unsigned long long v10;  // 4102
    unsigned int v11;  // w16
    unsigned int v12;  // w15
    unsigned int v13;  // w15
    unsigned long v2;  // cc_dep1
    unsigned int v3;  // w13
    unsigned int v4;  // w15
    unsigned int v5;  // w16
    unsigned int v6;  // w14
    unsigned long long v7;  // 4112
    unsigned long long v8;  // 4102
    unsigned long long v9;  // 4112

    idx = 0;
    do
    {
        v1 = (&a1->field_0)[idx];
        a0[idx] = 0;
        v2 = v1;
        if (v1 == 0xff)
            continue;
        v3 = (&a1->field_400)[v1];
        v4 = v3 & 15;
        v5 = (&a1->field_500)[v1];
        v6 = v4 + v5;
        if (v4)
        {
            v7 = arm64g_calculate_condition(20, v2, 0xff, 0);
            v8 = arm64g_calculate_condition(131, (v7 & 1 ? v6 : 0x20000000), (v7 & 1 ? 9 : 0), 0);
            if (v8 & 1)
                continue;
        }
        else
        {
            v9 = arm64g_calculate_condition(20, v2, 0xff, 0);
            v10 = arm64g_calculate_condition(128, (v9 & 1 ? v6 : 0x20000000), (v9 & 1 ? 9 : 0), 0);
            if (v10 & 1)
                continue;
        }
        v11 = idx << ((char)v5 & 31);
        if (v11 & 0x100)
            v12 = 0;
        else
            v12 = (0xffffffff << ((char)v4 & 31)) + 1;
        v13 = ((v11 & 0x1ff) >> ((char)(9 - v4) & 31)) + v12;
        if (v13 == (char)v13)
            a0[idx] = (unsigned short)v3 & 240 | (unsigned short)v13 * 0x100 | (unsigned short)v6;
    } while ((idx += 1, idx != 0x200));
    return a0;
}
