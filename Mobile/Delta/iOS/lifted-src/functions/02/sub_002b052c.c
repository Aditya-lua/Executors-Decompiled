/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2b052c..0x2b0628 (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2b052c_0 {
    char field_0;
    char padding_1[7];
    unsigned long long field_8;
} st_2b052c_0;

typedef struct st_2b052c_3 {
    struct st_2b052c_0 *field_0;
    void* field_8;
    void* field_10;
    char padding_18[8];
    struct st_2b052c_0 *field_20;
} st_2b052c_3;


st_2b052c_0 * sub_2b052c(st_2b052c_3 *a0)
{
    st_2b052c_0 *v6;  // x8
    char v7;  // x1
    unsigned long v8;  // x9
    st_2b052c_0 *v9;  // x8
    char v10;  // x1
    unsigned long v11;  // x9
    char v0;  // [bp-0x40]
    unsigned long v1;  // [bp-0x38]
    char v2;  // [bp-0x30]
    unsigned long v3;  // [bp-0x28]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    if (a0->field_8 == a0->field_10)
    {
        sub_2a9bcc(&v2);
        v9 = a0->field_0;
        v10 = v9->field_0;
        v9->field_0 = v2;
        v2 = v10;
        v11 = v9->field_8;
        v9->field_8 = v3;
        v3 = v11;
        sub_2a6e94(&v3, v2);
        return a0->field_0;
    }
    else if (*(char *)*(long long *)((char *)a0->field_10 - 8) == 2)
    {
        sub_2aa644(*(long long *)(*(long long *)((char *)a0->field_10 - 8) + 8));
        return *(long long *)(*(long long *)(*(long long *)((char *)a0->field_10 - 8) + 8) + 8) - 16;
    }
    else
    {
        sub_2a9bcc(&v0);
        v6 = a0->field_20;
        v7 = v6->field_0;
        v6->field_0 = v0;
        v0 = v7;
        v8 = v6->field_8;
        v6->field_8 = v1;
        v1 = v8;
        sub_2a6e94(&v1, v0);
        return a0->field_20;
    }
}
