/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x181a8..0x181f0 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_181a8_1 {
    struct st_181a8_2 *field_0;
    char padding_8[16];
    struct st_181a8_1 *field_18;
} st_181a8_1;

typedef struct st_181a8_0 {
    unsigned long long field_0;
} st_181a8_0;

typedef struct st_181a8_2 {
    struct st_181a8_0 *field_0;
} st_181a8_2;


st_181a8_1 * sub_181a8(st_181a8_1 *a0)
{
    st_181a8_1 *v2;  // x0
    unsigned long long v3;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_18;
    if (v2 == a0)
    {
        v3 = 32;
    }
    else if (v2)
    {
        v3 = 40;
    }
    else
    {
        return a0;
    }
    (*(long long *)((char *)v2->field_0 + v3))();
}
