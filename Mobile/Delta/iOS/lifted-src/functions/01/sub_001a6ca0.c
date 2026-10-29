/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a6ca0..0x1a6d94 (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a6ca0_2 {
    struct st_1a6ca0_1 *field_0;
    void* field_8;
} st_1a6ca0_2;

typedef struct st_1a6ca0_3 {
    struct st_1a6ca0_0 *field_0;
} st_1a6ca0_3;

typedef struct st_1a6ca0_1 {
    char padding_0[912];
    long long field_390;
} st_1a6ca0_1;

typedef struct st_1a6ca0_0 {
    char field_0;
} st_1a6ca0_0;


long long sub_1a6ca0(st_1a6ca0_2 *a0)
{
    st_1a6ca0_1 *v6;  // x21
    long long v7;  // x0
    unsigned int v8;  // w0
    long long v9;  // x0
    st_1a6ca0_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_1a6ca0_0 *v1;  // [bp-0x48]
    st_1a6ca0_0 *v2;  // [bp-0x40], Other Possible Types: st_1a6ca0_3 **
    st_1a6ca0_0 **v3;  // [bp-0x38], Other Possible Types: st_1a6ca0_3 **, char
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    v6 = a0->field_0;
    std::__1::mutex::lock(v6 + 1);
    v2 = &v3;
    v3 = &v2;
    if (sub_6b08(&v6->padding_0[784]))
    {
        v7 = sub_a0c8(&v6->padding_0[784]);
        v8 = sub_962a9c(v6->field_390, v7, 0);
        goto LABEL_1a6d38;
    }
    else
    {
        v2 = &v3;
        v3 = &v2;
        if (sub_6b08(&v6->padding_0[808]))
        {
            v9 = sub_a0c8(&v6->padding_0[808]);
            v8 = sub_962a9c(v6->field_390, 0, v9);
LABEL_1a6d38:
            if (!v8)
                *(char *)a0->field_8 = 0;
        }
        else
        {
            sub_962a88(v6->field_390);
        }
    }
    return std::__1::mutex::unlock(v6 + 1);
}
