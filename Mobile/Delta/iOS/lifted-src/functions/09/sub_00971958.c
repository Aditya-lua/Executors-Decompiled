/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x971958..0x971a30 (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_971958_0 {
    char padding_0[24];
    unsigned long long field_18;
    char padding_20[16];
    unsigned long long field_30;
    unsigned long long field_38;
    unsigned long long field_40;
    unsigned long long field_48;
    void* field_50;
    char padding_58[8];
    void* field_60;
    unsigned long long field_68;
    void* field_70;
    void* field_78;
    void* field_80;
    void* field_88;
    void* field_90;
    void* field_98;
} st_971958_0;


void* sub_971958(st_971958_0 *a0, unsigned long long *a1)
{
    unsigned long v0;  // x8
    unsigned int v1;  // w9

    if (a1[1] > a0->field_38)
        return 0;
    a0->field_38 = a0->field_38 - a1[1];
    if ((int)a0->field_60)
    {
        v0 = a0->field_68;
    }
    else
    {
        v0 = a0->field_68;
        if (*a1 <= v0)
            goto LABEL_9719b0;
        *(unsigned int *)&a0->field_60 = 1;
        a0->field_50 = 0;
    }
    if (*a1 >= v0)
        v0 = *a1;
    a0->field_68 = v0;
LABEL_9719b0:
    if (a0->field_78)
        *(unsigned long long *)a0->field_78 = a0->field_30;
    if (a0->field_80)
        *(unsigned long long *)a0->field_80 = a0->field_40;
    if (a0->field_88)
        *(unsigned long long *)a0->field_88 = a0->field_18;
    if (a0->field_90)
        *(unsigned long long *)a0->field_90 = a0->field_38;
    if (!a0->field_98)
        return 1;
    if ((int)a0->field_70)
    {
        v1 = 82;
    }
    else if (a0->field_40 < a0->field_48)
    {
        v1 = 83;
    }
    else
    {
        v1 = 65;
    }
    *(unsigned int *)a0->field_98 = v1;
    return 1;
}
