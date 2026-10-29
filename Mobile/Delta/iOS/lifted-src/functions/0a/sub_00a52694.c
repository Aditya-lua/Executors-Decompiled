/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa52694..0xa526fc (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a52694_0 {
    char padding_0[120];
    struct st_a52694_0 *field_78;
    char padding_80[120];
    struct st_a52694_0 *field_f8;
} st_a52694_0;


unsigned int sub_a52694(st_a52694_0 *a0, unsigned long a1, unsigned long a2)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (a0)
    {
        if (!a0->field_78)
        {
            return 0xffffffff;
        }
        else if (a0->field_f8)
        {
            goto *((void *)(a0->field_f8));
        }
        else
        {
            v0 = &v2;
            v1 = v3;
            sub_a368c8();
            sub_a369bc("crypto/evp/evp_utils.c", 70, "seterr");
            sub_a36abc(6, 198, 0);
            a0 = 0;
        }
    }
    return (unsigned int)a0;
}
