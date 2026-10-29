/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf9abc..0xaf9af4 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af9abc_0 {
    char padding_0[48];
    struct st_af9abc_0 *field_30;
} st_af9abc_0;

extern long long g_af9a18;

int sub_af9abc(unsigned int a0, st_af9abc_0 **a1)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!*a1)
    {
        return 1;
    }
    else if (a0 != 5)
    {
        return 1;
    }
    else if (*a1->field_30)
    {
        v0 = &v2;
        v1 = v3;
        sub_ad5f30(*a1->field_30, &g_af9a18);
        return 1;
    }
    else
    {
        return 1;
    }
}
