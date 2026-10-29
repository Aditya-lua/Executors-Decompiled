/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5262c..0xa52694 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a5262c_0 {
    char padding_0[120];
    struct st_a5262c_0 *field_78;
    char padding_80[112];
    struct st_a5262c_0 *field_f0;
} st_a5262c_0;


unsigned int sub_a5262c(st_a5262c_0 *a0, unsigned long a1, unsigned long a2)
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
        else if (a0->field_f0)
        {
            goto *((void *)(a0->field_f0));
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
