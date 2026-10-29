/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa522e8..0xa52398 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a522e8_1 {
    char padding_0[88];
    struct st_a522e8_0 *field_58;
    char padding_60[16];
    struct st_a522e8_0 *field_70;
    struct st_a522e8_0 *field_78;
} st_a522e8_1;

typedef struct st_a522e8_0 {
    unsigned long long field_0;
} st_a522e8_0;


int sub_a522e8(st_a522e8_1 **a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5)
{
    st_a522e8_0 **v2;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *a0;
    if (v2[14])
    {
        v2[14]();
    }
    else if (v2[11])
    {
        v2[11]();
    }
    else if (v2[15])
    {
        v2[15]();
    }
    else
    {
        return 1;
    }
}
