/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95fc24..0x95fc90 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95fc24_1 {
    unsigned int field_0;
    char padding_4[20];
    struct st_95fc24_0 *field_18;
} st_95fc24_1;

typedef struct st_95fc24_0 {
    char padding_0[64];
    unsigned long long field_40;
} st_95fc24_0;


void sub_95fc24(st_95fc24_1 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_95fc24_1 *v8;  // x19
    unsigned long long idx;  // x20
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = a0;
    if (a0)
    {
        if (!v8->field_0)
            idx = v8;
        else
            idx = 0;
    }
    else
    {
        idx = 0;
    }
    *(unsigned int *)(idx + 120) = 1;
    *(unsigned int *)(idx + 132) = 0;
    sub_9a575c(idx);
    *(unsigned long long *)(idx + 112) = v8->field_18->field_40;
}
