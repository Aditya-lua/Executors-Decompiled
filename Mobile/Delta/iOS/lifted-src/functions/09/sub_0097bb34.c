/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97bb34..0x97bb70 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97bb34_0 {
    char padding_0[80];
    struct st_97bb34_0 *field_50;
} st_97bb34_0;

typedef struct st_97bb34_1 {
    unsigned long long field_0;
    char field_8;
    char padding_9[31];
    unsigned long long field_28;
    unsigned long long field_30;
    struct st_97bb34_0 *field_38;
    unsigned long long field_40;
    unsigned long long field_48;
    struct st_97bb34_0 *field_50;
    struct st_97bb34_0 *field_58;
} st_97bb34_1;


st_97bb34_0 * sub_97bb34(st_97bb34_1 *a0, st_97bb34_0 *a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5)
{
    if (a1 && a1->field_50)
        return 0;
    a0->field_0 = a2;
    memset(&a0->field_8, 0, 32);
    a0->field_28 = a2;
    a0->field_48 = a5;
    a0->field_50 = a1;
    *(unsigned int *)&a0->field_58 = 0;
    a0->field_30 = a3;
    a0->field_38 = 0;
    a0->field_40 = a4;
    return 1;
}
