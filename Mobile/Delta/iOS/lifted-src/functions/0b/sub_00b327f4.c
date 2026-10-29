/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb327f4..0xb32890 (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b327f4_0 {
    unsigned long long field_0;
    long long field_8;
    char field_10;
    char padding_11[23];
    long long field_28;
    long long field_30;
    long long field_38;
    long long field_40;
    long long field_48;
    long long field_50;
} st_b327f4_0;


void sub_b327f4(st_b327f4_0 *ptr)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!ptr)
        return;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    sub_a57f0c(ptr->field_8);
    sub_afe028(&ptr->field_10);
    sub_a6c4e8(ptr->field_28, ptr->field_30, "providers/implementations/kdfs/sskdf.c", 330);
    sub_a6c4e8(ptr->field_38, ptr->field_40, "providers/implementations/kdfs/sskdf.c", 331);
    sub_a6c4e8(ptr->field_48, ptr->field_50, "providers/implementations/kdfs/sskdf.c", 332);
    memset(ptr, 0, 104);
    ptr->field_0 = ptr->field_0;
}
