/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xf0330..0xf055c (556 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_f0330_0 {
    char padding_0[16];
    unsigned long long field_10;
    char padding_18[48];
    unsigned long long field_48;
    char padding_50[32];
    unsigned long long field_70;
    char padding_78[40];
    unsigned int field_a0;
    char padding_a4[4];
    unsigned int field_a8;
} st_f0330_0;

typedef struct st_f0330_2 {
    unsigned long long field_0;
} st_f0330_2;

typedef struct st_f0330_1 {
    char padding_0[32];
    struct st_f0330_2 *field_20;
    char padding_28[184];
    struct st_f0330_2 *field_e0;
} st_f0330_1;

extern st_f0330_1 *g_f0d3d8;

void sub_f0330(unsigned long a0, st_f0330_0 *a1, unsigned int *a2)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    a2[42] = a1->field_a8;
    if (a1->field_10)
    {
        g_f0d3d8->field_20();
    }
    else if (a1->field_48)
    {
        g_f0d3d8->field_20();
    }
    else if (a1->field_70)
    {
        g_f0d3d8->field_e0();
    }
    else
    {
        a2[40] = a1->field_a0;
        return;
    }
}
