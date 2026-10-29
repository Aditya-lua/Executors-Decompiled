/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f2f0c..0x9f2f8c (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f2f0c_0 {
    char padding_0[16];
    struct st_9f2f0c_0 *field_10;
    char padding_18[8];
    long long field_20;
} st_9f2f0c_0;

extern long long g_9f2f8c;
extern long long g_9f2fa8;

st_9f2f0c_0 * sub_9f2f0c(st_9f2f0c_0 *a0)
{
    st_9f2f0c_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return a0;
    sub_a6c2e4(a0->field_20, "crypto/conf/conf_api.c", 141);
    v2 = a0->field_10;
    if (!v2)
        return v2;
    sub_a19710(v2, 0);
    sub_a66d48(a0->field_10, "@", &g_9f2f8c, a0->field_10);
    sub_a66c58(a0->field_10, &g_9f2fa8);
}
