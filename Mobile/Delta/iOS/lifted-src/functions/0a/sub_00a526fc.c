/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa526fc..0xa52760 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a526fc_0 {
    char padding_0[112];
    struct st_a526fc_0 *field_70;
    char padding_78[80];
    struct st_a526fc_0 *field_c8;
} st_a526fc_0;


unsigned int sub_a526fc(st_a526fc_0 *a0, unsigned long a1)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (a0)
    {
        if (!a0->field_70)
        {
            return 0xffffffff;
        }
        else if (a0->field_c8)
        {
            goto *((void *)(a0->field_c8));
        }
        else
        {
            v0 = &v2;
            v1 = v3;
            sub_a368c8();
            sub_a369bc("crypto/evp/evp_utils.c", 65, "geterr");
            sub_a36abc(6, 197, 0);
            a0 = 0;
        }
    }
    return (unsigned int)a0;
}
