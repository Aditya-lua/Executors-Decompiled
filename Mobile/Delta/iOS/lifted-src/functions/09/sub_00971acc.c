/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x971acc..0x971afc (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_971acc_0 {
    char padding_0[80];
    unsigned long long field_50;
    char padding_58[8];
    unsigned int field_60;
    char padding_64[4];
    unsigned long long field_68;
} st_971acc_0;


int sub_971acc(st_971acc_0 *a0, unsigned long long *a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    a0->field_60 = 1;
    a0->field_50 = 0;
    a0->field_68 = *a1;
    sub_971afc();
    return 1;
}
