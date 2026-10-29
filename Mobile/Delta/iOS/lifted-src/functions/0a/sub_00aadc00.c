/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaadc00..0xaadd70 (368 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aadc00_0 {
    char padding_0[128];
    long long field_80;
} st_aadc00_0;

typedef struct st_aadc00_1 {
    char padding_0[32];
    struct st_aadc00_0 *field_20;
} st_aadc00_1;


long long sub_aadc00(st_aadc00_1 *a0, unsigned long a1, unsigned long long *a2)
{
    st_aadc00_0 *v7;  // x23
    long long v8;  // x0
    long long v9;  // x19
    long long v10;  // x0
    long long v11;  // x0
    char v0;  // [bp-0x6c]
    char v1;  // [bp-0x58]
    unsigned int v2;  // [bp-0x54]
    long long v3;  // [bp-0x50]
    long long v4;  // [bp-0x48]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v7 = a0->field_20;
    v8 = sub_a6ee78();
    if (!v8)
        return 0;
    v9 = v8;
    if (!sub_962b90(v7))
    {
        sub_a71e38();
        sub_a6eed4(v9);
        return 0;
    }
    else if (sub_97725c(v7))
    {
        if (sub_aae6d8(v7, v9, 0, 1))
        {
            if (v7->field_80)
            {
                v3 = 0;
                v4 = 0;
                if (sub_aaf01c(v7->field_80, &v4, &v3, &v2, &v1))
                {
                    v10 = sub_9c7b68(v4);
                    v11 = sub_9c7b68(v3);
                    if (sub_ab8bf4(&v0) && sub_ab8c68(&v0, v10) && sub_ab8c78(&v0, v11) && sub_ab8c88(&v0, v2) && sub_aae854(&v0, v9, 0))
                        goto LABEL_aadd04;
                }
            }
            else
            {
LABEL_aadd04:
                if (!sub_a6f570(v9))
                {
                    sub_a71e38();
                    sub_a6eed4(v9);
                    return 0;
                }
                a2();
            }
        }
        sub_a71e38();
        sub_a6eed4(v9);
        return 0;
    }
    else
    {
        sub_a71e38();
        sub_a6eed4(v9);
        return 0;
    }
}
