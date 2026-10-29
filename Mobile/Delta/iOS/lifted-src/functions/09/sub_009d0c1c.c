/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d0c1c..0x9d0cb4 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d0c1c_0 {
    struct st_9d0c1c_0 *field_0;
    char padding_8[16];
    struct st_9d0c1c_0 *field_18;
    char padding_20[4];
    struct st_9d0c1c_0 *field_24;
    struct st_9d0c1c_0 *field_28;
} st_9d0c1c_0;


void sub_9d0c1c(st_9d0c1c_0 *a0)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_9d0c1c_0 *v12;  // x0
    st_9d0c1c_0 *v13;  // x0
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a0)
        return;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    v12 = a0->field_0;
    if (a0->field_0)
    {
        do
        {
            v13 = v12;
            if (!(v13->padding_20)[1] && v13->field_18)
                v13->field_18();
        } while ((sub_a6c2e4(), v12 = v13->field_24, v13->field_24));
    }
    sub_a6c2e4();
    return;
}
