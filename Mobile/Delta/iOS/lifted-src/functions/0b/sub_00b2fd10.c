/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2fd10..0xb2fe04 (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b2fd10_0 {
    unsigned long long field_0;
    long long field_8;
    long long field_10;
    long long field_18;
    char field_20;
    char padding_21[7];
    unsigned long long field_28;
    char field_30;
    char padding_31[23];
    unsigned int field_48;
} st_b2fd10_0;

typedef struct st_b2fd10_1 {
    unsigned long long field_0;
    long long field_8;
    long long field_10;
    long long field_18;
    long long field_20;
    unsigned long long field_28;
    char field_30;
    char padding_31[23];
    unsigned int field_48;
} st_b2fd10_1;


st_b2fd10_0 * sub_b2fd10(st_b2fd10_1 *a0)
{
    st_b2fd10_0 *v2;  // x19
    st_b2fd10_0 *ptr;  // x3
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6bffc(80, "providers/implementations/kdfs/pbkdf2.c", 76);
    if (!v2)
        return v2;
    ptr = v2;
    ptr->field_0 = a0->field_0;
    if (sub_afe694(a0->field_18, a0->field_20, &ptr->field_18, &ptr->field_20) && sub_afe694(a0->field_8, a0->field_10, &ptr->field_8, &ptr->field_10) && sub_afe05c(&ptr->field_30, &a0->field_30))
    {
        ptr->field_28 = a0->field_28;
        ptr->field_48 = a0->field_48;
        return ptr;
    }
    sub_afe028(&ptr->field_30);
    sub_a6c2e4(ptr->field_18, "providers/implementations/kdfs/pbkdf2.c", 99);
    sub_a6c4e8(ptr->field_8, ptr->field_10, "providers/implementations/kdfs/pbkdf2.c", 101);
    memset(ptr, 0, 80);
    sub_a6c2e4(ptr, "providers/implementations/kdfs/pbkdf2.c", 111);
    return 0;
}
