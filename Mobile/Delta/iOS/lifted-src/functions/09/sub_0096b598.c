/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96b598..0x96b5f0 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_96b598_2 {
    char padding_0[24];
    struct st_96b598_1 *field_18;
    char padding_20[2144];
    unsigned long long field_880;
} st_96b598_2;

typedef struct st_96b598_1 {
    char padding_0[216];
    struct st_96b598_0 *field_d8;
} st_96b598_1;

typedef struct st_96b598_0 {
    char padding_0[80];
    char field_50;
} st_96b598_0;


char sub_96b598(st_96b598_2 *a0, unsigned long a1, char a2)
{
    unsigned long v0;  // cc_dep1
    unsigned long long v1;  // 4107
    unsigned long long v2;  // 4107

    if (!(a0->field_18->field_d8->field_50 >> 1 & 1))
        return 1;
    if (!a0->field_880)
        return 0;
    v0 = a2;
    if (!a2)
    {
        v1 = arm64g_calculate_condition(3, v0, 0, 0);
        if (!(v1 & 1))
            goto LABEL_96b5d2;
LABEL_96b5d1:
    }
    else
    {
        v2 = arm64g_calculate_condition(3, v0, 0, 0);
        if (v2 & 1)
            goto LABEL_96b5d1;
LABEL_96b5d2:
    }
}
