/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b4278..0x1b434c (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b4278_2 {
    char padding_0[24];
    struct st_1b4278_3 *field_18;
    char padding_20[80];
    char field_70;
    char padding_71[56];
    char field_a9;
    char field_aa;
} st_1b4278_2;

typedef struct st_1b4278_0 {
    char padding_0[40];
    struct st_1b4278_1 *field_28;
} st_1b4278_0;

typedef struct st_1b4278_1 {
    unsigned long long field_0;
} st_1b4278_1;

typedef struct st_1b4278_3 {
    struct st_1b4278_0 *field_0;
} st_1b4278_3;


long long sub_1b4278(st_1b4278_2 *a0, char a1, unsigned int a2)
{
    unsigned short v4;  // x1
    unsigned short v0;  // [bp-0x36]
    unsigned short v1;  // [bp-0x34]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (a0->field_a9 == 1)
        (*(long long *)(*(long long *)a0->field_18 + 40))();
    v4 = a1 | ((unsigned short)a2 * 0x100 | (unsigned short)(a2 >> 24)) & 0xff00;
    if (a0->field_aa != 1)
    {
        v0 = v4;
        return sub_1b7f3c(&a0->field_70, &v0);
    }
    v1 = v4;
    return sub_1b7f3c(&a0->field_70, &v1);
}
