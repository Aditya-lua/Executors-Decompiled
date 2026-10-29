/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95edc8..0x95eea4 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95edc8_0 {
    unsigned int field_0;
    char padding_4[4];
    long long field_8;
} st_95edc8_0;


st_95edc8_0 * sub_95edc8(st_95edc8_0 *a0, unsigned long long a1, unsigned long long a2)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long v12;  // x8
    unsigned long long idx;  // x19
    st_95edc8_0 *v14;  // x0
    unsigned long long v15;  // x0
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a0)
        return a0;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    v12 = a0->field_0;
    idx = a0;
    if (!(unsigned int)v12 || v12 >> 7 & 1 && !(idx = sub_980dc8(), !idx))
    {
        v14 = a0;
        if (!a1)
        {
LABEL_95ee88:
            *(unsigned long long *)(idx + 2920) = a1;
            *(unsigned long long *)(idx + 2928) = a2;
            v15 = 1;
        }
        else if (sub_9a0e28(v14->field_8, 18))
        {
            sub_a368c8();
            sub_a369bc("ssl/ssl_lib.c", 0x198d, "SSL_set_ct_validation_callback");
            sub_a36abc(20, 206, 0);
            goto LABEL_95ee5c;
        }
        else
        {
            v15 = sub_960a40(v14, 65, 1, 0, 0);
            if (v15)
                goto LABEL_95ee88;
        }
    }
    else
    {
LABEL_95ee5c:
        v15 = 0;
    }
    return v15;
}
