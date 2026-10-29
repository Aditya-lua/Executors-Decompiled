/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa42900..0xa42958 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a42900_0 {
    char padding_0[704];
    long long field_2c0;
} st_a42900_0;


int sub_a42900(long long a0)
{
    st_a42900_0 *v2;  // x0
    st_a42900_0 *v3;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9ffdd8();
    if (v2)
    {
        v3 = v2;
        sub_a66ec0(&v2->padding_0[0x100], 448);
        if (v3->field_2c0 != a0 + 40)
            sub_a6c2e4(v3->field_2c0, "crypto/evp/e_aes.c", 2654);
        v2 = 1;
    }
    return (unsigned int)v2;
}
