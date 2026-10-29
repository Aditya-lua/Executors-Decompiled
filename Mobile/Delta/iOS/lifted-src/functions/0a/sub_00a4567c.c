/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4567c..0xa456c0 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4567c_0 {
    char padding_0[736];
    long long field_2e0;
} st_a4567c_0;


int sub_a4567c(long long a0)
{
    st_a4567c_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9ffdd8();
    if (v2->field_2e0 == a0 + 40)
        return 1;
    sub_a6c2e4(v2->field_2e0, "crypto/evp/e_aria.c", 504);
    return 1;
}
