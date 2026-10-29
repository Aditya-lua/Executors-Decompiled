/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1fbc44..0x1fbcc0 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1fbc44_0 {
    char padding_0[200];
    long long field_c8;
} st_1fbc44_0;


void sub_1fbc44(st_1fbc44_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    long long v8;  // x20
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = a0->field_c8;
    if (v8)
    {
        sub_1eccac(v8 + 48);
        sub_1eccac(v8 + 24);
        operatordelete(sub_1eccac(v8));
    }
    sub_1eccac(&a0->padding_0[176]);
    sub_1eccac(&a0->padding_0[152]);
    sub_1eccac(&a0->padding_0[120]);
    sub_1eccac(&a0->padding_0[96]);
    sub_1eccac(&a0->padding_0[72]);
    sub_1eccac(&a0->padding_0[48]);
    sub_1eccac(&a0->padding_0[24]);
    sub_1eccac();
    return;
}
