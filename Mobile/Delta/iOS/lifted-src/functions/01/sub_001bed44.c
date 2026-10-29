/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1bed44..0x1bed74 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1bed44_2 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned int field_10;
} st_1bed44_2;

typedef struct st_1bed44_1 {
    unsigned long long field_0;
} st_1bed44_1;

typedef struct st_1bed44_0 {
    unsigned int field_0;
    char padding_4[12];
    unsigned long long field_10;
    char padding_18[8];
    struct st_1bed44_1 *field_20;
    char padding_28[40];
    unsigned long long field_50;
} st_1bed44_0;


st_1bed44_2 * sub_1bed44(st_1bed44_2 *a0, st_1bed44_0 *a1)
{
    a1->field_0 = 0xfffffc1e;
    *(unsigned long long *)((char *)a1->field_20 + (a0->field_10 - 1) * 24) = a1->field_10;
    a1->field_50 = a0->field_8;
    return a0;
}
