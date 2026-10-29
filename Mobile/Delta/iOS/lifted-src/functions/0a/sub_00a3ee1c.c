/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3ee1c..0xa3eef8 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a3ee1c_1 {
    char padding_0[28];
    unsigned int field_1c;
    long long field_20;
    char padding_28[8];
    struct st_a3ee1c_0 *field_30;
} st_a3ee1c_1;

typedef struct st_a3ee1c_0 {
    char padding_0[8];
    unsigned int field_8;
} st_a3ee1c_0;


unsigned long long sub_a3ee1c(unsigned long a0, unsigned long a1, st_a3ee1c_1 *a2)
{
    unsigned long long v2;  // x0
    long long v3;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a5b018(a2->field_20) == 408)
    {
        v2 = sub_a1990c(sub_a59bc4(a2->field_20));
        if (v2 >> 31 & 1)
        {
            sub_a368c8();
            sub_a369bc("crypto/evp/ctrl_params_translate.c", 1822, "get_ec_decoded_from_explicit_params");
            v3 = 163;
        }
        else if (a2->field_30->field_8 == 1)
        {
            a2->field_1c = v2;
            a2->field_20 = 0;
        }
        else
        {
            return 0;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/ctrl_params_translate.c", 1828, "get_ec_decoded_from_explicit_params");
        v3 = 224;
    }
    sub_a36abc(6, v3, 0);
    return 0;
}
