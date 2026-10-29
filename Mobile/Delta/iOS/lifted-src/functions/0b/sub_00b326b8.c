/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb326b8..0xb327f4 (316 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b326b8_0 {
    unsigned long long field_0;
    struct st_b326b8_0 *field_8;
    char field_10;
    char padding_11[23];
    long long field_28;
    long long field_30;
    long long field_38;
    long long field_40;
    long long field_48;
    long long field_50;
    unsigned long long field_58;
    unsigned int field_60;
} st_b326b8_0;


st_b326b8_0 * sub_b326b8(st_b326b8_0 *a0)
{
    st_b326b8_0 *ptr;  // x19
    st_b326b8_0 *v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    ptr = sub_a6bffc(104, "providers/implementations/kdfs/sskdf.c", 316);
    if (!ptr)
        return ptr;
    ptr->field_0 = a0->field_0;
    if ((!a0->field_8 || (v3 = sub_a57f5c(a0->field_8), ptr->field_8 = v3, v3)) && sub_afe694(a0->field_38, a0->field_40, &ptr->field_38, &ptr->field_40) && sub_afe694(a0->field_48, a0->field_50, &ptr->field_48, &ptr->field_50) && sub_afe694(a0->field_28, a0->field_30, &ptr->field_28, &ptr->field_30) && sub_afe05c(&ptr->field_10, &a0->field_10))
    {
        ptr->field_58 = a0->field_58;
        ptr->field_60 = a0->field_60;
        return ptr;
    }
    sub_a57f0c(ptr->field_8);
    sub_afe028(&ptr->field_10);
    sub_a6c4e8(ptr->field_28, ptr->field_30, "providers/implementations/kdfs/sskdf.c", 330);
    sub_a6c4e8(ptr->field_38, ptr->field_40, "providers/implementations/kdfs/sskdf.c", 331);
    sub_a6c4e8(ptr->field_48, ptr->field_50, "providers/implementations/kdfs/sskdf.c", 332);
    memset(ptr, 0, 104);
    ptr->field_0 = ptr->field_0;
    sub_a6c2e4(ptr, "providers/implementations/kdfs/sskdf.c", 343);
    return 0;
}
