/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb444cc..0xb445a4 (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b444cc_0 {
    char padding_0[16];
    char field_10;
    char padding_11[23];
    long long field_28;
    long long field_30;
    long long field_38;
} st_b444cc_0;


long long sub_b444cc(st_b444cc_0 *a0, long long a1, long long a2)
{
    long long v2;  // x0
    long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_28)
        sub_a6c4e8(a0->field_28, a0->field_30, "providers/implementations/macs/hmac_prov.c", 181);
    v2 = sub_a6bf4c();
    a0->field_28 = v2;
    if (!v2)
        return v2;
    if (a2)
        _memcpy();
    a0->field_30 = a2;
    v3 = sub_954340(&a0->field_10);
    if (!a1)
    {
        if (a0->field_38)
        {
            return 1;
        }
        else if (!v3)
        {
            return 1;
        }
    }
    sub_c4ba8(&a0->field_10);
}
