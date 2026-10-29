/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa19b18..0xa19bd0 (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a19b18_0 {
    char padding_0[40];
    long long field_28;
    char padding_30[48];
    unsigned long long field_60;
} st_a19b18_0;


long long sub_a19b18(st_a19b18_0 *a0, long long a1, long long a2)
{
    long long v2;  // x0
    long long v3;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_28 || (v2 = sub_9e4988(), a0->field_28 = v2, v2))
    {
        if (sub_9e4db0(a1, a2))
        {
            a0->field_60 = a0->field_60 + 1;
            return 1;
        }
        sub_a368c8();
        v3 = 1000;
    }
    else
    {
        sub_a368c8();
        v3 = 996;
    }
    sub_a369bc("crypto/ec/ec_key.c", v3, "ossl_ec_key_simple_oct2priv");
    sub_a36abc(16, 0x80003, 0);
    return 0;
}
