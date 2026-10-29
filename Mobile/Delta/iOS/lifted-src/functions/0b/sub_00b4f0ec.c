/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4f0ec..0xb4f15c (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4f0ec_1 {
    char padding_0[8];
    struct st_b4f0ec_0 *field_8;
    char padding_10[264];
    unsigned int field_118;
    char field_11c;
} st_b4f0ec_1;

typedef struct st_b4f0ec_0 {
    char padding_0[96];
    unsigned int field_60;
} st_b4f0ec_0;


int sub_b4f0ec(st_b4f0ec_1 *a0, unsigned long a1, unsigned long a2)
{
    char v2;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_b4f1c8())
    {
        return 0;
    }
    else if (a0->field_8->field_60 == 3)
    {
        v2 = a0->field_11c & 228;
        a0->field_118 = 5;
        a0->field_11c = v2 | 9;
    }
    else
    {
        return 0;
    }
}
