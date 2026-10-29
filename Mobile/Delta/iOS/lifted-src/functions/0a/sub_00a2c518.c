/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2c518..0xa2c5dc (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2c518_0 {
    struct st_a2c518_0 *field_0;
} st_a2c518_0;


st_a2c518_0 ** sub_a2c518(long long a0, st_a2c518_0 **a1, st_a2c518_0 **a2)
{
    long long v2;  // x19
    st_a2c518_0 **v3;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1 && a2 && *a1)
    {
        v2 = sub_9d885c(*a1, *(int *)a2);
        if (sub_a2beb4(a0, v2))
        {
            *a2 = sub_9d46fc(v2, 3, 0, a1);
            v3 = 1;
        }
        else
        {
            v3 = 0;
        }
        sub_9d3c28(v2);
        return v3;
    }
    sub_a368c8();
    sub_a369bc("crypto/encode_decode/decoder_lib.c", 154, "OSSL_DECODER_from_data");
    sub_a36abc(60, 0xc0102, 0);
    return 0;
}
