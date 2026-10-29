/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb37c28..0xb37c88 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b37c28_0 {
    unsigned long long field_0;
    char padding_8[8];
    struct st_b37c28_0 *field_10;
} st_b37c28_0;


st_b37c28_0 * sub_b37c28(long long a0)
{
    st_b37c28_0 *v2;  // x0
    st_b37c28_0 *v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6bffc(24, "providers/implementations/kem/rsa_kem.c", 91);
    if (!v2)
        return v2;
    v3 = v2;
    v3->field_0 = sub_9f2aec(a0);
    *(unsigned int *)&v3->field_10 = 0;
    return v3;
}
