/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4ade0..0xb4ae38 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4ade0_0 {
    char padding_0[12];
    unsigned int field_c;
    unsigned int field_10;
    char padding_14[36];
    unsigned long long field_38;
    char padding_40[16];
    unsigned int field_50;
} st_b4ade0_0;


int sub_b4ade0(st_b4ade0_0 *a0, unsigned int a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5)
{
    unsigned int v2;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_b4b028();
    if (!v2)
    {
        return v2;
    }
    else if (a1 > a0->field_10)
    {
        return 0;
    }
    else
    {
        a0->field_c = 1;
        a0->field_38 = 0;
        a0->field_50 = 221953166;
        return 1;
    }
}
