/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5247c..0xa52548 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a5247c_1 {
    char padding_0[112];
    struct st_a5247c_0 *field_70;
    struct st_a5247c_0 *field_78;
    char padding_80[56];
    struct st_a5247c_0 *field_b8;
} st_a5247c_1;

typedef struct st_a5247c_0 {
    unsigned long long field_0;
} st_a5247c_0;


unsigned long long * sub_a5247c(st_a5247c_1 **a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5, unsigned long a6, unsigned long a7)
{
    st_a5247c_0 **v2;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *a0;
    if (v2[14])
    {
        v2[14]();
    }
    else if (v2[23])
    {
        v2[23]();
    }
    else if (v2[15])
    {
        v2[15]();
    }
    else
    {
        return 0;
    }
}
