/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb59f28..0xb5a014 (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b59f28_1 {
    unsigned long long field_0;
    char field_8;
    char padding_9[23];
    long long field_20;
    long long field_28;
    long long field_30;
    long long field_38;
    unsigned long long field_40;
} st_b59f28_1;

typedef struct st_b59f28_0 {
    unsigned long long field_0;
    char field_8;
    char padding_9[23];
    long long field_20;
    long long field_28;
    long long field_30;
    char field_38;
    char padding_39[7];
    unsigned long long field_40;
} st_b59f28_0;


st_b59f28_0 * sub_b59f28(st_b59f28_1 *a0)
{
    st_b59f28_0 *v2;  // x19
    st_b59f28_0 *ptr;  // x3
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6bffc(72, "providers/implementations/kdfs/pbkdf1.c", 104);
    if (!v2)
        return v2;
    ptr = v2;
    ptr->field_0 = a0->field_0;
    if (sub_afe694(a0->field_30, a0->field_38, &ptr->field_30, &ptr->field_38) && sub_afe694(a0->field_20, a0->field_28, &ptr->field_20, &ptr->field_28) && sub_afe05c(&ptr->field_8, &a0->field_8))
    {
        ptr->field_40 = a0->field_40;
        return ptr;
    }
    sub_afe028(&ptr->field_8);
    sub_a6c2e4(ptr->field_30, "providers/implementations/kdfs/pbkdf1.c", 114);
    sub_a6c4e8(ptr->field_20, ptr->field_28, "providers/implementations/kdfs/pbkdf1.c", 115);
    memset(ptr, 0, 72);
    sub_a6c2e4(ptr, "providers/implementations/kdfs/pbkdf1.c", 125);
    return 0;
}
