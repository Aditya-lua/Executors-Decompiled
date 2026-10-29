/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa18b84..0xa18c08 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a18b84_0 {
    struct st_a18b84_0 *field_0;
    char padding_8[16];
    struct st_a18b84_0 *field_18;
    char padding_20[8];
    struct st_a18b84_0 *field_28;
} st_a18b84_0;


st_a18b84_0 * sub_a18b84(long long a0, long long a1, long long a2)
{
    st_a18b84_0 *v2;  // x0
    st_a18b84_0 *v3;  // x1
    st_a18b84_0 *v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a19d38();
    if (!v2)
        return v2;
    v3 = sub_a18150(a0, a1, a2);
    v4 = v2;
    v4->field_18 = v3;
    if (!v3)
    {
        sub_a18c08(v4, NULL);
        return 0;
    }
    else if (v4->field_0->field_28)
    {
        v4->field_0->field_28();
    }
    else
    {
        return v4;
    }
}
