/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad94ec..0xad9530 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ad94ec_0 {
    struct st_ad94ec_0 *field_0;
} st_ad94ec_0;


st_ad94ec_0 ** sub_ad94ec(st_ad94ec_0 **a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_ad94ec_0 **v8;  // x0
    st_ad94ec_0 **v9;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return a0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = *a0;
    if (v8)
    {
        _pthread_cond_destroy(v8);
        v8 = *a0;
    }
    v9 = sub_a6c2e4(v8, "crypto/thread/arch/thread_posix.c", 229);
    *a0 = 0;
    return v9;
}
