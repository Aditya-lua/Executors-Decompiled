/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaaf01c..0xaaf0d0 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aaf01c_0 {
    long long field_0;
    char padding_8[8];
    struct st_aaf01c_0 *field_10;
    struct st_aaf01c_0 *field_18;
    long long field_20;
} st_aaf01c_0;


st_aaf01c_0 * sub_aaf01c(st_aaf01c_0 *a0, st_aaf01c_0 **a1, st_aaf01c_0 **a2, unsigned int *a3, unsigned int *a4)
{
    st_aaf01c_0 *v3;  // x0
    st_aaf01c_0 *v4;  // x0
    unsigned int v5;  // w0
    unsigned int v6;  // w0
    char v0;  // [bp-0x54]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    sub_ab8bf4(&v0);
    if (!a0)
        return 0;
    v3 = sub_9cf950(a0->field_0);
    *a1 = v3;
    if (!v3)
        return v3;
    v4 = sub_9cf950(a0->field_20);
    *a2 = v4;
    if (!v4)
        return v4;
    if (a0->field_10)
        v5 = sub_9c1a94(a0->field_10);
    else
        v5 = sub_ab8ce4(&v0);
    *a3 = v5;
    if (a0->field_18)
        v6 = sub_9c1a94(a0->field_18);
    else
        v6 = sub_ab8cf8(&v0);
    *a4 = v6;
    return 1;
}
