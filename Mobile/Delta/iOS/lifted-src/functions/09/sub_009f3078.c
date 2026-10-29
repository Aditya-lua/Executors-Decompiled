/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f3078..0x9f3174 (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f3078_1 {
    char padding_0[16];
    long long field_10;
} st_9f3078_1;

typedef struct st_9f3078_0 {
    struct st_9f3078_0 *field_0;
    struct st_9f3078_0 *field_8;
    struct st_9f3078_0 *field_10;
} st_9f3078_0;


st_9f3078_0 * sub_9f3078(st_9f3078_1 *a0, long long a1)
{
    st_9f3078_0 *v2;  // x20
    st_9f3078_0 *v3;  // x0
    st_9f3078_0 *v4;  // x19
    st_9f3078_0 *v6;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_ad61b4();
    if (v2 && !(v3 = sub_a6bf4c(24, "crypto/conf/conf_api.c", 193), !v3))
    {
        v4 = v3;
        v6 = sub_a6bf4c(_strlen(a1) + 1, "crypto/conf/conf_api.c", 196);
        v4->field_0 = v6;
        if (v6)
        {
            _memcpy();
            v4->field_8 = 0;
            v4->field_10 = v2;
            if (!sub_a66794(a0->field_10, v4) && (int)sub_a66e38(a0->field_10) <= 0)
                return v4;
        }
        sub_ad6020(v2);
        sub_a6c2e4(v4->field_0, "crypto/conf/conf_api.c", 211);
    }
    else
    {
        sub_ad6020(v2);
        v4 = 0;
    }
    sub_a6c2e4(v4, "crypto/conf/conf_api.c", 212);
    return 0;
}
