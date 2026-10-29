/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99bf98..0x99bfe8 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99bf98_1 {
    int field_0;
    char padding_4[212];
    struct st_99bf98_0 *field_d8;
} st_99bf98_1;

typedef struct st_99bf98_2 {
    char padding_0[24];
    struct st_99bf98_1 *field_18;
    char padding_20[88];
    unsigned int field_78;
    char padding_7c[2180];
    unsigned long long field_900;
} st_99bf98_2;

typedef struct st_99bf98_0 {
    char padding_0[80];
    char field_50;
} st_99bf98_0;


int sub_99bf98(st_99bf98_2 *a0, unsigned long a1, char a2)
{
    unsigned int v0;  // w8

    v0 = a0->field_78;
    if (!v0 && !a2 && *(long long *)(a0->field_900 + 840))
        *(unsigned int *)&a0[1].padding_7c[408] = 0;
    if (!v0)
    {
        return 1;
    }
    else if (a0->field_18->field_d8->field_50 >> 3 & 1)
    {
        return 1;
    }
    else if (a0->field_18->field_0 < 772)
    {
        return 1;
    }
    else if (a0->field_18->field_0 == 0x10000)
    {
        return 1;
    }
}
