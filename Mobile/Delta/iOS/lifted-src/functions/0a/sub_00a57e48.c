/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa57e48..0xa57f0c (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a57e48_0 {
    long long field_0;
    char padding_8[32];
    struct st_a57e48_1 *field_28;
} st_a57e48_0;

typedef struct st_a57e48_1 {
    unsigned long long field_0;
} st_a57e48_1;


st_a57e48_0 ** sub_a57e48(st_a57e48_0 *a0)
{
    st_a57e48_0 **v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(16, "crypto/evp/mac_lib.c", 24);
    if (!v2)
        return v2;
    *v2 = a0;
    sub_a79f54(a0->field_0);
    a0->field_28();
}
