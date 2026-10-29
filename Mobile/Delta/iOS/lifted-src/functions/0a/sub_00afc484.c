/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafc484..0xafc51c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_afc484_0 {
    char padding_0[368];
    long long field_170;
    struct st_afc484_0 *field_178;
} st_afc484_0;

extern long long g_ebadd0;

st_afc484_0 * sub_afc484(long long a0, st_afc484_0 *a1)
{
    st_afc484_0 *v2;  // x19
    st_afc484_0 *v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9cde60(&g_ebadd0, a0, a1);
    if (!v2)
        return v2;
    v2->field_170 = a0;
    sub_a6c2e4(v2->field_178, "crypto/x509/x_x509.c", 144);
    v2->field_178 = 0;
    if (!a1)
        return v2;
    v3 = sub_a6d9b4(a1, "crypto/x509/x_x509.c", 147);
    v2->field_178 = v3;
    if (v3)
        return v2;
    sub_9cd960(v2, &g_ebadd0);
    return 0;
}
