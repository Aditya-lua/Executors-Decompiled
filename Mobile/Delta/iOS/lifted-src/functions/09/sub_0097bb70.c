/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97bb70..0x97bb98 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97bb70_0 {
    unsigned long long field_0;
    char field_8;
    char padding_9[31];
    unsigned long long field_28;
    unsigned long long field_30;
    int field_38;
    char padding_3c[4];
    unsigned long long field_40;
    unsigned long long field_48;
    int field_50;
    char padding_54[4];
    unsigned int field_58;
} st_97bb70_0;

extern char g_1000000;

int sub_97bb70(st_97bb70_0 *a0, unsigned long a1, unsigned long a2, unsigned long a3)
{
    a0->field_58 = (unsigned int)&g_1000000;
    a0->field_0 = a1;
    memset(&a0->field_8, 0, 32);
    a0->field_28 = a1;
    a0->field_48 = a3;
    *(unsigned long long *)&a0->field_50 = 0;
    a0->field_30 = a1;
    *(unsigned long long *)&a0->field_38 = 0;
    a0->field_40 = a2;
    return 1;
}
