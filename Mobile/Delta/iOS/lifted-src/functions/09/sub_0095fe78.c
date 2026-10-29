/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95fe78..0x95fee0 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95fe78_1 {
    unsigned int field_0;
    char padding_4[20];
    struct st_95fe78_0 *field_18;
} st_95fe78_1;

typedef struct st_95fe78_0 {
    char padding_0[72];
    unsigned long long field_48;
} st_95fe78_0;


void sub_95fe78(st_95fe78_1 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_95fe78_1 *v8;  // x19
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
    *(unsigned int *)(idx + 120) = 0;
    *(unsigned int *)(idx + 132) = 0;
    sub_9a575c(idx);
    *(unsigned long long *)(idx + 112) = v8->field_18->field_48;
}
