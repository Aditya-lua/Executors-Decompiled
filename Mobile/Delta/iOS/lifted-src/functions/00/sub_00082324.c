/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x82324..0x82350 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_82324_0 {
    unsigned short field_0;
    char field_2;
} st_82324_0;


st_82324_0 * sub_82324(st_82324_0 *a0, unsigned long long a1, unsigned int a2, unsigned int a3)
{
    unsigned int v0;  // w8
    unsigned long long v1;  // 4117
    unsigned long long v2;  // 4117
    unsigned int v3;  // w8

    if (a1 == 1)
    {
        v0 = 2 + a3;
        v1 = arm64g_calculate_condition(4, a1, 1, 0);
        if (!(v1 & 1))
            goto LABEL_8233a;
LABEL_82339:
    }
    else
    {
        v0 = 4 + a3;
        v2 = arm64g_calculate_condition(4, a1, 1, 0);
        if (v2 & 1)
            goto LABEL_82339;
LABEL_8233a:
        a2 = a1;
    }
    v3 = v0 + a2 * 8;
    a0->field_0 = v3;
    a0->field_2 = v3 >> 16;
    return a0;
}
