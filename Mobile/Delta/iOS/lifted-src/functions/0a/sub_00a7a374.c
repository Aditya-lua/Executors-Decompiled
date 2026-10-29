/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7a374..0xa7a420 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7a374_0 {
    char field_0;
    char padding_1[7];
    long long field_8;
} st_a7a374_0;


st_a7a374_0 * sub_a7a374(long long a0, long long a1)
{
    st_a7a374_0 *v2;  // x0
    st_a7a374_0 *v3;  // x0
    st_a7a374_0 *v4;  // x19
    st_a7a374_0 *v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a6820c())
    {
        sub_a368c8();
        sub_a369bc("crypto/provider_core.c", 335, "get_provider_store");
        sub_a36abc(15, 0xc0103, 0);
        return 0;
    }
    v2 = sub_a79f60();
    if (!(unsigned int)v2)
        return v2;
    v3 = sub_a78b18(a0, a1, 0);
    if (!v3)
        return v3;
    v4 = v3;
    v5 = sub_a7c17c(v3->field_8);
    if (!(unsigned int)v5)
        return v5;
    sub_a7c1b4(v4->field_8);
    sub_a78ccc(v4);
    return __ROL__(v4->field_0, 31) & 0x80000001 & 1;
}
