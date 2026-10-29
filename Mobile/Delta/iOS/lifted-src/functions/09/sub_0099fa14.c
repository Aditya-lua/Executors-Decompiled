/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99fa14..0x99fa50 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99fa14_1 {
    char padding_0[352];
    unsigned long long field_160;
    char padding_168[928];
    unsigned int field_508;
    char padding_50c[1012];
    struct st_99fa14_0 *field_900;
    char padding_908[168];
    char field_9b0;
} st_99fa14_1;

typedef struct st_99fa14_0 {
    char padding_0[888];
    unsigned int field_378;
} st_99fa14_0;


int sub_99fa14(st_99fa14_1 *a0)
{
    if (a0->field_9b0 & 1)
        return 1;
    a0->field_160 = a0->field_160 | 0x200;
    if (!a0->field_508)
    {
        a0->field_900->field_378 = a0->field_900->field_378 | 1;
        return 1;
    }
    return 1;
}
