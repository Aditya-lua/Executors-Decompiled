/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb55578..0xb555fc (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b55578_0 {
    char padding_0[8];
    long long field_8;
    unsigned int field_10;
    char padding_14[12];
    long long field_20;
    long long field_28;
    long long field_30;
} st_b55578_0;


void sub_b55578(st_b55578_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    sub_a6c2e4(a0->field_8, "providers/implementations/storemgmt/file_store.c", 116);
    if (a0->field_10 != 1)
    {
        sub_a2d974(a0->field_20);
        sub_a6c2e4(a0->field_30, "providers/implementations/storemgmt/file_store.c", 0x77);
        sub_a6c2e4(a0->field_28, "providers/implementations/storemgmt/file_store.c", 120);
    }
    sub_a6c2e4();
    return;
}
