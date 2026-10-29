/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb869ec..0xb86a90 (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b869ec_0 {
    char padding_0[16];
    unsigned long long field_10;
    long long field_18;
    unsigned long long field_20;
} st_b869ec_0;


void sub_b869ec(st_b869ec_0 **a0)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    st_b869ec_0 *v16;  // x19
    unsigned long v17;  // x22
    unsigned long long v18;  // x22
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    v16 = *a0;
    v17 = v16->field_20 + 1;
    while (1)
    {
        v18 = v17 - 1;
        if (v17 == 1)
            break;
        sub_b7854c();
        v17 = v18;
    }
    if (v16->field_10)
        _free(v16->field_18);
    _free();
    return;
}
