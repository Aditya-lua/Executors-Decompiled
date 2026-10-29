/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc23e9c..0xc23fb0 (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c23e9c_0 {
    char padding_0[48];
    long long field_30;
} st_c23e9c_0;


void sub_c23e9c(unsigned long a0, st_c23e9c_0 *a1)
{
    unsigned long long v10;  // x24
    unsigned long long v11;  // x23
    long long v12;  // x22
    unsigned long long v13;  // x21
    unsigned long long v14;  // x20
    unsigned long long v15;  // x19
    unsigned long long v16;  // x30
    char v0;  // [bp-0x80]
    unsigned long long v1;  // [bp-0x40]
    unsigned long long v2;  // [bp-0x38]
    long long v3;  // [bp-0x30]
    unsigned long long v4;  // [bp-0x28]
    unsigned long long v5;  // [bp-0x20]
    unsigned long long v6;  // [bp-0x18]
    char *v7;  // [bp-0x10]
    unsigned long long v8;  // [bp-0x8]
    char v9;  // [bp+0x0]

    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = v15;
    v7 = &v9;
    v8 = v16;
    if (!_malloc(64))
    {
        sub_c6ba70(8, 64);
        sub_c6b970(1, v12);
        __debugbreak();
    }
    sub_c234c4(&v0, a1->field_30);
}
