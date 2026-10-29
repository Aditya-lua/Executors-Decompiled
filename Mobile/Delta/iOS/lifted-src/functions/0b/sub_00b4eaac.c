/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4eaac..0xb4eb18 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4eaac_1 {
    char padding_0[8];
    struct st_b4eaac_0 *field_8;
    char padding_10[264];
    unsigned int field_118;
    char field_11c;
} st_b4eaac_1;

typedef struct st_b4eaac_0 {
    char padding_0[96];
    unsigned int field_60;
} st_b4eaac_0;


int sub_b4eaac(st_b4eaac_1 *a0, unsigned long a1, unsigned long a2)
{
    char v2;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_b4f1c8())
    {
        return 0;
    }
    else if (a0->field_8->field_60 == 2)
    {
        v2 = a0->field_11c & 224;
        a0->field_118 = 3;
        a0->field_11c = v2 | 13;
    }
    else
    {
        return 0;
    }
}
