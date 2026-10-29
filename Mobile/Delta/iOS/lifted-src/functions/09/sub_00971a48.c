/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x971a48..0x971acc (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_971a48_0 {
    char padding_0[24];
    unsigned long long field_18;
    char padding_20[16];
    unsigned long long field_30;
    unsigned long long field_38;
    unsigned long long field_40;
    unsigned long long field_48;
    char padding_50[32];
    void* field_70;
    void* field_78;
    void* field_80;
    void* field_88;
    void* field_90;
    void* field_98;
} st_971a48_0;


int sub_971a48(st_971a48_0 *a0, unsigned long a1)
{
    unsigned int v0;  // w9

    a0->field_38 = a0->field_38 - a1;
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
        v0 = 82;
    }
    else if (a0->field_40 < a0->field_48)
    {
        v0 = 83;
    }
    else
    {
        v0 = 65;
    }
    *(unsigned int *)a0->field_98 = v0;
    return 1;
}
