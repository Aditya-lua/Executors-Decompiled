/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa52548..0xa525c8 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a52548_1 {
    char padding_0[112];
    struct st_a52548_0 *field_70;
    struct st_a52548_0 *field_78;
    char padding_80[64];
    struct st_a52548_0 *field_c0;
} st_a52548_1;

typedef struct st_a52548_0 {
    unsigned long long field_0;
} st_a52548_0;


void sub_a52548(st_a52548_1 **a0, unsigned long a1, unsigned long a2)
{
    st_a52548_0 **v2;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *a0;
    if (v2[14])
    {
        v2[14]();
    }
    else if (v2[24])
    {
        v2[24]();
    }
    else if (v2[15])
    {
        goto *((void *)(v2[15]));
    }
    else
    {
        return;
    }
}
