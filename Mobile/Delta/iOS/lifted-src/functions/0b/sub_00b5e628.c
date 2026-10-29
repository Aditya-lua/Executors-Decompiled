/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5e628..0xb5e6bc (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5e628_1 {
    unsigned long long field_0;
} st_b5e628_1;

typedef struct st_b5e628_0 {
    char padding_0[48];
    struct st_b5e628_1 *field_30;
    struct st_b5e628_1 *field_38;
    char padding_40[24];
    unsigned long long field_58;
} st_b5e628_0;


int sub_b5e628(st_b5e628_0 *a0, unsigned long a1, unsigned long a2, unsigned long a3)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a3 < a0->field_58)
    {
        return 1;
    }
    else if (a0->field_38)
    {
        a0->field_38();
    }
    else
    {
        a0->field_30();
    }
}
