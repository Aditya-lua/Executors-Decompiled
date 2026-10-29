/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f7078..0x9f7108 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f7078_0 {
    int field_0;
    char padding_4[4];
    unsigned long long field_8;
} st_9f7078_0;


st_9f7078_0 * sub_9f7078(long long a0, unsigned long long *a1, unsigned long a2)
{
    st_9f7078_0 *v4;  // x8
    st_9f7078_0 *v5;  // x21
    unsigned long v0;  // [bp-0x40]
    st_9f7078_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v0 = *a1;
    v1 = 0;
    if (!sub_9cf0d4(&v1, &v0))
        return 0;
    v4 = v1;
    v0 = v4->field_8;
    v5 = sub_9f6bdc(a0, &v0, v4->field_0);
    if (v5)
        *a1 = *a1 + a2;
    sub_9cf0f4(v1);
    return v5;
}
