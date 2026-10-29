/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x967d1c..0x967d8c (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_967d1c_1 {
    unsigned int field_0;
} st_967d1c_1;

typedef struct st_967d1c_0 {
    unsigned int field_0;
    char padding_4[20];
    struct st_967d1c_1 *field_18;
    char padding_20[40];
    unsigned int field_48;
} st_967d1c_0;


st_967d1c_0 * sub_967d1c(st_967d1c_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long v8;  // x8
    st_967d1c_0 *v9;  // x20
    unsigned long long v10;  // x0
    unsigned int v11;  // w8
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return a0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = a0->field_0;
    v9 = a0;
    if (!(unsigned int)v8)
    {
LABEL_967d58:
        v10 = sub_954a28(a0);
        if ((unsigned int)v10)
        {
            v11 = *(int *)a0->field_18;
            if (*(int *)a0->field_18 == 0x10000)
                v11 = 772;
            v9->field_48 = v11;
            v10 = 1;
        }
    }
    else if (!(v8 >> 7 & 1))
    {
        v10 = 0;
    }
    else
    {
        v9 = sub_980dc8(a0);
        v10 = v9;
        if (v10)
            goto LABEL_967d58;
    }
    return v10;
}
