/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x974dcc..0x974e9c (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_974dcc_0 {
    char padding_0[336];
    unsigned long long field_150;
    unsigned long long field_158;
    unsigned long long field_160;
    unsigned long long field_168;
    char padding_170[40];
    unsigned long long field_198;
    unsigned long long field_1a0;
    unsigned long long field_1a8;
    char padding_1b0[26];
    char field_1ca;
    char padding_1cb[1909];
    unsigned long long field_940;
} st_974dcc_0;


void sub_974dcc(st_974dcc_0 *a0)
{
    unsigned long v2;  // x8
    unsigned long v3;  // x9
    unsigned long v4;  // x9
    unsigned long long v5;  // 4123
    unsigned long v6;  // x2
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_150;
    v3 = a0->field_158;
    if (a0->field_150 - 1 < v3 || !(v2 = v3, !v2))
    {
        v4 = a0->field_160;
        if (v2 > v4 && !(v2 = v4, v2))
            goto LABEL_974e38;
LABEL_974e08:
        a0->field_168 = v2;
        v6 = a0->field_940;
        if (!v6)
            return;
    }
    else
    {
        v2 = a0->field_160;
        if (a0->field_160)
            goto LABEL_974e08;
LABEL_974e38:
        v5 = arm64g_calculate_condition(18, a0->field_1a8, a0->field_198 + a0->field_1a0, 0);
        if (!(v5 & 1) && a0->field_1ca)
        {
            a0->field_168 = 0;
            v6 = a0->field_940;
            if (!v6)
                return;
        }
        else
        {
            a0->field_168 = sub_975738();
            v6 = a0->field_940;
            if (!v6)
                return;
        }
    }
    goto *((void *)(v6));
}
