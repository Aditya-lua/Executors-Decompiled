/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2f340..0xb2f3bc (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b2f340_0 {
    unsigned long long field_0;
    char field_8;
    char padding_9[23];
    long long field_20;
    long long field_28;
    long long field_30;
    long long field_38;
} st_b2f340_0;


void sub_b2f340(st_b2f340_0 *ptr)
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
    sub_afdddc(&ptr->field_8);
    sub_a6c4e8(ptr->field_20, ptr->field_28, "providers/implementations/kdfs/krb5kdf.c", 89);
    sub_a6c4e8(ptr->field_30, ptr->field_38, "providers/implementations/kdfs/krb5kdf.c", 90);
    memset(ptr, 0, 64);
    ptr->field_0 = ptr->field_0;
}
