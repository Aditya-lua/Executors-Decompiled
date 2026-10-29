/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb14b3c..0xb14ba8 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b14b3c_1 {
    char padding_0[264];
    struct st_b14b3c_0 *field_108;
} st_b14b3c_1;

typedef struct st_b14b3c_0 {
    char padding_0[24];
    unsigned int field_18;
} st_b14b3c_0;


long long sub_b14b3c(long long a0, st_b14b3c_1 *a1)
{
    unsigned int v2;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_ab1cb0();
    switch (v2)
    {
    case 0:
        if (a1->field_108->field_18 == 6)
            return sub_ab2070(a0) != 0;
        return 0;
    case 4096:
        if (a1->field_108->field_18 == 912)
            return sub_ab2070(a0) != 0;
        return 0;
    default:
        return 0;
    }
}
