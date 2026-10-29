/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad9be4..0xad9c70 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ad9be4_0 {
    unsigned int field_0;
    char padding_4[4];
    long long field_8;
    char padding_10[24];
    long long field_28;
    long long field_30;
    long long field_38;
    char field_40;
} st_ad9be4_0;


void sub_ad9be4(st_ad9be4_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    if (a0->field_40 & 1)
    {
        sub_a6c2e4(a0->field_8, "crypto/ui/ui_lib.c", 53);
        if (a0->field_0 == 3)
        {
            sub_a6c2e4(a0->field_28, "crypto/ui/ui_lib.c", 56);
            sub_a6c2e4(a0->field_30, "crypto/ui/ui_lib.c", 57);
            sub_a6c2e4(a0->field_38, "crypto/ui/ui_lib.c", 58);
        }
    }
    sub_a6c2e4();
    return;
}
